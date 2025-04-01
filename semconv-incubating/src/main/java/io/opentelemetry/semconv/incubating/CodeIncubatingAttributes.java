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

  /**
   * Deprecated, use {@code code.file.path} instead
   *
   * @deprecated Replaced by {@code code.file.path}
   */
  @Deprecated public static final AttributeKey<String> CODE_FILEPATH = stringKey("code.filepath");

  /**
   * Deprecated, use {@code code.function.name} instead
   *
   * @deprecated Replaced by {@code code.function.name}
   */
  @Deprecated public static final AttributeKey<String> CODE_FUNCTION = stringKey("code.function");

  /**
   * The method or function fully-qualified name without arguments. The value should fit the natural
   * representation of the language runtime, which is also likely the same used within {@code
   * code.stacktrace} attribute value.
   *
   * <p>Notes:
   *
   * <p>Values and format depends on each language runtime, thus it is impossible to provide an
   * exhaustive list of examples. The values are usually the same (or prefixes of) the ones found in
   * native stack trace representation stored in {@code code.stacktrace} without information on
   * arguments.
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>Java method: {@code com.example.MyHttpService.serveRequest}
   *   <li>Java anonymous class method: {@code com.mycompany.Main$1.myMethod}
   *   <li>Java lambda method: {@code com.mycompany.Main$$Lambda/0x0000748ae4149c00.myMethod}
   *   <li>PHP function: `GuzzleHttp\Client::transfer
   *   <li>Go function: {@code github.com/my/repo/pkg.foo.func5}
   *   <li>Elixir: {@code OpenTelemetry.Ctx.new}
   *   <li>Erlang: {@code opentelemetry_ctx:new}
   *   <li>Rust: {@code playground::my_module::my_cool_func}
   *   <li>C function: {@code fopen}
   * </ul>
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
   * Deprecated, namespace is now included into {@code code.function.name}
   *
   * @deprecated Value should be included in {@code code.function.name} which is expected to be a
   *     fully-qualified name.
   */
  @Deprecated public static final AttributeKey<String> CODE_NAMESPACE = stringKey("code.namespace");

  /**
   * A stacktrace as a string in the natural representation for the language runtime. The
   * representation is identical to <a
   * href="/docs/exceptions/exceptions-spans.md#stacktrace-representation">{@code
   * exception.stacktrace}</a>.
   */
  public static final AttributeKey<String> CODE_STACKTRACE = stringKey("code.stacktrace");

  // Enum definitions

  private CodeIncubatingAttributes() {}
}
