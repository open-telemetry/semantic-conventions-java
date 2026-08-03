import io.opentelemetry.gradle.OtelVersions

plugins {
  `java-platform`
}

javaPlatform {
  allowDependencies()
}

dependencies {
  // boms that are only used by tests should be added in otel.java-conventions.gradle.kts
  // under JvmTestSuite so they don't show up as runtime dependencies in license and vulnerability scans
  // (the constraints section below doesn't have this issue, and will only show up
  // as runtime dependencies if they are actually used as runtime dependencies)

  constraints {
    // pinned to: avoid churn, for conservative api version requirement,
    // and because opentelemetry-api is a compileOnly dependency.
    // OtelVersions.OTEL_API_BASELINE is the single source of truth: otel.java-conventions derives
    // the OSGi Import-Package range for io.opentelemetry.api.* from the same value.
    api("io.opentelemetry:opentelemetry-api:${OtelVersions.OTEL_API_BASELINE}")
  }
}
