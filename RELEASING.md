# Release Process

Releases are performed in lockstep
with [open-telemetry/semantic-conventions](https://github.com/open-telemetry/semantic-conventions) [releases](https://github.com/open-telemetry/semantic-conventions/releases).

## Preparing a new release

Applies to major, minor and patch releases of `open-telemetry/semantic-conventions`.

* Merge a PR to `main` with the following changes:
  * Update the `CHANGELOG.md`
    * The heading for the unreleased entires should be `## Unreleased`
  * Bump the `semanticConventionsVersion` variable in `build.gradle.kts` to version
    of `semantic-conventions` to be released
  * Follow the instructions
    to [generate the semantic conventions](README.md#generating-semantic-conventions)
* Run
  the [Prepare release branch workflow](https://github.com/open-telemetry/semantic-conventions-java/actions/workflows/prepare-release-branch.yml)
  * Press the "Run workflow" button, and leave the default branch `main` selected
  * Review and merge the two pull requests it creates (one is targeted to the release branch and one
    is targeted to `main`)

## Preparing a patch release

TODO(jack-berg): Define process for releasing a patch, which should add a 4th component to
the `semantic-convention` release version, e.g. `v1.21.0.1`

## Making the release

* Run
  the [Release workflow](https://github.com/open-telemetry/semantic-conventions-java/actions/workflows/release.yml)
  * Press the "Run workflow" button, then select the release branch from the dropdown list,
    e.g. `release/v1.21.0`, and click the "Run workflow" button below that.
  * This workflow will publish artifacts to maven central and will publish a GitHub release with
    release notes based on the change log.

## Credentials

See [opentelemetry-java credentials](https://github.com/open-telemetry/opentelemetry-java/blob/main/RELEASING.md#credentials).
