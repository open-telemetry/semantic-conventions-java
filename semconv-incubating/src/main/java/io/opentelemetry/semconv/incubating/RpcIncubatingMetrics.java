/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class RpcIncubatingMetrics {
  /** Name of the {@code rpc.client.call.duration} metric. */
  public static final String RPC_CLIENT_CALL_DURATION_NAME = "rpc.client.call.duration";

  /** Unit of the {@code rpc.client.call.duration} metric. */
  public static final String RPC_CLIENT_CALL_DURATION_UNIT = "s";

  /** Description of the {@code rpc.client.call.duration} metric. */
  public static final String RPC_CLIENT_CALL_DURATION_DESCRIPTION =
      "Measures the duration of an outgoing Remote Procedure Call (RPC).";

  /**
   * Name of the {@code rpc.client.duration} metric.
   *
   * @deprecated Replaced by {@code rpc.client.call.duration} with unit {@code s}.
   */
  @Deprecated public static final String RPC_CLIENT_DURATION_NAME = "rpc.client.duration";

  /**
   * Unit of the {@code rpc.client.duration} metric.
   *
   * @deprecated Replaced by {@code rpc.client.call.duration} with unit {@code s}.
   */
  @Deprecated public static final String RPC_CLIENT_DURATION_UNIT = "ms";

  /**
   * Description of the {@code rpc.client.duration} metric.
   *
   * @deprecated Replaced by {@code rpc.client.call.duration} with unit {@code s}.
   */
  @Deprecated
  public static final String RPC_CLIENT_DURATION_DESCRIPTION =
      "Deprecated, use `rpc.client.call.duration` instead. Note: the unit also changed from `ms` to `s`.";

  /**
   * Name of the {@code rpc.client.request.size} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final String RPC_CLIENT_REQUEST_SIZE_NAME = "rpc.client.request.size";

  /**
   * Unit of the {@code rpc.client.request.size} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final String RPC_CLIENT_REQUEST_SIZE_UNIT = "By";

  /**
   * Description of the {@code rpc.client.request.size} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final String RPC_CLIENT_REQUEST_SIZE_DESCRIPTION =
      "Measures the size of RPC request messages (uncompressed).";

  /**
   * Name of the {@code rpc.client.requests_per_rpc} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final String RPC_CLIENT_REQUESTS_PER_RPC_NAME = "rpc.client.requests_per_rpc";

  /**
   * Unit of the {@code rpc.client.requests_per_rpc} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final String RPC_CLIENT_REQUESTS_PER_RPC_UNIT = "{count}";

  /**
   * Description of the {@code rpc.client.requests_per_rpc} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final String RPC_CLIENT_REQUESTS_PER_RPC_DESCRIPTION =
      "Measures the number of messages received per RPC.";

  /**
   * Name of the {@code rpc.client.response.size} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final String RPC_CLIENT_RESPONSE_SIZE_NAME = "rpc.client.response.size";

  /**
   * Unit of the {@code rpc.client.response.size} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final String RPC_CLIENT_RESPONSE_SIZE_UNIT = "By";

  /**
   * Description of the {@code rpc.client.response.size} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final String RPC_CLIENT_RESPONSE_SIZE_DESCRIPTION =
      "Measures the size of RPC response messages (uncompressed).";

  /**
   * Name of the {@code rpc.client.responses_per_rpc} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final String RPC_CLIENT_RESPONSES_PER_RPC_NAME = "rpc.client.responses_per_rpc";

  /**
   * Unit of the {@code rpc.client.responses_per_rpc} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final String RPC_CLIENT_RESPONSES_PER_RPC_UNIT = "{count}";

  /**
   * Description of the {@code rpc.client.responses_per_rpc} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final String RPC_CLIENT_RESPONSES_PER_RPC_DESCRIPTION =
      "Measures the number of messages sent per RPC.";

  /** Name of the {@code rpc.server.call.duration} metric. */
  public static final String RPC_SERVER_CALL_DURATION_NAME = "rpc.server.call.duration";

  /** Unit of the {@code rpc.server.call.duration} metric. */
  public static final String RPC_SERVER_CALL_DURATION_UNIT = "s";

  /** Description of the {@code rpc.server.call.duration} metric. */
  public static final String RPC_SERVER_CALL_DURATION_DESCRIPTION =
      "Measures the duration of an incoming Remote Procedure Call (RPC).";

  /**
   * Name of the {@code rpc.server.duration} metric.
   *
   * @deprecated Replaced by {@code rpc.server.call.duration} with unit {@code s}.
   */
  @Deprecated public static final String RPC_SERVER_DURATION_NAME = "rpc.server.duration";

  /**
   * Unit of the {@code rpc.server.duration} metric.
   *
   * @deprecated Replaced by {@code rpc.server.call.duration} with unit {@code s}.
   */
  @Deprecated public static final String RPC_SERVER_DURATION_UNIT = "ms";

  /**
   * Description of the {@code rpc.server.duration} metric.
   *
   * @deprecated Replaced by {@code rpc.server.call.duration} with unit {@code s}.
   */
  @Deprecated
  public static final String RPC_SERVER_DURATION_DESCRIPTION =
      "Deprecated, use `rpc.server.call.duration` instead. Note: the unit also changed from `ms` to `s`.";

  /**
   * Name of the {@code rpc.server.request.size} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final String RPC_SERVER_REQUEST_SIZE_NAME = "rpc.server.request.size";

  /**
   * Unit of the {@code rpc.server.request.size} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final String RPC_SERVER_REQUEST_SIZE_UNIT = "By";

  /**
   * Description of the {@code rpc.server.request.size} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final String RPC_SERVER_REQUEST_SIZE_DESCRIPTION =
      "Measures the size of RPC request messages (uncompressed).";

  /**
   * Name of the {@code rpc.server.requests_per_rpc} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final String RPC_SERVER_REQUESTS_PER_RPC_NAME = "rpc.server.requests_per_rpc";

  /**
   * Unit of the {@code rpc.server.requests_per_rpc} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final String RPC_SERVER_REQUESTS_PER_RPC_UNIT = "{count}";

  /**
   * Description of the {@code rpc.server.requests_per_rpc} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final String RPC_SERVER_REQUESTS_PER_RPC_DESCRIPTION =
      "Measures the number of messages received per RPC.";

  /**
   * Name of the {@code rpc.server.response.size} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final String RPC_SERVER_RESPONSE_SIZE_NAME = "rpc.server.response.size";

  /**
   * Unit of the {@code rpc.server.response.size} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final String RPC_SERVER_RESPONSE_SIZE_UNIT = "By";

  /**
   * Description of the {@code rpc.server.response.size} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final String RPC_SERVER_RESPONSE_SIZE_DESCRIPTION =
      "Measures the size of RPC response messages (uncompressed).";

  /**
   * Name of the {@code rpc.server.responses_per_rpc} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final String RPC_SERVER_RESPONSES_PER_RPC_NAME = "rpc.server.responses_per_rpc";

  /**
   * Unit of the {@code rpc.server.responses_per_rpc} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final String RPC_SERVER_RESPONSES_PER_RPC_UNIT = "{count}";

  /**
   * Description of the {@code rpc.server.responses_per_rpc} metric.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final String RPC_SERVER_RESPONSES_PER_RPC_DESCRIPTION =
      "Measures the number of messages sent per RPC.";

  private RpcIncubatingMetrics() {}
}
