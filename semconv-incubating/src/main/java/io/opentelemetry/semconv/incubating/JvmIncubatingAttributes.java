/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class JvmIncubatingAttributes {
  /**
   * Name of the buffer pool.
   *
   * <p>Notes:
   *
   * <p>Pool names are generally obtained via <a
   * href="https://docs.oracle.com/en/java/javase/11/docs/api/java.management/java/lang/management/BufferPoolMXBean.html#getName()">BufferPoolMXBean#getName()</a>.
   */
  public static final AttributeKey<String> JVM_BUFFER_POOL_NAME = stringKey("jvm.buffer.pool.name");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes#JVM_GC_ACTION} attribute.
   */
  @Deprecated public static final AttributeKey<String> JVM_GC_ACTION = stringKey("jvm.gc.action");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes#JVM_GC_NAME} attribute.
   */
  @Deprecated public static final AttributeKey<String> JVM_GC_NAME = stringKey("jvm.gc.name");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes#JVM_MEMORY_POOL_NAME} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> JVM_MEMORY_POOL_NAME = stringKey("jvm.memory.pool.name");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes#JVM_MEMORY_TYPE} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> JVM_MEMORY_TYPE = stringKey("jvm.memory.type");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes#JVM_THREAD_DAEMON} attribute.
   */
  @Deprecated
  public static final AttributeKey<Boolean> JVM_THREAD_DAEMON = booleanKey("jvm.thread.daemon");

  /**
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes#JVM_THREAD_STATE} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> JVM_THREAD_STATE = stringKey("jvm.thread.state");

  private JvmIncubatingAttributes() {}
}
