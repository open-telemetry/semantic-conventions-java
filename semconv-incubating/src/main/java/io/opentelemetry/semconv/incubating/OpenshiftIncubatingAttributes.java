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
public final class OpenshiftIncubatingAttributes {
  /** The name of the cluster quota. */
  public static final AttributeKey<String> OPENSHIFT_CLUSTERQUOTA_NAME =
      stringKey("openshift.clusterquota.name");

  /** The UID of the cluster quota. */
  public static final AttributeKey<String> OPENSHIFT_CLUSTERQUOTA_UID =
      stringKey("openshift.clusterquota.uid");

  // Enum definitions

  private OpenshiftIncubatingAttributes() {}
}
