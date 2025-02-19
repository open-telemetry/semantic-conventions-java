/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class CodeIncubatingAttributes {
  /**
   * Deprecated, use {@code code.column.number}
   *
   * @deprecated Replaced by {@code code.column.number}
   */
  @Deprecated public static final AttributeKey<Long> CODE_COLUMN = longKey("code.column");

  /**
   * The column number in {@code code.file.path} best representing the operation. It SHOULD point
   * within the code unit named in {@code code.function.name}.
   */
  public static final AttributeKey<Long> CODE_COLUMN_NUMBER = longKey("code.column.number");

  /**
   * The source code file name that identifies the code unit as uniquely as possible (preferably an
   * absolute file path).
   */
  public static final AttributeKey<String> CODE_FILE_PATH = stringKey("code.file.path");

  /** Deprecated, use {@code code.file.path} instead */
  public static final AttributeKey<String> CODE_FILEPATH = stringKey("code.filepath");

  /**
   * Deprecated, use {@code code.function.name} instead
   *
   * @deprecated Replaced by {@code code.function.name}
   */
  @Deprecated public static final AttributeKey<String> CODE_FUNCTION = stringKey("code.function");

  /**
   * The method or function name, or equivalent (usually rightmost part of the code unit's name).
   */
  public static final AttributeKey<String> CODE_FUNCTION_NAME = stringKey("code.function.name");

  /**
   * The line number in {@code code.file.path} best representing the operation. It SHOULD point
   * within the code unit named in {@code code.function.name}.
   */
  public static final AttributeKey<Long> CODE_LINE_NUMBER = longKey("code.line.number");

  /**
   * Deprecated, use {@code code.line.number} instead
   *
   * @deprecated Replaced by {@code code.line.number}
   */
  @Deprecated public static final AttributeKey<Long> CODE_LINENO = longKey("code.lineno");

  /**
   * The "namespace" within which {@code code.function.name} is defined. Usually the qualified class
   * or module name, such that {@code code.namespace} + some separator + {@code code.function.name}
   * form a unique identifier for the code unit.
   */
  public static final AttributeKey<String> CODE_NAMESPACE = stringKey("code.namespace");

  /**
   * A stacktrace as a string in the natural representation for the language runtime. The
   * representation is to be determined and documented by each language SIG.
   */
  public static final AttributeKey<String> CODE_STACKTRACE = stringKey("code.stacktrace");

  // Enum definitions

  private CodeIncubatingAttributes() {}
}
