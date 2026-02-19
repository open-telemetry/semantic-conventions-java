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
public final class OracleCloudIncubatingAttributes {
  /**
   * The OCI realm identifier that indicates the isolated partition in which the tenancy and its
   * resources reside.
   *
   * <p>Notes:
   *
   * <p>See <a href="https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm">OCI
   * documentation on realms</a>
   */
  public static final AttributeKey<String> ORACLE_CLOUD_REALM = stringKey("oracle_cloud.realm");

  // Enum definitions

  private OracleCloudIncubatingAttributes() {}
}
