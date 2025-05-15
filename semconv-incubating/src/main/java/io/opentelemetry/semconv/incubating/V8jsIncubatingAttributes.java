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
public final class V8jsIncubatingAttributes {
  /** The type of garbage collection. */
  public static final AttributeKey<String> V8JS_GC_TYPE = stringKey("v8js.gc.type");

  /**
   * The name of the space type of heap memory.
   *
   * <p>Notes:
   *
   * <p>Value can be retrieved from value {@code space_name} of <a
   * href="https://nodejs.org/api/v8.html#v8getheapspacestatistics">{@code
   * v8.getHeapSpaceStatistics()}</a>
   */
  public static final AttributeKey<String> V8JS_HEAP_SPACE_NAME = stringKey("v8js.heap.space.name");

  // Enum definitions

  /** Values for {@link #V8JS_GC_TYPE}. */
  public static final class V8jsGcTypeIncubatingValues {
    /** Major (Mark Sweep Compact). */
    public static final String MAJOR = "major";

    /** Minor (Scavenge). */
    public static final String MINOR = "minor";

    /** Incremental (Incremental Marking). */
    public static final String INCREMENTAL = "incremental";

    /** Weak Callbacks (Process Weak Callbacks). */
    public static final String WEAKCB = "weakcb";

    private V8jsGcTypeIncubatingValues() {}
  }

  /** Values for {@link #V8JS_HEAP_SPACE_NAME}. */
  public static final class V8jsHeapSpaceNameIncubatingValues {
    /** New memory space. */
    public static final String NEW_SPACE = "new_space";

    /** Old memory space. */
    public static final String OLD_SPACE = "old_space";

    /** Code memory space. */
    public static final String CODE_SPACE = "code_space";

    /** Map memory space. */
    public static final String MAP_SPACE = "map_space";

    /** Large object memory space. */
    public static final String LARGE_OBJECT_SPACE = "large_object_space";

    private V8jsHeapSpaceNameIncubatingValues() {}
  }

  private V8jsIncubatingAttributes() {}
}
