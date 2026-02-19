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
public final class OpenaiIncubatingAttributes {
  /** The type of OpenAI API being used. */
  public static final AttributeKey<String> OPENAI_API_TYPE = stringKey("openai.api.type");

  /** The service tier requested. May be a specific tier, default, or auto. */
  public static final AttributeKey<String> OPENAI_REQUEST_SERVICE_TIER =
      stringKey("openai.request.service_tier");

  /** The service tier used for the response. */
  public static final AttributeKey<String> OPENAI_RESPONSE_SERVICE_TIER =
      stringKey("openai.response.service_tier");

  /** A fingerprint to track any eventual change in the Generative AI environment. */
  public static final AttributeKey<String> OPENAI_RESPONSE_SYSTEM_FINGERPRINT =
      stringKey("openai.response.system_fingerprint");

  // Enum definitions

  /** Values for {@link #OPENAI_API_TYPE}. */
  public static final class OpenaiApiTypeIncubatingValues {
    /**
     * The OpenAI <a
     * href="https://developers.openai.com/api/reference/chat-completions/overview">Chat Completions
     * API</a>.
     */
    public static final String CHAT_COMPLETIONS = "chat_completions";

    /**
     * The OpenAI <a href="https://developers.openai.com/api/reference/responses/overview">Responses
     * API</a>.
     */
    public static final String RESPONSES = "responses";

    private OpenaiApiTypeIncubatingValues() {}
  }

  /** Values for {@link #OPENAI_REQUEST_SERVICE_TIER}. */
  public static final class OpenaiRequestServiceTierIncubatingValues {
    /** The system will utilize scale tier credits until they are exhausted. */
    public static final String AUTO = "auto";

    /** The system will utilize the default scale tier. */
    public static final String DEFAULT = "default";

    private OpenaiRequestServiceTierIncubatingValues() {}
  }

  private OpenaiIncubatingAttributes() {}
}
