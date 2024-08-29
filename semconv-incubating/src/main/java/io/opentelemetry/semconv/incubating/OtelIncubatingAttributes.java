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
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes#OTEL_SCOPE_NAME} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_SCOPE_NAME = stringKey("otel.scope.name");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes#OTEL_SCOPE_VERSION} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_SCOPE_VERSION = stringKey("otel.scope.version");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes#OTEL_STATUS_CODE} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_STATUS_CODE = stringKey("otel.status_code");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes#OTEL_STATUS_DESCRIPTION} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_STATUS_DESCRIPTION =
      stringKey("otel.status_description");

  private OtelIncubatingAttributes() {}
}
