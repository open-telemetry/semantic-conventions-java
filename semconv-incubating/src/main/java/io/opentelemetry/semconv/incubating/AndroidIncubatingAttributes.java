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
public final class AndroidIncubatingAttributes {
  /**
   * Uniquely identifies the framework API revision offered by a version ({@code os.version}) of the
   * android operating system. More information can be found <a
   * href="https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels">here</a>.
   */
  public static final AttributeKey<String> ANDROID_OS_API_LEVEL = stringKey("android.os.api_level");

  /**
   * Deprecated use the {@code device.app.lifecycle} event definition including {@code
   * android.state} as a payload field instead.
   *
   * <p>Notes:
   *
   * <p>The Android lifecycle states are defined in <a
   * href="https://developer.android.com/guide/components/activities/activity-lifecycle#lc">Activity
   * lifecycle callbacks</a>, and from which the {@code OS identifiers} are derived.
   *
   * @deprecated Replaced by {@code device.app.lifecycle}.
   */
  @Deprecated public static final AttributeKey<String> ANDROID_STATE = stringKey("android.state");

  // Enum definitions
  /**
   * Values for {@link #ANDROID_STATE}
   *
   * @deprecated Replaced by {@code device.app.lifecycle}.
   */
  @Deprecated
  public static final class AndroidStateIncubatingValues {
    /**
     * Any time before Activity.onResume() or, if the app has no Activity, Context.startService()
     * has been called in the app for the first time.
     */
    public static final String CREATED = "created";

    /**
     * Any time after Activity.onPause() or, if the app has no Activity, Context.stopService() has
     * been called when the app was in the foreground state.
     */
    public static final String BACKGROUND = "background";

    /**
     * Any time after Activity.onResume() or, if the app has no Activity, Context.startService() has
     * been called when the app was in either the created or background states.
     */
    public static final String FOREGROUND = "foreground";

    private AndroidStateIncubatingValues() {}
  }

  private AndroidIncubatingAttributes() {}
}
