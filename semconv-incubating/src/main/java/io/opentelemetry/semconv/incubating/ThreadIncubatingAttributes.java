/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class ThreadIncubatingAttributes {
  /** Current "managed" thread ID (as opposed to OS thread ID). */
  public static final AttributeKey<Long> THREAD_ID = longKey("thread.id");

  /** Current thread name. */
  public static final AttributeKey<String> THREAD_NAME = stringKey("thread.name");

  // Enum definitions

  private ThreadIncubatingAttributes() {}
}
