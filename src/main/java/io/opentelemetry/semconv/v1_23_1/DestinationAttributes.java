/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_23_1;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.experimental.java.j2
@SuppressWarnings("unused")
public final class DestinationAttributes {

  /**
   * Destination address - domain name if available without reverse DNS lookup; otherwise, IP
   * address or Unix domain socket name.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>When observed from the source side, and when communicating through an intermediary,
   *       {@code destination.address} SHOULD represent the destination address behind any
   *       intermediaries, for example proxies, if it's available.
   * </ul>
   */
  public static final AttributeKey<String> DESTINATION_ADDRESS = stringKey("destination.address");

  /** Destination port number */
  public static final AttributeKey<Long> DESTINATION_PORT = longKey("destination.port");

  // Enum definitions

  private DestinationAttributes() {}
}
