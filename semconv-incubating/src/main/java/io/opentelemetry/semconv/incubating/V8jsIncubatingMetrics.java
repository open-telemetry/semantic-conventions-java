/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class V8jsIncubatingMetrics {

  /** Name of the {@code v8js.gc.duration} metric. */
  public static final String V8JS_GC_DURATION_NAME = "v8js.gc.duration";

  /** Unit of the {@code v8js.gc.duration} metric. */
  public static final String V8JS_GC_DURATION_UNIT = "s";

  /** Description of the {@code v8js.gc.duration} metric. */
  public static final String V8JS_GC_DURATION_DESCRIPTION = "Garbage collection duration.";

  /** Name of the {@code v8js.heap.space.available_size} metric. */
  public static final String V8JS_HEAP_SPACE_AVAILABLE_SIZE_NAME = "v8js.heap.space.available_size";

  /** Unit of the {@code v8js.heap.space.available_size} metric. */
  public static final String V8JS_HEAP_SPACE_AVAILABLE_SIZE_UNIT = "By";

  /** Description of the {@code v8js.heap.space.available_size} metric. */
  public static final String V8JS_HEAP_SPACE_AVAILABLE_SIZE_DESCRIPTION =
      "Heap space available size.";

  /** Name of the {@code v8js.heap.space.physical_size} metric. */
  public static final String V8JS_HEAP_SPACE_PHYSICAL_SIZE_NAME = "v8js.heap.space.physical_size";

  /** Unit of the {@code v8js.heap.space.physical_size} metric. */
  public static final String V8JS_HEAP_SPACE_PHYSICAL_SIZE_UNIT = "By";

  /** Description of the {@code v8js.heap.space.physical_size} metric. */
  public static final String V8JS_HEAP_SPACE_PHYSICAL_SIZE_DESCRIPTION =
      "Committed size of a heap space.";

  /** Name of the {@code v8js.memory.heap.limit} metric. */
  public static final String V8JS_MEMORY_HEAP_LIMIT_NAME = "v8js.memory.heap.limit";

  /** Unit of the {@code v8js.memory.heap.limit} metric. */
  public static final String V8JS_MEMORY_HEAP_LIMIT_UNIT = "By";

  /** Description of the {@code v8js.memory.heap.limit} metric. */
  public static final String V8JS_MEMORY_HEAP_LIMIT_DESCRIPTION =
      "Total heap memory size pre-allocated.";

  /** Name of the {@code v8js.memory.heap.used} metric. */
  public static final String V8JS_MEMORY_HEAP_USED_NAME = "v8js.memory.heap.used";

  /** Unit of the {@code v8js.memory.heap.used} metric. */
  public static final String V8JS_MEMORY_HEAP_USED_UNIT = "By";

  /** Description of the {@code v8js.memory.heap.used} metric. */
  public static final String V8JS_MEMORY_HEAP_USED_DESCRIPTION = "Heap Memory size allocated.";

  private V8jsIncubatingMetrics() {}
}
