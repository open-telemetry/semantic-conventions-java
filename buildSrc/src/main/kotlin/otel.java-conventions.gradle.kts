import io.opentelemetry.gradle.OtelJavaExtension
import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
  `java-library`

  checkstyle
  eclipse
  idea

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
  toolVersion = "13.2.0"
  isIgnoreFailures = false
  configProperties["rootDir"] = rootDir
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
    useJUnitJupiter("5.14.3")

    dependencies {
      implementation(project(project.path))

      implementation(enforcedPlatform("org.assertj:assertj-bom:3.27.6"))

      implementation("org.assertj:assertj-core")
    }
  }
}
