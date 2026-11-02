/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class JvmIncubatingMetrics {
  /** Name of the {@code jvm.buffer.count} metric. */
  public static final String JVM_BUFFER_COUNT_NAME = "jvm.buffer.count";

  /** Unit of the {@code jvm.buffer.count} metric. */
  public static final String JVM_BUFFER_COUNT_UNIT = "{buffer}";

  /** Description of the {@code jvm.buffer.count} metric. */
  public static final String JVM_BUFFER_COUNT_DESCRIPTION = "Number of buffers in the pool.";

  /** Name of the {@code jvm.buffer.memory.limit} metric. */
  public static final String JVM_BUFFER_MEMORY_LIMIT_NAME = "jvm.buffer.memory.limit";

  /** Unit of the {@code jvm.buffer.memory.limit} metric. */
  public static final String JVM_BUFFER_MEMORY_LIMIT_UNIT = "By";

  /** Description of the {@code jvm.buffer.memory.limit} metric. */
  public static final String JVM_BUFFER_MEMORY_LIMIT_DESCRIPTION =
      "Measure of total memory capacity of buffers.";

  /**
   * Name of the {@code jvm.buffer.memory.usage} metric.
   *
   * @deprecated Replaced by {@code jvm.buffer.memory.used}.
   */
  @Deprecated public static final String JVM_BUFFER_MEMORY_USAGE_NAME = "jvm.buffer.memory.usage";

  /**
   * Unit of the {@code jvm.buffer.memory.usage} metric.
   *
   * @deprecated Replaced by {@code jvm.buffer.memory.used}.
   */
  @Deprecated public static final String JVM_BUFFER_MEMORY_USAGE_UNIT = "By";

  /**
   * Description of the {@code jvm.buffer.memory.usage} metric.
   *
   * @deprecated Replaced by {@code jvm.buffer.memory.used}.
   */
  @Deprecated
  public static final String JVM_BUFFER_MEMORY_USAGE_DESCRIPTION =
      "Deprecated, use `jvm.buffer.memory.used` instead.";

  /** Name of the {@code jvm.buffer.memory.used} metric. */
  public static final String JVM_BUFFER_MEMORY_USED_NAME = "jvm.buffer.memory.used";

  /** Unit of the {@code jvm.buffer.memory.used} metric. */
  public static final String JVM_BUFFER_MEMORY_USED_UNIT = "By";

  /** Description of the {@code jvm.buffer.memory.used} metric. */
  public static final String JVM_BUFFER_MEMORY_USED_DESCRIPTION =
      "Measure of memory used by buffers.";

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

  /** Name of the {@code jvm.executor.queue.capacity} metric. */
  public static final String JVM_EXECUTOR_QUEUE_CAPACITY_NAME = "jvm.executor.queue.capacity";

  /** Unit of the {@code jvm.executor.queue.capacity} metric. */
  public static final String JVM_EXECUTOR_QUEUE_CAPACITY_UNIT = "{task}";

  /** Description of the {@code jvm.executor.queue.capacity} metric. */
  public static final String JVM_EXECUTOR_QUEUE_CAPACITY_DESCRIPTION =
      "The maximum number of tasks the executor queue can hold.";

  /** Name of the {@code jvm.executor.queue.size} metric. */
  public static final String JVM_EXECUTOR_QUEUE_SIZE_NAME = "jvm.executor.queue.size";

  /** Unit of the {@code jvm.executor.queue.size} metric. */
  public static final String JVM_EXECUTOR_QUEUE_SIZE_UNIT = "{task}";

  /** Description of the {@code jvm.executor.queue.size} metric. */
  public static final String JVM_EXECUTOR_QUEUE_SIZE_DESCRIPTION =
      "The number of tasks currently queued for execution.";

  /** Name of the {@code jvm.executor.task.completed} metric. */
  public static final String JVM_EXECUTOR_TASK_COMPLETED_NAME = "jvm.executor.task.completed";

  /** Unit of the {@code jvm.executor.task.completed} metric. */
  public static final String JVM_EXECUTOR_TASK_COMPLETED_UNIT = "{task}";

  /** Description of the {@code jvm.executor.task.completed} metric. */
  public static final String JVM_EXECUTOR_TASK_COMPLETED_DESCRIPTION =
      "The number of tasks completed by the executor.";

  /** Name of the {@code jvm.executor.task.rejected} metric. */
  public static final String JVM_EXECUTOR_TASK_REJECTED_NAME = "jvm.executor.task.rejected";

  /** Unit of the {@code jvm.executor.task.rejected} metric. */
  public static final String JVM_EXECUTOR_TASK_REJECTED_UNIT = "{task}";

  /** Description of the {@code jvm.executor.task.rejected} metric. */
  public static final String JVM_EXECUTOR_TASK_REJECTED_DESCRIPTION =
      "The number of task submissions rejected by the executor.";

  /** Name of the {@code jvm.executor.thread.core} metric. */
  public static final String JVM_EXECUTOR_THREAD_CORE_NAME = "jvm.executor.thread.core";

  /** Unit of the {@code jvm.executor.thread.core} metric. */
  public static final String JVM_EXECUTOR_THREAD_CORE_UNIT = "{thread}";

  /** Description of the {@code jvm.executor.thread.core} metric. */
  public static final String JVM_EXECUTOR_THREAD_CORE_DESCRIPTION =
      "The number of core threads configured for the executor.";

  /** Name of the {@code jvm.executor.thread.count} metric. */
  public static final String JVM_EXECUTOR_THREAD_COUNT_NAME = "jvm.executor.thread.count";

  /** Unit of the {@code jvm.executor.thread.count} metric. */
  public static final String JVM_EXECUTOR_THREAD_COUNT_UNIT = "{thread}";

  /** Description of the {@code jvm.executor.thread.count} metric. */
  public static final String JVM_EXECUTOR_THREAD_COUNT_DESCRIPTION =
      "The number of executor threads that are currently in the state described by the `jvm.executor.thread.state` attribute. ";

  /** Name of the {@code jvm.executor.thread.limit} metric. */
  public static final String JVM_EXECUTOR_THREAD_LIMIT_NAME = "jvm.executor.thread.limit";

  /** Unit of the {@code jvm.executor.thread.limit} metric. */
  public static final String JVM_EXECUTOR_THREAD_LIMIT_UNIT = "{thread}";

  /** Description of the {@code jvm.executor.thread.limit} metric. */
  public static final String JVM_EXECUTOR_THREAD_LIMIT_DESCRIPTION =
      "The maximum number of threads allowed for the executor.";

  /** Name of the {@code jvm.file_descriptor.count} metric. */
  public static final String JVM_FILE_DESCRIPTOR_COUNT_NAME = "jvm.file_descriptor.count";

  /** Unit of the {@code jvm.file_descriptor.count} metric. */
  public static final String JVM_FILE_DESCRIPTOR_COUNT_UNIT = "{file_descriptor}";

  /** Description of the {@code jvm.file_descriptor.count} metric. */
  public static final String JVM_FILE_DESCRIPTOR_COUNT_DESCRIPTION =
      "Number of open file descriptors as reported by the JVM.";

  /** Name of the {@code jvm.file_descriptor.limit} metric. */
  public static final String JVM_FILE_DESCRIPTOR_LIMIT_NAME = "jvm.file_descriptor.limit";

  /** Unit of the {@code jvm.file_descriptor.limit} metric. */
  public static final String JVM_FILE_DESCRIPTOR_LIMIT_UNIT = "{file_descriptor}";

  /** Description of the {@code jvm.file_descriptor.limit} metric. */
  public static final String JVM_FILE_DESCRIPTOR_LIMIT_DESCRIPTION =
      "Measure of max open file descriptors as reported by the JVM.";

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

  /** Name of the {@code jvm.memory.init} metric. */
  public static final String JVM_MEMORY_INIT_NAME = "jvm.memory.init";

  /** Unit of the {@code jvm.memory.init} metric. */
  public static final String JVM_MEMORY_INIT_UNIT = "By";

  /** Description of the {@code jvm.memory.init} metric. */
  public static final String JVM_MEMORY_INIT_DESCRIPTION = "Measure of initial memory requested.";

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

  /** Name of the {@code jvm.system.cpu.load_1m} metric. */
  public static final String JVM_SYSTEM_CPU_LOAD_1M_NAME = "jvm.system.cpu.load_1m";

  /** Unit of the {@code jvm.system.cpu.load_1m} metric. */
  public static final String JVM_SYSTEM_CPU_LOAD_1M_UNIT = "{run_queue_item}";

  /** Description of the {@code jvm.system.cpu.load_1m} metric. */
  public static final String JVM_SYSTEM_CPU_LOAD_1M_DESCRIPTION =
      "Average CPU load of the whole system for the last minute as reported by the JVM.";

  /** Name of the {@code jvm.system.cpu.utilization} metric. */
  public static final String JVM_SYSTEM_CPU_UTILIZATION_NAME = "jvm.system.cpu.utilization";

  /** Unit of the {@code jvm.system.cpu.utilization} metric. */
  public static final String JVM_SYSTEM_CPU_UTILIZATION_UNIT = "1";

  /** Description of the {@code jvm.system.cpu.utilization} metric. */
  public static final String JVM_SYSTEM_CPU_UTILIZATION_DESCRIPTION =
      "Recent CPU utilization for the whole system as reported by the JVM.";

  /** Name of the {@code jvm.thread.count} metric. */
  public static final String JVM_THREAD_COUNT_NAME = "jvm.thread.count";

  /** Unit of the {@code jvm.thread.count} metric. */
  public static final String JVM_THREAD_COUNT_UNIT = "{thread}";

  /** Description of the {@code jvm.thread.count} metric. */
  public static final String JVM_THREAD_COUNT_DESCRIPTION = "Number of executing platform threads.";

  private JvmIncubatingMetrics() {}
}
