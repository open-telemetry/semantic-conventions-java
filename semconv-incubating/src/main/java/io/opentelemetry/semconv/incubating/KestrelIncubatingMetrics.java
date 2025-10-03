/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class KestrelIncubatingMetrics {
  /**
   * Name of the {@code kestrel.active_connections} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_ACTIVE_CONNECTIONS_NAME} constant.
   */
  @Deprecated
  public static final String KESTREL_ACTIVE_CONNECTIONS_NAME = "kestrel.active_connections";

  /**
   * Unit of the {@code kestrel.active_connections} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_ACTIVE_CONNECTIONS_UNIT} constant.
   */
  @Deprecated public static final String KESTREL_ACTIVE_CONNECTIONS_UNIT = "{connection}";

  /**
   * Description of the {@code kestrel.active_connections} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_ACTIVE_CONNECTIONS_DESCRIPTION} constant.
   */
  @Deprecated
  public static final String KESTREL_ACTIVE_CONNECTIONS_DESCRIPTION =
      "Number of connections that are currently active on the server.";

  /**
   * Name of the {@code kestrel.active_tls_handshakes} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_ACTIVE_TLS_HANDSHAKES_NAME} constant.
   */
  @Deprecated
  public static final String KESTREL_ACTIVE_TLS_HANDSHAKES_NAME = "kestrel.active_tls_handshakes";

  /**
   * Unit of the {@code kestrel.active_tls_handshakes} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_ACTIVE_TLS_HANDSHAKES_UNIT} constant.
   */
  @Deprecated public static final String KESTREL_ACTIVE_TLS_HANDSHAKES_UNIT = "{handshake}";

  /**
   * Description of the {@code kestrel.active_tls_handshakes} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_ACTIVE_TLS_HANDSHAKES_DESCRIPTION}
   *     constant.
   */
  @Deprecated
  public static final String KESTREL_ACTIVE_TLS_HANDSHAKES_DESCRIPTION =
      "Number of TLS handshakes that are currently in progress on the server.";

  /**
   * Name of the {@code kestrel.connection.duration} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_CONNECTION_DURATION_NAME} constant.
   */
  @Deprecated
  public static final String KESTREL_CONNECTION_DURATION_NAME = "kestrel.connection.duration";

  /**
   * Unit of the {@code kestrel.connection.duration} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_CONNECTION_DURATION_UNIT} constant.
   */
  @Deprecated public static final String KESTREL_CONNECTION_DURATION_UNIT = "s";

  /**
   * Description of the {@code kestrel.connection.duration} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_CONNECTION_DURATION_DESCRIPTION} constant.
   */
  @Deprecated
  public static final String KESTREL_CONNECTION_DURATION_DESCRIPTION =
      "The duration of connections on the server.";

  /**
   * Name of the {@code kestrel.queued_connections} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_QUEUED_CONNECTIONS_NAME} constant.
   */
  @Deprecated
  public static final String KESTREL_QUEUED_CONNECTIONS_NAME = "kestrel.queued_connections";

  /**
   * Unit of the {@code kestrel.queued_connections} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_QUEUED_CONNECTIONS_UNIT} constant.
   */
  @Deprecated public static final String KESTREL_QUEUED_CONNECTIONS_UNIT = "{connection}";

  /**
   * Description of the {@code kestrel.queued_connections} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_QUEUED_CONNECTIONS_DESCRIPTION} constant.
   */
  @Deprecated
  public static final String KESTREL_QUEUED_CONNECTIONS_DESCRIPTION =
      "Number of connections that are currently queued and are waiting to start.";

  /**
   * Name of the {@code kestrel.queued_requests} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_QUEUED_REQUESTS_NAME} constant.
   */
  @Deprecated public static final String KESTREL_QUEUED_REQUESTS_NAME = "kestrel.queued_requests";

  /**
   * Unit of the {@code kestrel.queued_requests} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_QUEUED_REQUESTS_UNIT} constant.
   */
  @Deprecated public static final String KESTREL_QUEUED_REQUESTS_UNIT = "{request}";

  /**
   * Description of the {@code kestrel.queued_requests} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_QUEUED_REQUESTS_DESCRIPTION} constant.
   */
  @Deprecated
  public static final String KESTREL_QUEUED_REQUESTS_DESCRIPTION =
      "Number of HTTP requests on multiplexed connections (HTTP/2 and HTTP/3) that are currently queued and are waiting to start.";

  /**
   * Name of the {@code kestrel.rejected_connections} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_REJECTED_CONNECTIONS_NAME} constant.
   */
  @Deprecated
  public static final String KESTREL_REJECTED_CONNECTIONS_NAME = "kestrel.rejected_connections";

  /**
   * Unit of the {@code kestrel.rejected_connections} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_REJECTED_CONNECTIONS_UNIT} constant.
   */
  @Deprecated public static final String KESTREL_REJECTED_CONNECTIONS_UNIT = "{connection}";

  /**
   * Description of the {@code kestrel.rejected_connections} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_REJECTED_CONNECTIONS_DESCRIPTION} constant.
   */
  @Deprecated
  public static final String KESTREL_REJECTED_CONNECTIONS_DESCRIPTION =
      "Number of connections rejected by the server.";

  /**
   * Name of the {@code kestrel.tls_handshake.duration} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_TLS_HANDSHAKE_DURATION_NAME} constant.
   */
  @Deprecated
  public static final String KESTREL_TLS_HANDSHAKE_DURATION_NAME = "kestrel.tls_handshake.duration";

  /**
   * Unit of the {@code kestrel.tls_handshake.duration} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_TLS_HANDSHAKE_DURATION_UNIT} constant.
   */
  @Deprecated public static final String KESTREL_TLS_HANDSHAKE_DURATION_UNIT = "s";

  /**
   * Description of the {@code kestrel.tls_handshake.duration} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_TLS_HANDSHAKE_DURATION_DESCRIPTION}
   *     constant.
   */
  @Deprecated
  public static final String KESTREL_TLS_HANDSHAKE_DURATION_DESCRIPTION =
      "The duration of TLS handshakes on the server.";

  /**
   * Name of the {@code kestrel.upgraded_connections} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_UPGRADED_CONNECTIONS_NAME} constant.
   */
  @Deprecated
  public static final String KESTREL_UPGRADED_CONNECTIONS_NAME = "kestrel.upgraded_connections";

  /**
   * Unit of the {@code kestrel.upgraded_connections} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_UPGRADED_CONNECTIONS_UNIT} constant.
   */
  @Deprecated public static final String KESTREL_UPGRADED_CONNECTIONS_UNIT = "{connection}";

  /**
   * Description of the {@code kestrel.upgraded_connections} metric.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.KestrelMetrics#KESTREL_UPGRADED_CONNECTIONS_DESCRIPTION} constant.
   */
  @Deprecated
  public static final String KESTREL_UPGRADED_CONNECTIONS_DESCRIPTION =
      "Number of connections that are currently upgraded (WebSockets). .";

  private KestrelIncubatingMetrics() {}
}
