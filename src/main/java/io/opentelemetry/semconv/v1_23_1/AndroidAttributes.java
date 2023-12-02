/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_23_1;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.experimental.java.j2
@SuppressWarnings("unused")
public final class AndroidAttributes {

  /**
   * This attribute represents the state the application has transitioned into at the occurrence of
   * the event.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The Android lifecycle states are defined in <a
   *       href="https://developer.android.com/guide/components/activities/activity-lifecycle#lc">Activity
   *       lifecycle callbacks</a>, and from which the {@code OS identifiers} are derived.
   * </ul>
   */
  public static final AttributeKey<String> ANDROID_STATE = stringKey("android.state");

  /**
   * Uniquely identifies the framework API revision offered by a version ({@code os.version}) of the
   * android operating system. More information can be found <a
   * href="https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels">here</a>.
   */
  public static final AttributeKey<String> ANDROID_OS_API_LEVEL = stringKey("android.os.api_level");

  // Enum definitions
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

  private AndroidAttributes() {}
}
