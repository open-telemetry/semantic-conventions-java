
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
public final class AndroidIncubatingAttributes {

  /**
  * Uniquely identifies the framework API revision offered by a version ({@code os.version}) of the android operating system. More information can be found <a href="https://developer.android.com/guide/topics/manifest/uses-sdk-element#ApiLevels">here</a>.
  *
  */
  public static final AttributeKey<String> ANDROID_OS_APILEVEL = stringKey("android.os.api_level");

  /**
  * This attribute represents the state the application has transitioned into at the occurrence of the event.
  *
  * <p>Notes:
        
        
        <ul> <li>The Android lifecycle states are defined in <a href="https://developer.android.com/guide/components/activities/activity-lifecycle#lc">Activity lifecycle callbacks</a>, and from which the {@code OS identifiers} are derived.</li> </ul>
  *
  */
  public static final AttributeKey<String> ANDROID_STATE = stringKey("android.state");
  // Enum definitions
  /**
  * Values for {@link #ANDROID_STATE}.
  *
  */
  public static final class AndroidStateValues {
      /** Any time before Activity.onResume() or, if the app has no Activity, Context.startService() has been called in the app for the first time. */
      public static final String CREATED = "created";
      /** Any time after Activity.onPause() or, if the app has no Activity, Context.stopService() has been called when the app was in the foreground state. */
      public static final String BACKGROUND = "background";
      /** Any time after Activity.onResume() or, if the app has no Activity, Context.startService() has been called when the app was in either the created or background states. */
      public static final String FOREGROUND = "foreground";

      private AndroidStateValues() {}
  }

  private AndroidIncubatingAttributes() {}
}