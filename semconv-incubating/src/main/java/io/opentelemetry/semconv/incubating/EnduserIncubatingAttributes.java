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
public final class EnduserIncubatingAttributes {

  /**
   * Deprecated, use {@code user.id} instead.
   *
   * @deprecated Deprecated, use `user.id` instead.
   */
  @Deprecated public static final AttributeKey<String> ENDUSER_ID = stringKey("enduser.id");

  /**
   * Deprecated, use {@code user.roles} instead.
   *
   * @deprecated Deprecated, use `user.roles` instead.
   */
  @Deprecated public static final AttributeKey<String> ENDUSER_ROLE = stringKey("enduser.role");

  /**
   * Deprecated, no replacement at this time.
   *
   * @deprecated Deprecated, no replacement at this time.
   */
  @Deprecated public static final AttributeKey<String> ENDUSER_SCOPE = stringKey("enduser.scope");

  private EnduserIncubatingAttributes() {}
}
