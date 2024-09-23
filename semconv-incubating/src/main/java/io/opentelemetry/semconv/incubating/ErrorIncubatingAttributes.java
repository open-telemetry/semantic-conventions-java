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
public final class ErrorIncubatingAttributes {
  /**
   * Describes a class of error the operation ended with.
   *
   * <p>Notes:
   *
   * <p>The {@code error.type} SHOULD be predictable, and SHOULD have low cardinality.
   *
   * <p>When {@code error.type} is set to a type (e.g., an exception type), its canonical class name
   * identifying the type within the artifact SHOULD be used.
   *
   * <p>Instrumentations SHOULD document the list of errors they report.
   *
   * <p>The cardinality of {@code error.type} within one instrumentation library SHOULD be low.
   * Telemetry consumers that aggregate data from multiple instrumentation libraries and
   * applications should be prepared for {@code error.type} to have high cardinality at query time
   * when no additional filters are applied.
   *
   * <p>If the operation has completed successfully, instrumentations SHOULD NOT set {@code
   * error.type}.
   *
   * <p>If a specific domain defines its own set of error identifiers (such as HTTP or gRPC status
   * codes), it's RECOMMENDED to:
   *
   * <p>
   *
   * <ul>
   *   <li>Use a domain-specific attribute
   *   <li>Set {@code error.type} to capture all errors, regardless of whether they are defined
   *       within the domain-specific set or not.
   * </ul>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ErrorAttributes#ERROR_TYPE} attribute.
   */
  @Deprecated public static final AttributeKey<String> ERROR_TYPE = stringKey("error.type");

  // Enum definitions
  /**
   * Values for {@link #ERROR_TYPE}.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ErrorAttributes.ErrorTypeValues}.
   */
  @Deprecated
  public static final class ErrorTypeIncubatingValues {
    /** A fallback error value to be used when the instrumentation doesn't define a custom value. */
    public static final String OTHER = "_OTHER";

    private ErrorTypeIncubatingValues() {}
  }

  private ErrorIncubatingAttributes() {}
}
