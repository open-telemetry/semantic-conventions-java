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
public final class GoIncubatingAttributes {
  /** The type of memory */
  public static final AttributeKey<String> GO_MEMORY_TYPE = stringKey("go.memory.type");

  // Enum definitions
  /** Values for {@link #GO_MEMORY_TYPE}. */
  public static final class GoMemoryTypeValues {
    /**
     * Memory allocated from the heap that is reserved for stack space, whether or not it is
     * currently in-use
     */
    public static final String STACK = "stack";

    /**
     * Memory used by the Go runtime, excluding other categories of memory usage described in this
     * enumeration
     */
    public static final String OTHER = "other";

    private GoMemoryTypeValues() {}
  }

  private GoIncubatingAttributes() {}
}
