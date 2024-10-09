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
public final class NodejsIncubatingAttributes {
  /** The state of event loop time. */
  public static final AttributeKey<String> NODEJS_EVENTLOOP_STATE =
      stringKey("nodejs.eventloop.state");

  // Enum definitions
  /** Values for {@link #NODEJS_EVENTLOOP_STATE}. */
  public static final class NodejsEventloopStateIncubatingValues {
    /** Active time. */
    public static final String ACTIVE = "active";

    /** Idle time. */
    public static final String IDLE = "idle";

    private NodejsEventloopStateIncubatingValues() {}
  }

  private NodejsIncubatingAttributes() {}
}
