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
public final class EventAttributes {

  /**
   * The domain identifies the business context for the events.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Events across different domains may have same {@code event.name}, yet be unrelated
   *       events.
   * </ul>
   */
  public static final AttributeKey<String> EVENT_DOMAIN = stringKey("event.domain");

  /** The name identifies the event. */
  public static final AttributeKey<String> EVENT_NAME = stringKey("event.name");

  // Enum definitions
  public static final class EventDomainValues {
    /** Events from browser apps. */
    public static final String BROWSER = "browser";

    /** Events from mobile apps. */
    public static final String DEVICE = "device";

    /** Events from Kubernetes. */
    public static final String K8S = "k8s";

    private EventDomainValues() {}
  }

  private EventAttributes() {}
}
