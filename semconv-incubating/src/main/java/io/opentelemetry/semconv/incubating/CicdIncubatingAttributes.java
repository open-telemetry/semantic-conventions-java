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
  /** The kind of action a pipeline run is performing. */
  public static final AttributeKey<String> CICD_PIPELINE_ACTION_NAME =
      stringKey("cicd.pipeline.action.name");

  /** The human readable name of the pipeline within a CI/CD system. */
  public static final AttributeKey<String> CICD_PIPELINE_NAME = stringKey("cicd.pipeline.name");

  /** The result of a pipeline run. */
  public static final AttributeKey<String> CICD_PIPELINE_RESULT = stringKey("cicd.pipeline.result");

  /** The unique identifier of a pipeline run within a CI/CD system. */
  public static final AttributeKey<String> CICD_PIPELINE_RUN_ID = stringKey("cicd.pipeline.run.id");

  /** The pipeline run goes through these states during its lifecycle. */
  public static final AttributeKey<String> CICD_PIPELINE_RUN_STATE =
      stringKey("cicd.pipeline.run.state");

  /**
   * The <a href="https://wikipedia.org/wiki/URL">URL</a> of the pipeline run, providing the
   * complete address in order to locate and identify the pipeline run.
   */
  public static final AttributeKey<String> CICD_PIPELINE_RUN_URL_FULL =
      stringKey("cicd.pipeline.run.url.full");

  /**
   * The human readable name of a task within a pipeline. Task here most closely aligns with a <a
   * href="https://wikipedia.org/wiki/Pipeline_(computing)">computing process</a> in a pipeline.
   * Other terms for tasks include commands, steps, and procedures.
   */
  public static final AttributeKey<String> CICD_PIPELINE_TASK_NAME =
      stringKey("cicd.pipeline.task.name");

  /** The unique identifier of a task run within a pipeline. */
  public static final AttributeKey<String> CICD_PIPELINE_TASK_RUN_ID =
      stringKey("cicd.pipeline.task.run.id");

  /** The result of a task run. */
  public static final AttributeKey<String> CICD_PIPELINE_TASK_RUN_RESULT =
      stringKey("cicd.pipeline.task.run.result");

  /**
   * The <a href="https://wikipedia.org/wiki/URL">URL</a> of the pipeline task run, providing the
   * complete address in order to locate and identify the pipeline task run.
   */
  public static final AttributeKey<String> CICD_PIPELINE_TASK_RUN_URL_FULL =
      stringKey("cicd.pipeline.task.run.url.full");

  /** The type of the task within a pipeline. */
  public static final AttributeKey<String> CICD_PIPELINE_TASK_TYPE =
      stringKey("cicd.pipeline.task.type");

  /** The name of a component of the CICD system. */
  public static final AttributeKey<String> CICD_SYSTEM_COMPONENT =
      stringKey("cicd.system.component");

  /** The unique identifier of a worker within a CICD system. */
  public static final AttributeKey<String> CICD_WORKER_ID = stringKey("cicd.worker.id");

  /** The name of a worker within a CICD system. */
  public static final AttributeKey<String> CICD_WORKER_NAME = stringKey("cicd.worker.name");

  /** The state of a CICD worker / agent. */
  public static final AttributeKey<String> CICD_WORKER_STATE = stringKey("cicd.worker.state");

  /**
   * The <a href="https://wikipedia.org/wiki/URL">URL</a> of the worker, providing the complete
   * address in order to locate and identify the worker.
   */
  public static final AttributeKey<String> CICD_WORKER_URL_FULL = stringKey("cicd.worker.url.full");

  // Enum definitions

  /** Values for {@link #CICD_PIPELINE_ACTION_NAME}. */
  public static final class CicdPipelineActionNameIncubatingValues {
    /** The pipeline run is executing a build. */
    public static final String BUILD = "BUILD";

    /** The pipeline run is executing. */
    public static final String RUN = "RUN";

    /** The pipeline run is executing a sync. */
    public static final String SYNC = "SYNC";

    private CicdPipelineActionNameIncubatingValues() {}
  }

  /** Values for {@link #CICD_PIPELINE_RESULT}. */
  public static final class CicdPipelineResultIncubatingValues {
    /** The pipeline run finished successfully. */
    public static final String SUCCESS = "success";

    /**
     * The pipeline run did not finish successfully, eg. due to a compile error or a failing test.
     * Such failures are usually detected by non-zero exit codes of the tools executed in the
     * pipeline run.
     */
    public static final String FAILURE = "failure";

    /**
     * The pipeline run failed due to an error in the CICD system, eg. due to the worker being
     * killed.
     */
    public static final String ERROR = "error";

    /** A timeout caused the pipeline run to be interrupted. */
    public static final String TIMEOUT = "timeout";

    /** The pipeline run was cancelled, eg. by a user manually cancelling the pipeline run. */
    public static final String CANCELLATION = "cancellation";

    /** The pipeline run was skipped, eg. due to a precondition not being met. */
    public static final String SKIP = "skip";

    private CicdPipelineResultIncubatingValues() {}
  }

  /** Values for {@link #CICD_PIPELINE_RUN_STATE}. */
  public static final class CicdPipelineRunStateIncubatingValues {
    /**
     * The run pending state spans from the event triggering the pipeline run until the execution of
     * the run starts (eg. time spent in a queue, provisioning agents, creating run resources).
     */
    public static final String PENDING = "pending";

    /** The executing state spans the execution of any run tasks (eg. build, test). */
    public static final String EXECUTING = "executing";

    /**
     * The finalizing state spans from when the run has finished executing (eg. cleanup of run
     * resources).
     */
    public static final String FINALIZING = "finalizing";

    private CicdPipelineRunStateIncubatingValues() {}
  }

  /** Values for {@link #CICD_PIPELINE_TASK_RUN_RESULT}. */
  public static final class CicdPipelineTaskRunResultIncubatingValues {
    /** The task run finished successfully. */
    public static final String SUCCESS = "success";

    /**
     * The task run did not finish successfully, eg. due to a compile error or a failing test. Such
     * failures are usually detected by non-zero exit codes of the tools executed in the task run.
     */
    public static final String FAILURE = "failure";

    /**
     * The task run failed due to an error in the CICD system, eg. due to the worker being killed.
     */
    public static final String ERROR = "error";

    /** A timeout caused the task run to be interrupted. */
    public static final String TIMEOUT = "timeout";

    /** The task run was cancelled, eg. by a user manually cancelling the task run. */
    public static final String CANCELLATION = "cancellation";

    /** The task run was skipped, eg. due to a precondition not being met. */
    public static final String SKIP = "skip";

    private CicdPipelineTaskRunResultIncubatingValues() {}
  }

  /** Values for {@link #CICD_PIPELINE_TASK_TYPE}. */
  public static final class CicdPipelineTaskTypeIncubatingValues {
    /** build */
    public static final String BUILD = "build";

    /** test */
    public static final String TEST = "test";

    /** deploy */
    public static final String DEPLOY = "deploy";

    private CicdPipelineTaskTypeIncubatingValues() {}
  }

  /** Values for {@link #CICD_WORKER_STATE}. */
  public static final class CicdWorkerStateIncubatingValues {
    /**
     * The worker is not performing work for the CICD system. It is available to the CICD system to
     * perform work on (online / idle).
     */
    public static final String AVAILABLE = "available";

    /** The worker is performing work for the CICD system. */
    public static final String BUSY = "busy";

    /** The worker is not available to the CICD system (disconnected / down). */
    public static final String OFFLINE = "offline";

    private CicdWorkerStateIncubatingValues() {}
  }

  private CicdIncubatingAttributes() {}
}
