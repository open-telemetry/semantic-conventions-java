/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class CpuIncubatingMetrics {

  /** Name of the {@code cpu.frequency} metric. */
  @Deprecated public static final String CPU_FREQUENCY_NAME = "cpu.frequency";

  /** Unit of the {@code cpu.frequency} metric. */
  @Deprecated public static final String CPU_FREQUENCY_UNIT = "{Hz}";

  /** Description of the {@code cpu.frequency} metric. */
  @Deprecated
  public static final String CPU_FREQUENCY_DESCRIPTION =
      "Deprecated. Use `system.cpu.frequency` instead.";

  /** Name of the {@code cpu.time} metric. */
  @Deprecated public static final String CPU_TIME_NAME = "cpu.time";

  /** Unit of the {@code cpu.time} metric. */
  @Deprecated public static final String CPU_TIME_UNIT = "s";

  /** Description of the {@code cpu.time} metric. */
  @Deprecated
  public static final String CPU_TIME_DESCRIPTION = "Deprecated. Use `system.cpu.time` instead.";

  /** Name of the {@code cpu.utilization} metric. */
  @Deprecated public static final String CPU_UTILIZATION_NAME = "cpu.utilization";

  /** Unit of the {@code cpu.utilization} metric. */
  @Deprecated public static final String CPU_UTILIZATION_UNIT = "1";

  /** Description of the {@code cpu.utilization} metric. */
  @Deprecated
  public static final String CPU_UTILIZATION_DESCRIPTION =
      "Deprecated. Use `system.cpu.utilization` instead.";

  private CpuIncubatingMetrics() {}
}
