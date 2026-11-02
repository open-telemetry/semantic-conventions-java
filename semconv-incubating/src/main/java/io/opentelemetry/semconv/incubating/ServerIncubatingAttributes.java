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
public final class ServerIncubatingAttributes {
  /**
   * Server domain name if available without reverse DNS lookup; otherwise, IP address or UNIX
   * domain socket name.
   *
   * <p>Notes:
   *
   * <p>When observed from the client side, and when communicating through an intermediary, {@code
   * server.address} SHOULD represent the server address behind any intermediaries, for example
   * proxies, if it's available.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ServerAttributes#SERVER_ADDRESS} attribute.
   */
  @Deprecated public static final AttributeKey<String> SERVER_ADDRESS = stringKey("server.address");

  /**
   * The <a href="https://www.iana.org/assignments/as-numbers/as-numbers.xhtml">Autonomous System
   * Number (ASN)</a> associated with the server IP address.
   *
   * <p>Notes:
   *
   * <p>This attribute SHOULD only be set when the server address is an IP address and the ASN is
   * available from routing, enrichment, or lookup data. The value SHOULD be represented as an
   * integer without the {@code AS} prefix.
   */
  public static final AttributeKey<Long> SERVER_AS_NUMBER = longKey("server.as.number");

  /**
   * The name of the organization associated with the autonomous system of the server IP address.
   *
   * <p>Notes:
   *
   * <p>This attribute SHOULD only be set when {@code server.as.number} is set and the organization
   * name is available. The value SHOULD be the organization name as provided by the lookup or
   * enrichment source, not the AS name or short code.
   */
  public static final AttributeKey<String> SERVER_AS_ORGANIZATION =
      stringKey("server.as.organization");

  /**
   * Server Media Access Control (MAC) address.
   *
   * <p>Notes:
   *
   * <p>This attribute MUST identify a MAC address associated with the logical server endpoint,
   * including when that endpoint is behind intermediaries. If the server's MAC address is unknown,
   * this attribute MUST NOT be set. The MAC address of a proxy, gateway, or next-hop router MUST
   * NOT be used as a substitute.
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
  public static final AttributeKey<String> SERVER_MAC_ADDRESS = stringKey("server.mac.address");

  /**
   * Server port number.
   *
   * <p>Notes:
   *
   * <p>When observed from the client side, and when communicating through an intermediary, {@code
   * server.port} SHOULD represent the server port behind any intermediaries, for example proxies,
   * if it's available.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ServerAttributes#SERVER_PORT} attribute.
   */
  @Deprecated public static final AttributeKey<Long> SERVER_PORT = longKey("server.port");

  /**
   * The IP prefix associated with the server IP address, in CIDR notation.
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
   * <p>This attribute MUST NOT be set unless {@code server.address} is set to an IPv4 or IPv6
   * address. The address MUST use the same IP version as this prefix and be contained in it.
   */
  public static final AttributeKey<String> SERVER_PREFIX = stringKey("server.prefix");

  /**
   * Logical name of the service acting as the server in a connection-based network interaction.
   *
   * <p>Notes:
   *
   * <p>SHOULD be equal to the actual <a href="/docs/resource/README.md#service">{@code
   * service.name}</a> resource attribute of the logical server, if any. This identifies the server
   * service whether the telemetry is recorded by the client, the server, or another observer.
   */
  public static final AttributeKey<String> SERVER_SERVICE_NAME = stringKey("server.service.name");

  /**
   * Logical namespace of the service acting as the server in a connection-based network
   * interaction.
   *
   * <p>Notes:
   *
   * <p>SHOULD be equal to the actual <a href="/docs/resource/README.md#service">{@code
   * service.namespace}</a> resource attribute of the logical server, if any. This identifies the
   * server service's namespace whether the telemetry is recorded by the client, the server, or
   * another observer. Together with {@code server.service.name}, this identifies the server
   * service. An empty namespace is equivalent to an unspecified namespace.
   */
  public static final AttributeKey<String> SERVER_SERVICE_NAMESPACE =
      stringKey("server.service.namespace");

  // Enum definitions

  private ServerIncubatingAttributes() {}
}
