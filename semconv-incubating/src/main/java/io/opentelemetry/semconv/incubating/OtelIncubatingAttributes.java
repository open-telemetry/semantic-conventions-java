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
public final class OtelIncubatingAttributes {
  /**
   * @deprecated use the {@code otel.scope.name} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_LIBRARY_NAME = stringKey("otel.library.name");

  /**
   * @deprecated use the {@code otel.scope.version} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_LIBRARY_VERSION = stringKey("otel.library.version");

  /**
   * The name of the instrumentation scope - ({@code InstrumentationScope.Name} in OTLP).
   *
   * <p>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes#OTEL_SCOPE_NAME} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_SCOPE_NAME = stringKey("otel.scope.name");

  /**
   * The version of the instrumentation scope - ({@code InstrumentationScope.Version} in OTLP).
   *
   * <p>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes#OTEL_SCOPE_VERSION} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_SCOPE_VERSION = stringKey("otel.scope.version");

  /**
   * Name of the code, either "OK" or "ERROR". MUST NOT be set if the status code is UNSET.
   *
   * <p>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes#OTEL_STATUS_CODE} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_STATUS_CODE = stringKey("otel.status_code");

  /**
   * Description of the Status if it has a value, otherwise not set.
   *
   * <p>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes#OTEL_STATUS_DESCRIPTION} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_STATUS_DESCRIPTION =
      stringKey("otel.status_description");

  // Enum definitions
  /**
   * Values for {@link #OTEL_STATUS_CODE}.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes.OtelStatusCodeValues}.
   */
  @Deprecated
  public static final class OtelStatusCodeIncubatingValues {
    /**
     * The operation has been validated by an Application developer or Operator to have completed
     * successfully.
     */
    public static final String OK = "OK";

    /** The operation contains an error. */
    public static final String ERROR = "ERROR";

    private OtelStatusCodeIncubatingValues() {}
  }

  private OtelIncubatingAttributes() {}
}
