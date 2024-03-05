/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class GcpIncubatingAttributes {
  /**
   * The name of the Cloud Run <a
   * href="https://cloud.google.com/run/docs/managing/job-executions">execution</a> being run for
   * the Job, as set by the <a
   * href="https://cloud.google.com/run/docs/container-contract#jobs-env-vars">{@code
   * CLOUD_RUN_EXECUTION}</a> environment variable.
   */
  public static final AttributeKey<String> GCP_CLOUD_RUN_JOB_EXECUTION =
      stringKey("gcp.cloud_run.job.execution");

  /**
   * The index for a task within an execution as provided by the <a
   * href="https://cloud.google.com/run/docs/container-contract#jobs-env-vars">{@code
   * CLOUD_RUN_TASK_INDEX}</a> environment variable.
   */
  public static final AttributeKey<Long> GCP_CLOUD_RUN_JOB_TASK_INDEX =
      longKey("gcp.cloud_run.job.task_index");

  /**
   * The hostname of a GCE instance. This is the full value of the default or <a
   * href="https://cloud.google.com/compute/docs/instances/custom-hostname-vm">custom hostname</a>.
   */
  public static final AttributeKey<String> GCP_GCE_INSTANCE_HOSTNAME =
      stringKey("gcp.gce.instance.hostname");

  /**
   * The instance name of a GCE instance. This is the value provided by {@code host.name}, the
   * visible name of the instance in the Cloud Console UI, and the prefix for the default hostname
   * of the instance as defined by the <a
   * href="https://cloud.google.com/compute/docs/internal-dns#instance-fully-qualified-domain-names">default
   * internal DNS name</a>.
   */
  public static final AttributeKey<String> GCP_GCE_INSTANCE_NAME =
      stringKey("gcp.gce.instance.name");

  // Enum definitions

  private GcpIncubatingAttributes() {}
}
