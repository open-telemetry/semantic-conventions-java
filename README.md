# OpenTelemetry Semantic Conventions for Java
[![Continuous Build][ci-image]][ci-url]
[![Maven Central][maven-image]][maven-url]

Java code-generation for the [OpenTelemetry Semantic Conventions](https://github.com/open-telemetry/semantic-conventions).

## Published released

Published releases are available on maven central. Replace `{{version}}` with the latest released version:

[![Maven Central][maven-image]][maven-url]

### Maven

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>io.opentelemetry.semconv</groupId>
      <artifactId>opentelemetry-semconv</artifactId>
      <version>{{version}}</version>
    </dependency>
  </dependencies>
</project>
```

### Gradle

```groovy
dependencies {
  implementation platform("io.opentelemetry.semconv:opentelemetry-semconv:{{version}}")
}
```

## Requirements

Java 17 or higher is required to build the projects in this repository. The built artifacts can be
used on Java 8 or higher.

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

This repository publishes `-alpha` artifacts and as discussed
in [opentelemetry-java/VERSIONING.md](https://github.com/open-telemetry/opentelemetry-java/blob/main/VERSIONING.md),
we make no compatibility guarantees. However, by convention we've been keeping attribute constants
around with `@Deprecated` annotation while we work towards formalizing the strategy (
see [#6](https://github.com/open-telemetry/semantic-conventions-java/issues/6)). The process for
retaining removed attributes is to carefully add entries to
the [SemanticAttributes.java.j2](./buildscripts/templates/SemanticAttributes.java.j2) template. This
is meticulous and error prone, hence the desire to fix it. To ensure we don't accidentally delete
any constants while we work our a permanent
strategy, [japicmp](./buildSrc/src/main/kotlin/otel.japicmp-conventions.gradle.kts) has been added
as a build check. It will ensure that only binary / source compatible changes are made. **NOTE: this
checking of binary / source compatibility is not required and will change in the future.**

## Contributing

Before you start - see OpenTelemetry
general [contributing](https://github.com/open-telemetry/community/blob/main/CONTRIBUTING.md)
requirements and recommendations.

Make sure to review the projects [license](LICENSE) and sign
the [CNCF CLA](https://identity.linuxfoundation.org/projects/cncf). A signed CLA will be enforced by
an automatic check once you submit a PR, but you can also sign it after opening your PR.

This repository is an extension
of [open-telemetry/opentelemetry-java](https://github.com/open-telemetry/opentelemetry-java).
See [opentelemetry-java contributors](https://github.com/open-telemetry/opentelemetry-java#contributing)
for code owners.

[ci-image]: https://github.com/open-telemetry/semantic-conventions-java/workflows/Build/badge.svg
[ci-url]: https://github.com/open-telemetry/semantic-conventions-java/actions?query=workflow%3Abuild+branch%3Amain
[maven-image]: https://maven-badges.herokuapp.com/maven-central/io.opentelemetry.semconv/opentelemetry-semconv/badge.svg
[maven-url]: https://maven-badges.herokuapp.com/maven-central/io.opentelemetry.semconv/opentelemetry-semconv

TODO(jack-berg): add code coverage badge?
