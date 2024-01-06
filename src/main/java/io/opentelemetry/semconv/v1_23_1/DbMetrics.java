/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.instrumentation.api.semconv;

import io.opentelemetry.api.metrics.DoubleHistogramBuilder;
import io.opentelemetry.api.metrics.LongCounterBuilder;
import io.opentelemetry.api.metrics.LongUpDownCounterBuilder;
import io.opentelemetry.api.metrics.Meter;

class DbMetrics {
  /** The time it took to create a new connection */
  public static final DoubleHistogramBuilder createDbClientConnectionsCreateTime(Meter meter) {
    return meter
        .histogramBuilder("db.client.connections.create_time")
        .setDescription("The time it took to create a new connection")
        .setUnit("ms");
  }

  /** The maximum number of idle open connections allowed */
  public static final LongUpDownCounterBuilder createDbClientConnectionsIdleMax(Meter meter) {
    return meter
        .upDownCounterBuilder("db.client.connections.idle.max")
        .setDescription("The maximum number of idle open connections allowed")
        .setUnit("{connection}");
  }

  /** The minimum number of idle open connections allowed */
  public static final LongUpDownCounterBuilder createDbClientConnectionsIdleMin(Meter meter) {
    return meter
        .upDownCounterBuilder("db.client.connections.idle.min")
        .setDescription("The minimum number of idle open connections allowed")
        .setUnit("{connection}");
  }

  /** The maximum number of open connections allowed */
  public static final LongUpDownCounterBuilder createDbClientConnectionsMax(Meter meter) {
    return meter
        .upDownCounterBuilder("db.client.connections.max")
        .setDescription("The maximum number of open connections allowed")
        .setUnit("{connection}");
  }

  /** The number of pending requests for an open connection, cumulative for the entire pool */
  public static final LongUpDownCounterBuilder createDbClientConnectionsPendingRequests(
      Meter meter) {
    return meter
        .upDownCounterBuilder("db.client.connections.pending_requests")
        .setDescription(
            "The number of pending requests for an open connection, cumulative for the entire pool")
        .setUnit("{request}");
  }

  /**
   * The number of connection timeouts that have occurred trying to obtain a connection from the
   * pool
   */
  public static final LongCounterBuilder createDbClientConnectionsTimeouts(Meter meter) {
    return meter
        .counterBuilder("db.client.connections.timeouts")
        .setDescription(
            "The number of connection timeouts that have occurred trying to obtain a connection from the pool")
        .setUnit("{timeout}");
  }

  /** The number of connections that are currently in state described by the `state` attribute */
  public static final LongUpDownCounterBuilder createDbClientConnectionsUsage(Meter meter) {
    return meter
        .upDownCounterBuilder("db.client.connections.usage")
        .setDescription(
            "The number of connections that are currently in state described by the `state` attribute")
        .setUnit("{connection}");
  }

  /** The time between borrowing a connection and returning it to the pool */
  public static final DoubleHistogramBuilder createDbClientConnectionsUseTime(Meter meter) {
    return meter
        .histogramBuilder("db.client.connections.use_time")
        .setDescription("The time between borrowing a connection and returning it to the pool")
        .setUnit("ms");
  }

  /** The time it took to obtain an open connection from the pool */
  public static final DoubleHistogramBuilder createDbClientConnectionsWaitTime(Meter meter) {
    return meter
        .histogramBuilder("db.client.connections.wait_time")
        .setDescription("The time it took to obtain an open connection from the pool")
        .setUnit("ms");
  }
}
