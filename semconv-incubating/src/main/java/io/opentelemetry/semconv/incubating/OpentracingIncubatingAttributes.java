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
public final class OpentracingIncubatingAttributes {
  /**
   * Parent-child Reference type
   *
   * <p>Notes:
   *
   * <p>The causal relationship between a child Span and a parent Span.
   */
  public static final AttributeKey<String> OPENTRACING_REF_TYPE = stringKey("opentracing.ref_type");

  // Enum definitions
  /** Values for {@link #OPENTRACING_REF_TYPE}. */
  public static final class OpentracingRefTypeValues {
    /** The parent Span depends on the child Span in some capacity */
    public static final String CHILD_OF = "child_of";

    /** The parent Span doesn't depend in any way on the result of the child Span */
    public static final String FOLLOWS_FROM = "follows_from";

    private OpentracingRefTypeValues() {}
  }

  private OpentracingIncubatingAttributes() {}
}
