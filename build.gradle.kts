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
var semanticConventionsVersion = "1.23.1"
val schemaUrlVersions = listOf(semanticConventionsVersion, "1.22.0")

// Compute the artifact version, which includes the "-alpha" suffix and includes "-SNAPSHOT" suffix if not releasing
// Release example: version=1.21.0-alpha
// Snapshot example: version=1.21.0-alpha-SNAPSHOT
var releaseVersion = semanticConventionsVersion + "-alpha"
if (snapshot) {
  releaseVersion += "-SNAPSHOT"
}

allprojects {
  version = releaseVersion
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
// TODO: currently uses local build of https://github.com/open-telemetry/build-tools/pull/244
// Replace with published version of generator when available
var generatorVersion = "foo14"
val semanticConventionsRepoZip = "https://github.com/open-telemetry/semantic-conventions/archive/v$semanticConventionsVersion.zip"
// val semanticConventionsRepoZip = "https://github.com/lmolkova/semantic-conventions/archive/bd833aa5ff13996293654dc45a4a61354b0bbe5d.zip"
val schemaUrl = "https://opentelemetry.io/schemas/$semanticConventionsVersion"

val downloadSemanticConventions by tasks.registering(Download::class) {
  src(semanticConventionsRepoZip)
  dest("$buildDir/semantic-conventions/semantic-conventions.zip")
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
  into("$buildDir/semantic-conventions/")
}

fun generateTask(taskName: String, resource: Boolean, incubating: Boolean) {
  tasks.register(taskName, Exec::class) {
    dependsOn(unzipConfigurationSchema)

    standardOutput = System.out
    executable = "docker"

    val onlyArg = if (resource) "resource" else "span,event,attribute_group,scope,metric"
    val classNamePrefix = if (incubating) "Incubating" else ""
    var className = if (resource) "${classNamePrefix}ResourceAttributes" else "${classNamePrefix}SemanticAttributes"
    val outputDir = if (incubating) "semconv-incubating/src/main/java/io/opentelemetry/semconv/incubating/" else "semconv/src/main/java/io/opentelemetry/semconv/"
    val filterArg = if (incubating) "is_experimental" else "is_stable"
    val packageNameArg = if (incubating) "io.opentelemetry.semconv.incubating" else "io.opentelemetry.semconv"

    setArgs(listOf(
        "run",
        "--rm",
        "-v", "$buildDir/semantic-conventions/model:/source",
        "-v", "$projectDir/buildscripts/templates:/templates",
        "-v", "$projectDir/$outputDir:/output",
        "semconvgen:$generatorVersion",
        "--only", onlyArg,
        "--yaml-root", "/source", "code",
        "--template", "/templates/SemanticAttributes.java.j2",
        "--output", "/output/$className.java",
        "-Dclass=$className",
        "-Dfilter=$filterArg",
        "-Dpkg=$packageNameArg"))
  }
}

generateTask("generateStableSemanticAttributes", false, false)
generateTask("generateIncubatingSemanticAttributes", false, true)
generateTask("generateStableResourceAttributes", true, false)
generateTask("generateIncubatingResourceAttributes", true, true)

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
  dependsOn(tasks.getByName("generateStableResourceAttributes"))
  dependsOn(tasks.getByName("generateIncubatingResourceAttributes"))
  dependsOn(tasks.getByName("checkSchemaUrls"))
}

tasks.register("build") {
  dependsOn(tasks.getByName("checkSchemaUrls"))
}

// end
