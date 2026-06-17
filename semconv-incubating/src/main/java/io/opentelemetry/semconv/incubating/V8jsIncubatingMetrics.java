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

  /**
   * Name of the {@code v8js.heap.space.available_size} metric.
   *
   * @deprecated Replaced by {@code v8js.memory.heap.space.available_size}.
   */
  @Deprecated
  public static final String V8JS_HEAP_SPACE_AVAILABLE_SIZE_NAME = "v8js.heap.space.available_size";

  /**
   * Unit of the {@code v8js.heap.space.available_size} metric.
   *
   * @deprecated Replaced by {@code v8js.memory.heap.space.available_size}.
   */
  @Deprecated public static final String V8JS_HEAP_SPACE_AVAILABLE_SIZE_UNIT = "By";

  /**
   * Description of the {@code v8js.heap.space.available_size} metric.
   *
   * @deprecated Replaced by {@code v8js.memory.heap.space.available_size}.
   */
  @Deprecated
  public static final String V8JS_HEAP_SPACE_AVAILABLE_SIZE_DESCRIPTION =
      "Deprecated, use `v8js.memory.heap.space.available_size` instead.";

  /**
   * Name of the {@code v8js.heap.space.physical_size} metric.
   *
   * @deprecated Replaced by {@code v8js.memory.heap.space.physical_size}.
   */
  @Deprecated
  public static final String V8JS_HEAP_SPACE_PHYSICAL_SIZE_NAME = "v8js.heap.space.physical_size";

  /**
   * Unit of the {@code v8js.heap.space.physical_size} metric.
   *
   * @deprecated Replaced by {@code v8js.memory.heap.space.physical_size}.
   */
  @Deprecated public static final String V8JS_HEAP_SPACE_PHYSICAL_SIZE_UNIT = "By";

  /**
   * Description of the {@code v8js.heap.space.physical_size} metric.
   *
   * @deprecated Replaced by {@code v8js.memory.heap.space.physical_size}.
   */
  @Deprecated
  public static final String V8JS_HEAP_SPACE_PHYSICAL_SIZE_DESCRIPTION =
      "Deprecated, use `v8js.memory.heap.space.physical_size` instead.";

  /**
   * Name of the {@code v8js.memory.heap.limit} metric.
   *
   * @deprecated Replaced by {@code v8js.memory.heap.space.size}.
   */
  @Deprecated public static final String V8JS_MEMORY_HEAP_LIMIT_NAME = "v8js.memory.heap.limit";

  /**
   * Unit of the {@code v8js.memory.heap.limit} metric.
   *
   * @deprecated Replaced by {@code v8js.memory.heap.space.size}.
   */
  @Deprecated public static final String V8JS_MEMORY_HEAP_LIMIT_UNIT = "By";

  /**
   * Description of the {@code v8js.memory.heap.limit} metric.
   *
   * @deprecated Replaced by {@code v8js.memory.heap.space.size}.
   */
  @Deprecated
  public static final String V8JS_MEMORY_HEAP_LIMIT_DESCRIPTION =
      "Deprecated, use `v8js.memory.heap.space.size` instead.";

  /** Name of the {@code v8js.memory.heap.space.available_size} metric. */
  public static final String V8JS_MEMORY_HEAP_SPACE_AVAILABLE_SIZE_NAME =
      "v8js.memory.heap.space.available_size";

  /** Unit of the {@code v8js.memory.heap.space.available_size} metric. */
  public static final String V8JS_MEMORY_HEAP_SPACE_AVAILABLE_SIZE_UNIT = "By";

  /** Description of the {@code v8js.memory.heap.space.available_size} metric. */
  public static final String V8JS_MEMORY_HEAP_SPACE_AVAILABLE_SIZE_DESCRIPTION =
      "Heap space available size.";

  /** Name of the {@code v8js.memory.heap.space.physical_size} metric. */
  public static final String V8JS_MEMORY_HEAP_SPACE_PHYSICAL_SIZE_NAME =
      "v8js.memory.heap.space.physical_size";

  /** Unit of the {@code v8js.memory.heap.space.physical_size} metric. */
  public static final String V8JS_MEMORY_HEAP_SPACE_PHYSICAL_SIZE_UNIT = "By";

  /** Description of the {@code v8js.memory.heap.space.physical_size} metric. */
  public static final String V8JS_MEMORY_HEAP_SPACE_PHYSICAL_SIZE_DESCRIPTION =
      "Committed size of a heap space.";

  /** Name of the {@code v8js.memory.heap.space.size} metric. */
  public static final String V8JS_MEMORY_HEAP_SPACE_SIZE_NAME = "v8js.memory.heap.space.size";

  /** Unit of the {@code v8js.memory.heap.space.size} metric. */
  public static final String V8JS_MEMORY_HEAP_SPACE_SIZE_UNIT = "By";

  /** Description of the {@code v8js.memory.heap.space.size} metric. */
  public static final String V8JS_MEMORY_HEAP_SPACE_SIZE_DESCRIPTION =
      "Total heap memory size pre-allocated for a heap space.";

  /** Name of the {@code v8js.memory.heap.used} metric. */
  public static final String V8JS_MEMORY_HEAP_USED_NAME = "v8js.memory.heap.used";

  /** Unit of the {@code v8js.memory.heap.used} metric. */
  public static final String V8JS_MEMORY_HEAP_USED_UNIT = "By";

  /** Description of the {@code v8js.memory.heap.used} metric. */
  public static final String V8JS_MEMORY_HEAP_USED_DESCRIPTION = "Heap Memory size allocated.";

  /** Name of the {@code v8js.resource.active} metric. */
  public static final String V8JS_RESOURCE_ACTIVE_NAME = "v8js.resource.active";

  /** Unit of the {@code v8js.resource.active} metric. */
  public static final String V8JS_RESOURCE_ACTIVE_UNIT = "{resource}";

  /** Description of the {@code v8js.resource.active} metric. */
  public static final String V8JS_RESOURCE_ACTIVE_DESCRIPTION =
      "Gauge of the active resources that are currently keeping the event loop alive.";

  private V8jsIncubatingMetrics() {}
}
