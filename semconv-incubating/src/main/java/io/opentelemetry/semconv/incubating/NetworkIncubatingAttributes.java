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
public final class NetworkIncubatingAttributes {

  /** The ISO 3166-1 alpha-2 2-character country code associated with the mobile carrier network. */
  public static final AttributeKey<String> NETWORK_CARRIER_ICC = stringKey("network.carrier.icc");

  /** The mobile carrier country code. */
  public static final AttributeKey<String> NETWORK_CARRIER_MCC = stringKey("network.carrier.mcc");

  /** The mobile carrier network code. */
  public static final AttributeKey<String> NETWORK_CARRIER_MNC = stringKey("network.carrier.mnc");

  /** The name of the mobile carrier. */
  public static final AttributeKey<String> NETWORK_CARRIER_NAME = stringKey("network.carrier.name");

  /**
   * This describes more details regarding the connection.type. It may be the type of cell
   * technology connection, but it could be used for describing details about a wifi connection.
   */
  public static final AttributeKey<String> NETWORK_CONNECTION_SUBTYPE =
      stringKey("network.connection.subtype");

  /** The internet connection type. */
  public static final AttributeKey<String> NETWORK_CONNECTION_TYPE =
      stringKey("network.connection.type");

  /** The network IO operation direction. */
  public static final AttributeKey<String> NETWORK_IO_DIRECTION = stringKey("network.io.direction");

  /**
   * Local address of the network connection - IP address or Unix domain socket name.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_LOCAL_ADDRESS} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> NETWORK_LOCAL_ADDRESS =
      stringKey("network.local.address");

  /**
   * Local port number of the network connection.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_LOCAL_PORT} attribute.
   */
  @Deprecated
  public static final AttributeKey<Long> NETWORK_LOCAL_PORT = longKey("network.local.port");

  /**
   * Peer address of the network connection - IP address or Unix domain socket name.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_PEER_ADDRESS} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> NETWORK_PEER_ADDRESS = stringKey("network.peer.address");

  /**
   * Peer port number of the network connection.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_PEER_PORT} attribute.
   */
  @Deprecated
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
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_PROTOCOL_NAME} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> NETWORK_PROTOCOL_NAME =
      stringKey("network.protocol.name");

  /**
   * The actual version of the protocol used for network communication.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>If protocol version is subject to negotiation (for example using <a
   *       href="https://www.rfc-editor.org/rfc/rfc7301.html">ALPN</a>), this attribute SHOULD be
   *       set to the negotiated version. If the actual protocol version is not known, this
   *       attribute SHOULD NOT be set.
   * </ul>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_PROTOCOL_VERSION} attribute.
   */
  @Deprecated
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
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_TRANSPORT} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> NETWORK_TRANSPORT = stringKey("network.transport");

  /**
   * <a href="https://osi-model.com/network-layer/">OSI network layer</a> or non-OSI equivalent.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value SHOULD be normalized to lowercase.
   * </ul>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_TYPE} attribute.
   */
  @Deprecated public static final AttributeKey<String> NETWORK_TYPE = stringKey("network.type");

  // Enum definitions
  /** Values for {@link #NETWORK_CONNECTION_SUBTYPE}. */
  public static final class NetworkConnectionSubtypeValues {
    /** GPRS. */
    public static final String GPRS = "gprs";

    /** EDGE. */
    public static final String EDGE = "edge";

    /** UMTS. */
    public static final String UMTS = "umts";

    /** CDMA. */
    public static final String CDMA = "cdma";

    /** EVDO Rel. 0. */
    public static final String EVDO_0 = "evdo_0";

    /** EVDO Rev. A. */
    public static final String EVDO_A = "evdo_a";

    /** CDMA2000 1XRTT. */
    public static final String CDMA2000_1XRTT = "cdma2000_1xrtt";

    /** HSDPA. */
    public static final String HSDPA = "hsdpa";

    /** HSUPA. */
    public static final String HSUPA = "hsupa";

    /** HSPA. */
    public static final String HSPA = "hspa";

    /** IDEN. */
    public static final String IDEN = "iden";

    /** EVDO Rev. B. */
    public static final String EVDO_B = "evdo_b";

    /** LTE. */
    public static final String LTE = "lte";

    /** EHRPD. */
    public static final String EHRPD = "ehrpd";

    /** HSPAP. */
    public static final String HSPAP = "hspap";

    /** GSM. */
    public static final String GSM = "gsm";

    /** TD-SCDMA. */
    public static final String TD_SCDMA = "td_scdma";

    /** IWLAN. */
    public static final String IWLAN = "iwlan";

    /** 5G NR (New Radio). */
    public static final String NR = "nr";

    /** 5G NRNSA (New Radio Non-Standalone). */
    public static final String NRNSA = "nrnsa";

    /** LTE CA. */
    public static final String LTE_CA = "lte_ca";

    private NetworkConnectionSubtypeValues() {}
  }

  /** Values for {@link #NETWORK_CONNECTION_TYPE}. */
  public static final class NetworkConnectionTypeValues {
    /** wifi. */
    public static final String WIFI = "wifi";

    /** wired. */
    public static final String WIRED = "wired";

    /** cell. */
    public static final String CELL = "cell";

    /** unavailable. */
    public static final String UNAVAILABLE = "unavailable";

    /** unknown. */
    public static final String UNKNOWN = "unknown";

    private NetworkConnectionTypeValues() {}
  }

  /** Values for {@link #NETWORK_IO_DIRECTION}. */
  public static final class NetworkIoDirectionValues {
    /** transmit. */
    public static final String TRANSMIT = "transmit";

    /** receive. */
    public static final String RECEIVE = "receive";

    private NetworkIoDirectionValues() {}
  }

  /**
   * Values for {@link #NETWORK_TRANSPORT}.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes.NetworkTransportValues} attribute.
   */
  @Deprecated
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

  /**
   * Values for {@link #NETWORK_TYPE}.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes.NetworkTypeValues} attribute.
   */
  @Deprecated
  public static final class NetworkTypeValues {
    /** IPv4. */
    public static final String IPV4 = "ipv4";

    /** IPv6. */
    public static final String IPV6 = "ipv6";

    private NetworkTypeValues() {}
  }

  private NetworkIncubatingAttributes() {}
}
