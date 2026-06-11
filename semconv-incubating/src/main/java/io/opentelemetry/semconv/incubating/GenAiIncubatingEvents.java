/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEvents.java.j2
@SuppressWarnings("unused")
public final class GenAiIncubatingEvents {
  /**
   * This event describes the assistant message passed to GenAI system.
   *
   * @deprecated Chat history is reported on {@code gen_ai.input.messages} attribute on spans or
   *     {@code gen_ai.client.inference.operation.details} event.
   */
  @Deprecated public static final String GEN_AI_ASSISTANT_MESSAGE = "gen_ai.assistant.message";

  /**
   * This event describes the Gen AI response message.
   *
   * @deprecated Chat history is reported on {@code gen_ai.output.messages} attribute on spans or
   *     {@code gen_ai.client.inference.operation.details} event.
   */
  @Deprecated public static final String GEN_AI_CHOICE = "gen_ai.choice";

  /**
   * Describes the details of a GenAI completion request including chat history and parameters.
   *
   * <p>Notes:
   *
   * <p>This event is opt-in and could be used to store input and output details independently from
   * traces.
   */
  public static final String GEN_AI_CLIENT_INFERENCE_OPERATION_DETAILS =
      "gen_ai.client.inference.operation.details";

  /**
   * This event represents an exception that occurred during a Generative AI client operation, such
   * as API errors, rate limiting, model errors, timeouts, or other errors that prevent the
   * operation from completing successfully.
   *
   * <p>Notes:
   *
   * <p>This event SHOULD be recorded when an exception occurs during Generative AI client
   * operations. Instrumentations SHOULD set the severity to WARN (severity number 13) when
   * recording this event. Instrumentations MAY provide a configuration option to populate exception
   * events with the attributes captured on the corresponding Generative AI client span.
   */
  public static final String GEN_AI_CLIENT_OPERATION_EXCEPTION =
      "gen_ai.client.operation.exception";

  /**
   * This event captures the result of evaluating GenAI output for quality, accuracy, or other
   * characteristics. This event SHOULD be parented to GenAI operation span being evaluated when
   * possible or set {@code gen_ai.response.id} when span id is not available.
   */
  public static final String GEN_AI_EVALUATION_RESULT = "gen_ai.evaluation.result";

  /**
   * This event describes the system instructions passed to the GenAI model.
   *
   * @deprecated Chat history is reported on {@code gen_ai.system_instructions} attribute on spans
   *     or {@code gen_ai.client.inference.operation.details} event.
   */
  @Deprecated public static final String GEN_AI_SYSTEM_MESSAGE = "gen_ai.system.message";

  /**
   * This event describes the response from a tool or function call passed to the GenAI model.
   *
   * @deprecated Chat history is reported on {@code gen_ai.input.messages} attribute on spans or
   *     {@code gen_ai.client.inference.operation.details} event.
   */
  @Deprecated public static final String GEN_AI_TOOL_MESSAGE = "gen_ai.tool.message";

  /**
   * This event describes the user message passed to the GenAI model.
   *
   * @deprecated Chat history is reported on {@code gen_ai.input.messages} attribute on spans or
   *     {@code gen_ai.client.inference.operation.details} event.
   */
  @Deprecated public static final String GEN_AI_USER_MESSAGE = "gen_ai.user.message";

  private GenAiIncubatingEvents() {}
}
