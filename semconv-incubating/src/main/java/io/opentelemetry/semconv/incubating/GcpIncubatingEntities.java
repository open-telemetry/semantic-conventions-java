/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEntities.java.j2
@SuppressWarnings("unused")
public final class GcpIncubatingEntities {
  /**
   * Attributes denoting data from an Application in AppHub. See <a
   * href="https://cloud.google.com/app-hub/docs/overview">AppHub overview</a>.
   */
  public static final String GCP_APPHUB_APPLICATION_TYPE = "gcp.apphub.application";

  /**
   * Attributes denoting data from a Service in AppHub. See <a
   * href="https://cloud.google.com/app-hub/docs/overview">AppHub overview</a>.
   */
  public static final String GCP_APPHUB_SERVICE_TYPE = "gcp.apphub.service";

  /**
   * Attributes denoting data from a Workload in AppHub. See <a
   * href="https://cloud.google.com/app-hub/docs/overview">AppHub overview</a>.
   */
  public static final String GCP_APPHUB_WORKLOAD_TYPE = "gcp.apphub.workload";

  /** Resource used by Google Cloud Run. */
  public static final String GCP_CLOUD_RUN_TYPE = "gcp.cloud_run";

  /** Resources used by Google Compute Engine (GCE). */
  public static final String GCP_GCE_TYPE = "gcp.gce";

  /** A GCE instance group manager. */
  public static final String GCP_GCE_INSTANCE_GROUP_MANAGER_TYPE = "gcp.gce.instance_group_manager";

  private GcpIncubatingEntities() {}
}
