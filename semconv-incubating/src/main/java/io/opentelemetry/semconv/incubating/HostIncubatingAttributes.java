/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class HostIncubatingAttributes {
  /** The CPU architecture the host system is running on */
  public static final AttributeKey<String> HOST_ARCH = stringKey("host.arch");

  /** The amount of level 2 memory cache available to the processor (in Bytes) */
  public static final AttributeKey<Long> HOST_CPU_CACHE_L2_SIZE = longKey("host.cpu.cache.l2.size");

  /** Family or generation of the CPU */
  public static final AttributeKey<String> HOST_CPU_FAMILY = stringKey("host.cpu.family");

  /**
   * Model identifier. It provides more granular information about the CPU, distinguishing it from
   * other CPUs within the same family
   */
  public static final AttributeKey<String> HOST_CPU_MODEL_ID = stringKey("host.cpu.model.id");

  /** Model designation of the processor */
  public static final AttributeKey<String> HOST_CPU_MODEL_NAME = stringKey("host.cpu.model.name");

  /** Stepping or core revisions */
  public static final AttributeKey<String> HOST_CPU_STEPPING = stringKey("host.cpu.stepping");

  /**
   * Processor manufacturer identifier. A maximum 12-character string.
   *
   * <p>Notes:
   *
   * <p><a href="https://wiki.osdev.org/CPUID">CPUID</a> command returns the vendor ID string in
   * EBX, EDX and ECX registers. Writing these to memory in this order results in a 12-character
   * string
   */
  public static final AttributeKey<String> HOST_CPU_VENDOR_ID = stringKey("host.cpu.vendor.id");

  /**
   * Unique host ID. For Cloud, this must be the instance_id assigned by the cloud provider. For
   * non-containerized systems, this should be the {@code machine-id}. See the table below for the
   * sources to use to determine the {@code machine-id} based on operating system
   */
  public static final AttributeKey<String> HOST_ID = stringKey("host.id");

  /** VM image ID or host OS image ID. For Cloud, this value is from the provider */
  public static final AttributeKey<String> HOST_IMAGE_ID = stringKey("host.image.id");

  /** Name of the VM image or OS install the host was instantiated from */
  public static final AttributeKey<String> HOST_IMAGE_NAME = stringKey("host.image.name");

  /**
   * The version string of the VM image or host OS as defined in <a
   * href="/docs/resource/README.md#version-attributes">Version Attributes</a>
   */
  public static final AttributeKey<String> HOST_IMAGE_VERSION = stringKey("host.image.version");

  /**
   * Available IP addresses of the host, excluding loopback interfaces.
   *
   * <p>Notes:
   *
   * <p>IPv4 Addresses MUST be specified in dotted-quad notation. IPv6 addresses MUST be specified
   * in the <a href="https://www.rfc-editor.org/rfc/rfc5952.html">RFC 5952</a> format
   */
  public static final AttributeKey<List<String>> HOST_IP = stringArrayKey("host.ip");

  /**
   * Available MAC addresses of the host, excluding loopback interfaces.
   *
   * <p>Notes:
   *
   * <p>MAC Addresses MUST be represented in <a
   * href="https://standards.ieee.org/wp-content/uploads/import/documents/tutorials/eui.pdf">IEEE RA
   * hexadecimal form</a>: as hyphen-separated octets in uppercase hexadecimal form from most to
   * least significant
   */
  public static final AttributeKey<List<String>> HOST_MAC = stringArrayKey("host.mac");

  /**
   * Name of the host. On Unix systems, it may contain what the hostname command returns, or the
   * fully qualified hostname, or another name specified by the user
   */
  public static final AttributeKey<String> HOST_NAME = stringKey("host.name");

  /** Type of host. For Cloud, this must be the machine type */
  public static final AttributeKey<String> HOST_TYPE = stringKey("host.type");

  // Enum definitions
  /** Values for {@link #HOST_ARCH}. */
  public static final class HostArchValues {
    /** AMD64 */
    public static final String AMD64 = "amd64";

    /** ARM32 */
    public static final String ARM32 = "arm32";

    /** ARM64 */
    public static final String ARM64 = "arm64";

    /** Itanium */
    public static final String IA64 = "ia64";

    /** 32-bit PowerPC */
    public static final String PPC32 = "ppc32";

    /** 64-bit PowerPC */
    public static final String PPC64 = "ppc64";

    /** IBM z/Architecture */
    public static final String S390X = "s390x";

    /** 32-bit x86 */
    public static final String X86 = "x86";

    private HostArchValues() {}
  }

  private HostIncubatingAttributes() {}
}
