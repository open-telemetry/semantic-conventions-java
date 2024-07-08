# Changelog

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
