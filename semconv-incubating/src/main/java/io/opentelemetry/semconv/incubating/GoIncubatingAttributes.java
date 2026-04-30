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
  /**
   * The detailed state of the CPU.
   *
   * <p>Notes:
   *
   * <p>Value SHOULD match the specific CPU class reported by the Go runtime under {@code
   * /cpu/classes/...}. The list of possible values is subject to change with the Go version used.
   */
  public static final AttributeKey<String> GO_CPU_DETAILED_STATE =
      stringKey("go.cpu.detailed_state");

  /** The state of the CPU. */
  public static final AttributeKey<String> GO_CPU_STATE = stringKey("go.cpu.state");

  /**
   * The detailed type of memory.
   *
   * <p>Notes:
   *
   * <p>Value SHOULD match the specific memory class reported by the Go runtime under {@code
   * /memory/classes/...}. The list of possible values is subject to change with the Go version
   * used.
   */
  public static final AttributeKey<String> GO_MEMORY_DETAILED_TYPE =
      stringKey("go.memory.detailed_type");

  /** The type of memory. */
  public static final AttributeKey<String> GO_MEMORY_TYPE = stringKey("go.memory.type");

  // Enum definitions

  /** Values for {@link #GO_CPU_STATE}. */
  public static final class GoCpuStateIncubatingValues {
    /** CPU time spent running user Go code. */
    public static final String USER = "user";

    /** CPU time spent performing garbage collection tasks. */
    public static final String GC = "gc";

    /** CPU time spent returning unused memory to the underlying platform. */
    public static final String SCAVENGE = "scavenge";

    /** Available CPU time not spent executing any Go or Go runtime code. */
    public static final String IDLE = "idle";

    private GoCpuStateIncubatingValues() {}
  }

  /** Values for {@link #GO_MEMORY_TYPE}. */
  public static final class GoMemoryTypeIncubatingValues {
    /**
     * Memory allocated from the heap that is reserved for stack space, whether or not it is
     * currently in-use.
     */
    public static final String STACK = "stack";

    /**
     * Memory used by the Go runtime, excluding other categories of memory usage described in this
     * enumeration.
     */
    public static final String OTHER = "other";

    private GoMemoryTypeIncubatingValues() {}
  }

  private GoIncubatingAttributes() {}
}
