/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class K8sIncubatingMetrics {
  /**
   * Name of the {@code k8s.container.cpu.limit} metric.
   *
   * @deprecated Replaced by {@code k8s.container.cpu.limit.desired}.
   */
  @Deprecated public static final String K8S_CONTAINER_CPU_LIMIT_NAME = "k8s.container.cpu.limit";

  /**
   * Unit of the {@code k8s.container.cpu.limit} metric.
   *
   * @deprecated Replaced by {@code k8s.container.cpu.limit.desired}.
   */
  @Deprecated public static final String K8S_CONTAINER_CPU_LIMIT_UNIT = "{cpu}";

  /**
   * Description of the {@code k8s.container.cpu.limit} metric.
   *
   * @deprecated Replaced by {@code k8s.container.cpu.limit.desired}.
   */
  @Deprecated
  public static final String K8S_CONTAINER_CPU_LIMIT_DESCRIPTION =
      "Deprecated, use `k8s.container.cpu.limit.desired` and `k8s.container.cpu.limit.current` instead.";

  /** Name of the {@code k8s.container.cpu.limit.current} metric. */
  public static final String K8S_CONTAINER_CPU_LIMIT_CURRENT_NAME =
      "k8s.container.cpu.limit.current";

  /** Unit of the {@code k8s.container.cpu.limit.current} metric. */
  public static final String K8S_CONTAINER_CPU_LIMIT_CURRENT_UNIT = "{cpu}";

  /** Description of the {@code k8s.container.cpu.limit.current} metric. */
  public static final String K8S_CONTAINER_CPU_LIMIT_CURRENT_DESCRIPTION =
      "Maximum CPU resource limit currently configured for a running container.";

  /** Name of the {@code k8s.container.cpu.limit.desired} metric. */
  public static final String K8S_CONTAINER_CPU_LIMIT_DESIRED_NAME =
      "k8s.container.cpu.limit.desired";

  /** Unit of the {@code k8s.container.cpu.limit.desired} metric. */
  public static final String K8S_CONTAINER_CPU_LIMIT_DESIRED_UNIT = "{cpu}";

  /** Description of the {@code k8s.container.cpu.limit.desired} metric. */
  public static final String K8S_CONTAINER_CPU_LIMIT_DESIRED_DESCRIPTION =
      "Maximum CPU resource limit as defined by the container spec.";

  /** Name of the {@code k8s.container.cpu.limit.utilization} metric. */
  public static final String K8S_CONTAINER_CPU_LIMIT_UTILIZATION_NAME =
      "k8s.container.cpu.limit.utilization";

  /** Unit of the {@code k8s.container.cpu.limit.utilization} metric. */
  public static final String K8S_CONTAINER_CPU_LIMIT_UTILIZATION_UNIT = "1";

  /** Description of the {@code k8s.container.cpu.limit.utilization} metric. */
  public static final String K8S_CONTAINER_CPU_LIMIT_UTILIZATION_DESCRIPTION =
      "The ratio of container CPU usage to its current CPU limit.";

  /**
   * Name of the {@code k8s.container.cpu.request} metric.
   *
   * @deprecated Replaced by {@code k8s.container.cpu.request.desired}.
   */
  @Deprecated
  public static final String K8S_CONTAINER_CPU_REQUEST_NAME = "k8s.container.cpu.request";

  /**
   * Unit of the {@code k8s.container.cpu.request} metric.
   *
   * @deprecated Replaced by {@code k8s.container.cpu.request.desired}.
   */
  @Deprecated public static final String K8S_CONTAINER_CPU_REQUEST_UNIT = "{cpu}";

  /**
   * Description of the {@code k8s.container.cpu.request} metric.
   *
   * @deprecated Replaced by {@code k8s.container.cpu.request.desired}.
   */
  @Deprecated
  public static final String K8S_CONTAINER_CPU_REQUEST_DESCRIPTION =
      "Deprecated, use `k8s.container.cpu.request.desired` and `k8s.container.cpu.request.current` instead.";

  /** Name of the {@code k8s.container.cpu.request.current} metric. */
  public static final String K8S_CONTAINER_CPU_REQUEST_CURRENT_NAME =
      "k8s.container.cpu.request.current";

  /** Unit of the {@code k8s.container.cpu.request.current} metric. */
  public static final String K8S_CONTAINER_CPU_REQUEST_CURRENT_UNIT = "{cpu}";

  /** Description of the {@code k8s.container.cpu.request.current} metric. */
  public static final String K8S_CONTAINER_CPU_REQUEST_CURRENT_DESCRIPTION =
      "CPU resource requested currently configured for a running container.";

  /** Name of the {@code k8s.container.cpu.request.desired} metric. */
  public static final String K8S_CONTAINER_CPU_REQUEST_DESIRED_NAME =
      "k8s.container.cpu.request.desired";

  /** Unit of the {@code k8s.container.cpu.request.desired} metric. */
  public static final String K8S_CONTAINER_CPU_REQUEST_DESIRED_UNIT = "{cpu}";

  /** Description of the {@code k8s.container.cpu.request.desired} metric. */
  public static final String K8S_CONTAINER_CPU_REQUEST_DESIRED_DESCRIPTION =
      "CPU resource requested as defined by the container spec.";

  /** Name of the {@code k8s.container.cpu.request.utilization} metric. */
  public static final String K8S_CONTAINER_CPU_REQUEST_UTILIZATION_NAME =
      "k8s.container.cpu.request.utilization";

  /** Unit of the {@code k8s.container.cpu.request.utilization} metric. */
  public static final String K8S_CONTAINER_CPU_REQUEST_UTILIZATION_UNIT = "1";

  /** Description of the {@code k8s.container.cpu.request.utilization} metric. */
  public static final String K8S_CONTAINER_CPU_REQUEST_UTILIZATION_DESCRIPTION =
      "The ratio of container CPU usage to its current CPU request.";

  /** Name of the {@code k8s.container.ephemeral_storage.limit} metric. */
  public static final String K8S_CONTAINER_EPHEMERAL_STORAGE_LIMIT_NAME =
      "k8s.container.ephemeral_storage.limit";

  /** Unit of the {@code k8s.container.ephemeral_storage.limit} metric. */
  public static final String K8S_CONTAINER_EPHEMERAL_STORAGE_LIMIT_UNIT = "By";

  /** Description of the {@code k8s.container.ephemeral_storage.limit} metric. */
  public static final String K8S_CONTAINER_EPHEMERAL_STORAGE_LIMIT_DESCRIPTION =
      "Maximum ephemeral storage resource limit set for the container.";

  /** Name of the {@code k8s.container.ephemeral_storage.request} metric. */
  public static final String K8S_CONTAINER_EPHEMERAL_STORAGE_REQUEST_NAME =
      "k8s.container.ephemeral_storage.request";

  /** Unit of the {@code k8s.container.ephemeral_storage.request} metric. */
  public static final String K8S_CONTAINER_EPHEMERAL_STORAGE_REQUEST_UNIT = "By";

  /** Description of the {@code k8s.container.ephemeral_storage.request} metric. */
  public static final String K8S_CONTAINER_EPHEMERAL_STORAGE_REQUEST_DESCRIPTION =
      "Ephemeral storage resource requested for the container.";

  /** Name of the {@code k8s.container.ephemeral_storage.usage} metric. */
  public static final String K8S_CONTAINER_EPHEMERAL_STORAGE_USAGE_NAME =
      "k8s.container.ephemeral_storage.usage";

  /** Unit of the {@code k8s.container.ephemeral_storage.usage} metric. */
  public static final String K8S_CONTAINER_EPHEMERAL_STORAGE_USAGE_UNIT = "By";

  /** Description of the {@code k8s.container.ephemeral_storage.usage} metric. */
  public static final String K8S_CONTAINER_EPHEMERAL_STORAGE_USAGE_DESCRIPTION =
      "The ephemeral storage used by a container.";

  /**
   * Name of the {@code k8s.container.memory.limit} metric.
   *
   * @deprecated Replaced by {@code k8s.container.memory.limit.desired}.
   */
  @Deprecated
  public static final String K8S_CONTAINER_MEMORY_LIMIT_NAME = "k8s.container.memory.limit";

  /**
   * Unit of the {@code k8s.container.memory.limit} metric.
   *
   * @deprecated Replaced by {@code k8s.container.memory.limit.desired}.
   */
  @Deprecated public static final String K8S_CONTAINER_MEMORY_LIMIT_UNIT = "By";

  /**
   * Description of the {@code k8s.container.memory.limit} metric.
   *
   * @deprecated Replaced by {@code k8s.container.memory.limit.desired}.
   */
  @Deprecated
  public static final String K8S_CONTAINER_MEMORY_LIMIT_DESCRIPTION =
      "Deprecated, use `k8s.container.memory.limit.desired` and `k8s.container.memory.limit.current` instead.";

  /** Name of the {@code k8s.container.memory.limit.current} metric. */
  public static final String K8S_CONTAINER_MEMORY_LIMIT_CURRENT_NAME =
      "k8s.container.memory.limit.current";

  /** Unit of the {@code k8s.container.memory.limit.current} metric. */
  public static final String K8S_CONTAINER_MEMORY_LIMIT_CURRENT_UNIT = "By";

  /** Description of the {@code k8s.container.memory.limit.current} metric. */
  public static final String K8S_CONTAINER_MEMORY_LIMIT_CURRENT_DESCRIPTION =
      "Maximum memory resource limit currently configured for a running container.";

  /** Name of the {@code k8s.container.memory.limit.desired} metric. */
  public static final String K8S_CONTAINER_MEMORY_LIMIT_DESIRED_NAME =
      "k8s.container.memory.limit.desired";

  /** Unit of the {@code k8s.container.memory.limit.desired} metric. */
  public static final String K8S_CONTAINER_MEMORY_LIMIT_DESIRED_UNIT = "By";

  /** Description of the {@code k8s.container.memory.limit.desired} metric. */
  public static final String K8S_CONTAINER_MEMORY_LIMIT_DESIRED_DESCRIPTION =
      "Maximum memory resource limit as defined by the container spec.";

  /**
   * Name of the {@code k8s.container.memory.request} metric.
   *
   * @deprecated Replaced by {@code k8s.container.memory.request.desired}.
   */
  @Deprecated
  public static final String K8S_CONTAINER_MEMORY_REQUEST_NAME = "k8s.container.memory.request";

  /**
   * Unit of the {@code k8s.container.memory.request} metric.
   *
   * @deprecated Replaced by {@code k8s.container.memory.request.desired}.
   */
  @Deprecated public static final String K8S_CONTAINER_MEMORY_REQUEST_UNIT = "By";

  /**
   * Description of the {@code k8s.container.memory.request} metric.
   *
   * @deprecated Replaced by {@code k8s.container.memory.request.desired}.
   */
  @Deprecated
  public static final String K8S_CONTAINER_MEMORY_REQUEST_DESCRIPTION =
      "Deprecated, use `k8s.container.memory.request.desired` and `k8s.container.memory.request.current` instead.";

  /** Name of the {@code k8s.container.memory.request.current} metric. */
  public static final String K8S_CONTAINER_MEMORY_REQUEST_CURRENT_NAME =
      "k8s.container.memory.request.current";

  /** Unit of the {@code k8s.container.memory.request.current} metric. */
  public static final String K8S_CONTAINER_MEMORY_REQUEST_CURRENT_UNIT = "By";

  /** Description of the {@code k8s.container.memory.request.current} metric. */
  public static final String K8S_CONTAINER_MEMORY_REQUEST_CURRENT_DESCRIPTION =
      "Memory resource request currently configured for a running container.";

  /** Name of the {@code k8s.container.memory.request.desired} metric. */
  public static final String K8S_CONTAINER_MEMORY_REQUEST_DESIRED_NAME =
      "k8s.container.memory.request.desired";

  /** Unit of the {@code k8s.container.memory.request.desired} metric. */
  public static final String K8S_CONTAINER_MEMORY_REQUEST_DESIRED_UNIT = "By";

  /** Description of the {@code k8s.container.memory.request.desired} metric. */
  public static final String K8S_CONTAINER_MEMORY_REQUEST_DESIRED_DESCRIPTION =
      "Memory resource requested as defined by the container spec.";

  /** Name of the {@code k8s.container.ready} metric. */
  public static final String K8S_CONTAINER_READY_NAME = "k8s.container.ready";

  /** Unit of the {@code k8s.container.ready} metric. */
  public static final String K8S_CONTAINER_READY_UNIT = "{container}";

  /** Description of the {@code k8s.container.ready} metric. */
  public static final String K8S_CONTAINER_READY_DESCRIPTION =
      "Indicates whether the container is currently marked as ready to accept traffic, based on its readiness probe (1 = ready, 0 = not ready). ";

  /** Name of the {@code k8s.container.restart.count} metric. */
  public static final String K8S_CONTAINER_RESTART_COUNT_NAME = "k8s.container.restart.count";

  /** Unit of the {@code k8s.container.restart.count} metric. */
  public static final String K8S_CONTAINER_RESTART_COUNT_UNIT = "{restart}";

  /** Description of the {@code k8s.container.restart.count} metric. */
  public static final String K8S_CONTAINER_RESTART_COUNT_DESCRIPTION =
      "Describes how many times the container has restarted (since the last counter reset).";

  /** Name of the {@code k8s.container.status.reason} metric. */
  public static final String K8S_CONTAINER_STATUS_REASON_NAME = "k8s.container.status.reason";

  /** Unit of the {@code k8s.container.status.reason} metric. */
  public static final String K8S_CONTAINER_STATUS_REASON_UNIT = "{container}";

  /** Description of the {@code k8s.container.status.reason} metric. */
  public static final String K8S_CONTAINER_STATUS_REASON_DESCRIPTION =
      "Describes the number of K8s containers that are currently in a state for a given reason.";

  /** Name of the {@code k8s.container.status.state} metric. */
  public static final String K8S_CONTAINER_STATUS_STATE_NAME = "k8s.container.status.state";

  /** Unit of the {@code k8s.container.status.state} metric. */
  public static final String K8S_CONTAINER_STATUS_STATE_UNIT = "{container}";

  /** Description of the {@code k8s.container.status.state} metric. */
  public static final String K8S_CONTAINER_STATUS_STATE_DESCRIPTION =
      "Describes the number of K8s containers that are currently in a given state.";

  /** Name of the {@code k8s.container.storage.limit} metric. */
  public static final String K8S_CONTAINER_STORAGE_LIMIT_NAME = "k8s.container.storage.limit";

  /** Unit of the {@code k8s.container.storage.limit} metric. */
  public static final String K8S_CONTAINER_STORAGE_LIMIT_UNIT = "By";

  /** Description of the {@code k8s.container.storage.limit} metric. */
  public static final String K8S_CONTAINER_STORAGE_LIMIT_DESCRIPTION =
      "Maximum storage resource limit set for the container.";

  /** Name of the {@code k8s.container.storage.request} metric. */
  public static final String K8S_CONTAINER_STORAGE_REQUEST_NAME = "k8s.container.storage.request";

  /** Unit of the {@code k8s.container.storage.request} metric. */
  public static final String K8S_CONTAINER_STORAGE_REQUEST_UNIT = "By";

  /** Description of the {@code k8s.container.storage.request} metric. */
  public static final String K8S_CONTAINER_STORAGE_REQUEST_DESCRIPTION =
      "Storage resource requested for the container.";

  /**
   * Name of the {@code k8s.cronjob.active_jobs} metric.
   *
   * @deprecated Replaced by {@code k8s.cronjob.job.active}.
   */
  @Deprecated public static final String K8S_CRONJOB_ACTIVE_JOBS_NAME = "k8s.cronjob.active_jobs";

  /**
   * Unit of the {@code k8s.cronjob.active_jobs} metric.
   *
   * @deprecated Replaced by {@code k8s.cronjob.job.active}.
   */
  @Deprecated public static final String K8S_CRONJOB_ACTIVE_JOBS_UNIT = "{job}";

  /**
   * Description of the {@code k8s.cronjob.active_jobs} metric.
   *
   * @deprecated Replaced by {@code k8s.cronjob.job.active}.
   */
  @Deprecated
  public static final String K8S_CRONJOB_ACTIVE_JOBS_DESCRIPTION =
      "Deprecated, use `k8s.cronjob.job.active` instead.";

  /** Name of the {@code k8s.cronjob.job.active} metric. */
  public static final String K8S_CRONJOB_JOB_ACTIVE_NAME = "k8s.cronjob.job.active";

  /** Unit of the {@code k8s.cronjob.job.active} metric. */
  public static final String K8S_CRONJOB_JOB_ACTIVE_UNIT = "{job}";

  /** Description of the {@code k8s.cronjob.job.active} metric. */
  public static final String K8S_CRONJOB_JOB_ACTIVE_DESCRIPTION =
      "The number of actively running jobs for a cronjob.";

  /**
   * Name of the {@code k8s.daemonset.current_scheduled_nodes} metric.
   *
   * @deprecated Replaced by {@code k8s.daemonset.node.current_scheduled}.
   */
  @Deprecated
  public static final String K8S_DAEMONSET_CURRENT_SCHEDULED_NODES_NAME =
      "k8s.daemonset.current_scheduled_nodes";

  /**
   * Unit of the {@code k8s.daemonset.current_scheduled_nodes} metric.
   *
   * @deprecated Replaced by {@code k8s.daemonset.node.current_scheduled}.
   */
  @Deprecated public static final String K8S_DAEMONSET_CURRENT_SCHEDULED_NODES_UNIT = "{node}";

  /**
   * Description of the {@code k8s.daemonset.current_scheduled_nodes} metric.
   *
   * @deprecated Replaced by {@code k8s.daemonset.node.current_scheduled}.
   */
  @Deprecated
  public static final String K8S_DAEMONSET_CURRENT_SCHEDULED_NODES_DESCRIPTION =
      "Deprecated, use `k8s.daemonset.node.current_scheduled` instead.";

  /**
   * Name of the {@code k8s.daemonset.desired_scheduled_nodes} metric.
   *
   * @deprecated Replaced by {@code k8s.daemonset.node.desired_scheduled}.
   */
  @Deprecated
  public static final String K8S_DAEMONSET_DESIRED_SCHEDULED_NODES_NAME =
      "k8s.daemonset.desired_scheduled_nodes";

  /**
   * Unit of the {@code k8s.daemonset.desired_scheduled_nodes} metric.
   *
   * @deprecated Replaced by {@code k8s.daemonset.node.desired_scheduled}.
   */
  @Deprecated public static final String K8S_DAEMONSET_DESIRED_SCHEDULED_NODES_UNIT = "{node}";

  /**
   * Description of the {@code k8s.daemonset.desired_scheduled_nodes} metric.
   *
   * @deprecated Replaced by {@code k8s.daemonset.node.desired_scheduled}.
   */
  @Deprecated
  public static final String K8S_DAEMONSET_DESIRED_SCHEDULED_NODES_DESCRIPTION =
      "Deprecated, use `k8s.daemonset.node.desired_scheduled` instead.";

  /**
   * Name of the {@code k8s.daemonset.misscheduled_nodes} metric.
   *
   * @deprecated Replaced by {@code k8s.daemonset.node.misscheduled}.
   */
  @Deprecated
  public static final String K8S_DAEMONSET_MISSCHEDULED_NODES_NAME =
      "k8s.daemonset.misscheduled_nodes";

  /**
   * Unit of the {@code k8s.daemonset.misscheduled_nodes} metric.
   *
   * @deprecated Replaced by {@code k8s.daemonset.node.misscheduled}.
   */
  @Deprecated public static final String K8S_DAEMONSET_MISSCHEDULED_NODES_UNIT = "{node}";

  /**
   * Description of the {@code k8s.daemonset.misscheduled_nodes} metric.
   *
   * @deprecated Replaced by {@code k8s.daemonset.node.misscheduled}.
   */
  @Deprecated
  public static final String K8S_DAEMONSET_MISSCHEDULED_NODES_DESCRIPTION =
      "Deprecated, use `k8s.daemonset.node.misscheduled` instead.";

  /** Name of the {@code k8s.daemonset.node.current_scheduled} metric. */
  public static final String K8S_DAEMONSET_NODE_CURRENT_SCHEDULED_NAME =
      "k8s.daemonset.node.current_scheduled";

  /** Unit of the {@code k8s.daemonset.node.current_scheduled} metric. */
  public static final String K8S_DAEMONSET_NODE_CURRENT_SCHEDULED_UNIT = "{node}";

  /** Description of the {@code k8s.daemonset.node.current_scheduled} metric. */
  public static final String K8S_DAEMONSET_NODE_CURRENT_SCHEDULED_DESCRIPTION =
      "Number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod.";

  /** Name of the {@code k8s.daemonset.node.desired_scheduled} metric. */
  public static final String K8S_DAEMONSET_NODE_DESIRED_SCHEDULED_NAME =
      "k8s.daemonset.node.desired_scheduled";

  /** Unit of the {@code k8s.daemonset.node.desired_scheduled} metric. */
  public static final String K8S_DAEMONSET_NODE_DESIRED_SCHEDULED_UNIT = "{node}";

  /** Description of the {@code k8s.daemonset.node.desired_scheduled} metric. */
  public static final String K8S_DAEMONSET_NODE_DESIRED_SCHEDULED_DESCRIPTION =
      "Number of nodes that should be running the daemon pod (including nodes currently running the daemon pod).";

  /** Name of the {@code k8s.daemonset.node.misscheduled} metric. */
  public static final String K8S_DAEMONSET_NODE_MISSCHEDULED_NAME =
      "k8s.daemonset.node.misscheduled";

  /** Unit of the {@code k8s.daemonset.node.misscheduled} metric. */
  public static final String K8S_DAEMONSET_NODE_MISSCHEDULED_UNIT = "{node}";

  /** Description of the {@code k8s.daemonset.node.misscheduled} metric. */
  public static final String K8S_DAEMONSET_NODE_MISSCHEDULED_DESCRIPTION =
      "Number of nodes that are running the daemon pod, but are not supposed to run the daemon pod.";

  /** Name of the {@code k8s.daemonset.node.ready} metric. */
  public static final String K8S_DAEMONSET_NODE_READY_NAME = "k8s.daemonset.node.ready";

  /** Unit of the {@code k8s.daemonset.node.ready} metric. */
  public static final String K8S_DAEMONSET_NODE_READY_UNIT = "{node}";

  /** Description of the {@code k8s.daemonset.node.ready} metric. */
  public static final String K8S_DAEMONSET_NODE_READY_DESCRIPTION =
      "Number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready.";

  /**
   * Name of the {@code k8s.daemonset.ready_nodes} metric.
   *
   * @deprecated Replaced by {@code k8s.daemonset.node.ready}.
   */
  @Deprecated
  public static final String K8S_DAEMONSET_READY_NODES_NAME = "k8s.daemonset.ready_nodes";

  /**
   * Unit of the {@code k8s.daemonset.ready_nodes} metric.
   *
   * @deprecated Replaced by {@code k8s.daemonset.node.ready}.
   */
  @Deprecated public static final String K8S_DAEMONSET_READY_NODES_UNIT = "{node}";

  /**
   * Description of the {@code k8s.daemonset.ready_nodes} metric.
   *
   * @deprecated Replaced by {@code k8s.daemonset.node.ready}.
   */
  @Deprecated
  public static final String K8S_DAEMONSET_READY_NODES_DESCRIPTION =
      "Deprecated, use `k8s.daemonset.node.ready` instead.";

  /**
   * Name of the {@code k8s.deployment.available_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.deployment.pod.available}.
   */
  @Deprecated
  public static final String K8S_DEPLOYMENT_AVAILABLE_PODS_NAME = "k8s.deployment.available_pods";

  /**
   * Unit of the {@code k8s.deployment.available_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.deployment.pod.available}.
   */
  @Deprecated public static final String K8S_DEPLOYMENT_AVAILABLE_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.deployment.available_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.deployment.pod.available}.
   */
  @Deprecated
  public static final String K8S_DEPLOYMENT_AVAILABLE_PODS_DESCRIPTION =
      "Deprecated, use `k8s.deployment.pod.available` instead.";

  /**
   * Name of the {@code k8s.deployment.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.deployment.pod.desired}.
   */
  @Deprecated
  public static final String K8S_DEPLOYMENT_DESIRED_PODS_NAME = "k8s.deployment.desired_pods";

  /**
   * Unit of the {@code k8s.deployment.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.deployment.pod.desired}.
   */
  @Deprecated public static final String K8S_DEPLOYMENT_DESIRED_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.deployment.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.deployment.pod.desired}.
   */
  @Deprecated
  public static final String K8S_DEPLOYMENT_DESIRED_PODS_DESCRIPTION =
      "Deprecated, use `k8s.deployment.pod.desired` instead.";

  /** Name of the {@code k8s.deployment.pod.available} metric. */
  public static final String K8S_DEPLOYMENT_POD_AVAILABLE_NAME = "k8s.deployment.pod.available";

  /** Unit of the {@code k8s.deployment.pod.available} metric. */
  public static final String K8S_DEPLOYMENT_POD_AVAILABLE_UNIT = "{pod}";

  /** Description of the {@code k8s.deployment.pod.available} metric. */
  public static final String K8S_DEPLOYMENT_POD_AVAILABLE_DESCRIPTION =
      "Total number of available replica pods (ready for at least minReadySeconds) targeted by this deployment.";

  /** Name of the {@code k8s.deployment.pod.desired} metric. */
  public static final String K8S_DEPLOYMENT_POD_DESIRED_NAME = "k8s.deployment.pod.desired";

  /** Unit of the {@code k8s.deployment.pod.desired} metric. */
  public static final String K8S_DEPLOYMENT_POD_DESIRED_UNIT = "{pod}";

  /** Description of the {@code k8s.deployment.pod.desired} metric. */
  public static final String K8S_DEPLOYMENT_POD_DESIRED_DESCRIPTION =
      "Number of desired replica pods in this deployment.";

  /**
   * Name of the {@code k8s.hpa.current_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.hpa.pod.current}.
   */
  @Deprecated public static final String K8S_HPA_CURRENT_PODS_NAME = "k8s.hpa.current_pods";

  /**
   * Unit of the {@code k8s.hpa.current_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.hpa.pod.current}.
   */
  @Deprecated public static final String K8S_HPA_CURRENT_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.hpa.current_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.hpa.pod.current}.
   */
  @Deprecated
  public static final String K8S_HPA_CURRENT_PODS_DESCRIPTION =
      "Deprecated, use `k8s.hpa.pod.current` instead.";

  /**
   * Name of the {@code k8s.hpa.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.hpa.pod.desired}.
   */
  @Deprecated public static final String K8S_HPA_DESIRED_PODS_NAME = "k8s.hpa.desired_pods";

  /**
   * Unit of the {@code k8s.hpa.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.hpa.pod.desired}.
   */
  @Deprecated public static final String K8S_HPA_DESIRED_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.hpa.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.hpa.pod.desired}.
   */
  @Deprecated
  public static final String K8S_HPA_DESIRED_PODS_DESCRIPTION =
      "Deprecated, use `k8s.hpa.pod.desired` instead.";

  /**
   * Name of the {@code k8s.hpa.max_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.hpa.pod.max}.
   */
  @Deprecated public static final String K8S_HPA_MAX_PODS_NAME = "k8s.hpa.max_pods";

  /**
   * Unit of the {@code k8s.hpa.max_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.hpa.pod.max}.
   */
  @Deprecated public static final String K8S_HPA_MAX_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.hpa.max_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.hpa.pod.max}.
   */
  @Deprecated
  public static final String K8S_HPA_MAX_PODS_DESCRIPTION =
      "Deprecated, use `k8s.hpa.pod.max` instead.";

  /** Name of the {@code k8s.hpa.metric.target.cpu.average_utilization} metric. */
  public static final String K8S_HPA_METRIC_TARGET_CPU_AVERAGE_UTILIZATION_NAME =
      "k8s.hpa.metric.target.cpu.average_utilization";

  /** Unit of the {@code k8s.hpa.metric.target.cpu.average_utilization} metric. */
  public static final String K8S_HPA_METRIC_TARGET_CPU_AVERAGE_UTILIZATION_UNIT = "1";

  /** Description of the {@code k8s.hpa.metric.target.cpu.average_utilization} metric. */
  public static final String K8S_HPA_METRIC_TARGET_CPU_AVERAGE_UTILIZATION_DESCRIPTION =
      "Target average utilization, in percentage, for CPU resource in HPA config.";

  /** Name of the {@code k8s.hpa.metric.target.cpu.average_value} metric. */
  public static final String K8S_HPA_METRIC_TARGET_CPU_AVERAGE_VALUE_NAME =
      "k8s.hpa.metric.target.cpu.average_value";

  /** Unit of the {@code k8s.hpa.metric.target.cpu.average_value} metric. */
  public static final String K8S_HPA_METRIC_TARGET_CPU_AVERAGE_VALUE_UNIT = "{cpu}";

  /** Description of the {@code k8s.hpa.metric.target.cpu.average_value} metric. */
  public static final String K8S_HPA_METRIC_TARGET_CPU_AVERAGE_VALUE_DESCRIPTION =
      "Target average value for CPU resource in HPA config.";

  /** Name of the {@code k8s.hpa.metric.target.cpu.value} metric. */
  public static final String K8S_HPA_METRIC_TARGET_CPU_VALUE_NAME =
      "k8s.hpa.metric.target.cpu.value";

  /** Unit of the {@code k8s.hpa.metric.target.cpu.value} metric. */
  public static final String K8S_HPA_METRIC_TARGET_CPU_VALUE_UNIT = "{cpu}";

  /** Description of the {@code k8s.hpa.metric.target.cpu.value} metric. */
  public static final String K8S_HPA_METRIC_TARGET_CPU_VALUE_DESCRIPTION =
      "Target value for CPU resource in HPA config.";

  /**
   * Name of the {@code k8s.hpa.min_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.hpa.pod.min}.
   */
  @Deprecated public static final String K8S_HPA_MIN_PODS_NAME = "k8s.hpa.min_pods";

  /**
   * Unit of the {@code k8s.hpa.min_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.hpa.pod.min}.
   */
  @Deprecated public static final String K8S_HPA_MIN_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.hpa.min_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.hpa.pod.min}.
   */
  @Deprecated
  public static final String K8S_HPA_MIN_PODS_DESCRIPTION =
      "Deprecated, use `k8s.hpa.pod.min` instead.";

  /** Name of the {@code k8s.hpa.pod.current} metric. */
  public static final String K8S_HPA_POD_CURRENT_NAME = "k8s.hpa.pod.current";

  /** Unit of the {@code k8s.hpa.pod.current} metric. */
  public static final String K8S_HPA_POD_CURRENT_UNIT = "{pod}";

  /** Description of the {@code k8s.hpa.pod.current} metric. */
  public static final String K8S_HPA_POD_CURRENT_DESCRIPTION =
      "Current number of replica pods managed by this horizontal pod autoscaler, as last seen by the autoscaler.";

  /** Name of the {@code k8s.hpa.pod.desired} metric. */
  public static final String K8S_HPA_POD_DESIRED_NAME = "k8s.hpa.pod.desired";

  /** Unit of the {@code k8s.hpa.pod.desired} metric. */
  public static final String K8S_HPA_POD_DESIRED_UNIT = "{pod}";

  /** Description of the {@code k8s.hpa.pod.desired} metric. */
  public static final String K8S_HPA_POD_DESIRED_DESCRIPTION =
      "Desired number of replica pods managed by this horizontal pod autoscaler, as last calculated by the autoscaler.";

  /** Name of the {@code k8s.hpa.pod.max} metric. */
  public static final String K8S_HPA_POD_MAX_NAME = "k8s.hpa.pod.max";

  /** Unit of the {@code k8s.hpa.pod.max} metric. */
  public static final String K8S_HPA_POD_MAX_UNIT = "{pod}";

  /** Description of the {@code k8s.hpa.pod.max} metric. */
  public static final String K8S_HPA_POD_MAX_DESCRIPTION =
      "The upper limit for the number of replica pods to which the autoscaler can scale up.";

  /** Name of the {@code k8s.hpa.pod.min} metric. */
  public static final String K8S_HPA_POD_MIN_NAME = "k8s.hpa.pod.min";

  /** Unit of the {@code k8s.hpa.pod.min} metric. */
  public static final String K8S_HPA_POD_MIN_UNIT = "{pod}";

  /** Description of the {@code k8s.hpa.pod.min} metric. */
  public static final String K8S_HPA_POD_MIN_DESCRIPTION =
      "The lower limit for the number of replica pods to which the autoscaler can scale down.";

  /**
   * Name of the {@code k8s.job.active_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.active}.
   */
  @Deprecated public static final String K8S_JOB_ACTIVE_PODS_NAME = "k8s.job.active_pods";

  /**
   * Unit of the {@code k8s.job.active_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.active}.
   */
  @Deprecated public static final String K8S_JOB_ACTIVE_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.job.active_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.active}.
   */
  @Deprecated
  public static final String K8S_JOB_ACTIVE_PODS_DESCRIPTION =
      "Deprecated, use `k8s.job.pod.active` instead.";

  /**
   * Name of the {@code k8s.job.desired_successful_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.desired_successful}.
   */
  @Deprecated
  public static final String K8S_JOB_DESIRED_SUCCESSFUL_PODS_NAME =
      "k8s.job.desired_successful_pods";

  /**
   * Unit of the {@code k8s.job.desired_successful_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.desired_successful}.
   */
  @Deprecated public static final String K8S_JOB_DESIRED_SUCCESSFUL_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.job.desired_successful_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.desired_successful}.
   */
  @Deprecated
  public static final String K8S_JOB_DESIRED_SUCCESSFUL_PODS_DESCRIPTION =
      "Deprecated, use `k8s.job.pod.desired_successful` instead.";

  /**
   * Name of the {@code k8s.job.failed_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.failed}.
   */
  @Deprecated public static final String K8S_JOB_FAILED_PODS_NAME = "k8s.job.failed_pods";

  /**
   * Unit of the {@code k8s.job.failed_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.failed}.
   */
  @Deprecated public static final String K8S_JOB_FAILED_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.job.failed_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.failed}.
   */
  @Deprecated
  public static final String K8S_JOB_FAILED_PODS_DESCRIPTION =
      "Deprecated, use `k8s.job.pod.failed` instead.";

  /**
   * Name of the {@code k8s.job.max_parallel_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.max_parallel}.
   */
  @Deprecated
  public static final String K8S_JOB_MAX_PARALLEL_PODS_NAME = "k8s.job.max_parallel_pods";

  /**
   * Unit of the {@code k8s.job.max_parallel_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.max_parallel}.
   */
  @Deprecated public static final String K8S_JOB_MAX_PARALLEL_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.job.max_parallel_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.max_parallel}.
   */
  @Deprecated
  public static final String K8S_JOB_MAX_PARALLEL_PODS_DESCRIPTION =
      "Deprecated, use `k8s.job.pod.max_parallel` instead.";

  /** Name of the {@code k8s.job.pod.active} metric. */
  public static final String K8S_JOB_POD_ACTIVE_NAME = "k8s.job.pod.active";

  /** Unit of the {@code k8s.job.pod.active} metric. */
  public static final String K8S_JOB_POD_ACTIVE_UNIT = "{pod}";

  /** Description of the {@code k8s.job.pod.active} metric. */
  public static final String K8S_JOB_POD_ACTIVE_DESCRIPTION =
      "The number of pending and actively running pods for a job.";

  /** Name of the {@code k8s.job.pod.desired_successful} metric. */
  public static final String K8S_JOB_POD_DESIRED_SUCCESSFUL_NAME = "k8s.job.pod.desired_successful";

  /** Unit of the {@code k8s.job.pod.desired_successful} metric. */
  public static final String K8S_JOB_POD_DESIRED_SUCCESSFUL_UNIT = "{pod}";

  /** Description of the {@code k8s.job.pod.desired_successful} metric. */
  public static final String K8S_JOB_POD_DESIRED_SUCCESSFUL_DESCRIPTION =
      "The desired number of successfully finished pods the job should be run with.";

  /** Name of the {@code k8s.job.pod.failed} metric. */
  public static final String K8S_JOB_POD_FAILED_NAME = "k8s.job.pod.failed";

  /** Unit of the {@code k8s.job.pod.failed} metric. */
  public static final String K8S_JOB_POD_FAILED_UNIT = "{pod}";

  /** Description of the {@code k8s.job.pod.failed} metric. */
  public static final String K8S_JOB_POD_FAILED_DESCRIPTION =
      "The number of pods which reached phase Failed for a job.";

  /** Name of the {@code k8s.job.pod.max_parallel} metric. */
  public static final String K8S_JOB_POD_MAX_PARALLEL_NAME = "k8s.job.pod.max_parallel";

  /** Unit of the {@code k8s.job.pod.max_parallel} metric. */
  public static final String K8S_JOB_POD_MAX_PARALLEL_UNIT = "{pod}";

  /** Description of the {@code k8s.job.pod.max_parallel} metric. */
  public static final String K8S_JOB_POD_MAX_PARALLEL_DESCRIPTION =
      "The max desired number of pods the job should run at any given time.";

  /** Name of the {@code k8s.job.pod.successful} metric. */
  public static final String K8S_JOB_POD_SUCCESSFUL_NAME = "k8s.job.pod.successful";

  /** Unit of the {@code k8s.job.pod.successful} metric. */
  public static final String K8S_JOB_POD_SUCCESSFUL_UNIT = "{pod}";

  /** Description of the {@code k8s.job.pod.successful} metric. */
  public static final String K8S_JOB_POD_SUCCESSFUL_DESCRIPTION =
      "The number of pods which reached phase Succeeded for a job.";

  /**
   * Name of the {@code k8s.job.successful_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.successful}.
   */
  @Deprecated public static final String K8S_JOB_SUCCESSFUL_PODS_NAME = "k8s.job.successful_pods";

  /**
   * Unit of the {@code k8s.job.successful_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.successful}.
   */
  @Deprecated public static final String K8S_JOB_SUCCESSFUL_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.job.successful_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.job.pod.successful}.
   */
  @Deprecated
  public static final String K8S_JOB_SUCCESSFUL_PODS_DESCRIPTION =
      "Deprecated, use `k8s.job.pod.successful` instead.";

  /** Name of the {@code k8s.namespace.phase} metric. */
  public static final String K8S_NAMESPACE_PHASE_NAME = "k8s.namespace.phase";

  /** Unit of the {@code k8s.namespace.phase} metric. */
  public static final String K8S_NAMESPACE_PHASE_UNIT = "{namespace}";

  /** Description of the {@code k8s.namespace.phase} metric. */
  public static final String K8S_NAMESPACE_PHASE_DESCRIPTION =
      "Describes number of K8s namespaces that are currently in a given phase.";

  /**
   * Name of the {@code k8s.node.allocatable.cpu} metric.
   *
   * @deprecated Replaced by {@code k8s.node.cpu.allocatable}.
   */
  @Deprecated public static final String K8S_NODE_ALLOCATABLE_CPU_NAME = "k8s.node.allocatable.cpu";

  /**
   * Unit of the {@code k8s.node.allocatable.cpu} metric.
   *
   * @deprecated Replaced by {@code k8s.node.cpu.allocatable}.
   */
  @Deprecated public static final String K8S_NODE_ALLOCATABLE_CPU_UNIT = "{cpu}";

  /**
   * Description of the {@code k8s.node.allocatable.cpu} metric.
   *
   * @deprecated Replaced by {@code k8s.node.cpu.allocatable}.
   */
  @Deprecated
  public static final String K8S_NODE_ALLOCATABLE_CPU_DESCRIPTION =
      "Deprecated, use `k8s.node.cpu.allocatable` instead.";

  /**
   * Name of the {@code k8s.node.allocatable.ephemeral_storage} metric.
   *
   * @deprecated Replaced by {@code k8s.node.ephemeral_storage.allocatable}.
   */
  @Deprecated
  public static final String K8S_NODE_ALLOCATABLE_EPHEMERAL_STORAGE_NAME =
      "k8s.node.allocatable.ephemeral_storage";

  /**
   * Unit of the {@code k8s.node.allocatable.ephemeral_storage} metric.
   *
   * @deprecated Replaced by {@code k8s.node.ephemeral_storage.allocatable}.
   */
  @Deprecated public static final String K8S_NODE_ALLOCATABLE_EPHEMERAL_STORAGE_UNIT = "By";

  /**
   * Description of the {@code k8s.node.allocatable.ephemeral_storage} metric.
   *
   * @deprecated Replaced by {@code k8s.node.ephemeral_storage.allocatable}.
   */
  @Deprecated
  public static final String K8S_NODE_ALLOCATABLE_EPHEMERAL_STORAGE_DESCRIPTION =
      "Deprecated, use `k8s.node.ephemeral_storage.allocatable` instead.";

  /**
   * Name of the {@code k8s.node.allocatable.memory} metric.
   *
   * @deprecated Replaced by {@code k8s.node.memory.allocatable}.
   */
  @Deprecated
  public static final String K8S_NODE_ALLOCATABLE_MEMORY_NAME = "k8s.node.allocatable.memory";

  /**
   * Unit of the {@code k8s.node.allocatable.memory} metric.
   *
   * @deprecated Replaced by {@code k8s.node.memory.allocatable}.
   */
  @Deprecated public static final String K8S_NODE_ALLOCATABLE_MEMORY_UNIT = "By";

  /**
   * Description of the {@code k8s.node.allocatable.memory} metric.
   *
   * @deprecated Replaced by {@code k8s.node.memory.allocatable}.
   */
  @Deprecated
  public static final String K8S_NODE_ALLOCATABLE_MEMORY_DESCRIPTION =
      "Deprecated, use `k8s.node.memory.allocatable` instead.";

  /**
   * Name of the {@code k8s.node.allocatable.pods} metric.
   *
   * @deprecated Replaced by {@code k8s.node.pod.allocatable}.
   */
  @Deprecated
  public static final String K8S_NODE_ALLOCATABLE_PODS_NAME = "k8s.node.allocatable.pods";

  /**
   * Unit of the {@code k8s.node.allocatable.pods} metric.
   *
   * @deprecated Replaced by {@code k8s.node.pod.allocatable}.
   */
  @Deprecated public static final String K8S_NODE_ALLOCATABLE_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.node.allocatable.pods} metric.
   *
   * @deprecated Replaced by {@code k8s.node.pod.allocatable}.
   */
  @Deprecated
  public static final String K8S_NODE_ALLOCATABLE_PODS_DESCRIPTION =
      "Deprecated, use `k8s.node.pod.allocatable` instead.";

  /** Name of the {@code k8s.node.condition.status} metric. */
  public static final String K8S_NODE_CONDITION_STATUS_NAME = "k8s.node.condition.status";

  /** Unit of the {@code k8s.node.condition.status} metric. */
  public static final String K8S_NODE_CONDITION_STATUS_UNIT = "{node}";

  /** Description of the {@code k8s.node.condition.status} metric. */
  public static final String K8S_NODE_CONDITION_STATUS_DESCRIPTION =
      "Describes the condition of a particular Node.";

  /** Name of the {@code k8s.node.cpu.allocatable} metric. */
  public static final String K8S_NODE_CPU_ALLOCATABLE_NAME = "k8s.node.cpu.allocatable";

  /** Unit of the {@code k8s.node.cpu.allocatable} metric. */
  public static final String K8S_NODE_CPU_ALLOCATABLE_UNIT = "{cpu}";

  /** Description of the {@code k8s.node.cpu.allocatable} metric. */
  public static final String K8S_NODE_CPU_ALLOCATABLE_DESCRIPTION =
      "Amount of cpu allocatable on the node.";

  /** Name of the {@code k8s.node.cpu.time} metric. */
  public static final String K8S_NODE_CPU_TIME_NAME = "k8s.node.cpu.time";

  /** Unit of the {@code k8s.node.cpu.time} metric. */
  public static final String K8S_NODE_CPU_TIME_UNIT = "s";

  /** Description of the {@code k8s.node.cpu.time} metric. */
  public static final String K8S_NODE_CPU_TIME_DESCRIPTION = "Total CPU time consumed.";

  /** Name of the {@code k8s.node.cpu.usage} metric. */
  public static final String K8S_NODE_CPU_USAGE_NAME = "k8s.node.cpu.usage";

  /** Unit of the {@code k8s.node.cpu.usage} metric. */
  public static final String K8S_NODE_CPU_USAGE_UNIT = "{cpu}";

  /** Description of the {@code k8s.node.cpu.usage} metric. */
  public static final String K8S_NODE_CPU_USAGE_DESCRIPTION =
      "Node's CPU usage, measured in cpus. Range from 0 to the number of allocatable CPUs.";

  /** Name of the {@code k8s.node.ephemeral_storage.allocatable} metric. */
  public static final String K8S_NODE_EPHEMERAL_STORAGE_ALLOCATABLE_NAME =
      "k8s.node.ephemeral_storage.allocatable";

  /** Unit of the {@code k8s.node.ephemeral_storage.allocatable} metric. */
  public static final String K8S_NODE_EPHEMERAL_STORAGE_ALLOCATABLE_UNIT = "By";

  /** Description of the {@code k8s.node.ephemeral_storage.allocatable} metric. */
  public static final String K8S_NODE_EPHEMERAL_STORAGE_ALLOCATABLE_DESCRIPTION =
      "Amount of ephemeral-storage allocatable on the node.";

  /** Name of the {@code k8s.node.filesystem.available} metric. */
  public static final String K8S_NODE_FILESYSTEM_AVAILABLE_NAME = "k8s.node.filesystem.available";

  /** Unit of the {@code k8s.node.filesystem.available} metric. */
  public static final String K8S_NODE_FILESYSTEM_AVAILABLE_UNIT = "By";

  /** Description of the {@code k8s.node.filesystem.available} metric. */
  public static final String K8S_NODE_FILESYSTEM_AVAILABLE_DESCRIPTION =
      "Node filesystem available bytes.";

  /** Name of the {@code k8s.node.filesystem.capacity} metric. */
  public static final String K8S_NODE_FILESYSTEM_CAPACITY_NAME = "k8s.node.filesystem.capacity";

  /** Unit of the {@code k8s.node.filesystem.capacity} metric. */
  public static final String K8S_NODE_FILESYSTEM_CAPACITY_UNIT = "By";

  /** Description of the {@code k8s.node.filesystem.capacity} metric. */
  public static final String K8S_NODE_FILESYSTEM_CAPACITY_DESCRIPTION = "Node filesystem capacity.";

  /** Name of the {@code k8s.node.filesystem.usage} metric. */
  public static final String K8S_NODE_FILESYSTEM_USAGE_NAME = "k8s.node.filesystem.usage";

  /** Unit of the {@code k8s.node.filesystem.usage} metric. */
  public static final String K8S_NODE_FILESYSTEM_USAGE_UNIT = "By";

  /** Description of the {@code k8s.node.filesystem.usage} metric. */
  public static final String K8S_NODE_FILESYSTEM_USAGE_DESCRIPTION = "Node filesystem usage.";

  /** Name of the {@code k8s.node.memory.allocatable} metric. */
  public static final String K8S_NODE_MEMORY_ALLOCATABLE_NAME = "k8s.node.memory.allocatable";

  /** Unit of the {@code k8s.node.memory.allocatable} metric. */
  public static final String K8S_NODE_MEMORY_ALLOCATABLE_UNIT = "By";

  /** Description of the {@code k8s.node.memory.allocatable} metric. */
  public static final String K8S_NODE_MEMORY_ALLOCATABLE_DESCRIPTION =
      "Amount of memory allocatable on the node.";

  /** Name of the {@code k8s.node.memory.available} metric. */
  public static final String K8S_NODE_MEMORY_AVAILABLE_NAME = "k8s.node.memory.available";

  /** Unit of the {@code k8s.node.memory.available} metric. */
  public static final String K8S_NODE_MEMORY_AVAILABLE_UNIT = "By";

  /** Description of the {@code k8s.node.memory.available} metric. */
  public static final String K8S_NODE_MEMORY_AVAILABLE_DESCRIPTION = "Node memory available.";

  /** Name of the {@code k8s.node.memory.paging.faults} metric. */
  public static final String K8S_NODE_MEMORY_PAGING_FAULTS_NAME = "k8s.node.memory.paging.faults";

  /** Unit of the {@code k8s.node.memory.paging.faults} metric. */
  public static final String K8S_NODE_MEMORY_PAGING_FAULTS_UNIT = "{fault}";

  /** Description of the {@code k8s.node.memory.paging.faults} metric. */
  public static final String K8S_NODE_MEMORY_PAGING_FAULTS_DESCRIPTION =
      "Node memory paging faults.";

  /** Name of the {@code k8s.node.memory.rss} metric. */
  public static final String K8S_NODE_MEMORY_RSS_NAME = "k8s.node.memory.rss";

  /** Unit of the {@code k8s.node.memory.rss} metric. */
  public static final String K8S_NODE_MEMORY_RSS_UNIT = "By";

  /** Description of the {@code k8s.node.memory.rss} metric. */
  public static final String K8S_NODE_MEMORY_RSS_DESCRIPTION = "Node memory RSS.";

  /** Name of the {@code k8s.node.memory.usage} metric. */
  public static final String K8S_NODE_MEMORY_USAGE_NAME = "k8s.node.memory.usage";

  /** Unit of the {@code k8s.node.memory.usage} metric. */
  public static final String K8S_NODE_MEMORY_USAGE_UNIT = "By";

  /** Description of the {@code k8s.node.memory.usage} metric. */
  public static final String K8S_NODE_MEMORY_USAGE_DESCRIPTION = "Memory usage of the Node.";

  /** Name of the {@code k8s.node.memory.working_set} metric. */
  public static final String K8S_NODE_MEMORY_WORKING_SET_NAME = "k8s.node.memory.working_set";

  /** Unit of the {@code k8s.node.memory.working_set} metric. */
  public static final String K8S_NODE_MEMORY_WORKING_SET_UNIT = "By";

  /** Description of the {@code k8s.node.memory.working_set} metric. */
  public static final String K8S_NODE_MEMORY_WORKING_SET_DESCRIPTION = "Node memory working set.";

  /** Name of the {@code k8s.node.network.errors} metric. */
  public static final String K8S_NODE_NETWORK_ERRORS_NAME = "k8s.node.network.errors";

  /** Unit of the {@code k8s.node.network.errors} metric. */
  public static final String K8S_NODE_NETWORK_ERRORS_UNIT = "{error}";

  /** Description of the {@code k8s.node.network.errors} metric. */
  public static final String K8S_NODE_NETWORK_ERRORS_DESCRIPTION = "Node network errors.";

  /** Name of the {@code k8s.node.network.io} metric. */
  public static final String K8S_NODE_NETWORK_IO_NAME = "k8s.node.network.io";

  /** Unit of the {@code k8s.node.network.io} metric. */
  public static final String K8S_NODE_NETWORK_IO_UNIT = "By";

  /** Description of the {@code k8s.node.network.io} metric. */
  public static final String K8S_NODE_NETWORK_IO_DESCRIPTION = "Network bytes for the Node.";

  /** Name of the {@code k8s.node.pod.allocatable} metric. */
  public static final String K8S_NODE_POD_ALLOCATABLE_NAME = "k8s.node.pod.allocatable";

  /** Unit of the {@code k8s.node.pod.allocatable} metric. */
  public static final String K8S_NODE_POD_ALLOCATABLE_UNIT = "{pod}";

  /** Description of the {@code k8s.node.pod.allocatable} metric. */
  public static final String K8S_NODE_POD_ALLOCATABLE_DESCRIPTION =
      "Amount of pods allocatable on the node.";

  /** Name of the {@code k8s.node.system_container.cpu.time} metric. */
  public static final String K8S_NODE_SYSTEM_CONTAINER_CPU_TIME_NAME =
      "k8s.node.system_container.cpu.time";

  /** Unit of the {@code k8s.node.system_container.cpu.time} metric. */
  public static final String K8S_NODE_SYSTEM_CONTAINER_CPU_TIME_UNIT = "s";

  /** Description of the {@code k8s.node.system_container.cpu.time} metric. */
  public static final String K8S_NODE_SYSTEM_CONTAINER_CPU_TIME_DESCRIPTION =
      "Node's system container CPU time.";

  /** Name of the {@code k8s.node.system_container.cpu.usage} metric. */
  public static final String K8S_NODE_SYSTEM_CONTAINER_CPU_USAGE_NAME =
      "k8s.node.system_container.cpu.usage";

  /** Unit of the {@code k8s.node.system_container.cpu.usage} metric. */
  public static final String K8S_NODE_SYSTEM_CONTAINER_CPU_USAGE_UNIT = "{cpu}";

  /** Description of the {@code k8s.node.system_container.cpu.usage} metric. */
  public static final String K8S_NODE_SYSTEM_CONTAINER_CPU_USAGE_DESCRIPTION =
      "Node's system container CPU usage, measured in cpus.";

  /** Name of the {@code k8s.node.system_container.memory.usage} metric. */
  public static final String K8S_NODE_SYSTEM_CONTAINER_MEMORY_USAGE_NAME =
      "k8s.node.system_container.memory.usage";

  /** Unit of the {@code k8s.node.system_container.memory.usage} metric. */
  public static final String K8S_NODE_SYSTEM_CONTAINER_MEMORY_USAGE_UNIT = "By";

  /** Description of the {@code k8s.node.system_container.memory.usage} metric. */
  public static final String K8S_NODE_SYSTEM_CONTAINER_MEMORY_USAGE_DESCRIPTION =
      "Node's system container memory usage.";

  /** Name of the {@code k8s.node.system_container.memory.working_set} metric. */
  public static final String K8S_NODE_SYSTEM_CONTAINER_MEMORY_WORKING_SET_NAME =
      "k8s.node.system_container.memory.working_set";

  /** Unit of the {@code k8s.node.system_container.memory.working_set} metric. */
  public static final String K8S_NODE_SYSTEM_CONTAINER_MEMORY_WORKING_SET_UNIT = "By";

  /** Description of the {@code k8s.node.system_container.memory.working_set} metric. */
  public static final String K8S_NODE_SYSTEM_CONTAINER_MEMORY_WORKING_SET_DESCRIPTION =
      "The amount of working set memory.";

  /** Name of the {@code k8s.node.uptime} metric. */
  public static final String K8S_NODE_UPTIME_NAME = "k8s.node.uptime";

  /** Unit of the {@code k8s.node.uptime} metric. */
  public static final String K8S_NODE_UPTIME_UNIT = "s";

  /** Description of the {@code k8s.node.uptime} metric. */
  public static final String K8S_NODE_UPTIME_DESCRIPTION = "The time the Node has been running.";

  /** Name of the {@code k8s.persistentvolume.status.phase} metric. */
  public static final String K8S_PERSISTENTVOLUME_STATUS_PHASE_NAME =
      "k8s.persistentvolume.status.phase";

  /** Unit of the {@code k8s.persistentvolume.status.phase} metric. */
  public static final String K8S_PERSISTENTVOLUME_STATUS_PHASE_UNIT = "{persistentvolume}";

  /** Description of the {@code k8s.persistentvolume.status.phase} metric. */
  public static final String K8S_PERSISTENTVOLUME_STATUS_PHASE_DESCRIPTION =
      "Number of PersistentVolumes in a given phase.";

  /** Name of the {@code k8s.persistentvolume.storage.capacity} metric. */
  public static final String K8S_PERSISTENTVOLUME_STORAGE_CAPACITY_NAME =
      "k8s.persistentvolume.storage.capacity";

  /** Unit of the {@code k8s.persistentvolume.storage.capacity} metric. */
  public static final String K8S_PERSISTENTVOLUME_STORAGE_CAPACITY_UNIT = "By";

  /** Description of the {@code k8s.persistentvolume.storage.capacity} metric. */
  public static final String K8S_PERSISTENTVOLUME_STORAGE_CAPACITY_DESCRIPTION =
      "The storage capacity of the PersistentVolume.";

  /** Name of the {@code k8s.persistentvolumeclaim.status.phase} metric. */
  public static final String K8S_PERSISTENTVOLUMECLAIM_STATUS_PHASE_NAME =
      "k8s.persistentvolumeclaim.status.phase";

  /** Unit of the {@code k8s.persistentvolumeclaim.status.phase} metric. */
  public static final String K8S_PERSISTENTVOLUMECLAIM_STATUS_PHASE_UNIT =
      "{persistentvolumeclaim}";

  /** Description of the {@code k8s.persistentvolumeclaim.status.phase} metric. */
  public static final String K8S_PERSISTENTVOLUMECLAIM_STATUS_PHASE_DESCRIPTION =
      "Number of PersistentVolumeClaims in a given phase.";

  /** Name of the {@code k8s.persistentvolumeclaim.storage.capacity} metric. */
  public static final String K8S_PERSISTENTVOLUMECLAIM_STORAGE_CAPACITY_NAME =
      "k8s.persistentvolumeclaim.storage.capacity";

  /** Unit of the {@code k8s.persistentvolumeclaim.storage.capacity} metric. */
  public static final String K8S_PERSISTENTVOLUMECLAIM_STORAGE_CAPACITY_UNIT = "By";

  /** Description of the {@code k8s.persistentvolumeclaim.storage.capacity} metric. */
  public static final String K8S_PERSISTENTVOLUMECLAIM_STORAGE_CAPACITY_DESCRIPTION =
      "The actual storage capacity provisioned for the PersistentVolumeClaim.";

  /** Name of the {@code k8s.persistentvolumeclaim.storage.request} metric. */
  public static final String K8S_PERSISTENTVOLUMECLAIM_STORAGE_REQUEST_NAME =
      "k8s.persistentvolumeclaim.storage.request";

  /** Unit of the {@code k8s.persistentvolumeclaim.storage.request} metric. */
  public static final String K8S_PERSISTENTVOLUMECLAIM_STORAGE_REQUEST_UNIT = "By";

  /** Description of the {@code k8s.persistentvolumeclaim.storage.request} metric. */
  public static final String K8S_PERSISTENTVOLUMECLAIM_STORAGE_REQUEST_DESCRIPTION =
      "The storage requested by the PersistentVolumeClaim.";

  /** Name of the {@code k8s.pod.cpu.time} metric. */
  public static final String K8S_POD_CPU_TIME_NAME = "k8s.pod.cpu.time";

  /** Unit of the {@code k8s.pod.cpu.time} metric. */
  public static final String K8S_POD_CPU_TIME_UNIT = "s";

  /** Description of the {@code k8s.pod.cpu.time} metric. */
  public static final String K8S_POD_CPU_TIME_DESCRIPTION = "Total CPU time consumed.";

  /** Name of the {@code k8s.pod.cpu.usage} metric. */
  public static final String K8S_POD_CPU_USAGE_NAME = "k8s.pod.cpu.usage";

  /** Unit of the {@code k8s.pod.cpu.usage} metric. */
  public static final String K8S_POD_CPU_USAGE_UNIT = "{cpu}";

  /** Description of the {@code k8s.pod.cpu.usage} metric. */
  public static final String K8S_POD_CPU_USAGE_DESCRIPTION =
      "Pod's CPU usage, measured in cpus. Range from 0 to the number of allocatable CPUs.";

  /** Name of the {@code k8s.pod.filesystem.available} metric. */
  public static final String K8S_POD_FILESYSTEM_AVAILABLE_NAME = "k8s.pod.filesystem.available";

  /** Unit of the {@code k8s.pod.filesystem.available} metric. */
  public static final String K8S_POD_FILESYSTEM_AVAILABLE_UNIT = "By";

  /** Description of the {@code k8s.pod.filesystem.available} metric. */
  public static final String K8S_POD_FILESYSTEM_AVAILABLE_DESCRIPTION =
      "Pod filesystem available bytes.";

  /** Name of the {@code k8s.pod.filesystem.capacity} metric. */
  public static final String K8S_POD_FILESYSTEM_CAPACITY_NAME = "k8s.pod.filesystem.capacity";

  /** Unit of the {@code k8s.pod.filesystem.capacity} metric. */
  public static final String K8S_POD_FILESYSTEM_CAPACITY_UNIT = "By";

  /** Description of the {@code k8s.pod.filesystem.capacity} metric. */
  public static final String K8S_POD_FILESYSTEM_CAPACITY_DESCRIPTION = "Pod filesystem capacity.";

  /** Name of the {@code k8s.pod.filesystem.usage} metric. */
  public static final String K8S_POD_FILESYSTEM_USAGE_NAME = "k8s.pod.filesystem.usage";

  /** Unit of the {@code k8s.pod.filesystem.usage} metric. */
  public static final String K8S_POD_FILESYSTEM_USAGE_UNIT = "By";

  /** Description of the {@code k8s.pod.filesystem.usage} metric. */
  public static final String K8S_POD_FILESYSTEM_USAGE_DESCRIPTION = "Pod filesystem usage.";

  /** Name of the {@code k8s.pod.memory.available} metric. */
  public static final String K8S_POD_MEMORY_AVAILABLE_NAME = "k8s.pod.memory.available";

  /** Unit of the {@code k8s.pod.memory.available} metric. */
  public static final String K8S_POD_MEMORY_AVAILABLE_UNIT = "By";

  /** Description of the {@code k8s.pod.memory.available} metric. */
  public static final String K8S_POD_MEMORY_AVAILABLE_DESCRIPTION = "Pod memory available.";

  /** Name of the {@code k8s.pod.memory.paging.faults} metric. */
  public static final String K8S_POD_MEMORY_PAGING_FAULTS_NAME = "k8s.pod.memory.paging.faults";

  /** Unit of the {@code k8s.pod.memory.paging.faults} metric. */
  public static final String K8S_POD_MEMORY_PAGING_FAULTS_UNIT = "{fault}";

  /** Description of the {@code k8s.pod.memory.paging.faults} metric. */
  public static final String K8S_POD_MEMORY_PAGING_FAULTS_DESCRIPTION = "Pod memory paging faults.";

  /** Name of the {@code k8s.pod.memory.rss} metric. */
  public static final String K8S_POD_MEMORY_RSS_NAME = "k8s.pod.memory.rss";

  /** Unit of the {@code k8s.pod.memory.rss} metric. */
  public static final String K8S_POD_MEMORY_RSS_UNIT = "By";

  /** Description of the {@code k8s.pod.memory.rss} metric. */
  public static final String K8S_POD_MEMORY_RSS_DESCRIPTION = "Pod memory RSS.";

  /** Name of the {@code k8s.pod.memory.usage} metric. */
  public static final String K8S_POD_MEMORY_USAGE_NAME = "k8s.pod.memory.usage";

  /** Unit of the {@code k8s.pod.memory.usage} metric. */
  public static final String K8S_POD_MEMORY_USAGE_UNIT = "By";

  /** Description of the {@code k8s.pod.memory.usage} metric. */
  public static final String K8S_POD_MEMORY_USAGE_DESCRIPTION = "Memory usage of the Pod.";

  /** Name of the {@code k8s.pod.memory.working_set} metric. */
  public static final String K8S_POD_MEMORY_WORKING_SET_NAME = "k8s.pod.memory.working_set";

  /** Unit of the {@code k8s.pod.memory.working_set} metric. */
  public static final String K8S_POD_MEMORY_WORKING_SET_UNIT = "By";

  /** Description of the {@code k8s.pod.memory.working_set} metric. */
  public static final String K8S_POD_MEMORY_WORKING_SET_DESCRIPTION = "Pod memory working set.";

  /** Name of the {@code k8s.pod.network.errors} metric. */
  public static final String K8S_POD_NETWORK_ERRORS_NAME = "k8s.pod.network.errors";

  /** Unit of the {@code k8s.pod.network.errors} metric. */
  public static final String K8S_POD_NETWORK_ERRORS_UNIT = "{error}";

  /** Description of the {@code k8s.pod.network.errors} metric. */
  public static final String K8S_POD_NETWORK_ERRORS_DESCRIPTION = "Pod network errors.";

  /** Name of the {@code k8s.pod.network.io} metric. */
  public static final String K8S_POD_NETWORK_IO_NAME = "k8s.pod.network.io";

  /** Unit of the {@code k8s.pod.network.io} metric. */
  public static final String K8S_POD_NETWORK_IO_UNIT = "By";

  /** Description of the {@code k8s.pod.network.io} metric. */
  public static final String K8S_POD_NETWORK_IO_DESCRIPTION = "Network bytes for the Pod.";

  /** Name of the {@code k8s.pod.status.phase} metric. */
  public static final String K8S_POD_STATUS_PHASE_NAME = "k8s.pod.status.phase";

  /** Unit of the {@code k8s.pod.status.phase} metric. */
  public static final String K8S_POD_STATUS_PHASE_UNIT = "{pod}";

  /** Description of the {@code k8s.pod.status.phase} metric. */
  public static final String K8S_POD_STATUS_PHASE_DESCRIPTION =
      "Describes number of K8s Pods that are currently in a given phase.";

  /** Name of the {@code k8s.pod.status.reason} metric. */
  public static final String K8S_POD_STATUS_REASON_NAME = "k8s.pod.status.reason";

  /** Unit of the {@code k8s.pod.status.reason} metric. */
  public static final String K8S_POD_STATUS_REASON_UNIT = "{pod}";

  /** Description of the {@code k8s.pod.status.reason} metric. */
  public static final String K8S_POD_STATUS_REASON_DESCRIPTION =
      "Describes the number of K8s Pods that are currently in a state for a given reason.";

  /** Name of the {@code k8s.pod.uptime} metric. */
  public static final String K8S_POD_UPTIME_NAME = "k8s.pod.uptime";

  /** Unit of the {@code k8s.pod.uptime} metric. */
  public static final String K8S_POD_UPTIME_UNIT = "s";

  /** Description of the {@code k8s.pod.uptime} metric. */
  public static final String K8S_POD_UPTIME_DESCRIPTION = "The time the Pod has been running.";

  /** Name of the {@code k8s.pod.volume.available} metric. */
  public static final String K8S_POD_VOLUME_AVAILABLE_NAME = "k8s.pod.volume.available";

  /** Unit of the {@code k8s.pod.volume.available} metric. */
  public static final String K8S_POD_VOLUME_AVAILABLE_UNIT = "By";

  /** Description of the {@code k8s.pod.volume.available} metric. */
  public static final String K8S_POD_VOLUME_AVAILABLE_DESCRIPTION =
      "Pod volume storage space available.";

  /** Name of the {@code k8s.pod.volume.capacity} metric. */
  public static final String K8S_POD_VOLUME_CAPACITY_NAME = "k8s.pod.volume.capacity";

  /** Unit of the {@code k8s.pod.volume.capacity} metric. */
  public static final String K8S_POD_VOLUME_CAPACITY_UNIT = "By";

  /** Description of the {@code k8s.pod.volume.capacity} metric. */
  public static final String K8S_POD_VOLUME_CAPACITY_DESCRIPTION = "Pod volume total capacity.";

  /** Name of the {@code k8s.pod.volume.inode.count} metric. */
  public static final String K8S_POD_VOLUME_INODE_COUNT_NAME = "k8s.pod.volume.inode.count";

  /** Unit of the {@code k8s.pod.volume.inode.count} metric. */
  public static final String K8S_POD_VOLUME_INODE_COUNT_UNIT = "{inode}";

  /** Description of the {@code k8s.pod.volume.inode.count} metric. */
  public static final String K8S_POD_VOLUME_INODE_COUNT_DESCRIPTION =
      "The total inodes in the filesystem of the Pod's volume.";

  /** Name of the {@code k8s.pod.volume.inode.free} metric. */
  public static final String K8S_POD_VOLUME_INODE_FREE_NAME = "k8s.pod.volume.inode.free";

  /** Unit of the {@code k8s.pod.volume.inode.free} metric. */
  public static final String K8S_POD_VOLUME_INODE_FREE_UNIT = "{inode}";

  /** Description of the {@code k8s.pod.volume.inode.free} metric. */
  public static final String K8S_POD_VOLUME_INODE_FREE_DESCRIPTION =
      "The free inodes in the filesystem of the Pod's volume.";

  /** Name of the {@code k8s.pod.volume.inode.used} metric. */
  public static final String K8S_POD_VOLUME_INODE_USED_NAME = "k8s.pod.volume.inode.used";

  /** Unit of the {@code k8s.pod.volume.inode.used} metric. */
  public static final String K8S_POD_VOLUME_INODE_USED_UNIT = "{inode}";

  /** Description of the {@code k8s.pod.volume.inode.used} metric. */
  public static final String K8S_POD_VOLUME_INODE_USED_DESCRIPTION =
      "The inodes used by the filesystem of the Pod's volume.";

  /** Name of the {@code k8s.pod.volume.usage} metric. */
  public static final String K8S_POD_VOLUME_USAGE_NAME = "k8s.pod.volume.usage";

  /** Unit of the {@code k8s.pod.volume.usage} metric. */
  public static final String K8S_POD_VOLUME_USAGE_UNIT = "By";

  /** Description of the {@code k8s.pod.volume.usage} metric. */
  public static final String K8S_POD_VOLUME_USAGE_DESCRIPTION = "Pod volume usage.";

  /**
   * Name of the {@code k8s.replicaset.available_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicaset.pod.available}.
   */
  @Deprecated
  public static final String K8S_REPLICASET_AVAILABLE_PODS_NAME = "k8s.replicaset.available_pods";

  /**
   * Unit of the {@code k8s.replicaset.available_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicaset.pod.available}.
   */
  @Deprecated public static final String K8S_REPLICASET_AVAILABLE_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.replicaset.available_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicaset.pod.available}.
   */
  @Deprecated
  public static final String K8S_REPLICASET_AVAILABLE_PODS_DESCRIPTION =
      "Deprecated, use `k8s.replicaset.pod.available` instead.";

  /**
   * Name of the {@code k8s.replicaset.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicaset.pod.desired}.
   */
  @Deprecated
  public static final String K8S_REPLICASET_DESIRED_PODS_NAME = "k8s.replicaset.desired_pods";

  /**
   * Unit of the {@code k8s.replicaset.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicaset.pod.desired}.
   */
  @Deprecated public static final String K8S_REPLICASET_DESIRED_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.replicaset.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicaset.pod.desired}.
   */
  @Deprecated
  public static final String K8S_REPLICASET_DESIRED_PODS_DESCRIPTION =
      "Deprecated, use `k8s.replicaset.pod.desired` instead.";

  /** Name of the {@code k8s.replicaset.pod.available} metric. */
  public static final String K8S_REPLICASET_POD_AVAILABLE_NAME = "k8s.replicaset.pod.available";

  /** Unit of the {@code k8s.replicaset.pod.available} metric. */
  public static final String K8S_REPLICASET_POD_AVAILABLE_UNIT = "{pod}";

  /** Description of the {@code k8s.replicaset.pod.available} metric. */
  public static final String K8S_REPLICASET_POD_AVAILABLE_DESCRIPTION =
      "Total number of available replica pods (ready for at least minReadySeconds) targeted by this replicaset.";

  /** Name of the {@code k8s.replicaset.pod.desired} metric. */
  public static final String K8S_REPLICASET_POD_DESIRED_NAME = "k8s.replicaset.pod.desired";

  /** Unit of the {@code k8s.replicaset.pod.desired} metric. */
  public static final String K8S_REPLICASET_POD_DESIRED_UNIT = "{pod}";

  /** Description of the {@code k8s.replicaset.pod.desired} metric. */
  public static final String K8S_REPLICASET_POD_DESIRED_DESCRIPTION =
      "Number of desired replica pods in this replicaset.";

  /**
   * Name of the {@code k8s.replication_controller.available_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicationcontroller.pod.available}.
   */
  @Deprecated
  public static final String K8S_REPLICATION_CONTROLLER_AVAILABLE_PODS_NAME =
      "k8s.replication_controller.available_pods";

  /**
   * Unit of the {@code k8s.replication_controller.available_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicationcontroller.pod.available}.
   */
  @Deprecated public static final String K8S_REPLICATION_CONTROLLER_AVAILABLE_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.replication_controller.available_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicationcontroller.pod.available}.
   */
  @Deprecated
  public static final String K8S_REPLICATION_CONTROLLER_AVAILABLE_PODS_DESCRIPTION =
      "Deprecated, use `k8s.replicationcontroller.pod.available` instead.";

  /**
   * Name of the {@code k8s.replication_controller.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicationcontroller.pod.desired}.
   */
  @Deprecated
  public static final String K8S_REPLICATION_CONTROLLER_DESIRED_PODS_NAME =
      "k8s.replication_controller.desired_pods";

  /**
   * Unit of the {@code k8s.replication_controller.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicationcontroller.pod.desired}.
   */
  @Deprecated public static final String K8S_REPLICATION_CONTROLLER_DESIRED_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.replication_controller.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicationcontroller.pod.desired}.
   */
  @Deprecated
  public static final String K8S_REPLICATION_CONTROLLER_DESIRED_PODS_DESCRIPTION =
      "Deprecated, use `k8s.replicationcontroller.pod.desired` instead.";

  /**
   * Name of the {@code k8s.replicationcontroller.available_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicationcontroller.pod.available}.
   */
  @Deprecated
  public static final String K8S_REPLICATIONCONTROLLER_AVAILABLE_PODS_NAME =
      "k8s.replicationcontroller.available_pods";

  /**
   * Unit of the {@code k8s.replicationcontroller.available_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicationcontroller.pod.available}.
   */
  @Deprecated public static final String K8S_REPLICATIONCONTROLLER_AVAILABLE_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.replicationcontroller.available_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicationcontroller.pod.available}.
   */
  @Deprecated
  public static final String K8S_REPLICATIONCONTROLLER_AVAILABLE_PODS_DESCRIPTION =
      "Deprecated, use `k8s.replicationcontroller.pod.available` instead.";

  /**
   * Name of the {@code k8s.replicationcontroller.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicationcontroller.pod.desired}.
   */
  @Deprecated
  public static final String K8S_REPLICATIONCONTROLLER_DESIRED_PODS_NAME =
      "k8s.replicationcontroller.desired_pods";

  /**
   * Unit of the {@code k8s.replicationcontroller.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicationcontroller.pod.desired}.
   */
  @Deprecated public static final String K8S_REPLICATIONCONTROLLER_DESIRED_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.replicationcontroller.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.replicationcontroller.pod.desired}.
   */
  @Deprecated
  public static final String K8S_REPLICATIONCONTROLLER_DESIRED_PODS_DESCRIPTION =
      "Deprecated, use `k8s.replicationcontroller.pod.desired` instead.";

  /** Name of the {@code k8s.replicationcontroller.pod.available} metric. */
  public static final String K8S_REPLICATIONCONTROLLER_POD_AVAILABLE_NAME =
      "k8s.replicationcontroller.pod.available";

  /** Unit of the {@code k8s.replicationcontroller.pod.available} metric. */
  public static final String K8S_REPLICATIONCONTROLLER_POD_AVAILABLE_UNIT = "{pod}";

  /** Description of the {@code k8s.replicationcontroller.pod.available} metric. */
  public static final String K8S_REPLICATIONCONTROLLER_POD_AVAILABLE_DESCRIPTION =
      "Total number of available replica pods (ready for at least minReadySeconds) targeted by this replication controller.";

  /** Name of the {@code k8s.replicationcontroller.pod.desired} metric. */
  public static final String K8S_REPLICATIONCONTROLLER_POD_DESIRED_NAME =
      "k8s.replicationcontroller.pod.desired";

  /** Unit of the {@code k8s.replicationcontroller.pod.desired} metric. */
  public static final String K8S_REPLICATIONCONTROLLER_POD_DESIRED_UNIT = "{pod}";

  /** Description of the {@code k8s.replicationcontroller.pod.desired} metric. */
  public static final String K8S_REPLICATIONCONTROLLER_POD_DESIRED_DESCRIPTION =
      "Number of desired replica pods in this replication controller.";

  /** Name of the {@code k8s.resourcequota.cpu.limit.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_CPU_LIMIT_HARD_NAME =
      "k8s.resourcequota.cpu.limit.hard";

  /** Unit of the {@code k8s.resourcequota.cpu.limit.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_CPU_LIMIT_HARD_UNIT = "{cpu}";

  /** Description of the {@code k8s.resourcequota.cpu.limit.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_CPU_LIMIT_HARD_DESCRIPTION =
      "The CPU limits in a specific namespace. The value represents the configured quota limit of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.cpu.limit.used} metric. */
  public static final String K8S_RESOURCEQUOTA_CPU_LIMIT_USED_NAME =
      "k8s.resourcequota.cpu.limit.used";

  /** Unit of the {@code k8s.resourcequota.cpu.limit.used} metric. */
  public static final String K8S_RESOURCEQUOTA_CPU_LIMIT_USED_UNIT = "{cpu}";

  /** Description of the {@code k8s.resourcequota.cpu.limit.used} metric. */
  public static final String K8S_RESOURCEQUOTA_CPU_LIMIT_USED_DESCRIPTION =
      "The CPU limits in a specific namespace. The value represents the current observed total usage of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.cpu.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_CPU_REQUEST_HARD_NAME =
      "k8s.resourcequota.cpu.request.hard";

  /** Unit of the {@code k8s.resourcequota.cpu.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_CPU_REQUEST_HARD_UNIT = "{cpu}";

  /** Description of the {@code k8s.resourcequota.cpu.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_CPU_REQUEST_HARD_DESCRIPTION =
      "The CPU requests in a specific namespace. The value represents the configured quota limit of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.cpu.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_CPU_REQUEST_USED_NAME =
      "k8s.resourcequota.cpu.request.used";

  /** Unit of the {@code k8s.resourcequota.cpu.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_CPU_REQUEST_USED_UNIT = "{cpu}";

  /** Description of the {@code k8s.resourcequota.cpu.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_CPU_REQUEST_USED_DESCRIPTION =
      "The CPU requests in a specific namespace. The value represents the current observed total usage of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.ephemeral_storage.limit.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_EPHEMERAL_STORAGE_LIMIT_HARD_NAME =
      "k8s.resourcequota.ephemeral_storage.limit.hard";

  /** Unit of the {@code k8s.resourcequota.ephemeral_storage.limit.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_EPHEMERAL_STORAGE_LIMIT_HARD_UNIT = "By";

  /** Description of the {@code k8s.resourcequota.ephemeral_storage.limit.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_EPHEMERAL_STORAGE_LIMIT_HARD_DESCRIPTION =
      "The sum of local ephemeral storage limits in the namespace. The value represents the configured quota limit of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.ephemeral_storage.limit.used} metric. */
  public static final String K8S_RESOURCEQUOTA_EPHEMERAL_STORAGE_LIMIT_USED_NAME =
      "k8s.resourcequota.ephemeral_storage.limit.used";

  /** Unit of the {@code k8s.resourcequota.ephemeral_storage.limit.used} metric. */
  public static final String K8S_RESOURCEQUOTA_EPHEMERAL_STORAGE_LIMIT_USED_UNIT = "By";

  /** Description of the {@code k8s.resourcequota.ephemeral_storage.limit.used} metric. */
  public static final String K8S_RESOURCEQUOTA_EPHEMERAL_STORAGE_LIMIT_USED_DESCRIPTION =
      "The sum of local ephemeral storage limits in the namespace. The value represents the current observed total usage of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.ephemeral_storage.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_EPHEMERAL_STORAGE_REQUEST_HARD_NAME =
      "k8s.resourcequota.ephemeral_storage.request.hard";

  /** Unit of the {@code k8s.resourcequota.ephemeral_storage.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_EPHEMERAL_STORAGE_REQUEST_HARD_UNIT = "By";

  /** Description of the {@code k8s.resourcequota.ephemeral_storage.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_EPHEMERAL_STORAGE_REQUEST_HARD_DESCRIPTION =
      "The sum of local ephemeral storage requests in the namespace. The value represents the configured quota limit of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.ephemeral_storage.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_EPHEMERAL_STORAGE_REQUEST_USED_NAME =
      "k8s.resourcequota.ephemeral_storage.request.used";

  /** Unit of the {@code k8s.resourcequota.ephemeral_storage.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_EPHEMERAL_STORAGE_REQUEST_USED_UNIT = "By";

  /** Description of the {@code k8s.resourcequota.ephemeral_storage.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_EPHEMERAL_STORAGE_REQUEST_USED_DESCRIPTION =
      "The sum of local ephemeral storage requests in the namespace. The value represents the current observed total usage of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.hugepage_count.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_HUGEPAGE_COUNT_REQUEST_HARD_NAME =
      "k8s.resourcequota.hugepage_count.request.hard";

  /** Unit of the {@code k8s.resourcequota.hugepage_count.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_HUGEPAGE_COUNT_REQUEST_HARD_UNIT = "{hugepage}";

  /** Description of the {@code k8s.resourcequota.hugepage_count.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_HUGEPAGE_COUNT_REQUEST_HARD_DESCRIPTION =
      "The huge page requests in a specific namespace. The value represents the configured quota limit of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.hugepage_count.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_HUGEPAGE_COUNT_REQUEST_USED_NAME =
      "k8s.resourcequota.hugepage_count.request.used";

  /** Unit of the {@code k8s.resourcequota.hugepage_count.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_HUGEPAGE_COUNT_REQUEST_USED_UNIT = "{hugepage}";

  /** Description of the {@code k8s.resourcequota.hugepage_count.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_HUGEPAGE_COUNT_REQUEST_USED_DESCRIPTION =
      "The huge page requests in a specific namespace. The value represents the current observed total usage of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.memory.limit.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_MEMORY_LIMIT_HARD_NAME =
      "k8s.resourcequota.memory.limit.hard";

  /** Unit of the {@code k8s.resourcequota.memory.limit.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_MEMORY_LIMIT_HARD_UNIT = "By";

  /** Description of the {@code k8s.resourcequota.memory.limit.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_MEMORY_LIMIT_HARD_DESCRIPTION =
      "The memory limits in a specific namespace. The value represents the configured quota limit of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.memory.limit.used} metric. */
  public static final String K8S_RESOURCEQUOTA_MEMORY_LIMIT_USED_NAME =
      "k8s.resourcequota.memory.limit.used";

  /** Unit of the {@code k8s.resourcequota.memory.limit.used} metric. */
  public static final String K8S_RESOURCEQUOTA_MEMORY_LIMIT_USED_UNIT = "By";

  /** Description of the {@code k8s.resourcequota.memory.limit.used} metric. */
  public static final String K8S_RESOURCEQUOTA_MEMORY_LIMIT_USED_DESCRIPTION =
      "The memory limits in a specific namespace. The value represents the current observed total usage of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.memory.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_MEMORY_REQUEST_HARD_NAME =
      "k8s.resourcequota.memory.request.hard";

  /** Unit of the {@code k8s.resourcequota.memory.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_MEMORY_REQUEST_HARD_UNIT = "By";

  /** Description of the {@code k8s.resourcequota.memory.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_MEMORY_REQUEST_HARD_DESCRIPTION =
      "The memory requests in a specific namespace. The value represents the configured quota limit of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.memory.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_MEMORY_REQUEST_USED_NAME =
      "k8s.resourcequota.memory.request.used";

  /** Unit of the {@code k8s.resourcequota.memory.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_MEMORY_REQUEST_USED_UNIT = "By";

  /** Description of the {@code k8s.resourcequota.memory.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_MEMORY_REQUEST_USED_DESCRIPTION =
      "The memory requests in a specific namespace. The value represents the current observed total usage of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.object_count.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_OBJECT_COUNT_HARD_NAME =
      "k8s.resourcequota.object_count.hard";

  /** Unit of the {@code k8s.resourcequota.object_count.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_OBJECT_COUNT_HARD_UNIT = "{object}";

  /** Description of the {@code k8s.resourcequota.object_count.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_OBJECT_COUNT_HARD_DESCRIPTION =
      "The object count limits in a specific namespace. The value represents the configured quota limit of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.object_count.used} metric. */
  public static final String K8S_RESOURCEQUOTA_OBJECT_COUNT_USED_NAME =
      "k8s.resourcequota.object_count.used";

  /** Unit of the {@code k8s.resourcequota.object_count.used} metric. */
  public static final String K8S_RESOURCEQUOTA_OBJECT_COUNT_USED_UNIT = "{object}";

  /** Description of the {@code k8s.resourcequota.object_count.used} metric. */
  public static final String K8S_RESOURCEQUOTA_OBJECT_COUNT_USED_DESCRIPTION =
      "The object count limits in a specific namespace. The value represents the current observed total usage of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.persistentvolumeclaim_count.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_PERSISTENTVOLUMECLAIM_COUNT_HARD_NAME =
      "k8s.resourcequota.persistentvolumeclaim_count.hard";

  /** Unit of the {@code k8s.resourcequota.persistentvolumeclaim_count.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_PERSISTENTVOLUMECLAIM_COUNT_HARD_UNIT =
      "{persistentvolumeclaim}";

  /** Description of the {@code k8s.resourcequota.persistentvolumeclaim_count.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_PERSISTENTVOLUMECLAIM_COUNT_HARD_DESCRIPTION =
      "The total number of PersistentVolumeClaims that can exist in the namespace. The value represents the configured quota limit of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.persistentvolumeclaim_count.used} metric. */
  public static final String K8S_RESOURCEQUOTA_PERSISTENTVOLUMECLAIM_COUNT_USED_NAME =
      "k8s.resourcequota.persistentvolumeclaim_count.used";

  /** Unit of the {@code k8s.resourcequota.persistentvolumeclaim_count.used} metric. */
  public static final String K8S_RESOURCEQUOTA_PERSISTENTVOLUMECLAIM_COUNT_USED_UNIT =
      "{persistentvolumeclaim}";

  /** Description of the {@code k8s.resourcequota.persistentvolumeclaim_count.used} metric. */
  public static final String K8S_RESOURCEQUOTA_PERSISTENTVOLUMECLAIM_COUNT_USED_DESCRIPTION =
      "The total number of PersistentVolumeClaims that can exist in the namespace. The value represents the current observed total usage of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.storage.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_STORAGE_REQUEST_HARD_NAME =
      "k8s.resourcequota.storage.request.hard";

  /** Unit of the {@code k8s.resourcequota.storage.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_STORAGE_REQUEST_HARD_UNIT = "By";

  /** Description of the {@code k8s.resourcequota.storage.request.hard} metric. */
  public static final String K8S_RESOURCEQUOTA_STORAGE_REQUEST_HARD_DESCRIPTION =
      "The storage requests in a specific namespace. The value represents the configured quota limit of the resource in the namespace. ";

  /** Name of the {@code k8s.resourcequota.storage.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_STORAGE_REQUEST_USED_NAME =
      "k8s.resourcequota.storage.request.used";

  /** Unit of the {@code k8s.resourcequota.storage.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_STORAGE_REQUEST_USED_UNIT = "By";

  /** Description of the {@code k8s.resourcequota.storage.request.used} metric. */
  public static final String K8S_RESOURCEQUOTA_STORAGE_REQUEST_USED_DESCRIPTION =
      "The storage requests in a specific namespace. The value represents the current observed total usage of the resource in the namespace. ";

  /** Name of the {@code k8s.service.endpoint.count} metric. */
  public static final String K8S_SERVICE_ENDPOINT_COUNT_NAME = "k8s.service.endpoint.count";

  /** Unit of the {@code k8s.service.endpoint.count} metric. */
  public static final String K8S_SERVICE_ENDPOINT_COUNT_UNIT = "{endpoint}";

  /** Description of the {@code k8s.service.endpoint.count} metric. */
  public static final String K8S_SERVICE_ENDPOINT_COUNT_DESCRIPTION =
      "Number of endpoints for a service by condition and address type.";

  /** Name of the {@code k8s.service.load_balancer.ingress.count} metric. */
  public static final String K8S_SERVICE_LOAD_BALANCER_INGRESS_COUNT_NAME =
      "k8s.service.load_balancer.ingress.count";

  /** Unit of the {@code k8s.service.load_balancer.ingress.count} metric. */
  public static final String K8S_SERVICE_LOAD_BALANCER_INGRESS_COUNT_UNIT = "{ingress}";

  /** Description of the {@code k8s.service.load_balancer.ingress.count} metric. */
  public static final String K8S_SERVICE_LOAD_BALANCER_INGRESS_COUNT_DESCRIPTION =
      "Number of load balancer ingress points (external IPs/hostnames) assigned to the service.";

  /**
   * Name of the {@code k8s.statefulset.current_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.statefulset.pod.current}.
   */
  @Deprecated
  public static final String K8S_STATEFULSET_CURRENT_PODS_NAME = "k8s.statefulset.current_pods";

  /**
   * Unit of the {@code k8s.statefulset.current_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.statefulset.pod.current}.
   */
  @Deprecated public static final String K8S_STATEFULSET_CURRENT_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.statefulset.current_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.statefulset.pod.current}.
   */
  @Deprecated
  public static final String K8S_STATEFULSET_CURRENT_PODS_DESCRIPTION =
      "Deprecated, use `k8s.statefulset.pod.current` instead.";

  /**
   * Name of the {@code k8s.statefulset.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.statefulset.pod.desired}.
   */
  @Deprecated
  public static final String K8S_STATEFULSET_DESIRED_PODS_NAME = "k8s.statefulset.desired_pods";

  /**
   * Unit of the {@code k8s.statefulset.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.statefulset.pod.desired}.
   */
  @Deprecated public static final String K8S_STATEFULSET_DESIRED_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.statefulset.desired_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.statefulset.pod.desired}.
   */
  @Deprecated
  public static final String K8S_STATEFULSET_DESIRED_PODS_DESCRIPTION =
      "Deprecated, use `k8s.statefulset.pod.desired` instead.";

  /** Name of the {@code k8s.statefulset.pod.current} metric. */
  public static final String K8S_STATEFULSET_POD_CURRENT_NAME = "k8s.statefulset.pod.current";

  /** Unit of the {@code k8s.statefulset.pod.current} metric. */
  public static final String K8S_STATEFULSET_POD_CURRENT_UNIT = "{pod}";

  /** Description of the {@code k8s.statefulset.pod.current} metric. */
  public static final String K8S_STATEFULSET_POD_CURRENT_DESCRIPTION =
      "The number of replica pods created by the statefulset controller from the statefulset version indicated by currentRevision.";

  /** Name of the {@code k8s.statefulset.pod.desired} metric. */
  public static final String K8S_STATEFULSET_POD_DESIRED_NAME = "k8s.statefulset.pod.desired";

  /** Unit of the {@code k8s.statefulset.pod.desired} metric. */
  public static final String K8S_STATEFULSET_POD_DESIRED_UNIT = "{pod}";

  /** Description of the {@code k8s.statefulset.pod.desired} metric. */
  public static final String K8S_STATEFULSET_POD_DESIRED_DESCRIPTION =
      "Number of desired replica pods in this statefulset.";

  /** Name of the {@code k8s.statefulset.pod.ready} metric. */
  public static final String K8S_STATEFULSET_POD_READY_NAME = "k8s.statefulset.pod.ready";

  /** Unit of the {@code k8s.statefulset.pod.ready} metric. */
  public static final String K8S_STATEFULSET_POD_READY_UNIT = "{pod}";

  /** Description of the {@code k8s.statefulset.pod.ready} metric. */
  public static final String K8S_STATEFULSET_POD_READY_DESCRIPTION =
      "The number of replica pods created for this statefulset with a Ready Condition.";

  /** Name of the {@code k8s.statefulset.pod.updated} metric. */
  public static final String K8S_STATEFULSET_POD_UPDATED_NAME = "k8s.statefulset.pod.updated";

  /** Unit of the {@code k8s.statefulset.pod.updated} metric. */
  public static final String K8S_STATEFULSET_POD_UPDATED_UNIT = "{pod}";

  /** Description of the {@code k8s.statefulset.pod.updated} metric. */
  public static final String K8S_STATEFULSET_POD_UPDATED_DESCRIPTION =
      "Number of replica pods created by the statefulset controller from the statefulset version indicated by updateRevision.";

  /**
   * Name of the {@code k8s.statefulset.ready_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.statefulset.pod.ready}.
   */
  @Deprecated
  public static final String K8S_STATEFULSET_READY_PODS_NAME = "k8s.statefulset.ready_pods";

  /**
   * Unit of the {@code k8s.statefulset.ready_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.statefulset.pod.ready}.
   */
  @Deprecated public static final String K8S_STATEFULSET_READY_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.statefulset.ready_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.statefulset.pod.ready}.
   */
  @Deprecated
  public static final String K8S_STATEFULSET_READY_PODS_DESCRIPTION =
      "Deprecated, use `k8s.statefulset.pod.ready` instead.";

  /**
   * Name of the {@code k8s.statefulset.updated_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.statefulset.pod.updated}.
   */
  @Deprecated
  public static final String K8S_STATEFULSET_UPDATED_PODS_NAME = "k8s.statefulset.updated_pods";

  /**
   * Unit of the {@code k8s.statefulset.updated_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.statefulset.pod.updated}.
   */
  @Deprecated public static final String K8S_STATEFULSET_UPDATED_PODS_UNIT = "{pod}";

  /**
   * Description of the {@code k8s.statefulset.updated_pods} metric.
   *
   * @deprecated Replaced by {@code k8s.statefulset.pod.updated}.
   */
  @Deprecated
  public static final String K8S_STATEFULSET_UPDATED_PODS_DESCRIPTION =
      "Deprecated, use `k8s.statefulset.pod.updated` instead.";

  private K8sIncubatingMetrics() {}
}
