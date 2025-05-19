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
   * The annotation key-value pairs placed on the DaemonSet.
   *
   * <p>Notes:
   *
   * <p>The {@code <key>} being the annotation name, the value being the annotation value, even if
   * the value is empty.
   */
  public static final AttributeKeyTemplate<String> K8S_DAEMONSET_ANNOTATION =
      stringKeyTemplate("k8s.daemonset.annotation");

  /**
   * The label key-value pairs placed on the DaemonSet.
   *
   * <p>Notes:
   *
   * <p>The {@code <key>} being the label name, the value being the label value, even if the value
   * is empty.
   */
  public static final AttributeKeyTemplate<String> K8S_DAEMONSET_LABEL =
      stringKeyTemplate("k8s.daemonset.label");

  /** The name of the DaemonSet. */
  public static final AttributeKey<String> K8S_DAEMONSET_NAME = stringKey("k8s.daemonset.name");

  /** The UID of the DaemonSet. */
  public static final AttributeKey<String> K8S_DAEMONSET_UID = stringKey("k8s.daemonset.uid");

  /**
   * The annotation key-value pairs placed on the Deployment.
   *
   * <p>Notes:
   *
   * <p>The {@code <key>} being the annotation name, the value being the annotation value, even if
   * the value is empty.
   */
  public static final AttributeKeyTemplate<String> K8S_DEPLOYMENT_ANNOTATION =
      stringKeyTemplate("k8s.deployment.annotation");

  /**
   * The label key-value pairs placed on the Deployment.
   *
   * <p>Notes:
   *
   * <p>The {@code <key>} being the label name, the value being the label value, even if the value
   * is empty.
   */
  public static final AttributeKeyTemplate<String> K8S_DEPLOYMENT_LABEL =
      stringKeyTemplate("k8s.deployment.label");

  /** The name of the Deployment. */
  public static final AttributeKey<String> K8S_DEPLOYMENT_NAME = stringKey("k8s.deployment.name");

  /** The UID of the Deployment. */
  public static final AttributeKey<String> K8S_DEPLOYMENT_UID = stringKey("k8s.deployment.uid");

  /** The name of the horizontal pod autoscaler. */
  public static final AttributeKey<String> K8S_HPA_NAME = stringKey("k8s.hpa.name");

  /** The UID of the horizontal pod autoscaler. */
  public static final AttributeKey<String> K8S_HPA_UID = stringKey("k8s.hpa.uid");

  /**
   * The annotation key-value pairs placed on the Job.
   *
   * <p>Notes:
   *
   * <p>The {@code <key>} being the annotation name, the value being the annotation value, even if
   * the value is empty.
   */
  public static final AttributeKeyTemplate<String> K8S_JOB_ANNOTATION =
      stringKeyTemplate("k8s.job.annotation");

  /**
   * The label key-value pairs placed on the Job.
   *
   * <p>Notes:
   *
   * <p>The {@code <key>} being the label name, the value being the label value, even if the value
   * is empty.
   */
  public static final AttributeKeyTemplate<String> K8S_JOB_LABEL =
      stringKeyTemplate("k8s.job.label");

  /** The name of the Job. */
  public static final AttributeKey<String> K8S_JOB_NAME = stringKey("k8s.job.name");

  /** The UID of the Job. */
  public static final AttributeKey<String> K8S_JOB_UID = stringKey("k8s.job.uid");

  /**
   * The annotation key-value pairs placed on the Namespace.
   *
   * <p>Notes:
   *
   * <p>The {@code <key>} being the annotation name, the value being the annotation value, even if
   * the value is empty.
   */
  public static final AttributeKeyTemplate<String> K8S_NAMESPACE_ANNOTATION =
      stringKeyTemplate("k8s.namespace.annotation");

  /**
   * The label key-value pairs placed on the Namespace.
   *
   * <p>Notes:
   *
   * <p>The {@code <key>} being the label name, the value being the label value, even if the value
   * is empty.
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

  /** The UID of the Pod. */
  public static final AttributeKey<String> K8S_POD_UID = stringKey("k8s.pod.uid");

  /**
   * The annotation key-value pairs placed on the ReplicaSet.
   *
   * <p>Notes:
   *
   * <p>The {@code <key>} being the annotation name, the value being the annotation value, even if
   * the value is empty.
   */
  public static final AttributeKeyTemplate<String> K8S_REPLICASET_ANNOTATION =
      stringKeyTemplate("k8s.replicaset.annotation");

  /**
   * The label key-value pairs placed on the ReplicaSet.
   *
   * <p>Notes:
   *
   * <p>The {@code <key>} being the label name, the value being the label value, even if the value
   * is empty.
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

  /** The UID of the resource quota. */
  public static final AttributeKey<String> K8S_RESOURCEQUOTA_UID =
      stringKey("k8s.resourcequota.uid");

  /**
   * The annotation key-value pairs placed on the StatefulSet.
   *
   * <p>Notes:
   *
   * <p>The {@code <key>} being the annotation name, the value being the annotation value, even if
   * the value is empty.
   */
  public static final AttributeKeyTemplate<String> K8S_STATEFULSET_ANNOTATION =
      stringKeyTemplate("k8s.statefulset.annotation");

  /**
   * The label key-value pairs placed on the StatefulSet.
   *
   * <p>Notes:
   *
   * <p>The {@code <key>} being the label name, the value being the label value, even if the value
   * is empty.
   */
  public static final AttributeKeyTemplate<String> K8S_STATEFULSET_LABEL =
      stringKeyTemplate("k8s.statefulset.label");

  /** The name of the StatefulSet. */
  public static final AttributeKey<String> K8S_STATEFULSET_NAME = stringKey("k8s.statefulset.name");

  /** The UID of the StatefulSet. */
  public static final AttributeKey<String> K8S_STATEFULSET_UID = stringKey("k8s.statefulset.uid");

  /** The name of the K8s volume. */
  public static final AttributeKey<String> K8S_VOLUME_NAME = stringKey("k8s.volume.name");

  /** The type of the K8s volume. */
  public static final AttributeKey<String> K8S_VOLUME_TYPE = stringKey("k8s.volume.type");

  // Enum definitions

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
