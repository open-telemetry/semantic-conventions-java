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
public final class LinuxIncubatingAttributes {
  /** The Linux Slab memory state */
  public static final AttributeKey<String> LINUX_MEMORY_SLAB_STATE =
      stringKey("linux.memory.slab.state");

  // Enum definitions

  /** Values for {@link #LINUX_MEMORY_SLAB_STATE}. */
  public static final class LinuxMemorySlabStateIncubatingValues {
    /** reclaimable. */
    public static final String RECLAIMABLE = "reclaimable";

    /** unreclaimable. */
    public static final String UNRECLAIMABLE = "unreclaimable";

    private LinuxMemorySlabStateIncubatingValues() {}
  }

  private LinuxIncubatingAttributes() {}
}
