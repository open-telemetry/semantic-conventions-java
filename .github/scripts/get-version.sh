#!/bin/bash -e

grep "var semanticConventionsVersion = " build.gradle.kts | grep -Eo "[0-9]+.[0-9]+.[0-9]+"
