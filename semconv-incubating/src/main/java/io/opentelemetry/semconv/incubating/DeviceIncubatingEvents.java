/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEvents.java.j2
@SuppressWarnings("unused")
public final class DeviceIncubatingEvents {
  /**
   * This event represents an occurrence of a lifecycle transition on Android or iOS platform.
   *
   * <p>Notes:
   *
   * <p>The event body fields MUST be used to describe the state of the application at the time of
   * the event. This event is meant to be used in conjunction with {@code os.name} <a
   * href="/docs/resource/os.md">resource semantic convention</a> to identify the mobile operating
   * system (e.g. Android, iOS). The {@code android.app.state} and {@code ios.app.state} fields are
   * mutually exclusive and MUST NOT be used together, each field MUST be used with its
   * corresponding {@code os.name} value.
   */
  public static final String DEVICE_APP_LIFECYCLE = "device.app.lifecycle";

  private DeviceIncubatingEvents() {}
}
