# Contributing

Welcome to the OpenTelemetry Semantic Convention Java repository!

## Building

Java 21 or higher is required to build the projects in this repository
(the built artifacts can be used on Java 8 or higher).
To check your Java version, run:

```bash
java -version
```

To build the project, run:

```bash
./gradlew assemble
```

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

## Style guide

This repository follows the OpenTelemetry Java
repository's [style guide](https://github.com/open-telemetry/opentelemetry-java/blob/main/CONTRIBUTING.md#style-guideline).
