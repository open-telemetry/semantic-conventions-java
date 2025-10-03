/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class GoIncubatingMetrics {

  /** Name of the {@code go.config.gogc} metric. */
  public static final String GO_CONFIG_GOGC_NAME = "go.config.gogc";

  /** Unit of the {@code go.config.gogc} metric. */
  public static final String GO_CONFIG_GOGC_UNIT = "%";

  /** Description of the {@code go.config.gogc} metric. */
  public static final String GO_CONFIG_GOGC_DESCRIPTION =
      "Heap size target percentage configured by the user, otherwise 100.";

  /** Name of the {@code go.goroutine.count} metric. */
  public static final String GO_GOROUTINE_COUNT_NAME = "go.goroutine.count";

  /** Unit of the {@code go.goroutine.count} metric. */
  public static final String GO_GOROUTINE_COUNT_UNIT = "{goroutine}";

  /** Description of the {@code go.goroutine.count} metric. */
  public static final String GO_GOROUTINE_COUNT_DESCRIPTION = "Count of live goroutines.";

  /** Name of the {@code go.memory.allocated} metric. */
  public static final String GO_MEMORY_ALLOCATED_NAME = "go.memory.allocated";

  /** Unit of the {@code go.memory.allocated} metric. */
  public static final String GO_MEMORY_ALLOCATED_UNIT = "By";

  /** Description of the {@code go.memory.allocated} metric. */
  public static final String GO_MEMORY_ALLOCATED_DESCRIPTION =
      "Memory allocated to the heap by the application.";

  /** Name of the {@code go.memory.allocations} metric. */
  public static final String GO_MEMORY_ALLOCATIONS_NAME = "go.memory.allocations";

  /** Unit of the {@code go.memory.allocations} metric. */
  public static final String GO_MEMORY_ALLOCATIONS_UNIT = "{allocation}";

  /** Description of the {@code go.memory.allocations} metric. */
  public static final String GO_MEMORY_ALLOCATIONS_DESCRIPTION =
      "Count of allocations to the heap by the application.";

  /** Name of the {@code go.memory.gc.goal} metric. */
  public static final String GO_MEMORY_GC_GOAL_NAME = "go.memory.gc.goal";

  /** Unit of the {@code go.memory.gc.goal} metric. */
  public static final String GO_MEMORY_GC_GOAL_UNIT = "By";

  /** Description of the {@code go.memory.gc.goal} metric. */
  public static final String GO_MEMORY_GC_GOAL_DESCRIPTION =
      "Heap size target for the end of the GC cycle.";

  /** Name of the {@code go.memory.limit} metric. */
  public static final String GO_MEMORY_LIMIT_NAME = "go.memory.limit";

  /** Unit of the {@code go.memory.limit} metric. */
  public static final String GO_MEMORY_LIMIT_UNIT = "By";

  /** Description of the {@code go.memory.limit} metric. */
  public static final String GO_MEMORY_LIMIT_DESCRIPTION =
      "Go runtime memory limit configured by the user, if a limit exists.";

  /** Name of the {@code go.memory.used} metric. */
  public static final String GO_MEMORY_USED_NAME = "go.memory.used";

  /** Unit of the {@code go.memory.used} metric. */
  public static final String GO_MEMORY_USED_UNIT = "By";

  /** Description of the {@code go.memory.used} metric. */
  public static final String GO_MEMORY_USED_DESCRIPTION = "Memory used by the Go runtime.";

  /** Name of the {@code go.processor.limit} metric. */
  public static final String GO_PROCESSOR_LIMIT_NAME = "go.processor.limit";

  /** Unit of the {@code go.processor.limit} metric. */
  public static final String GO_PROCESSOR_LIMIT_UNIT = "{thread}";

  /** Description of the {@code go.processor.limit} metric. */
  public static final String GO_PROCESSOR_LIMIT_DESCRIPTION =
      "The number of OS threads that can execute user-level Go code simultaneously.";

  /** Name of the {@code go.schedule.duration} metric. */
  public static final String GO_SCHEDULE_DURATION_NAME = "go.schedule.duration";

  /** Unit of the {@code go.schedule.duration} metric. */
  public static final String GO_SCHEDULE_DURATION_UNIT = "s";

  /** Description of the {@code go.schedule.duration} metric. */
  public static final String GO_SCHEDULE_DURATION_DESCRIPTION =
      "The time goroutines have spent in the scheduler in a runnable state before actually running.";

  private GoIncubatingMetrics() {}
}
