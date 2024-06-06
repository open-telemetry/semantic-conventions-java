
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
public final class TelemetryIncubatingAttributes {

  /**
  * The name of the auto instrumentation agent or distribution, if used.
  *
  * <p>Notes:
        
        
        <ul> <li>Official auto instrumentation agents and distributions SHOULD set the {@code telemetry.distro.name} attribute to
a string starting with {@code opentelemetry-}, e.g. {@code opentelemetry-java-instrumentation}.</li> </ul>
  *
  */
  public static final AttributeKey<String> TELEMETRY_DISTRO_NAME = stringKey("telemetry.distro.name");

  /**
  * The version string of the auto instrumentation agent or distribution, if used.
  *
  */
  public static final AttributeKey<String> TELEMETRY_DISTRO_VERSION = stringKey("telemetry.distro.version");

  /**
  * The language of the telemetry SDK.
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.TelemetryAttributes#TELEMETRY_SDK_LANGUAGE} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> TELEMETRY_SDK_LANGUAGE = stringKey("telemetry.sdk.language");

  /**
  * The name of the telemetry SDK as defined above.
  *
  * <p>Notes:
        
        
        <ul> <li>The OpenTelemetry SDK MUST set the {@code telemetry.sdk.name} attribute to {@code opentelemetry}.
If another SDK, like a fork or a vendor-provided implementation, is used, this SDK MUST set the
{@code telemetry.sdk.name} attribute to the fully-qualified class or module name of this SDK's main entry point
or another suitable identifier depending on the language.
The identifier {@code opentelemetry} is reserved and MUST NOT be used in this case.
All custom identifiers SHOULD be stable across different versions of an implementation.</li> </ul>
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.TelemetryAttributes#TELEMETRY_SDK_NAME} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> TELEMETRY_SDK_NAME = stringKey("telemetry.sdk.name");

  /**
  * The version string of the telemetry SDK.
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.TelemetryAttributes#TELEMETRY_SDK_VERSION} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> TELEMETRY_SDK_VERSION = stringKey("telemetry.sdk.version");
  // Enum definitions
  /**
  * Values for {@link #TELEMETRY_SDK_LANGUAGE}.
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.TelemetryAttributes.TelemetrySdkLanguageValues} attribute.
  */
  @Deprecated
  public static final class TelemetrySdkLanguageValues {
      /** cpp. */
      public static final String CPP = "cpp";
      /** dotnet. */
      public static final String DOTNET = "dotnet";
      /** erlang. */
      public static final String ERLANG = "erlang";
      /** go. */
      public static final String GO = "go";
      /** java. */
      public static final String JAVA = "java";
      /** nodejs. */
      public static final String NODEJS = "nodejs";
      /** php. */
      public static final String PHP = "php";
      /** python. */
      public static final String PYTHON = "python";
      /** ruby. */
      public static final String RUBY = "ruby";
      /** rust. */
      public static final String RUST = "rust";
      /** swift. */
      public static final String SWIFT = "swift";
      /** webjs. */
      public static final String WEBJS = "webjs";

      private TelemetrySdkLanguageValues() {}
  }

  private TelemetryIncubatingAttributes() {}
}