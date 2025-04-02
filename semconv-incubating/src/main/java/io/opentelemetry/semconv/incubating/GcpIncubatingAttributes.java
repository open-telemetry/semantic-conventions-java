/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class GcpIncubatingAttributes {
  /** The container within GCP where the AppHub application is defined. */
  public static final AttributeKey<String> GCP_APPHUB_APPLICATION_CONTAINER =
      stringKey("gcp.apphub.application.container");

  /** The name of the application as configured in AppHub. */
  public static final AttributeKey<String> GCP_APPHUB_APPLICATION_ID =
      stringKey("gcp.apphub.application.id");

  /** The GCP zone or region where the application is defined. */
  public static final AttributeKey<String> GCP_APPHUB_APPLICATION_LOCATION =
      stringKey("gcp.apphub.application.location");

  /**
   * Criticality of a service indicates its importance to the business.
   *
   * <p>Notes:
   *
   * <p><a href="https://cloud.google.com/app-hub/docs/reference/rest/v1/Attributes#type">See AppHub
   * type enum</a>
   */
  public static final AttributeKey<String> GCP_APPHUB_SERVICE_CRITICALITY_TYPE =
      stringKey("gcp.apphub.service.criticality_type");

  /**
   * Environment of a service is the stage of a software lifecycle.
   *
   * <p>Notes:
   *
   * <p><a href="https://cloud.google.com/app-hub/docs/reference/rest/v1/Attributes#type_1">See
   * AppHub environment type</a>
   */
  public static final AttributeKey<String> GCP_APPHUB_SERVICE_ENVIRONMENT_TYPE =
      stringKey("gcp.apphub.service.environment_type");

  /** The name of the service as configured in AppHub. */
  public static final AttributeKey<String> GCP_APPHUB_SERVICE_ID =
      stringKey("gcp.apphub.service.id");

  /**
   * Criticality of a workload indicates its importance to the business.
   *
   * <p>Notes:
   *
   * <p><a href="https://cloud.google.com/app-hub/docs/reference/rest/v1/Attributes#type">See AppHub
   * type enum</a>
   */
  public static final AttributeKey<String> GCP_APPHUB_WORKLOAD_CRITICALITY_TYPE =
      stringKey("gcp.apphub.workload.criticality_type");

  /**
   * Environment of a workload is the stage of a software lifecycle.
   *
   * <p>Notes:
   *
   * <p><a href="https://cloud.google.com/app-hub/docs/reference/rest/v1/Attributes#type_1">See
   * AppHub environment type</a>
   */
  public static final AttributeKey<String> GCP_APPHUB_WORKLOAD_ENVIRONMENT_TYPE =
      stringKey("gcp.apphub.workload.environment_type");

  /** The name of the workload as configured in AppHub. */
  public static final AttributeKey<String> GCP_APPHUB_WORKLOAD_ID =
      stringKey("gcp.apphub.workload.id");

  /**
   * Identifies the Google Cloud service for which the official client library is intended.
   *
   * <p>Notes:
   *
   * <p>Intended to be a stable identifier for Google Cloud client libraries that is uniform across
   * implementation languages. The value should be derived from the canonical service domain for the
   * service; for example, 'foo.googleapis.com' should result in a value of 'foo'.
   */
  public static final AttributeKey<String> GCP_CLIENT_SERVICE = stringKey("gcp.client.service");

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
  /** Values for {@link #GCP_APPHUB_SERVICE_CRITICALITY_TYPE}. */
  public static final class GcpApphubServiceCriticalityTypeIncubatingValues {
    /** Mission critical service. */
    public static final String MISSION_CRITICAL = "MISSION_CRITICAL";

    /** High impact. */
    public static final String HIGH = "HIGH";

    /** Medium impact. */
    public static final String MEDIUM = "MEDIUM";

    /** Low impact. */
    public static final String LOW = "LOW";

    private GcpApphubServiceCriticalityTypeIncubatingValues() {}
  }

  /** Values for {@link #GCP_APPHUB_SERVICE_ENVIRONMENT_TYPE}. */
  public static final class GcpApphubServiceEnvironmentTypeIncubatingValues {
    /** Production environment. */
    public static final String PRODUCTION = "PRODUCTION";

    /** Staging environment. */
    public static final String STAGING = "STAGING";

    /** Test environment. */
    public static final String TEST = "TEST";

    /** Development environment. */
    public static final String DEVELOPMENT = "DEVELOPMENT";

    private GcpApphubServiceEnvironmentTypeIncubatingValues() {}
  }

  /** Values for {@link #GCP_APPHUB_WORKLOAD_CRITICALITY_TYPE}. */
  public static final class GcpApphubWorkloadCriticalityTypeIncubatingValues {
    /** Mission critical service. */
    public static final String MISSION_CRITICAL = "MISSION_CRITICAL";

    /** High impact. */
    public static final String HIGH = "HIGH";

    /** Medium impact. */
    public static final String MEDIUM = "MEDIUM";

    /** Low impact. */
    public static final String LOW = "LOW";

    private GcpApphubWorkloadCriticalityTypeIncubatingValues() {}
  }

  /** Values for {@link #GCP_APPHUB_WORKLOAD_ENVIRONMENT_TYPE}. */
  public static final class GcpApphubWorkloadEnvironmentTypeIncubatingValues {
    /** Production environment. */
    public static final String PRODUCTION = "PRODUCTION";

    /** Staging environment. */
    public static final String STAGING = "STAGING";

    /** Test environment. */
    public static final String TEST = "TEST";

    /** Development environment. */
    public static final String DEVELOPMENT = "DEVELOPMENT";

    private GcpApphubWorkloadEnvironmentTypeIncubatingValues() {}
  }

  private GcpIncubatingAttributes() {}
}
