/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringArrayKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class HttpIncubatingAttributes {
  /**
   * Deprecated, use {@code client.address} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code client.address}.
   */
  @Deprecated public static final AttributeKey<String> HTTP_CLIENT_IP = stringKey("http.client_ip");

  /**
   * State of the HTTP connection in the HTTP connection pool.
   *
   * <p>
   *
   * @deprecated Replaced by {@code client.address}.
   */
  public static final AttributeKey<String> HTTP_CONNECTION_STATE =
      stringKey("http.connection.state");

  /**
   * Deprecated, use {@code network.protocol.name} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code network.protocol.name}.
   */
  @Deprecated public static final AttributeKey<String> HTTP_FLAVOR = stringKey("http.flavor");

  /**
   * Deprecated, use one of {@code server.address}, {@code client.address} or {@code
   * http.request.header.host} instead, depending on the usage.
   *
   * <p>
   *
   * @deprecated Replaced by one of {@code server.address}, {@code client.address} or {@code
   *     http.request.header.host}, depending on the usage.
   */
  @Deprecated public static final AttributeKey<String> HTTP_HOST = stringKey("http.host");

  /**
   * Deprecated, use {@code http.request.method} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code http.request.method}.
   */
  @Deprecated public static final AttributeKey<String> HTTP_METHOD = stringKey("http.method");

  /**
   * The size of the request payload body in bytes. This is the number of bytes transferred
   * excluding headers and is often, but not always, present as the <a
   * href="https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length">Content-Length</a>
   * header. For requests using transport encoding, this should be the compressed size.
   *
   * <p>
   *
   * @deprecated Replaced by {@code http.request.method}.
   */
  public static final AttributeKey<Long> HTTP_REQUEST_BODY_SIZE = longKey("http.request.body.size");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_REQUEST_HEADER} attribute.
   */
  @Deprecated
  public static final AttributeKeyTemplate<List<String>> HTTP_REQUEST_HEADER =
      stringArrayKeyTemplate("http.request.header");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_REQUEST_METHOD} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> HTTP_REQUEST_METHOD = stringKey("http.request.method");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_REQUEST_METHOD_ORIGINAL} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> HTTP_REQUEST_METHOD_ORIGINAL =
      stringKey("http.request.method_original");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_REQUEST_RESEND_COUNT} attribute.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_REQUEST_RESEND_COUNT =
      longKey("http.request.resend_count");

  /**
   * The total size of the request in bytes. This should be the total number of bytes sent over the
   * wire, including the request line (HTTP/1.1), framing (HTTP/2 and HTTP/3), headers, and request
   * body if any.
   *
   * <p>
   *
   * @deprecated Replaced by {@code http.request.method}.
   */
  public static final AttributeKey<Long> HTTP_REQUEST_SIZE = longKey("http.request.size");

  /**
   * Deprecated, use {@code http.request.header.content-length} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code http.request.header.content-length}.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_REQUEST_CONTENT_LENGTH =
      longKey("http.request_content_length");

  /**
   * Deprecated, use {@code http.request.body.size} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code http.request.body.size}.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_REQUEST_CONTENT_LENGTH_UNCOMPRESSED =
      longKey("http.request_content_length_uncompressed");

  /**
   * The size of the response payload body in bytes. This is the number of bytes transferred
   * excluding headers and is often, but not always, present as the <a
   * href="https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length">Content-Length</a>
   * header. For requests using transport encoding, this should be the compressed size.
   *
   * <p>
   *
   * @deprecated Replaced by {@code http.request.body.size}.
   */
  public static final AttributeKey<Long> HTTP_RESPONSE_BODY_SIZE =
      longKey("http.response.body.size");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_RESPONSE_HEADER} attribute.
   */
  @Deprecated
  public static final AttributeKeyTemplate<List<String>> HTTP_RESPONSE_HEADER =
      stringArrayKeyTemplate("http.response.header");

  /**
   * The total size of the response in bytes. This should be the total number of bytes sent over the
   * wire, including the status line (HTTP/1.1), framing (HTTP/2 and HTTP/3), headers, and response
   * body and trailers if any.
   *
   * <p>
   *
   * @deprecated Replaced by {@code http.request.body.size}.
   */
  public static final AttributeKey<Long> HTTP_RESPONSE_SIZE = longKey("http.response.size");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_RESPONSE_STATUS_CODE} attribute.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_RESPONSE_STATUS_CODE =
      longKey("http.response.status_code");

  /**
   * Deprecated, use {@code http.response.header.content-length} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code http.response.header.content-length}.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_RESPONSE_CONTENT_LENGTH =
      longKey("http.response_content_length");

  /**
   * Deprecated, use {@code http.response.body.size} instead.
   *
   * <p>
   *
   * @deprecated Replace by {@code http.response.body.size}.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_RESPONSE_CONTENT_LENGTH_UNCOMPRESSED =
      longKey("http.response_content_length_uncompressed");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_ROUTE} attribute.
   */
  @Deprecated public static final AttributeKey<String> HTTP_ROUTE = stringKey("http.route");

  /**
   * Deprecated, use {@code url.scheme} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code url.scheme} instead.
   */
  @Deprecated public static final AttributeKey<String> HTTP_SCHEME = stringKey("http.scheme");

  /**
   * Deprecated, use {@code server.address} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code server.address}.
   */
  @Deprecated
  public static final AttributeKey<String> HTTP_SERVER_NAME = stringKey("http.server_name");

  /**
   * Deprecated, use {@code http.response.status_code} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code http.response.status_code}.
   */
  @Deprecated public static final AttributeKey<Long> HTTP_STATUS_CODE = longKey("http.status_code");

  /**
   * Deprecated, use {@code url.path} and {@code url.query} instead.
   *
   * <p>
   *
   * @deprecated Split to {@code url.path} and `url.query.
   */
  @Deprecated public static final AttributeKey<String> HTTP_TARGET = stringKey("http.target");

  /**
   * Deprecated, use {@code url.full} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code url.full}.
   */
  @Deprecated public static final AttributeKey<String> HTTP_URL = stringKey("http.url");

  /**
   * Deprecated, use {@code user_agent.original} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code user_agent.original}.
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

  /**
   * Values for {@link #HTTP_REQUEST_METHOD}.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_REQUEST_METHOD} attribute.
   */
  @Deprecated
  public static final class HttpRequestMethodValues {
    /** CONNECT method. */
    public static final String CONNECT = "CONNECT";

    /** DELETE method. */
    public static final String DELETE = "DELETE";

    /** GET method. */
    public static final String GET = "GET";

    /** HEAD method. */
    public static final String HEAD = "HEAD";

    /** OPTIONS method. */
    public static final String OPTIONS = "OPTIONS";

    /** PATCH method. */
    public static final String PATCH = "PATCH";

    /** POST method. */
    public static final String POST = "POST";

    /** PUT method. */
    public static final String PUT = "PUT";

    /** TRACE method. */
    public static final String TRACE = "TRACE";

    /** Any HTTP method that the instrumentation has no prior knowledge of. */
    public static final String OTHER = "_OTHER";

    private HttpRequestMethodValues() {}
  }

  private HttpIncubatingAttributes() {}
}
