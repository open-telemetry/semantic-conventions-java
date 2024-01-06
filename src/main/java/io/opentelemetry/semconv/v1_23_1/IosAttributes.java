/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_23_1;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class IosAttributes {

  /**
   * This attribute represents the state the application has transitioned into at the occurrence of
   * the event.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The iOS lifecycle states are defined in the <a
   *       href="https://developer.apple.com/documentation/uikit/uiapplicationdelegate#1656902">UIApplicationDelegate
   *       documentation</a>, and from which the {@code OS terminology} column values are derived.
   * </ul>
   */
  public static final AttributeKey<String> IOS_STATE = stringKey("ios.state");

  // Enum definitions
  public static final class IosStateValues {
    /**
     * The app has become `active`. Associated with UIKit notification `applicationDidBecomeActive`.
     */
    public static final String ACTIVE = "active";

    /**
     * The app is now `inactive`. Associated with UIKit notification `applicationWillResignActive`.
     */
    public static final String INACTIVE = "inactive";

    /**
     * The app is now in the background. This value is associated with UIKit notification
     * `applicationDidEnterBackground`.
     */
    public static final String BACKGROUND = "background";

    /**
     * The app is now in the foreground. This value is associated with UIKit notification
     * `applicationWillEnterForeground`.
     */
    public static final String FOREGROUND = "foreground";

    /**
     * The app is about to terminate. Associated with UIKit notification `applicationWillTerminate`.
     */
    public static final String TERMINATE = "terminate";

    private IosStateValues() {}
  }

  private IosAttributes() {}
}
