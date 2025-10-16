/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class HttpIncubatingMetrics {

  /** Name of the {@code http.client.active_requests} metric. */
  public static final String HTTP_CLIENT_ACTIVE_REQUESTS_NAME = "http.client.active_requests";

  /** Unit of the {@code http.client.active_requests} metric. */
  public static final String HTTP_CLIENT_ACTIVE_REQUESTS_UNIT = "{request}";

  /** Description of the {@code http.client.active_requests} metric. */
  public static final String HTTP_CLIENT_ACTIVE_REQUESTS_DESCRIPTION =
      "Number of active HTTP requests.";

  /** Name of the {@code http.client.connection.duration} metric. */
  public static final String HTTP_CLIENT_CONNECTION_DURATION_NAME =
      "http.client.connection.duration";

  /** Unit of the {@code http.client.connection.duration} metric. */
  public static final String HTTP_CLIENT_CONNECTION_DURATION_UNIT = "s";

  /** Description of the {@code http.client.connection.duration} metric. */
  public static final String HTTP_CLIENT_CONNECTION_DURATION_DESCRIPTION =
      "The duration of the successfully established outbound HTTP connections.";

  /** Name of the {@code http.client.open_connections} metric. */
  public static final String HTTP_CLIENT_OPEN_CONNECTIONS_NAME = "http.client.open_connections";

  /** Unit of the {@code http.client.open_connections} metric. */
  public static final String HTTP_CLIENT_OPEN_CONNECTIONS_UNIT = "{connection}";

  /** Description of the {@code http.client.open_connections} metric. */
  public static final String HTTP_CLIENT_OPEN_CONNECTIONS_DESCRIPTION =
      "Number of outbound HTTP connections that are currently active or idle on the client.";

  /** Name of the {@code http.client.request.body.size} metric. */
  public static final String HTTP_CLIENT_REQUEST_BODY_SIZE_NAME = "http.client.request.body.size";

  /** Unit of the {@code http.client.request.body.size} metric. */
  public static final String HTTP_CLIENT_REQUEST_BODY_SIZE_UNIT = "By";

  /** Description of the {@code http.client.request.body.size} metric. */
  public static final String HTTP_CLIENT_REQUEST_BODY_SIZE_DESCRIPTION =
      "Size of HTTP client request bodies.";

  /**
   * Name of the {@code http.client.request.duration} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpMetrics#HTTP_CLIENT_REQUEST_DURATION_NAME} constant.
   */
  @Deprecated
  public static final String HTTP_CLIENT_REQUEST_DURATION_NAME = "http.client.request.duration";

  /**
   * Unit of the {@code http.client.request.duration} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpMetrics#HTTP_CLIENT_REQUEST_DURATION_UNIT} constant.
   */
  @Deprecated public static final String HTTP_CLIENT_REQUEST_DURATION_UNIT = "s";

  /**
   * Description of the {@code http.client.request.duration} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpMetrics#HTTP_CLIENT_REQUEST_DURATION_DESCRIPTION} constant.
   */
  @Deprecated
  public static final String HTTP_CLIENT_REQUEST_DURATION_DESCRIPTION =
      "Duration of HTTP client requests.";

  /** Name of the {@code http.client.response.body.size} metric. */
  public static final String HTTP_CLIENT_RESPONSE_BODY_SIZE_NAME = "http.client.response.body.size";

  /** Unit of the {@code http.client.response.body.size} metric. */
  public static final String HTTP_CLIENT_RESPONSE_BODY_SIZE_UNIT = "By";

  /** Description of the {@code http.client.response.body.size} metric. */
  public static final String HTTP_CLIENT_RESPONSE_BODY_SIZE_DESCRIPTION =
      "Size of HTTP client response bodies.";

  /** Name of the {@code http.server.active_requests} metric. */
  public static final String HTTP_SERVER_ACTIVE_REQUESTS_NAME = "http.server.active_requests";

  /** Unit of the {@code http.server.active_requests} metric. */
  public static final String HTTP_SERVER_ACTIVE_REQUESTS_UNIT = "{request}";

  /** Description of the {@code http.server.active_requests} metric. */
  public static final String HTTP_SERVER_ACTIVE_REQUESTS_DESCRIPTION =
      "Number of active HTTP server requests.";

  /** Name of the {@code http.server.request.body.size} metric. */
  public static final String HTTP_SERVER_REQUEST_BODY_SIZE_NAME = "http.server.request.body.size";

  /** Unit of the {@code http.server.request.body.size} metric. */
  public static final String HTTP_SERVER_REQUEST_BODY_SIZE_UNIT = "By";

  /** Description of the {@code http.server.request.body.size} metric. */
  public static final String HTTP_SERVER_REQUEST_BODY_SIZE_DESCRIPTION =
      "Size of HTTP server request bodies.";

  /**
   * Name of the {@code http.server.request.duration} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpMetrics#HTTP_SERVER_REQUEST_DURATION_NAME} constant.
   */
  @Deprecated
  public static final String HTTP_SERVER_REQUEST_DURATION_NAME = "http.server.request.duration";

  /**
   * Unit of the {@code http.server.request.duration} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpMetrics#HTTP_SERVER_REQUEST_DURATION_UNIT} constant.
   */
  @Deprecated public static final String HTTP_SERVER_REQUEST_DURATION_UNIT = "s";

  /**
   * Description of the {@code http.server.request.duration} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpMetrics#HTTP_SERVER_REQUEST_DURATION_DESCRIPTION} constant.
   */
  @Deprecated
  public static final String HTTP_SERVER_REQUEST_DURATION_DESCRIPTION =
      "Duration of HTTP server requests.";

  /** Name of the {@code http.server.response.body.size} metric. */
  public static final String HTTP_SERVER_RESPONSE_BODY_SIZE_NAME = "http.server.response.body.size";

  /** Unit of the {@code http.server.response.body.size} metric. */
  public static final String HTTP_SERVER_RESPONSE_BODY_SIZE_UNIT = "By";

  /** Description of the {@code http.server.response.body.size} metric. */
  public static final String HTTP_SERVER_RESPONSE_BODY_SIZE_DESCRIPTION =
      "Size of HTTP server response bodies.";

  private HttpIncubatingMetrics() {}
}
