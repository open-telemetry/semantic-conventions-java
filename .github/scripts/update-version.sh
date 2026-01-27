#!/bin/bash -e

version=$1

sed -Ei "s/val snapshot = true/val snapshot = false/" build.gradle.kts

sed -Ei "1 s/(Comparing source compatibility of [a-z-]+)-[0-9]+\.[0-9]+\.[0-9]+(-SNAPSHOT)?.jar/\1-$version.jar/" docs/apidiffs/current_vs_latest/*.txt
