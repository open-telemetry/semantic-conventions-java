/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class UserIncubatingAttributes {

  /** User email address. */
  public static final AttributeKey<String> USER_EMAIL = stringKey("user.email");

  /** User's full name */
  public static final AttributeKey<String> USER_FULL_NAME = stringKey("user.full_name");

  /**
   * Unique user hash to correlate information for a user in anonymized form.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Useful if {@code user.id} or {@code user.name} contain confidential information and
   *       cannot be used.
   * </ul>
   */
  public static final AttributeKey<String> USER_HASH = stringKey("user.hash");

  /** Unique identifier of the user. */
  public static final AttributeKey<String> USER_ID = stringKey("user.id");

  /** Short name or login/username of the user. */
  public static final AttributeKey<String> USER_NAME = stringKey("user.name");

  /** Array of user roles at the time of the event. */
  public static final AttributeKey<List<String>> USER_ROLES = stringArrayKey("user.roles");

  private UserIncubatingAttributes() {}
}
