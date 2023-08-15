import de.undercouch.gradle.tasks.download.Download

plugins {
  id("otel.java-conventions")

  id("otel.animalsniffer-conventions")

  id("de.undercouch.download")
}

dependencies {
  implementation(platform("io.opentelemetry:opentelemetry-bom:1.29.0"))
  implementation("io.opentelemetry:opentelemetry-api")

  testImplementation(platform("org.junit:junit-bom:5.10.0"))
  testImplementation("org.junit.jupiter:junit-jupiter-api")
  testImplementation("org.junit.jupiter:junit-jupiter-engine")

  testImplementation(platform("org.assertj:assertj-bom:3.24.2"))
  testImplementation("org.assertj:assertj-core")
}

val semanticConventionsVersion = "1.21.0"
var generatorVersion = "0.18.0"

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
    "-v", "$projectDir/src/main/java/io/opentelemetry/semconv/trace/attributes/:/output",
    "otel/semconvgen:$generatorVersion",
    "--only", "span,event,attribute_group,scope",
    "-f", "/source", "code",
    "--template", "/templates/SemanticAttributes.java.j2",
    "--output", "/output/SemanticAttributes.java",
    "-Dsemconv=trace",
    "-Dclass=SemanticAttributes",
    "-DschemaUrl=$schemaUrl",
    "-Dpkg=io.opentelemetry.semconv.trace.attributes"))
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
    "-v", "$projectDir/src/main/java/io/opentelemetry/semconv/resource/attributes/:/output",
    "otel/semconvgen:$generatorVersion",
    "--only", "resource",
    "-f", "/source", "code",
    "--template", "/templates/SemanticAttributes.java.j2",
    "--output", "/output/ResourceAttributes.java",
    "-Dclass=ResourceAttributes",
    "-DschemaUrl=$schemaUrl",
    "-Dpkg=io.opentelemetry.semconv.resource.attributes"))
}

val generateSemanticConventions by tasks.registering {
  dependsOn(generateSemanticAttributes)
  dependsOn(generateResourceAttributes)
}
