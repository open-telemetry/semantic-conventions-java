/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_22_0;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.experimental.java.j2
@SuppressWarnings("unused")
public final class ErrorAttributes {

  /**
   * Describes a class of error the operation ended with.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code error.type} SHOULD be predictable and SHOULD have low cardinality.
   *       Instrumentations SHOULD document the list of errors they report.
   *   <li>The cardinality of {@code error.type} within one instrumentation library SHOULD be low,
   *       but telemetry consumers that aggregate data from multiple instrumentation libraries and
   *       applications should be prepared for {@code error.type} to have high cardinality at query
   *       time, when no additional filters are applied.
   *   <li>If the operation has completed successfully, instrumentations SHOULD NOT set {@code
   *       error.type}.
   *   <li>If a specific domain defines its own set of error codes (such as HTTP or gRPC status
   *       codes), it's RECOMMENDED to use a domain-specific attribute and also set {@code
   *       error.type} to capture all errors, regardless of whether they are defined within the
   *       domain-specific set or not.
   * </ul>
   */
  public static final AttributeKey<String> ERROR_TYPE = stringKey("error.type");

  // Enum definitions
  public static final class ErrorTypeValues {
    /**
     * A fallback error value to be used when the instrumentation does not define a custom value for
     * it.
     */
    public static final String OTHER = "_OTHER";

    private ErrorTypeValues() {}
  }

  private ErrorAttributes() {}
}
