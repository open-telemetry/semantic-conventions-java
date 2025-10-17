/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class ProcessIncubatingMetrics {

  /** Name of the {@code process.context_switches} metric. */
  public static final String PROCESS_CONTEXT_SWITCHES_NAME = "process.context_switches";

  /** Unit of the {@code process.context_switches} metric. */
  public static final String PROCESS_CONTEXT_SWITCHES_UNIT = "{context_switch}";

  /** Description of the {@code process.context_switches} metric. */
  public static final String PROCESS_CONTEXT_SWITCHES_DESCRIPTION =
      "Number of times the process has been context switched.";

  /** Name of the {@code process.cpu.time} metric. */
  public static final String PROCESS_CPU_TIME_NAME = "process.cpu.time";

  /** Unit of the {@code process.cpu.time} metric. */
  public static final String PROCESS_CPU_TIME_UNIT = "s";

  /** Description of the {@code process.cpu.time} metric. */
  public static final String PROCESS_CPU_TIME_DESCRIPTION =
      "Total CPU seconds broken down by different states.";

  /** Name of the {@code process.cpu.utilization} metric. */
  public static final String PROCESS_CPU_UTILIZATION_NAME = "process.cpu.utilization";

  /** Unit of the {@code process.cpu.utilization} metric. */
  public static final String PROCESS_CPU_UTILIZATION_UNIT = "1";

  /** Description of the {@code process.cpu.utilization} metric. */
  public static final String PROCESS_CPU_UTILIZATION_DESCRIPTION =
      "Difference in process.cpu.time since the last measurement, divided by the elapsed time and number of CPUs available to the process.";

  /** Name of the {@code process.disk.io} metric. */
  public static final String PROCESS_DISK_IO_NAME = "process.disk.io";

  /** Unit of the {@code process.disk.io} metric. */
  public static final String PROCESS_DISK_IO_UNIT = "By";

  /** Description of the {@code process.disk.io} metric. */
  public static final String PROCESS_DISK_IO_DESCRIPTION = "Disk bytes transferred.";

  /** Name of the {@code process.memory.usage} metric. */
  public static final String PROCESS_MEMORY_USAGE_NAME = "process.memory.usage";

  /** Unit of the {@code process.memory.usage} metric. */
  public static final String PROCESS_MEMORY_USAGE_UNIT = "By";

  /** Description of the {@code process.memory.usage} metric. */
  public static final String PROCESS_MEMORY_USAGE_DESCRIPTION =
      "The amount of physical memory in use.";

  /** Name of the {@code process.memory.virtual} metric. */
  public static final String PROCESS_MEMORY_VIRTUAL_NAME = "process.memory.virtual";

  /** Unit of the {@code process.memory.virtual} metric. */
  public static final String PROCESS_MEMORY_VIRTUAL_UNIT = "By";

  /** Description of the {@code process.memory.virtual} metric. */
  public static final String PROCESS_MEMORY_VIRTUAL_DESCRIPTION =
      "The amount of committed virtual memory.";

  /** Name of the {@code process.network.io} metric. */
  public static final String PROCESS_NETWORK_IO_NAME = "process.network.io";

  /** Unit of the {@code process.network.io} metric. */
  public static final String PROCESS_NETWORK_IO_UNIT = "By";

  /** Description of the {@code process.network.io} metric. */
  public static final String PROCESS_NETWORK_IO_DESCRIPTION = "Network bytes transferred.";

  /** Name of the {@code process.open_file_descriptor.count} metric. */
  public static final String PROCESS_OPEN_FILE_DESCRIPTOR_COUNT_NAME =
      "process.open_file_descriptor.count";

  /** Unit of the {@code process.open_file_descriptor.count} metric. */
  public static final String PROCESS_OPEN_FILE_DESCRIPTOR_COUNT_UNIT = "{file_descriptor}";

  /** Description of the {@code process.open_file_descriptor.count} metric. */
  public static final String PROCESS_OPEN_FILE_DESCRIPTOR_COUNT_DESCRIPTION =
      "Number of file descriptors in use by the process.";

  /** Name of the {@code process.paging.faults} metric. */
  public static final String PROCESS_PAGING_FAULTS_NAME = "process.paging.faults";

  /** Unit of the {@code process.paging.faults} metric. */
  public static final String PROCESS_PAGING_FAULTS_UNIT = "{fault}";

  /** Description of the {@code process.paging.faults} metric. */
  public static final String PROCESS_PAGING_FAULTS_DESCRIPTION =
      "Number of page faults the process has made.";

  /** Name of the {@code process.thread.count} metric. */
  public static final String PROCESS_THREAD_COUNT_NAME = "process.thread.count";

  /** Unit of the {@code process.thread.count} metric. */
  public static final String PROCESS_THREAD_COUNT_UNIT = "{thread}";

  /** Description of the {@code process.thread.count} metric. */
  public static final String PROCESS_THREAD_COUNT_DESCRIPTION = "Process threads count.";

  /** Name of the {@code process.uptime} metric. */
  public static final String PROCESS_UPTIME_NAME = "process.uptime";

  /** Unit of the {@code process.uptime} metric. */
  public static final String PROCESS_UPTIME_UNIT = "s";

  /** Description of the {@code process.uptime} metric. */
  public static final String PROCESS_UPTIME_DESCRIPTION = "The time the process has been running.";

  private ProcessIncubatingMetrics() {}
}
