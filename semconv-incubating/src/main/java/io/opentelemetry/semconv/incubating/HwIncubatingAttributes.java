/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class HwIncubatingAttributes {
  /** Design capacity in Watts-hours or Amper-hours */
  public static final AttributeKey<String> HW_BATTERY_CAPACITY = stringKey("hw.battery.capacity");

  /**
   * Battery <a href="https://schemas.dmtf.org/wbem/cim-html/2.31.0/CIM_Battery.html">chemistry</a>,
   * e.g. Lithium-Ion, Nickel-Cadmium, etc.
   */
  public static final AttributeKey<String> HW_BATTERY_CHEMISTRY = stringKey("hw.battery.chemistry");

  /** The current state of the battery */
  public static final AttributeKey<String> HW_BATTERY_STATE = stringKey("hw.battery.state");

  /** BIOS version of the hardware component */
  public static final AttributeKey<String> HW_BIOS_VERSION = stringKey("hw.bios_version");

  /** Driver version for the hardware component */
  public static final AttributeKey<String> HW_DRIVER_VERSION = stringKey("hw.driver_version");

  /** Type of the enclosure (useful for modular systems) */
  public static final AttributeKey<String> HW_ENCLOSURE_TYPE = stringKey("hw.enclosure.type");

  /** Firmware version of the hardware component */
  public static final AttributeKey<String> HW_FIRMWARE_VERSION = stringKey("hw.firmware_version");

  /** Type of task the GPU is performing */
  public static final AttributeKey<String> HW_GPU_TASK = stringKey("hw.gpu.task");

  /** An identifier for the hardware component, unique within the monitored host */
  public static final AttributeKey<String> HW_ID = stringKey("hw.id");

  /** Type of limit for hardware components */
  public static final AttributeKey<String> HW_LIMIT_TYPE = stringKey("hw.limit_type");

  /** RAID Level of the logical disk */
  public static final AttributeKey<String> HW_LOGICAL_DISK_RAID_LEVEL =
      stringKey("hw.logical_disk.raid_level");

  /** State of the logical disk space usage */
  public static final AttributeKey<String> HW_LOGICAL_DISK_STATE =
      stringKey("hw.logical_disk.state");

  /** Type of the memory module */
  public static final AttributeKey<String> HW_MEMORY_TYPE = stringKey("hw.memory.type");

  /** Descriptive model name of the hardware component */
  public static final AttributeKey<String> HW_MODEL = stringKey("hw.model");

  /** An easily-recognizable name for the hardware component */
  public static final AttributeKey<String> HW_NAME = stringKey("hw.name");

  /** Logical addresses of the adapter (e.g. IP address, or WWPN) */
  public static final AttributeKey<List<String>> HW_NETWORK_LOGICAL_ADDRESSES =
      stringArrayKey("hw.network.logical_addresses");

  /** Physical address of the adapter (e.g. MAC address, or WWNN) */
  public static final AttributeKey<String> HW_NETWORK_PHYSICAL_ADDRESS =
      stringKey("hw.network.physical_address");

  /**
   * Unique identifier of the parent component (typically the {@code hw.id} attribute of the
   * enclosure, or disk controller)
   */
  public static final AttributeKey<String> HW_PARENT = stringKey("hw.parent");

  /**
   * <a href="https://wikipedia.org/wiki/S.M.A.R.T.">S.M.A.R.T.</a> (Self-Monitoring, Analysis, and
   * Reporting Technology) attribute of the physical disk
   */
  public static final AttributeKey<String> HW_PHYSICAL_DISK_SMART_ATTRIBUTE =
      stringKey("hw.physical_disk.smart_attribute");

  /** State of the physical disk endurance utilization */
  public static final AttributeKey<String> HW_PHYSICAL_DISK_STATE =
      stringKey("hw.physical_disk.state");

  /** Type of the physical disk */
  public static final AttributeKey<String> HW_PHYSICAL_DISK_TYPE =
      stringKey("hw.physical_disk.type");

  /** Location of the sensor */
  public static final AttributeKey<String> HW_SENSOR_LOCATION = stringKey("hw.sensor_location");

  /** Serial number of the hardware component */
  public static final AttributeKey<String> HW_SERIAL_NUMBER = stringKey("hw.serial_number");

  /** The current state of the component */
  public static final AttributeKey<String> HW_STATE = stringKey("hw.state");

  /** Type of tape drive operation */
  public static final AttributeKey<String> HW_TAPE_DRIVE_OPERATION_TYPE =
      stringKey("hw.tape_drive.operation_type");

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

  /** Vendor name of the hardware component */
  public static final AttributeKey<String> HW_VENDOR = stringKey("hw.vendor");

  // Enum definitions

  /** Values for {@link #HW_BATTERY_STATE}. */
  public static final class HwBatteryStateIncubatingValues {
    /** Charging */
    public static final String CHARGING = "charging";

    /** Discharging */
    public static final String DISCHARGING = "discharging";

    private HwBatteryStateIncubatingValues() {}
  }

  /** Values for {@link #HW_GPU_TASK}. */
  public static final class HwGpuTaskIncubatingValues {
    /** Decoder */
    public static final String DECODER = "decoder";

    /** Encoder */
    public static final String ENCODER = "encoder";

    /** General */
    public static final String GENERAL = "general";

    private HwGpuTaskIncubatingValues() {}
  }

  /** Values for {@link #HW_LIMIT_TYPE}. */
  public static final class HwLimitTypeIncubatingValues {
    /** Critical */
    public static final String CRITICAL = "critical";

    /** Degraded */
    public static final String DEGRADED = "degraded";

    /** High Critical */
    public static final String HIGH_CRITICAL = "high.critical";

    /** High Degraded */
    public static final String HIGH_DEGRADED = "high.degraded";

    /** Low Critical */
    public static final String LOW_CRITICAL = "low.critical";

    /** Low Degraded */
    public static final String LOW_DEGRADED = "low.degraded";

    /** Maximum */
    public static final String MAX = "max";

    /** Throttled */
    public static final String THROTTLED = "throttled";

    /** Turbo */
    public static final String TURBO = "turbo";

    private HwLimitTypeIncubatingValues() {}
  }

  /** Values for {@link #HW_LOGICAL_DISK_STATE}. */
  public static final class HwLogicalDiskStateIncubatingValues {
    /** Used */
    public static final String USED = "used";

    /** Free */
    public static final String FREE = "free";

    private HwLogicalDiskStateIncubatingValues() {}
  }

  /** Values for {@link #HW_PHYSICAL_DISK_STATE}. */
  public static final class HwPhysicalDiskStateIncubatingValues {
    /** Remaining */
    public static final String REMAINING = "remaining";

    private HwPhysicalDiskStateIncubatingValues() {}
  }

  /** Values for {@link #HW_STATE}. */
  public static final class HwStateIncubatingValues {
    /** Degraded */
    public static final String DEGRADED = "degraded";

    /** Failed */
    public static final String FAILED = "failed";

    /** Needs Cleaning */
    public static final String NEEDS_CLEANING = "needs_cleaning";

    /** OK */
    public static final String OK = "ok";

    /** Predicted Failure */
    public static final String PREDICTED_FAILURE = "predicted_failure";

    private HwStateIncubatingValues() {}
  }

  /** Values for {@link #HW_TAPE_DRIVE_OPERATION_TYPE}. */
  public static final class HwTapeDriveOperationTypeIncubatingValues {
    /** Mount */
    public static final String MOUNT = "mount";

    /** Unmount */
    public static final String UNMOUNT = "unmount";

    /** Clean */
    public static final String CLEAN = "clean";

    private HwTapeDriveOperationTypeIncubatingValues() {}
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
