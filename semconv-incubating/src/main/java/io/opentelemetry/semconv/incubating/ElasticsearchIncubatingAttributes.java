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
public final class ElasticsearchIncubatingAttributes {
  /**
   * Represents the human-readable identifier of the node/instance to which a request was routed.
   */
  public static final AttributeKey<String> ELASTICSEARCH_NODE_NAME =
      stringKey("elasticsearch.node.name");

  // Enum definitions

  private ElasticsearchIncubatingAttributes() {}
}
