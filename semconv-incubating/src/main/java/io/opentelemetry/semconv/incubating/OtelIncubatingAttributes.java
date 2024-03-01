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
public final class OtelIncubatingAttributes {

  /** Deprecated, use the {@code otel.scope.name} attribute. */
  public static final AttributeKey<String> OTEL_LIBRARY_NAME = stringKey("otel.library.name");

  /** Deprecated, use the {@code otel.scope.version} attribute. */
  public static final AttributeKey<String> OTEL_LIBRARY_VERSION = stringKey("otel.library.version");

  /** The name of the instrumentation scope - ({@code InstrumentationScope.Name} in OTLP). */
  public static final AttributeKey<String> OTEL_SCOPE_NAME = stringKey("otel.scope.name");

  /** The version of the instrumentation scope - ({@code InstrumentationScope.Version} in OTLP). */
  public static final AttributeKey<String> OTEL_SCOPE_VERSION = stringKey("otel.scope.version");

  /**
   * Name of the code, either &quot;OK&quot; or &quot;ERROR&quot;. MUST NOT be set if the status
   * code is UNSET.
   */
  public static final AttributeKey<String> OTEL_STATUS_CODE = stringKey("otel.status_code");

  /** Description of the Status if it has a value, otherwise not set. */
  public static final AttributeKey<String> OTEL_STATUS_DESCRIPTION =
      stringKey("otel.status_description");

  // Enum definitions
  public static final class OtelStatusCodeValues {
    /**
     * The operation has been validated by an Application developer or Operator to have completed
     * successfully.
     */
    public static final String OK = "OK";

    /** The operation contains an error. */
    public static final String ERROR = "ERROR";

    private OtelStatusCodeValues() {}
  }

  private OtelIncubatingAttributes() {}
}