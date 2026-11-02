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
  /** The CPU architecture the host system is running on. */
  public static final AttributeKey<String> HOST_ARCH = stringKey("host.arch");

  /** The amount of level 2 memory cache available to the processor (in Bytes). */
  public static final AttributeKey<Long> HOST_CPU_CACHE_L2_SIZE = longKey("host.cpu.cache.l2.size");

  /** Family or generation of the CPU. */
  public static final AttributeKey<String> HOST_CPU_FAMILY = stringKey("host.cpu.family");

  /**
   * Model identifier. It provides more granular information about the CPU, distinguishing it from
   * other CPUs within the same family.
   */
  public static final AttributeKey<String> HOST_CPU_MODEL_ID = stringKey("host.cpu.model.id");

  /** Model designation of the processor. */
  public static final AttributeKey<String> HOST_CPU_MODEL_NAME = stringKey("host.cpu.model.name");

  /** Stepping or core revisions. */
  public static final AttributeKey<String> HOST_CPU_STEPPING = stringKey("host.cpu.stepping");

  /**
   * Processor manufacturer identifier. A maximum 12-character string.
   *
   * <p>Notes:
   *
   * <p><a href="https://wiki.osdev.org/CPUID">CPUID</a> command returns the vendor ID string in
   * EBX, EDX and ECX registers. Writing these to memory in this order results in a 12-character
   * string.
   */
  public static final AttributeKey<String> HOST_CPU_VENDOR_ID = stringKey("host.cpu.vendor.id");

  /**
   * Unique host ID, determined by the first matching source in the priority order.
   *
   * <p>Notes:
   *
   * <p>SHOULD be determined using the first available source from the following priority tiers:
   *
   * <ol>
   *   <li>Known cloud vendors - cloud instance ID
   *   <li>Known VM vendors - provider VM ID
   *   <li>OS-dependent machine ID
   *   <li>User-provided value
   * </ol>
   *
   * <p>The value SHOULD conform to the following properties:
   *
   * <ul>
   *   <li><strong>Unique</strong> within a given context;
   *   <li><strong><a
   *       href="https://opentelemetry.io/docs/specs/otel/entities/data-model/#repeatable-identity">Repeatable</a></strong>
   *       - multiple observers on the same host come up with the same value;
   *   <li><strong>Persistent</strong> - survives host restarts and software updates.
   * </ul>
   *
   * <p><strong>Collecting {@code host.id} From Known Environments:</strong> When {@code host.id} is
   * derived from a cloud vendor instance ID, the resource SHOULD also carry the corresponding
   * {@code cloud.provider} and {@code cloud.platform} attributes so that the source of the {@code
   * host.id} value can be unambiguously determined.
   *
   * <p>The following cloud environments are currently recognized:
   *
   * <p>| Environment | {@code host.id} source | {@code cloud.provider} | {@code cloud.platform} | |
   * --- | --- | --- | --- | | AWS EC2 | EC2 instance ID | {@code aws} | {@code aws_ec2} | | AWS EKS
   * (node) | EC2 instance ID | {@code aws} | {@code aws_eks} | | Azure VM | {@code vmId} | {@code
   * azure} | {@code azure.vm} | | GCP Compute Engine | GCE instance ID | {@code gcp} | {@code
   * gcp_compute_engine} | | GCP GKE (node) | GCE instance ID | {@code gcp} | {@code
   * gcp_kubernetes_engine} |
   *
   * <p>The listed {@code cloud.provider}/{@code cloud.platform} values are for example only. Refer
   * to the <a href="/docs/registry/attributes/cloud.md">{@code cloud}</a> attribute definitions for
   * the relevant set of values.
   *
   * <p><strong>Non-privileged Machine ID Lookup:</strong> When collecting {@code host.id} for
   * non-containerized systems, non-privileged lookups of the machine ID are preferred. SDK detector
   * implementations MUST use the sources listed below to obtain the machine ID.
   *
   * <p>| OS | Primary | Fallback | | --- | --- | --- | | Linux | contents of {@code
   * /etc/machine-id} | contents of {@code /var/lib/dbus/machine-id} | | BSD | contents of {@code
   * /etc/hostid} | output of {@code /bin/kenv -q smbios.system.uuid} | | macOS | {@code
   * IOPlatformUUID} line from the output of {@code /usr/sbin/ioreg -rd1 -c
   * "IOPlatformExpertDevice"} | - | | Windows | {@code MachineGuid} from registry {@code
   * HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Cryptography} | - |
   *
   * <p><strong>Privileged Machine ID Lookup:</strong> The {@code host.id} can be looked up using
   * privileged sources. For example, Linux systems can use the output of {@code dmidecode -t
   * system}, {@code dmidecode -t baseboard}, {@code dmidecode -t chassis}, or read the
   * corresponding data from the filesystem (e.g. {@code cat
   * /sys/devices/virtual/dmi/id/product_id}, {@code cat /sys/devices/virtual/dmi/id/product_uuid},
   * etc), however, SDK resource detector implementations MUST NOT collect {@code host.id} from
   * privileged sources. If privileged lookup of {@code host.id} is required, the value SHOULD be
   * injected via the {@code OTEL_RESOURCE_ATTRIBUTES} environment variable.
   *
   * <p><strong>Collecting {@code host.id} From User Configuration:</strong> If none of the above
   * sources yields a non-empty value, the implementation MAY be unable to determine {@code host.id}
   * automatically and SHOULD omit the attribute. In that case, the {@code host.id} can only be
   * provided through user configuration or other available manual options. Users SHOULD ensure that
   * the {@code host.id} value conforms to the properties stated above.
   */
  public static final AttributeKey<String> HOST_ID = stringKey("host.id");

  /** VM image ID or host OS image ID. For Cloud, this value is from the provider. */
  public static final AttributeKey<String> HOST_IMAGE_ID = stringKey("host.image.id");

  /** Name of the VM image or OS install the host was instantiated from. */
  public static final AttributeKey<String> HOST_IMAGE_NAME = stringKey("host.image.name");

  /**
   * The version string of the VM image or host OS as defined in <a
   * href="/docs/resource/README.md#version-attributes">Version Attributes</a>.
   */
  public static final AttributeKey<String> HOST_IMAGE_VERSION = stringKey("host.image.version");

  /**
   * Available IP addresses of the host, excluding loopback interfaces.
   *
   * <p>Notes:
   *
   * <p>IPv4 Addresses MUST be specified in dotted-quad notation. IPv6 addresses MUST be specified
   * in the <a href="https://www.rfc-editor.org/rfc/rfc5952.html">RFC 5952</a> format.
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
   * least significant.
   */
  public static final AttributeKey<List<String>> HOST_MAC = stringArrayKey("host.mac");

  /**
   * Name of the host. On UNIX systems, it may contain what the hostname command returns, or the
   * fully qualified hostname, or another name specified by the user.
   */
  public static final AttributeKey<String> HOST_NAME = stringKey("host.name");

  /** Type of host. For Cloud, this must be the machine type. */
  public static final AttributeKey<String> HOST_TYPE = stringKey("host.type");

  // Enum definitions

  /** Values for {@link #HOST_ARCH}. */
  public static final class HostArchIncubatingValues {
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

    private HostArchIncubatingValues() {}
  }

  private HostIncubatingAttributes() {}
}
