/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/java/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class ServiceAttributes {

  /**
   * Logical name of the service.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>MUST be the same for all instances of horizontally scaled services. If the value was not
   *       specified, SDKs MUST fallback to <code>unknown_service:</code> concatenated with <a
   *       href="process.md"><code>process.executable.name</code></a>, e.g. <code>
   *       unknown_service:bash</code>. If <code>process.executable.name</code> is not available,
   *       the value MUST be set to <code>unknown_service</code>.
   * </ul>
   */
  public static final AttributeKey<String> SERVICE_NAME = stringKey("service.name");

  /**
   * The version string of the service API or implementation. The format is not defined by these
   * conventions.
   */
  public static final AttributeKey<String> SERVICE_VERSION = stringKey("service.version");

  private ServiceAttributes() {}
}
