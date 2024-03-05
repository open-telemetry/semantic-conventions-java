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
public final class NetIncubatingAttributes {
  /** Deprecated, use {@code server.address}. */
  public static final AttributeKey<String> NET_HOST_NAME = stringKey("net.host.name");

  /** Deprecated, use {@code server.port}. */
  public static final AttributeKey<Long> NET_HOST_PORT = longKey("net.host.port");

  /**
   * Deprecated, use {@code server.address} on client spans and {@code client.address} on server
   * spans.
   */
  public static final AttributeKey<String> NET_PEER_NAME = stringKey("net.peer.name");

  /**
   * Deprecated, use {@code server.port} on client spans and {@code client.port} on server spans.
   */
  public static final AttributeKey<Long> NET_PEER_PORT = longKey("net.peer.port");

  /** Deprecated, use {@code network.protocol.name}. */
  public static final AttributeKey<String> NET_PROTOCOL_NAME = stringKey("net.protocol.name");

  /** Deprecated, use {@code network.protocol.version}. */
  public static final AttributeKey<String> NET_PROTOCOL_VERSION = stringKey("net.protocol.version");

  /** Deprecated, use {@code network.transport} and {@code network.type}. */
  public static final AttributeKey<String> NET_SOCK_FAMILY = stringKey("net.sock.family");

  /** Deprecated, use {@code network.local.address}. */
  public static final AttributeKey<String> NET_SOCK_HOST_ADDR = stringKey("net.sock.host.addr");

  /** Deprecated, use {@code network.local.port}. */
  public static final AttributeKey<Long> NET_SOCK_HOST_PORT = longKey("net.sock.host.port");

  /** Deprecated, use {@code network.peer.address}. */
  public static final AttributeKey<String> NET_SOCK_PEER_ADDR = stringKey("net.sock.peer.addr");

  /** Deprecated, no replacement at this time. */
  public static final AttributeKey<String> NET_SOCK_PEER_NAME = stringKey("net.sock.peer.name");

  /** Deprecated, use {@code network.peer.port}. */
  public static final AttributeKey<Long> NET_SOCK_PEER_PORT = longKey("net.sock.peer.port");

  /** Deprecated, use {@code network.transport}. */
  public static final AttributeKey<String> NET_TRANSPORT = stringKey("net.transport");

  // Enum definitions
  public static final class NetSockFamilyValues {
    /** IPv4 address. */
    public static final String INET = "inet";

    /** IPv6 address. */
    public static final String INET6 = "inet6";

    /** Unix domain socket path. */
    public static final String UNIX = "unix";

    private NetSockFamilyValues() {}
  }

  public static final class NetTransportValues {
    /** ip_tcp. */
    public static final String IP_TCP = "ip_tcp";

    /** ip_udp. */
    public static final String IP_UDP = "ip_udp";

    /** Named or anonymous pipe. */
    public static final String PIPE = "pipe";

    /** In-process communication. */
    public static final String INPROC = "inproc";

    /** Something else (non IP-based). */
    public static final String OTHER = "other";

    private NetTransportValues() {}
  }

  private NetIncubatingAttributes() {}
}
