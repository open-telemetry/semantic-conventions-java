/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class PoolIncubatingAttributes {

  /**
   * Deprecated, use {@code db.client.connection.pool.name} instead.
   *
   * @deprecated Deprecated, use `db.client.connection.pool.name` instead.
   */
  @Deprecated public static final AttributeKey<String> POOL_NAME = stringKey("pool.name");

  private PoolIncubatingAttributes() {}
}
