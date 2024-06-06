/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class UseragentIncubatingAttributes {

  /**
   * Name of the user-agent extracted from original. Usually refers to the browser's name.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li><a href="https://www.whatsmyua.info">Example</a> of extracting browser's name from
   *       original string. In the case of using a user-agent for non-browser products, such as
   *       microservices with multiple names/versions inside the {@code user_agent.original}, the
   *       most significant name SHOULD be selected. In such a scenario it should align with {@code
   *       user_agent.version}
   * </ul>
   */
  public static final AttributeKey<String> USERAGENT_NAME = stringKey("user_agent.name");

  /**
   * Value of the <a href="https://www.rfc-editor.org/rfc/rfc9110.html#field.user-agent">HTTP
   * User-Agent</a> header sent by the client.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.UseragentAttributes#USERAGENT_ORIGINAL} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> USERAGENT_ORIGINAL = stringKey("user_agent.original");

  /**
   * Version of the user-agent extracted from original. Usually refers to the browser's version
   *
   * <p>Notes:
   *
   * <ul>
   *   <li><a href="https://www.whatsmyua.info">Example</a> of extracting browser's version from
   *       original string. In the case of using a user-agent for non-browser products, such as
   *       microservices with multiple names/versions inside the {@code user_agent.original}, the
   *       most significant version SHOULD be selected. In such a scenario it should align with
   *       {@code user_agent.name}
   * </ul>
   */
  public static final AttributeKey<String> USERAGENT_VERSION = stringKey("user_agent.version");

  private UseragentIncubatingAttributes() {}
}
