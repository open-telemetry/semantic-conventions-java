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
public final class ZosIncubatingAttributes {
  /**
   * The System Management Facility (SMF) Identifier uniquely identified a z/OS system within a
   * SYSPLEX or mainframe environment and is used for system and performance analysis.
   */
  public static final AttributeKey<String> ZOS_SMF_ID = stringKey("zos.smf.id");

  /** The name of the SYSPLEX to which the z/OS system belongs too. */
  public static final AttributeKey<String> ZOS_SYSPLEX_NAME = stringKey("zos.sysplex.name");

  // Enum definitions

  private ZosIncubatingAttributes() {}
}
