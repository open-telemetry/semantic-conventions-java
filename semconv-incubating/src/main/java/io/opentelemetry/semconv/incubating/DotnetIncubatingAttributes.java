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
public final class DotnetIncubatingAttributes {
  /**
   * Name of the garbage collector managed heap generation.
   *
   * <p>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.DotnetAttributes#DOTNET_GC_HEAP_GENERATION} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> DOTNET_GC_HEAP_GENERATION =
      stringKey("dotnet.gc.heap.generation");

  // Enum definitions
  /**
   * Values for {@link #DOTNET_GC_HEAP_GENERATION}.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.DotnetAttributes.DotnetGcHeapGenerationValues}.
   */
  @Deprecated
  public static final class DotnetGcHeapGenerationIncubatingValues {
    /** Generation 0 */
    public static final String GEN0 = "gen0";

    /** Generation 1 */
    public static final String GEN1 = "gen1";

    /** Generation 2 */
    public static final String GEN2 = "gen2";

    /** Large Object Heap */
    public static final String LOH = "loh";

    /** Pinned Object Heap */
    public static final String POH = "poh";

    private DotnetGcHeapGenerationIncubatingValues() {}
  }

  private DotnetIncubatingAttributes() {}
}
