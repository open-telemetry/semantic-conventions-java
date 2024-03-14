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
public final class SessionIncubatingAttributes {

  /** A unique id to identify a session. */
  public static final AttributeKey<String> SESSION_ID = stringKey("session.id");

  /** The previous {@code session.id} for this user, when known. */
  public static final AttributeKey<String> SESSION_PREVIOUS_ID = stringKey("session.previous_id");

  private SessionIncubatingAttributes() {}
}
