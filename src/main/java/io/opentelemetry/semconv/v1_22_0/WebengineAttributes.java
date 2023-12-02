/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_22_0;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.experimental.java.j2
@SuppressWarnings("unused")
public final class WebengineAttributes {

  /** Additional description of the web engine (e.g. detailed version and edition information). */
  public static final AttributeKey<String> WEBENGINE_DESCRIPTION =
      stringKey("webengine.description");

  /** The name of the web engine. */
  public static final AttributeKey<String> WEBENGINE_NAME = stringKey("webengine.name");

  /** The version of the web engine. */
  public static final AttributeKey<String> WEBENGINE_VERSION = stringKey("webengine.version");

  // Enum definitions

  private WebengineAttributes() {}
}
