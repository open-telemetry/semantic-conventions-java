
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
public final class WebengineIncubatingAttributes {

  /**
  * Additional description of the web engine (e.g. detailed version and edition information).
  *
  */
  public static final AttributeKey<String> WEBENGINE_DESCRIPTION = stringKey("webengine.description");

  /**
  * The name of the web engine.
  *
  */
  public static final AttributeKey<String> WEBENGINE_NAME = stringKey("webengine.name");

  /**
  * The version of the web engine.
  *
  */
  public static final AttributeKey<String> WEBENGINE_VERSION = stringKey("webengine.version");

  private WebengineIncubatingAttributes() {}
}