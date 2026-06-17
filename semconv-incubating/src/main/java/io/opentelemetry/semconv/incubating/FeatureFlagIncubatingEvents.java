/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEvents.java.j2
@SuppressWarnings("unused")
public final class FeatureFlagIncubatingEvents {
  /**
   * Defines feature flag evaluation as an event.
   *
   * <p>Notes:
   *
   * <p>A {@code feature_flag.evaluation} event SHOULD be emitted whenever a feature flag value is
   * evaluated, which may happen many times over the course of an application lifecycle. For
   * example, a website A/B testing different animations may evaluate a flag each time a button is
   * clicked. A {@code feature_flag.evaluation} event is emitted on each evaluation even if the
   * result is the same.
   */
  public static final String FEATURE_FLAG_EVALUATION = "feature_flag.evaluation";

  private FeatureFlagIncubatingEvents() {}
}
