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
public final class CpuIncubatingAttributes {

  /** The mode of the CPU */
  public static final AttributeKey<String> CPU_MODE = stringKey("cpu.mode");

  // Enum definitions
  /** Values for {@link #CPU_MODE}. */
  public static final class CpuModeValues {
    /** user. */
    public static final String USER = "user";

    /** system. */
    public static final String SYSTEM = "system";

    /** nice. */
    public static final String NICE = "nice";

    /** idle. */
    public static final String IDLE = "idle";

    /** iowait. */
    public static final String IOWAIT = "iowait";

    /** interrupt. */
    public static final String INTERRUPT = "interrupt";

    /** steal. */
    public static final String STEAL = "steal";

    /** kernel. */
    public static final String KERNEL = "kernel";

    private CpuModeValues() {}
  }

  private CpuIncubatingAttributes() {}
}
