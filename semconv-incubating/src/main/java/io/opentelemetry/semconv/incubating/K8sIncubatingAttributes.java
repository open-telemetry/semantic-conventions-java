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
   * A pseudo-ID for the cluster, set to the UID of the {@code kube-system} namespace.
   *
   * <p>Notes:
   *
   * <p>K8s doesn't have support for obtaining a cluster ID. If this is ever added, we will
   * recommend collecting the {@code k8s.cluster.uid} through the official APIs. In the meantime, we
   * are able to use the {@code uid} of the {@code kube-system} namespace as a proxy for cluster ID.
   * Read on for the rationale.
   *
   * <p>Every object created in a K8s cluster is assigned a distinct UID. The {@code kube-system}
   * namespace is used by Kubernetes itself and will exist for the lifetime of the cluster. Using
   * the {@code uid} of the {@code kube-system} namespace is a reasonable proxy for the K8s
   * ClusterID as it will only change if the cluster is rebuilt. Furthermore, Kubernetes UIDs are
   * UUIDs as standardized by <a href="https://www.itu.int/ITU-T/studygroups/com17/oid.html">ISO/IEC
   * 9834-8 and ITU-T X.667</a>. Which states:
   *
   * <blockquote>
   *
   * If generated according to one of the mechanisms defined in Rec. ITU-T X.667 | ISO/IEC 9834-8, a
   * UUID is either guaranteed to be different from all other UUIDs generated before 3603 A.D., or
   * is extremely likely to be different (depending on the mechanism chosen).
   *
   * </blockquote>
   *
   * <p>Therefore, UIDs between clusters should be extremely unlikely to conflict.
   */
  public static final AttributeKey<String> K8S_CLUSTER_UID = stringKey("k8s.cluster.uid");

  /**
   * The name of the Container from Pod specification, must be unique within a Pod. Container
   * runtime usually uses different globally unique name ({@code container.name}).
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

  /**
   * The reason for the container state. Corresponds to the {@code reason} field of the: <a
   * href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#containerstatewaiting-v1-core">K8s
   * ContainerStateWaiting</a> or <a
   * href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#containerstateterminated-v1-core">K8s
   * ContainerStateTerminated</a>
   */
  public static final AttributeKey<String> K8S_CONTAINER_STATUS_REASON =
      stringKey("k8s.container.status.reason");

  /**
   * The state of the container. <a
   * href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#containerstate-v1-core">K8s
   * ContainerState</a>
   */
  public static final AttributeKey<String> K8S_CONTAINER_STATUS_STATE =
      stringKey("k8s.container.status.state");

  /**
   * The cronjob annotation placed on the CronJob, the {@code <key>} being the annotation name, the
   * value being the annotation value.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>An annotation {@code retries} with value {@code 4} SHOULD be recorded as the {@code
   *       k8s.cronjob.annotation.retries} attribute with value {@code "4"}.
   *   <li>An annotation {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.cronjob.annotation.data} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_CRONJOB_ANNOTATION =
      stringKeyTemplate("k8s.cronjob.annotation");

  /**
   * The label placed on the CronJob, the {@code <key>} being the label name, the value being the
   * label value.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code type} with value {@code weekly} SHOULD be recorded as the {@code
   *       k8s.cronjob.label.type} attribute with value {@code "weekly"}.
   *   <li>A label {@code automated} with empty string value SHOULD be recorded as the {@code
   *       k8s.cronjob.label.automated} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_CRONJOB_LABEL =
      stringKeyTemplate("k8s.cronjob.label");

  /** The name of the CronJob. */
  public static final AttributeKey<String> K8S_CRONJOB_NAME = stringKey("k8s.cronjob.name");

  /** The UID of the CronJob. */
  public static final AttributeKey<String> K8S_CRONJOB_UID = stringKey("k8s.cronjob.uid");

  /**
   * The annotation placed on the DaemonSet, the {@code <key>} being the annotation name, the value
   * being the annotation value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code replicas} with value {@code 1} SHOULD be recorded as the {@code
   *       k8s.daemonset.annotation.replicas} attribute with value {@code "1"}.
   *   <li>A label {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.daemonset.annotation.data} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_DAEMONSET_ANNOTATION =
      stringKeyTemplate("k8s.daemonset.annotation");

  /**
   * The label placed on the DaemonSet, the {@code <key>} being the label name, the value being the
   * label value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code app} with value {@code guestbook} SHOULD be recorded as the {@code
   *       k8s.daemonset.label.app} attribute with value {@code "guestbook"}.
   *   <li>A label {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.daemonset.label.injected} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_DAEMONSET_LABEL =
      stringKeyTemplate("k8s.daemonset.label");

  /** The name of the DaemonSet. */
  public static final AttributeKey<String> K8S_DAEMONSET_NAME = stringKey("k8s.daemonset.name");

  /** The UID of the DaemonSet. */
  public static final AttributeKey<String> K8S_DAEMONSET_UID = stringKey("k8s.daemonset.uid");

  /**
   * The annotation placed on the Deployment, the {@code <key>} being the annotation name, the value
   * being the annotation value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code replicas} with value {@code 1} SHOULD be recorded as the {@code
   *       k8s.deployment.annotation.replicas} attribute with value {@code "1"}.
   *   <li>A label {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.deployment.annotation.data} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_DEPLOYMENT_ANNOTATION =
      stringKeyTemplate("k8s.deployment.annotation");

  /**
   * The label placed on the Deployment, the {@code <key>} being the label name, the value being the
   * label value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code replicas} with value {@code 0} SHOULD be recorded as the {@code
   *       k8s.deployment.label.app} attribute with value {@code "guestbook"}.
   *   <li>A label {@code injected} with empty string value SHOULD be recorded as the {@code
   *       k8s.deployment.label.injected} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_DEPLOYMENT_LABEL =
      stringKeyTemplate("k8s.deployment.label");

  /** The name of the Deployment. */
  public static final AttributeKey<String> K8S_DEPLOYMENT_NAME = stringKey("k8s.deployment.name");

  /** The UID of the Deployment. */
  public static final AttributeKey<String> K8S_DEPLOYMENT_UID = stringKey("k8s.deployment.uid");

  /**
   * The type of metric source for the horizontal pod autoscaler.
   *
   * <p>Notes:
   *
   * <p>This attribute reflects the {@code type} field of spec.metrics[] in the HPA.
   */
  public static final AttributeKey<String> K8S_HPA_METRIC_TYPE = stringKey("k8s.hpa.metric.type");

  /** The name of the horizontal pod autoscaler. */
  public static final AttributeKey<String> K8S_HPA_NAME = stringKey("k8s.hpa.name");

  /**
   * The API version of the target resource to scale for the HorizontalPodAutoscaler.
   *
   * <p>Notes:
   *
   * <p>This maps to the {@code apiVersion} field in the {@code scaleTargetRef} of the HPA spec.
   */
  public static final AttributeKey<String> K8S_HPA_SCALETARGETREF_API_VERSION =
      stringKey("k8s.hpa.scaletargetref.api_version");

  /**
   * The kind of the target resource to scale for the HorizontalPodAutoscaler.
   *
   * <p>Notes:
   *
   * <p>This maps to the {@code kind} field in the {@code scaleTargetRef} of the HPA spec.
   */
  public static final AttributeKey<String> K8S_HPA_SCALETARGETREF_KIND =
      stringKey("k8s.hpa.scaletargetref.kind");

  /**
   * The name of the target resource to scale for the HorizontalPodAutoscaler.
   *
   * <p>Notes:
   *
   * <p>This maps to the {@code name} field in the {@code scaleTargetRef} of the HPA spec.
   */
  public static final AttributeKey<String> K8S_HPA_SCALETARGETREF_NAME =
      stringKey("k8s.hpa.scaletargetref.name");

  /** The UID of the horizontal pod autoscaler. */
  public static final AttributeKey<String> K8S_HPA_UID = stringKey("k8s.hpa.uid");

  /** The size (identifier) of the K8s huge page. */
  public static final AttributeKey<String> K8S_HUGEPAGE_SIZE = stringKey("k8s.hugepage.size");

  /**
   * The annotation placed on the Job, the {@code <key>} being the annotation name, the value being
   * the annotation value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code number} with value {@code 1} SHOULD be recorded as the {@code
   *       k8s.job.annotation.number} attribute with value {@code "1"}.
   *   <li>A label {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.job.annotation.data} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_JOB_ANNOTATION =
      stringKeyTemplate("k8s.job.annotation");

  /**
   * The label placed on the Job, the {@code <key>} being the label name, the value being the label
   * value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code jobtype} with value {@code ci} SHOULD be recorded as the {@code
   *       k8s.job.label.jobtype} attribute with value {@code "ci"}.
   *   <li>A label {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.job.label.automated} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_JOB_LABEL =
      stringKeyTemplate("k8s.job.label");

  /** The name of the Job. */
  public static final AttributeKey<String> K8S_JOB_NAME = stringKey("k8s.job.name");

  /** The UID of the Job. */
  public static final AttributeKey<String> K8S_JOB_UID = stringKey("k8s.job.uid");

  /**
   * The annotation placed on the Namespace, the {@code <key>} being the annotation name, the value
   * being the annotation value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code ttl} with value {@code 0} SHOULD be recorded as the {@code
   *       k8s.namespace.annotation.ttl} attribute with value {@code "0"}.
   *   <li>A label {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.namespace.annotation.data} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_NAMESPACE_ANNOTATION =
      stringKeyTemplate("k8s.namespace.annotation");

  /**
   * The label placed on the Namespace, the {@code <key>} being the label name, the value being the
   * label value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code kubernetes.io/metadata.name} with value {@code default} SHOULD be recorded
   *       as the {@code k8s.namespace.label.kubernetes.io/metadata.name} attribute with value
   *       {@code "default"}.
   *   <li>A label {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.namespace.label.data} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_NAMESPACE_LABEL =
      stringKeyTemplate("k8s.namespace.label");

  /** The name of the namespace that the pod is running in. */
  public static final AttributeKey<String> K8S_NAMESPACE_NAME = stringKey("k8s.namespace.name");

  /**
   * The phase of the K8s namespace.
   *
   * <p>Notes:
   *
   * <p>This attribute aligns with the {@code phase} field of the <a
   * href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#namespacestatus-v1-core">K8s
   * NamespaceStatus</a>
   */
  public static final AttributeKey<String> K8S_NAMESPACE_PHASE = stringKey("k8s.namespace.phase");

  /**
   * The annotation placed on the Node, the {@code <key>} being the annotation name, the value being
   * the annotation value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>An annotation {@code node.alpha.kubernetes.io/ttl} with value {@code 0} SHOULD be
   *       recorded as the {@code k8s.node.annotation.node.alpha.kubernetes.io/ttl} attribute with
   *       value {@code "0"}.
   *   <li>An annotation {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.node.annotation.data} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_NODE_ANNOTATION =
      stringKeyTemplate("k8s.node.annotation");

  /**
   * The status of the condition, one of True, False, Unknown.
   *
   * <p>Notes:
   *
   * <p>This attribute aligns with the {@code status} field of the <a
   * href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#nodecondition-v1-core">NodeCondition</a>
   */
  public static final AttributeKey<String> K8S_NODE_CONDITION_STATUS =
      stringKey("k8s.node.condition.status");

  /**
   * The condition type of a K8s Node.
   *
   * <p>Notes:
   *
   * <p>K8s Node conditions as described by <a
   * href="https://v1-32.docs.kubernetes.io/docs/reference/node/node-status/#condition">K8s
   * documentation</a>.
   *
   * <p>This attribute aligns with the {@code type} field of the <a
   * href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#nodecondition-v1-core">NodeCondition</a>
   *
   * <p>The set of possible values is not limited to those listed here. Managed Kubernetes
   * environments, or custom controllers MAY introduce additional node condition types. When this
   * occurs, the exact value as reported by the Kubernetes API SHOULD be used.
   */
  public static final AttributeKey<String> K8S_NODE_CONDITION_TYPE =
      stringKey("k8s.node.condition.type");

  /**
   * The label placed on the Node, the {@code <key>} being the label name, the value being the label
   * value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code kubernetes.io/arch} with value {@code arm64} SHOULD be recorded as the
   *       {@code k8s.node.label.kubernetes.io/arch} attribute with value {@code "arm64"}.
   *   <li>A label {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.node.label.data} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_NODE_LABEL =
      stringKeyTemplate("k8s.node.label");

  /** The name of the Node. */
  public static final AttributeKey<String> K8S_NODE_NAME = stringKey("k8s.node.name");

  /** The UID of the Node. */
  public static final AttributeKey<String> K8S_NODE_UID = stringKey("k8s.node.uid");

  /**
   * The annotation placed on the Pod, the {@code <key>} being the annotation name, the value being
   * the annotation value.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>An annotation {@code kubernetes.io/enforce-mountable-secrets} with value {@code true}
   *       SHOULD be recorded as the {@code
   *       k8s.pod.annotation.kubernetes.io/enforce-mountable-secrets} attribute with value {@code
   *       "true"}.
   *   <li>An annotation {@code mycompany.io/arch} with value {@code x64} SHOULD be recorded as the
   *       {@code k8s.pod.annotation.mycompany.io/arch} attribute with value {@code "x64"}.
   *   <li>An annotation {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.pod.annotation.data} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_POD_ANNOTATION =
      stringKeyTemplate("k8s.pod.annotation");

  /**
   * Specifies the hostname of the Pod.
   *
   * <p>Notes:
   *
   * <p>The K8s Pod spec has an optional hostname field, which can be used to specify a hostname.
   * Refer to <a
   * href="https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-hostname-and-subdomain-field">K8s
   * docs</a> for more information about this field.
   *
   * <p>This attribute aligns with the {@code hostname} field of the <a
   * href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.34/#podspec-v1-core">K8s
   * PodSpec</a>.
   */
  public static final AttributeKey<String> K8S_POD_HOSTNAME = stringKey("k8s.pod.hostname");

  /**
   * IP address allocated to the Pod.
   *
   * <p>Notes:
   *
   * <p>This attribute aligns with the {@code podIP} field of the <a
   * href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.34/#podstatus-v1-core">K8s
   * PodStatus</a>.
   */
  public static final AttributeKey<String> K8S_POD_IP = stringKey("k8s.pod.ip");

  /**
   * The label placed on the Pod, the {@code <key>} being the label name, the value being the label
   * value.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code app} with value {@code my-app} SHOULD be recorded as the {@code
   *       k8s.pod.label.app} attribute with value {@code "my-app"}.
   *   <li>A label {@code mycompany.io/arch} with value {@code x64} SHOULD be recorded as the {@code
   *       k8s.pod.label.mycompany.io/arch} attribute with value {@code "x64"}.
   *   <li>A label {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.pod.label.data} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_POD_LABEL =
      stringKeyTemplate("k8s.pod.label");

  /**
   * Deprecated, use {@code k8s.pod.label} instead.
   *
   * @deprecated Replaced by {@code k8s.pod.label}.
   */
  @Deprecated
  public static final AttributeKeyTemplate<String> K8S_POD_LABELS =
      stringKeyTemplate("k8s.pod.labels");

  /** The name of the Pod. */
  public static final AttributeKey<String> K8S_POD_NAME = stringKey("k8s.pod.name");

  /**
   * The start timestamp of the Pod.
   *
   * <p>Notes:
   *
   * <p>Date and time at which the object was acknowledged by the Kubelet. This is before the
   * Kubelet pulled the container image(s) for the pod.
   *
   * <p>This attribute aligns with the {@code startTime} field of the <a
   * href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.34/#podstatus-v1-core">K8s
   * PodStatus</a>, in ISO 8601 (RFC 3339 compatible) format.
   */
  public static final AttributeKey<String> K8S_POD_START_TIME = stringKey("k8s.pod.start_time");

  /**
   * The phase for the pod. Corresponds to the {@code phase} field of the: <a
   * href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.33/#podstatus-v1-core">K8s
   * PodStatus</a>
   */
  public static final AttributeKey<String> K8S_POD_STATUS_PHASE = stringKey("k8s.pod.status.phase");

  /**
   * The reason for the pod state. Corresponds to the {@code reason} field of the: <a
   * href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.33/#podstatus-v1-core">K8s
   * PodStatus</a>
   */
  public static final AttributeKey<String> K8S_POD_STATUS_REASON =
      stringKey("k8s.pod.status.reason");

  /** The UID of the Pod. */
  public static final AttributeKey<String> K8S_POD_UID = stringKey("k8s.pod.uid");

  /**
   * The annotation placed on the ReplicaSet, the {@code <key>} being the annotation name, the value
   * being the annotation value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code replicas} with value {@code 0} SHOULD be recorded as the {@code
   *       k8s.replicaset.annotation.replicas} attribute with value {@code "0"}.
   *   <li>A label {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.replicaset.annotation.data} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_REPLICASET_ANNOTATION =
      stringKeyTemplate("k8s.replicaset.annotation");

  /**
   * The label placed on the ReplicaSet, the {@code <key>} being the label name, the value being the
   * label value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code app} with value {@code guestbook} SHOULD be recorded as the {@code
   *       k8s.replicaset.label.app} attribute with value {@code "guestbook"}.
   *   <li>A label {@code injected} with empty string value SHOULD be recorded as the {@code
   *       k8s.replicaset.label.injected} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_REPLICASET_LABEL =
      stringKeyTemplate("k8s.replicaset.label");

  /** The name of the ReplicaSet. */
  public static final AttributeKey<String> K8S_REPLICASET_NAME = stringKey("k8s.replicaset.name");

  /** The UID of the ReplicaSet. */
  public static final AttributeKey<String> K8S_REPLICASET_UID = stringKey("k8s.replicaset.uid");

  /** The name of the replication controller. */
  public static final AttributeKey<String> K8S_REPLICATIONCONTROLLER_NAME =
      stringKey("k8s.replicationcontroller.name");

  /** The UID of the replication controller. */
  public static final AttributeKey<String> K8S_REPLICATIONCONTROLLER_UID =
      stringKey("k8s.replicationcontroller.uid");

  /** The name of the resource quota. */
  public static final AttributeKey<String> K8S_RESOURCEQUOTA_NAME =
      stringKey("k8s.resourcequota.name");

  /**
   * The name of the K8s resource a resource quota defines.
   *
   * <p>Notes:
   *
   * <p>The value for this attribute can be either the full {@code count/<resource>[.<group>]}
   * string (e.g., count/deployments.apps, count/pods), or, for certain core Kubernetes resources,
   * just the resource name (e.g., pods, services, configmaps). Both forms are supported by
   * Kubernetes for object count quotas. See <a
   * href="https://kubernetes.io/docs/concepts/policy/resource-quotas/#quota-on-object-count">Kubernetes
   * Resource Quotas documentation</a> for more details.
   */
  public static final AttributeKey<String> K8S_RESOURCEQUOTA_RESOURCE_NAME =
      stringKey("k8s.resourcequota.resource_name");

  /** The UID of the resource quota. */
  public static final AttributeKey<String> K8S_RESOURCEQUOTA_UID =
      stringKey("k8s.resourcequota.uid");

  /**
   * The annotation placed on the StatefulSet, the {@code <key>} being the annotation name, the
   * value being the annotation value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code replicas} with value {@code 1} SHOULD be recorded as the {@code
   *       k8s.statefulset.annotation.replicas} attribute with value {@code "1"}.
   *   <li>A label {@code data} with empty string value SHOULD be recorded as the {@code
   *       k8s.statefulset.annotation.data} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_STATEFULSET_ANNOTATION =
      stringKeyTemplate("k8s.statefulset.annotation");

  /**
   * The label placed on the StatefulSet, the {@code <key>} being the label name, the value being
   * the label value, even if the value is empty.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>A label {@code replicas} with value {@code 0} SHOULD be recorded as the {@code
   *       k8s.statefulset.label.app} attribute with value {@code "guestbook"}.
   *   <li>A label {@code injected} with empty string value SHOULD be recorded as the {@code
   *       k8s.statefulset.label.injected} attribute with value {@code ""}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> K8S_STATEFULSET_LABEL =
      stringKeyTemplate("k8s.statefulset.label");

  /** The name of the StatefulSet. */
  public static final AttributeKey<String> K8S_STATEFULSET_NAME = stringKey("k8s.statefulset.name");

  /** The UID of the StatefulSet. */
  public static final AttributeKey<String> K8S_STATEFULSET_UID = stringKey("k8s.statefulset.uid");

  /**
   * The name of K8s <a
   * href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.30/#storageclass-v1-storage-k8s-io">StorageClass</a>
   * object.
   */
  public static final AttributeKey<String> K8S_STORAGECLASS_NAME =
      stringKey("k8s.storageclass.name");

  /** The name of the K8s volume. */
  public static final AttributeKey<String> K8S_VOLUME_NAME = stringKey("k8s.volume.name");

  /** The type of the K8s volume. */
  public static final AttributeKey<String> K8S_VOLUME_TYPE = stringKey("k8s.volume.type");

  // Enum definitions

  /** Values for {@link #K8S_CONTAINER_STATUS_REASON}. */
  public static final class K8sContainerStatusReasonIncubatingValues {
    /** The container is being created. */
    public static final String CONTAINER_CREATING = "ContainerCreating";

    /** The container is in a crash loop back off state. */
    public static final String CRASH_LOOP_BACK_OFF = "CrashLoopBackOff";

    /** There was an error creating the container configuration. */
    public static final String CREATE_CONTAINER_CONFIG_ERROR = "CreateContainerConfigError";

    /** There was an error pulling the container image. */
    public static final String ERR_IMAGE_PULL = "ErrImagePull";

    /** The container image pull is in back off state. */
    public static final String IMAGE_PULL_BACK_OFF = "ImagePullBackOff";

    /** The container was killed due to out of memory. */
    public static final String OOM_KILLED = "OOMKilled";

    /** The container has completed execution. */
    public static final String COMPLETED = "Completed";

    /** There was an error with the container. */
    public static final String ERROR = "Error";

    /** The container cannot run. */
    public static final String CONTAINER_CANNOT_RUN = "ContainerCannotRun";

    private K8sContainerStatusReasonIncubatingValues() {}
  }

  /** Values for {@link #K8S_CONTAINER_STATUS_STATE}. */
  public static final class K8sContainerStatusStateIncubatingValues {
    /** The container has terminated. */
    public static final String TERMINATED = "terminated";

    /** The container is running. */
    public static final String RUNNING = "running";

    /** The container is waiting. */
    public static final String WAITING = "waiting";

    private K8sContainerStatusStateIncubatingValues() {}
  }

  /** Values for {@link #K8S_NAMESPACE_PHASE}. */
  public static final class K8sNamespacePhaseIncubatingValues {
    /**
     * Active namespace phase as described by <a
     * href="https://pkg.go.dev/k8s.io/api@v0.31.3/core/v1#NamespacePhase">K8s API</a>
     */
    public static final String ACTIVE = "active";

    /**
     * Terminating namespace phase as described by <a
     * href="https://pkg.go.dev/k8s.io/api@v0.31.3/core/v1#NamespacePhase">K8s API</a>
     */
    public static final String TERMINATING = "terminating";

    private K8sNamespacePhaseIncubatingValues() {}
  }

  /** Values for {@link #K8S_NODE_CONDITION_STATUS}. */
  public static final class K8sNodeConditionStatusIncubatingValues {
    /** condition_true. */
    public static final String CONDITION_TRUE = "true";

    /** condition_false. */
    public static final String CONDITION_FALSE = "false";

    /** condition_unknown. */
    public static final String CONDITION_UNKNOWN = "unknown";

    private K8sNodeConditionStatusIncubatingValues() {}
  }

  /** Values for {@link #K8S_NODE_CONDITION_TYPE}. */
  public static final class K8sNodeConditionTypeIncubatingValues {
    /** The node is healthy and ready to accept pods */
    public static final String READY = "Ready";

    /** Pressure exists on the disk size—that is, if the disk capacity is low */
    public static final String DISK_PRESSURE = "DiskPressure";

    /** Pressure exists on the node memory—that is, if the node memory is low */
    public static final String MEMORY_PRESSURE = "MemoryPressure";

    /** Pressure exists on the processes—that is, if there are too many processes on the node */
    public static final String PID_PRESSURE = "PIDPressure";

    /** The network for the node is not correctly configured */
    public static final String NETWORK_UNAVAILABLE = "NetworkUnavailable";

    private K8sNodeConditionTypeIncubatingValues() {}
  }

  /** Values for {@link #K8S_POD_STATUS_PHASE}. */
  public static final class K8sPodStatusPhaseIncubatingValues {
    /**
     * The pod has been accepted by the system, but one or more of the containers has not been
     * started. This includes time before being bound to a node, as well as time spent pulling
     * images onto the host.
     */
    public static final String PENDING = "Pending";

    /**
     * The pod has been bound to a node and all of the containers have been started. At least one
     * container is still running or is in the process of being restarted.
     */
    public static final String RUNNING = "Running";

    /**
     * All containers in the pod have voluntarily terminated with a container exit code of 0, and
     * the system is not going to restart any of these containers.
     */
    public static final String SUCCEEDED = "Succeeded";

    /**
     * All containers in the pod have terminated, and at least one container has terminated in a
     * failure (exited with a non-zero exit code or was stopped by the system).
     */
    public static final String FAILED = "Failed";

    /**
     * For some reason the state of the pod could not be obtained, typically due to an error in
     * communicating with the host of the pod.
     */
    public static final String UNKNOWN = "Unknown";

    private K8sPodStatusPhaseIncubatingValues() {}
  }

  /** Values for {@link #K8S_POD_STATUS_REASON}. */
  public static final class K8sPodStatusReasonIncubatingValues {
    /** The pod is evicted. */
    public static final String EVICTED = "Evicted";

    /** The pod is in a status because of its node affinity */
    public static final String NODE_AFFINITY = "NodeAffinity";

    /**
     * The reason on a pod when its state cannot be confirmed as kubelet is unresponsive on the node
     * it is (was) running.
     */
    public static final String NODE_LOST = "NodeLost";

    /** The node is shutdown */
    public static final String SHUTDOWN = "Shutdown";

    /**
     * The pod was rejected admission to the node because of an error during admission that could
     * not be categorized.
     */
    public static final String UNEXPECTED_ADMISSION_ERROR = "UnexpectedAdmissionError";

    private K8sPodStatusReasonIncubatingValues() {}
  }

  /** Values for {@link #K8S_VOLUME_TYPE}. */
  public static final class K8sVolumeTypeIncubatingValues {
    /**
     * A <a
     * href="https://v1-30.docs.kubernetes.io/docs/concepts/storage/volumes/#persistentvolumeclaim">persistentVolumeClaim</a>
     * volume
     */
    public static final String PERSISTENT_VOLUME_CLAIM = "persistentVolumeClaim";

    /**
     * A <a
     * href="https://v1-30.docs.kubernetes.io/docs/concepts/storage/volumes/#configmap">configMap</a>
     * volume
     */
    public static final String CONFIG_MAP = "configMap";

    /**
     * A <a
     * href="https://v1-30.docs.kubernetes.io/docs/concepts/storage/volumes/#downwardapi">downwardAPI</a>
     * volume
     */
    public static final String DOWNWARD_API = "downwardAPI";

    /**
     * An <a
     * href="https://v1-30.docs.kubernetes.io/docs/concepts/storage/volumes/#emptydir">emptyDir</a>
     * volume
     */
    public static final String EMPTY_DIR = "emptyDir";

    /**
     * A <a href="https://v1-30.docs.kubernetes.io/docs/concepts/storage/volumes/#secret">secret</a>
     * volume
     */
    public static final String SECRET = "secret";

    /**
     * A <a href="https://v1-30.docs.kubernetes.io/docs/concepts/storage/volumes/#local">local</a>
     * volume
     */
    public static final String LOCAL = "local";

    private K8sVolumeTypeIncubatingValues() {}
  }

  private K8sIncubatingAttributes() {}
}
