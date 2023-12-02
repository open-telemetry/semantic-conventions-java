/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_22_0;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.experimental.java.j2
@SuppressWarnings("unused")
public final class PoolAttributes {

  /**
   * The name of the connection pool; unique within the instrumented application. In case the
   * connection pool implementation does not provide a name, then the <a
   * href="/docs/database/database-spans.md#connection-level-attributes">db.connection_string</a>
   * should be used
   */
  public static final AttributeKey<String> POOL_NAME = stringKey("pool.name");

  // Enum definitions

  private PoolAttributes() {}
}
