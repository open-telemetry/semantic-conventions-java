/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.instrumentation.api.semconv;

import io.opentelemetry.api.metrics.DoubleHistogramBuilder;
import io.opentelemetry.api.metrics.LongUpDownCounterBuilder;
import io.opentelemetry.api.metrics.Meter;

class HttpMetrics {
  /** Size of HTTP client request bodies */
  public static final DoubleHistogramBuilder createHttpClientRequestBodySize(Meter meter) {
    return meter
        .histogramBuilder("http.client.request.body.size")
        .setDescription("Size of HTTP client request bodies.")
        .setUnit("By");
  }

  /** Duration of HTTP client requests */
  public static final DoubleHistogramBuilder createHttpClientRequestDuration(Meter meter) {
    return meter
        .histogramBuilder("http.client.request.duration")
        .setDescription("Duration of HTTP client requests.")
        .setUnit("s");
  }

  /** Size of HTTP client response bodies */
  public static final DoubleHistogramBuilder createHttpClientResponseBodySize(Meter meter) {
    return meter
        .histogramBuilder("http.client.response.body.size")
        .setDescription("Size of HTTP client response bodies.")
        .setUnit("By");
  }

  /** Number of active HTTP server requests */
  public static final LongUpDownCounterBuilder createHttpServerActiveRequests(Meter meter) {
    return meter
        .upDownCounterBuilder("http.server.active_requests")
        .setDescription("Number of active HTTP server requests.")
        .setUnit("{request}");
  }

  /** Size of HTTP server request bodies */
  public static final DoubleHistogramBuilder createHttpServerRequestBodySize(Meter meter) {
    return meter
        .histogramBuilder("http.server.request.body.size")
        .setDescription("Size of HTTP server request bodies.")
        .setUnit("By");
  }

  /** Duration of HTTP server requests */
  public static final DoubleHistogramBuilder createHttpServerRequestDuration(Meter meter) {
    return meter
        .histogramBuilder("http.server.request.duration")
        .setDescription("Duration of HTTP server requests.")
        .setUnit("s");
  }

  /** Size of HTTP server response bodies */
  public static final DoubleHistogramBuilder createHttpServerResponseBodySize(Meter meter) {
    return meter
        .histogramBuilder("http.server.response.body.size")
        .setDescription("Size of HTTP server response bodies.")
        .setUnit("By");
  }
}
