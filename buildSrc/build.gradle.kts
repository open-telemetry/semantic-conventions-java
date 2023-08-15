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
}