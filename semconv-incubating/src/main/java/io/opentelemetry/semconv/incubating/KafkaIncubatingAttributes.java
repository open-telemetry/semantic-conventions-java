/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class KafkaIncubatingAttributes {
  /**
   * The Kafka cluster ID, obtained from the broker metadata exposed through the Kafka client (or
   * AdminClient) API.
   *
   * <p>Notes:
   *
   * <p>The cluster ID is a unique identifier reported by the Kafka broker. It identifies the
   * cluster independently of the individual brokers the client is configured to connect to, and
   * remains stable even if broker hostnames, IP addresses, or ports change.
   */
  public static final AttributeKey<String> KAFKA_CLUSTER_ID = stringKey("kafka.cluster.id");

  /**
   * Message keys in Kafka are used for grouping alike messages to ensure they're processed on the
   * same partition. They differ from {@code messaging.message.id} in that they're not unique. If
   * the key is {@code null}, the attribute MUST NOT be set.
   *
   * <p>Notes:
   *
   * <p>If the key type is not string, its string representation has to be supplied for the
   * attribute. If the key has no unambiguous, canonical string form, don't include its value.
   */
  public static final AttributeKey<String> KAFKA_MESSAGE_KEY = stringKey("kafka.message.key");

  /** A boolean that is true if the message is a tombstone. */
  public static final AttributeKey<Boolean> KAFKA_MESSAGE_TOMBSTONE =
      booleanKey("kafka.message.tombstone");

  /** The offset of a record in the corresponding Kafka partition. */
  public static final AttributeKey<Long> KAFKA_OFFSET = longKey("kafka.offset");

  // Enum definitions

  private KafkaIncubatingAttributes() {}
}
