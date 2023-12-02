/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_22_0;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.experimental.java.j2
@SuppressWarnings("unused")
public final class NetAttributes {

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

  private NetAttributes() {}
}
