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
public final class DiskIncubatingAttributes {
  /** The disk IO operation direction. */
  public static final AttributeKey<String> DISK_IO_DIRECTION = stringKey("disk.io.direction");

  // Enum definitions
  /** Values for {@link #DISK_IO_DIRECTION}. */
  public static final class DiskIoDirectionIncubatingValues {
    /** read. */
    public static final String READ = "read";

    /** write. */
    public static final String WRITE = "write";

    private DiskIoDirectionIncubatingValues() {}
  }

  private DiskIncubatingAttributes() {}
}
