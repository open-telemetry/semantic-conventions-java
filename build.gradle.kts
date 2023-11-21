import de.undercouch.gradle.tasks.download.Download
import java.time.Duration

plugins {
  id("otel.java-conventions")
  id("otel.publish-conventions")
  id("otel.japicmp-conventions")

  id("otel.animalsniffer-conventions")

  id("de.undercouch.download")
  id("io.github.gradle-nexus.publish-plugin")
}

// start - updated by ./.github/workflows/prepare-release-branch.yml
val snapshot = false
// end

// The release version of https://github.com/open-telemetry/semantic-conventions used to generate classes
var semanticConventionsVersion = "1.23.1"

// Compute the artifact version, which includes the "-alpha" suffix and includes "-SNAPSHOT" suffix if not releasing
// Release example: version=1.21.0-alpha
// Snapshot example: version=1.21.0-alpha-SNAPSHOT
var releaseVersion = semanticConventionsVersion + "-alpha"
if (snapshot) {
  releaseVersion += "-SNAPSHOT"
}

base {
  version = releaseVersion
  description = "OpenTelemetry Semantic Conventions generated classes for Java"
  archivesName.set("opentelemetry-semconv")
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

val opentelemetryJavaVersion = "1.31.0"

dependencies {
  compileOnly("io.opentelemetry:opentelemetry-api:$opentelemetryJavaVersion")

  testImplementation("io.opentelemetry:opentelemetry-api:$opentelemetryJavaVersion")

  testImplementation(platform("org.junit:junit-bom:5.10.0"))
  testImplementation("org.junit.jupiter:junit-jupiter-api")
  testImplementation("org.junit.jupiter:junit-jupiter-params")
  testImplementation("org.junit.jupiter:junit-jupiter-engine")

  testImplementation(platform("org.assertj:assertj-bom:3.24.2"))
  testImplementation("org.assertj:assertj-core")
}

// start - define tasks to download, unzip, and generate from opentelemetry/semantic-conventions
var generatorVersion = "0.23.0"
val semanticConventionsRepoZip = "https://github.com/open-telemetry/semantic-conventions/archive/v$semanticConventionsVersion.zip"
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

val generateSemanticAttributes by tasks.registering(Exec::class) {
  dependsOn(unzipConfigurationSchema)

  standardOutput = System.out
  executable = "docker"
  setArgs(listOf(
    "run",
    "--rm",
    "-v", "$buildDir/semantic-conventions/model:/source",
    "-v", "$projectDir/buildscripts/templates:/templates",
    "-v", "$projectDir/src/main/java/io/opentelemetry/semconv/:/output",
    "otel/semconvgen:$generatorVersion",
    "--only", "span,event,attribute_group,scope,metric",
    "--yaml-root", "/source", "code",
    "--template", "/templates/SemanticAttributes.java.j2",
    "--output", "/output/SemanticAttributes.java",
    "-Dclass=SemanticAttributes",
    "-DschemaUrl=$schemaUrl",
    "-Dpkg=io.opentelemetry.semconv"))
}

val generateResourceAttributes by tasks.registering(Exec::class) {
  dependsOn(unzipConfigurationSchema)

  standardOutput = System.out
  executable = "docker"
  setArgs(listOf(
    "run",
    "--rm",
    "-v", "$buildDir/semantic-conventions/model:/source",
    "-v", "$projectDir/buildscripts/templates:/templates",
    "-v", "$projectDir/src/main/java/io/opentelemetry/semconv/:/output",
    "otel/semconvgen:$generatorVersion",
    "--only", "resource",
    "--yaml-root", "/source", "code",
    "--template", "/templates/SemanticAttributes.java.j2",
    "--output", "/output/ResourceAttributes.java",
    "-Dclass=ResourceAttributes",
    "-DschemaUrl=$schemaUrl",
    "-Dpkg=io.opentelemetry.semconv"))
}

val generateSemanticConventions by tasks.registering {
  dependsOn(generateSemanticAttributes)
  dependsOn(generateResourceAttributes)
}
// end
