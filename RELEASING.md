# Release Process

Releases are performed in lockstep
with [open-telemetry/semantic-conventions](https://github.com/open-telemetry/semantic-conventions) [releases](https://github.com/open-telemetry/semantic-conventions/releases).

## Preparing a new release

Applies to major, minor and patch releases of `open-telemetry/semantic-conventions`.

* The semantic conventions version bump and code generation are handled automatically by the
  [auto-update-semconv workflow](.github/workflows/auto-update-semconv.yml), which opens a PR
  against `main` whenever a new `open-telemetry/semantic-conventions` release is published.
* Optionally, merge a PR to `main` updating `CHANGELOG.md` if there are any notable changes
  beyond the straight semantic conventions version update in this release.
    * The heading for the unreleased entries should be `## Unreleased`
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

## Making release candidate locally

* Follow steps to [prepare a new release](#preparing-a-new-release), but DO NOT [make the release](#making-the-release)
* Check out release branch locally
* Set required environment variables
  * `export CI=true` - trick tooling to thinking this is the official release process, and sign artifacts
  * `export GPG_PRIVATE_KEY=<private_key>`
  * `export GPG_PASSWORD=<password>`
  * `export SONATYPE_USER=<user>`
  * `export SONATYPE_KEY=<key>`
* Adjust version tag to include `-rc.<num>` suffix (i.e. `-rc.1` for the first release candidate) in [build.gradle.kts](./build.gradle.kts):

  ```
  var ver = semanticConventionsVersion
  val release = findProperty("otel.release")
  if (release != null) {
    ver += "-" + release
  }
  if (snapshot) {
    ver += "-SNAPSHOT"
  }
  ver += "-rc.1" // <-- ADD THIS LINE
  version = ver
  ```

* Build and publish artifacts to staging repository
  * Run `./gradlew assemble publishToSonatype closeSonatypeStagingRepository` 
  * Notably, this stages the artifacts in sonatype and gives a chance for manual verification before publishing
  * Publishing via the sonatype UI
* After publishing, manually create Github release using the contents from the [CHANGELOG.md](./CHANGELOG.md)

## Credentials

See [opentelemetry-java credentials](https://github.com/open-telemetry/opentelemetry-java/blob/main/RELEASING.md#credentials).
