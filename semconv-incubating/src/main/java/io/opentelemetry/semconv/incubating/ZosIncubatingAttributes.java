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
   * The System Management Facility (SMF) identifier that uniquely identifies a z/OS system within a
   * sysplex or mainframe environment and is used for system and performance analysis.
   *
   * @deprecated Moved to the <a
   *     href="https://github.com/open-telemetry/semantic-conventions-mainframe">OpenTelemetry
   *     Mainframe semantic conventions repository</a>.
   */
  @Deprecated public static final AttributeKey<String> ZOS_SMF_ID = stringKey("zos.smf.id");

  /**
   * The name of the sysplex to which the z/OS system belongs.
   *
   * @deprecated Moved to the <a
   *     href="https://github.com/open-telemetry/semantic-conventions-mainframe">OpenTelemetry
   *     Mainframe semantic conventions repository</a>.
   */
  @Deprecated
  public static final AttributeKey<String> ZOS_SYSPLEX_NAME = stringKey("zos.sysplex.name");

  // Enum definitions

  private ZosIncubatingAttributes() {}
}
