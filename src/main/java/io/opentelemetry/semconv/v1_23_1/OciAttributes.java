/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_23_1;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class OciAttributes {

  /**
   * The digest of the OCI image manifest. For container images specifically is the digest by which
   * the container image is known.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Follows <a href="https://github.com/opencontainers/image-spec/blob/main/manifest.md">OCI
   *       Image Manifest Specification</a>, and specifically the <a
   *       href="https://github.com/opencontainers/image-spec/blob/main/descriptor.md#digests">Digest
   *       property</a>. An example can be found in <a
   *       href="https://docs.docker.com/registry/spec/manifest-v2-2/#example-image-manifest">Example
   *       Image Manifest</a>.
   * </ul>
   */
  public static final AttributeKey<String> OCI_MANIFEST_DIGEST = stringKey("oci.manifest.digest");

  // Enum definitions
  private OciAttributes() {}
}
