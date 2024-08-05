/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class HttpIncubatingAttributes {

  /** State of the HTTP connection in the HTTP connection pool. */
  public static final AttributeKey<String> HTTP_CONNECTION_STATE =
      stringKey("http.connection.state");

  /**
   * The size of the request payload body in bytes. This is the number of bytes transferred
   * excluding headers and is often, but not always, present as the <a
   * href="https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length">Content-Length</a>
   * header. For requests using transport encoding, this should be the compressed size.
   */
  public static final AttributeKey<Long> HTTP_REQUEST_BODY_SIZE = longKey("http.request.body.size");

  /**
   * The total size of the request in bytes. This should be the total number of bytes sent over the
   * wire, including the request line (HTTP/1.1), framing (HTTP/2 and HTTP/3), headers, and request
   * body if any.
   */
  public static final AttributeKey<Long> HTTP_REQUEST_SIZE = longKey("http.request.size");

  /**
   * The size of the response payload body in bytes. This is the number of bytes transferred
   * excluding headers and is often, but not always, present as the <a
   * href="https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length">Content-Length</a>
   * header. For requests using transport encoding, this should be the compressed size.
   */
  public static final AttributeKey<Long> HTTP_RESPONSE_BODY_SIZE =
      longKey("http.response.body.size");

  /**
   * The total size of the response in bytes. This should be the total number of bytes sent over the
   * wire, including the status line (HTTP/1.1), framing (HTTP/2 and HTTP/3), headers, and response
   * body and trailers if any.
   */
  public static final AttributeKey<Long> HTTP_RESPONSE_SIZE = longKey("http.response.size");

  // Enum definitions
  /** Values for {@link #HTTP_CONNECTION_STATE}. */
  public static final class HttpConnectionStateValues {

    /** active state. */
    public static final String ACTIVE = "active";

    /** idle state. */
    public static final String IDLE = "idle";

    private HttpConnectionStateValues() {}
  }

  private HttpIncubatingAttributes() {}
}
