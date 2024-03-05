/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class NetworkAttributes {
  /** Local address of the network connection - IP address or Unix domain socket name. */
  public static final AttributeKey<String> NETWORK_LOCAL_ADDRESS =
      stringKey("network.local.address");

  /** Local port number of the network connection. */
  public static final AttributeKey<Long> NETWORK_LOCAL_PORT = longKey("network.local.port");

  /** Peer address of the network connection - IP address or Unix domain socket name. */
  public static final AttributeKey<String> NETWORK_PEER_ADDRESS = stringKey("network.peer.address");

  /** Peer port number of the network connection. */
  public static final AttributeKey<Long> NETWORK_PEER_PORT = longKey("network.peer.port");

  /**
   * <a href="https://osi-model.com/application-layer/">OSI application layer</a> or non-OSI
   * equivalent.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value SHOULD be normalized to lowercase.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_PROTOCOL_NAME =
      stringKey("network.protocol.name");

  /**
   * Version of the protocol specified in {@code network.protocol.name}.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>{@code network.protocol.version} refers to the version of the protocol used and might be
   *       different from the protocol client's version. If the HTTP client has a version of {@code
   *       0.27.2}, but sends HTTP version {@code 1.1}, this attribute should be set to {@code 1.1}.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_PROTOCOL_VERSION =
      stringKey("network.protocol.version");

  /**
   * <a href="https://osi-model.com/transport-layer/">OSI transport layer</a> or <a
   * href="https://wikipedia.org/wiki/Inter-process_communication">inter-process communication
   * method</a>.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value SHOULD be normalized to lowercase.
   *   <li>Consider always setting the transport when setting a port number, since a port number is
   *       ambiguous without knowing the transport. For example different processes could be
   *       listening on TCP port 12345 and UDP port 12345.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_TRANSPORT = stringKey("network.transport");

  /**
   * <a href="https://osi-model.com/network-layer/">OSI network layer</a> or non-OSI equivalent.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value SHOULD be normalized to lowercase.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_TYPE = stringKey("network.type");

  // Enum definitions
  public static final class NetworkTransportValues {
    /** TCP. */
    public static final String TCP = "tcp";

    /** UDP. */
    public static final String UDP = "udp";

    /** Named or anonymous pipe. */
    public static final String PIPE = "pipe";

    /** Unix domain socket. */
    public static final String UNIX = "unix";

    private NetworkTransportValues() {}
  }

  public static final class NetworkTypeValues {
    /** IPv4. */
    public static final String IPV4 = "ipv4";

    /** IPv6. */
    public static final String IPV6 = "ipv6";

    private NetworkTypeValues() {}
  }

  private NetworkAttributes() {}
}
