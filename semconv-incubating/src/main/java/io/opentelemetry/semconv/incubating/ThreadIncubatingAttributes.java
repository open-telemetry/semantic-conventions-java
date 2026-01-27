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
public final class ThreadIncubatingAttributes {
  /**
   * Current "managed" thread ID (as opposed to OS thread ID).
   *
   * <p>Notes:
   *
   * <p>Examples of where the value can be extracted from:
   *
   * <p>| Language or platform | Source | | --- | --- | | JVM | {@code
   * Thread.currentThread().threadId()} | | .NET | {@code Thread.CurrentThread.ManagedThreadId} | |
   * Python | {@code threading.current_thread().ident} | | Ruby | {@code Thread.current.object_id} |
   * | C++ | {@code std::this_thread::get_id()} | | Erlang | {@code erlang:self()} |
   */
  public static final AttributeKey<Long> THREAD_ID = longKey("thread.id");

  /**
   * Current thread name.
   *
   * <p>Notes:
   *
   * <p>Examples of where the value can be extracted from:
   *
   * <p>| Language or platform | Source | | --- | --- | | JVM | {@code
   * Thread.currentThread().getName()} | | .NET | {@code Thread.CurrentThread.Name} | | Python |
   * {@code threading.current_thread().name} | | Ruby | {@code Thread.current.name} | | Erlang |
   * {@code erlang:process_info(self(), registered_name)} |
   */
  public static final AttributeKey<String> THREAD_NAME = stringKey("thread.name");

  // Enum definitions

  private ThreadIncubatingAttributes() {}
}
