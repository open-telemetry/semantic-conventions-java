/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/java/SemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class JvmMetrics {

  /** Name of the {@code jvm.class.count} metric. */
  public static final String JVM_CLASS_COUNT_NAME = "jvm.class.count";

  /** Unit of the {@code jvm.class.count} metric. */
  public static final String JVM_CLASS_COUNT_UNIT = "{class}";

  /** Description of the {@code jvm.class.count} metric. */
  public static final String JVM_CLASS_COUNT_DESCRIPTION = "Number of classes currently loaded.";

  /** Name of the {@code jvm.class.loaded} metric. */
  public static final String JVM_CLASS_LOADED_NAME = "jvm.class.loaded";

  /** Unit of the {@code jvm.class.loaded} metric. */
  public static final String JVM_CLASS_LOADED_UNIT = "{class}";

  /** Description of the {@code jvm.class.loaded} metric. */
  public static final String JVM_CLASS_LOADED_DESCRIPTION =
      "Number of classes loaded since JVM start.";

  /** Name of the {@code jvm.class.unloaded} metric. */
  public static final String JVM_CLASS_UNLOADED_NAME = "jvm.class.unloaded";

  /** Unit of the {@code jvm.class.unloaded} metric. */
  public static final String JVM_CLASS_UNLOADED_UNIT = "{class}";

  /** Description of the {@code jvm.class.unloaded} metric. */
  public static final String JVM_CLASS_UNLOADED_DESCRIPTION =
      "Number of classes unloaded since JVM start.";

  /** Name of the {@code jvm.cpu.count} metric. */
  public static final String JVM_CPU_COUNT_NAME = "jvm.cpu.count";

  /** Unit of the {@code jvm.cpu.count} metric. */
  public static final String JVM_CPU_COUNT_UNIT = "{cpu}";

  /** Description of the {@code jvm.cpu.count} metric. */
  public static final String JVM_CPU_COUNT_DESCRIPTION =
      "Number of processors available to the Java virtual machine.";

  /** Name of the {@code jvm.cpu.recent_utilization} metric. */
  public static final String JVM_CPU_RECENT_UTILIZATION_NAME = "jvm.cpu.recent_utilization";

  /** Unit of the {@code jvm.cpu.recent_utilization} metric. */
  public static final String JVM_CPU_RECENT_UTILIZATION_UNIT = "1";

  /** Description of the {@code jvm.cpu.recent_utilization} metric. */
  public static final String JVM_CPU_RECENT_UTILIZATION_DESCRIPTION =
      "Recent CPU utilization for the process as reported by the JVM.";

  /** Name of the {@code jvm.cpu.time} metric. */
  public static final String JVM_CPU_TIME_NAME = "jvm.cpu.time";

  /** Unit of the {@code jvm.cpu.time} metric. */
  public static final String JVM_CPU_TIME_UNIT = "s";

  /** Description of the {@code jvm.cpu.time} metric. */
  public static final String JVM_CPU_TIME_DESCRIPTION =
      "CPU time used by the process as reported by the JVM.";

  /** Name of the {@code jvm.gc.duration} metric. */
  public static final String JVM_GC_DURATION_NAME = "jvm.gc.duration";

  /** Unit of the {@code jvm.gc.duration} metric. */
  public static final String JVM_GC_DURATION_UNIT = "s";

  /** Description of the {@code jvm.gc.duration} metric. */
  public static final String JVM_GC_DURATION_DESCRIPTION =
      "Duration of JVM garbage collection actions.";

  /** Name of the {@code jvm.memory.committed} metric. */
  public static final String JVM_MEMORY_COMMITTED_NAME = "jvm.memory.committed";

  /** Unit of the {@code jvm.memory.committed} metric. */
  public static final String JVM_MEMORY_COMMITTED_UNIT = "By";

  /** Description of the {@code jvm.memory.committed} metric. */
  public static final String JVM_MEMORY_COMMITTED_DESCRIPTION = "Measure of memory committed.";

  /** Name of the {@code jvm.memory.limit} metric. */
  public static final String JVM_MEMORY_LIMIT_NAME = "jvm.memory.limit";

  /** Unit of the {@code jvm.memory.limit} metric. */
  public static final String JVM_MEMORY_LIMIT_UNIT = "By";

  /** Description of the {@code jvm.memory.limit} metric. */
  public static final String JVM_MEMORY_LIMIT_DESCRIPTION = "Measure of max obtainable memory.";

  /** Name of the {@code jvm.memory.used} metric. */
  public static final String JVM_MEMORY_USED_NAME = "jvm.memory.used";

  /** Unit of the {@code jvm.memory.used} metric. */
  public static final String JVM_MEMORY_USED_UNIT = "By";

  /** Description of the {@code jvm.memory.used} metric. */
  public static final String JVM_MEMORY_USED_DESCRIPTION = "Measure of memory used.";

  /** Name of the {@code jvm.memory.used_after_last_gc} metric. */
  public static final String JVM_MEMORY_USED_AFTER_LAST_GC_NAME = "jvm.memory.used_after_last_gc";

  /** Unit of the {@code jvm.memory.used_after_last_gc} metric. */
  public static final String JVM_MEMORY_USED_AFTER_LAST_GC_UNIT = "By";

  /** Description of the {@code jvm.memory.used_after_last_gc} metric. */
  public static final String JVM_MEMORY_USED_AFTER_LAST_GC_DESCRIPTION =
      "Measure of memory used, as measured after the most recent garbage collection event on this pool.";

  /** Name of the {@code jvm.thread.count} metric. */
  public static final String JVM_THREAD_COUNT_NAME = "jvm.thread.count";

  /** Unit of the {@code jvm.thread.count} metric. */
  public static final String JVM_THREAD_COUNT_UNIT = "{thread}";

  /** Description of the {@code jvm.thread.count} metric. */
  public static final String JVM_THREAD_COUNT_DESCRIPTION = "Number of executing platform threads.";

  private JvmMetrics() {}
}
