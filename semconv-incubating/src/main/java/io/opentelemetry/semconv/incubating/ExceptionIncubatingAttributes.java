/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class ExceptionIncubatingAttributes {
  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ExceptionAttributes#EXCEPTION_ESCAPED} attribute.
   */
  @Deprecated
  public static final AttributeKey<Boolean> EXCEPTION_ESCAPED = booleanKey("exception.escaped");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ExceptionAttributes#EXCEPTION_MESSAGE} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> EXCEPTION_MESSAGE = stringKey("exception.message");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ExceptionAttributes#EXCEPTION_STACKTRACE} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> EXCEPTION_STACKTRACE = stringKey("exception.stacktrace");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ExceptionAttributes#EXCEPTION_TYPE} attribute.
   */
  @Deprecated public static final AttributeKey<String> EXCEPTION_TYPE = stringKey("exception.type");

  private ExceptionIncubatingAttributes() {}
}
