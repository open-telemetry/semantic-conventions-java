/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/java/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class ErrorAttributes {

  /**
   * Describes a class of error the operation ended with.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>
   *       <p>The <code>error.type</code> SHOULD be predictable, and SHOULD have low cardinality.
   *       <p>When <code>error.type</code> is set to a type (e.g., an exception type), its canonical
   *       class name identifying the type within the artifact SHOULD be used.
   *       <p>Instrumentations SHOULD document the list of errors they report.
   *       <p>The cardinality of <code>error.type</code> within one instrumentation library SHOULD
   *       be low. Telemetry consumers that aggregate data from multiple instrumentation libraries
   *       and applications should be prepared for <code>error.type</code> to have high cardinality
   *       at query time when no additional filters are applied.
   *       <p>If the operation has completed successfully, instrumentations SHOULD NOT set <code>
   *       error.type</code>.
   *       <p>If a specific domain defines its own set of error identifiers (such as HTTP or gRPC
   *       status codes), it's RECOMMENDED to:
   *       <ul>
   *         <li>Use a domain-specific attribute
   *         <li>Set <code>error.type</code> to capture all errors, regardless of whether they are
   *             defined within the domain-specific set or not.
   *       </ul>
   * </ul>
   */
  public static final AttributeKey<String> ERROR_TYPE = stringKey("error.type");

  // Enum definitions
  /** Values for {@link #ERROR_TYPE}. */
  public static final class ErrorTypeValues {

    /** A fallback error value to be used when the instrumentation doesn't define a custom value. */
    public static final String OTHER = "_OTHER";

    private ErrorTypeValues() {}
  }

  private ErrorAttributes() {}
}
