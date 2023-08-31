# OpenTelemetry Semantic Conventions for Java
[![Continuous Build][ci-image]][ci-url]

Java code-generation for the [OpenTelemetry Semantic Conventions](https://github.com/open-telemetry/semantic-conventions).

## Published released

Published releases are available on maven central.

TODO(jack-berg): insert maven badge indicating latest available release

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
./gradlew generateSemanticConventions --console=plain
./gradlew spotlessApply
```

This will download the version
of [open-telemetry/semantic-conventions](https://github.com/open-telemetry/semantic-conventions)
defined in the `semanticConventionsVersion` variable of [build.gradle.kts](./build.gradle.kts) and
generate semantic conventions classes from the release contents.

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

TODO(jack-berg): add code coverage badge?
TODO(jack-berg): add maven badge after first release
