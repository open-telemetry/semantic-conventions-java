plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    mavenLocal()
}

dependencies {
  implementation("com.diffplug.spotless:spotless-plugin-gradle:6.20.0")
  implementation("ru.vyarus:gradle-animalsniffer-plugin:1.7.1")
  implementation("me.champeau.gradle:japicmp-gradle-plugin:0.4.2")
  // Needed for japicmp but not automatically brought in for some reason.
  implementation("com.google.guava:guava:32.1.3-jre")
  implementation("biz.aQute.bnd:biz.aQute.bnd.gradle:7.0.0")
}
