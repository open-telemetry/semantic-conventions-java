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

val specificationVersion = "1.20.0"
var generatorVersion = "0.18.0"

val specificationRepoZip = "https://github.com/open-telemetry/opentelemetry-specification/archive/v$specificationVersion.zip"
val schemaUrl = "https://opentelemetry.io/schemas/$specificationVersion"

val downloadSpecification by tasks.registering(Download::class) {
  src(specificationRepoZip)
  dest("$buildDir/opentelemetry-specification/opentelemetry-specification.zip")
  overwrite(false)
}

val unzipConfigurationSchema by tasks.registering(Copy::class) {
  dependsOn(downloadSpecification)

  from(zipTree(downloadSpecification.get().dest))
  eachFile(closureOf<FileCopyDetails> {
    // Remove the top level folder "/opentelemetry-specification-$semanticConventionsVersion"
    val pathParts = path.split("/")
    path = pathParts.subList(1, pathParts.size).joinToString("/")
  })
  into("$buildDir/opentelemetry-specification/")
}

val generateSemanticAttributes by tasks.registering(Exec::class) {
  dependsOn(unzipConfigurationSchema)

  standardOutput = System.out
  executable = "docker"
  setArgs(listOf(
    "run",
    "--rm",
    "-v", "$buildDir/opentelemetry-specification/semantic_conventions:/source",
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
    "-v", "$buildDir/opentelemetry-specification/semantic_conventions:/source",
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
