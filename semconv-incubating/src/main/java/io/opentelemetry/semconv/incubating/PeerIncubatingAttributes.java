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
public final class PeerIncubatingAttributes {
  /**
   * The <a href="/docs/resource/README.md#service">{@code service.name}</a> of the remote service.
   * SHOULD be equal to the actual {@code service.name} resource attribute of the remote service if
   * any
   */
  public static final AttributeKey<String> PEER_SERVICE = stringKey("peer.service");

  private PeerIncubatingAttributes() {}
}
