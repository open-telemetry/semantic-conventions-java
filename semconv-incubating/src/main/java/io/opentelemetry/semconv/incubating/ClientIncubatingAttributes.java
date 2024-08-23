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
public final class ClientIncubatingAttributes {
  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ClientAttributes#CLIENT_ADDRESS} attribute.
   */
  @Deprecated public static final AttributeKey<String> CLIENT_ADDRESS = stringKey("client.address");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ClientAttributes#CLIENT_PORT} attribute.
   */
  @Deprecated public static final AttributeKey<Long> CLIENT_PORT = longKey("client.port");

  private ClientIncubatingAttributes() {}
}
