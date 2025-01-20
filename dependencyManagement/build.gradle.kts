plugins {
  `java-platform`
}

data class DependencySet(val group: String, val version: String, val modules: List<String>)

val dependencyVersions = hashMapOf<String, String>()
rootProject.extra["versions"] = dependencyVersions

val DEPENDENCY_BOMS = listOf(
  "org.assertj:assertj-bom:3.27.3",
  "org.junit:junit-bom:5.11.4",
)

val DEPENDENCIES = listOf(
  "io.opentelemetry:opentelemetry-api:1.33.0"
)

javaPlatform {
  allowDependencies()
}

dependencies {
  for (bom in DEPENDENCY_BOMS) {
    api(enforcedPlatform(bom))
    val split = bom.split(':')
    dependencyVersions[split[0]] = split[2]
  }
  constraints {
    for (dependency in DEPENDENCIES) {
      api(dependency)
      val split = dependency.split(':')
      dependencyVersions[split[0]] = split[2]
    }
  }
}
