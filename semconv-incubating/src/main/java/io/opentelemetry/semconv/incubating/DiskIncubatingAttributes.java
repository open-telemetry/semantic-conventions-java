
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
public final class DiskIncubatingAttributes {

  /**
  * The disk IO operation direction.
  *
  */
  public static final AttributeKey<String> DISK_IO_DIRECTION = stringKey("disk.io.direction");
  // Enum definitions
  /**
  * Values for {@link #DISK_IO_DIRECTION}.
  *
  */
  public static final class DiskIoDirectionValues {
      /** read. */
      public static final String READ = "read";
      /** write. */
      public static final String WRITE = "write";

      private DiskIoDirectionValues() {}
  }

  private DiskIncubatingAttributes() {}
}