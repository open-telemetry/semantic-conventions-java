/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class OtelIncubatingAttributes {
  /**
   * A name uniquely identifying the instance of the OpenTelemetry component within its containing
   * SDK instance.
   *
   * <p>Notes:
   *
   * <p>Implementations SHOULD ensure a low cardinality for this attribute, even across application
   * or SDK restarts. E.g. implementations MUST NOT use UUIDs as values for this attribute.
   *
   * <p>Implementations MAY achieve these goals by following a {@code
   * <otel.component.type>/<instance-counter>} pattern, e.g. {@code batching_span_processor/0}.
   * Hereby {@code otel.component.type} refers to the corresponding attribute value of the
   * component.
   *
   * <p>The value of {@code instance-counter} MAY be automatically assigned by the component and
   * uniqueness within the enclosing SDK instance MUST be guaranteed. For example, {@code
   * <instance-counter>} MAY be implemented by using a monotonically increasing counter (starting
   * with {@code 0}), which is incremented every time an instance of the given component type is
   * started.
   *
   * <p>With this implementation, for example the first Batching Span Processor would have {@code
   * batching_span_processor/0} as {@code otel.component.name}, the second one {@code
   * batching_span_processor/1} and so on. These values will therefore be reused in the case of an
   * application restart.
   */
  public static final AttributeKey<String> OTEL_COMPONENT_NAME = stringKey("otel.component.name");

  /**
   * A name identifying the type of the OpenTelemetry component.
   *
   * <p>Notes:
   *
   * <p>If none of the standardized values apply, implementations SHOULD use the language-defined
   * name of the type. E.g. for Java the fully qualified classname SHOULD be used in this case.
   */
  public static final AttributeKey<String> OTEL_COMPONENT_TYPE = stringKey("otel.component.type");

  /**
   * Deprecated. Use the {@code otel.scope.name} attribute
   *
   * @deprecated Replaced by {@code otel.scope.name}.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_LIBRARY_NAME = stringKey("otel.library.name");

  /**
   * Deprecated. Use the {@code otel.scope.version} attribute.
   *
   * @deprecated Replaced by {@code otel.scope.version}.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_LIBRARY_VERSION = stringKey("otel.library.version");

  /**
   * The name of the instrumentation scope - ({@code InstrumentationScope.Name} in OTLP).
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes#OTEL_SCOPE_NAME} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_SCOPE_NAME = stringKey("otel.scope.name");

  /**
   * The version of the instrumentation scope - ({@code InstrumentationScope.Version} in OTLP).
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes#OTEL_SCOPE_VERSION} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_SCOPE_VERSION = stringKey("otel.scope.version");

  /**
   * Determines whether the span has a parent span, and if so, <a
   * href="https://opentelemetry.io/docs/specs/otel/trace/api/#isremote">whether it is a remote
   * parent</a>
   */
  public static final AttributeKey<String> OTEL_SPAN_PARENT_ORIGIN =
      stringKey("otel.span.parent.origin");

  /** The result value of the sampler for this span */
  public static final AttributeKey<String> OTEL_SPAN_SAMPLING_RESULT =
      stringKey("otel.span.sampling_result");

  /**
   * Name of the code, either "OK" or "ERROR". MUST NOT be set if the status code is UNSET.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes#OTEL_STATUS_CODE} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_STATUS_CODE = stringKey("otel.status_code");

  /**
   * Description of the Status if it has a value, otherwise not set.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes#OTEL_STATUS_DESCRIPTION} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> OTEL_STATUS_DESCRIPTION =
      stringKey("otel.status_description");

  // Enum definitions

  /** Values for {@link #OTEL_COMPONENT_TYPE}. */
  public static final class OtelComponentTypeIncubatingValues {
    /** The builtin SDK batching span processor */
    public static final String BATCHING_SPAN_PROCESSOR = "batching_span_processor";

    /** The builtin SDK simple span processor */
    public static final String SIMPLE_SPAN_PROCESSOR = "simple_span_processor";

    /** The builtin SDK batching log record processor */
    public static final String BATCHING_LOG_PROCESSOR = "batching_log_processor";

    /** The builtin SDK simple log record processor */
    public static final String SIMPLE_LOG_PROCESSOR = "simple_log_processor";

    /** OTLP span exporter over gRPC with protobuf serialization */
    public static final String OTLP_GRPC_SPAN_EXPORTER = "otlp_grpc_span_exporter";

    /** OTLP span exporter over HTTP with protobuf serialization */
    public static final String OTLP_HTTP_SPAN_EXPORTER = "otlp_http_span_exporter";

    /** OTLP span exporter over HTTP with JSON serialization */
    public static final String OTLP_HTTP_JSON_SPAN_EXPORTER = "otlp_http_json_span_exporter";

    /** Zipkin span exporter over HTTP */
    public static final String ZIPKIN_HTTP_SPAN_EXPORTER = "zipkin_http_span_exporter";

    /** OTLP log record exporter over gRPC with protobuf serialization */
    public static final String OTLP_GRPC_LOG_EXPORTER = "otlp_grpc_log_exporter";

    /** OTLP log record exporter over HTTP with protobuf serialization */
    public static final String OTLP_HTTP_LOG_EXPORTER = "otlp_http_log_exporter";

    /** OTLP log record exporter over HTTP with JSON serialization */
    public static final String OTLP_HTTP_JSON_LOG_EXPORTER = "otlp_http_json_log_exporter";

    /** The builtin SDK periodically exporting metric reader */
    public static final String PERIODIC_METRIC_READER = "periodic_metric_reader";

    /** OTLP metric exporter over gRPC with protobuf serialization */
    public static final String OTLP_GRPC_METRIC_EXPORTER = "otlp_grpc_metric_exporter";

    /** OTLP metric exporter over HTTP with protobuf serialization */
    public static final String OTLP_HTTP_METRIC_EXPORTER = "otlp_http_metric_exporter";

    /** OTLP metric exporter over HTTP with JSON serialization */
    public static final String OTLP_HTTP_JSON_METRIC_EXPORTER = "otlp_http_json_metric_exporter";

    /** Prometheus metric exporter over HTTP with the default text-based format */
    public static final String PROMETHEUS_HTTP_TEXT_METRIC_EXPORTER =
        "prometheus_http_text_metric_exporter";

    private OtelComponentTypeIncubatingValues() {}
  }

  /** Values for {@link #OTEL_SPAN_PARENT_ORIGIN}. */
  public static final class OtelSpanParentOriginIncubatingValues {
    /** The span does not have a parent, it is a root span */
    public static final String NONE = "none";

    /**
     * The span has a parent and the parent's span context <a
     * href="https://opentelemetry.io/docs/specs/otel/trace/api/#isremote">isRemote()</a> is false
     */
    public static final String LOCAL = "local";

    /**
     * The span has a parent and the parent's span context <a
     * href="https://opentelemetry.io/docs/specs/otel/trace/api/#isremote">isRemote()</a> is true
     */
    public static final String REMOTE = "remote";

    private OtelSpanParentOriginIncubatingValues() {}
  }

  /** Values for {@link #OTEL_SPAN_SAMPLING_RESULT}. */
  public static final class OtelSpanSamplingResultIncubatingValues {
    /** The span is not sampled and not recording */
    public static final String DROP = "DROP";

    /** The span is not sampled, but recording */
    public static final String RECORD_ONLY = "RECORD_ONLY";

    /** The span is sampled and recording */
    public static final String RECORD_AND_SAMPLE = "RECORD_AND_SAMPLE";

    private OtelSpanSamplingResultIncubatingValues() {}
  }

  /**
   * Values for {@link #OTEL_STATUS_CODE}.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.OtelAttributes.OtelStatusCodeValues}.
   */
  @Deprecated
  public static final class OtelStatusCodeIncubatingValues {
    /**
     * The operation has been validated by an Application developer or Operator to have completed
     * successfully.
     */
    public static final String OK = "OK";

    /** The operation contains an error. */
    public static final String ERROR = "ERROR";

    private OtelStatusCodeIncubatingValues() {}
  }

  private OtelIncubatingAttributes() {}
}
