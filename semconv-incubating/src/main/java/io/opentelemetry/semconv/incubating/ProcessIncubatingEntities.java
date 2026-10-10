/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEntities.java.j2
@SuppressWarnings("unused")
public final class ProcessIncubatingEntities {
  /** An operating system process. */
  public static final String PROCESS_TYPE = "process";

  /**
   * The executable of a process.
   *
   * <p>Notes:
   *
   * <p>Represents the executable file associated with a process. A single executable may be run my
   * multiple process instances.
   */
  public static final String PROCESS_EXECUTABLE_TYPE = "process.executable";

  /** The single (language) runtime instance which is monitored. */
  public static final String PROCESS_RUNTIME_TYPE = "process.runtime";

  private ProcessIncubatingEntities() {}
}
