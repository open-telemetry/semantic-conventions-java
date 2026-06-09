/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class CicdIncubatingMetrics {

  /** Name of the {@code cicd.pipeline.run.active} metric. */
  public static final String CICD_PIPELINE_RUN_ACTIVE_NAME = "cicd.pipeline.run.active";

  /** Unit of the {@code cicd.pipeline.run.active} metric. */
  public static final String CICD_PIPELINE_RUN_ACTIVE_UNIT = "{run}";

  /** Description of the {@code cicd.pipeline.run.active} metric. */
  public static final String CICD_PIPELINE_RUN_ACTIVE_DESCRIPTION =
      "The number of pipeline runs currently active in the system by state.";

  /** Name of the {@code cicd.pipeline.run.duration} metric. */
  public static final String CICD_PIPELINE_RUN_DURATION_NAME = "cicd.pipeline.run.duration";

  /** Unit of the {@code cicd.pipeline.run.duration} metric. */
  public static final String CICD_PIPELINE_RUN_DURATION_UNIT = "s";

  /** Description of the {@code cicd.pipeline.run.duration} metric. */
  public static final String CICD_PIPELINE_RUN_DURATION_DESCRIPTION =
      "Duration of a pipeline run grouped by pipeline, state and result.";

  /** Name of the {@code cicd.pipeline.run.errors} metric. */
  public static final String CICD_PIPELINE_RUN_ERRORS_NAME = "cicd.pipeline.run.errors";

  /** Unit of the {@code cicd.pipeline.run.errors} metric. */
  public static final String CICD_PIPELINE_RUN_ERRORS_UNIT = "{error}";

  /** Description of the {@code cicd.pipeline.run.errors} metric. */
  public static final String CICD_PIPELINE_RUN_ERRORS_DESCRIPTION =
      "The number of errors encountered in pipeline runs (eg. compile, test failures).";

  /** Name of the {@code cicd.system.errors} metric. */
  public static final String CICD_SYSTEM_ERRORS_NAME = "cicd.system.errors";

  /** Unit of the {@code cicd.system.errors} metric. */
  public static final String CICD_SYSTEM_ERRORS_UNIT = "{error}";

  /** Description of the {@code cicd.system.errors} metric. */
  public static final String CICD_SYSTEM_ERRORS_DESCRIPTION =
      "The number of errors in a component of the CICD system (eg. controller, scheduler, agent).";

  /** Name of the {@code cicd.worker.count} metric. */
  public static final String CICD_WORKER_COUNT_NAME = "cicd.worker.count";

  /** Unit of the {@code cicd.worker.count} metric. */
  public static final String CICD_WORKER_COUNT_UNIT = "{count}";

  /** Description of the {@code cicd.worker.count} metric. */
  public static final String CICD_WORKER_COUNT_DESCRIPTION =
      "The number of workers on the CICD system by state.";

  private CicdIncubatingMetrics() {}
}
