
/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.doubleKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;

import static io.opentelemetry.semconv.AttributeKeyTemplate.stringArrayKeyTemplate;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class OsIncubatingAttributes {

  /**
  * Unique identifier for a particular build or compilation of the operating system.
  *
  */
  public static final AttributeKey<String> OS_BUILDID = stringKey("os.build_id");

  /**
  * Human readable (not intended to be parsed) OS version information, like e.g. reported by {@code ver} or {@code lsb_release -a} commands.
  *
  */
  public static final AttributeKey<String> OS_DESCRIPTION = stringKey("os.description");

  /**
  * Human readable operating system name.
  *
  */
  public static final AttributeKey<String> OS_NAME = stringKey("os.name");

  /**
  * The operating system type.
  *
  */
  public static final AttributeKey<String> OS_TYPE = stringKey("os.type");

  /**
  * The version string of the operating system as defined in <a href="/docs/resource/README.md#version-attributes">Version Attributes</a>.
  *
  */
  public static final AttributeKey<String> OS_VERSION = stringKey("os.version");
  // Enum definitions
  /**
  * Values for {@link #OS_TYPE}.
  *
  */
  public static final class OsTypeValues {
      /** Microsoft Windows. */
      public static final String WINDOWS = "windows";
      /** Linux. */
      public static final String LINUX = "linux";
      /** Apple Darwin. */
      public static final String DARWIN = "darwin";
      /** FreeBSD. */
      public static final String FREEBSD = "freebsd";
      /** NetBSD. */
      public static final String NETBSD = "netbsd";
      /** OpenBSD. */
      public static final String OPENBSD = "openbsd";
      /** DragonFly BSD. */
      public static final String DRAGONFLYBSD = "dragonflybsd";
      /** HP-UX (Hewlett Packard Unix). */
      public static final String HPUX = "hpux";
      /** AIX (Advanced Interactive eXecutive). */
      public static final String AIX = "aix";
      /** SunOS, Oracle Solaris. */
      public static final String SOLARIS = "solaris";
      /** IBM z/OS. */
      public static final String ZOS = "z_os";

      private OsTypeValues() {}
  }

  private OsIncubatingAttributes() {}
}