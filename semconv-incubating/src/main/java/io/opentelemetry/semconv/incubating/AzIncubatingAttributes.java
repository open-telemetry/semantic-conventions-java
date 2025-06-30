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
public final class AzIncubatingAttributes {
  /**
   * Deprecated, use {@code azure.resource_provider.namespace} instead.
   *
   * @deprecated Replaced by {@code azure.resource_provider.namespace}.
   */
  @Deprecated public static final AttributeKey<String> AZ_NAMESPACE = stringKey("az.namespace");

  /**
   * Deprecated, use {@code azure.service.request.id} instead.
   *
   * @deprecated Replaced by {@code azure.service.request.id}.
   */
  @Deprecated
  public static final AttributeKey<String> AZ_SERVICE_REQUEST_ID =
      stringKey("az.service_request_id");

  // Enum definitions

  private AzIncubatingAttributes() {}
}
