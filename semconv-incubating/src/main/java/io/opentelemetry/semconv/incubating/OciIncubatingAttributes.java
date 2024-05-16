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
public final class OciIncubatingAttributes {

  /**
   * The digest of the OCI image manifest. For container images specifically is the digest by which
   * the container image is known.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Follows [OCI Image Manifest
   *       Specification](https://github.com/opencontainers/image-spec/blob/main/manifest.md), and
   *       specifically the [Digest
   *       property](https://github.com/opencontainers/image-spec/blob/main/descriptor.md#digests).
   *       An example can be found in [Example Image
   *       Manifest](https://docs.docker.com/registry/spec/manifest-v2-2/#example-image-manifest).
   * </ul>
   */
  public static final AttributeKey<String> OCI_MANIFEST_DIGEST = stringKey("oci.manifest.digest");

  private OciIncubatingAttributes() {}
}
