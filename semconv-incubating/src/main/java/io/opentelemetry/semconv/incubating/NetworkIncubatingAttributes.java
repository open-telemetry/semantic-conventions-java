/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
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
   * The state of network connection
   *
   * <p>Notes:
   *
   * <p>Connection states are defined as part of the <a
   * href="https://datatracker.ietf.org/doc/html/rfc9293#section-3.3.2">rfc9293</a>
   */
  public static final AttributeKey<String> NETWORK_CONNECTION_STATE =
      stringKey("network.connection.state");

  /**
   * This describes more details regarding the connection.type. It may be the type of cell
   * technology connection, but it could be used for describing details about a Wi-Fi connection.
   */
  public static final AttributeKey<String> NETWORK_CONNECTION_SUBTYPE =
      stringKey("network.connection.subtype");

  /** The internet connection type. */
  public static final AttributeKey<String> NETWORK_CONNECTION_TYPE =
      stringKey("network.connection.type");

  /** The network interface name. */
  public static final AttributeKey<String> NETWORK_INTERFACE_NAME =
      stringKey("network.interface.name");

  /**
   * The direction of traffic from the perspective of the observing host's physical or virtual
   * network interface. It should not be used to represent the logical direction of a stateful
   * connection or network flow.
   */
  public static final AttributeKey<String> NETWORK_IO_DIRECTION = stringKey("network.io.direction");

  /**
   * Local address of the network connection - IP address or UNIX domain socket name.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_LOCAL_ADDRESS} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> NETWORK_LOCAL_ADDRESS =
      stringKey("network.local.address");

  /**
   * The <a href="https://www.iana.org/assignments/as-numbers/as-numbers.xhtml">Autonomous System
   * Number (ASN)</a> associated with the local IP address.
   *
   * <p>Notes:
   *
   * <p>This attribute SHOULD only be set when the local address is an IP address and the ASN is
   * available from routing, enrichment, or lookup data. The value SHOULD be represented as an
   * integer without the {@code AS} prefix.
   */
  public static final AttributeKey<Long> NETWORK_LOCAL_AS_NUMBER =
      longKey("network.local.as.number");

  /**
   * The name of the organization associated with the autonomous system of the local IP address.
   *
   * <p>Notes:
   *
   * <p>This attribute SHOULD only be set when {@code network.local.as.number} is set and the
   * organization name is available. The value SHOULD be the organization name as provided by the
   * lookup or enrichment source, not the AS name or short code.
   */
  public static final AttributeKey<String> NETWORK_LOCAL_AS_ORGANIZATION =
      stringKey("network.local.as.organization");

  /**
   * Local Media Access Control (MAC) address of the network connection.
   *
   * <p>Notes:
   *
   * <p>MAC addresses MUST be represented in <a
   * href="https://standards.ieee.org/wp-content/uploads/import/documents/tutorials/eui.pdf">IEEE RA
   * hexadecimal form</a>: as hyphen-separated octets in uppercase hexadecimal form from most to
   * least significant.
   *
   * <blockquote>
   * [!WARNING]
   *
   * <p>This attribute may contain sensitive (PII) information.
   * </blockquote>
   */
  public static final AttributeKey<String> NETWORK_LOCAL_MAC_ADDRESS =
      stringKey("network.local.mac.address");

  /**
   * Local port number of the network connection.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_LOCAL_PORT} attribute.
   */
  @Deprecated
  public static final AttributeKey<Long> NETWORK_LOCAL_PORT = longKey("network.local.port");

  /**
   * The IP prefix associated with the local IP address, in CIDR notation.
   *
   * <p>Notes:
   *
   * <blockquote>
   * [!WARNING]
   *
   * <p>This attribute may contain sensitive (PII) information. A {@code /32} IPv4 prefix or {@code
   * /128} IPv6 prefix preserves the complete endpoint IP address. Using CIDR notation does not
   * guarantee that the data is anonymous.
   * </blockquote>
   *
   * <p>The value MUST be an IPv4 or IPv6 network prefix in CIDR notation, as defined in <a
   * href="https://www.rfc-editor.org/rfc/rfc4632.html">RFC 4632</a> for IPv4 and <a
   * href="https://www.rfc-editor.org/rfc/rfc4291.html#section-2.3">RFC 4291</a> for IPv6. IPv4
   * prefixes MUST use a dotted-decimal address followed by {@code /} and a decimal prefix length
   * from 0 to 32. IPv6 prefixes MUST use the canonical address text representation defined in <a
   * href="https://www.rfc-editor.org/rfc/rfc5952.html">RFC 5952</a>, followed by {@code /} and a
   * decimal prefix length from 0 to 128. All host bits in the address MUST be set to zero. The
   * value MUST NOT contain a domain name, UNIX domain socket name, or IPv6 zone identifier.
   *
   * <p>Instrumentation or Collector receivers that populate this attribute MUST convert native
   * representations, such as an address and subnet mask or an address and prefix length, to
   * equivalent CIDR notation before emitting it.
   *
   * <p>This attribute MAY be set whether or not {@code network.local.address} is set. If {@code
   * network.local.address} is also set to an IP address, it MUST use the same IP version and be
   * contained in this prefix.
   */
  public static final AttributeKey<String> NETWORK_LOCAL_PREFIX = stringKey("network.local.prefix");

  /**
   * Peer address of the network connection - IP address or UNIX domain socket name.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_PEER_ADDRESS} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> NETWORK_PEER_ADDRESS = stringKey("network.peer.address");

  /**
   * The <a href="https://www.iana.org/assignments/as-numbers/as-numbers.xhtml">Autonomous System
   * Number (ASN)</a> associated with the peer IP address.
   *
   * <p>Notes:
   *
   * <p>This attribute SHOULD only be set when the peer address is an IP address and the ASN is
   * available from routing, enrichment, or lookup data. The value SHOULD be represented as an
   * integer without the {@code AS} prefix.
   */
  public static final AttributeKey<Long> NETWORK_PEER_AS_NUMBER = longKey("network.peer.as.number");

  /**
   * The name of the organization associated with the autonomous system of the peer IP address.
   *
   * <p>Notes:
   *
   * <p>This attribute SHOULD only be set when {@code network.peer.as.number} is set and the
   * organization name is available. The value SHOULD be the organization name as provided by the
   * lookup or enrichment source, not the AS name or short code.
   */
  public static final AttributeKey<String> NETWORK_PEER_AS_ORGANIZATION =
      stringKey("network.peer.as.organization");

  /**
   * Peer Media Access Control (MAC) address of the network connection.
   *
   * <p>Notes:
   *
   * <p>MAC addresses MUST be represented in <a
   * href="https://standards.ieee.org/wp-content/uploads/import/documents/tutorials/eui.pdf">IEEE RA
   * hexadecimal form</a>: as hyphen-separated octets in uppercase hexadecimal form from most to
   * least significant.
   *
   * <blockquote>
   * [!WARNING]
   *
   * <p>This attribute may contain sensitive (PII) information.
   * </blockquote>
   */
  public static final AttributeKey<String> NETWORK_PEER_MAC_ADDRESS =
      stringKey("network.peer.mac.address");

  /**
   * Peer port number of the network connection.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_PEER_PORT} attribute.
   */
  @Deprecated
  public static final AttributeKey<Long> NETWORK_PEER_PORT = longKey("network.peer.port");

  /**
   * The IP prefix associated with the peer IP address, in CIDR notation.
   *
   * <p>Notes:
   *
   * <blockquote>
   * [!WARNING]
   *
   * <p>This attribute may contain sensitive (PII) information. A {@code /32} IPv4 prefix or {@code
   * /128} IPv6 prefix preserves the complete endpoint IP address. Using CIDR notation does not
   * guarantee that the data is anonymous.
   * </blockquote>
   *
   * <p>The value MUST be an IPv4 or IPv6 network prefix in CIDR notation, as defined in <a
   * href="https://www.rfc-editor.org/rfc/rfc4632.html">RFC 4632</a> for IPv4 and <a
   * href="https://www.rfc-editor.org/rfc/rfc4291.html#section-2.3">RFC 4291</a> for IPv6. IPv4
   * prefixes MUST use a dotted-decimal address followed by {@code /} and a decimal prefix length
   * from 0 to 32. IPv6 prefixes MUST use the canonical address text representation defined in <a
   * href="https://www.rfc-editor.org/rfc/rfc5952.html">RFC 5952</a>, followed by {@code /} and a
   * decimal prefix length from 0 to 128. All host bits in the address MUST be set to zero. The
   * value MUST NOT contain a domain name, UNIX domain socket name, or IPv6 zone identifier.
   *
   * <p>Instrumentation or Collector receivers that populate this attribute MUST convert native
   * representations, such as an address and subnet mask or an address and prefix length, to
   * equivalent CIDR notation before emitting it.
   *
   * <p>This attribute MAY be set whether or not {@code network.peer.address} is set. If {@code
   * network.peer.address} is also set to an IP address, it MUST use the same IP version and be
   * contained in this prefix.
   */
  public static final AttributeKey<String> NETWORK_PEER_PREFIX = stringKey("network.peer.prefix");

  /**
   * <a href="https://wikipedia.org/wiki/Application_layer">OSI application layer</a> or non-OSI
   * equivalent.
   *
   * <p>Notes:
   *
   * <p>The value SHOULD be normalized to lowercase.
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
   * <p>If protocol version is subject to negotiation (for example using <a
   * href="https://www.rfc-editor.org/rfc/rfc7301.html">ALPN</a>), this attribute SHOULD be set to
   * the negotiated version. If the actual protocol version is not known, this attribute SHOULD NOT
   * be set.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_PROTOCOL_VERSION} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> NETWORK_PROTOCOL_VERSION =
      stringKey("network.protocol.version");

  /**
   * <a href="https://wikipedia.org/wiki/Transport_layer">OSI transport layer</a> or <a
   * href="https://wikipedia.org/wiki/Inter-process_communication">inter-process communication
   * method</a>.
   *
   * <p>Notes:
   *
   * <p>The value SHOULD be normalized to lowercase.
   *
   * <p>Consider always setting the transport when setting a port number, since a port number is
   * ambiguous without knowing the transport. For example different processes could be listening on
   * TCP port 12345 and UDP port 12345.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_TRANSPORT} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> NETWORK_TRANSPORT = stringKey("network.transport");

  /**
   * <a href="https://wikipedia.org/wiki/Network_layer">OSI network layer</a> or non-OSI equivalent.
   *
   * <p>Notes:
   *
   * <p>The value SHOULD be normalized to lowercase.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes#NETWORK_TYPE} attribute.
   */
  @Deprecated public static final AttributeKey<String> NETWORK_TYPE = stringKey("network.type");

  // Enum definitions

  /** Values for {@link #NETWORK_CONNECTION_STATE}. */
  public static final class NetworkConnectionStateIncubatingValues {
    /** closed. */
    public static final String CLOSED = "closed";

    /** close_wait. */
    public static final String CLOSE_WAIT = "close_wait";

    /** closing. */
    public static final String CLOSING = "closing";

    /** established. */
    public static final String ESTABLISHED = "established";

    /** fin_wait_1. */
    public static final String FIN_WAIT_1 = "fin_wait_1";

    /** fin_wait_2. */
    public static final String FIN_WAIT_2 = "fin_wait_2";

    /** last_ack. */
    public static final String LAST_ACK = "last_ack";

    /** listen. */
    public static final String LISTEN = "listen";

    /** syn_received. */
    public static final String SYN_RECEIVED = "syn_received";

    /** syn_sent. */
    public static final String SYN_SENT = "syn_sent";

    /** time_wait. */
    public static final String TIME_WAIT = "time_wait";

    private NetworkConnectionStateIncubatingValues() {}
  }

  /** Values for {@link #NETWORK_CONNECTION_SUBTYPE}. */
  public static final class NetworkConnectionSubtypeIncubatingValues {
    /** GPRS */
    public static final String GPRS = "gprs";

    /** EDGE */
    public static final String EDGE = "edge";

    /** UMTS */
    public static final String UMTS = "umts";

    /** CDMA */
    public static final String CDMA = "cdma";

    /** EVDO Rel. 0 */
    public static final String EVDO_0 = "evdo_0";

    /** EVDO Rev. A */
    public static final String EVDO_A = "evdo_a";

    /** CDMA2000 1XRTT */
    public static final String CDMA2000_1XRTT = "cdma2000_1xrtt";

    /** HSDPA */
    public static final String HSDPA = "hsdpa";

    /** HSUPA */
    public static final String HSUPA = "hsupa";

    /** HSPA */
    public static final String HSPA = "hspa";

    /** IDEN */
    public static final String IDEN = "iden";

    /** EVDO Rev. B */
    public static final String EVDO_B = "evdo_b";

    /** LTE */
    public static final String LTE = "lte";

    /** EHRPD */
    public static final String EHRPD = "ehrpd";

    /** HSPAP */
    public static final String HSPAP = "hspap";

    /** GSM */
    public static final String GSM = "gsm";

    /** TD-SCDMA */
    public static final String TD_SCDMA = "td_scdma";

    /** IWLAN */
    public static final String IWLAN = "iwlan";

    /** 5G NR (New Radio) */
    public static final String NR = "nr";

    /** 5G NRNSA (New Radio Non-Standalone) */
    public static final String NRNSA = "nrnsa";

    /** LTE CA */
    public static final String LTE_CA = "lte_ca";

    private NetworkConnectionSubtypeIncubatingValues() {}
  }

  /** Values for {@link #NETWORK_CONNECTION_TYPE}. */
  public static final class NetworkConnectionTypeIncubatingValues {
    /** Wi-Fi */
    public static final String WIFI = "wifi";

    /** wired. */
    public static final String WIRED = "wired";

    /** cell. */
    public static final String CELL = "cell";

    /** unavailable. */
    public static final String UNAVAILABLE = "unavailable";

    /** unknown. */
    public static final String UNKNOWN = "unknown";

    private NetworkConnectionTypeIncubatingValues() {}
  }

  /** Values for {@link #NETWORK_IO_DIRECTION}. */
  public static final class NetworkIoDirectionIncubatingValues {
    /** transmit. */
    public static final String TRANSMIT = "transmit";

    /** receive. */
    public static final String RECEIVE = "receive";

    private NetworkIoDirectionIncubatingValues() {}
  }

  /**
   * Values for {@link #NETWORK_TRANSPORT}.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes.NetworkTransportValues}.
   */
  @Deprecated
  public static final class NetworkTransportIncubatingValues {
    /** TCP */
    public static final String TCP = "tcp";

    /** UDP */
    public static final String UDP = "udp";

    /** Named or anonymous pipe. */
    public static final String PIPE = "pipe";

    /** UNIX domain socket */
    public static final String UNIX = "unix";

    /** QUIC */
    public static final String QUIC = "quic";

    private NetworkTransportIncubatingValues() {}
  }

  /**
   * Values for {@link #NETWORK_TYPE}.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.NetworkAttributes.NetworkTypeValues}.
   */
  @Deprecated
  public static final class NetworkTypeIncubatingValues {
    /** IPv4 */
    public static final String IPV4 = "ipv4";

    /** IPv6 */
    public static final String IPV6 = "ipv6";

    private NetworkTypeIncubatingValues() {}
  }

  private NetworkIncubatingAttributes() {}
}
