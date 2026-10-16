/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEntities.java.j2
@SuppressWarnings("unused")
public final class CicdIncubatingEntities {
  /** A pipeline is a series of automated steps that helps software teams deliver code. */
  public static final String CICD_PIPELINE_TYPE = "cicd.pipeline";

  /** A pipeline run is a singular execution of a given pipeline's tasks. */
  public static final String CICD_PIPELINE_RUN_TYPE = "cicd.pipeline.run";

  /**
   * A CI/CD worker is a component of the CI/CD system that performs work (eg. running pipeline
   * tasks or performing sync). A single pipeline run may be distributed across multiple workers.
   * Any OpenTelemetry signal associated with a worker should be associated to the worker that
   * performed the corresponding work. For example, when a pipeline run involves several workers,
   * its task run spans may reference the different {@code cicd.worker} resources corresponding to
   * the workers that executed each task run. The pipeline run's parent span may instead reference
   * the CI/CD controller as the {@code cicd.worker} resource.
   */
  public static final String CICD_WORKER_TYPE = "cicd.worker";

  private CicdIncubatingEntities() {}
}
