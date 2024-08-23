/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class NetworkIncubatingAttributes {
  /** The ISO 3166-1 alpha-2 2-character country code associated with the mobile carrier network */
  public static final AttributeKey<String> NETWORK_CARRIER_ICC = stringKey("network.carrier.icc");

  /** The mobile carrier country code */
  public static final AttributeKey<String> NETWORK_CARRIER_MCC = stringKey("network.carrier.mcc");

  /** The mobile carrier network code */
  public static final AttributeKey<String> NETWORK_CARRIER_MNC = stringKey("network.carrier.mnc");

  /** The name of the mobile carrier */
  public static final AttributeKey<String> NETWORK_CARRIER_NAME = stringKey("network.carrier.name");

  /**
   * This describes more details regarding the connection.type. It may be the type of cell
   * technology connection, but it could be used for describing details about a wifi connection
   */
  public static final AttributeKey<String> NETWORK_CONNECTION_SUBTYPE =
      stringKey("network.connection.subtype");

  /** The internet connection type */
  public static final AttributeKey<String> NETWORK_CONNECTION_TYPE =
      stringKey("network.connection.type");

  /** The network IO operation direction */
  public static final AttributeKey<String> NETWORK_IO_DIRECTION = stringKey("network.io.direction");

  // Enum definitions
  /** Values for {@link #NETWORK_CONNECTION_SUBTYPE}. */
  public static final class NetworkConnectionSubtypeValues {
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

    private NetworkConnectionSubtypeValues() {}
  }

  // Enum definitions
  /** Values for {@link #NETWORK_CONNECTION_TYPE}. */
  public static final class NetworkConnectionTypeValues {
    /** wifi */
    public static final String WIFI = "wifi";

    /** wired */
    public static final String WIRED = "wired";

    /** cell */
    public static final String CELL = "cell";

    /** unavailable */
    public static final String UNAVAILABLE = "unavailable";

    /** unknown */
    public static final String UNKNOWN = "unknown";

    private NetworkConnectionTypeValues() {}
  }

  // Enum definitions
  /** Values for {@link #NETWORK_IO_DIRECTION}. */
  public static final class NetworkIoDirectionValues {
    /** transmit */
    public static final String TRANSMIT = "transmit";

    /** receive */
    public static final String RECEIVE = "receive";

    private NetworkIoDirectionValues() {}
  }

  private NetworkIncubatingAttributes() {}
}
