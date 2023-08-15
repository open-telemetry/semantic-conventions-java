# 🚧 WARNING: Repository currently under construction 🚧

# OpenTelemetry Semantic Conventions for Java

Java code-generation for the [OpenTelemetry Semantic Conventions](https://github.com/open-telemetry/semantic-conventions).

## Generating semantic conventions

Prerequisites:
- Docker
- JDK 17+

In a shell, execute the following gradle tasks:

```shell
./gradlew generateSemanticConventions --console=plain
./gradlew spotlessApply
```
