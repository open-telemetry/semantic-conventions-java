/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class CpythonIncubatingMetrics {

  /** Name of the {@code cpython.gc.collected_objects} metric. */
  public static final String CPYTHON_GC_COLLECTED_OBJECTS_NAME = "cpython.gc.collected_objects";

  /** Unit of the {@code cpython.gc.collected_objects} metric. */
  public static final String CPYTHON_GC_COLLECTED_OBJECTS_UNIT = "{object}";

  /** Description of the {@code cpython.gc.collected_objects} metric. */
  public static final String CPYTHON_GC_COLLECTED_OBJECTS_DESCRIPTION =
      "The total number of objects collected inside a generation since interpreter start.";

  /** Name of the {@code cpython.gc.collections} metric. */
  public static final String CPYTHON_GC_COLLECTIONS_NAME = "cpython.gc.collections";

  /** Unit of the {@code cpython.gc.collections} metric. */
  public static final String CPYTHON_GC_COLLECTIONS_UNIT = "{collection}";

  /** Description of the {@code cpython.gc.collections} metric. */
  public static final String CPYTHON_GC_COLLECTIONS_DESCRIPTION =
      "The number of times a generation was collected since interpreter start.";

  /** Name of the {@code cpython.gc.uncollectable_objects} metric. */
  public static final String CPYTHON_GC_UNCOLLECTABLE_OBJECTS_NAME =
      "cpython.gc.uncollectable_objects";

  /** Unit of the {@code cpython.gc.uncollectable_objects} metric. */
  public static final String CPYTHON_GC_UNCOLLECTABLE_OBJECTS_UNIT = "{object}";

  /** Description of the {@code cpython.gc.uncollectable_objects} metric. */
  public static final String CPYTHON_GC_UNCOLLECTABLE_OBJECTS_DESCRIPTION =
      "The total number of objects which were found to be uncollectable inside a generation since interpreter start.";

  private CpythonIncubatingMetrics() {}
}
