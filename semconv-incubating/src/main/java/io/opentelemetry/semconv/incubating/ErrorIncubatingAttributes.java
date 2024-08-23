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
public final class ErrorIncubatingAttributes {
  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.ErrorAttributes#ERROR_TYPE} attribute.
   */
  @Deprecated public static final AttributeKey<String> ERROR_TYPE = stringKey("error.type");

  private ErrorIncubatingAttributes() {}
}
