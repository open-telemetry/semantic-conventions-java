plugins {
  id("otel.java-conventions")
  id("otel.publish-conventions")
  // TODO: re-enable japicmp when artifact is stable
  // id("otel.japicmp-conventions")

  id("otel.animalsniffer-conventions")
}

base {
  description = "OpenTelemetry Stable Semantic Conventions generated classes for Java"
  archivesName.set("opentelemetry-semconv")
}
otelJava.moduleName.set("io.opentelemetry.semconv")

dependencies {
  compileOnly("io.opentelemetry:opentelemetry-api")

  testImplementation("io.opentelemetry:opentelemetry-api")
}
