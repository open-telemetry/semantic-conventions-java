/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/java/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class AndroidIncubatingAttributes {

  /**
   * Uniquely identifies the framework API revision offered by a version (<code>os.version</code>)
   * of the android operating system. More information can be found <a
   * href="https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels">here</a>.
   */
  public static final AttributeKey<String> ANDROID_OS_API_LEVEL = stringKey("android.os.api_level");

  private IncubatingAndroidIncubatingAttributes() {}
}
