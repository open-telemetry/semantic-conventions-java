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
public final class CicdIncubatingAttributes {
  /** The human readable name of the pipeline within a CI/CD system */
  public static final AttributeKey<String> CICD_PIPELINE_NAME = stringKey("cicd.pipeline.name");

  /** The unique identifier of a pipeline run within a CI/CD system */
  public static final AttributeKey<String> CICD_PIPELINE_RUN_ID = stringKey("cicd.pipeline.run.id");

  /**
   * The human readable name of a task within a pipeline. Task here most closely aligns with a <a
   * href="https://en.wikipedia.org/wiki/Pipeline_(computing)">computing process</a> in a pipeline.
   * Other terms for tasks include commands, steps, and procedures
   */
  public static final AttributeKey<String> CICD_PIPELINE_TASK_NAME =
      stringKey("cicd.pipeline.task.name");

  /** The unique identifier of a task run within a pipeline */
  public static final AttributeKey<String> CICD_PIPELINE_TASK_RUN_ID =
      stringKey("cicd.pipeline.task.run.id");

  /**
   * The <a href="https://en.wikipedia.org/wiki/URL">URL</a> of the pipeline run providing the
   * complete address in order to locate and identify the pipeline run
   */
  public static final AttributeKey<String> CICD_PIPELINE_TASK_RUN_URL_FULL =
      stringKey("cicd.pipeline.task.run.url.full");

  /** The type of the task within a pipeline */
  public static final AttributeKey<String> CICD_PIPELINE_TASK_TYPE =
      stringKey("cicd.pipeline.task.type");

  // Enum definitions
  /** Values for {@link #CICD_PIPELINE_TASK_TYPE}. */
  public static final class CicdPipelineTaskTypeValues {
    /** build */
    public static final String BUILD = "build";

    /** test */
    public static final String TEST = "test";

    /** deploy */
    public static final String DEPLOY = "deploy";

    private CicdPipelineTaskTypeValues() {}
  }

  private CicdIncubatingAttributes() {}
}
