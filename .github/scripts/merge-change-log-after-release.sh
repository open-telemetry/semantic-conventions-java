#!/bin/bash -e

# this script merges release notes for $VERSION into CHANGELOG.md
# the release date for $VERSION should be available in $RELEASE_DATE
# and the release notes for $VERSION should be available in /tmp/changelog-section.md

# NOTE: this script differs from the equivalent in other Java repos (where it
# was copied from). In those repos patch releases are cut from the prior
# minor's release branch, so the patch version heading is not yet present in
# CHANGELOG.md on main and must be prepended here. In this repo, patch
# releases also go through the prepare-release-branch workflow, which already
# adds the heading to main, so we always take the "heading already exists"
# path below (both for minor and patch releases). Please preserve this
# difference when syncing workflow changes from other Java repos.

# update the release date
sed -Ei "s/## Version $VERSION .*/## Version $VERSION ($RELEASE_DATE)/" CHANGELOG.md

# the entries are copied over from the release branch to support workflows
# where change log entries may be updated after preparing the release branch

{
  # copy the portion above the release, up to and including the heading
  sed -n "0,/^## Version $VERSION /p" CHANGELOG.md
  # copy the release notes for $VERSION
  cat /tmp/changelog-section.md
  # copy the portion below the release
  sed -n "0,/^## Version $VERSION /d;0,/^## Version /{/^## Version/!d};p" CHANGELOG.md
} > /tmp/CHANGELOG.md

# update the real CHANGELOG.md
cp /tmp/CHANGELOG.md CHANGELOG.md
