/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEvents.java.j2
@SuppressWarnings("unused")
public final class DbIncubatingEvents {
  /**
   * This event represents an exception that occurred during a database client operation, such as
   * connection failures, query errors, timeouts, or other errors that prevent the operation from
   * completing successfully.
   *
   * <p>Notes:
   *
   * <p>This event SHOULD be recorded when an exception occurs during database client operations.
   * Instrumentations SHOULD set the severity to WARN (severity number 13) when recording this
   * event. Instrumentations MAY provide a configuration option to populate exception events with
   * the attributes captured on the corresponding database client span.
   */
  public static final String DB_CLIENT_OPERATION_EXCEPTION = "db.client.operation.exception";

  private DbIncubatingEvents() {}
}
