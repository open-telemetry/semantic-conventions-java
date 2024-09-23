/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class ContainerIncubatingAttributes {
  /**
   * The command used to run the container (i.e. the command name).
   *
   * <p>Notes:
   *
   * <p>If using embedded credentials or sensitive data, it is recommended to remove them to prevent
   * potential leakage.
   */
  public static final AttributeKey<String> CONTAINER_COMMAND = stringKey("container.command");

  /**
   * All the command arguments (including the command/executable itself) run by the container. [2]
   */
  public static final AttributeKey<List<String>> CONTAINER_COMMAND_ARGS =
      stringArrayKey("container.command_args");

  /** The full command run by the container as a single string representing the full command. [2] */
  public static final AttributeKey<String> CONTAINER_COMMAND_LINE =
      stringKey("container.command_line");

  /**
   * Deprecated, use {@code cpu.mode} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code cpu.mode}
   */
  @Deprecated
  public static final AttributeKey<String> CONTAINER_CPU_STATE = stringKey("container.cpu.state");

  /**
   * Container ID. Usually a UUID, as for example used to <a
   * href="https://docs.docker.com/engine/reference/run/#container-identification">identify Docker
   * containers</a>. The UUID might be abbreviated.
   */
  public static final AttributeKey<String> CONTAINER_ID = stringKey("container.id");

  /**
   * Runtime specific image identifier. Usually a hash algorithm followed by a UUID.
   *
   * <p>Notes:
   *
   * <p>Docker defines a sha256 of the image id; {@code container.image.id} corresponds to the
   * {@code Image} field from the Docker container inspect <a
   * href="https://docs.docker.com/engine/api/v1.43/#tag/Container/operation/ContainerInspect">API</a>
   * endpoint. K8s defines a link to the container registry repository with digest {@code "imageID":
   * "registry.azurecr.io
   * /namespace/service/dockerfile@sha256:bdeabd40c3a8a492eaf9e8e44d0ebbb84bac7ee25ac0cf8a7159d25f62555625"}.
   * The ID is assigned by the container runtime and can vary in different environments. Consider
   * using {@code oci.manifest.digest} if it is important to identify the same image in different
   * environments/runtimes.
   */
  public static final AttributeKey<String> CONTAINER_IMAGE_ID = stringKey("container.image.id");

  /** Name of the image the container was built on. */
  public static final AttributeKey<String> CONTAINER_IMAGE_NAME = stringKey("container.image.name");

  /**
   * Repo digests of the container image as provided by the container runtime.
   *
   * <p>Notes:
   *
   * <p><a
   * href="https://docs.docker.com/engine/api/v1.43/#tag/Image/operation/ImageInspect">Docker</a>
   * and <a
   * href="https://github.com/kubernetes/cri-api/blob/c75ef5b473bbe2d0a4fc92f82235efd665ea8e9f/pkg/apis/runtime/v1/api.proto#L1237-L1238">CRI</a>
   * report those under the {@code RepoDigests} field.
   */
  public static final AttributeKey<List<String>> CONTAINER_IMAGE_REPO_DIGESTS =
      stringArrayKey("container.image.repo_digests");

  /**
   * Container image tags. An example can be found in <a
   * href="https://docs.docker.com/engine/api/v1.43/#tag/Image/operation/ImageInspect">Docker Image
   * Inspect</a>. Should be only the {@code <tag>} section of the full name for example from {@code
   * registry.example.com/my-org/my-image:<tag>}.
   */
  public static final AttributeKey<List<String>> CONTAINER_IMAGE_TAGS =
      stringArrayKey("container.image.tags");

  /** Container labels, {@code <key>} being the label name, the value being the label value. */
  public static final AttributeKeyTemplate<String> CONTAINER_LABEL =
      stringKeyTemplate("container.label");

  /**
   * Deprecated, use {@code container.label} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code container.label}.
   */
  @Deprecated
  public static final AttributeKeyTemplate<String> CONTAINER_LABELS =
      stringKeyTemplate("container.labels");

  /** Container name used by container runtime. */
  public static final AttributeKey<String> CONTAINER_NAME = stringKey("container.name");

  /** The container runtime managing this container. */
  public static final AttributeKey<String> CONTAINER_RUNTIME = stringKey("container.runtime");

  // Enum definitions
  /**
   * Values for {@link #CONTAINER_CPU_STATE}
   *
   * @deprecated Replaced by {@code cpu.mode}
   */
  @Deprecated
  public static final class ContainerCpuStateIncubatingValues {
    /**
     * When tasks of the cgroup are in user mode (Linux). When all container processes are in user
     * mode (Windows).
     */
    public static final String USER = "user";

    /** When CPU is used by the system (host OS) */
    public static final String SYSTEM = "system";

    /**
     * When tasks of the cgroup are in kernel mode (Linux). When all container processes are in
     * kernel mode (Windows).
     */
    public static final String KERNEL = "kernel";

    private ContainerCpuStateIncubatingValues() {}
  }

  private ContainerIncubatingAttributes() {}
}
