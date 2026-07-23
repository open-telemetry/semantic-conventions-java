import aQute.bnd.gradle.Bundle
import aQute.bnd.gradle.Resolve
import aQute.bnd.gradle.TestOSGi

plugins {
  id("otel.java-conventions")
}

description = "OpenTelemetry Semantic Conventions OSGi Integration Tests"
otelJava.moduleName.set("io.opentelemetry.semconv.integration.tests.osgi")
// This module runs OSGi tests against the published semconv bundles; it does not publish an OSGi
// bundle itself.
otelJava.osgiEnabled.set(false)

// The semconv bundles Import-Package io.opentelemetry.api.common, so resolution needs an
// opentelemetry-api that is itself a proper OSGi bundle. OSGi metadata was added to the core
// artifacts in opentelemetry-java#8417, well after the 1.33.0 compileOnly baseline pinned in
// :dependencyManagement, so we force a recent version on this test module's classpath only.
val osgiOtelApiVersion = "1.63.0"

configurations.configureEach {
  resolutionStrategy {
    force("io.opentelemetry:opentelemetry-api:$osgiOtelApiVersion")
  }
}

dependencies {
  testImplementation(project(":semconv"))
  testImplementation(project(":semconv-incubating"))
  // Provides the io.opentelemetry.api.* packages the semconv bundles import, as an OSGi bundle.
  testImplementation("io.opentelemetry:opentelemetry-api:$osgiOtelApiVersion")

  testImplementation("org.osgi:org.osgi.test.junit5:1.3.0")
  // Provided by the OSGi framework at runtime.
  testCompileOnly("org.osgi:osgi.core:8.0.0")

  testRuntimeOnly("org.junit.platform:junit-platform-launcher")
  testRuntimeOnly("org.apache.felix:org.apache.felix.framework:7.0.5")
  // opentelemetry-common (pulled in transitively by opentelemetry-api) declares
  // Require-Capability: osgi.extender=osgi.serviceloader.processor, so the container needs Aries
  // SPI Fly to resolve even though semconv itself has no ServiceLoader providers.
  testRuntimeOnly("org.apache.aries.spifly:org.apache.aries.spifly.dynamic.bundle:1.3.7")
}

// The testing bundle (our JUnit tests + Test-Cases header) is booted inside a real Felix container
// via bnd's Bundle -> Resolve -> TestOSGi task chain, modeled on opentelemetry-java's
// integration-tests/osgi module.
val bsn = "opentelemetry-semconv-osgi-testing"
val runee = "JavaSE-${java.toolchain.languageVersion.get()}"
val testRuntimeClasspath = sourceSets.test.get().runtimeClasspath

val testingBundle = tasks.register<Bundle>("testingBundle") {
  archiveClassifier.set("testing")
  from(sourceSets.test.get().output)
  bundle {
    // BND analyses compileClasspath by default; use the runtime classpath so testImplementation
    // deps (junit-jupiter, assertj) are visible and Test-Cases gets populated.
    classpath(testRuntimeClasspath)
    bnd(
      "Bundle-SymbolicName: $bsn",
      "Test-Cases: \${classes;HIERARCHY_INDIRECTLY_ANNOTATED;org.junit.platform.commons.annotation.Testable;CONCRETE}",
    )
  }
}

val inputBndrun = layout.buildDirectory.file("bndrun/test.bndrun")
val generateBndrun = tasks.register("generateBndrun") {
  // Local copies so the doLast closure captures only serializable values (String, Provider), not
  // the enclosing Kotlin build-script object (required by the configuration cache).
  val bndrunFile = inputBndrun
  val bndrunContent =
    """
    |-tester: biz.aQute.tester.junit-platform
    |-runfw: org.apache.felix.framework
    |-runee: $runee
    |
    |-runrequires: \
    |  bnd.identity;id='$bsn',\
    |  bnd.identity;id='junit-jupiter-engine',\
    |  bnd.identity;id='junit-platform-launcher'
    """.trimMargin()
  inputs.property("content", bndrunContent)
  outputs.file(bndrunFile)
  doLast {
    bndrunFile.get().asFile.apply { parentFile.mkdirs() }.writeText(bndrunContent)
  }
}

val resolvedBndrun = layout.buildDirectory.file("test.bndrun")
val resolve = tasks.register<Resolve>("resolve") {
  dependsOn(testingBundle, generateBndrun)
  description = "Resolve the semconv OSGi test suite"
  group = JavaBasePlugin.VERIFICATION_GROUP
  bndrun = inputBndrun.get().asFile
  outputBndrun = resolvedBndrun
  bundles = files(testRuntimeClasspath, testingBundle.get().archiveFile)
  // The resolved bndrun embeds an absolute path to the input, so it is not safe to share via cache.
  outputs.cacheIf { false }
}

tasks.register<TestOSGi>("testOsgi") {
  dependsOn(resolve)
  description = "Run the semconv OSGi test suite inside an Apache Felix container"
  group = JavaBasePlugin.VERIFICATION_GROUP
  bndrun = resolvedBndrun
  bundles = files(testRuntimeClasspath, testingBundle.get().archiveFile)
  // BND reports success when zero tests ran (e.g. if bundles failed to start). Fail explicitly.
  val testResultsDir = layout.buildDirectory.dir("test-results/$name")
  doLast {
    check(testResultsDir.get().asFile.listFiles()?.isNotEmpty() == true) {
      "No OSGi test results found — bundles may have failed to start. Check the output above."
    }
  }
}

tasks {
  named<Jar>("jar") {
    enabled = false
  }
  named<Test>("test") {
    // Replace plain JUnit execution with the in-container OSGi test.
    actions.clear()
    dependsOn("testOsgi")
  }
}
