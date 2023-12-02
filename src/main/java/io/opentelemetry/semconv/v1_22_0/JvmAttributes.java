/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_22_0;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.experimental.java.j2
@SuppressWarnings("unused")
public final class JvmAttributes {

  /**
   * Name of the buffer pool.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Pool names are generally obtained via <a
   *       href="https://docs.oracle.com/en/java/javase/11/docs/api/java.management/java/lang/management/BufferPoolMXBean.html#getName()">BufferPoolMXBean#getName()</a>.
   * </ul>
   */
  public static final AttributeKey<String> JVM_BUFFER_POOL_NAME = stringKey("jvm.buffer.pool.name");

  /**
   * Name of the memory pool.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Pool names are generally obtained via <a
   *       href="https://docs.oracle.com/en/java/javase/11/docs/api/java.management/java/lang/management/MemoryPoolMXBean.html#getName()">MemoryPoolMXBean#getName()</a>.
   * </ul>
   */
  public static final AttributeKey<String> JVM_MEMORY_POOL_NAME = stringKey("jvm.memory.pool.name");

  /** The type of memory. */
  public static final AttributeKey<String> JVM_MEMORY_TYPE = stringKey("jvm.memory.type");

  /**
   * Name of the garbage collector action.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Garbage collector action is generally obtained via <a
   *       href="https://docs.oracle.com/en/java/javase/11/docs/api/jdk.management/com/sun/management/GarbageCollectionNotificationInfo.html#getGcAction()">GarbageCollectionNotificationInfo#getGcAction()</a>.
   * </ul>
   */
  public static final AttributeKey<String> JVM_GC_ACTION = stringKey("jvm.gc.action");

  /**
   * Name of the garbage collector.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Garbage collector name is generally obtained via <a
   *       href="https://docs.oracle.com/en/java/javase/11/docs/api/jdk.management/com/sun/management/GarbageCollectionNotificationInfo.html#getGcName()">GarbageCollectionNotificationInfo#getGcName()</a>.
   * </ul>
   */
  public static final AttributeKey<String> JVM_GC_NAME = stringKey("jvm.gc.name");

  // Enum definitions
  public static final class JvmMemoryTypeValues {
    /** Heap memory. */
    public static final String HEAP = "heap";

    /** Non-heap memory. */
    public static final String NON_HEAP = "non_heap";

    private JvmMemoryTypeValues() {}
  }

  private JvmAttributes() {}
}
