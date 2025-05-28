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
public final class EventIncubatingAttributes {
  /**
   * Identifies the class / type of event.
   *
   * @deprecated Replaced by EventName top-level field on the LogRecord.
   */
  @Deprecated public static final AttributeKey<String> EVENT_NAME = stringKey("event.name");

  // Enum definitions

  private EventIncubatingAttributes() {}
}
