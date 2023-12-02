/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_22_0;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.experimental.java.j2
@SuppressWarnings("unused")
public final class MessageAttributes {

  /** Compressed size of the message in bytes. */
  public static final AttributeKey<Long> MESSAGE_COMPRESSED_SIZE =
      longKey("message.compressed_size");

  /**
   * MUST be calculated as two different counters starting from {@code 1} one for sent messages and
   * one for received message.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This way we guarantee that the values will be consistent between different
   *       implementations.
   * </ul>
   */
  public static final AttributeKey<Long> MESSAGE_ID = longKey("message.id");

  /** Whether this is a received or sent message. */
  public static final AttributeKey<String> MESSAGE_TYPE = stringKey("message.type");

  /** Uncompressed size of the message in bytes. */
  public static final AttributeKey<Long> MESSAGE_UNCOMPRESSED_SIZE =
      longKey("message.uncompressed_size");

  // Enum definitions
  public static final class MessageTypeValues {
    /** sent. */
    public static final String SENT = "SENT";

    /** received. */
    public static final String RECEIVED = "RECEIVED";

    private MessageTypeValues() {}
  }

  private MessageAttributes() {}
}
