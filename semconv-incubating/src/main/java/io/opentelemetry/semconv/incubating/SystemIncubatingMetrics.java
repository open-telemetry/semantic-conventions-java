/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class SystemIncubatingMetrics {

  /** Name of the {@code system.cpu.frequency} metric. */
  public static final String SYSTEM_CPU_FREQUENCY_NAME = "system.cpu.frequency";

  /** Unit of the {@code system.cpu.frequency} metric. */
  public static final String SYSTEM_CPU_FREQUENCY_UNIT = "Hz";

  /** Description of the {@code system.cpu.frequency} metric. */
  public static final String SYSTEM_CPU_FREQUENCY_DESCRIPTION =
      "Operating frequency of the logical CPU in Hertz.";

  /** Name of the {@code system.cpu.logical.count} metric. */
  public static final String SYSTEM_CPU_LOGICAL_COUNT_NAME = "system.cpu.logical.count";

  /** Unit of the {@code system.cpu.logical.count} metric. */
  public static final String SYSTEM_CPU_LOGICAL_COUNT_UNIT = "{cpu}";

  /** Description of the {@code system.cpu.logical.count} metric. */
  public static final String SYSTEM_CPU_LOGICAL_COUNT_DESCRIPTION =
      "Reports the number of logical (virtual) processor cores created by the operating system to manage multitasking.";

  /** Name of the {@code system.cpu.physical.count} metric. */
  public static final String SYSTEM_CPU_PHYSICAL_COUNT_NAME = "system.cpu.physical.count";

  /** Unit of the {@code system.cpu.physical.count} metric. */
  public static final String SYSTEM_CPU_PHYSICAL_COUNT_UNIT = "{cpu}";

  /** Description of the {@code system.cpu.physical.count} metric. */
  public static final String SYSTEM_CPU_PHYSICAL_COUNT_DESCRIPTION =
      "Reports the number of actual physical processor cores on the hardware.";

  /** Name of the {@code system.cpu.time} metric. */
  public static final String SYSTEM_CPU_TIME_NAME = "system.cpu.time";

  /** Unit of the {@code system.cpu.time} metric. */
  public static final String SYSTEM_CPU_TIME_UNIT = "s";

  /** Description of the {@code system.cpu.time} metric. */
  public static final String SYSTEM_CPU_TIME_DESCRIPTION =
      "Seconds each logical CPU spent on each mode.";

  /** Name of the {@code system.cpu.utilization} metric. */
  public static final String SYSTEM_CPU_UTILIZATION_NAME = "system.cpu.utilization";

  /** Unit of the {@code system.cpu.utilization} metric. */
  public static final String SYSTEM_CPU_UTILIZATION_UNIT = "1";

  /** Description of the {@code system.cpu.utilization} metric. */
  public static final String SYSTEM_CPU_UTILIZATION_DESCRIPTION =
      "For each logical CPU, the utilization is calculated as the change in cumulative CPU time (cpu.time) over a measurement interval, divided by the elapsed time.";

  /** Name of the {@code system.disk.io} metric. */
  public static final String SYSTEM_DISK_IO_NAME = "system.disk.io";

  /** Unit of the {@code system.disk.io} metric. */
  public static final String SYSTEM_DISK_IO_UNIT = "By";

  /** Description of the {@code system.disk.io} metric. */
  public static final String SYSTEM_DISK_IO_DESCRIPTION = "TODO.";

  /** Name of the {@code system.disk.io_time} metric. */
  public static final String SYSTEM_DISK_IO_TIME_NAME = "system.disk.io_time";

  /** Unit of the {@code system.disk.io_time} metric. */
  public static final String SYSTEM_DISK_IO_TIME_UNIT = "s";

  /** Description of the {@code system.disk.io_time} metric. */
  public static final String SYSTEM_DISK_IO_TIME_DESCRIPTION = "Time disk spent activated.";

  /** Name of the {@code system.disk.limit} metric. */
  public static final String SYSTEM_DISK_LIMIT_NAME = "system.disk.limit";

  /** Unit of the {@code system.disk.limit} metric. */
  public static final String SYSTEM_DISK_LIMIT_UNIT = "By";

  /** Description of the {@code system.disk.limit} metric. */
  public static final String SYSTEM_DISK_LIMIT_DESCRIPTION =
      "The total storage capacity of the disk.";

  /** Name of the {@code system.disk.merged} metric. */
  public static final String SYSTEM_DISK_MERGED_NAME = "system.disk.merged";

  /** Unit of the {@code system.disk.merged} metric. */
  public static final String SYSTEM_DISK_MERGED_UNIT = "{operation}";

  /** Description of the {@code system.disk.merged} metric. */
  public static final String SYSTEM_DISK_MERGED_DESCRIPTION = "TODO.";

  /** Name of the {@code system.disk.operation_time} metric. */
  public static final String SYSTEM_DISK_OPERATION_TIME_NAME = "system.disk.operation_time";

  /** Unit of the {@code system.disk.operation_time} metric. */
  public static final String SYSTEM_DISK_OPERATION_TIME_UNIT = "s";

  /** Description of the {@code system.disk.operation_time} metric. */
  public static final String SYSTEM_DISK_OPERATION_TIME_DESCRIPTION =
      "Sum of the time each operation took to complete.";

  /** Name of the {@code system.disk.operations} metric. */
  public static final String SYSTEM_DISK_OPERATIONS_NAME = "system.disk.operations";

  /** Unit of the {@code system.disk.operations} metric. */
  public static final String SYSTEM_DISK_OPERATIONS_UNIT = "{operation}";

  /** Description of the {@code system.disk.operations} metric. */
  public static final String SYSTEM_DISK_OPERATIONS_DESCRIPTION = "TODO.";

  /** Name of the {@code system.filesystem.limit} metric. */
  public static final String SYSTEM_FILESYSTEM_LIMIT_NAME = "system.filesystem.limit";

  /** Unit of the {@code system.filesystem.limit} metric. */
  public static final String SYSTEM_FILESYSTEM_LIMIT_UNIT = "By";

  /** Description of the {@code system.filesystem.limit} metric. */
  public static final String SYSTEM_FILESYSTEM_LIMIT_DESCRIPTION =
      "The total storage capacity of the filesystem.";

  /** Name of the {@code system.filesystem.usage} metric. */
  public static final String SYSTEM_FILESYSTEM_USAGE_NAME = "system.filesystem.usage";

  /** Unit of the {@code system.filesystem.usage} metric. */
  public static final String SYSTEM_FILESYSTEM_USAGE_UNIT = "By";

  /** Description of the {@code system.filesystem.usage} metric. */
  public static final String SYSTEM_FILESYSTEM_USAGE_DESCRIPTION =
      "Reports a filesystem's space usage across different states.";

  /** Name of the {@code system.filesystem.utilization} metric. */
  public static final String SYSTEM_FILESYSTEM_UTILIZATION_NAME = "system.filesystem.utilization";

  /** Unit of the {@code system.filesystem.utilization} metric. */
  public static final String SYSTEM_FILESYSTEM_UTILIZATION_UNIT = "1";

  /** Description of the {@code system.filesystem.utilization} metric. */
  public static final String SYSTEM_FILESYSTEM_UTILIZATION_DESCRIPTION = "TODO.";

  /** Name of the {@code system.linux.memory.available} metric. */
  public static final String SYSTEM_LINUX_MEMORY_AVAILABLE_NAME = "system.linux.memory.available";

  /** Unit of the {@code system.linux.memory.available} metric. */
  public static final String SYSTEM_LINUX_MEMORY_AVAILABLE_UNIT = "By";

  /** Description of the {@code system.linux.memory.available} metric. */
  public static final String SYSTEM_LINUX_MEMORY_AVAILABLE_DESCRIPTION =
      "An estimate of how much memory is available for starting new applications, without causing swapping.";

  /** Name of the {@code system.linux.memory.slab.usage} metric. */
  public static final String SYSTEM_LINUX_MEMORY_SLAB_USAGE_NAME = "system.linux.memory.slab.usage";

  /** Unit of the {@code system.linux.memory.slab.usage} metric. */
  public static final String SYSTEM_LINUX_MEMORY_SLAB_USAGE_UNIT = "By";

  /** Description of the {@code system.linux.memory.slab.usage} metric. */
  public static final String SYSTEM_LINUX_MEMORY_SLAB_USAGE_DESCRIPTION =
      "Reports the memory used by the Linux kernel for managing caches of frequently used objects.";

  /** Name of the {@code system.memory.limit} metric. */
  public static final String SYSTEM_MEMORY_LIMIT_NAME = "system.memory.limit";

  /** Unit of the {@code system.memory.limit} metric. */
  public static final String SYSTEM_MEMORY_LIMIT_UNIT = "By";

  /** Description of the {@code system.memory.limit} metric. */
  public static final String SYSTEM_MEMORY_LIMIT_DESCRIPTION =
      "Total virtual memory available in the system.";

  /** Name of the {@code system.memory.shared} metric. */
  public static final String SYSTEM_MEMORY_SHARED_NAME = "system.memory.shared";

  /** Unit of the {@code system.memory.shared} metric. */
  public static final String SYSTEM_MEMORY_SHARED_UNIT = "By";

  /** Description of the {@code system.memory.shared} metric. */
  public static final String SYSTEM_MEMORY_SHARED_DESCRIPTION =
      "Shared memory used (mostly by tmpfs).";

  /** Name of the {@code system.memory.usage} metric. */
  public static final String SYSTEM_MEMORY_USAGE_NAME = "system.memory.usage";

  /** Unit of the {@code system.memory.usage} metric. */
  public static final String SYSTEM_MEMORY_USAGE_UNIT = "By";

  /** Description of the {@code system.memory.usage} metric. */
  public static final String SYSTEM_MEMORY_USAGE_DESCRIPTION = "Reports memory in use by state.";

  /** Name of the {@code system.memory.utilization} metric. */
  public static final String SYSTEM_MEMORY_UTILIZATION_NAME = "system.memory.utilization";

  /** Unit of the {@code system.memory.utilization} metric. */
  public static final String SYSTEM_MEMORY_UTILIZATION_UNIT = "1";

  /** Description of the {@code system.memory.utilization} metric. */
  public static final String SYSTEM_MEMORY_UTILIZATION_DESCRIPTION = "TODO.";

  /** Name of the {@code system.network.connection.count} metric. */
  public static final String SYSTEM_NETWORK_CONNECTION_COUNT_NAME =
      "system.network.connection.count";

  /** Unit of the {@code system.network.connection.count} metric. */
  public static final String SYSTEM_NETWORK_CONNECTION_COUNT_UNIT = "{connection}";

  /** Description of the {@code system.network.connection.count} metric. */
  public static final String SYSTEM_NETWORK_CONNECTION_COUNT_DESCRIPTION = "TODO.";

  /** Name of the {@code system.network.connections} metric. */
  @Deprecated
  public static final String SYSTEM_NETWORK_CONNECTIONS_NAME = "system.network.connections";

  /** Unit of the {@code system.network.connections} metric. */
  @Deprecated public static final String SYSTEM_NETWORK_CONNECTIONS_UNIT = "{connection}";

  /** Description of the {@code system.network.connections} metric. */
  @Deprecated
  public static final String SYSTEM_NETWORK_CONNECTIONS_DESCRIPTION =
      "Deprecated, use `system.network.connection.count` instead.";

  /** Name of the {@code system.network.errors} metric. */
  public static final String SYSTEM_NETWORK_ERRORS_NAME = "system.network.errors";

  /** Unit of the {@code system.network.errors} metric. */
  public static final String SYSTEM_NETWORK_ERRORS_UNIT = "{error}";

  /** Description of the {@code system.network.errors} metric. */
  public static final String SYSTEM_NETWORK_ERRORS_DESCRIPTION =
      "Count of network errors detected.";

  /** Name of the {@code system.network.io} metric. */
  public static final String SYSTEM_NETWORK_IO_NAME = "system.network.io";

  /** Unit of the {@code system.network.io} metric. */
  public static final String SYSTEM_NETWORK_IO_UNIT = "By";

  /** Description of the {@code system.network.io} metric. */
  public static final String SYSTEM_NETWORK_IO_DESCRIPTION = "TODO.";

  /** Name of the {@code system.network.packet.count} metric. */
  public static final String SYSTEM_NETWORK_PACKET_COUNT_NAME = "system.network.packet.count";

  /** Unit of the {@code system.network.packet.count} metric. */
  public static final String SYSTEM_NETWORK_PACKET_COUNT_UNIT = "{packet}";

  /** Description of the {@code system.network.packet.count} metric. */
  public static final String SYSTEM_NETWORK_PACKET_COUNT_DESCRIPTION = "TODO.";

  /** Name of the {@code system.network.packet.dropped} metric. */
  public static final String SYSTEM_NETWORK_PACKET_DROPPED_NAME = "system.network.packet.dropped";

  /** Unit of the {@code system.network.packet.dropped} metric. */
  public static final String SYSTEM_NETWORK_PACKET_DROPPED_UNIT = "{packet}";

  /** Description of the {@code system.network.packet.dropped} metric. */
  public static final String SYSTEM_NETWORK_PACKET_DROPPED_DESCRIPTION =
      "Count of packets that are dropped or discarded even though there was no error.";

  /** Name of the {@code system.paging.faults} metric. */
  public static final String SYSTEM_PAGING_FAULTS_NAME = "system.paging.faults";

  /** Unit of the {@code system.paging.faults} metric. */
  public static final String SYSTEM_PAGING_FAULTS_UNIT = "{fault}";

  /** Description of the {@code system.paging.faults} metric. */
  public static final String SYSTEM_PAGING_FAULTS_DESCRIPTION = "TODO.";

  /** Name of the {@code system.paging.operations} metric. */
  public static final String SYSTEM_PAGING_OPERATIONS_NAME = "system.paging.operations";

  /** Unit of the {@code system.paging.operations} metric. */
  public static final String SYSTEM_PAGING_OPERATIONS_UNIT = "{operation}";

  /** Description of the {@code system.paging.operations} metric. */
  public static final String SYSTEM_PAGING_OPERATIONS_DESCRIPTION = "TODO.";

  /** Name of the {@code system.paging.usage} metric. */
  public static final String SYSTEM_PAGING_USAGE_NAME = "system.paging.usage";

  /** Unit of the {@code system.paging.usage} metric. */
  public static final String SYSTEM_PAGING_USAGE_UNIT = "By";

  /** Description of the {@code system.paging.usage} metric. */
  public static final String SYSTEM_PAGING_USAGE_DESCRIPTION =
      "Unix swap or windows pagefile usage.";

  /** Name of the {@code system.paging.utilization} metric. */
  public static final String SYSTEM_PAGING_UTILIZATION_NAME = "system.paging.utilization";

  /** Unit of the {@code system.paging.utilization} metric. */
  public static final String SYSTEM_PAGING_UTILIZATION_UNIT = "1";

  /** Description of the {@code system.paging.utilization} metric. */
  public static final String SYSTEM_PAGING_UTILIZATION_DESCRIPTION = "TODO.";

  /** Name of the {@code system.process.count} metric. */
  public static final String SYSTEM_PROCESS_COUNT_NAME = "system.process.count";

  /** Unit of the {@code system.process.count} metric. */
  public static final String SYSTEM_PROCESS_COUNT_UNIT = "{process}";

  /** Description of the {@code system.process.count} metric. */
  public static final String SYSTEM_PROCESS_COUNT_DESCRIPTION =
      "Total number of processes in each state.";

  /** Name of the {@code system.process.created} metric. */
  public static final String SYSTEM_PROCESS_CREATED_NAME = "system.process.created";

  /** Unit of the {@code system.process.created} metric. */
  public static final String SYSTEM_PROCESS_CREATED_UNIT = "{process}";

  /** Description of the {@code system.process.created} metric. */
  public static final String SYSTEM_PROCESS_CREATED_DESCRIPTION =
      "Total number of processes created over uptime of the host.";

  /** Name of the {@code system.uptime} metric. */
  public static final String SYSTEM_UPTIME_NAME = "system.uptime";

  /** Unit of the {@code system.uptime} metric. */
  public static final String SYSTEM_UPTIME_UNIT = "s";

  /** Description of the {@code system.uptime} metric. */
  public static final String SYSTEM_UPTIME_DESCRIPTION = "The time the system has been running.";

  private SystemIncubatingMetrics() {}
}
