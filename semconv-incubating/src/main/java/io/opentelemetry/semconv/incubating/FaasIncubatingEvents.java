/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEvents.java.j2
@SuppressWarnings("unused")
public final class FaasIncubatingEvents {
  /**
   * This event represents an exception that occurred during FaaS function invocation, such as
   * application errors, internal failures, or other exceptions that prevent the function from
   * completing successfully.
   *
   * <p>Notes:
   *
   * <p>This event SHOULD be recorded when an exception occurs during FaaS function invocation.
   * Instrumentations SHOULD set the severity to ERROR (severity number 17) when recording this
   * event. Instrumentations MAY provide a configuration option to populate exception events with
   * the attributes captured on the corresponding FaaS span.
   */
  public static final String FAAS_INVOCATION_EXCEPTION = "faas.invocation.exception";

  private FaasIncubatingEvents() {}
}
