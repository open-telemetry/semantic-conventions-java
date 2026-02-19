# Changelog

## Version 1.40.0 (2026-02-19)

* Bump to semconv v1.40.0
  ([#418](https://github.com/open-telemetry/semantic-conventions-java/pull/418))

## Version 1.39.0 (2026-01-28)

* Bump to semconv v1.39.0
  ([#396](https://github.com/open-telemetry/semantic-conventions-java/pull/396))

## Version 1.38.0 (2026-01-27)

* Bump to semconv v1.38.0
  ([#384](https://github.com/open-telemetry/semantic-conventions-java/pull/384))

## Version 1.37.0 (2025-08-27)

* Bump to semconv v1.37.0
  ([#288](https://github.com/open-telemetry/semantic-conventions-java/pull/288))

## Version 1.36.0 (2025-08-26)

Note: there was no v1.35.0 release
(see [details](https://github.com/open-telemetry/semantic-conventions/issues/2455)).

* Bump to semconv v1.36.0
  ([#253](https://github.com/open-telemetry/semantic-conventions-java/pull/253))

## Version 1.34.0 (2025-06-10)

Note: there was no v1.33.0 release
(see [details](https://github.com/open-telemetry/semantic-conventions-java/pull/217#discussion_r2109393759)).

* Bump to semconv v1.34.0
  ([#217](https://github.com/open-telemetry/semantic-conventions-java/pull/217))

## Version 1.32.0 (2025-04-02)

* Bump to semantic-conventions v1.32.0
  ([#192](https://github.com/open-telemetry/semantic-conventions-java/pull/192)))

## Version 1.31.0 (2025-04-01)

* Bump to semantic-conventions v1.31.0
  ([#189](https://github.com/open-telemetry/semantic-conventions-java/pull/189)))
*  Harden GitHub Actions
  ([#152](https://github.com/open-telemetry/semantic-conventions-java/pull/152),
   [#153](https://github.com/open-telemetry/semantic-conventions-java/pull/153),
   [#155](https://github.com/open-telemetry/semantic-conventions-java/pull/155))
* Add OSSF scorecard workflow
  ([#156](https://github.com/open-telemetry/semantic-conventions-java/pull/156))
* Add codeql
  ([#157](https://github.com/open-telemetry/semantic-conventions-java/pull/157))
* Restrict token permissions
  ([#161](https://github.com/open-telemetry/semantic-conventions-java/pull/161))
* Run gradle wrapper check all the time
  ([#159](https://github.com/open-telemetry/semantic-conventions-java/pull/159))
* Add FOSSA license scanning
  ([#163](https://github.com/open-telemetry/semantic-conventions-java/pull/163))
* Update to weaver 0.13.2 and enable javadoc validation
  ([#174](https://github.com/open-telemetry/semantic-conventions-java/pull/174))

## Version 1.30.0 (2025-02-18)

See [1.30.0-rc.1](#version-1300-rc1-2025-01-27). No additional changes.

## Version 1.30.0-rc.1 (2025-01-27)

**NOTICE**: This is a release candidate (RC), preceding the first stable release of `io.opentelemetry.semconv:opentelemetry-semconv`.

* **BREAKING**: Prepare for stable release. Remove deprecated `ResourceAttributes`, `SemanticAttributes`.
  ([#130](https://github.com/open-telemetry/semantic-conventions-java/pull/130))
* Exclude `exception.escaped` from (to-be-stable) artifact
  ([#133](https://github.com/open-telemetry/semantic-conventions-java/pull/133))
* Remove schema urls for `1.22.0`, `1.23.1`. 
  ([#134](https://github.com/open-telemetry/semantic-conventions-java/pull/134))
* Bump to semantic-conventions v1.30.0
  ([#141](https://github.com/open-telemetry/semantic-conventions-java/pull/141))

## Version 1.29.0 (2024-12-19)

*  Update to semantic conventions 1.29.0 and weaver 0.12.0
   ([#118](https://github.com/open-telemetry/semantic-conventions-java/pull/118))

## Version 1.28.0 (2024-10-14)

* Use weaver for semantic convention codegen
  ([#70](https://github.com/open-telemetry/semantic-conventions-java/pull/70))
* Include Incubating prefix on enum inner class names
  ([#83](https://github.com/open-telemetry/semantic-conventions-java/pull/83))
* Add new class annotations to deprecated classes
  ([#89](https://github.com/open-telemetry/semantic-conventions-java/pull/89))
* Update to semantic-conventions 1.28.0
  ([#91](https://github.com/open-telemetry/semantic-conventions-java/pull/91))

## Version 1.27.0 (2024-08-20)

* Update to semantic-conventions 1.27.0
  ([#81](https://github.com/open-telemetry/semantic-conventions-java/pull/81))

## Version 1.26.0 (2024-07-08)

* Update to semantic-conventions 1.26.0
  ([#73](https://github.com/open-telemetry/semantic-conventions-java/pull/73))
* Add additional Android requirements to README
  ([#68](https://github.com/open-telemetry/semantic-conventions-java/pull/68))

## Version 1.25.0 (2024-04-08)

* Restore and deprecate the `SemanticAttributes` and `ResourceAttributes` classes removed in 1.23.1
  for easier upgrades. These will be removed prior to a stable release
  of `io.opentelemetry.semconv:opentelemetry-semconv`.
  ([#62](https://github.com/open-telemetry/semantic-conventions-java/pull/62))
* Update to semantic-conventions 1.25.0
  ([#61](https://github.com/open-telemetry/semantic-conventions-java/pull/61))

## Version 1.24.0 (2024-03-27)

**NOTICE:** This release contains a significant restructuring of this repository and the generated
classes as we evolve it towards a first stable artifact (although there is no stable artifact as of
this release). Please read the notes carefully and refer to the PRs and associated issues for more
details. Additionally, the [README](README.md) contains useful information that should be reviewed.

* BREAKING: Split out incubating artifact. This repo now
  publishes `io.opentelemetry.semconv:opentelemetry-semconv:{{version}}` for semantic conventions
  which are stable (the artifact itself is not yet stable but we aim to stabilize eventually),
  and `io.opentelemetry.semconv:opentelemetry-semconv-incubating:{{version}}` for semantic
  conventions which are incubating (experimental) (this artifact will always have the `-alpha`
  designation). As a part of this restructuring, old attributes which were removed from
  [semantic-conventions](https://github.com/open-telemetry/semantic-conventions) (without being
  deprecated there) have been removed.
  ([#41](https://github.com/open-telemetry/semantic-conventions-java/pull/41))
* BREAKING: Generate classes by root namespace. Where previously all attributes were contained in
  two classes, `ResourceAttributes` and `SemanticAttributes`, they are now organized by their root
  namespace. For example, the `http.request.header` attribute lives in `HttpAttributes`.
  ([#45](https://github.com/open-telemetry/semantic-conventions-java/pull/45))
* Fix typo in readme
  ([#42](https://github.com/open-telemetry/semantic-conventions-java/pull/42))
* Encode semconv version in build dir to fix build cache
  ([#51](https://github.com/open-telemetry/semantic-conventions-java/pull/51))
* Cleanup enum generation
  ([#52](https://github.com/open-telemetry/semantic-conventions-java/pull/52))
* Update readme to reflect new artifact strategy
  ([#53](https://github.com/open-telemetry/semantic-conventions-java/pull/53))
* Use build-tools release 0.24.0
  ([#55](https://github.com/open-telemetry/semantic-conventions-java/pull/55))
* Exclude namespaces that aren't useful in jvm environments
  ([#54](https://github.com/open-telemetry/semantic-conventions-java/pull/54))
* Update to `semantic-conventions` 1.24.0
  ([#46](https://github.com/open-telemetry/semantic-conventions-java/pull/46))

## Version 1.23.1 (2023-11-21)

* Extended jinja template to generate template-type semantic attributes.
  ([#24](https://github.com/open-telemetry/semantic-conventions-java/pull/24))
* Update to semconv 1.23.1
  ([#36](https://github.com/open-telemetry/semantic-conventions-java/pull/36))

## Version 1.22.0 (2023-10-26)

* Update to semconv 1.22
  ([#29](https://github.com/open-telemetry/semantic-conventions-java/pull/29))
* Compile only opentelemetry-api dependency
  ([#30](https://github.com/open-telemetry/semantic-conventions-java/pull/30))

## Version 1.21.0 (2023-09-01)

* Move to `io.opentelemetry.semnconv.*` package
  ([#14](https://github.com/open-telemetry/semantic-conventions-java/pull/14))
* Update to semantic conventions v1.21.0
  ([#9](https://github.com/open-telemetry/semantic-conventions-java/pull/9))
