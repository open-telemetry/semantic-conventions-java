/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class K8sIncubatingAttributes {

  /** The name of the cluster. */
  public static final AttributeKey<String> K8S_CLUSTER_NAME = stringKey("k8s.cluster.name");

  /**
   * A pseudo-ID for the cluster, set to the UID of the <code>kube-system</code> namespace.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>K8s doesn't have support for obtaining a cluster ID. If this is ever added, we will
   *       recommend collecting the `k8s.cluster.uid` through the official APIs. In the meantime, we
   *       are able to use the `uid` of the `kube-system` namespace as a proxy for cluster ID. Read
   *       on for the rationale.
   *       <p>Every object created in a K8s cluster is assigned a distinct UID. The `kube-system`
   *       namespace is used by Kubernetes itself and will exist for the lifetime of the cluster.
   *       Using the `uid` of the `kube-system` namespace is a reasonable proxy for the K8s
   *       ClusterID as it will only change if the cluster is rebuilt. Furthermore, Kubernetes UIDs
   *       are UUIDs as standardized by [ISO/IEC 9834-8 and ITU-T
   *       X.667](https://www.itu.int/ITU-T/studygroups/com17/oid.html). Which states:
   *       <p>If generated according to one of the mechanisms defined in Rec. ITU-T X.667 | ISO/IEC
   *       9834-8, a UUID is either guaranteed to be different from all other UUIDs generated before
   *       3603 A.D., or is extremely likely to be different (depending on the mechanism chosen).
   *       <p>Therefore, UIDs between clusters should be extremely unlikely to conflict.
   * </ul>
   */
  public static final AttributeKey<String> K8S_CLUSTER_UID = stringKey("k8s.cluster.uid");

  /**
   * The name of the Container from Pod specification, must be unique within a Pod. Container
   * runtime usually uses different globally unique name (<code>container.name</code>).
   */
  public static final AttributeKey<String> K8S_CONTAINER_NAME = stringKey("k8s.container.name");

  /**
   * Number of times the container was restarted. This attribute can be used to identify a
   * particular container (running or stopped) within a container spec.
   */
  public static final AttributeKey<Long> K8S_CONTAINER_RESTART_COUNT =
      longKey("k8s.container.restart_count");

  /** Last terminated reason of the Container. */
  public static final AttributeKey<String> K8S_CONTAINER_STATUS_LAST_TERMINATED_REASON =
      stringKey("k8s.container.status.last_terminated_reason");

  /** The name of the CronJob. */
  public static final AttributeKey<String> K8S_CRONJOB_NAME = stringKey("k8s.cronjob.name");

  /** The UID of the CronJob. */
  public static final AttributeKey<String> K8S_CRONJOB_UID = stringKey("k8s.cronjob.uid");

  /** The name of the DaemonSet. */
  public static final AttributeKey<String> K8S_DAEMONSET_NAME = stringKey("k8s.daemonset.name");

  /** The UID of the DaemonSet. */
  public static final AttributeKey<String> K8S_DAEMONSET_UID = stringKey("k8s.daemonset.uid");

  /** The name of the Deployment. */
  public static final AttributeKey<String> K8S_DEPLOYMENT_NAME = stringKey("k8s.deployment.name");

  /** The UID of the Deployment. */
  public static final AttributeKey<String> K8S_DEPLOYMENT_UID = stringKey("k8s.deployment.uid");

  /** The name of the Job. */
  public static final AttributeKey<String> K8S_JOB_NAME = stringKey("k8s.job.name");

  /** The UID of the Job. */
  public static final AttributeKey<String> K8S_JOB_UID = stringKey("k8s.job.uid");

  /** The name of the namespace that the pod is running in. */
  public static final AttributeKey<String> K8S_NAMESPACE_NAME = stringKey("k8s.namespace.name");

  /** The name of the Node. */
  public static final AttributeKey<String> K8S_NODE_NAME = stringKey("k8s.node.name");

  /** The UID of the Node. */
  public static final AttributeKey<String> K8S_NODE_UID = stringKey("k8s.node.uid");

  /**
   * The annotation key-value pairs placed on the Pod, the <code>&lt;key&gt;</code> being the
   * annotation name, the value being the annotation value.
   */
  public static final AttributeKeyTemplate<String> K8S_POD_ANNOTATION =
      stringKeyTemplate("k8s.pod.annotation");

  /**
   * The label key-value pairs placed on the Pod, the <code>&lt;key&gt;</code> being the label name,
   * the value being the label value.
   */
  public static final AttributeKeyTemplate<String> K8S_POD_LABEL =
      stringKeyTemplate("k8s.pod.label");

  /** The name of the Pod. */
  public static final AttributeKey<String> K8S_POD_NAME = stringKey("k8s.pod.name");

  /** The UID of the Pod. */
  public static final AttributeKey<String> K8S_POD_UID = stringKey("k8s.pod.uid");

  /** The name of the ReplicaSet. */
  public static final AttributeKey<String> K8S_REPLICASET_NAME = stringKey("k8s.replicaset.name");

  /** The UID of the ReplicaSet. */
  public static final AttributeKey<String> K8S_REPLICASET_UID = stringKey("k8s.replicaset.uid");

  /** The name of the StatefulSet. */
  public static final AttributeKey<String> K8S_STATEFULSET_NAME = stringKey("k8s.statefulset.name");

  /** The UID of the StatefulSet. */
  public static final AttributeKey<String> K8S_STATEFULSET_UID = stringKey("k8s.statefulset.uid");

  private K8sIncubatingAttributes() {}
}
