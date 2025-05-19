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
  /** Free-form description of the GenAI agent provided by the application. */
  public static final AttributeKey<String> GEN_AI_AGENT_DESCRIPTION =
      stringKey("gen_ai.agent.description");

  /** The unique identifier of the GenAI agent. */
  public static final AttributeKey<String> GEN_AI_AGENT_ID = stringKey("gen_ai.agent.id");

  /** Human-readable name of the GenAI agent provided by the application. */
  public static final AttributeKey<String> GEN_AI_AGENT_NAME = stringKey("gen_ai.agent.name");

  /**
   * Deprecated, use Event API to report completions contents.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final AttributeKey<String> GEN_AI_COMPLETION = stringKey("gen_ai.completion");

  /**
   * The unique identifier for a conversation (session, thread), used to store and correlate
   * messages within this conversation.
   */
  public static final AttributeKey<String> GEN_AI_CONVERSATION_ID =
      stringKey("gen_ai.conversation.id");

  /**
   * The data source identifier.
   *
   * <p>Notes:
   *
   * <p>Data sources are used by AI agents and RAG applications to store grounding data. A data
   * source may be an external database, object store, document collection, website, or any other
   * storage system used by the GenAI agent or application. The {@code gen_ai.data_source.id} SHOULD
   * match the identifier used by the GenAI system rather than a name specific to the external
   * storage, such as a database or object store. Semantic conventions referencing {@code
   * gen_ai.data_source.id} MAY also leverage additional attributes, such as {@code db.*}, to
   * further identify and describe the data source.
   */
  public static final AttributeKey<String> GEN_AI_DATA_SOURCE_ID =
      stringKey("gen_ai.data_source.id");

  /**
   * Deprecated, use {@code gen_ai.output.type}.
   *
   * @deprecated Replaced by {@code gen_ai.output.type}.
   */
  @Deprecated
  public static final AttributeKey<String> GEN_AI_OPENAI_REQUEST_RESPONSE_FORMAT =
      stringKey("gen_ai.openai.request.response_format");

  /**
   * Deprecated, use {@code gen_ai.request.seed}.
   *
   * @deprecated Replaced by {@code gen_ai.request.seed}.
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
   * Represents the content type requested by the client.
   *
   * <p>Notes:
   *
   * <p>This attribute SHOULD be used when the client requests output of a specific type. The model
   * may return zero or more outputs of this type. This attribute specifies the output modality and
   * not the actual output format. For example, if an image is requested, the actual output could be
   * a URL pointing to an image file. Additional output format details may be recorded in the future
   * in the {@code gen_ai.output.{type}.*} attributes.
   */
  public static final AttributeKey<String> GEN_AI_OUTPUT_TYPE = stringKey("gen_ai.output.type");

  /**
   * Deprecated, use Event API to report prompt contents.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated public static final AttributeKey<String> GEN_AI_PROMPT = stringKey("gen_ai.prompt");

  /** The target number of candidate completions to return. */
  public static final AttributeKey<Long> GEN_AI_REQUEST_CHOICE_COUNT =
      longKey("gen_ai.request.choice.count");

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

  /** The tool call identifier. */
  public static final AttributeKey<String> GEN_AI_TOOL_CALL_ID = stringKey("gen_ai.tool.call.id");

  /** The tool description. */
  public static final AttributeKey<String> GEN_AI_TOOL_DESCRIPTION =
      stringKey("gen_ai.tool.description");

  /** Name of the tool utilized by the agent. */
  public static final AttributeKey<String> GEN_AI_TOOL_NAME = stringKey("gen_ai.tool.name");

  /**
   * Type of the tool utilized by the agent
   *
   * <p>Notes:
   *
   * <p>Extension: A tool executed on the agent-side to directly call external APIs, bridging the
   * gap between the agent and real-world systems. Agent-side operations involve actions that are
   * performed by the agent on the server or within the agent's controlled environment. Function: A
   * tool executed on the client-side, where the agent generates parameters for a predefined
   * function, and the client executes the logic. Client-side operations are actions taken on the
   * user's end or within the client application. Datastore: A tool used by the agent to access and
   * query structured or unstructured external data for retrieval-augmented tasks or knowledge
   * updates.
   */
  public static final AttributeKey<String> GEN_AI_TOOL_TYPE = stringKey("gen_ai.tool.type");

  /**
   * Deprecated, use {@code gen_ai.usage.output_tokens} instead.
   *
   * @deprecated Replaced by {@code gen_ai.usage.output_tokens}.
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
   * @deprecated Replaced by {@code gen_ai.usage.input_tokens}.
   */
  @Deprecated
  public static final AttributeKey<Long> GEN_AI_USAGE_PROMPT_TOKENS =
      longKey("gen_ai.usage.prompt_tokens");

  // Enum definitions

  /**
   * Values for {@link #GEN_AI_OPENAI_REQUEST_RESPONSE_FORMAT}
   *
   * @deprecated Replaced by {@code gen_ai.output.type}.
   */
  @Deprecated
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
     * Multimodal content generation operation such as <a
     * href="https://ai.google.dev/api/generate-content">Gemini Generate Content</a>
     */
    public static final String GENERATE_CONTENT = "generate_content";

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

    /** Create GenAI agent */
    public static final String CREATE_AGENT = "create_agent";

    /** Invoke GenAI agent */
    public static final String INVOKE_AGENT = "invoke_agent";

    /** Execute a tool */
    public static final String EXECUTE_TOOL = "execute_tool";

    private GenAiOperationNameIncubatingValues() {}
  }

  /** Values for {@link #GEN_AI_OUTPUT_TYPE}. */
  public static final class GenAiOutputTypeIncubatingValues {
    /** Plain text */
    public static final String TEXT = "text";

    /** JSON object with known or unknown schema */
    public static final String JSON = "json";

    /** Image */
    public static final String IMAGE = "image";

    /** Speech */
    public static final String SPEECH = "speech";

    private GenAiOutputTypeIncubatingValues() {}
  }

  /** Values for {@link #GEN_AI_SYSTEM}. */
  public static final class GenAiSystemIncubatingValues {
    /** OpenAI */
    public static final String OPENAI = "openai";

    /** Any Google generative AI endpoint */
    public static final String GCP_GEN_AI = "gcp.gen_ai";

    /** Vertex AI */
    public static final String GCP_VERTEX_AI = "gcp.vertex_ai";

    /** Gemini */
    public static final String GCP_GEMINI = "gcp.gemini";

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

    /** Output tokens (completion, response, etc.) */
    public static final String OUTPUT = "output";

    private GenAiTokenTypeIncubatingValues() {}
  }

  private GenAiIncubatingAttributes() {}
}
