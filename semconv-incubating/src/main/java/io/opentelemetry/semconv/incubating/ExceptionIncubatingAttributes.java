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
   * SHOULD be set to true if the exception event is recorded at a point where it is known that the
   * exception is escaping the scope of the span.
   *
   * <p>Notes:
   *
   * <p>An exception is considered to have escaped (or left) the scope of a span, if that span is
   * ended while the exception is still logically "in flight". This may be actually "in flight" in
   * some languages (e.g. if the exception is passed to a Context manager's {@code __exit__} method
   * in Python) but will usually be caught at the point of recording the exception in most
   * languages.
   *
   * <p>It is usually not possible to determine at the point where an exception is thrown whether it
   * will escape the scope of a span. However, it is trivial to know that an exception will escape,
   * if one checks for an active exception just before ending the span, as done in the <a
   * href="https://opentelemetry.io/docs/specs/semconv/exceptions/exceptions-spans/#recording-an-exception">example
   * for recording span exceptions</a>.
   *
   * <p>It follows that an exception may still escape the scope of the span even if the {@code
   * exception.escaped} attribute was not set or set to false, since the event might have been
   * recorded at a time where it was not clear whether the exception will escape.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ExceptionAttributes#EXCEPTION_ESCAPED} attribute.
   */
  @Deprecated
  public static final AttributeKey<Boolean> EXCEPTION_ESCAPED = booleanKey("exception.escaped");

  /**
   * The exception message.
   *
   * <p>
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
   * <p>
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
   * <p>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ExceptionAttributes#EXCEPTION_TYPE} attribute.
   */
  @Deprecated public static final AttributeKey<String> EXCEPTION_TYPE = stringKey("exception.type");

  // Enum definitions

  private ExceptionIncubatingAttributes() {}
}
