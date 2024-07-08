import de.undercouch.gradle.tasks.download.Download
import java.time.Duration

plugins {
  id("de.undercouch.download")
  id("io.github.gradle-nexus.publish-plugin")
}

// start - updated by ./.github/workflows/prepare-release-branch.yml
val snapshot = false
// end

// The release version of https://github.com/open-telemetry/semantic-conventions used to generate classes
var semanticConventionsVersion = "1.26.0"
val schemaUrlVersions = listOf(
    semanticConventionsVersion,
    "1.25.0",
    "1.24.0",
    "1.23.1",
    "1.22.0")

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
var generatorVersion = "0.24.0"
val semanticConventionsRepoZip = "https://github.com/open-telemetry/semantic-conventions/archive/v${semanticConventionsVersion}.zip"
val schemaUrl = "https://opentelemetry.io/schemas/$semanticConventionsVersion"

val downloadSemanticConventions by tasks.registering(Download::class) {
  src(semanticConventionsRepoZip)
  dest("$buildDir/semantic-conventions-${semanticConventionsVersion}/semantic-conventions.zip")
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
  into("$buildDir/semantic-conventions-${semanticConventionsVersion}/")
}

fun generateTask(taskName: String, incubating: Boolean) {
  tasks.register(taskName, Exec::class) {
    dependsOn(unzipConfigurationSchema)

    standardOutput = System.out
    executable = "docker"

    var filter = if (incubating) "any" else "is_stable"
    var classPrefix = if (incubating) "Incubating" else ""
    val outputDir = if (incubating) "semconv-incubating/src/main/java/io/opentelemetry/semconv/incubating/" else "semconv/src/main/java/io/opentelemetry/semconv/"
    val packageNameArg = if (incubating) "io.opentelemetry.semconv.incubating" else "io.opentelemetry.semconv"
    val stablePackageNameArg = if (incubating) "io.opentelemetry.semconv" else ""

    setArgs(listOf(
        "run",
        "--rm",
        "-v", "$buildDir/semantic-conventions-${semanticConventionsVersion}/model:/source",
        "-v", "$projectDir/buildscripts/templates:/templates",
        "-v", "$projectDir/$outputDir:/output",
        "otel/semconvgen:$generatorVersion",
        "--yaml-root", "/source",
        "--continue-on-validation-errors",
        "code",
        "--template", "/templates/SemanticAttributes.java.j2",
        "--output", "/output/{{pascal_prefix}}${classPrefix}Attributes.java",
        "--file-per-group", "root_namespace",
        // Space delimited list of root namespaces to excluded (i.e. "foo bar")
        "-Dexcluded_namespaces=ios aspnetcore signalr",
        "-Dexcluded_attributes=messaging.client_id",
        "-Dfilter=${filter}",
        "-DclassPrefix=${classPrefix}",
        "-Dpkg=$packageNameArg",
        "-DstablePkg=$stablePackageNameArg"))
  }
}

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
