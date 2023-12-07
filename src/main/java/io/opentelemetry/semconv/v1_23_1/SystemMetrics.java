/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.instrumentation.api.semconv;

import io.opentelemetry.api.metrics.DoubleGaugeBuilder;
import io.opentelemetry.api.metrics.LongCounterBuilder;
import io.opentelemetry.api.metrics.LongUpDownCounterBuilder;
import io.opentelemetry.api.metrics.Meter;

class SystemMetrics {
  /** Reports the current frequency of the CPU in Hz */
  public static final DoubleGaugeBuilder createSystemCpuFrequency(Meter meter) {
    return meter
        .gaugeBuilder("system.cpu.frequency")
        .setDescription("Reports the current frequency of the CPU in Hz")
        .setUnit("{Hz}");
  }

  /**
   * Reports the number of logical (virtual) processor cores created by the operating system to
   * manage multitasking
   */
  public static final LongUpDownCounterBuilder createSystemCpuLogicalCount(Meter meter) {
    return meter
        .upDownCounterBuilder("system.cpu.logical.count")
        .setDescription(
            "Reports the number of logical (virtual) processor cores created by the operating system to manage multitasking")
        .setUnit("{cpu}");
  }

  /** Reports the number of actual physical processor cores on the hardware */
  public static final LongUpDownCounterBuilder createSystemCpuPhysicalCount(Meter meter) {
    return meter
        .upDownCounterBuilder("system.cpu.physical.count")
        .setDescription("Reports the number of actual physical processor cores on the hardware")
        .setUnit("{cpu}");
  }

  /** Seconds each logical CPU spent on each mode */
  public static final LongCounterBuilder createSystemCpuTime(Meter meter) {
    return meter
        .counterBuilder("system.cpu.time")
        .setDescription("Seconds each logical CPU spent on each mode")
        .setUnit("s");
  }

  /**
   * Difference in system.cpu.time since the last measurement, divided by the elapsed time and
   * number of logical CPUs
   */
  public static final DoubleGaugeBuilder createSystemCpuUtilization(Meter meter) {
    return meter
        .gaugeBuilder("system.cpu.utilization")
        .setDescription(
            "Difference in system.cpu.time since the last measurement, divided by the elapsed time and number of logical CPUs")
        .setUnit("1");
  }

  /** */
  public static final LongCounterBuilder createSystemDiskIo(Meter meter) {
    return meter.counterBuilder("system.disk.io").setDescription("").setUnit("By");
  }

  /** Time disk spent activated */
  public static final LongCounterBuilder createSystemDiskIoTime(Meter meter) {
    return meter
        .counterBuilder("system.disk.io_time")
        .setDescription("Time disk spent activated")
        .setUnit("s");
  }

  /** */
  public static final LongCounterBuilder createSystemDiskMerged(Meter meter) {
    return meter.counterBuilder("system.disk.merged").setDescription("").setUnit("{operation}");
  }

  /** Sum of the time each operation took to complete */
  public static final LongCounterBuilder createSystemDiskOperationTime(Meter meter) {
    return meter
        .counterBuilder("system.disk.operation_time")
        .setDescription("Sum of the time each operation took to complete")
        .setUnit("s");
  }

  /** */
  public static final LongCounterBuilder createSystemDiskOperations(Meter meter) {
    return meter.counterBuilder("system.disk.operations").setDescription("").setUnit("{operation}");
  }

  /** */
  public static final LongUpDownCounterBuilder createSystemFilesystemUsage(Meter meter) {
    return meter.upDownCounterBuilder("system.filesystem.usage").setDescription("").setUnit("By");
  }

  /** */
  public static final DoubleGaugeBuilder createSystemFilesystemUtilization(Meter meter) {
    return meter.gaugeBuilder("system.filesystem.utilization").setDescription("").setUnit("1");
  }

  /**
   * An estimate of how much memory is available for starting new applications, without causing
   * swapping
   */
  public static final LongUpDownCounterBuilder createSystemLinuxMemoryAvailable(Meter meter) {
    return meter
        .upDownCounterBuilder("system.linux.memory.available")
        .setDescription(
            "An estimate of how much memory is available for starting new applications, without causing swapping")
        .setUnit("By");
  }

  /** Total memory available in the system */
  public static final LongUpDownCounterBuilder createSystemMemoryLimit(Meter meter) {
    return meter
        .upDownCounterBuilder("system.memory.limit")
        .setDescription("Total memory available in the system.")
        .setUnit("By");
  }

  /** Reports memory in use by state */
  public static final LongUpDownCounterBuilder createSystemMemoryUsage(Meter meter) {
    return meter
        .upDownCounterBuilder("system.memory.usage")
        .setDescription("Reports memory in use by state.")
        .setUnit("By");
  }

  /** */
  public static final DoubleGaugeBuilder createSystemMemoryUtilization(Meter meter) {
    return meter.gaugeBuilder("system.memory.utilization").setDescription("").setUnit("1");
  }

  /** */
  public static final LongUpDownCounterBuilder createSystemNetworkConnections(Meter meter) {
    return meter
        .upDownCounterBuilder("system.network.connections")
        .setDescription("")
        .setUnit("{connection}");
  }

  /** Count of packets that are dropped or discarded even though there was no error */
  public static final LongCounterBuilder createSystemNetworkDropped(Meter meter) {
    return meter
        .counterBuilder("system.network.dropped")
        .setDescription(
            "Count of packets that are dropped or discarded even though there was no error")
        .setUnit("{packet}");
  }

  /** Count of network errors detected */
  public static final LongCounterBuilder createSystemNetworkErrors(Meter meter) {
    return meter
        .counterBuilder("system.network.errors")
        .setDescription("Count of network errors detected")
        .setUnit("{error}");
  }

  /** */
  public static final LongCounterBuilder createSystemNetworkIo(Meter meter) {
    return meter.counterBuilder("system.network.io").setDescription("").setUnit("By");
  }

  /** */
  public static final LongCounterBuilder createSystemNetworkPackets(Meter meter) {
    return meter.counterBuilder("system.network.packets").setDescription("").setUnit("{packet}");
  }

  /** */
  public static final LongCounterBuilder createSystemPagingFaults(Meter meter) {
    return meter.counterBuilder("system.paging.faults").setDescription("").setUnit("{fault}");
  }

  /** */
  public static final LongCounterBuilder createSystemPagingOperations(Meter meter) {
    return meter
        .counterBuilder("system.paging.operations")
        .setDescription("")
        .setUnit("{operation}");
  }

  /** Unix swap or windows pagefile usage */
  public static final LongUpDownCounterBuilder createSystemPagingUsage(Meter meter) {
    return meter
        .upDownCounterBuilder("system.paging.usage")
        .setDescription("Unix swap or windows pagefile usage")
        .setUnit("By");
  }

  /** */
  public static final DoubleGaugeBuilder createSystemPagingUtilization(Meter meter) {
    return meter.gaugeBuilder("system.paging.utilization").setDescription("").setUnit("1");
  }

  /** Total number of processes in each state */
  public static final LongUpDownCounterBuilder createSystemProcessesCount(Meter meter) {
    return meter
        .upDownCounterBuilder("system.processes.count")
        .setDescription("Total number of processes in each state")
        .setUnit("{process}");
  }

  /** Total number of processes created over uptime of the host */
  public static final LongCounterBuilder createSystemProcessesCreated(Meter meter) {
    return meter
        .counterBuilder("system.processes.created")
        .setDescription("Total number of processes created over uptime of the host")
        .setUnit("{process}");
  }
}
