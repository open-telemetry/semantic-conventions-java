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
   * <p>Its value SHOULD be identical for all apps on a device and it SHOULD NOT change if an app is
   * uninstalled and re-installed. However, it might be resettable by the user for all apps on a
   * device. Hardware IDs (e.g. vendor-specific serial number, IMEI or MAC address) MAY be used as
   * values.
   *
   * <p>More information about Android identifier best practices can be found <a
   * href="https://developer.android.com/training/articles/user-data-ids">here</a>.
   *
   * <blockquote>
   *
   * [!WARNING]
   *
   * <p>This attribute may contain sensitive (PII) information. Caution should be taken when storing
   * personal data or anything which can identify a user. GDPR and data protection laws may apply,
   * ensure you do your own due diligence.
   *
   * <p>Due to these reasons, this identifier is not recommended for consumer applications and will
   * likely result in rejection from both Google Play and App Store. However, it may be appropriate
   * for specific enterprise scenarios, such as kiosk devices or enterprise-managed devices, with
   * appropriate compliance clearance. Any instrumentation providing this identifier MUST implement
   * it as an opt-in feature.
   *
   * <p>See <a href="/docs/attributes-registry/app.md#app-installation-id">{@code
   * app.installation.id}</a> for a more privacy-preserving alternative.
   *
   * </blockquote>
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
