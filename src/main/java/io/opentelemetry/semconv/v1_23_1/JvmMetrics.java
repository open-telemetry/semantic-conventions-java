/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.instrumentation.api.semconv;

import io.opentelemetry.api.metrics.DoubleGaugeBuilder;
import io.opentelemetry.api.metrics.DoubleHistogramBuilder;
import io.opentelemetry.api.metrics.LongCounterBuilder;
import io.opentelemetry.api.metrics.LongUpDownCounterBuilder;
import io.opentelemetry.api.metrics.Meter;

class JvmMetrics {
  /** Number of buffers in the pool */
  public static final LongUpDownCounterBuilder createJvmBufferCount(Meter meter) {
    return meter
        .upDownCounterBuilder("jvm.buffer.count")
        .setDescription("Number of buffers in the pool.")
        .setUnit("{buffer}");
  }

  /** Measure of total memory capacity of buffers */
  public static final LongUpDownCounterBuilder createJvmBufferMemoryLimit(Meter meter) {
    return meter
        .upDownCounterBuilder("jvm.buffer.memory.limit")
        .setDescription("Measure of total memory capacity of buffers.")
        .setUnit("By");
  }

  /** Measure of memory used by buffers */
  public static final LongUpDownCounterBuilder createJvmBufferMemoryUsage(Meter meter) {
    return meter
        .upDownCounterBuilder("jvm.buffer.memory.usage")
        .setDescription("Measure of memory used by buffers.")
        .setUnit("By");
  }

  /** Number of classes currently loaded */
  public static final LongUpDownCounterBuilder createJvmClassCount(Meter meter) {
    return meter
        .upDownCounterBuilder("jvm.class.count")
        .setDescription("Number of classes currently loaded.")
        .setUnit("{class}");
  }

  /** Number of classes loaded since JVM start */
  public static final LongCounterBuilder createJvmClassLoaded(Meter meter) {
    return meter
        .counterBuilder("jvm.class.loaded")
        .setDescription("Number of classes loaded since JVM start.")
        .setUnit("{class}");
  }

  /** Number of classes unloaded since JVM start */
  public static final LongCounterBuilder createJvmClassUnloaded(Meter meter) {
    return meter
        .counterBuilder("jvm.class.unloaded")
        .setDescription("Number of classes unloaded since JVM start.")
        .setUnit("{class}");
  }

  /** Number of processors available to the Java virtual machine */
  public static final LongUpDownCounterBuilder createJvmCpuCount(Meter meter) {
    return meter
        .upDownCounterBuilder("jvm.cpu.count")
        .setDescription("Number of processors available to the Java virtual machine.")
        .setUnit("{cpu}");
  }

  /** Recent CPU utilization for the process as reported by the JVM */
  public static final DoubleGaugeBuilder createJvmCpuRecentUtilization(Meter meter) {
    return meter
        .gaugeBuilder("jvm.cpu.recent_utilization")
        .setDescription("Recent CPU utilization for the process as reported by the JVM.")
        .setUnit("1");
  }

  /** CPU time used by the process as reported by the JVM */
  public static final LongCounterBuilder createJvmCpuTime(Meter meter) {
    return meter
        .counterBuilder("jvm.cpu.time")
        .setDescription("CPU time used by the process as reported by the JVM.")
        .setUnit("s");
  }

  /** Duration of JVM garbage collection actions */
  public static final DoubleHistogramBuilder createJvmGcDuration(Meter meter) {
    return meter
        .histogramBuilder("jvm.gc.duration")
        .setDescription("Duration of JVM garbage collection actions.")
        .setUnit("s");
  }

  /** Measure of memory committed */
  public static final LongUpDownCounterBuilder createJvmMemoryCommitted(Meter meter) {
    return meter
        .upDownCounterBuilder("jvm.memory.committed")
        .setDescription("Measure of memory committed.")
        .setUnit("By");
  }

  /** Measure of initial memory requested */
  public static final LongUpDownCounterBuilder createJvmMemoryInit(Meter meter) {
    return meter
        .upDownCounterBuilder("jvm.memory.init")
        .setDescription("Measure of initial memory requested.")
        .setUnit("By");
  }

  /** Measure of max obtainable memory */
  public static final LongUpDownCounterBuilder createJvmMemoryLimit(Meter meter) {
    return meter
        .upDownCounterBuilder("jvm.memory.limit")
        .setDescription("Measure of max obtainable memory.")
        .setUnit("By");
  }

  /** Measure of memory used */
  public static final LongUpDownCounterBuilder createJvmMemoryUsage(Meter meter) {
    return meter
        .upDownCounterBuilder("jvm.memory.usage")
        .setDescription("Measure of memory used.")
        .setUnit("By");
  }

  /**
   * Measure of memory used, as measured after the most recent garbage collection event on this pool
   */
  public static final LongUpDownCounterBuilder createJvmMemoryUsageAfterLastGc(Meter meter) {
    return meter
        .upDownCounterBuilder("jvm.memory.usage_after_last_gc")
        .setDescription(
            "Measure of memory used, as measured after the most recent garbage collection event on this pool.")
        .setUnit("By");
  }

  /** Average CPU load of the whole system for the last minute as reported by the JVM */
  public static final DoubleGaugeBuilder createJvmSystemCpuLoad1m(Meter meter) {
    return meter
        .gaugeBuilder("jvm.system.cpu.load_1m")
        .setDescription(
            "Average CPU load of the whole system for the last minute as reported by the JVM.")
        .setUnit("{run_queue_item}");
  }

  /** Recent CPU utilization for the whole system as reported by the JVM */
  public static final DoubleGaugeBuilder createJvmSystemCpuUtilization(Meter meter) {
    return meter
        .gaugeBuilder("jvm.system.cpu.utilization")
        .setDescription("Recent CPU utilization for the whole system as reported by the JVM.")
        .setUnit("1");
  }

  /** Number of executing platform threads */
  public static final LongUpDownCounterBuilder createJvmThreadCount(Meter meter) {
    return meter
        .upDownCounterBuilder("jvm.thread.count")
        .setDescription("Number of executing platform threads.")
        .setUnit("{thread}");
  }
}
