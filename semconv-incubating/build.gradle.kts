plugins {
  id("otel.java-conventions")
  id("otel.publish-conventions")
  id("otel.japicmp-conventions")

  id("otel.animalsniffer-conventions")
}

base {
  description = "OpenTelemetry Incubating Semantic Conventions generated classes for Java"
  archivesName.set("opentelemetry-semconv-incubating")
}
otelJava.moduleName.set("io.opentelemetry.semconv.incubating")

dependencies {
  api(project(":semconv"))

  compileOnly("io.opentelemetry:opentelemetry-api")

  testImplementation("io.opentelemetry:opentelemetry-api")
}
