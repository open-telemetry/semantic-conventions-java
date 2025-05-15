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
   * Name of the garbage collector action.
   *
   * <p>Notes:
   *
   * <p>Garbage collector action is generally obtained via <a
   * href="https://docs.oracle.com/en/java/javase/11/docs/api/jdk.management/com/sun/management/GarbageCollectionNotificationInfo.html#getGcAction()">GarbageCollectionNotificationInfo#getGcAction()</a>.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes#JVM_GC_ACTION} attribute.
   */
  @Deprecated public static final AttributeKey<String> JVM_GC_ACTION = stringKey("jvm.gc.action");

  /**
   * Name of the garbage collector.
   *
   * <p>Notes:
   *
   * <p>Garbage collector name is generally obtained via <a
   * href="https://docs.oracle.com/en/java/javase/11/docs/api/jdk.management/com/sun/management/GarbageCollectionNotificationInfo.html#getGcName()">GarbageCollectionNotificationInfo#getGcName()</a>.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes#JVM_GC_NAME} attribute.
   */
  @Deprecated public static final AttributeKey<String> JVM_GC_NAME = stringKey("jvm.gc.name");

  /**
   * Name of the memory pool.
   *
   * <p>Notes:
   *
   * <p>Pool names are generally obtained via <a
   * href="https://docs.oracle.com/en/java/javase/11/docs/api/java.management/java/lang/management/MemoryPoolMXBean.html#getName()">MemoryPoolMXBean#getName()</a>.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes#JVM_MEMORY_POOL_NAME} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> JVM_MEMORY_POOL_NAME = stringKey("jvm.memory.pool.name");

  /**
   * The type of memory.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes#JVM_MEMORY_TYPE} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> JVM_MEMORY_TYPE = stringKey("jvm.memory.type");

  /**
   * Whether the thread is daemon or not.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes#JVM_THREAD_DAEMON} attribute.
   */
  @Deprecated
  public static final AttributeKey<Boolean> JVM_THREAD_DAEMON = booleanKey("jvm.thread.daemon");

  /**
   * State of the thread.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes#JVM_THREAD_STATE} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> JVM_THREAD_STATE = stringKey("jvm.thread.state");

  // Enum definitions

  /**
   * Values for {@link #JVM_MEMORY_TYPE}.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes.JvmMemoryTypeValues}.
   */
  @Deprecated
  public static final class JvmMemoryTypeIncubatingValues {
    /** Heap memory. */
    public static final String HEAP = "heap";

    /** Non-heap memory */
    public static final String NON_HEAP = "non_heap";

    private JvmMemoryTypeIncubatingValues() {}
  }

  /**
   * Values for {@link #JVM_THREAD_STATE}.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.JvmAttributes.JvmThreadStateValues}.
   */
  @Deprecated
  public static final class JvmThreadStateIncubatingValues {
    /** A thread that has not yet started is in this state. */
    public static final String NEW = "new";

    /** A thread executing in the Java virtual machine is in this state. */
    public static final String RUNNABLE = "runnable";

    /** A thread that is blocked waiting for a monitor lock is in this state. */
    public static final String BLOCKED = "blocked";

    /**
     * A thread that is waiting indefinitely for another thread to perform a particular action is in
     * this state.
     */
    public static final String WAITING = "waiting";

    /**
     * A thread that is waiting for another thread to perform an action for up to a specified
     * waiting time is in this state.
     */
    public static final String TIMED_WAITING = "timed_waiting";

    /** A thread that has exited is in this state. */
    public static final String TERMINATED = "terminated";

    private JvmThreadStateIncubatingValues() {}
  }

  private JvmIncubatingAttributes() {}
}
