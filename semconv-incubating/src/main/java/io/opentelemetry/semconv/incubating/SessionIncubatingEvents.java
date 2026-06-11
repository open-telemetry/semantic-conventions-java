/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEvents.java.j2
@SuppressWarnings("unused")
public final class SessionIncubatingEvents {
  /**
   * Indicates that a session has ended.
   *
   * <p>Notes:
   *
   * <p>For instrumentation that tracks user behavior during user sessions, a {@code session.end}
   * event SHOULD be emitted every time a session ends. When a session ends and continues as a new
   * session, this event SHOULD be emitted prior to the {@code session.start} event.
   */
  public static final String SESSION_END = "session.end";

  /**
   * Indicates that a new session has been started, optionally linking to the prior session.
   *
   * <p>Notes:
   *
   * <p>For instrumentation that tracks user behavior during user sessions, a {@code session.start}
   * event MUST be emitted every time a session is created. When a new session is created as a
   * continuation of a prior session, the {@code session.previous_id} SHOULD be included in the
   * event. The values of {@code session.id} and {@code session.previous_id} MUST be different. When
   * the {@code session.start} event contains both {@code session.id} and {@code
   * session.previous_id} fields, the event indicates that the previous session has ended. If the
   * session ID in {@code session.previous_id} has not yet ended via explicit {@code session.end}
   * event, then the consumer SHOULD treat this continuation event as semantically equivalent to
   * {@code session.end(session.previous_id)} and {@code session.start(session.id)}.
   */
  public static final String SESSION_START = "session.start";

  private SessionIncubatingEvents() {}
}
