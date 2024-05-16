/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/java/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class GcpIncubatingAttributes {

  /**
   * The name of the Cloud Run <a
   * href="https://cloud.google.com/run/docs/managing/job-executions">execution</a> being run for
   * the Job, as set by the <a
   * href="https://cloud.google.com/run/docs/container-contract#jobs-env-vars"><code>
   * CLOUD_RUN_EXECUTION</code></a> environment variable.
   */
  public static final AttributeKey<String> GCP_CLOUD_RUN_JOB_EXECUTION =
      stringKey("gcp.cloud_run.job.execution");

  /**
   * The index for a task within an execution as provided by the <a
   * href="https://cloud.google.com/run/docs/container-contract#jobs-env-vars"><code>
   * CLOUD_RUN_TASK_INDEX</code></a> environment variable.
   */
  public static final AttributeKey<Long> GCP_CLOUD_RUN_JOB_TASK_INDEX =
      longKey("gcp.cloud_run.job.task_index");

  private IncubatingGcpIncubatingAttributes() {}
}
