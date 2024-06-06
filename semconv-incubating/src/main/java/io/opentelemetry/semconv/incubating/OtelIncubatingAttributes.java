
/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.doubleKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;

import static io.opentelemetry.semconv.AttributeKeyTemplate.stringArrayKeyTemplate;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class OtelIncubatingAttributes {

  /**
  * None
  *
  * @deprecated None.
  */
  @Deprecated
  public static final AttributeKey<String> OTEL_LIBRARY_NAME = stringKey("otel.library.name");

  /**
  * None
  *
  * @deprecated None.
  */
  @Deprecated
  public static final AttributeKey<String> OTEL_LIBRARY_VERSION = stringKey("otel.library.version");

  /**
  * The name of the instrumentation scope - ({@code InstrumentationScope.Name} in OTLP).
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.OtelAttributes#OTEL_SCOPE_NAME} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> OTEL_SCOPE_NAME = stringKey("otel.scope.name");

  /**
  * The version of the instrumentation scope - ({@code InstrumentationScope.Version} in OTLP).
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.OtelAttributes#OTEL_SCOPE_VERSION} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> OTEL_SCOPE_VERSION = stringKey("otel.scope.version");

  /**
  * Name of the code, either &quot;OK&quot; or &quot;ERROR&quot;. MUST NOT be set if the status code is UNSET.
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.OtelAttributes#OTEL_STATUSCODE} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> OTEL_STATUSCODE = stringKey("otel.status_code");

  /**
  * Description of the Status if it has a value, otherwise not set.
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.OtelAttributes#OTEL_STATUSDESCRIPTION} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> OTEL_STATUSDESCRIPTION = stringKey("otel.status_description");
  // Enum definitions
  /**
  * Values for {@link #OTEL_STATUSCODE}.
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.OtelAttributes.OtelStatuscodeValues} attribute.
  */
  @Deprecated
  public static final class OtelStatuscodeValues {
      /** The operation has been validated by an Application developer or Operator to have completed successfully. */
      public static final String OK = "OK";
      /** The operation contains an error. */
      public static final String ERROR = "ERROR";

      private OtelStatuscodeValues() {}
  }

  private OtelIncubatingAttributes() {}
}