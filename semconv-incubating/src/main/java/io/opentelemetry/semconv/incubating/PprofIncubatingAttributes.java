/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class PprofIncubatingAttributes {
  /**
   * Provides an indication that multiple symbols map to this location's address, for example due to
   * identical code folding by the linker. In that case the line information represents one of the
   * multiple symbols. This field must be recomputed when the symbolization state of the profile
   * changes.
   */
  public static final AttributeKey<Boolean> PPROF_LOCATION_IS_FOLDED =
      booleanKey("pprof.location.is_folded");

  /** Indicates that there are filenames related to this mapping. */
  public static final AttributeKey<Boolean> PPROF_MAPPING_HAS_FILENAMES =
      booleanKey("pprof.mapping.has_filenames");

  /** Indicates that there are functions related to this mapping. */
  public static final AttributeKey<Boolean> PPROF_MAPPING_HAS_FUNCTIONS =
      booleanKey("pprof.mapping.has_functions");

  /** Indicates that there are inline frames related to this mapping. */
  public static final AttributeKey<Boolean> PPROF_MAPPING_HAS_INLINE_FRAMES =
      booleanKey("pprof.mapping.has_inline_frames");

  /** Indicates that there are line numbers related to this mapping. */
  public static final AttributeKey<Boolean> PPROF_MAPPING_HAS_LINE_NUMBERS =
      booleanKey("pprof.mapping.has_line_numbers");

  /**
   * Free-form text associated with the profile. This field should not be used to store any
   * machine-readable information, it is only for human-friendly content.
   */
  public static final AttributeKey<List<String>> PPROF_PROFILE_COMMENT =
      stringArrayKey("pprof.profile.comment");

  // Enum definitions

  private PprofIncubatingAttributes() {}
}
