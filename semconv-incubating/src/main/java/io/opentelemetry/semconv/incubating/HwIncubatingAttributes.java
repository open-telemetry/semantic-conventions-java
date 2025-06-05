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
public final class HwIncubatingAttributes {
  /** An identifier for the hardware component, unique within the monitored host */
  public static final AttributeKey<String> HW_ID = stringKey("hw.id");

  /** An easily-recognizable name for the hardware component */
  public static final AttributeKey<String> HW_NAME = stringKey("hw.name");

  /**
   * Unique identifier of the parent component (typically the {@code hw.id} attribute of the
   * enclosure, or disk controller)
   */
  public static final AttributeKey<String> HW_PARENT = stringKey("hw.parent");

  /** The current state of the component */
  public static final AttributeKey<String> HW_STATE = stringKey("hw.state");

  /**
   * Type of the component
   *
   * <p>Notes:
   *
   * <p>Describes the category of the hardware component for which {@code hw.state} is being
   * reported. For example, {@code hw.type=temperature} along with {@code hw.state=degraded} would
   * indicate that the temperature of the hardware component has been reported as {@code degraded}.
   */
  public static final AttributeKey<String> HW_TYPE = stringKey("hw.type");

  // Enum definitions

  /** Values for {@link #HW_STATE}. */
  public static final class HwStateIncubatingValues {
    /** Ok */
    public static final String OK = "ok";

    /** Degraded */
    public static final String DEGRADED = "degraded";

    /** Failed */
    public static final String FAILED = "failed";

    private HwStateIncubatingValues() {}
  }

  /** Values for {@link #HW_TYPE}. */
  public static final class HwTypeIncubatingValues {
    /** Battery */
    public static final String BATTERY = "battery";

    /** CPU */
    public static final String CPU = "cpu";

    /** Disk controller */
    public static final String DISK_CONTROLLER = "disk_controller";

    /** Enclosure */
    public static final String ENCLOSURE = "enclosure";

    /** Fan */
    public static final String FAN = "fan";

    /** GPU */
    public static final String GPU = "gpu";

    /** Logical disk */
    public static final String LOGICAL_DISK = "logical_disk";

    /** Memory */
    public static final String MEMORY = "memory";

    /** Network */
    public static final String NETWORK = "network";

    /** Physical disk */
    public static final String PHYSICAL_DISK = "physical_disk";

    /** Power supply */
    public static final String POWER_SUPPLY = "power_supply";

    /** Tape drive */
    public static final String TAPE_DRIVE = "tape_drive";

    /** Temperature */
    public static final String TEMPERATURE = "temperature";

    /** Voltage */
    public static final String VOLTAGE = "voltage";

    private HwTypeIncubatingValues() {}
  }

  private HwIncubatingAttributes() {}
}
