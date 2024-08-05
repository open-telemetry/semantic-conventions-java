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
   * Uniquely identifies the framework API revision offered by a version (<code>os.version</code>)
   * of the android operating system. More information can be found <a
   * href="https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels">here</a>.
   */
  public static final AttributeKey<String> ANDROID_OS_API_LEVEL = stringKey("android.os.api_level");

  /**
   * Deprecated use the <code>device.app.lifecycle</code> event definition including <code>
   * android.state</code> as a payload field instead.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The Android lifecycle states are defined in [Activity lifecycle
   *       callbacks](https://developer.android.com/guide/components/activities/activity-lifecycle#lc),
   *       and from which the `OS identifiers` are derived.
   * </ul>
   */
  public static final AttributeKey<String> ANDROID_STATE = stringKey("android.state");

  // Enum definitions
  /** Values for {@link #ANDROID_STATE}. */
  public static final class AndroidStateValues {

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

    private AndroidStateValues() {}
  }

  private AndroidIncubatingAttributes() {}
}
