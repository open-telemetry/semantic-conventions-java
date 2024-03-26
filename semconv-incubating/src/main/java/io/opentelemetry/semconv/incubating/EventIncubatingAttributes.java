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
public final class EventIncubatingAttributes {

  /**
   * Identifies the class / type of event.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Event names are subject to the same rules as <a
   *       href="https://github.com/open-telemetry/opentelemetry-specification/tree/v1.26.0/specification/common/attribute-naming.md">attribute
   *       names</a>. Notably, event names are namespaced to avoid collisions and provide a clean
   *       separation of semantics for events in separate domains like browser, mobile, and
   *       kubernetes.
   * </ul>
   */
  public static final AttributeKey<String> EVENT_NAME = stringKey("event.name");

  private EventIncubatingAttributes() {}
}
