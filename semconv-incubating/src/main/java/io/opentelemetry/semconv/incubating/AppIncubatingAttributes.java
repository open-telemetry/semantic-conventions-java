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
public final class AppIncubatingAttributes {
  /**
   * A unique identifier representing the installation of an application on a specific device
   *
   * <p>Notes:
   *
   * <p>Its value SHOULD persist across launches of the same application installation, including
   * through application upgrades. It SHOULD change if the application is uninstalled or if all
   * applications of the vendor are uninstalled. Additionally, users might be able to reset this
   * value (e.g. by clearing application data). If an app is installed multiple times on the same
   * device (e.g. in different accounts on Android), each {@code app.installation.id} SHOULD have a
   * different value. If multiple OpenTelemetry SDKs are used within the same application, they
   * SHOULD use the same value for {@code app.installation.id}. Hardware IDs (e.g. serial number,
   * IMEI, MAC address) MUST NOT be used as the {@code app.installation.id}.
   *
   * <p>For iOS, this value SHOULD be equal to the <a
   * href="https://developer.apple.com/documentation/uikit/uidevice/identifierforvendor">vendor
   * identifier</a>.
   *
   * <p>For Android, examples of {@code app.installation.id} implementations include:
   *
   * <ul>
   *   <li><a href="https://firebase.google.com/docs/projects/manage-installations">Firebase
   *       Installation ID</a>.
   *   <li>A globally unique UUID which is persisted across sessions in your application.
   *   <li><a href="https://developer.android.com/identity/app-set-id">App set ID</a>.
   *   <li><a
   *       href="https://developer.android.com/reference/android/provider/Settings.Secure#ANDROID_ID">{@code
   *       Settings.getString(Settings.Secure.ANDROID_ID)}</a>.
   * </ul>
   *
   * <p>More information about Android identifier best practices can be found <a
   * href="https://developer.android.com/training/articles/user-data-ids">here</a>.
   */
  public static final AttributeKey<String> APP_INSTALLATION_ID = stringKey("app.installation.id");

  // Enum definitions

  private AppIncubatingAttributes() {}
}
