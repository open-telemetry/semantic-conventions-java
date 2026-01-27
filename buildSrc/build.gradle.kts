plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    mavenLocal()
}

dependencies {
  implementation("com.diffplug.spotless:spotless-plugin-gradle:8.2.0")
  implementation("ru.vyarus:gradle-animalsniffer-plugin:2.0.1")
  implementation("me.champeau.gradle:japicmp-gradle-plugin:0.4.6")
  // Needed for japicmp but not automatically brought in for some reason.
  implementation("com.google.guava:guava:33.5.0-jre")
}
