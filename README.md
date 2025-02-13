# OpenTelemetry Semantic Conventions for Java

[![Release](https://img.shields.io/github/v/release/open-telemetry/semantic-conventions-java?include_prereleases&style=)](https://github.com/open-telemetry/semantic-conventions-java/releases/)
[![FOSSA License Status](https://app.fossa.com/api/projects/custom%2B162%2Fgithub.com%2Fopen-telemetry%2Fsemantic-conventions-java.svg?type=shield&issueType=license)](https://app.fossa.com/projects/custom%2B162%2Fgithub.com%2Fopen-telemetry%2Fsemantic-conventions-java?ref=badge_shield&issueType=license)
[![FOSSA Security Status](https://app.fossa.com/api/projects/custom%2B162%2Fgithub.com%2Fopen-telemetry%2Fsemantic-conventions-java.svg?type=shield&issueType=security)](https://app.fossa.com/projects/custom%2B162%2Fgithub.com%2Fopen-telemetry%2Fsemantic-conventions-java?ref=badge_shield&issueType=security)
[![OpenSSF Scorecard](https://api.scorecard.dev/projects/github.com/open-telemetry/semantic-conventions-java/badge)](https://scorecard.dev/viewer/?uri=github.com/open-telemetry/semantic-conventions-java)
[![Slack](https://img.shields.io/badge/slack-@cncf/otel--java-blue.svg?logo=slack)](https://cloud-native.slack.com/archives/C014L2KCTE3)

Java code-generation for the [OpenTelemetry Semantic Conventions](https://github.com/open-telemetry/semantic-conventions).

## Published releases

Published releases are available on maven central. Replace `{{version}}` with the latest released version:

| Artifact `{group}:{artifactId}:{version}`                               | Latest Version                                                   | Description                                                                                                                                                                                                                                                                                      |
|-------------------------------------------------------------------------|------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `io.opentelemetry.semconv:opentelemetry-semconv:{{version}}`            | [![Maven Central][maven-image-stable]][maven-url-stable]         | Generated code for stable semantic conventions.</br>**NOTE:** Although this is for stable semantic conventions, the artifact still has the [-alpha][versioning] and comes with no compatibility guarantees. The goal is to mark this artifact stable.                                            |        
| `io.opentelemetry.semconv:opentelemetry-semconv-incubating:{{version}}` | [![Maven Central][maven-image-incubating]][maven-url-incubating] | Generated code for experimental semantic conventions.</br>**NOTE:** This artifact has the [-alpha][versioning] and comes with no compatibility guarantees. Libraries can use this for testing, but should make copies of the attributes to avoid possible runtime errors from version conflicts. |        


### Maven

```xml
<project>
  <dependencies>
    <!-- Stable semantic conventions. Note: generated code is still subject to breaking changes while published with "-alpha" suffix. -->
    <dependency>
      <groupId>io.opentelemetry.semconv</groupId>
      <artifactId>opentelemetry-semconv</artifactId>
      <version>{{version}}</version>
    </dependency>
    <!-- Incubating semantic conventions. Breaking changes expected. Library instrumentation SHOULD NOT depend on this. -->
    <dependency>
      <groupId>io.opentelemetry.semconv</groupId>
      <artifactId>opentelemetry-semconv-incubating</artifactId>
      <version>{{version}}</version>
    </dependency>
  </dependencies>
</project>
```

### Gradle

```groovy
dependencies {
  // Stable semantic conventions. Note: generated code is still subject to breaking changes while published with "-alpha" suffix.
  implementation "io.opentelemetry.semconv:opentelemetry-semconv:{{version}}"
  // Incubating semantic conventions. Breaking changes expected. Library instrumentation SHOULD NOT depend on this.
  implementation "io.opentelemetry.semconv:opentelemetry-semconv-incubating:{{version}}"
}
```

## Requirements

Java 17 or higher is required to build the projects in this repository. The built artifacts can be
used on Java 8 or higher.

To use these artifacts, you must also depend on `io.opentelemetry:opentelemetry-api:{{version}}`.
See [opentelemetry-java releases](https://github.com/open-telemetry/opentelemetry-java#releases) for
more information.

## Android Requirements

An additional requirement for apps supporting older versions of Android on top of 
[desugaring](https://github.com/open-telemetry/opentelemetry-java/blob/main/VERSIONING.md#language-version-compatibility) 
is the need to set the Gradle property `android.useFullClasspathForDexingTransform` for debug 
builds. Please see [this](https://github.com/open-telemetry/opentelemetry-android/pull/309) 
pull request on the OpenTelemetry Android Extension for details.

## Compatibility

Artifacts from this repository follow semantic versioning, mirroring the versions of the upstream [semantic-conventions](https://github.com/open-telemetry/semantic-conventions) repository. If a patch release is needed for logic in this repository, a release will be published with a fourth version component (i.e. `1.30.0.1` to patch an issue with `1.30.0`).  

Stable artifacts (i.e. artifacts without -alpha version suffix) come with strong backwards compatibility guarantees for public APIs.

Compatibility guarantees are inherited from [opentelemetry-java](https://github.com/open-telemetry/opentelemetry-java/blob/main/VERSIONING.md).

## Generating semantic conventions

Requires docker.

In a shell, execute the following gradle tasks:

```shell
./gradlew clean generateSemanticConventions --console=plain
./gradlew spotlessApply
```

This will download the version
of [open-telemetry/semantic-conventions](https://github.com/open-telemetry/semantic-conventions)
defined in the `semanticConventionsVersion` variable of [build.gradle.kts](./build.gradle.kts) and
generate semantic conventions classes from the release contents.

## Contributing

Before you start - see OpenTelemetry
general [contributing](https://github.com/open-telemetry/community/tree/main/guides/contributor)
requirements and recommendations.

Make sure to review the projects [license](LICENSE) and sign
the [CNCF CLA](https://identity.linuxfoundation.org/projects/cncf). A signed CLA will be enforced by
an automatic check once you submit a PR, but you can also sign it after opening your PR.

This repository is an extension
of [open-telemetry/opentelemetry-java](https://github.com/open-telemetry/opentelemetry-java).
See [opentelemetry-java contributors](https://github.com/open-telemetry/opentelemetry-java#contributing)
for code owners.

[maven-image-stable]: https://maven-badges.herokuapp.com/maven-central/io.opentelemetry.semconv/opentelemetry-semconv/badge.svg
[maven-url-stable]: https://maven-badges.herokuapp.com/maven-central/io.opentelemetry.semconv/opentelemetry-semconv
[maven-image-incubating]: https://maven-badges.herokuapp.com/maven-central/io.opentelemetry.semconv/opentelemetry-semconv-incubating/badge.svg
[maven-url-incubating]: https://maven-badges.herokuapp.com/maven-central/io.opentelemetry.semconv/opentelemetry-semconv-incubating
[versioning]: https://github.com/open-telemetry/opentelemetry-java/blob/main/VERSIONING.md

TODO(jack-berg): add code coverage badge?
