/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class MessagingIncubatingAttributes {

  /**
   * The number of messages sent, received, or processed in the scope of the batching operation.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Instrumentations SHOULD NOT set {@code messaging.batch.message_count} on spans that
   *       operate with a single message. When a messaging client library supports both batch and
   *       single-message API for the same operation, instrumentations SHOULD use {@code
   *       messaging.batch.message_count} for batching APIs and SHOULD NOT use it for single-message
   *       APIs.
   * </ul>
   */
  public static final AttributeKey<Long> MESSAGING_BATCH_MESSAGE_COUNT =
      longKey("messaging.batch.message_count");

  /** A unique identifier for the client that consumes or produces a message. */
  public static final AttributeKey<String> MESSAGING_CLIENT_ID = stringKey("messaging.client_id");

  /**
   * A boolean that is true if the message destination is anonymous (could be unnamed or have
   * auto-generated name).
   */
  public static final AttributeKey<Boolean> MESSAGING_DESTINATION_ANONYMOUS =
      booleanKey("messaging.destination.anonymous");

  /**
   * The message destination name
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Destination name SHOULD uniquely identify a specific queue, topic or other entity within
   *       the broker. If the broker doesn't have such notion, the destination name SHOULD uniquely
   *       identify the broker.
   * </ul>
   */
  public static final AttributeKey<String> MESSAGING_DESTINATION_NAME =
      stringKey("messaging.destination.name");

  /**
   * Low cardinality representation of the messaging destination name
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Destination names could be constructed from templates. An example would be a destination
   *       name involving a user name or product id. Although the destination name in this case is
   *       of high cardinality, the underlying template is of low cardinality and can be effectively
   *       used for grouping and aggregation.
   * </ul>
   */
  public static final AttributeKey<String> MESSAGING_DESTINATION_TEMPLATE =
      stringKey("messaging.destination.template");

  /**
   * A boolean that is true if the message destination is temporary and might not exist anymore
   * after messages are processed.
   */
  public static final AttributeKey<Boolean> MESSAGING_DESTINATION_TEMPORARY =
      booleanKey("messaging.destination.temporary");

  /**
   * A boolean that is true if the publish message destination is anonymous (could be unnamed or
   * have auto-generated name).
   */
  public static final AttributeKey<Boolean> MESSAGING_DESTINATION_PUBLISH_ANONYMOUS =
      booleanKey("messaging.destination_publish.anonymous");

  /**
   * The name of the original destination the message was published to
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The name SHOULD uniquely identify a specific queue, topic, or other entity within the
   *       broker. If the broker doesn't have such notion, the original destination name SHOULD
   *       uniquely identify the broker.
   * </ul>
   */
  public static final AttributeKey<String> MESSAGING_DESTINATION_PUBLISH_NAME =
      stringKey("messaging.destination_publish.name");

  /**
   * The ordering key for a given message. If the attribute is not present, the message does not
   * have an ordering key.
   */
  public static final AttributeKey<String> MESSAGING_GCP_PUBSUB_MESSAGE_ORDERING_KEY =
      stringKey("messaging.gcp_pubsub.message.ordering_key");

  /**
   * Name of the Kafka Consumer Group that is handling the message. Only applies to consumers, not
   * producers.
   */
  public static final AttributeKey<String> MESSAGING_KAFKA_CONSUMER_GROUP =
      stringKey("messaging.kafka.consumer.group");

  /** Partition the message is sent to. */
  public static final AttributeKey<Long> MESSAGING_KAFKA_DESTINATION_PARTITION =
      longKey("messaging.kafka.destination.partition");

  /**
   * Message keys in Kafka are used for grouping alike messages to ensure they're processed on the
   * same partition. They differ from {@code messaging.message.id} in that they're not unique. If
   * the key is {@code null}, the attribute MUST NOT be set.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>If the key type is not string, it's string representation has to be supplied for the
   *       attribute. If the key has no unambiguous, canonical string form, don't include its value.
   * </ul>
   */
  public static final AttributeKey<String> MESSAGING_KAFKA_MESSAGE_KEY =
      stringKey("messaging.kafka.message.key");

  /** The offset of a record in the corresponding Kafka partition. */
  public static final AttributeKey<Long> MESSAGING_KAFKA_MESSAGE_OFFSET =
      longKey("messaging.kafka.message.offset");

  /** A boolean that is true if the message is a tombstone. */
  public static final AttributeKey<Boolean> MESSAGING_KAFKA_MESSAGE_TOMBSTONE =
      booleanKey("messaging.kafka.message.tombstone");

  /**
   * The size of the message body in bytes.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This can refer to both the compressed or uncompressed body size. If both sizes are known,
   *       the uncompressed body size should be used.
   * </ul>
   */
  public static final AttributeKey<Long> MESSAGING_MESSAGE_BODY_SIZE =
      longKey("messaging.message.body.size");

  /**
   * The conversation ID identifying the conversation to which the message belongs, represented as a
   * string. Sometimes called &quot;Correlation ID&quot;.
   */
  public static final AttributeKey<String> MESSAGING_MESSAGE_CONVERSATION_ID =
      stringKey("messaging.message.conversation_id");

  /**
   * The size of the message body and metadata in bytes.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This can refer to both the compressed or uncompressed size. If both sizes are known, the
   *       uncompressed size should be used.
   * </ul>
   */
  public static final AttributeKey<Long> MESSAGING_MESSAGE_ENVELOPE_SIZE =
      longKey("messaging.message.envelope.size");

  /**
   * A value used by the messaging system as an identifier for the message, represented as a string.
   */
  public static final AttributeKey<String> MESSAGING_MESSAGE_ID = stringKey("messaging.message.id");

  /**
   * A string identifying the kind of messaging operation.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>If a custom value is used, it MUST be of low cardinality.
   * </ul>
   */
  public static final AttributeKey<String> MESSAGING_OPERATION = stringKey("messaging.operation");

  /** RabbitMQ message routing key. */
  public static final AttributeKey<String> MESSAGING_RABBITMQ_DESTINATION_ROUTING_KEY =
      stringKey("messaging.rabbitmq.destination.routing_key");

  /**
   * Name of the RocketMQ producer/consumer group that is handling the message. The client type is
   * identified by the SpanKind.
   */
  public static final AttributeKey<String> MESSAGING_ROCKETMQ_CLIENT_GROUP =
      stringKey("messaging.rocketmq.client_group");

  /** Model of message consumption. This only applies to consumer spans. */
  public static final AttributeKey<String> MESSAGING_ROCKETMQ_CONSUMPTION_MODEL =
      stringKey("messaging.rocketmq.consumption_model");

  /** The delay time level for delay message, which determines the message delay time. */
  public static final AttributeKey<Long> MESSAGING_ROCKETMQ_MESSAGE_DELAY_TIME_LEVEL =
      longKey("messaging.rocketmq.message.delay_time_level");

  /**
   * The timestamp in milliseconds that the delay message is expected to be delivered to consumer.
   */
  public static final AttributeKey<Long> MESSAGING_ROCKETMQ_MESSAGE_DELIVERY_TIMESTAMP =
      longKey("messaging.rocketmq.message.delivery_timestamp");

  /**
   * It is essential for FIFO message. Messages that belong to the same message group are always
   * processed one by one within the same consumer group.
   */
  public static final AttributeKey<String> MESSAGING_ROCKETMQ_MESSAGE_GROUP =
      stringKey("messaging.rocketmq.message.group");

  /** Key(s) of message, another way to mark message besides message id. */
  public static final AttributeKey<List<String>> MESSAGING_ROCKETMQ_MESSAGE_KEYS =
      stringArrayKey("messaging.rocketmq.message.keys");

  /** The secondary classifier of message besides topic. */
  public static final AttributeKey<String> MESSAGING_ROCKETMQ_MESSAGE_TAG =
      stringKey("messaging.rocketmq.message.tag");

  /** Type of message. */
  public static final AttributeKey<String> MESSAGING_ROCKETMQ_MESSAGE_TYPE =
      stringKey("messaging.rocketmq.message.type");

  /** Namespace of RocketMQ resources, resources in different namespaces are individual. */
  public static final AttributeKey<String> MESSAGING_ROCKETMQ_NAMESPACE =
      stringKey("messaging.rocketmq.namespace");

  /**
   * An identifier for the messaging system being used. See below for a list of well-known
   * identifiers.
   */
  public static final AttributeKey<String> MESSAGING_SYSTEM = stringKey("messaging.system");

  // Enum definitions
  /** Values for {@link #MESSAGING_OPERATION}. */
  public static final class MessagingOperationValues {
    /**
     * One or more messages are provided for publishing to an intermediary. If a single message is
     * published, the context of the &#34;Publish&#34; span can be used as the creation context and
     * no &#34;Create&#34; span needs to be created.
     */
    public static final String PUBLISH = "publish";

    /**
     * A message is created. &#34;Create&#34; spans always refer to a single message and are used to
     * provide a unique creation context for messages in batch publishing scenarios.
     */
    public static final String CREATE = "create";

    /**
     * One or more messages are requested by a consumer. This operation refers to pull-based
     * scenarios, where consumers explicitly call methods of messaging SDKs to receive messages.
     */
    public static final String RECEIVE = "receive";

    /**
     * One or more messages are passed to a consumer. This operation refers to push-based scenarios,
     * where consumer register callbacks which get called by messaging SDKs.
     */
    public static final String DELIVER = "deliver";

    private MessagingOperationValues() {}
  }

  /** Values for {@link #MESSAGING_ROCKETMQ_CONSUMPTION_MODEL}. */
  public static final class MessagingRocketmqConsumptionModelValues {
    /** Clustering consumption model. */
    public static final String CLUSTERING = "clustering";

    /** Broadcasting consumption model. */
    public static final String BROADCASTING = "broadcasting";

    private MessagingRocketmqConsumptionModelValues() {}
  }

  /** Values for {@link #MESSAGING_ROCKETMQ_MESSAGE_TYPE}. */
  public static final class MessagingRocketmqMessageTypeValues {
    /** Normal message. */
    public static final String NORMAL = "normal";

    /** FIFO message. */
    public static final String FIFO = "fifo";

    /** Delay message. */
    public static final String DELAY = "delay";

    /** Transaction message. */
    public static final String TRANSACTION = "transaction";

    private MessagingRocketmqMessageTypeValues() {}
  }

  /** Values for {@link #MESSAGING_SYSTEM}. */
  public static final class MessagingSystemValues {
    /** Apache ActiveMQ. */
    public static final String ACTIVEMQ = "activemq";

    /** Amazon Simple Queue Service (SQS). */
    public static final String AWS_SQS = "aws_sqs";

    /** Azure Event Grid. */
    public static final String AZURE_EVENTGRID = "azure_eventgrid";

    /** Azure Event Hubs. */
    public static final String AZURE_EVENTHUBS = "azure_eventhubs";

    /** Azure Service Bus. */
    public static final String AZURE_SERVICEBUS = "azure_servicebus";

    /** Google Cloud Pub/Sub. */
    public static final String GCP_PUBSUB = "gcp_pubsub";

    /** Java Message Service. */
    public static final String JMS = "jms";

    /** Apache Kafka. */
    public static final String KAFKA = "kafka";

    /** RabbitMQ. */
    public static final String RABBITMQ = "rabbitmq";

    /** Apache RocketMQ. */
    public static final String ROCKETMQ = "rocketmq";

    private MessagingSystemValues() {}
  }

  private MessagingIncubatingAttributes() {}
}
