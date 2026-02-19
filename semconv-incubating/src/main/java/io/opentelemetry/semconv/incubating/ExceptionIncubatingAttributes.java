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
public final class ExceptionIncubatingAttributes {
  /**
   * The exception message.
   *
   * <p>Notes:
   *
   * <blockquote>
   *
   * [!WARNING]
   *
   * <p>This attribute may contain sensitive information.
   *
   * </blockquote>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ExceptionAttributes#EXCEPTION_MESSAGE} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> EXCEPTION_MESSAGE = stringKey("exception.message");

  /**
   * A stacktrace as a string in the natural representation for the language runtime. The
   * representation is to be determined and documented by each language SIG.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ExceptionAttributes#EXCEPTION_STACKTRACE} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> EXCEPTION_STACKTRACE = stringKey("exception.stacktrace");

  /**
   * The type of the exception (its fully-qualified class name, if applicable). The dynamic type of
   * the exception should be preferred over the static type in languages that support it.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ExceptionAttributes#EXCEPTION_TYPE} attribute.
   */
  @Deprecated public static final AttributeKey<String> EXCEPTION_TYPE = stringKey("exception.type");

  // Enum definitions

  private ExceptionIncubatingAttributes() {}
}
