plugins {
  id("otel.java-conventions")

  id("otel.animalsniffer-conventions")
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
