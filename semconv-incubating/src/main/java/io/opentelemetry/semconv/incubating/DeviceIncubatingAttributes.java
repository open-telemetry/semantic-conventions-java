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
public final class DeviceIncubatingAttributes {
  /**
   * A unique identifier representing the device
   *
   * <p>Notes:
   *
   * <p>The device identifier MUST only be defined using the values outlined below. This value is
   * not an advertising identifier and MUST NOT be used as such. On iOS (Swift or Objective-C), this
   * value MUST be equal to the <a
   * href="https://developer.apple.com/documentation/uikit/uidevice/1620059-identifierforvendor">vendor
   * identifier</a>. On Android (Java or Kotlin), this value MUST be equal to the Firebase
   * Installation ID or a globally unique UUID which is persisted across sessions in your
   * application. More information can be found <a
   * href="https://developer.android.com/training/articles/user-data-ids">here</a> on best practices
   * and exact implementation details. Caution should be taken when storing personal data or
   * anything which can identify a user. GDPR and data protection laws may apply, ensure you do your
   * own due diligence.
   */
  public static final AttributeKey<String> DEVICE_ID = stringKey("device.id");

  /**
   * The name of the device manufacturer
   *
   * <p>Notes:
   *
   * <p>The Android OS provides this field via <a
   * href="https://developer.android.com/reference/android/os/Build#MANUFACTURER">Build</a>. iOS
   * apps SHOULD hardcode the value {@code Apple}.
   */
  public static final AttributeKey<String> DEVICE_MANUFACTURER = stringKey("device.manufacturer");

  /**
   * The model identifier for the device
   *
   * <p>Notes:
   *
   * <p>It's recommended this value represents a machine-readable version of the model identifier
   * rather than the market or consumer-friendly name of the device.
   */
  public static final AttributeKey<String> DEVICE_MODEL_IDENTIFIER =
      stringKey("device.model.identifier");

  /**
   * The marketing name for the device model
   *
   * <p>Notes:
   *
   * <p>It's recommended this value represents a human-readable version of the device model rather
   * than a machine-readable alternative.
   */
  public static final AttributeKey<String> DEVICE_MODEL_NAME = stringKey("device.model.name");

  // Enum definitions

  private DeviceIncubatingAttributes() {}
}
