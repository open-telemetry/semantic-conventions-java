#!/bin/bash -e

grep -Eo "var semanticConventionsVersion = \".*\"" build.gradle.kts | grep -Eo "[0-9]+.[0-9]+.[0-9]+"
