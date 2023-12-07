/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.instrumentation.api.semconv;

import io.opentelemetry.api.metrics.DoubleHistogramBuilder;
import io.opentelemetry.api.metrics.LongCounterBuilder;
import io.opentelemetry.api.metrics.Meter;

class FaasMetrics {
  /** Number of invocation cold starts */
  public static final LongCounterBuilder createFaasColdstarts(Meter meter) {
    return meter
        .counterBuilder("faas.coldstarts")
        .setDescription("Number of invocation cold starts")
        .setUnit("{coldstart}");
  }

  /** Distribution of CPU usage per invocation */
  public static final DoubleHistogramBuilder createFaasCpuUsage(Meter meter) {
    return meter
        .histogramBuilder("faas.cpu_usage")
        .setDescription("Distribution of CPU usage per invocation")
        .setUnit("s");
  }

  /** Number of invocation errors */
  public static final LongCounterBuilder createFaasErrors(Meter meter) {
    return meter
        .counterBuilder("faas.errors")
        .setDescription("Number of invocation errors")
        .setUnit("{error}");
  }

  /** Measures the duration of the function's initialization, such as a cold start */
  public static final DoubleHistogramBuilder createFaasInitDuration(Meter meter) {
    return meter
        .histogramBuilder("faas.init_duration")
        .setDescription(
            "Measures the duration of the function's initialization, such as a cold start")
        .setUnit("s");
  }

  /** Number of successful invocations */
  public static final LongCounterBuilder createFaasInvocations(Meter meter) {
    return meter
        .counterBuilder("faas.invocations")
        .setDescription("Number of successful invocations")
        .setUnit("{invocation}");
  }

  /** Measures the duration of the function's logic execution */
  public static final DoubleHistogramBuilder createFaasInvokeDuration(Meter meter) {
    return meter
        .histogramBuilder("faas.invoke_duration")
        .setDescription("Measures the duration of the function's logic execution")
        .setUnit("s");
  }

  /** Distribution of max memory usage per invocation */
  public static final DoubleHistogramBuilder createFaasMemUsage(Meter meter) {
    return meter
        .histogramBuilder("faas.mem_usage")
        .setDescription("Distribution of max memory usage per invocation")
        .setUnit("By");
  }

  /** Distribution of net I/O usage per invocation */
  public static final DoubleHistogramBuilder createFaasNetIo(Meter meter) {
    return meter
        .histogramBuilder("faas.net_io")
        .setDescription("Distribution of net I/O usage per invocation")
        .setUnit("By");
  }

  /** Number of invocation timeouts */
  public static final LongCounterBuilder createFaasTimeouts(Meter meter) {
    return meter
        .counterBuilder("faas.timeouts")
        .setDescription("Number of invocation timeouts")
        .setUnit("{timeout}");
  }
}
