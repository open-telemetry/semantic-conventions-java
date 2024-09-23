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
public final class OtherIncubatingAttributes {
  /**
   * Deprecated, use {@code db.client.connection.state} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code db.client.connection.state}.
   */
  @Deprecated public static final AttributeKey<String> STATE = stringKey("state");

  // Enum definitions
  /**
   * Values for {@link #STATE}
   *
   * @deprecated Replaced by {@code db.client.connection.state}.
   */
  @Deprecated
  public static final class StateIncubatingValues {
    /** idle. */
    public static final String IDLE = "idle";

    /** used. */
    public static final String USED = "used";

    private StateIncubatingValues() {}
  }

  private OtherIncubatingAttributes() {}
}
