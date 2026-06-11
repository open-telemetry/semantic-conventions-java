/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEvents.java.j2
@SuppressWarnings("unused")
public final class RpcIncubatingEvents {
  /**
   * This event represents an exception that occurred during an outgoing RPC call, such as network
   * failures, timeouts, serialization errors, or other errors that prevent the call from completing
   * successfully.
   *
   * <p>Notes:
   *
   * <p>This event SHOULD be recorded when an exception occurs during RPC client call operations.
   * Instrumentations SHOULD set the severity to WARN (severity number 13) when recording this
   * event. Instrumentations MAY provide a configuration option to populate exception events with
   * the attributes captured on the corresponding RPC client span.
   */
  public static final String RPC_CLIENT_CALL_EXCEPTION = "rpc.client.call.exception";

  /**
   * Describes a message sent or received within the context of an RPC call.
   *
   * <p>Notes:
   *
   * <p>In the lifetime of an RPC stream, an event for each message sent/received on client and
   * server spans SHOULD be created. In case of unary calls message events SHOULD NOT be recorded.
   *
   * @deprecated Deprecated, no replacement at this time.
   */
  @Deprecated public static final String RPC_MESSAGE = "rpc.message";

  /**
   * This event represents an exception that occurred during incoming RPC call processing, such as
   * application errors, internal failures, or other exceptions that prevent the server from
   * successfully handling the call.
   *
   * <p>Notes:
   *
   * <p>This event SHOULD be recorded when an exception occurs during RPC server call processing.
   * Instrumentations SHOULD set the severity to ERROR (severity number 17) when recording this
   * event. Instrumentations MAY provide a configuration option to populate exception events with
   * the attributes captured on the corresponding RPC server span.
   */
  public static final String RPC_SERVER_CALL_EXCEPTION = "rpc.server.call.exception";

  private RpcIncubatingEvents() {}
}
