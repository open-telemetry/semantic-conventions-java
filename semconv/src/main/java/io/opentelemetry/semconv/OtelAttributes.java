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
public final class OtelAttributes {
  /**
   * Identifies the class / type of event.
   *
   * <p>Notes:
   *
   * <p>This attribute SHOULD be used by non-OTLP exporters when destination does not support {@code
   * EventName} or equivalent field. This attribute MAY be used by applications using existing
   * logging libraries so that it can be used to set the {@code EventName} field by Collector or SDK
   * components.
   */
  public static final AttributeKey<String> OTEL_EVENT_NAME = stringKey("otel.event.name");

  /** The name of the instrumentation scope - ({@code InstrumentationScope.Name} in OTLP). */
  public static final AttributeKey<String> OTEL_SCOPE_NAME = stringKey("otel.scope.name");

  /** The version of the instrumentation scope - ({@code InstrumentationScope.Version} in OTLP). */
  public static final AttributeKey<String> OTEL_SCOPE_VERSION = stringKey("otel.scope.version");

  /** Name of the code, either "OK" or "ERROR". MUST NOT be set if the status code is UNSET. */
  public static final AttributeKey<String> OTEL_STATUS_CODE = stringKey("otel.status_code");

  /** Description of the Status if it has a value, otherwise not set. */
  public static final AttributeKey<String> OTEL_STATUS_DESCRIPTION =
      stringKey("otel.status_description");

  // Enum definition
  /** Values for {@link #OTEL_STATUS_CODE}. */
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

  private OtelAttributes() {}
}
