/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEvents.java.j2
@SuppressWarnings("unused")
public final class MessagingIncubatingEvents {
  /**
   * This event represents an exception that occurred during a messaging create operation.
   *
   * <p>Notes:
   *
   * <p>This event SHOULD be recorded when an exception occurs during a messaging create operation.
   * Instrumentations SHOULD set the severity to WARN (severity number 13) when recording this
   * event. Instrumentations MAY provide a configuration option to populate exception events with
   * the attributes captured on the corresponding messaging create span.
   */
  public static final String MESSAGING_CREATE_EXCEPTION = "messaging.create.exception";

  /**
   * This event represents an exception that occurred during messaging process operations.
   *
   * <p>Notes:
   *
   * <p>This event SHOULD be recorded when an exception occurs during messaging process operations.
   * Instrumentations SHOULD set the severity to ERROR (severity number 17) when recording this
   * event. Instrumentations MAY provide a configuration option to populate exception events with
   * the attributes captured on the corresponding messaging process span.
   */
  public static final String MESSAGING_PROCESS_EXCEPTION = "messaging.process.exception";

  /**
   * This event represents an exception that occurred during a messaging receive operation.
   *
   * <p>Notes:
   *
   * <p>This event SHOULD be recorded when an exception occurs during a messaging receive operation.
   * Instrumentations SHOULD set the severity to WARN (severity number 13) when recording this
   * event. Instrumentations MAY provide a configuration option to populate exception events with
   * the attributes captured on the corresponding messaging receive span.
   */
  public static final String MESSAGING_RECEIVE_EXCEPTION = "messaging.receive.exception";

  /**
   * This event represents an exception that occurred during a messaging send operation.
   *
   * <p>Notes:
   *
   * <p>This event SHOULD be recorded when an exception occurs during a messaging send operation.
   * Instrumentations SHOULD set the severity to WARN (severity number 13) when recording this
   * event. Instrumentations MAY provide a configuration option to populate exception events with
   * the attributes captured on the corresponding messaging send span.
   */
  public static final String MESSAGING_SEND_EXCEPTION = "messaging.send.exception";

  /**
   * This event represents an exception that occurred during a messaging settle operation.
   *
   * <p>Notes:
   *
   * <p>This event SHOULD be recorded when an exception occurs during a messaging settle operation.
   * Instrumentations SHOULD set the severity to WARN (severity number 13) when recording this
   * event. Instrumentations MAY provide a configuration option to populate exception events with
   * the attributes captured on the corresponding messaging settle span.
   */
  public static final String MESSAGING_SETTLE_EXCEPTION = "messaging.settle.exception";

  private MessagingIncubatingEvents() {}
}
