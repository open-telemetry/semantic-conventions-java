
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
public final class ErrorIncubatingAttributes {

  /**
  * Describes a class of error the operation ended with.
  *
  * <p>Notes:
        
        
        <ul> <li>The {@code error.type} SHOULD be predictable and SHOULD have low cardinality.
Instrumentations SHOULD document the list of errors they report.</li><li>The cardinality of {@code error.type} within one instrumentation library SHOULD be low.
Telemetry consumers that aggregate data from multiple instrumentation libraries and applications
should be prepared for {@code error.type} to have high cardinality at query time when no
additional filters are applied.</li><li>If the operation has completed successfully, instrumentations SHOULD NOT set {@code error.type}.</li><li>If a specific domain defines its own set of error identifiers (such as HTTP or gRPC status codes),
it's RECOMMENDED to:</li><li>Use a domain-specific attribute</li>
<li>Set {@code error.type} to capture all errors, regardless of whether they are defined within the domain-specific set or not.</li>
 </ul>
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.ErrorAttributes#ERROR_TYPE} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> ERROR_TYPE = stringKey("error.type");
  // Enum definitions
  /**
  * Values for {@link #ERROR_TYPE}.
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.ErrorAttributes.ErrorTypeValues} attribute.
  */
  @Deprecated
  public static final class ErrorTypeValues {
      /** A fallback error value to be used when the instrumentation doesn&#39;t define a custom value. */
      public static final String OTHER = "_OTHER";

      private ErrorTypeValues() {}
  }

  private ErrorIncubatingAttributes() {}
}