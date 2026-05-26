/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEvents.java.j2
@SuppressWarnings("unused")
public final class HttpIncubatingEvents {
  /**
   * This event represents an exception that occurred during an HTTP client request, such as network
   * failures, timeouts, or other errors that prevent the request from completing successfully.
   *
   * <p>Notes:
   *
   * <p>This event SHOULD be recorded when an exception occurs during HTTP client operations.
   * Instrumentations SHOULD set the severity to WARN (severity number 13) when recording this
   * event. Some HTTP client frameworks generate artificial exceptions for non-successful HTTP
   * status codes (e.g., 404 Not Found). When possible, instrumentations SHOULD NOT record these
   * artificial exceptions, or SHOULD set the severity to DEBUG (severity number 5).
   * Instrumentations MAY provide a configuration option to populate exception events with the
   * attributes captured on the corresponding HTTP client span.
   */
  public static final String HTTP_CLIENT_REQUEST_EXCEPTION = "http.client.request.exception";

  /**
   * This event represents an exception that occurred during HTTP server request processing, such as
   * application errors, internal failures, or other exceptions that prevent the server from
   * successfully handling the request.
   *
   * <p>Notes:
   *
   * <p>This event SHOULD be recorded when an exception occurs during HTTP server request
   * processing. Instrumentations SHOULD set the severity to ERROR (severity number 17) when
   * recording this event. Instrumentations MAY provide a configuration option to populate exception
   * events with the attributes captured on the corresponding HTTP server span.
   */
  public static final String HTTP_SERVER_REQUEST_EXCEPTION = "http.server.request.exception";

  private HttpIncubatingEvents() {}
}
