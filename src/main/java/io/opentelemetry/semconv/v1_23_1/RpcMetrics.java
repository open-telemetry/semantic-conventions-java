/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.instrumentation.api.semconv;

import io.opentelemetry.api.metrics.DoubleHistogramBuilder;
import io.opentelemetry.api.metrics.Meter;

class RpcMetrics {
  /** Measures the duration of outbound RPC */
  public static final DoubleHistogramBuilder createRpcClientDuration(Meter meter) {
    return meter
        .histogramBuilder("rpc.client.duration")
        .setDescription("Measures the duration of outbound RPC.")
        .setUnit("ms");
  }

  /** Measures the size of RPC request messages (uncompressed) */
  public static final DoubleHistogramBuilder createRpcClientRequestSize(Meter meter) {
    return meter
        .histogramBuilder("rpc.client.request.size")
        .setDescription("Measures the size of RPC request messages (uncompressed).")
        .setUnit("By");
  }

  /** Measures the number of messages received per RPC */
  public static final DoubleHistogramBuilder createRpcClientRequestsPerRpc(Meter meter) {
    return meter
        .histogramBuilder("rpc.client.requests_per_rpc")
        .setDescription("Measures the number of messages received per RPC.")
        .setUnit("{count}");
  }

  /** Measures the size of RPC response messages (uncompressed) */
  public static final DoubleHistogramBuilder createRpcClientResponseSize(Meter meter) {
    return meter
        .histogramBuilder("rpc.client.response.size")
        .setDescription("Measures the size of RPC response messages (uncompressed).")
        .setUnit("By");
  }

  /** Measures the number of messages sent per RPC */
  public static final DoubleHistogramBuilder createRpcClientResponsesPerRpc(Meter meter) {
    return meter
        .histogramBuilder("rpc.client.responses_per_rpc")
        .setDescription("Measures the number of messages sent per RPC.")
        .setUnit("{count}");
  }

  /** Measures the duration of inbound RPC */
  public static final DoubleHistogramBuilder createRpcServerDuration(Meter meter) {
    return meter
        .histogramBuilder("rpc.server.duration")
        .setDescription("Measures the duration of inbound RPC.")
        .setUnit("ms");
  }

  /** Measures the size of RPC request messages (uncompressed) */
  public static final DoubleHistogramBuilder createRpcServerRequestSize(Meter meter) {
    return meter
        .histogramBuilder("rpc.server.request.size")
        .setDescription("Measures the size of RPC request messages (uncompressed).")
        .setUnit("By");
  }

  /** Measures the number of messages received per RPC */
  public static final DoubleHistogramBuilder createRpcServerRequestsPerRpc(Meter meter) {
    return meter
        .histogramBuilder("rpc.server.requests_per_rpc")
        .setDescription("Measures the number of messages received per RPC.")
        .setUnit("{count}");
  }

  /** Measures the size of RPC response messages (uncompressed) */
  public static final DoubleHistogramBuilder createRpcServerResponseSize(Meter meter) {
    return meter
        .histogramBuilder("rpc.server.response.size")
        .setDescription("Measures the size of RPC response messages (uncompressed).")
        .setUnit("By");
  }

  /** Measures the number of messages sent per RPC */
  public static final DoubleHistogramBuilder createRpcServerResponsesPerRpc(Meter meter) {
    return meter
        .histogramBuilder("rpc.server.responses_per_rpc")
        .setDescription("Measures the number of messages sent per RPC.")
        .setUnit("{count}");
  }
}
