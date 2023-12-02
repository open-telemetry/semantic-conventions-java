/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_23_1;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.experimental.java.j2
@SuppressWarnings("unused")
public final class OtherAttributes {

  /** The state of a connection in the pool */
  public static final AttributeKey<String> STATE = stringKey("state");

  // Enum definitions
  public static final class StateValues {
    /** idle. */
    public static final String IDLE = "idle";

    /** used. */
    public static final String USED = "used";

    private StateValues() {}
  }

  private OtherAttributes() {}
}
