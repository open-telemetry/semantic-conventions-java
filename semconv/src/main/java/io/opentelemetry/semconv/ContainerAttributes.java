/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/java/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class ContainerAttributes {
  /**
   * Container ID. Usually a UUID, as for example used to <a
   * href="https://docs.docker.com/engine/containers/run/#container-identification">identify Docker
   * containers</a>. The UUID might be abbreviated.
   */
  public static final AttributeKey<String> CONTAINER_ID = stringKey("container.id");

  /** Name of the image the container was built on. */
  public static final AttributeKey<String> CONTAINER_IMAGE_NAME = stringKey("container.image.name");

  /**
   * Repo digests of the container image as provided by the container runtime.
   *
   * <p>Notes:
   *
   * <p><a
   * href="https://docs.docker.com/reference/api/engine/version/v1.52/#tag/Image/operation/ImageInspect">Docker</a>
   * and <a
   * href="https://github.com/kubernetes/cri-api/blob/c75ef5b473bbe2d0a4fc92f82235efd665ea8e9f/pkg/apis/runtime/v1/api.proto#L1237-L1238">CRI</a>
   * report those under the {@code RepoDigests} field.
   */
  public static final AttributeKey<List<String>> CONTAINER_IMAGE_REPO_DIGESTS =
      stringArrayKey("container.image.repo_digests");

  /**
   * Container image tags. An example can be found in <a
   * href="https://docs.docker.com/reference/api/engine/version/v1.52/#tag/Image/operation/ImageInspect">Docker
   * Image Inspect</a>. Should be only the {@code <tag>} section of the full name for example from
   * {@code registry.example.com/my-org/my-image:<tag>}.
   */
  public static final AttributeKey<List<String>> CONTAINER_IMAGE_TAGS =
      stringArrayKey("container.image.tags");

  private ContainerAttributes() {}
}
