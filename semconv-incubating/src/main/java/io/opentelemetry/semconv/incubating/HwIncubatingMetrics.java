/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class HwIncubatingMetrics {

  /** Name of the {@code hw.battery.charge} metric. */
  public static final String HW_BATTERY_CHARGE_NAME = "hw.battery.charge";

  /** Unit of the {@code hw.battery.charge} metric. */
  public static final String HW_BATTERY_CHARGE_UNIT = "1";

  /** Description of the {@code hw.battery.charge} metric. */
  public static final String HW_BATTERY_CHARGE_DESCRIPTION =
      "Remaining fraction of battery charge.";

  /** Name of the {@code hw.battery.charge.limit} metric. */
  public static final String HW_BATTERY_CHARGE_LIMIT_NAME = "hw.battery.charge.limit";

  /** Unit of the {@code hw.battery.charge.limit} metric. */
  public static final String HW_BATTERY_CHARGE_LIMIT_UNIT = "1";

  /** Description of the {@code hw.battery.charge.limit} metric. */
  public static final String HW_BATTERY_CHARGE_LIMIT_DESCRIPTION =
      "Lower limit of battery charge fraction to ensure proper operation.";

  /** Name of the {@code hw.battery.time_left} metric. */
  public static final String HW_BATTERY_TIME_LEFT_NAME = "hw.battery.time_left";

  /** Unit of the {@code hw.battery.time_left} metric. */
  public static final String HW_BATTERY_TIME_LEFT_UNIT = "s";

  /** Description of the {@code hw.battery.time_left} metric. */
  public static final String HW_BATTERY_TIME_LEFT_DESCRIPTION =
      "Time left before battery is completely charged or discharged.";

  /** Name of the {@code hw.cpu.speed} metric. */
  public static final String HW_CPU_SPEED_NAME = "hw.cpu.speed";

  /** Unit of the {@code hw.cpu.speed} metric. */
  public static final String HW_CPU_SPEED_UNIT = "Hz";

  /** Description of the {@code hw.cpu.speed} metric. */
  public static final String HW_CPU_SPEED_DESCRIPTION = "CPU current frequency.";

  /** Name of the {@code hw.cpu.speed.limit} metric. */
  public static final String HW_CPU_SPEED_LIMIT_NAME = "hw.cpu.speed.limit";

  /** Unit of the {@code hw.cpu.speed.limit} metric. */
  public static final String HW_CPU_SPEED_LIMIT_UNIT = "Hz";

  /** Description of the {@code hw.cpu.speed.limit} metric. */
  public static final String HW_CPU_SPEED_LIMIT_DESCRIPTION = "CPU maximum frequency.";

  /** Name of the {@code hw.energy} metric. */
  public static final String HW_ENERGY_NAME = "hw.energy";

  /** Unit of the {@code hw.energy} metric. */
  public static final String HW_ENERGY_UNIT = "J";

  /** Description of the {@code hw.energy} metric. */
  public static final String HW_ENERGY_DESCRIPTION = "Energy consumed by the component.";

  /** Name of the {@code hw.errors} metric. */
  public static final String HW_ERRORS_NAME = "hw.errors";

  /** Unit of the {@code hw.errors} metric. */
  public static final String HW_ERRORS_UNIT = "{error}";

  /** Description of the {@code hw.errors} metric. */
  public static final String HW_ERRORS_DESCRIPTION =
      "Number of errors encountered by the component.";

  /** Name of the {@code hw.fan.speed} metric. */
  public static final String HW_FAN_SPEED_NAME = "hw.fan.speed";

  /** Unit of the {@code hw.fan.speed} metric. */
  public static final String HW_FAN_SPEED_UNIT = "rpm";

  /** Description of the {@code hw.fan.speed} metric. */
  public static final String HW_FAN_SPEED_DESCRIPTION = "Fan speed in revolutions per minute.";

  /** Name of the {@code hw.fan.speed.limit} metric. */
  public static final String HW_FAN_SPEED_LIMIT_NAME = "hw.fan.speed.limit";

  /** Unit of the {@code hw.fan.speed.limit} metric. */
  public static final String HW_FAN_SPEED_LIMIT_UNIT = "rpm";

  /** Description of the {@code hw.fan.speed.limit} metric. */
  public static final String HW_FAN_SPEED_LIMIT_DESCRIPTION = "Speed limit in rpm.";

  /** Name of the {@code hw.fan.speed_ratio} metric. */
  public static final String HW_FAN_SPEED_RATIO_NAME = "hw.fan.speed_ratio";

  /** Unit of the {@code hw.fan.speed_ratio} metric. */
  public static final String HW_FAN_SPEED_RATIO_UNIT = "1";

  /** Description of the {@code hw.fan.speed_ratio} metric. */
  public static final String HW_FAN_SPEED_RATIO_DESCRIPTION =
      "Fan speed expressed as a fraction of its maximum speed.";

  /** Name of the {@code hw.gpu.io} metric. */
  public static final String HW_GPU_IO_NAME = "hw.gpu.io";

  /** Unit of the {@code hw.gpu.io} metric. */
  public static final String HW_GPU_IO_UNIT = "By";

  /** Description of the {@code hw.gpu.io} metric. */
  public static final String HW_GPU_IO_DESCRIPTION = "Received and transmitted bytes by the GPU.";

  /** Name of the {@code hw.gpu.memory.limit} metric. */
  public static final String HW_GPU_MEMORY_LIMIT_NAME = "hw.gpu.memory.limit";

  /** Unit of the {@code hw.gpu.memory.limit} metric. */
  public static final String HW_GPU_MEMORY_LIMIT_UNIT = "By";

  /** Description of the {@code hw.gpu.memory.limit} metric. */
  public static final String HW_GPU_MEMORY_LIMIT_DESCRIPTION = "Size of the GPU memory.";

  /** Name of the {@code hw.gpu.memory.usage} metric. */
  public static final String HW_GPU_MEMORY_USAGE_NAME = "hw.gpu.memory.usage";

  /** Unit of the {@code hw.gpu.memory.usage} metric. */
  public static final String HW_GPU_MEMORY_USAGE_UNIT = "By";

  /** Description of the {@code hw.gpu.memory.usage} metric. */
  public static final String HW_GPU_MEMORY_USAGE_DESCRIPTION = "GPU memory used.";

  /** Name of the {@code hw.gpu.memory.utilization} metric. */
  public static final String HW_GPU_MEMORY_UTILIZATION_NAME = "hw.gpu.memory.utilization";

  /** Unit of the {@code hw.gpu.memory.utilization} metric. */
  public static final String HW_GPU_MEMORY_UTILIZATION_UNIT = "1";

  /** Description of the {@code hw.gpu.memory.utilization} metric. */
  public static final String HW_GPU_MEMORY_UTILIZATION_DESCRIPTION = "Fraction of GPU memory used.";

  /** Name of the {@code hw.gpu.utilization} metric. */
  public static final String HW_GPU_UTILIZATION_NAME = "hw.gpu.utilization";

  /** Unit of the {@code hw.gpu.utilization} metric. */
  public static final String HW_GPU_UTILIZATION_UNIT = "1";

  /** Description of the {@code hw.gpu.utilization} metric. */
  public static final String HW_GPU_UTILIZATION_DESCRIPTION =
      "Fraction of time spent in a specific task.";

  /** Name of the {@code hw.host.ambient_temperature} metric. */
  public static final String HW_HOST_AMBIENT_TEMPERATURE_NAME = "hw.host.ambient_temperature";

  /** Unit of the {@code hw.host.ambient_temperature} metric. */
  public static final String HW_HOST_AMBIENT_TEMPERATURE_UNIT = "Cel";

  /** Description of the {@code hw.host.ambient_temperature} metric. */
  public static final String HW_HOST_AMBIENT_TEMPERATURE_DESCRIPTION =
      "Ambient (external) temperature of the physical host.";

  /** Name of the {@code hw.host.energy} metric. */
  public static final String HW_HOST_ENERGY_NAME = "hw.host.energy";

  /** Unit of the {@code hw.host.energy} metric. */
  public static final String HW_HOST_ENERGY_UNIT = "J";

  /** Description of the {@code hw.host.energy} metric. */
  public static final String HW_HOST_ENERGY_DESCRIPTION =
      "Total energy consumed by the entire physical host, in joules.";

  /** Name of the {@code hw.host.heating_margin} metric. */
  public static final String HW_HOST_HEATING_MARGIN_NAME = "hw.host.heating_margin";

  /** Unit of the {@code hw.host.heating_margin} metric. */
  public static final String HW_HOST_HEATING_MARGIN_UNIT = "Cel";

  /** Description of the {@code hw.host.heating_margin} metric. */
  public static final String HW_HOST_HEATING_MARGIN_DESCRIPTION =
      "By how many degrees Celsius the temperature of the physical host can be increased, before reaching a warning threshold on one of the internal sensors. ";

  /** Name of the {@code hw.host.power} metric. */
  public static final String HW_HOST_POWER_NAME = "hw.host.power";

  /** Unit of the {@code hw.host.power} metric. */
  public static final String HW_HOST_POWER_UNIT = "W";

  /** Description of the {@code hw.host.power} metric. */
  public static final String HW_HOST_POWER_DESCRIPTION =
      "Instantaneous power consumed by the entire physical host in Watts (`hw.host.energy` is preferred). ";

  /** Name of the {@code hw.logical_disk.limit} metric. */
  public static final String HW_LOGICAL_DISK_LIMIT_NAME = "hw.logical_disk.limit";

  /** Unit of the {@code hw.logical_disk.limit} metric. */
  public static final String HW_LOGICAL_DISK_LIMIT_UNIT = "By";

  /** Description of the {@code hw.logical_disk.limit} metric. */
  public static final String HW_LOGICAL_DISK_LIMIT_DESCRIPTION = "Size of the logical disk.";

  /** Name of the {@code hw.logical_disk.usage} metric. */
  public static final String HW_LOGICAL_DISK_USAGE_NAME = "hw.logical_disk.usage";

  /** Unit of the {@code hw.logical_disk.usage} metric. */
  public static final String HW_LOGICAL_DISK_USAGE_UNIT = "By";

  /** Description of the {@code hw.logical_disk.usage} metric. */
  public static final String HW_LOGICAL_DISK_USAGE_DESCRIPTION = "Logical disk space usage.";

  /** Name of the {@code hw.logical_disk.utilization} metric. */
  public static final String HW_LOGICAL_DISK_UTILIZATION_NAME = "hw.logical_disk.utilization";

  /** Unit of the {@code hw.logical_disk.utilization} metric. */
  public static final String HW_LOGICAL_DISK_UTILIZATION_UNIT = "1";

  /** Description of the {@code hw.logical_disk.utilization} metric. */
  public static final String HW_LOGICAL_DISK_UTILIZATION_DESCRIPTION =
      "Logical disk space utilization as a fraction.";

  /** Name of the {@code hw.memory.size} metric. */
  public static final String HW_MEMORY_SIZE_NAME = "hw.memory.size";

  /** Unit of the {@code hw.memory.size} metric. */
  public static final String HW_MEMORY_SIZE_UNIT = "By";

  /** Description of the {@code hw.memory.size} metric. */
  public static final String HW_MEMORY_SIZE_DESCRIPTION = "Size of the memory module.";

  /** Name of the {@code hw.network.bandwidth.limit} metric. */
  public static final String HW_NETWORK_BANDWIDTH_LIMIT_NAME = "hw.network.bandwidth.limit";

  /** Unit of the {@code hw.network.bandwidth.limit} metric. */
  public static final String HW_NETWORK_BANDWIDTH_LIMIT_UNIT = "By/s";

  /** Description of the {@code hw.network.bandwidth.limit} metric. */
  public static final String HW_NETWORK_BANDWIDTH_LIMIT_DESCRIPTION = "Link speed.";

  /** Name of the {@code hw.network.bandwidth.utilization} metric. */
  public static final String HW_NETWORK_BANDWIDTH_UTILIZATION_NAME =
      "hw.network.bandwidth.utilization";

  /** Unit of the {@code hw.network.bandwidth.utilization} metric. */
  public static final String HW_NETWORK_BANDWIDTH_UTILIZATION_UNIT = "1";

  /** Description of the {@code hw.network.bandwidth.utilization} metric. */
  public static final String HW_NETWORK_BANDWIDTH_UTILIZATION_DESCRIPTION =
      "Utilization of the network bandwidth as a fraction.";

  /** Name of the {@code hw.network.io} metric. */
  public static final String HW_NETWORK_IO_NAME = "hw.network.io";

  /** Unit of the {@code hw.network.io} metric. */
  public static final String HW_NETWORK_IO_UNIT = "By";

  /** Description of the {@code hw.network.io} metric. */
  public static final String HW_NETWORK_IO_DESCRIPTION =
      "Received and transmitted network traffic in bytes.";

  /** Name of the {@code hw.network.packets} metric. */
  public static final String HW_NETWORK_PACKETS_NAME = "hw.network.packets";

  /** Unit of the {@code hw.network.packets} metric. */
  public static final String HW_NETWORK_PACKETS_UNIT = "{packet}";

  /** Description of the {@code hw.network.packets} metric. */
  public static final String HW_NETWORK_PACKETS_DESCRIPTION =
      "Received and transmitted network traffic in packets (or frames).";

  /** Name of the {@code hw.network.up} metric. */
  public static final String HW_NETWORK_UP_NAME = "hw.network.up";

  /** Unit of the {@code hw.network.up} metric. */
  public static final String HW_NETWORK_UP_UNIT = "1";

  /** Description of the {@code hw.network.up} metric. */
  public static final String HW_NETWORK_UP_DESCRIPTION = "Link status: `1` (up) or `0` (down).";

  /** Name of the {@code hw.physical_disk.endurance_utilization} metric. */
  public static final String HW_PHYSICAL_DISK_ENDURANCE_UTILIZATION_NAME =
      "hw.physical_disk.endurance_utilization";

  /** Unit of the {@code hw.physical_disk.endurance_utilization} metric. */
  public static final String HW_PHYSICAL_DISK_ENDURANCE_UTILIZATION_UNIT = "1";

  /** Description of the {@code hw.physical_disk.endurance_utilization} metric. */
  public static final String HW_PHYSICAL_DISK_ENDURANCE_UTILIZATION_DESCRIPTION =
      "Endurance remaining for this SSD disk.";

  /** Name of the {@code hw.physical_disk.size} metric. */
  public static final String HW_PHYSICAL_DISK_SIZE_NAME = "hw.physical_disk.size";

  /** Unit of the {@code hw.physical_disk.size} metric. */
  public static final String HW_PHYSICAL_DISK_SIZE_UNIT = "By";

  /** Description of the {@code hw.physical_disk.size} metric. */
  public static final String HW_PHYSICAL_DISK_SIZE_DESCRIPTION = "Size of the disk.";

  /** Name of the {@code hw.physical_disk.smart} metric. */
  public static final String HW_PHYSICAL_DISK_SMART_NAME = "hw.physical_disk.smart";

  /** Unit of the {@code hw.physical_disk.smart} metric. */
  public static final String HW_PHYSICAL_DISK_SMART_UNIT = "1";

  /** Description of the {@code hw.physical_disk.smart} metric. */
  public static final String HW_PHYSICAL_DISK_SMART_DESCRIPTION =
      "Value of the corresponding [S.M.A.R.T.](https://wikipedia.org/wiki/S.M.A.R.T.) (Self-Monitoring, Analysis, and Reporting Technology) attribute.";

  /** Name of the {@code hw.power} metric. */
  public static final String HW_POWER_NAME = "hw.power";

  /** Unit of the {@code hw.power} metric. */
  public static final String HW_POWER_UNIT = "W";

  /** Description of the {@code hw.power} metric. */
  public static final String HW_POWER_DESCRIPTION =
      "Instantaneous power consumed by the component.";

  /** Name of the {@code hw.power_supply.limit} metric. */
  public static final String HW_POWER_SUPPLY_LIMIT_NAME = "hw.power_supply.limit";

  /** Unit of the {@code hw.power_supply.limit} metric. */
  public static final String HW_POWER_SUPPLY_LIMIT_UNIT = "W";

  /** Description of the {@code hw.power_supply.limit} metric. */
  public static final String HW_POWER_SUPPLY_LIMIT_DESCRIPTION =
      "Maximum power output of the power supply.";

  /** Name of the {@code hw.power_supply.usage} metric. */
  public static final String HW_POWER_SUPPLY_USAGE_NAME = "hw.power_supply.usage";

  /** Unit of the {@code hw.power_supply.usage} metric. */
  public static final String HW_POWER_SUPPLY_USAGE_UNIT = "W";

  /** Description of the {@code hw.power_supply.usage} metric. */
  public static final String HW_POWER_SUPPLY_USAGE_DESCRIPTION =
      "Current power output of the power supply.";

  /** Name of the {@code hw.power_supply.utilization} metric. */
  public static final String HW_POWER_SUPPLY_UTILIZATION_NAME = "hw.power_supply.utilization";

  /** Unit of the {@code hw.power_supply.utilization} metric. */
  public static final String HW_POWER_SUPPLY_UTILIZATION_UNIT = "1";

  /** Description of the {@code hw.power_supply.utilization} metric. */
  public static final String HW_POWER_SUPPLY_UTILIZATION_DESCRIPTION =
      "Utilization of the power supply as a fraction of its maximum output.";

  /** Name of the {@code hw.status} metric. */
  public static final String HW_STATUS_NAME = "hw.status";

  /** Unit of the {@code hw.status} metric. */
  public static final String HW_STATUS_UNIT = "1";

  /** Description of the {@code hw.status} metric. */
  public static final String HW_STATUS_DESCRIPTION =
      "Operational status: `1` (true) or `0` (false) for each of the possible states.";

  /** Name of the {@code hw.tape_drive.operations} metric. */
  public static final String HW_TAPE_DRIVE_OPERATIONS_NAME = "hw.tape_drive.operations";

  /** Unit of the {@code hw.tape_drive.operations} metric. */
  public static final String HW_TAPE_DRIVE_OPERATIONS_UNIT = "{operation}";

  /** Description of the {@code hw.tape_drive.operations} metric. */
  public static final String HW_TAPE_DRIVE_OPERATIONS_DESCRIPTION =
      "Operations performed by the tape drive.";

  /** Name of the {@code hw.temperature} metric. */
  public static final String HW_TEMPERATURE_NAME = "hw.temperature";

  /** Unit of the {@code hw.temperature} metric. */
  public static final String HW_TEMPERATURE_UNIT = "Cel";

  /** Description of the {@code hw.temperature} metric. */
  public static final String HW_TEMPERATURE_DESCRIPTION = "Temperature in degrees Celsius.";

  /** Name of the {@code hw.temperature.limit} metric. */
  public static final String HW_TEMPERATURE_LIMIT_NAME = "hw.temperature.limit";

  /** Unit of the {@code hw.temperature.limit} metric. */
  public static final String HW_TEMPERATURE_LIMIT_UNIT = "Cel";

  /** Description of the {@code hw.temperature.limit} metric. */
  public static final String HW_TEMPERATURE_LIMIT_DESCRIPTION =
      "Temperature limit in degrees Celsius.";

  /** Name of the {@code hw.voltage} metric. */
  public static final String HW_VOLTAGE_NAME = "hw.voltage";

  /** Unit of the {@code hw.voltage} metric. */
  public static final String HW_VOLTAGE_UNIT = "V";

  /** Description of the {@code hw.voltage} metric. */
  public static final String HW_VOLTAGE_DESCRIPTION = "Voltage measured by the sensor.";

  /** Name of the {@code hw.voltage.limit} metric. */
  public static final String HW_VOLTAGE_LIMIT_NAME = "hw.voltage.limit";

  /** Unit of the {@code hw.voltage.limit} metric. */
  public static final String HW_VOLTAGE_LIMIT_UNIT = "V";

  /** Description of the {@code hw.voltage.limit} metric. */
  public static final String HW_VOLTAGE_LIMIT_DESCRIPTION = "Voltage limit in Volts.";

  /** Name of the {@code hw.voltage.nominal} metric. */
  public static final String HW_VOLTAGE_NOMINAL_NAME = "hw.voltage.nominal";

  /** Unit of the {@code hw.voltage.nominal} metric. */
  public static final String HW_VOLTAGE_NOMINAL_UNIT = "V";

  /** Description of the {@code hw.voltage.nominal} metric. */
  public static final String HW_VOLTAGE_NOMINAL_DESCRIPTION = "Nominal (expected) voltage.";

  private HwIncubatingMetrics() {}
}
