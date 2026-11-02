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
public final class CpuIncubatingAttributes {
  /**
   * The identifier of a logical execution target (CPU) as seen by the operating system, in the
   * range [0..n-1].
   *
   * <p>Notes:
   *
   * <p>On systems with simultaneous multithreading (SMT) enabled — such as Intel Hyper-Threading or
   * AMD SMT — this value will usually differ from the physical core number, because each core
   * presents multiple logical CPUs for the system to use.
   */
  public static final AttributeKey<Long> CPU_LOGICAL_NUMBER = longKey("cpu.logical_number");

  /** The mode of the CPU */
  public static final AttributeKey<String> CPU_MODE = stringKey("cpu.mode");

  // Enum definitions

  /** Values for {@link #CPU_MODE}. */
  public static final class CpuModeIncubatingValues {
    /** User */
    public static final String USER = "user";

    /** System */
    public static final String SYSTEM = "system";

    /** Nice */
    public static final String NICE = "nice";

    /** Idle */
    public static final String IDLE = "idle";

    /** IO Wait */
    public static final String IOWAIT = "iowait";

    /** Interrupt */
    public static final String INTERRUPT = "interrupt";

    /** Steal */
    public static final String STEAL = "steal";

    /**
     * Deprecated. Use {@code system} instead.
     *
     * @deprecated Replaced by {@code system}.
     */
    @Deprecated public static final String KERNEL = "kernel";

    private CpuModeIncubatingValues() {}
  }

  private CpuIncubatingAttributes() {}
}
