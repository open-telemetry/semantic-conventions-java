/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class OncRpcIncubatingAttributes {
  /** ONC/Sun RPC procedure name. */
  public static final AttributeKey<String> ONC_RPC_PROCEDURE_NAME =
      stringKey("onc_rpc.procedure.name");

  /** ONC/Sun RPC procedure number. */
  public static final AttributeKey<Long> ONC_RPC_PROCEDURE_NUMBER =
      longKey("onc_rpc.procedure.number");

  /** ONC/Sun RPC program name. */
  public static final AttributeKey<String> ONC_RPC_PROGRAM_NAME = stringKey("onc_rpc.program.name");

  /** ONC/Sun RPC program version. */
  public static final AttributeKey<Long> ONC_RPC_VERSION = longKey("onc_rpc.version");

  // Enum definitions

  private OncRpcIncubatingAttributes() {}
}
