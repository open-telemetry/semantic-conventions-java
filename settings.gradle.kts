pluginManagement {
  plugins {
    id("de.undercouch.download") version "5.6.0"
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
    id("com.gradle.develocity") version "4.3.2"
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
  }
}

plugins {
  id("com.gradle.develocity")
  id("org.gradle.toolchains.foojay-resolver-convention")
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
    mavenLocal()
  }
}

val develocityServer = "https://develocity.opentelemetry.io"
val isCI = System.getenv("CI") != null
val develocityAccessKey = System.getenv("DEVELOCITY_ACCESS_KEY") ?: ""

// if develocity access key is not given and we are in CI, then we publish to scans.gradle.com
val useScansGradleCom = isCI && develocityAccessKey.isEmpty()

develocity {
  if (useScansGradleCom) {
    buildScan {
      termsOfUseUrl = "https://gradle.com/help/legal-terms-of-use"
      termsOfUseAgree = "yes"
    }
  } else {
    server = develocityServer
    buildScan {
      publishing.onlyIf { it.isAuthenticated }
    }
  }

  buildScan {
    uploadInBackground = !isCI

    capture {
      fileFingerprints = true
    }
  }
}

if (!useScansGradleCom) {
  buildCache {
    remote(develocity.buildCache) {
      isPush = isCI && develocityAccessKey.isNotEmpty()
    }
  }
}

rootProject.name = "semantic-conventions-java"
include(":dependencyManagement")
include(":semconv-incubating")
include(":semconv")
