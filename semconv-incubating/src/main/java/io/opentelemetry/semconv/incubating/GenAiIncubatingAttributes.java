/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.doubleKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class GenAiIncubatingAttributes {

  /**
   * The full response received from the LLM.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>It's RECOMMENDED to format completions as JSON string matching <a
   *       href="https://platform.openai.com/docs/guides/text-generation">OpenAI messages format</a>
   * </ul>
   */
  public static final AttributeKey<String> GEN_AI_COMPLETION = stringKey("gen_ai.completion");

  /**
   * The full prompt sent to an LLM.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>It's RECOMMENDED to format prompts as JSON string matching <a
   *       href="https://platform.openai.com/docs/guides/text-generation">OpenAI messages format</a>
   * </ul>
   */
  public static final AttributeKey<String> GEN_AI_PROMPT = stringKey("gen_ai.prompt");

  /** The maximum number of tokens the LLM generates for a request. */
  public static final AttributeKey<Long> GEN_AI_REQUEST_MAX_TOKENS =
      longKey("gen_ai.request.max_tokens");

  /** The name of the LLM a request is being made to. */
  public static final AttributeKey<String> GEN_AI_REQUEST_MODEL = stringKey("gen_ai.request.model");

  /** The temperature setting for the LLM request. */
  public static final AttributeKey<Double> GEN_AI_REQUEST_TEMPERATURE =
      doubleKey("gen_ai.request.temperature");

  /** The top_p sampling setting for the LLM request. */
  public static final AttributeKey<Double> GEN_AI_REQUEST_TOP_P = doubleKey("gen_ai.request.top_p");

  /**
   * Array of reasons the model stopped generating tokens, corresponding to each generation
   * received.
   */
  public static final AttributeKey<List<String>> GEN_AI_RESPONSE_FINISH_REASONS =
      stringArrayKey("gen_ai.response.finish_reasons");

  /** The unique identifier for the completion. */
  public static final AttributeKey<String> GEN_AI_RESPONSE_ID = stringKey("gen_ai.response.id");

  /** The name of the LLM a response was generated from. */
  public static final AttributeKey<String> GEN_AI_RESPONSE_MODEL =
      stringKey("gen_ai.response.model");

  /**
   * The Generative AI product as identified by the client instrumentation.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The actual GenAI product may differ from the one identified by the client. For example,
   *       when using OpenAI client libraries to communicate with Mistral, the {@code gen_ai.system}
   *       is set to {@code openai} based on the instrumentation's best knowledge.
   * </ul>
   */
  public static final AttributeKey<String> GEN_AI_SYSTEM = stringKey("gen_ai.system");

  /** The number of tokens used in the LLM response (completion). */
  public static final AttributeKey<Long> GEN_AI_USAGE_COMPLETION_TOKENS =
      longKey("gen_ai.usage.completion_tokens");

  /** The number of tokens used in the LLM prompt. */
  public static final AttributeKey<Long> GEN_AI_USAGE_PROMPT_TOKENS =
      longKey("gen_ai.usage.prompt_tokens");

  // Enum definitions
  /** Values for {@link #GEN_AI_SYSTEM}. */
  public static final class GenAiSystemValues {
    /** OpenAI. */
    public static final String OPENAI = "openai";

    private GenAiSystemValues() {}
  }

  private GenAiIncubatingAttributes() {}
}
