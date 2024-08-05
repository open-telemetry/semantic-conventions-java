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

  /**
   * Deprecated, use <code>client.address</code> instead.
   *
   * @deprecated Replaced by `client.address`.
   */
  @Deprecated public static final AttributeKey<String> HTTP_CLIENT_IP = stringKey("http.client_ip");

  /** State of the HTTP connection in the HTTP connection pool. */
  public static final AttributeKey<String> HTTP_CONNECTION_STATE =
      stringKey("http.connection.state");

  /**
   * Deprecated, use <code>network.protocol.name</code> instead.
   *
   * @deprecated Replaced by `network.protocol.name`.
   */
  @Deprecated public static final AttributeKey<String> HTTP_FLAVOR = stringKey("http.flavor");

  /**
   * Deprecated, use one of <code>server.address</code>, <code>client.address</code> or <code>
   * http.request.header.host</code> instead, depending on the usage.
   *
   * @deprecated Replaced by one of `server.address`, `client.address` or
   *     `http.request.header.host`, depending on the usage.
   */
  @Deprecated public static final AttributeKey<String> HTTP_HOST = stringKey("http.host");

  /**
   * Deprecated, use <code>http.request.method</code> instead.
   *
   * @deprecated Replaced by `http.request.method`.
   */
  @Deprecated public static final AttributeKey<String> HTTP_METHOD = stringKey("http.method");

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
   * Deprecated, use <code>http.request.header.content-length</code> instead.
   *
   * @deprecated Replaced by `http.request.header.content-length`.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_REQUEST_CONTENT_LENGTH =
      longKey("http.request_content_length");

  /**
   * Deprecated, use <code>http.request.body.size</code> instead.
   *
   * @deprecated Replaced by `http.request.body.size`.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_REQUEST_CONTENT_LENGTH_UNCOMPRESSED =
      longKey("http.request_content_length_uncompressed");

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

  /**
   * Deprecated, use <code>http.response.header.content-length</code> instead.
   *
   * @deprecated Replaced by `http.response.header.content-length`.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_RESPONSE_CONTENT_LENGTH =
      longKey("http.response_content_length");

  /**
   * Deprecated, use <code>http.response.body.size</code> instead.
   *
   * @deprecated Replace by `http.response.body.size`.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_RESPONSE_CONTENT_LENGTH_UNCOMPRESSED =
      longKey("http.response_content_length_uncompressed");

  /**
   * Deprecated, use <code>url.scheme</code> instead.
   *
   * @deprecated Replaced by `url.scheme` instead.
   */
  @Deprecated public static final AttributeKey<String> HTTP_SCHEME = stringKey("http.scheme");

  /**
   * Deprecated, use <code>server.address</code> instead.
   *
   * @deprecated Replaced by `server.address`.
   */
  @Deprecated
  public static final AttributeKey<String> HTTP_SERVER_NAME = stringKey("http.server_name");

  /**
   * Deprecated, use <code>http.response.status_code</code> instead.
   *
   * @deprecated Replaced by `http.response.status_code`.
   */
  @Deprecated public static final AttributeKey<Long> HTTP_STATUS_CODE = longKey("http.status_code");

  /**
   * Deprecated, use <code>url.path</code> and <code>url.query</code> instead.
   *
   * @deprecated Split to `url.path` and `url.query.
   */
  @Deprecated public static final AttributeKey<String> HTTP_TARGET = stringKey("http.target");

  /**
   * Deprecated, use <code>url.full</code> instead.
   *
   * @deprecated Replaced by `url.full`.
   */
  @Deprecated public static final AttributeKey<String> HTTP_URL = stringKey("http.url");

  /**
   * Deprecated, use <code>user_agent.original</code> instead.
   *
   * @deprecated Replaced by `user_agent.original`.
   */
  @Deprecated
  public static final AttributeKey<String> HTTP_USER_AGENT = stringKey("http.user_agent");

  // Enum definitions
  /** Values for {@link #HTTP_CONNECTION_STATE}. */
  public static final class HttpConnectionStateValues {

    /** active state. */
    public static final String ACTIVE = "active";

    /** idle state. */
    public static final String IDLE = "idle";

    private HttpConnectionStateValues() {}
  }

  // Enum definitions
  /** Values for {@link #HTTP_FLAVOR}. */
  public static final class HttpFlavorValues {

    /** HTTP/1.0 */
    public static final String HTTP_1_0 = "1.0";

    /** HTTP/1.1 */
    public static final String HTTP_1_1 = "1.1";

    /** HTTP/2 */
    public static final String HTTP_2_0 = "2.0";

    /** HTTP/3 */
    public static final String HTTP_3_0 = "3.0";

    /** SPDY protocol. */
    public static final String SPDY = "SPDY";

    /** QUIC protocol. */
    public static final String QUIC = "QUIC";

    private HttpFlavorValues() {}
  }

  private HttpIncubatingAttributes() {}
}
