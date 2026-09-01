plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    mavenLocal()
}

dependencies {
  implementation("biz.aQute.bnd:biz.aQute.bnd.gradle:7.4.0")
  implementation("com.diffplug.spotless:spotless-plugin-gradle:8.10.1")
  implementation("ru.vyarus:gradle-animalsniffer-plugin:2.0.1")
  implementation("me.champeau.gradle:japicmp-gradle-plugin:0.4.6")
  // Needed for japicmp but not automatically brought in for some reason.
  implementation("com.google.guava:guava:33.7.1-jre")
}
