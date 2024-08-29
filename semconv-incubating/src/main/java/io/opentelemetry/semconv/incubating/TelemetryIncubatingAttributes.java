/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class TelemetryIncubatingAttributes {
  /**
   * The name of the auto instrumentation agent or distribution, if used.
   *
   * <p>Notes:
   *
   * <p>Official auto instrumentation agents and distributions SHOULD set the {@code
   * telemetry.distro.name} attribute to a string starting with {@code opentelemetry-}, e.g. {@code
   * opentelemetry-java-instrumentation}.
   */
  public static final AttributeKey<String> TELEMETRY_DISTRO_NAME =
      stringKey("telemetry.distro.name");

  /** The version string of the auto instrumentation agent or distribution, if used. */
  public static final AttributeKey<String> TELEMETRY_DISTRO_VERSION =
      stringKey("telemetry.distro.version");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.TelemetryAttributes#TELEMETRY_SDK_LANGUAGE} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> TELEMETRY_SDK_LANGUAGE =
      stringKey("telemetry.sdk.language");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.TelemetryAttributes#TELEMETRY_SDK_NAME} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> TELEMETRY_SDK_NAME = stringKey("telemetry.sdk.name");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.TelemetryAttributes#TELEMETRY_SDK_VERSION} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> TELEMETRY_SDK_VERSION =
      stringKey("telemetry.sdk.version");

  // Enum definitions
  /**
   * Values for {@link #TELEMETRY_SDK_LANGUAGE}.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.TelemetryAttributes#TELEMETRY_SDK_LANGUAGE} attribute.
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
