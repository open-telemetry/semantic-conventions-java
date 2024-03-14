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
public final class OtherIncubatingAttributes {

  /** The state of a connection in the pool */
  public static final AttributeKey<String> STATE = stringKey("state");

  // Enum definitions
  /** Values for {@link #STATE}. */
  public static final class StateValues {
    /** idle. */
    public static final String IDLE = "idle";

    /** used. */
    public static final String USED = "used";

    private StateValues() {}
  }

  private OtherIncubatingAttributes() {}
}
