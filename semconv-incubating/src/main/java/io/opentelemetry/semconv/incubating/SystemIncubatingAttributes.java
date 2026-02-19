/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class SystemIncubatingAttributes {
  /**
   * Deprecated, use {@code cpu.logical_number} instead.
   *
   * @deprecated Replaced by {@code cpu.logical_number}.
   */
  @Deprecated
  public static final AttributeKey<Long> SYSTEM_CPU_LOGICAL_NUMBER =
      longKey("system.cpu.logical_number");

  /**
   * Deprecated, use {@code cpu.mode} instead.
   *
   * @deprecated Replaced by {@code cpu.mode}.
   */
  @Deprecated
  public static final AttributeKey<String> SYSTEM_CPU_STATE = stringKey("system.cpu.state");

  /** The device identifier */
  public static final AttributeKey<String> SYSTEM_DEVICE = stringKey("system.device");

  /** The filesystem mode */
  public static final AttributeKey<String> SYSTEM_FILESYSTEM_MODE =
      stringKey("system.filesystem.mode");

  /** The filesystem mount path */
  public static final AttributeKey<String> SYSTEM_FILESYSTEM_MOUNTPOINT =
      stringKey("system.filesystem.mountpoint");

  /** The filesystem state */
  public static final AttributeKey<String> SYSTEM_FILESYSTEM_STATE =
      stringKey("system.filesystem.state");

  /** The filesystem type */
  public static final AttributeKey<String> SYSTEM_FILESYSTEM_TYPE =
      stringKey("system.filesystem.type");

  /** The Linux Slab memory state */
  public static final AttributeKey<String> SYSTEM_MEMORY_LINUX_SLAB_STATE =
      stringKey("system.memory.linux.slab.state");

  /** The memory state */
  public static final AttributeKey<String> SYSTEM_MEMORY_STATE = stringKey("system.memory.state");

  /**
   * Deprecated, use {@code network.connection.state} instead.
   *
   * @deprecated Replaced by {@code network.connection.state}.
   */
  @Deprecated
  public static final AttributeKey<String> SYSTEM_NETWORK_STATE = stringKey("system.network.state");

  /** The paging access direction */
  public static final AttributeKey<String> SYSTEM_PAGING_DIRECTION =
      stringKey("system.paging.direction");

  /** The paging fault type */
  public static final AttributeKey<String> SYSTEM_PAGING_FAULT_TYPE =
      stringKey("system.paging.fault.type");

  /** The memory paging state */
  public static final AttributeKey<String> SYSTEM_PAGING_STATE = stringKey("system.paging.state");

  /**
   * Deprecated, use {@code system.paging.fault.type} instead.
   *
   * @deprecated Replaced by {@code system.paging.fault.type}.
   */
  @Deprecated
  public static final AttributeKey<String> SYSTEM_PAGING_TYPE = stringKey("system.paging.type");

  /**
   * Deprecated, use {@code process.state} instead.
   *
   * @deprecated Replaced by {@code process.state}.
   */
  @Deprecated
  public static final AttributeKey<String> SYSTEM_PROCESS_STATUS =
      stringKey("system.process.status");

  /**
   * Deprecated, use {@code process.state} instead.
   *
   * @deprecated Replaced by {@code process.state}.
   */
  @Deprecated
  public static final AttributeKey<String> SYSTEM_PROCESSES_STATUS =
      stringKey("system.processes.status");

  // Enum definitions

  /**
   * Values for {@link #SYSTEM_CPU_STATE}
   *
   * @deprecated Replaced by {@code cpu.mode}.
   */
  @Deprecated
  public static final class SystemCpuStateIncubatingValues {
    /** user. */
    public static final String USER = "user";

    /** system. */
    public static final String SYSTEM = "system";

    /** nice. */
    public static final String NICE = "nice";

    /** idle. */
    public static final String IDLE = "idle";

    /** iowait. */
    public static final String IOWAIT = "iowait";

    /** interrupt. */
    public static final String INTERRUPT = "interrupt";

    /** steal. */
    public static final String STEAL = "steal";

    private SystemCpuStateIncubatingValues() {}
  }

  /** Values for {@link #SYSTEM_FILESYSTEM_STATE}. */
  public static final class SystemFilesystemStateIncubatingValues {
    /** used. */
    public static final String USED = "used";

    /** free. */
    public static final String FREE = "free";

    /** reserved. */
    public static final String RESERVED = "reserved";

    private SystemFilesystemStateIncubatingValues() {}
  }

  /** Values for {@link #SYSTEM_FILESYSTEM_TYPE}. */
  public static final class SystemFilesystemTypeIncubatingValues {
    /** fat32. */
    public static final String FAT32 = "fat32";

    /** exfat. */
    public static final String EXFAT = "exfat";

    /** ntfs. */
    public static final String NTFS = "ntfs";

    /** refs. */
    public static final String REFS = "refs";

    /** hfsplus. */
    public static final String HFSPLUS = "hfsplus";

    /** ext4. */
    public static final String EXT4 = "ext4";

    private SystemFilesystemTypeIncubatingValues() {}
  }

  /** Values for {@link #SYSTEM_MEMORY_LINUX_SLAB_STATE}. */
  public static final class SystemMemoryLinuxSlabStateIncubatingValues {
    /** reclaimable. */
    public static final String RECLAIMABLE = "reclaimable";

    /** unreclaimable. */
    public static final String UNRECLAIMABLE = "unreclaimable";

    private SystemMemoryLinuxSlabStateIncubatingValues() {}
  }

  /** Values for {@link #SYSTEM_MEMORY_STATE}. */
  public static final class SystemMemoryStateIncubatingValues {
    /** Actual used virtual memory in bytes. */
    public static final String USED = "used";

    /** free. */
    public static final String FREE = "free";

    /**
     * shared.
     *
     * @deprecated Removed, report shared memory usage with {@code
     *     metric.system.memory.linux.shared} metric
     */
    @Deprecated public static final String SHARED = "shared";

    /** buffers. */
    public static final String BUFFERS = "buffers";

    /** cached. */
    public static final String CACHED = "cached";

    private SystemMemoryStateIncubatingValues() {}
  }

  /**
   * Values for {@link #SYSTEM_NETWORK_STATE}
   *
   * @deprecated Replaced by {@code network.connection.state}.
   */
  @Deprecated
  public static final class SystemNetworkStateIncubatingValues {
    /** close. */
    public static final String CLOSE = "close";

    /** close_wait. */
    public static final String CLOSE_WAIT = "close_wait";

    /** closing. */
    public static final String CLOSING = "closing";

    /** delete. */
    public static final String DELETE = "delete";

    /** established. */
    public static final String ESTABLISHED = "established";

    /** fin_wait_1. */
    public static final String FIN_WAIT_1 = "fin_wait_1";

    /** fin_wait_2. */
    public static final String FIN_WAIT_2 = "fin_wait_2";

    /** last_ack. */
    public static final String LAST_ACK = "last_ack";

    /** listen. */
    public static final String LISTEN = "listen";

    /** syn_recv. */
    public static final String SYN_RECV = "syn_recv";

    /** syn_sent. */
    public static final String SYN_SENT = "syn_sent";

    /** time_wait. */
    public static final String TIME_WAIT = "time_wait";

    private SystemNetworkStateIncubatingValues() {}
  }

  /** Values for {@link #SYSTEM_PAGING_DIRECTION}. */
  public static final class SystemPagingDirectionIncubatingValues {
    /** in. */
    public static final String IN = "in";

    /** out. */
    public static final String OUT = "out";

    private SystemPagingDirectionIncubatingValues() {}
  }

  /** Values for {@link #SYSTEM_PAGING_FAULT_TYPE}. */
  public static final class SystemPagingFaultTypeIncubatingValues {
    /** major. */
    public static final String MAJOR = "major";

    /** minor. */
    public static final String MINOR = "minor";

    private SystemPagingFaultTypeIncubatingValues() {}
  }

  /** Values for {@link #SYSTEM_PAGING_STATE}. */
  public static final class SystemPagingStateIncubatingValues {
    /** used. */
    public static final String USED = "used";

    /** free. */
    public static final String FREE = "free";

    private SystemPagingStateIncubatingValues() {}
  }

  /**
   * Values for {@link #SYSTEM_PAGING_TYPE}
   *
   * @deprecated Replaced by {@code system.paging.fault.type}.
   */
  @Deprecated
  public static final class SystemPagingTypeIncubatingValues {
    /** major. */
    public static final String MAJOR = "major";

    /** minor. */
    public static final String MINOR = "minor";

    private SystemPagingTypeIncubatingValues() {}
  }

  /**
   * Values for {@link #SYSTEM_PROCESS_STATUS}
   *
   * @deprecated Replaced by {@code process.state}.
   */
  @Deprecated
  public static final class SystemProcessStatusIncubatingValues {
    /** running. */
    public static final String RUNNING = "running";

    /** sleeping. */
    public static final String SLEEPING = "sleeping";

    /** stopped. */
    public static final String STOPPED = "stopped";

    /** defunct. */
    public static final String DEFUNCT = "defunct";

    private SystemProcessStatusIncubatingValues() {}
  }

  /**
   * Values for {@link #SYSTEM_PROCESSES_STATUS}
   *
   * @deprecated Replaced by {@code process.state}.
   */
  @Deprecated
  public static final class SystemProcessesStatusIncubatingValues {
    /** running. */
    public static final String RUNNING = "running";

    /** sleeping. */
    public static final String SLEEPING = "sleeping";

    /** stopped. */
    public static final String STOPPED = "stopped";

    /** defunct. */
    public static final String DEFUNCT = "defunct";

    private SystemProcessesStatusIncubatingValues() {}
  }

  private SystemIncubatingAttributes() {}
}
