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
   * The name of the connection pool; unique within the instrumented application. In case the
   * connection pool implementation doesn't provide a name, then the <a
   * href="/docs/database/database-spans.md#connection-level-attributes">db.connection_string</a>
   * should be used
   */
  public static final AttributeKey<String> POOL_NAME = stringKey("pool.name");

  // Enum definitions

  private PoolIncubatingAttributes() {}
}
