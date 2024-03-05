/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class FeatureFlagIncubatingAttributes {

  /** The unique identifier of the feature flag. */
  public static final AttributeKey<String> FEATURE_FLAG_KEY = stringKey("feature_flag.key");

  /** The name of the service provider that performs the flag evaluation. */
  public static final AttributeKey<String> FEATURE_FLAG_PROVIDER_NAME =
      stringKey("feature_flag.provider_name");

  /**
   * SHOULD be a semantic identifier for a value. If one is unavailable, a stringified version of
   * the value can be used.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>A semantic identifier, commonly referred to as a variant, provides a means for referring
   *       to a value without including the value itself. This can provide additional context for
   *       understanding the meaning behind a value. For example, the variant {@code red} maybe be
   *       used for the value {@code #c05543}.
   *   <li>A stringified version of the value can be used in situations where a semantic identifier
   *       is unavailable. String representation of the value should be determined by the
   *       implementer.
   * </ul>
   */
  public static final AttributeKey<String> FEATURE_FLAG_VARIANT = stringKey("feature_flag.variant");

  // Enum definitions

  private FeatureFlagIncubatingAttributes() {}
}
