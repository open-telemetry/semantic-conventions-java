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
public final class UserAgentIncubatingAttributes {

  /**
   * Name of the user-agent extracted from original. Usually refers to the browser's name.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>[Example](https://www.whatsmyua.info) of extracting browser's name from original string.
   *       In the case of using a user-agent for non-browser products, such as microservices with
   *       multiple names/versions inside the `user_agent.original`, the most significant name
   *       SHOULD be selected. In such a scenario it should align with `user_agent.version`
   * </ul>
   */
  public static final AttributeKey<String> USER_AGENT_NAME = stringKey("user_agent.name");

  /**
   * Version of the user-agent extracted from original. Usually refers to the browser's version
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>[Example](https://www.whatsmyua.info) of extracting browser's version from original
   *       string. In the case of using a user-agent for non-browser products, such as microservices
   *       with multiple names/versions inside the `user_agent.original`, the most significant
   *       version SHOULD be selected. In such a scenario it should align with `user_agent.name`
   * </ul>
   */
  public static final AttributeKey<String> USER_AGENT_VERSION = stringKey("user_agent.version");

  private UserAgentIncubatingAttributes() {}
}
