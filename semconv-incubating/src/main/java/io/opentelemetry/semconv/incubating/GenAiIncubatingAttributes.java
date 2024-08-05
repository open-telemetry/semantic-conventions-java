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
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class GenAiIncubatingAttributes {

  /**
   * The full response received from the GenAI model.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>It's RECOMMENDED to format completions as JSON string matching [OpenAI messages
   *       format](https://platform.openai.com/docs/guides/text-generation)
   * </ul>
   */
  public static final AttributeKey<String> GEN_AI_COMPLETION = stringKey("gen_ai.completion");

  /**
   * The name of the operation being performed.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>If one of the predefined values applies, but specific system uses a different name it's
   *       RECOMMENDED to document it in the semantic conventions for specific GenAI system and use
   *       system-specific name in the instrumentation. If a different name is not documented,
   *       instrumentation libraries SHOULD use applicable predefined value.
   * </ul>
   */
  public static final AttributeKey<String> GEN_AI_OPERATION_NAME =
      stringKey("gen_ai.operation.name");

  /**
   * The full prompt sent to the GenAI model.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>It's RECOMMENDED to format prompts as JSON string matching [OpenAI messages
   *       format](https://platform.openai.com/docs/guides/text-generation)
   * </ul>
   */
  public static final AttributeKey<String> GEN_AI_PROMPT = stringKey("gen_ai.prompt");

  /** The frequency penalty setting for the GenAI request. */
  public static final AttributeKey<Double> GEN_AI_REQUEST_FREQUENCY_PENALTY =
      doubleKey("gen_ai.request.frequency_penalty");

  /** The maximum number of tokens the model generates for a request. */
  public static final AttributeKey<Long> GEN_AI_REQUEST_MAX_TOKENS =
      longKey("gen_ai.request.max_tokens");

  /** The name of the GenAI model a request is being made to. */
  public static final AttributeKey<String> GEN_AI_REQUEST_MODEL = stringKey("gen_ai.request.model");

  /** The presence penalty setting for the GenAI request. */
  public static final AttributeKey<Double> GEN_AI_REQUEST_PRESENCE_PENALTY =
      doubleKey("gen_ai.request.presence_penalty");

  /** List of sequences that the model will use to stop generating further tokens. */
  public static final AttributeKey<List<String>> GEN_AI_REQUEST_STOP_SEQUENCES =
      stringArrayKey("gen_ai.request.stop_sequences");

  /** The temperature setting for the GenAI request. */
  public static final AttributeKey<Double> GEN_AI_REQUEST_TEMPERATURE =
      doubleKey("gen_ai.request.temperature");

  /** The top_k sampling setting for the GenAI request. */
  public static final AttributeKey<Double> GEN_AI_REQUEST_TOP_K = doubleKey("gen_ai.request.top_k");

  /** The top_p sampling setting for the GenAI request. */
  public static final AttributeKey<Double> GEN_AI_REQUEST_TOP_P = doubleKey("gen_ai.request.top_p");

  /**
   * Array of reasons the model stopped generating tokens, corresponding to each generation
   * received.
   */
  public static final AttributeKey<List<String>> GEN_AI_RESPONSE_FINISH_REASONS =
      stringArrayKey("gen_ai.response.finish_reasons");

  /** The unique identifier for the completion. */
  public static final AttributeKey<String> GEN_AI_RESPONSE_ID = stringKey("gen_ai.response.id");

  /** The name of the model that generated the response. */
  public static final AttributeKey<String> GEN_AI_RESPONSE_MODEL =
      stringKey("gen_ai.response.model");

  /**
   * The Generative AI product as identified by the client or server instrumentation.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code gen_ai.system} describes a family of GenAI models with specific model
   *       identified by {@code gen_ai.request.model} and {@code gen_ai.response.model} attributes.
   *   <li>The actual GenAI product may differ from the one identified by the client. For example,
   *       when using OpenAI client libraries to communicate with Mistral, the {@code gen_ai.system}
   *       is set to {@code openai} based on the instrumentation's best knowledge.
   *   <li>For custom model, a custom friendly name SHOULD be used. If none of these options apply,
   *       the {@code gen_ai.system} SHOULD be set to {@code _OTHER}.
   * </ul>
   */
  public static final AttributeKey<String> GEN_AI_SYSTEM = stringKey("gen_ai.system");

  /** The type of token being counted. */
  public static final AttributeKey<String> GEN_AI_TOKEN_TYPE = stringKey("gen_ai.token.type");

  /**
   * Deprecated, use {@code gen_ai.usage.output_tokens} instead.
   *
   * @deprecated Deprecated, use `gen_ai.usage.output_tokens` instead.
   */
  @Deprecated
  public static final AttributeKey<Long> GEN_AI_USAGE_COMPLETION_TOKENS =
      longKey("gen_ai.usage.completion_tokens");

  /** The number of tokens used in the GenAI input (prompt). */
  public static final AttributeKey<Long> GEN_AI_USAGE_INPUT_TOKENS =
      longKey("gen_ai.usage.input_tokens");

  /** The number of tokens used in the GenAI response (completion). */
  public static final AttributeKey<Long> GEN_AI_USAGE_OUTPUT_TOKENS =
      longKey("gen_ai.usage.output_tokens");

  /**
   * Deprecated, use {@code gen_ai.usage.input_tokens} instead.
   *
   * @deprecated Deprecated, use `gen_ai.usage.input_tokens` instead.
   */
  @Deprecated
  public static final AttributeKey<Long> GEN_AI_USAGE_PROMPT_TOKENS =
      longKey("gen_ai.usage.prompt_tokens");

  // Enum definitions
  /** Values for {@link #GEN_AI_OPERATION_NAME}. */
  public static final class GenAiOperationNameValues {
    /**
     * Chat completion operation such as [OpenAI Chat
     * API](https://platform.openai.com/docs/api-reference/chat).
     */
    public static final String CHAT = "chat";

    /**
     * Text completions operation such as [OpenAI Completions API
     * (Legacy)](https://platform.openai.com/docs/api-reference/completions).
     */
    public static final String TEXT_COMPLETION = "text_completion";

    private GenAiOperationNameValues() {}
  }

  /** Values for {@link #GEN_AI_SYSTEM}. */
  public static final class GenAiSystemValues {

    /** OpenAI */
    public static final String OPENAI = "openai";

    /** Vertex AI. */
    public static final String VERTEX_AI = "vertex_ai";

    /** Anthropic. */
    public static final String ANTHROPIC = "anthropic";

    /** Cohere. */
    public static final String COHERE = "cohere";

    private GenAiSystemValues() {}
  }

  /** Values for {@link #GEN_AI_TOKEN_TYPE}. */
  public static final class GenAiTokenTypeValues {
    /** Input tokens (prompt, input, etc.). */
    public static final String INPUT = "input";

    /** Output tokens (completion, response, etc.). */
    public static final String COMPLETION = "output";

    private GenAiTokenTypeValues() {}
  }

  private GenAiIncubatingAttributes() {}
}
