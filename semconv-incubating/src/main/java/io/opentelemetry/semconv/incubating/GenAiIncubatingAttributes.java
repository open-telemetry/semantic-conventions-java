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
   * Deprecated, use Event API to report completions contents.
   *
   * <p>
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final AttributeKey<String> GEN_AI_COMPLETION = stringKey("gen_ai.completion");

  /** The response format that is requested. */
  public static final AttributeKey<String> GEN_AI_OPENAI_REQUEST_RESPONSE_FORMAT =
      stringKey("gen_ai.openai.request.response_format");

  /**
   * Deprecated, use {@code gen_ai.request.seed}.
   *
   * <p>
   *
   * @deprecated Replaced by {@code gen_ai.request.seed} attribute.
   */
  @Deprecated
  public static final AttributeKey<Long> GEN_AI_OPENAI_REQUEST_SEED =
      longKey("gen_ai.openai.request.seed");

  /** The service tier requested. May be a specific tier, default, or auto. */
  public static final AttributeKey<String> GEN_AI_OPENAI_REQUEST_SERVICE_TIER =
      stringKey("gen_ai.openai.request.service_tier");

  /** The service tier used for the response. */
  public static final AttributeKey<String> GEN_AI_OPENAI_RESPONSE_SERVICE_TIER =
      stringKey("gen_ai.openai.response.service_tier");

  /** A fingerprint to track any eventual change in the Generative AI environment. */
  public static final AttributeKey<String> GEN_AI_OPENAI_RESPONSE_SYSTEM_FINGERPRINT =
      stringKey("gen_ai.openai.response.system_fingerprint");

  /**
   * The name of the operation being performed.
   *
   * <p>Notes:
   *
   * <p>If one of the predefined values applies, but specific system uses a different name it's
   * RECOMMENDED to document it in the semantic conventions for specific GenAI system and use
   * system-specific name in the instrumentation. If a different name is not documented,
   * instrumentation libraries SHOULD use applicable predefined value.
   */
  public static final AttributeKey<String> GEN_AI_OPERATION_NAME =
      stringKey("gen_ai.operation.name");

  /**
   * Deprecated, use Event API to report prompt contents.
   *
   * <p>
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final AttributeKey<String> GEN_AI_PROMPT = stringKey("gen_ai.prompt");

  /**
   * The encoding formats requested in an embeddings operation, if specified.
   *
   * <p>Notes:
   *
   * <p>In some GenAI systems the encoding formats are called embedding types. Also, some GenAI
   * systems only accept a single format per request.
   */
  public static final AttributeKey<List<String>> GEN_AI_REQUEST_ENCODING_FORMATS =
      stringArrayKey("gen_ai.request.encoding_formats");

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

  /** Requests with same seed value more likely to return same result. */
  public static final AttributeKey<Long> GEN_AI_REQUEST_SEED = longKey("gen_ai.request.seed");

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
   * <p>The {@code gen_ai.system} describes a family of GenAI models with specific model identified
   * by {@code gen_ai.request.model} and {@code gen_ai.response.model} attributes.
   *
   * <p>The actual GenAI product may differ from the one identified by the client. Multiple systems,
   * including Azure OpenAI and Gemini, are accessible by OpenAI client libraries. In such cases,
   * the {@code gen_ai.system} is set to {@code openai} based on the instrumentation's best
   * knowledge, instead of the actual system. The {@code server.address} attribute may help identify
   * the actual system in use for {@code openai}.
   *
   * <p>For custom model, a custom friendly name SHOULD be used. If none of these options apply, the
   * {@code gen_ai.system} SHOULD be set to {@code _OTHER}.
   */
  public static final AttributeKey<String> GEN_AI_SYSTEM = stringKey("gen_ai.system");

  /** The type of token being counted. */
  public static final AttributeKey<String> GEN_AI_TOKEN_TYPE = stringKey("gen_ai.token.type");

  /**
   * Deprecated, use {@code gen_ai.usage.output_tokens} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code gen_ai.usage.output_tokens} attribute.
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
   * <p>
   *
   * @deprecated Replaced by {@code gen_ai.usage.input_tokens} attribute.
   */
  @Deprecated
  public static final AttributeKey<Long> GEN_AI_USAGE_PROMPT_TOKENS =
      longKey("gen_ai.usage.prompt_tokens");

  // Enum definitions
  /** Values for {@link #GEN_AI_OPENAI_REQUEST_RESPONSE_FORMAT}. */
  public static final class GenAiOpenaiRequestResponseFormatIncubatingValues {
    /** Text response format */
    public static final String TEXT = "text";

    /** JSON object response format */
    public static final String JSON_OBJECT = "json_object";

    /** JSON schema response format */
    public static final String JSON_SCHEMA = "json_schema";

    private GenAiOpenaiRequestResponseFormatIncubatingValues() {}
  }

  /** Values for {@link #GEN_AI_OPENAI_REQUEST_SERVICE_TIER}. */
  public static final class GenAiOpenaiRequestServiceTierIncubatingValues {
    /** The system will utilize scale tier credits until they are exhausted. */
    public static final String AUTO = "auto";

    /** The system will utilize the default scale tier. */
    public static final String DEFAULT = "default";

    private GenAiOpenaiRequestServiceTierIncubatingValues() {}
  }

  /** Values for {@link #GEN_AI_OPERATION_NAME}. */
  public static final class GenAiOperationNameIncubatingValues {
    /**
     * Chat completion operation such as <a
     * href="https://platform.openai.com/docs/api-reference/chat">OpenAI Chat API</a>
     */
    public static final String CHAT = "chat";

    /**
     * Text completions operation such as <a
     * href="https://platform.openai.com/docs/api-reference/completions">OpenAI Completions API
     * (Legacy)</a>
     */
    public static final String TEXT_COMPLETION = "text_completion";

    /**
     * Embeddings operation such as <a
     * href="https://platform.openai.com/docs/api-reference/embeddings/create">OpenAI Create
     * embeddings API</a>
     */
    public static final String EMBEDDINGS = "embeddings";

    private GenAiOperationNameIncubatingValues() {}
  }

  /** Values for {@link #GEN_AI_SYSTEM}. */
  public static final class GenAiSystemIncubatingValues {
    /** OpenAI */
    public static final String OPENAI = "openai";

    /** Vertex AI */
    public static final String VERTEX_AI = "vertex_ai";

    /** Gemini */
    public static final String GEMINI = "gemini";

    /** Anthropic */
    public static final String ANTHROPIC = "anthropic";

    /** Cohere */
    public static final String COHERE = "cohere";

    /** Azure AI Inference */
    public static final String AZ_AI_INFERENCE = "az.ai.inference";

    /** Azure OpenAI */
    public static final String AZ_AI_OPENAI = "az.ai.openai";

    /** IBM Watsonx AI */
    public static final String IBM_WATSONX_AI = "ibm.watsonx.ai";

    /** AWS Bedrock */
    public static final String AWS_BEDROCK = "aws.bedrock";

    /** Perplexity */
    public static final String PERPLEXITY = "perplexity";

    /** xAI */
    public static final String XAI = "xai";

    /** DeepSeek */
    public static final String DEEPSEEK = "deepseek";

    /** Groq */
    public static final String GROQ = "groq";

    /** Mistral AI */
    public static final String MISTRAL_AI = "mistral_ai";

    private GenAiSystemIncubatingValues() {}
  }

  /** Values for {@link #GEN_AI_TOKEN_TYPE}. */
  public static final class GenAiTokenTypeIncubatingValues {
    /** Input tokens (prompt, input, etc.) */
    public static final String INPUT = "input";

    /** Output tokens (completion, response, etc.) */
    public static final String COMPLETION = "output";

    private GenAiTokenTypeIncubatingValues() {}
  }

  private GenAiIncubatingAttributes() {}
}
