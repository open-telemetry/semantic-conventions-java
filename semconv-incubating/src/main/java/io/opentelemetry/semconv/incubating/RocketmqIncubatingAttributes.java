/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class RocketmqIncubatingAttributes {
  /** Model of message consumption. This only applies to consumer spans. */
  public static final AttributeKey<String> ROCKETMQ_CONSUMPTION_MODEL =
      stringKey("rocketmq.consumption_model");

  /** The delay time level for delay message, which determines the message delay time. */
  public static final AttributeKey<Long> ROCKETMQ_MESSAGE_DELAY_TIME_LEVEL =
      longKey("rocketmq.message.delay_time_level");

  /**
   * The timestamp in milliseconds that the delay message is expected to be delivered to consumer.
   */
  public static final AttributeKey<Long> ROCKETMQ_MESSAGE_DELIVERY_TIMESTAMP =
      longKey("rocketmq.message.delivery_timestamp");

  /**
   * It is essential for FIFO message. Messages that belong to the same message group are always
   * processed one by one within the same consumer group.
   */
  public static final AttributeKey<String> ROCKETMQ_MESSAGE_GROUP =
      stringKey("rocketmq.message.group");

  /** Key(s) of message, another way to mark message besides message ID. */
  public static final AttributeKey<List<String>> ROCKETMQ_MESSAGE_KEYS =
      stringArrayKey("rocketmq.message.keys");

  /** The secondary classifier of message besides topic. */
  public static final AttributeKey<String> ROCKETMQ_MESSAGE_TAG = stringKey("rocketmq.message.tag");

  /** Type of message. */
  public static final AttributeKey<String> ROCKETMQ_MESSAGE_TYPE =
      stringKey("rocketmq.message.type");

  /** Namespace of RocketMQ resources, resources in different namespaces are individual. */
  public static final AttributeKey<String> ROCKETMQ_NAMESPACE = stringKey("rocketmq.namespace");

  // Enum definitions

  /** Values for {@link #ROCKETMQ_CONSUMPTION_MODEL}. */
  public static final class RocketmqConsumptionModelIncubatingValues {
    /** Clustering consumption model */
    public static final String CLUSTERING = "clustering";

    /** Broadcasting consumption model */
    public static final String BROADCASTING = "broadcasting";

    private RocketmqConsumptionModelIncubatingValues() {}
  }

  /** Values for {@link #ROCKETMQ_MESSAGE_TYPE}. */
  public static final class RocketmqMessageTypeIncubatingValues {
    /** Normal message */
    public static final String NORMAL = "normal";

    /** FIFO message */
    public static final String FIFO = "fifo";

    /** Delay message */
    public static final String DELAY = "delay";

    /** Transaction message */
    public static final String TRANSACTION = "transaction";

    private RocketmqMessageTypeIncubatingValues() {}
  }

  private RocketmqIncubatingAttributes() {}
}
