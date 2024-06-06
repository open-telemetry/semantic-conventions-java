
/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.doubleKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;

import static io.opentelemetry.semconv.AttributeKeyTemplate.stringArrayKeyTemplate;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class OpentracingIncubatingAttributes {

  /**
  * Parent-child Reference type
  *
  * <p>Notes:
        
        
        <ul> <li>The causal relationship between a child Span and a parent Span.</li> </ul>
  *
  */
  public static final AttributeKey<String> OPENTRACING_REFTYPE = stringKey("opentracing.ref_type");
  // Enum definitions
  /**
  * Values for {@link #OPENTRACING_REFTYPE}.
  *
  */
  public static final class OpentracingReftypeValues {
      /** The parent Span depends on the child Span in some capacity. */
      public static final String CHILDOF = "child_of";
      /** The parent Span doesn&#39;t depend in any way on the result of the child Span. */
      public static final String FOLLOWSFROM = "follows_from";

      private OpentracingReftypeValues() {}
  }

  private OpentracingIncubatingAttributes() {}
}