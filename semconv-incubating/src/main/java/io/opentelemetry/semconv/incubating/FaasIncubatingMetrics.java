/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class FaasIncubatingMetrics {

  /** Name of the {@code faas.coldstarts} metric. */
  public static final String FAAS_COLDSTARTS_NAME = "faas.coldstarts";

  /** Unit of the {@code faas.coldstarts} metric. */
  public static final String FAAS_COLDSTARTS_UNIT = "{coldstart}";

  /** Description of the {@code faas.coldstarts} metric. */
  public static final String FAAS_COLDSTARTS_DESCRIPTION = "Number of invocation cold starts.";

  /** Name of the {@code faas.cpu_usage} metric. */
  public static final String FAAS_CPU_USAGE_NAME = "faas.cpu_usage";

  /** Unit of the {@code faas.cpu_usage} metric. */
  public static final String FAAS_CPU_USAGE_UNIT = "s";

  /** Description of the {@code faas.cpu_usage} metric. */
  public static final String FAAS_CPU_USAGE_DESCRIPTION =
      "Distribution of CPU usage per invocation.";

  /** Name of the {@code faas.errors} metric. */
  public static final String FAAS_ERRORS_NAME = "faas.errors";

  /** Unit of the {@code faas.errors} metric. */
  public static final String FAAS_ERRORS_UNIT = "{error}";

  /** Description of the {@code faas.errors} metric. */
  public static final String FAAS_ERRORS_DESCRIPTION = "Number of invocation errors.";

  /** Name of the {@code faas.init_duration} metric. */
  public static final String FAAS_INIT_DURATION_NAME = "faas.init_duration";

  /** Unit of the {@code faas.init_duration} metric. */
  public static final String FAAS_INIT_DURATION_UNIT = "s";

  /** Description of the {@code faas.init_duration} metric. */
  public static final String FAAS_INIT_DURATION_DESCRIPTION =
      "Measures the duration of the function's initialization, such as a cold start.";

  /** Name of the {@code faas.invocations} metric. */
  public static final String FAAS_INVOCATIONS_NAME = "faas.invocations";

  /** Unit of the {@code faas.invocations} metric. */
  public static final String FAAS_INVOCATIONS_UNIT = "{invocation}";

  /** Description of the {@code faas.invocations} metric. */
  public static final String FAAS_INVOCATIONS_DESCRIPTION = "Number of successful invocations.";

  /** Name of the {@code faas.invoke_duration} metric. */
  public static final String FAAS_INVOKE_DURATION_NAME = "faas.invoke_duration";

  /** Unit of the {@code faas.invoke_duration} metric. */
  public static final String FAAS_INVOKE_DURATION_UNIT = "s";

  /** Description of the {@code faas.invoke_duration} metric. */
  public static final String FAAS_INVOKE_DURATION_DESCRIPTION =
      "Measures the duration of the function's logic execution.";

  /** Name of the {@code faas.mem_usage} metric. */
  public static final String FAAS_MEM_USAGE_NAME = "faas.mem_usage";

  /** Unit of the {@code faas.mem_usage} metric. */
  public static final String FAAS_MEM_USAGE_UNIT = "By";

  /** Description of the {@code faas.mem_usage} metric. */
  public static final String FAAS_MEM_USAGE_DESCRIPTION =
      "Distribution of max memory usage per invocation.";

  /** Name of the {@code faas.net_io} metric. */
  public static final String FAAS_NET_IO_NAME = "faas.net_io";

  /** Unit of the {@code faas.net_io} metric. */
  public static final String FAAS_NET_IO_UNIT = "By";

  /** Description of the {@code faas.net_io} metric. */
  public static final String FAAS_NET_IO_DESCRIPTION =
      "Distribution of net I/O usage per invocation.";

  /** Name of the {@code faas.timeouts} metric. */
  public static final String FAAS_TIMEOUTS_NAME = "faas.timeouts";

  /** Unit of the {@code faas.timeouts} metric. */
  public static final String FAAS_TIMEOUTS_UNIT = "{timeout}";

  /** Description of the {@code faas.timeouts} metric. */
  public static final String FAAS_TIMEOUTS_DESCRIPTION = "Number of invocation timeouts.";

  private FaasIncubatingMetrics() {}
}
