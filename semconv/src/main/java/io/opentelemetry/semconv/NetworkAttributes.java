/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/java/SemanticAttributes.java.j2
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
   * [OSI application layer](https://osi-model.com/application-layer/) or non-OSI equivalent.
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
   * The actual version of the protocol used for network communication.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>If protocol version is subject to negotiation (for example using
   *       [ALPN](https://www.rfc-editor.org/rfc/rfc7301.html)), this attribute SHOULD be set to the
   *       negotiated version. If the actual protocol version is not known, this attribute SHOULD
   *       NOT be set.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_PROTOCOL_VERSION =
      stringKey("network.protocol.version");

  /**
   * [OSI transport layer](https://osi-model.com/transport-layer/) or [inter-process communication
   * method](https://wikipedia.org/wiki/Inter-process_communication).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value SHOULD be normalized to lowercase.
   *       <p>Consider always setting the transport when setting a port number, since a port number
   *       is ambiguous without knowing the transport. For example different processes could be
   *       listening on TCP port 12345 and UDP port 12345.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_TRANSPORT = stringKey("network.transport");

  /**
   * [OSI network layer](https://osi-model.com/network-layer/) or non-OSI equivalent.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value SHOULD be normalized to lowercase.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_TYPE = stringKey("network.type");

  // Enum definitions
  /** Values for {@link #NETWORK_TRANSPORT}. */
  public static final class NetworkTransportValues {

    /** TCP */
    public static final String TCP = "tcp";

    /** UDP */
    public static final String UDP = "udp";

    /** Named or anonymous pipe. */
    public static final String PIPE = "pipe";

    /** Unix domain socket */
    public static final String UNIX = "unix";

    private NetworkTransportValues() {}
  }

  // Enum definitions
  /** Values for {@link #NETWORK_TYPE}. */
  public static final class NetworkTypeValues {

    /** IPv4 */
    public static final String IPV_4 = "ipv4";

    /** IPv6 */
    public static final String IPV_6 = "ipv6";

    private NetworkTypeValues() {}
  }

  private NetworkAttributes() {}
}
