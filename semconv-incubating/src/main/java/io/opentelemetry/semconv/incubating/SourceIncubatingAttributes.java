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
public final class SourceIncubatingAttributes {
  /**
   * Source address as observed at the point of instrumentation - typically an IP address, or a UNIX
   * domain socket name; a domain name only when the sender was addressed by name (for example a
   * peer-to-peer node dialed by hostname), never obtained via reverse DNS lookup.
   *
   * <p>Notes:
   *
   * <p>{@code source.address} SHOULD be the sender address as observed at the point of
   * instrumentation, for example the source of the packet, flow, or exchange seen on the wire or
   * socket. Instrumentation SHOULD capture the available address and SHOULD NOT try to resolve the
   * address behind intermediaries such as proxies or load balancers, or perform a reverse DNS
   * lookup to obtain a domain name.
   */
  public static final AttributeKey<String> SOURCE_ADDRESS = stringKey("source.address");

  /**
   * The <a href="https://www.iana.org/assignments/as-numbers/as-numbers.xhtml">Autonomous System
   * Number (ASN)</a> associated with the source IP address.
   *
   * <p>Notes:
   *
   * <p>This attribute SHOULD only be set when the source address is an IP address and the ASN is
   * available from routing, enrichment, or lookup data. The value SHOULD be represented as an
   * integer without the {@code AS} prefix.
   */
  public static final AttributeKey<Long> SOURCE_AS_NUMBER = longKey("source.as.number");

  /**
   * The name of the organization associated with the autonomous system of the source IP address.
   *
   * <p>Notes:
   *
   * <p>This attribute SHOULD only be set when {@code source.as.number} is set and the organization
   * name is available. The value SHOULD be the organization name as provided by the lookup or
   * enrichment source, not the AS name or short code.
   */
  public static final AttributeKey<String> SOURCE_AS_ORGANIZATION =
      stringKey("source.as.organization");

  /**
   * Source Media Access Control (MAC) address.
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
  public static final AttributeKey<String> SOURCE_MAC_ADDRESS = stringKey("source.mac.address");

  /** Source port number */
  public static final AttributeKey<Long> SOURCE_PORT = longKey("source.port");

  /**
   * The IP prefix associated with the source IP address, in CIDR notation.
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
   * <p>This attribute MAY be set whether or not {@code source.address} is set. If {@code
   * source.address} is also set to an IP address, it MUST use the same IP version and be contained
   * in this prefix.
   */
  public static final AttributeKey<String> SOURCE_PREFIX = stringKey("source.prefix");

  // Enum definitions

  private SourceIncubatingAttributes() {}
}
