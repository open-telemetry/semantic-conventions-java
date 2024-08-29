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
public final class MessageIncubatingAttributes {
  /**
   * Deprecated, use {@code rpc.message.compressed_size} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code rpc.message.compressed_size}.
   */
  @Deprecated
  public static final AttributeKey<Long> MESSAGE_COMPRESSED_SIZE =
      longKey("message.compressed_size");

  /**
   * Deprecated, use {@code rpc.message.id} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code rpc.message.id}.
   */
  @Deprecated public static final AttributeKey<Long> MESSAGE_ID = longKey("message.id");

  /**
   * Deprecated, use {@code rpc.message.type} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code rpc.message.type}.
   */
  @Deprecated public static final AttributeKey<String> MESSAGE_TYPE = stringKey("message.type");

  /**
   * Deprecated, use {@code rpc.message.uncompressed_size} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code rpc.message.uncompressed_size}.
   */
  @Deprecated
  public static final AttributeKey<Long> MESSAGE_UNCOMPRESSED_SIZE =
      longKey("message.uncompressed_size");

  // Enum definitions
  /** Values for {@link #MESSAGE_TYPE}. */
  public static final class MessageTypeValues {
    /** sent. */
    public static final String SENT = "SENT";

    /** received. */
    public static final String RECEIVED = "RECEIVED";

    private MessageTypeValues() {}
  }

  private MessageIncubatingAttributes() {}
}
