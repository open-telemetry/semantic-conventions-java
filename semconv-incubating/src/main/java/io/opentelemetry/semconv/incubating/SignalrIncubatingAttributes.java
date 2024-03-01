/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class SignalrIncubatingAttributes {

  /** SignalR HTTP connection closure status. */
  public static final AttributeKey<String> SIGNALR_CONNECTION_STATUS =
      stringKey("signalr.connection.status");

  /**
   * <a
   * href="https://github.com/dotnet/aspnetcore/blob/main/src/SignalR/docs/specs/TransportProtocols.md">SignalR
   * transport type</a>
   */
  public static final AttributeKey<String> SIGNALR_TRANSPORT = stringKey("signalr.transport");

  // Enum definitions
  public static final class SignalrConnectionStatusValues {
    /** The connection was closed normally. */
    public static final String NORMAL_CLOSURE = "normal_closure";

    /** The connection was closed due to a timeout. */
    public static final String TIMEOUT = "timeout";

    /** The connection was closed because the app is shutting down. */
    public static final String APP_SHUTDOWN = "app_shutdown";

    private SignalrConnectionStatusValues() {}
  }

  public static final class SignalrTransportValues {
    /** ServerSentEvents protocol. */
    public static final String SERVER_SENT_EVENTS = "server_sent_events";

    /** LongPolling protocol. */
    public static final String LONG_POLLING = "long_polling";

    /** WebSockets protocol. */
    public static final String WEB_SOCKETS = "web_sockets";

    private SignalrTransportValues() {}
  }

  private SignalrIncubatingAttributes() {}
}
