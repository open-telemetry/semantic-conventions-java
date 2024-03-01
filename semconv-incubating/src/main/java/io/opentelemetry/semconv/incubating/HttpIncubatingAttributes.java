/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class HttpIncubatingAttributes {

  /** Deprecated, use {@code http.request.method} instead. */
  public static final AttributeKey<String> HTTP_METHOD = stringKey("http.method");

  /**
   * The size of the request payload body in bytes. This is the number of bytes transferred
   * excluding headers and is often, but not always, present as the <a
   * href="https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length">Content-Length</a>
   * header. For requests using transport encoding, this should be the compressed size.
   */
  public static final AttributeKey<Long> HTTP_REQUEST_BODY_SIZE = longKey("http.request.body.size");

  /** Deprecated, use {@code http.request.header.content-length} instead. */
  public static final AttributeKey<Long> HTTP_REQUEST_CONTENT_LENGTH =
      longKey("http.request_content_length");

  /**
   * The size of the response payload body in bytes. This is the number of bytes transferred
   * excluding headers and is often, but not always, present as the <a
   * href="https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length">Content-Length</a>
   * header. For requests using transport encoding, this should be the compressed size.
   */
  public static final AttributeKey<Long> HTTP_RESPONSE_BODY_SIZE =
      longKey("http.response.body.size");

  /** Deprecated, use {@code http.response.header.content-length} instead. */
  public static final AttributeKey<Long> HTTP_RESPONSE_CONTENT_LENGTH =
      longKey("http.response_content_length");

  /** Deprecated, use {@code url.scheme} instead. */
  public static final AttributeKey<String> HTTP_SCHEME = stringKey("http.scheme");

  /** Deprecated, use {@code http.response.status_code} instead. */
  public static final AttributeKey<Long> HTTP_STATUS_CODE = longKey("http.status_code");

  /** Deprecated, use {@code url.path} and {@code url.query} instead. */
  public static final AttributeKey<String> HTTP_TARGET = stringKey("http.target");

  /** Deprecated, use {@code url.full} instead. */
  public static final AttributeKey<String> HTTP_URL = stringKey("http.url");

  // Enum definitions

  private HttpIncubatingAttributes() {}
}
