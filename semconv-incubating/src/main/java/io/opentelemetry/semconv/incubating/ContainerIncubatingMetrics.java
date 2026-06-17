/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class ContainerIncubatingMetrics {
  /** Name of the {@code container.cpu.time} metric. */
  public static final String CONTAINER_CPU_TIME_NAME = "container.cpu.time";

  /** Unit of the {@code container.cpu.time} metric. */
  public static final String CONTAINER_CPU_TIME_UNIT = "s";

  /** Description of the {@code container.cpu.time} metric. */
  public static final String CONTAINER_CPU_TIME_DESCRIPTION = "CPU time consumed.";

  /** Name of the {@code container.cpu.usage} metric. */
  public static final String CONTAINER_CPU_USAGE_NAME = "container.cpu.usage";

  /** Unit of the {@code container.cpu.usage} metric. */
  public static final String CONTAINER_CPU_USAGE_UNIT = "{cpu}";

  /** Description of the {@code container.cpu.usage} metric. */
  public static final String CONTAINER_CPU_USAGE_DESCRIPTION =
      "Container's CPU usage, measured in cpus. Range from 0 to the number of allocatable CPUs.";

  /** Name of the {@code container.disk.io} metric. */
  public static final String CONTAINER_DISK_IO_NAME = "container.disk.io";

  /** Unit of the {@code container.disk.io} metric. */
  public static final String CONTAINER_DISK_IO_UNIT = "By";

  /** Description of the {@code container.disk.io} metric. */
  public static final String CONTAINER_DISK_IO_DESCRIPTION = "Disk bytes for the container.";

  /** Name of the {@code container.filesystem.available} metric. */
  public static final String CONTAINER_FILESYSTEM_AVAILABLE_NAME = "container.filesystem.available";

  /** Unit of the {@code container.filesystem.available} metric. */
  public static final String CONTAINER_FILESYSTEM_AVAILABLE_UNIT = "By";

  /** Description of the {@code container.filesystem.available} metric. */
  public static final String CONTAINER_FILESYSTEM_AVAILABLE_DESCRIPTION =
      "Container filesystem available bytes.";

  /** Name of the {@code container.filesystem.capacity} metric. */
  public static final String CONTAINER_FILESYSTEM_CAPACITY_NAME = "container.filesystem.capacity";

  /** Unit of the {@code container.filesystem.capacity} metric. */
  public static final String CONTAINER_FILESYSTEM_CAPACITY_UNIT = "By";

  /** Description of the {@code container.filesystem.capacity} metric. */
  public static final String CONTAINER_FILESYSTEM_CAPACITY_DESCRIPTION =
      "Container filesystem capacity.";

  /** Name of the {@code container.filesystem.usage} metric. */
  public static final String CONTAINER_FILESYSTEM_USAGE_NAME = "container.filesystem.usage";

  /** Unit of the {@code container.filesystem.usage} metric. */
  public static final String CONTAINER_FILESYSTEM_USAGE_UNIT = "By";

  /** Description of the {@code container.filesystem.usage} metric. */
  public static final String CONTAINER_FILESYSTEM_USAGE_DESCRIPTION = "Container filesystem usage.";

  /** Name of the {@code container.memory.available} metric. */
  public static final String CONTAINER_MEMORY_AVAILABLE_NAME = "container.memory.available";

  /** Unit of the {@code container.memory.available} metric. */
  public static final String CONTAINER_MEMORY_AVAILABLE_UNIT = "By";

  /** Description of the {@code container.memory.available} metric. */
  public static final String CONTAINER_MEMORY_AVAILABLE_DESCRIPTION = "Container memory available.";

  /** Name of the {@code container.memory.paging.faults} metric. */
  public static final String CONTAINER_MEMORY_PAGING_FAULTS_NAME = "container.memory.paging.faults";

  /** Unit of the {@code container.memory.paging.faults} metric. */
  public static final String CONTAINER_MEMORY_PAGING_FAULTS_UNIT = "{fault}";

  /** Description of the {@code container.memory.paging.faults} metric. */
  public static final String CONTAINER_MEMORY_PAGING_FAULTS_DESCRIPTION =
      "Container memory paging faults.";

  /** Name of the {@code container.memory.rss} metric. */
  public static final String CONTAINER_MEMORY_RSS_NAME = "container.memory.rss";

  /** Unit of the {@code container.memory.rss} metric. */
  public static final String CONTAINER_MEMORY_RSS_UNIT = "By";

  /** Description of the {@code container.memory.rss} metric. */
  public static final String CONTAINER_MEMORY_RSS_DESCRIPTION = "Container memory RSS.";

  /** Name of the {@code container.memory.usage} metric. */
  public static final String CONTAINER_MEMORY_USAGE_NAME = "container.memory.usage";

  /** Unit of the {@code container.memory.usage} metric. */
  public static final String CONTAINER_MEMORY_USAGE_UNIT = "By";

  /** Description of the {@code container.memory.usage} metric. */
  public static final String CONTAINER_MEMORY_USAGE_DESCRIPTION = "Memory usage of the container.";

  /** Name of the {@code container.memory.working_set} metric. */
  public static final String CONTAINER_MEMORY_WORKING_SET_NAME = "container.memory.working_set";

  /** Unit of the {@code container.memory.working_set} metric. */
  public static final String CONTAINER_MEMORY_WORKING_SET_UNIT = "By";

  /** Description of the {@code container.memory.working_set} metric. */
  public static final String CONTAINER_MEMORY_WORKING_SET_DESCRIPTION =
      "Container memory working set.";

  /** Name of the {@code container.network.io} metric. */
  public static final String CONTAINER_NETWORK_IO_NAME = "container.network.io";

  /** Unit of the {@code container.network.io} metric. */
  public static final String CONTAINER_NETWORK_IO_UNIT = "By";

  /** Description of the {@code container.network.io} metric. */
  public static final String CONTAINER_NETWORK_IO_DESCRIPTION = "Network bytes for the container.";

  /** Name of the {@code container.uptime} metric. */
  public static final String CONTAINER_UPTIME_NAME = "container.uptime";

  /** Unit of the {@code container.uptime} metric. */
  public static final String CONTAINER_UPTIME_UNIT = "s";

  /** Description of the {@code container.uptime} metric. */
  public static final String CONTAINER_UPTIME_DESCRIPTION =
      "The time the container has been running.";

  private ContainerIncubatingMetrics() {}
}
