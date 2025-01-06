import japicmp.model.*
import me.champeau.gradle.japicmp.JapicmpTask
import me.champeau.gradle.japicmp.report.Violation
import me.champeau.gradle.japicmp.report.stdrules.*


plugins {
  base

  id("me.champeau.gradle.japicmp")
}

/**
 * The latest *released* version of the project. Evaluated lazily so the work is only done if necessary.
 */
val latestReleasedVersion: String by lazy {
  // hack to find the current released version of the project
  val temp: Configuration = configurations.create("tempConfig")
  dependencies.add(temp.name, "io.opentelemetry.semconv:opentelemetry-semconv:latest.release")
  val moduleVersion = configurations["tempConfig"].resolvedConfiguration.firstLevelModuleDependencies.elementAt(0).moduleVersion
  configurations.remove(temp)
  logger.debug("Discovered latest release version: " + moduleVersion)
  moduleVersion
}

class SourceIncompatibleRule : AbstractRecordingSeenMembers() {
  override fun maybeAddViolation(member: JApiCompatibility): Violation? {
    if (!member.isSourceCompatible()) {
      return Violation.error(member, "Not source compatible: $member")
    }
    return null
  }
}

/**
 * Locate the project's artifact of a particular version.
 */
fun findArtifact(version: String): File {
  val existingGroup = group
  try {
    // Temporarily change the group name because we want to fetch an artifact with the same
    // Maven coordinates as the project, which Gradle would not allow otherwise.
    group = "virtual_group"
    val depModule = "io.opentelemetry.semconv:${base.archivesName.get()}:$version@jar"
    val depJar = "${base.archivesName.get()}-$version.jar"
    val configuration: Configuration = configurations.detachedConfiguration(
        dependencies.create(depModule),
    )
    return files(configuration.files).filter {
      it.name.equals(depJar)
    }.singleFile
  } finally {
    group = existingGroup
  }
}

// generate the api diff report for any module that is stable and publishes a jar.
if (!project.hasProperty("otel.release")) {
  afterEvaluate {
    tasks {
      val jApiCmp by registering(JapicmpTask::class) {
        dependsOn("jar")

        // the japicmp "new" version is either the user-specified one, or the locally built jar.
        val apiNewVersion: String? by project
        val newArtifact = apiNewVersion?.let { findArtifact(it) }
            ?: file(getByName<Jar>("jar").archiveFile)
        newClasspath.from(files(newArtifact))

        // only output changes, not everything
        onlyModified.set(true)

        // the japicmp "old" version is either the user-specified one, or the latest release.
        val apiBaseVersion: String? by project
        val baselineVersion = apiBaseVersion ?: latestReleasedVersion
        // TODO: uncomment after first stable release
        // oldClasspath.from(
        //    try {
        //      files(findArtifact(baselineVersion))
        //    } catch (e: Exception) {
        //      // if we can't find the baseline artifact, this is probably one that's never been published before,
        //      // so publish the whole API. We do that by flipping this flag, and comparing the current against nothing.
        //      onlyModified.set(false)
        //      files()
        //    },
        // )

        // Reproduce defaults from https://github.com/melix/japicmp-gradle-plugin/blob/09f52739ef1fccda6b4310cf3f4b19dc97377024/src/main/java/me/champeau/gradle/japicmp/report/ViolationsGenerator.java#L130
        // with some changes.
        val exclusions = mutableListOf<String>()
        // Generics are not detected correctly
        exclusions.add("CLASS_GENERIC_TEMPLATE_CHANGED")
        // Allow new default methods on interfaces
        exclusions.add("METHOD_NEW_DEFAULT")
        // Allow adding default implementations for default methods
        exclusions.add("METHOD_ABSTRACT_NOW_DEFAULT")
        // Bug prevents recognizing default methods of superinterface.
        // Fixed in https://github.com/siom79/japicmp/pull/343 but not yet available in me.champeau.gradle.japicmp
        exclusions.add("METHOD_ABSTRACT_ADDED_IN_IMPLEMENTED_INTERFACE")
        compatibilityChangeExcludes.set(exclusions)
        richReport {
          addSetupRule(RecordSeenMembersSetup::class.java)
          addRule(JApiChangeStatus.NEW, SourceCompatibleRule::class.java)
          addRule(JApiChangeStatus.MODIFIED, SourceCompatibleRule::class.java)
          addRule(JApiChangeStatus.UNCHANGED, UnchangedMemberRule::class.java)
          addRule(BinaryIncompatibleRule::class.java)
          // Disallow source incompatible changes, which are allowed by default for some reason
          addRule(SourceIncompatibleRule::class.java)
        }

        // this is needed so that we only consider the current artifact, and not dependencies
        ignoreMissingClasses.set(true)
        // TODO: remove exclusions after first stable release
        classExcludes.add("io.opentelemetry.semconv.ResourceAttributes")
        classExcludes.add("io.opentelemetry.semconv.SemanticAttributes")
        val baseVersionString = if (apiBaseVersion == null) "latest" else baselineVersion
        txtOutputFile.set(
            apiNewVersion?.let { file("$rootDir/docs/apidiffs/${apiNewVersion}_vs_$baselineVersion/${base.archivesName.get()}.txt") }
                ?: file("$rootDir/docs/apidiffs/current_vs_$baseVersionString/${base.archivesName.get()}.txt"),
        )
      }
      // have the check task depend on the api comparison task, to make it more likely it will get used.
      named("check") {
        dependsOn(jApiCmp)
      }
    }
  }
}
