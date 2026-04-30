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
public final class ExceptionAttributes {
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
   */
  public static final AttributeKey<String> EXCEPTION_MESSAGE = stringKey("exception.message");

  /**
   * A stacktrace as a string in the natural representation for the language runtime. The
   * representation is to be determined and documented by each language SIG.
   */
  public static final AttributeKey<String> EXCEPTION_STACKTRACE = stringKey("exception.stacktrace");

  /**
   * The type of the exception (its fully-qualified class name, if applicable). The dynamic type of
   * the exception should be preferred over the static type in languages that support it.
   *
   * <p>Notes:
   *
   * <p>If the recorded exception type is a wrapper that is not meaningful for failure
   * classification, instrumentation MAY use the type of the inner exception instead. For example,
   * in Go, errors created with {@code fmt.Errorf} using {@code %w} MAY be unwrapped when the
   * wrapper type does not help classify the failure.
   */
  public static final AttributeKey<String> EXCEPTION_TYPE = stringKey("exception.type");

  private ExceptionAttributes() {}
}
