/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class AspnetcoreIncubatingAttributes {

  /** ASP.NET Core exception middleware handling result */
  public static final AttributeKey<String> ASPNETCORE_DIAGNOSTICS_EXCEPTION_RESULT =
      stringKey("aspnetcore.diagnostics.exception.result");

  /**
   * Full type name of the <a
   * href="https://learn.microsoft.com/dotnet/api/microsoft.aspnetcore.diagnostics.iexceptionhandler">{@code
   * IExceptionHandler}</a> implementation that handled the exception.
   */
  public static final AttributeKey<String> ASPNETCORE_DIAGNOSTICS_HANDLER_TYPE =
      stringKey("aspnetcore.diagnostics.handler.type");

  /** Rate limiting policy name. */
  public static final AttributeKey<String> ASPNETCORE_RATE_LIMITING_POLICY =
      stringKey("aspnetcore.rate_limiting.policy");

  /** Rate-limiting result, shows whether the lease was acquired or contains a rejection reason */
  public static final AttributeKey<String> ASPNETCORE_RATE_LIMITING_RESULT =
      stringKey("aspnetcore.rate_limiting.result");

  /** Flag indicating if request was handled by the application pipeline. */
  public static final AttributeKey<Boolean> ASPNETCORE_REQUEST_IS_UNHANDLED =
      booleanKey("aspnetcore.request.is_unhandled");

  /** A value that indicates whether the matched route is a fallback route. */
  public static final AttributeKey<Boolean> ASPNETCORE_ROUTING_IS_FALLBACK =
      booleanKey("aspnetcore.routing.is_fallback");

  /** Match result - success or failure */
  public static final AttributeKey<String> ASPNETCORE_ROUTING_MATCH_STATUS =
      stringKey("aspnetcore.routing.match_status");

  // Enum definitions
  /** Values for {@link #ASPNETCORE_DIAGNOSTICS_EXCEPTION_RESULT}. */
  public static final class AspnetcoreDiagnosticsExceptionResultValues {
    /** Exception was handled by the exception handling middleware. */
    public static final String HANDLED = "handled";

    /** Exception was not handled by the exception handling middleware. */
    public static final String UNHANDLED = "unhandled";

    /** Exception handling was skipped because the response had started. */
    public static final String SKIPPED = "skipped";

    /** Exception handling didn&#39;t run because the request was aborted. */
    public static final String ABORTED = "aborted";

    private AspnetcoreDiagnosticsExceptionResultValues() {}
  }

  /** Values for {@link #ASPNETCORE_RATE_LIMITING_RESULT}. */
  public static final class AspnetcoreRateLimitingResultValues {
    /** Lease was acquired. */
    public static final String ACQUIRED = "acquired";

    /** Lease request was rejected by the endpoint limiter. */
    public static final String ENDPOINT_LIMITER = "endpoint_limiter";

    /** Lease request was rejected by the global limiter. */
    public static final String GLOBAL_LIMITER = "global_limiter";

    /** Lease request was canceled. */
    public static final String REQUEST_CANCELED = "request_canceled";

    private AspnetcoreRateLimitingResultValues() {}
  }

  /** Values for {@link #ASPNETCORE_ROUTING_MATCH_STATUS}. */
  public static final class AspnetcoreRoutingMatchStatusValues {
    /** Match succeeded. */
    public static final String SUCCESS = "success";

    /** Match failed. */
    public static final String FAILURE = "failure";

    private AspnetcoreRoutingMatchStatusValues() {}
  }

  private AspnetcoreIncubatingAttributes() {}
}
