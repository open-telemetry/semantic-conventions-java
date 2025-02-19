pluginManagement {
  plugins {
    id("de.undercouch.download") version "5.6.0"
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
    id("com.gradle.develocity") version "3.19.2"
  }
}

plugins {
  id("com.gradle.develocity")
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
    mavenLocal()
  }
}

develocity {
  buildScan {
    publishing.onlyIf { System.getenv("CI") != null }
    termsOfUseUrl.set("https://gradle.com/help/legal-terms-of-use")
    termsOfUseAgree.set("yes")
  }
}

rootProject.name = "semantic-conventions-java"
include(":dependencyManagement")
include(":semconv-incubating")
include(":semconv")
