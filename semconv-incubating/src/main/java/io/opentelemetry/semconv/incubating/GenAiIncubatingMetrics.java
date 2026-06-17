/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class GenAiIncubatingMetrics {

  /** Name of the {@code gen_ai.client.operation.duration} metric. */
  @Deprecated
  public static final String GEN_AI_CLIENT_OPERATION_DURATION_NAME =
      "gen_ai.client.operation.duration";

  /** Unit of the {@code gen_ai.client.operation.duration} metric. */
  @Deprecated public static final String GEN_AI_CLIENT_OPERATION_DURATION_UNIT = "s";

  /** Description of the {@code gen_ai.client.operation.duration} metric. */
  @Deprecated
  public static final String GEN_AI_CLIENT_OPERATION_DURATION_DESCRIPTION =
      "GenAI operation duration.";

  /** Name of the {@code gen_ai.client.operation.time_per_output_chunk} metric. */
  @Deprecated
  public static final String GEN_AI_CLIENT_OPERATION_TIME_PER_OUTPUT_CHUNK_NAME =
      "gen_ai.client.operation.time_per_output_chunk";

  /** Unit of the {@code gen_ai.client.operation.time_per_output_chunk} metric. */
  @Deprecated public static final String GEN_AI_CLIENT_OPERATION_TIME_PER_OUTPUT_CHUNK_UNIT = "s";

  /** Description of the {@code gen_ai.client.operation.time_per_output_chunk} metric. */
  @Deprecated
  public static final String GEN_AI_CLIENT_OPERATION_TIME_PER_OUTPUT_CHUNK_DESCRIPTION =
      "Time per output chunk, recorded for each chunk received after the first one, measured as the time elapsed from the end of the previous chunk to the end of the current chunk. ";

  /** Name of the {@code gen_ai.client.operation.time_to_first_chunk} metric. */
  @Deprecated
  public static final String GEN_AI_CLIENT_OPERATION_TIME_TO_FIRST_CHUNK_NAME =
      "gen_ai.client.operation.time_to_first_chunk";

  /** Unit of the {@code gen_ai.client.operation.time_to_first_chunk} metric. */
  @Deprecated public static final String GEN_AI_CLIENT_OPERATION_TIME_TO_FIRST_CHUNK_UNIT = "s";

  /** Description of the {@code gen_ai.client.operation.time_to_first_chunk} metric. */
  @Deprecated
  public static final String GEN_AI_CLIENT_OPERATION_TIME_TO_FIRST_CHUNK_DESCRIPTION =
      "Time to receive the first chunk, measured from when the client issues the generation request to when the first chunk is received in the response stream.";

  /** Name of the {@code gen_ai.client.token.usage} metric. */
  @Deprecated
  public static final String GEN_AI_CLIENT_TOKEN_USAGE_NAME = "gen_ai.client.token.usage";

  /** Unit of the {@code gen_ai.client.token.usage} metric. */
  @Deprecated public static final String GEN_AI_CLIENT_TOKEN_USAGE_UNIT = "{token}";

  /** Description of the {@code gen_ai.client.token.usage} metric. */
  @Deprecated
  public static final String GEN_AI_CLIENT_TOKEN_USAGE_DESCRIPTION =
      "Number of input and output tokens used.";

  /** Name of the {@code gen_ai.server.request.duration} metric. */
  @Deprecated
  public static final String GEN_AI_SERVER_REQUEST_DURATION_NAME = "gen_ai.server.request.duration";

  /** Unit of the {@code gen_ai.server.request.duration} metric. */
  @Deprecated public static final String GEN_AI_SERVER_REQUEST_DURATION_UNIT = "s";

  /** Description of the {@code gen_ai.server.request.duration} metric. */
  @Deprecated
  public static final String GEN_AI_SERVER_REQUEST_DURATION_DESCRIPTION =
      "Generative AI server request duration such as time-to-last byte or last output token.";

  /** Name of the {@code gen_ai.server.time_per_output_token} metric. */
  @Deprecated
  public static final String GEN_AI_SERVER_TIME_PER_OUTPUT_TOKEN_NAME =
      "gen_ai.server.time_per_output_token";

  /** Unit of the {@code gen_ai.server.time_per_output_token} metric. */
  @Deprecated public static final String GEN_AI_SERVER_TIME_PER_OUTPUT_TOKEN_UNIT = "s";

  /** Description of the {@code gen_ai.server.time_per_output_token} metric. */
  @Deprecated
  public static final String GEN_AI_SERVER_TIME_PER_OUTPUT_TOKEN_DESCRIPTION =
      "Time per output token generated after the first token for successful responses.";

  /** Name of the {@code gen_ai.server.time_to_first_token} metric. */
  @Deprecated
  public static final String GEN_AI_SERVER_TIME_TO_FIRST_TOKEN_NAME =
      "gen_ai.server.time_to_first_token";

  /** Unit of the {@code gen_ai.server.time_to_first_token} metric. */
  @Deprecated public static final String GEN_AI_SERVER_TIME_TO_FIRST_TOKEN_UNIT = "s";

  /** Description of the {@code gen_ai.server.time_to_first_token} metric. */
  @Deprecated
  public static final String GEN_AI_SERVER_TIME_TO_FIRST_TOKEN_DESCRIPTION =
      "Time to generate first token for successful responses.";

  private GenAiIncubatingMetrics() {}
}
