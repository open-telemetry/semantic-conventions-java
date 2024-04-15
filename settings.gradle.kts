pluginManagement {
  plugins {
    id("de.undercouch.download") version "5.4.0"
    id("io.github.gradle-nexus.publish-plugin") version "1.3.0"
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
    mavenLocal()
  }
}

rootProject.name = "semantic-conventions-java"
include(":dependencyManagement")
include(":semconv-incubating")
include(":semconv")

