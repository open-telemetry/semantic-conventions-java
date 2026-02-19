#!/bin/bash -e

# Updates the semantic conventions version to a new release.
# Usage: ./update-semconv-version.sh <new-version>
# Example: ./update-semconv-version.sh 1.40.0

version=$1

# Update semanticConventionsVersion in build.gradle.kts
old_version=$(grep -Po 'var semanticConventionsVersion = "\K[0-9]+\.[0-9]+\.[0-9]+' build.gradle.kts)
sed -Ei "s/var semanticConventionsVersion = \"[^\"]*\"/var semanticConventionsVersion = \"$version\"/" build.gradle.kts

# Add old version to schemaUrlVersions list (after semanticConventionsVersion,)
sed -Ei "s/(    semanticConventionsVersion,)/\1\n    \"$old_version\",/" build.gradle.kts

# Add new version constant to SchemaUrls.java
version_underscore=${version//./_}
sed -Ei "s/(public final class SchemaUrls \{)/\1\n\n  public static final String V${version_underscore} = \"https:\/\/opentelemetry.io\/schemas\/${version}\";/" \
  semconv/src/main/java/io/opentelemetry/semconv/SchemaUrls.java

# Add changelog entry
if grep -q "^## Unreleased$" CHANGELOG.md; then
  sed -Ei "s/^## Unreleased$/## Unreleased\n\n* Bump to semconv v${version}\n  ([#PRNUM](https:\/\/github.com\/open-telemetry\/semantic-conventions-java\/pull\/PRNUM))/" CHANGELOG.md
else
  sed -Ei "s/^# Changelog$/# Changelog\n\n## Unreleased\n\n* Bump to semconv v${version}\n  ([#PRNUM](https:\/\/github.com\/open-telemetry\/semantic-conventions-java\/pull\/PRNUM))/" CHANGELOG.md
fi
