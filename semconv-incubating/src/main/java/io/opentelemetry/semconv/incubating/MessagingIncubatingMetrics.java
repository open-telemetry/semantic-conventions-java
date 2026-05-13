/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class MessagingIncubatingMetrics {

  /** Name of the {@code messaging.client.consumed.messages} metric. */
  public static final String MESSAGING_CLIENT_CONSUMED_MESSAGES_NAME =
      "messaging.client.consumed.messages";

  /** Unit of the {@code messaging.client.consumed.messages} metric. */
  public static final String MESSAGING_CLIENT_CONSUMED_MESSAGES_UNIT = "{message}";

  /** Description of the {@code messaging.client.consumed.messages} metric. */
  public static final String MESSAGING_CLIENT_CONSUMED_MESSAGES_DESCRIPTION =
      "Number of messages that were delivered to the application.";

  /** Name of the {@code messaging.client.operation.duration} metric. */
  public static final String MESSAGING_CLIENT_OPERATION_DURATION_NAME =
      "messaging.client.operation.duration";

  /** Unit of the {@code messaging.client.operation.duration} metric. */
  public static final String MESSAGING_CLIENT_OPERATION_DURATION_UNIT = "s";

  /** Description of the {@code messaging.client.operation.duration} metric. */
  public static final String MESSAGING_CLIENT_OPERATION_DURATION_DESCRIPTION =
      "Duration of messaging operation initiated by a producer or consumer client.";

  /** Name of the {@code messaging.client.published.messages} metric. */
  @Deprecated
  public static final String MESSAGING_CLIENT_PUBLISHED_MESSAGES_NAME =
      "messaging.client.published.messages";

  /** Unit of the {@code messaging.client.published.messages} metric. */
  @Deprecated public static final String MESSAGING_CLIENT_PUBLISHED_MESSAGES_UNIT = "{message}";

  /** Description of the {@code messaging.client.published.messages} metric. */
  @Deprecated
  public static final String MESSAGING_CLIENT_PUBLISHED_MESSAGES_DESCRIPTION =
      "Deprecated. Use `messaging.client.sent.messages` instead.";

  /** Name of the {@code messaging.client.sent.messages} metric. */
  public static final String MESSAGING_CLIENT_SENT_MESSAGES_NAME = "messaging.client.sent.messages";

  /** Unit of the {@code messaging.client.sent.messages} metric. */
  public static final String MESSAGING_CLIENT_SENT_MESSAGES_UNIT = "{message}";

  /** Description of the {@code messaging.client.sent.messages} metric. */
  public static final String MESSAGING_CLIENT_SENT_MESSAGES_DESCRIPTION =
      "Number of messages producer attempted to send to the broker.";

  /** Name of the {@code messaging.process.duration} metric. */
  public static final String MESSAGING_PROCESS_DURATION_NAME = "messaging.process.duration";

  /** Unit of the {@code messaging.process.duration} metric. */
  public static final String MESSAGING_PROCESS_DURATION_UNIT = "s";

  /** Description of the {@code messaging.process.duration} metric. */
  public static final String MESSAGING_PROCESS_DURATION_DESCRIPTION =
      "Duration of processing operation.";

  /** Name of the {@code messaging.process.messages} metric. */
  @Deprecated
  public static final String MESSAGING_PROCESS_MESSAGES_NAME = "messaging.process.messages";

  /** Unit of the {@code messaging.process.messages} metric. */
  @Deprecated public static final String MESSAGING_PROCESS_MESSAGES_UNIT = "{message}";

  /** Description of the {@code messaging.process.messages} metric. */
  @Deprecated
  public static final String MESSAGING_PROCESS_MESSAGES_DESCRIPTION =
      "Deprecated. Use `messaging.client.consumed.messages` instead.";

  /** Name of the {@code messaging.publish.duration} metric. */
  @Deprecated
  public static final String MESSAGING_PUBLISH_DURATION_NAME = "messaging.publish.duration";

  /** Unit of the {@code messaging.publish.duration} metric. */
  @Deprecated public static final String MESSAGING_PUBLISH_DURATION_UNIT = "s";

  /** Description of the {@code messaging.publish.duration} metric. */
  @Deprecated
  public static final String MESSAGING_PUBLISH_DURATION_DESCRIPTION =
      "Deprecated. Use `messaging.client.operation.duration` instead.";

  /** Name of the {@code messaging.publish.messages} metric. */
  @Deprecated
  public static final String MESSAGING_PUBLISH_MESSAGES_NAME = "messaging.publish.messages";

  /** Unit of the {@code messaging.publish.messages} metric. */
  @Deprecated public static final String MESSAGING_PUBLISH_MESSAGES_UNIT = "{message}";

  /** Description of the {@code messaging.publish.messages} metric. */
  @Deprecated
  public static final String MESSAGING_PUBLISH_MESSAGES_DESCRIPTION =
      "Deprecated. Use `messaging.client.sent.messages` instead.";

  /** Name of the {@code messaging.receive.duration} metric. */
  @Deprecated
  public static final String MESSAGING_RECEIVE_DURATION_NAME = "messaging.receive.duration";

  /** Unit of the {@code messaging.receive.duration} metric. */
  @Deprecated public static final String MESSAGING_RECEIVE_DURATION_UNIT = "s";

  /** Description of the {@code messaging.receive.duration} metric. */
  @Deprecated
  public static final String MESSAGING_RECEIVE_DURATION_DESCRIPTION =
      "Deprecated. Use `messaging.client.operation.duration` instead.";

  /** Name of the {@code messaging.receive.messages} metric. */
  @Deprecated
  public static final String MESSAGING_RECEIVE_MESSAGES_NAME = "messaging.receive.messages";

  /** Unit of the {@code messaging.receive.messages} metric. */
  @Deprecated public static final String MESSAGING_RECEIVE_MESSAGES_UNIT = "{message}";

  /** Description of the {@code messaging.receive.messages} metric. */
  @Deprecated
  public static final String MESSAGING_RECEIVE_MESSAGES_DESCRIPTION =
      "Deprecated. Use `messaging.client.consumed.messages` instead.";

  private MessagingIncubatingMetrics() {}
}
