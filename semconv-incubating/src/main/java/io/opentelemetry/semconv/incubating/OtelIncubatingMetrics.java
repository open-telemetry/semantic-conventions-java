/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class OtelIncubatingMetrics {

  /** Name of the {@code otel.sdk.exporter.log.exported} metric. */
  public static final String OTEL_SDK_EXPORTER_LOG_EXPORTED_NAME = "otel.sdk.exporter.log.exported";

  /** Unit of the {@code otel.sdk.exporter.log.exported} metric. */
  public static final String OTEL_SDK_EXPORTER_LOG_EXPORTED_UNIT = "{log_record}";

  /** Description of the {@code otel.sdk.exporter.log.exported} metric. */
  public static final String OTEL_SDK_EXPORTER_LOG_EXPORTED_DESCRIPTION =
      "The number of log records for which the export has finished, either successful or failed.";

  /** Name of the {@code otel.sdk.exporter.log.inflight} metric. */
  public static final String OTEL_SDK_EXPORTER_LOG_INFLIGHT_NAME = "otel.sdk.exporter.log.inflight";

  /** Unit of the {@code otel.sdk.exporter.log.inflight} metric. */
  public static final String OTEL_SDK_EXPORTER_LOG_INFLIGHT_UNIT = "{log_record}";

  /** Description of the {@code otel.sdk.exporter.log.inflight} metric. */
  public static final String OTEL_SDK_EXPORTER_LOG_INFLIGHT_DESCRIPTION =
      "The number of log records which were passed to the exporter, but that have not been exported yet (neither successful, nor failed).";

  /** Name of the {@code otel.sdk.exporter.metric_data_point.exported} metric. */
  public static final String OTEL_SDK_EXPORTER_METRIC_DATA_POINT_EXPORTED_NAME =
      "otel.sdk.exporter.metric_data_point.exported";

  /** Unit of the {@code otel.sdk.exporter.metric_data_point.exported} metric. */
  public static final String OTEL_SDK_EXPORTER_METRIC_DATA_POINT_EXPORTED_UNIT = "{data_point}";

  /** Description of the {@code otel.sdk.exporter.metric_data_point.exported} metric. */
  public static final String OTEL_SDK_EXPORTER_METRIC_DATA_POINT_EXPORTED_DESCRIPTION =
      "The number of metric data points for which the export has finished, either successful or failed.";

  /** Name of the {@code otel.sdk.exporter.metric_data_point.inflight} metric. */
  public static final String OTEL_SDK_EXPORTER_METRIC_DATA_POINT_INFLIGHT_NAME =
      "otel.sdk.exporter.metric_data_point.inflight";

  /** Unit of the {@code otel.sdk.exporter.metric_data_point.inflight} metric. */
  public static final String OTEL_SDK_EXPORTER_METRIC_DATA_POINT_INFLIGHT_UNIT = "{data_point}";

  /** Description of the {@code otel.sdk.exporter.metric_data_point.inflight} metric. */
  public static final String OTEL_SDK_EXPORTER_METRIC_DATA_POINT_INFLIGHT_DESCRIPTION =
      "The number of metric data points which were passed to the exporter, but that have not been exported yet (neither successful, nor failed).";

  /** Name of the {@code otel.sdk.exporter.operation.duration} metric. */
  public static final String OTEL_SDK_EXPORTER_OPERATION_DURATION_NAME =
      "otel.sdk.exporter.operation.duration";

  /** Unit of the {@code otel.sdk.exporter.operation.duration} metric. */
  public static final String OTEL_SDK_EXPORTER_OPERATION_DURATION_UNIT = "s";

  /** Description of the {@code otel.sdk.exporter.operation.duration} metric. */
  public static final String OTEL_SDK_EXPORTER_OPERATION_DURATION_DESCRIPTION =
      "The duration of exporting a batch of telemetry records.";

  /** Name of the {@code otel.sdk.exporter.span.exported} metric. */
  public static final String OTEL_SDK_EXPORTER_SPAN_EXPORTED_NAME =
      "otel.sdk.exporter.span.exported";

  /** Unit of the {@code otel.sdk.exporter.span.exported} metric. */
  public static final String OTEL_SDK_EXPORTER_SPAN_EXPORTED_UNIT = "{span}";

  /** Description of the {@code otel.sdk.exporter.span.exported} metric. */
  public static final String OTEL_SDK_EXPORTER_SPAN_EXPORTED_DESCRIPTION =
      "The number of spans for which the export has finished, either successful or failed.";

  /** Name of the {@code otel.sdk.exporter.span.exported.count} metric. */
  @Deprecated
  public static final String OTEL_SDK_EXPORTER_SPAN_EXPORTED_COUNT_NAME =
      "otel.sdk.exporter.span.exported.count";

  /** Unit of the {@code otel.sdk.exporter.span.exported.count} metric. */
  @Deprecated public static final String OTEL_SDK_EXPORTER_SPAN_EXPORTED_COUNT_UNIT = "{span}";

  /** Description of the {@code otel.sdk.exporter.span.exported.count} metric. */
  @Deprecated
  public static final String OTEL_SDK_EXPORTER_SPAN_EXPORTED_COUNT_DESCRIPTION =
      "Deprecated, use `otel.sdk.exporter.span.exported` instead.";

  /** Name of the {@code otel.sdk.exporter.span.inflight} metric. */
  public static final String OTEL_SDK_EXPORTER_SPAN_INFLIGHT_NAME =
      "otel.sdk.exporter.span.inflight";

  /** Unit of the {@code otel.sdk.exporter.span.inflight} metric. */
  public static final String OTEL_SDK_EXPORTER_SPAN_INFLIGHT_UNIT = "{span}";

  /** Description of the {@code otel.sdk.exporter.span.inflight} metric. */
  public static final String OTEL_SDK_EXPORTER_SPAN_INFLIGHT_DESCRIPTION =
      "The number of spans which were passed to the exporter, but that have not been exported yet (neither successful, nor failed).";

  /** Name of the {@code otel.sdk.exporter.span.inflight.count} metric. */
  @Deprecated
  public static final String OTEL_SDK_EXPORTER_SPAN_INFLIGHT_COUNT_NAME =
      "otel.sdk.exporter.span.inflight.count";

  /** Unit of the {@code otel.sdk.exporter.span.inflight.count} metric. */
  @Deprecated public static final String OTEL_SDK_EXPORTER_SPAN_INFLIGHT_COUNT_UNIT = "{span}";

  /** Description of the {@code otel.sdk.exporter.span.inflight.count} metric. */
  @Deprecated
  public static final String OTEL_SDK_EXPORTER_SPAN_INFLIGHT_COUNT_DESCRIPTION =
      "Deprecated, use `otel.sdk.exporter.span.inflight` instead.";

  /** Name of the {@code otel.sdk.log.created} metric. */
  public static final String OTEL_SDK_LOG_CREATED_NAME = "otel.sdk.log.created";

  /** Unit of the {@code otel.sdk.log.created} metric. */
  public static final String OTEL_SDK_LOG_CREATED_UNIT = "{log_record}";

  /** Description of the {@code otel.sdk.log.created} metric. */
  public static final String OTEL_SDK_LOG_CREATED_DESCRIPTION =
      "The number of logs submitted to enabled SDK Loggers.";

  /** Name of the {@code otel.sdk.metric_reader.collection.duration} metric. */
  public static final String OTEL_SDK_METRIC_READER_COLLECTION_DURATION_NAME =
      "otel.sdk.metric_reader.collection.duration";

  /** Unit of the {@code otel.sdk.metric_reader.collection.duration} metric. */
  public static final String OTEL_SDK_METRIC_READER_COLLECTION_DURATION_UNIT = "s";

  /** Description of the {@code otel.sdk.metric_reader.collection.duration} metric. */
  public static final String OTEL_SDK_METRIC_READER_COLLECTION_DURATION_DESCRIPTION =
      "The duration of the collect operation of the metric reader.";

  /** Name of the {@code otel.sdk.processor.log.processed} metric. */
  public static final String OTEL_SDK_PROCESSOR_LOG_PROCESSED_NAME =
      "otel.sdk.processor.log.processed";

  /** Unit of the {@code otel.sdk.processor.log.processed} metric. */
  public static final String OTEL_SDK_PROCESSOR_LOG_PROCESSED_UNIT = "{log_record}";

  /** Description of the {@code otel.sdk.processor.log.processed} metric. */
  public static final String OTEL_SDK_PROCESSOR_LOG_PROCESSED_DESCRIPTION =
      "The number of log records for which the processing has finished, either successful or failed.";

  /** Name of the {@code otel.sdk.processor.log.queue.capacity} metric. */
  public static final String OTEL_SDK_PROCESSOR_LOG_QUEUE_CAPACITY_NAME =
      "otel.sdk.processor.log.queue.capacity";

  /** Unit of the {@code otel.sdk.processor.log.queue.capacity} metric. */
  public static final String OTEL_SDK_PROCESSOR_LOG_QUEUE_CAPACITY_UNIT = "{log_record}";

  /** Description of the {@code otel.sdk.processor.log.queue.capacity} metric. */
  public static final String OTEL_SDK_PROCESSOR_LOG_QUEUE_CAPACITY_DESCRIPTION =
      "The maximum number of log records the queue of a given instance of an SDK Log Record processor can hold.";

  /** Name of the {@code otel.sdk.processor.log.queue.size} metric. */
  public static final String OTEL_SDK_PROCESSOR_LOG_QUEUE_SIZE_NAME =
      "otel.sdk.processor.log.queue.size";

  /** Unit of the {@code otel.sdk.processor.log.queue.size} metric. */
  public static final String OTEL_SDK_PROCESSOR_LOG_QUEUE_SIZE_UNIT = "{log_record}";

  /** Description of the {@code otel.sdk.processor.log.queue.size} metric. */
  public static final String OTEL_SDK_PROCESSOR_LOG_QUEUE_SIZE_DESCRIPTION =
      "The number of log records in the queue of a given instance of an SDK log processor.";

  /** Name of the {@code otel.sdk.processor.span.processed} metric. */
  public static final String OTEL_SDK_PROCESSOR_SPAN_PROCESSED_NAME =
      "otel.sdk.processor.span.processed";

  /** Unit of the {@code otel.sdk.processor.span.processed} metric. */
  public static final String OTEL_SDK_PROCESSOR_SPAN_PROCESSED_UNIT = "{span}";

  /** Description of the {@code otel.sdk.processor.span.processed} metric. */
  public static final String OTEL_SDK_PROCESSOR_SPAN_PROCESSED_DESCRIPTION =
      "The number of spans for which the processing has finished, either successful or failed.";

  /** Name of the {@code otel.sdk.processor.span.processed.count} metric. */
  @Deprecated
  public static final String OTEL_SDK_PROCESSOR_SPAN_PROCESSED_COUNT_NAME =
      "otel.sdk.processor.span.processed.count";

  /** Unit of the {@code otel.sdk.processor.span.processed.count} metric. */
  @Deprecated public static final String OTEL_SDK_PROCESSOR_SPAN_PROCESSED_COUNT_UNIT = "{span}";

  /** Description of the {@code otel.sdk.processor.span.processed.count} metric. */
  @Deprecated
  public static final String OTEL_SDK_PROCESSOR_SPAN_PROCESSED_COUNT_DESCRIPTION =
      "Deprecated, use `otel.sdk.processor.span.processed` instead.";

  /** Name of the {@code otel.sdk.processor.span.queue.capacity} metric. */
  public static final String OTEL_SDK_PROCESSOR_SPAN_QUEUE_CAPACITY_NAME =
      "otel.sdk.processor.span.queue.capacity";

  /** Unit of the {@code otel.sdk.processor.span.queue.capacity} metric. */
  public static final String OTEL_SDK_PROCESSOR_SPAN_QUEUE_CAPACITY_UNIT = "{span}";

  /** Description of the {@code otel.sdk.processor.span.queue.capacity} metric. */
  public static final String OTEL_SDK_PROCESSOR_SPAN_QUEUE_CAPACITY_DESCRIPTION =
      "The maximum number of spans the queue of a given instance of an SDK span processor can hold.";

  /** Name of the {@code otel.sdk.processor.span.queue.size} metric. */
  public static final String OTEL_SDK_PROCESSOR_SPAN_QUEUE_SIZE_NAME =
      "otel.sdk.processor.span.queue.size";

  /** Unit of the {@code otel.sdk.processor.span.queue.size} metric. */
  public static final String OTEL_SDK_PROCESSOR_SPAN_QUEUE_SIZE_UNIT = "{span}";

  /** Description of the {@code otel.sdk.processor.span.queue.size} metric. */
  public static final String OTEL_SDK_PROCESSOR_SPAN_QUEUE_SIZE_DESCRIPTION =
      "The number of spans in the queue of a given instance of an SDK span processor.";

  /** Name of the {@code otel.sdk.span.ended} metric. */
  @Deprecated public static final String OTEL_SDK_SPAN_ENDED_NAME = "otel.sdk.span.ended";

  /** Unit of the {@code otel.sdk.span.ended} metric. */
  @Deprecated public static final String OTEL_SDK_SPAN_ENDED_UNIT = "{span}";

  /** Description of the {@code otel.sdk.span.ended} metric. */
  @Deprecated
  public static final String OTEL_SDK_SPAN_ENDED_DESCRIPTION =
      "Use `otel.sdk.span.started` minus `otel.sdk.span.live` to derive this value.";

  /** Name of the {@code otel.sdk.span.ended.count} metric. */
  @Deprecated
  public static final String OTEL_SDK_SPAN_ENDED_COUNT_NAME = "otel.sdk.span.ended.count";

  /** Unit of the {@code otel.sdk.span.ended.count} metric. */
  @Deprecated public static final String OTEL_SDK_SPAN_ENDED_COUNT_UNIT = "{span}";

  /** Description of the {@code otel.sdk.span.ended.count} metric. */
  @Deprecated
  public static final String OTEL_SDK_SPAN_ENDED_COUNT_DESCRIPTION =
      "Use `otel.sdk.span.started` minus `otel.sdk.span.live` to derive this value.";

  /** Name of the {@code otel.sdk.span.live} metric. */
  public static final String OTEL_SDK_SPAN_LIVE_NAME = "otel.sdk.span.live";

  /** Unit of the {@code otel.sdk.span.live} metric. */
  public static final String OTEL_SDK_SPAN_LIVE_UNIT = "{span}";

  /** Description of the {@code otel.sdk.span.live} metric. */
  public static final String OTEL_SDK_SPAN_LIVE_DESCRIPTION =
      "The number of created spans with `recording=true` for which the end operation has not been called yet.";

  /** Name of the {@code otel.sdk.span.live.count} metric. */
  @Deprecated public static final String OTEL_SDK_SPAN_LIVE_COUNT_NAME = "otel.sdk.span.live.count";

  /** Unit of the {@code otel.sdk.span.live.count} metric. */
  @Deprecated public static final String OTEL_SDK_SPAN_LIVE_COUNT_UNIT = "{span}";

  /** Description of the {@code otel.sdk.span.live.count} metric. */
  @Deprecated
  public static final String OTEL_SDK_SPAN_LIVE_COUNT_DESCRIPTION =
      "Deprecated, use `otel.sdk.span.live` instead.";

  /** Name of the {@code otel.sdk.span.started} metric. */
  public static final String OTEL_SDK_SPAN_STARTED_NAME = "otel.sdk.span.started";

  /** Unit of the {@code otel.sdk.span.started} metric. */
  public static final String OTEL_SDK_SPAN_STARTED_UNIT = "{span}";

  /** Description of the {@code otel.sdk.span.started} metric. */
  public static final String OTEL_SDK_SPAN_STARTED_DESCRIPTION = "The number of created spans.";

  private OtelIncubatingMetrics() {}
}
