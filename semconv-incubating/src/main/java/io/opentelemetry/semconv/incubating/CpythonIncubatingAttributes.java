/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class CpythonIncubatingAttributes {
  /** Value of the garbage collector collection generation. */
  public static final AttributeKey<Long> CPYTHON_GC_GENERATION = longKey("cpython.gc.generation");

  // Enum definitions

  /** Values for {@link #CPYTHON_GC_GENERATION}. */
  public static final class CpythonGcGenerationIncubatingValues {
    /** Generation 0 */
    public static final long GENERATION_0 = 0;

    /** Generation 1 */
    public static final long GENERATION_1 = 1;

    /** Generation 2 */
    public static final long GENERATION_2 = 2;

    private CpythonGcGenerationIncubatingValues() {}
  }

  private CpythonIncubatingAttributes() {}
}
