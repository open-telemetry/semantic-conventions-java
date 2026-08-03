import io.opentelemetry.gradle.OtelJavaExtension
import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
  `java-library`

  checkstyle
  eclipse
  idea

  id("biz.aQute.bnd.builder")
  id("otel.spotless-conventions")
}

val otelJava = extensions.create<OtelJavaExtension>("otelJava")

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(21))
  }

  withJavadocJar()
  withSourcesJar()
}

checkstyle {
  configDirectory.set(file("$rootDir/buildscripts/"))
  toolVersion = "13.8.0"
  isIgnoreFailures = false
  configProperties["rootDir"] = rootDir
}

// normalize timestamps and file ordering in jars, making the outputs (including OSGi
// manifests) reproducible. see open-telemetry/opentelemetry-java#4488
tasks.withType<AbstractArchiveTask>().configureEach {
  isPreserveFileTimestamps = false
  isReproducibleFileOrder = true
}

val testJavaVersion = gradle.startParameter.projectProperties.get("testJavaVersion")?.let(JavaVersion::toVersion)

tasks {
  withType<JavaCompile>().configureEach {
    with(options) {
      release.set(8)

      compilerArgs.addAll(

        listOf(
          // Fail build on any warning
          "-Werror",
          // Suppress warning about java 8 deprecation
          "-Xlint:-options"
        )
      )

      encoding = "UTF-8"
    }
  }

  withType<Test>().configureEach {
    useJUnitPlatform()

    if (testJavaVersion != null) {
      javaLauncher.set(
        javaToolchains.launcherFor {
          languageVersion.set(JavaLanguageVersion.of(testJavaVersion.majorVersion))
        },
      )
    }

    testLogging {
      exceptionFormat = TestExceptionFormat.FULL
      showExceptions = true
      showCauses = true
      showStackTraces = true
    }
  }

  withType<Javadoc>().configureEach {
    exclude("io/opentelemetry/semconv/**/internal/**")

    with(options as StandardJavadocDocletOptions) {
      source = "8"
      encoding = "UTF-8"
      docEncoding = "UTF-8"
      breakIterator(true)

      addBooleanOption("html5", true)
      addBooleanOption("Xdoclint:all,-missing", true)
      // non-standard option to fail on warnings, see https://bugs.openjdk.java.net/browse/JDK-8200363
      addStringOption("Xwerror", "-quiet")
    }
  }

  named<Jar>("jar") {
    // Configure OSGi metadata. BND auto-detects imports, but can't infer a version range for
    // io.opentelemetry.api.* because the pinned compileOnly opentelemetry-api (1.33.0) isn't a bnd
    // bundle, so it would import with no range and wire to any version (incl. a future 2.x). Pin it
    // to the [1.33,2) baseline that :dependencyManagement already requires.
    bundle {
      bnd(
        mapOf(
          "-exportcontents" to "io.opentelemetry.*",
          "Import-Package" to "io.opentelemetry.api.*;version=\"[1.33,2)\",*",
        ),
      )
    }
  }

  withType<Jar>().configureEach {
    inputs.property("moduleName", otelJava.moduleName)

    manifest {
      attributes(
          "Automatic-Module-Name" to otelJava.moduleName,
        "Built-By" to System.getProperty("user.name"),
        "Built-JDK" to System.getProperty("java.version"),
        "Implementation-Title" to project.base.archivesName,
        "Implementation-Version" to project.version)
    }
  }

  afterEvaluate {
    withType<Javadoc>().configureEach {
      with(options as StandardJavadocDocletOptions) {
        val title = "${project.description}"
        docTitle = title
        windowTitle = title
      }
    }
  }
}

configurations.configureEach {
  resolutionStrategy {
    failOnVersionConflict()
    preferProjectModules()
  }
}

val dependencyManagement by configurations.creating {
  isCanBeConsumed = false
  isCanBeResolved = false
}

dependencies {
  dependencyManagement(platform(project(":dependencyManagement")))
  afterEvaluate {
    configurations.configureEach {
      if (isCanBeResolved && !isCanBeConsumed) {
        extendsFrom(dependencyManagement)
      }
    }
  }
}

testing {
  suites.withType(JvmTestSuite::class).configureEach {
    useJUnitJupiter("5.14.4")

    dependencies {
      implementation(project(project.path))

      implementation(enforcedPlatform("org.assertj:assertj-bom:3.27.6"))

      implementation("org.assertj:assertj-core")
    }
  }
}
