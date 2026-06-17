/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/java/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class K8sAttributes {
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

  private K8sAttributes() {}
}
