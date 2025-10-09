/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/java/SemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class HttpMetrics {

  /** Name of the {@code http.client.request.duration} metric. */
  public static final String HTTP_CLIENT_REQUEST_DURATION_NAME = "http.client.request.duration";

  /** Unit of the {@code http.client.request.duration} metric. */
  public static final String HTTP_CLIENT_REQUEST_DURATION_UNIT = "s";

  /** Description of the {@code http.client.request.duration} metric. */
  public static final String HTTP_CLIENT_REQUEST_DURATION_DESCRIPTION =
      "Duration of HTTP client requests.";

  /** Name of the {@code http.server.request.duration} metric. */
  public static final String HTTP_SERVER_REQUEST_DURATION_NAME = "http.server.request.duration";

  /** Unit of the {@code http.server.request.duration} metric. */
  public static final String HTTP_SERVER_REQUEST_DURATION_UNIT = "s";

  /** Description of the {@code http.server.request.duration} metric. */
  public static final String HTTP_SERVER_REQUEST_DURATION_DESCRIPTION =
      "Duration of HTTP server requests.";

  private HttpMetrics() {}
}
