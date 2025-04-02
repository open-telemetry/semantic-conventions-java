/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class FeatureFlagIncubatingAttributes {
  /** The unique identifier for the flag evaluation context. For example, the targeting key. */
  public static final AttributeKey<String> FEATURE_FLAG_CONTEXT_ID =
      stringKey("feature_flag.context.id");

  /** A message explaining the nature of an error occurring during flag evaluation. */
  public static final AttributeKey<String> FEATURE_FLAG_EVALUATION_ERROR_MESSAGE =
      stringKey("feature_flag.evaluation.error.message");

  /**
   * Deprecated, use {@code feature_flag.result.reason} instead.
   *
   * @deprecated Replaced by {@code feature_flag.result.reason}.
   */
  @Deprecated
  public static final AttributeKey<String> FEATURE_FLAG_EVALUATION_REASON =
      stringKey("feature_flag.evaluation.reason");

  /** The lookup key of the feature flag. */
  public static final AttributeKey<String> FEATURE_FLAG_KEY = stringKey("feature_flag.key");

  /** Identifies the feature flag provider. */
  public static final AttributeKey<String> FEATURE_FLAG_PROVIDER_NAME =
      stringKey("feature_flag.provider_name");

  /** The reason code which shows how a feature flag value was determined. */
  public static final AttributeKey<String> FEATURE_FLAG_RESULT_REASON =
      stringKey("feature_flag.result.reason");

  /**
   * A semantic identifier for an evaluated flag value.
   *
   * <p>Notes:
   *
   * <p>A semantic identifier, commonly referred to as a variant, provides a means for referring to
   * a value without including the value itself. This can provide additional context for
   * understanding the meaning behind a value. For example, the variant {@code red} maybe be used
   * for the value {@code #c05543}.
   */
  public static final AttributeKey<String> FEATURE_FLAG_RESULT_VARIANT =
      stringKey("feature_flag.result.variant");

  /**
   * The identifier of the <a href="https://openfeature.dev/specification/glossary/#flag-set">flag
   * set</a> to which the feature flag belongs.
   */
  public static final AttributeKey<String> FEATURE_FLAG_SET_ID = stringKey("feature_flag.set.id");

  /**
   * Deprecated, use {@code feature_flag.result.variant} instead.
   *
   * @deprecated Replaced by {@code feature_flag.result.variant}.
   */
  @Deprecated
  public static final AttributeKey<String> FEATURE_FLAG_VARIANT = stringKey("feature_flag.variant");

  /**
   * The version of the ruleset used during the evaluation. This may be any stable value which
   * uniquely identifies the ruleset.
   */
  public static final AttributeKey<String> FEATURE_FLAG_VERSION = stringKey("feature_flag.version");

  // Enum definitions
  /**
   * Values for {@link #FEATURE_FLAG_EVALUATION_REASON}
   *
   * @deprecated Replaced by {@code feature_flag.result.reason}.
   */
  @Deprecated
  public static final class FeatureFlagEvaluationReasonIncubatingValues {
    /** The resolved value is static (no dynamic evaluation). */
    public static final String STATIC = "static";

    /**
     * The resolved value fell back to a pre-configured value (no dynamic evaluation occurred or
     * dynamic evaluation yielded no result).
     */
    public static final String DEFAULT = "default";

    /**
     * The resolved value was the result of a dynamic evaluation, such as a rule or specific
     * user-targeting.
     */
    public static final String TARGETING_MATCH = "targeting_match";

    /** The resolved value was the result of pseudorandom assignment. */
    public static final String SPLIT = "split";

    /** The resolved value was retrieved from cache. */
    public static final String CACHED = "cached";

    /** The resolved value was the result of the flag being disabled in the management system. */
    public static final String DISABLED = "disabled";

    /** The reason for the resolved value could not be determined. */
    public static final String UNKNOWN = "unknown";

    /** The resolved value is non-authoritative or possibly out of date */
    public static final String STALE = "stale";

    /** The resolved value was the result of an error. */
    public static final String ERROR = "error";

    private FeatureFlagEvaluationReasonIncubatingValues() {}
  }

  /** Values for {@link #FEATURE_FLAG_RESULT_REASON}. */
  public static final class FeatureFlagResultReasonIncubatingValues {
    /** The resolved value is static (no dynamic evaluation). */
    public static final String STATIC = "static";

    /**
     * The resolved value fell back to a pre-configured value (no dynamic evaluation occurred or
     * dynamic evaluation yielded no result).
     */
    public static final String DEFAULT = "default";

    /**
     * The resolved value was the result of a dynamic evaluation, such as a rule or specific
     * user-targeting.
     */
    public static final String TARGETING_MATCH = "targeting_match";

    /** The resolved value was the result of pseudorandom assignment. */
    public static final String SPLIT = "split";

    /** The resolved value was retrieved from cache. */
    public static final String CACHED = "cached";

    /** The resolved value was the result of the flag being disabled in the management system. */
    public static final String DISABLED = "disabled";

    /** The reason for the resolved value could not be determined. */
    public static final String UNKNOWN = "unknown";

    /** The resolved value is non-authoritative or possibly out of date */
    public static final String STALE = "stale";

    /** The resolved value was the result of an error. */
    public static final String ERROR = "error";

    private FeatureFlagResultReasonIncubatingValues() {}
  }

  private FeatureFlagIncubatingAttributes() {}
}
