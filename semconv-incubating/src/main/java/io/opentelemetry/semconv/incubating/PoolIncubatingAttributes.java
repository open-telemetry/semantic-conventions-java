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
public final class PoolIncubatingAttributes {
  /**
   * Deprecated, use {@code db.client.connection.pool.name} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code db.client.connection.pool.name}.
   */
  @Deprecated public static final AttributeKey<String> POOL_NAME = stringKey("pool.name");

  private PoolIncubatingAttributes() {}
}
