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
   * v8.getHeapSpaceStatistics()}</a>. The set of reported spaces depends on the V8 version the
   * runtime embeds.
   */
  public static final AttributeKey<String> V8JS_HEAP_SPACE_NAME = stringKey("v8js.heap.space.name");

  /** The type of resource keeping the event loop active. */
  public static final AttributeKey<String> V8JS_RESOURCE_TYPE = stringKey("v8js.resource.type");

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

    /** Read-only memory space, holding immutable objects created at startup. */
    public static final String READ_ONLY_SPACE = "read_only_space";

    /** Memory space for objects shared across isolates (e.g. shared strings and structs). */
    public static final String SHARED_SPACE = "shared_space";

    /** Memory space for trusted objects kept outside the V8 sandbox (e.g. bytecode). */
    public static final String TRUSTED_SPACE = "trusted_space";

    /** Shared variant of the trusted memory space. */
    public static final String SHARED_TRUSTED_SPACE = "shared_trusted_space";

    /** Large object space for young-generation objects. */
    public static final String NEW_LARGE_OBJECT_SPACE = "new_large_object_space";

    /** Large object space for code objects. */
    public static final String CODE_LARGE_OBJECT_SPACE = "code_large_object_space";

    /** Large object space for shared objects. */
    public static final String SHARED_LARGE_OBJECT_SPACE = "shared_large_object_space";

    /** Large object space for shared trusted objects. */
    public static final String SHARED_TRUSTED_LARGE_OBJECT_SPACE =
        "shared_trusted_large_object_space";

    /** Large object space for trusted objects. */
    public static final String TRUSTED_LARGE_OBJECT_SPACE = "trusted_large_object_space";

    private V8jsHeapSpaceNameIncubatingValues() {}
  }

  /** Values for {@link #V8JS_RESOURCE_TYPE}. */
  public static final class V8jsResourceTypeIncubatingValues {
    /** Active {@code setImmediate} callbacks. */
    public static final String IMMEDIATE = "Immediate";

    /** Active TCP Servers. */
    public static final String TCPSERVERWRAP = "TCPServerWrap";

    /** Active TCP connections. */
    public static final String TCPWRAP = "TCPWrap";

    /** Active {@code setTimeout} or {@code setInterval} timers. */
    public static final String TIMEOUT = "Timeout";

    /** Active Terminal I/O (stdin/stdout). */
    public static final String TTYWRAP = "TTYWrap";

    private V8jsResourceTypeIncubatingValues() {}
  }

  private V8jsIncubatingAttributes() {}
}
