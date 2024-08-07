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
   * <ul>
   *   <li>Official auto instrumentation agents and distributions SHOULD set the <code>
   *       telemetry.distro.name</code> attribute to a string starting with <code>opentelemetry-
   *       </code>, e.g. <code>opentelemetry-java-instrumentation</code>.
   * </ul>
   */
  public static final AttributeKey<String> TELEMETRY_DISTRO_NAME =
      stringKey("telemetry.distro.name");

  /** The version string of the auto instrumentation agent or distribution, if used. */
  public static final AttributeKey<String> TELEMETRY_DISTRO_VERSION =
      stringKey("telemetry.distro.version");

  private TelemetryIncubatingAttributes() {}
}
