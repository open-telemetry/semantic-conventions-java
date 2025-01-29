import de.undercouch.gradle.tasks.download.Download
import java.time.Duration

plugins {
  id("de.undercouch.download")
  id("io.github.gradle-nexus.publish-plugin")
}

// start - updated by ./.github/workflows/prepare-release-branch.yml
val snapshot = true
// end

// The release version of https://github.com/open-telemetry/semantic-conventions used to generate classes
var semanticConventionsVersion = "1.30.0"
val schemaUrlVersions = listOf(
    semanticConventionsVersion,
    "1.29.0",
    "1.28.0",
    "1.27.0",
    "1.26.0",
    "1.25.0",
    "1.24.0")

allprojects {
  // Compute the artifact version.
  // Include the "-alpha" suffix if the artifact contains a gradle.properties file with contents "otel.release=alpha".
  // Include the "-SNAPSHOT" suffix if not releasing.
  // Release example: 1.21.0 OR 1.21.0-alpha
  // Snapshot example: 1.21.0-SNAPSHOT OR 1.21.0-alpha-SNAPSHOT
  var ver = semanticConventionsVersion
  val release = findProperty("otel.release")
  if (release != null) {
    ver += "-" + release
  }
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  version = ver
}

nexusPublishing {
  packageGroup.set("io.opentelemetry.semconv")

  repositories {
    sonatype {
      username.set(System.getenv("SONATYPE_USER"))
      password.set(System.getenv("SONATYPE_KEY"))
    }
  }

  connectTimeout.set(Duration.ofMinutes(5))
  clientTimeout.set(Duration.ofMinutes(5))

  transitionCheckOptions {
    // We have many artifacts so Maven Central takes a long time on its compliance checks. This sets
    // the timeout for waiting for the repository to close to a comfortable 50 minutes.
    maxRetries.set(300)
    delayBetween.set(Duration.ofSeconds(10))
  }
}

// start - define tasks to download, unzip, and generate from opentelemetry/semantic-conventions
var generatorVersion = "v0.12.0"
val semanticConventionsRepoZip = "https://github.com/open-telemetry/semantic-conventions/archive/v${semanticConventionsVersion}.zip"
val schemaUrl = "https://opentelemetry.io/schemas/$semanticConventionsVersion"

val downloadSemanticConventions by tasks.registering(Download::class) {
  src(semanticConventionsRepoZip)
  dest("${layout.buildDirectory.asFile.get()}/semantic-conventions-${semanticConventionsVersion}/semantic-conventions.zip")
  overwrite(false)
}

val unzipConfigurationSchema by tasks.registering(Copy::class) {
  dependsOn(downloadSemanticConventions)

  from(zipTree(downloadSemanticConventions.get().dest))
  eachFile(closureOf<FileCopyDetails> {
    // Remove the top level folder "/semantic-conventions-$semanticConventionsVersion"
    val pathParts = path.split("/")
    path = pathParts.subList(1, pathParts.size).joinToString("/")
  })
  into("${layout.buildDirectory.asFile.get()}/semantic-conventions-${semanticConventionsVersion}/")
}

fun generateTask(taskName: String, incubating: Boolean) {
  tasks.register(taskName, Exec::class) {
    dependsOn(unzipConfigurationSchema)

    standardOutput = System.out
    executable = "docker"

    var target = if (incubating) "incubating_java" else "java"
    val outputDir = if (incubating) "semconv-incubating/src/main/java/io/opentelemetry/semconv/incubating/" else "semconv/src/main/java/io/opentelemetry/semconv/"

    val file_args = if (org.gradle.internal.os.OperatingSystem.current().isWindows())
      // Don't need to worry about file system permissions in docker.
      listOf()
    else {
      // Make sure we run as local file user
      val unix = com.sun.security.auth.module.UnixSystem() 
      val uid = unix.getUid() // $(id -u $USERNAME)
      val gid = unix.getGid() // $(id -g $USERNAME)
      listOf("-u", "$uid:$gid")
    }
    val weaver_args = listOf(
        "--rm",
        "--platform=linux/x86_64",
        "--mount", "type=bind,source=${layout.buildDirectory.asFile.get()}/semantic-conventions-${semanticConventionsVersion}/model,target=/home/weaver/source,readonly",
        "--mount", "type=bind,source=$projectDir/buildscripts/templates,target=/home/weaver/templates,readonly",
        "--mount", "type=bind,source=$projectDir/$outputDir,target=/home/weaver/target",
        "otel/weaver:$generatorVersion",
        "registry", "generate",
        "--registry=/home/weaver/source",
        "--templates=/home/weaver/templates",
        "$target",
        "/home/weaver/target/")

    setArgs(listOf("run") + file_args + weaver_args)
  }
}

// TODO - With weaver we can generate both of this in one go, but let's refactor smaller pieces at a time.
generateTask("generateStableSemanticAttributes", false)
generateTask("generateIncubatingSemanticAttributes", true)

tasks.register("checkSchemaUrls") {
  val schemaUrlsClass = File("$projectDir/semconv/src/main/java/io/opentelemetry/semconv/SchemaUrls.java")
  if (!schemaUrlsClass.exists()) {
    throw GradleException("SchemaUrls file does not exist")
  }

  for (schemaUrlVersion: String in schemaUrlVersions) {
    val expectedLine = "public static final String V" + schemaUrlVersion.replace(".", "_") + " = \"https://opentelemetry.io/schemas/" + schemaUrlVersion + "\";"
    if (!schemaUrlsClass.readLines().any { it.contains(expectedLine) }) {
      throw GradleException("SchemaUrls file does not contain: $expectedLine")
    }
  }
}

val generateSemanticConventions by tasks.registering {
  dependsOn(tasks.getByName("generateStableSemanticAttributes"))
  dependsOn(tasks.getByName("generateIncubatingSemanticAttributes"))
  dependsOn(tasks.getByName("checkSchemaUrls"))
}

tasks.register("build") {
  dependsOn(tasks.getByName("checkSchemaUrls"))
}

// end
