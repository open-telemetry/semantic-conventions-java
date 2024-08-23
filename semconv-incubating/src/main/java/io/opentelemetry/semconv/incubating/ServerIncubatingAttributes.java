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
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ServerAttributes#SERVER_ADDRESS} attribute.
   */
  @Deprecated public static final AttributeKey<String> SERVER_ADDRESS = stringKey("server.address");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ServerAttributes#SERVER_PORT} attribute.
   */
  @Deprecated public static final AttributeKey<Long> SERVER_PORT = longKey("server.port");

  private ServerIncubatingAttributes() {}
}
