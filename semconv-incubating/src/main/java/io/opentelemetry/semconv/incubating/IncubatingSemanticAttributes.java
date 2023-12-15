/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.doubleKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringArrayKeyTemplate;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class IncubatingSemanticAttributes {
  /**
   * Destination address - domain name if available without reverse DNS lookup; otherwise, IP
   * address or Unix domain socket name.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>When observed from the source side, and when communicating through an intermediary,
   *       {@code destination.address} SHOULD represent the destination address behind any
   *       intermediaries, for example proxies, if it's available.
   * </ul>
   */
  public static final AttributeKey<String> DESTINATION_ADDRESS = stringKey("destination.address");

  /** Destination port number */
  public static final AttributeKey<Long> DESTINATION_PORT = longKey("destination.port");

  /** The exception message. */
  public static final AttributeKey<String> EXCEPTION_MESSAGE = stringKey("exception.message");

  /**
   * A stacktrace as a string in the natural representation for the language runtime. The
   * representation is to be determined and documented by each language SIG.
   */
  public static final AttributeKey<String> EXCEPTION_STACKTRACE = stringKey("exception.stacktrace");

  /**
   * The type of the exception (its fully-qualified class name, if applicable). The dynamic type of
   * the exception should be preferred over the static type in languages that support it.
   */
  public static final AttributeKey<String> EXCEPTION_TYPE = stringKey("exception.type");

  /**
   * The name of the invoked function.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>SHOULD be equal to the {@code faas.name} resource attribute of the invoked function.
   * </ul>
   */
  public static final AttributeKey<String> FAAS_INVOKED_NAME = stringKey("faas.invoked_name");

  /**
   * The cloud provider of the invoked function.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>SHOULD be equal to the {@code cloud.provider} resource attribute of the invoked function.
   * </ul>
   */
  public static final AttributeKey<String> FAAS_INVOKED_PROVIDER =
      stringKey("faas.invoked_provider");

  /**
   * The cloud region of the invoked function.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>SHOULD be equal to the {@code cloud.region} resource attribute of the invoked function.
   * </ul>
   */
  public static final AttributeKey<String> FAAS_INVOKED_REGION = stringKey("faas.invoked_region");

  /** Type of the trigger which caused this function invocation. */
  public static final AttributeKey<String> FAAS_TRIGGER = stringKey("faas.trigger");

  /**
   * The <a href="/docs/resource/README.md#service">{@code service.name}</a> of the remote service.
   * SHOULD be equal to the actual {@code service.name} resource attribute of the remote service if
   * any.
   */
  public static final AttributeKey<String> PEER_SERVICE = stringKey("peer.service");

  /**
   * Username or client_id extracted from the access token or <a
   * href="https://tools.ietf.org/html/rfc7235#section-4.2">Authorization</a> header in the inbound
   * request from outside the system.
   */
  public static final AttributeKey<String> ENDUSER_ID = stringKey("enduser.id");

  /**
   * Actual/assumed role the client is making the request under extracted from token or application
   * security context.
   */
  public static final AttributeKey<String> ENDUSER_ROLE = stringKey("enduser.role");

  /**
   * Scopes or granted authorities the client currently possesses extracted from token or
   * application security context. The value would come from the scope associated with an <a
   * href="https://tools.ietf.org/html/rfc6749#section-3.3">OAuth 2.0 Access Token</a> or an
   * attribute value in a <a
   * href="http://docs.oasis-open.org/security/saml/Post2.0/sstc-saml-tech-overview-2.0.html">SAML
   * 2.0 Assertion</a>.
   */
  public static final AttributeKey<String> ENDUSER_SCOPE = stringKey("enduser.scope");

  /**
   * The domain identifies the business context for the events.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Events across different domains may have same {@code event.name}, yet be unrelated
   *       events.
   * </ul>
   */
  public static final AttributeKey<String> EVENT_DOMAIN = stringKey("event.domain");

  /** The name identifies the event. */
  public static final AttributeKey<String> EVENT_NAME = stringKey("event.name");

  /**
   * A unique identifier for the Log Record.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>If an id is provided, other log records with the same id will be considered duplicates
   *       and can be removed safely. This means, that two distinguishable log records MUST have
   *       different values. The id MAY be an <a href="https://github.com/ulid/spec">Universally
   *       Unique Lexicographically Sortable Identifier (ULID)</a>, but other identifiers (e.g.
   *       UUID) may be used as needed.
   * </ul>
   */
  public static final AttributeKey<String> LOG_RECORD_UID = stringKey("log.record.uid");

  /** The stream associated with the log. See below for a list of well-known values. */
  public static final AttributeKey<String> LOG_IOSTREAM = stringKey("log.iostream");

  /** The basename of the file. */
  public static final AttributeKey<String> LOG_FILE_NAME = stringKey("log.file.name");

  /** The basename of the file, with symlinks resolved. */
  public static final AttributeKey<String> LOG_FILE_NAME_RESOLVED =
      stringKey("log.file.name_resolved");

  /** The full path to the file. */
  public static final AttributeKey<String> LOG_FILE_PATH = stringKey("log.file.path");

  /** The full path to the file, with symlinks resolved. */
  public static final AttributeKey<String> LOG_FILE_PATH_RESOLVED =
      stringKey("log.file.path_resolved");

  /**
   * This attribute represents the state the application has transitioned into at the occurrence of
   * the event.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The iOS lifecycle states are defined in the <a
   *       href="https://developer.apple.com/documentation/uikit/uiapplicationdelegate#1656902">UIApplicationDelegate
   *       documentation</a>, and from which the {@code OS terminology} column values are derived.
   * </ul>
   */
  public static final AttributeKey<String> IOS_STATE = stringKey("ios.state");

  /**
   * This attribute represents the state the application has transitioned into at the occurrence of
   * the event.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The Android lifecycle states are defined in <a
   *       href="https://developer.android.com/guide/components/activities/activity-lifecycle#lc">Activity
   *       lifecycle callbacks</a>, and from which the {@code OS identifiers} are derived.
   * </ul>
   */
  public static final AttributeKey<String> ANDROID_STATE = stringKey("android.state");

  /**
   * The name of the connection pool; unique within the instrumented application. In case the
   * connection pool implementation doesn't provide a name, then the <a
   * href="/docs/database/database-spans.md#connection-level-attributes">db.connection_string</a>
   * should be used
   */
  public static final AttributeKey<String> POOL_NAME = stringKey("pool.name");

  /** The state of a connection in the pool */
  public static final AttributeKey<String> STATE = stringKey("state");

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

  /** Whether the thread is daemon or not. */
  public static final AttributeKey<Boolean> JVM_THREAD_DAEMON = booleanKey("jvm.thread.daemon");

  /** State of the thread. */
  public static final AttributeKey<String> JVM_THREAD_STATE = stringKey("jvm.thread.state");

  /** The device identifier */
  public static final AttributeKey<String> SYSTEM_DEVICE = stringKey("system.device");

  /** The logical CPU number [0..n-1] */
  public static final AttributeKey<Long> SYSTEM_CPU_LOGICAL_NUMBER =
      longKey("system.cpu.logical_number");

  /** The state of the CPU */
  public static final AttributeKey<String> SYSTEM_CPU_STATE = stringKey("system.cpu.state");

  /** The memory state */
  public static final AttributeKey<String> SYSTEM_MEMORY_STATE = stringKey("system.memory.state");

  /** The paging access direction */
  public static final AttributeKey<String> SYSTEM_PAGING_DIRECTION =
      stringKey("system.paging.direction");

  /** The memory paging state */
  public static final AttributeKey<String> SYSTEM_PAGING_STATE = stringKey("system.paging.state");

  /** The memory paging type */
  public static final AttributeKey<String> SYSTEM_PAGING_TYPE = stringKey("system.paging.type");

  /** The disk operation direction */
  public static final AttributeKey<String> SYSTEM_DISK_DIRECTION =
      stringKey("system.disk.direction");

  /** The filesystem mode */
  public static final AttributeKey<String> SYSTEM_FILESYSTEM_MODE =
      stringKey("system.filesystem.mode");

  /** The filesystem mount path */
  public static final AttributeKey<String> SYSTEM_FILESYSTEM_MOUNTPOINT =
      stringKey("system.filesystem.mountpoint");

  /** The filesystem state */
  public static final AttributeKey<String> SYSTEM_FILESYSTEM_STATE =
      stringKey("system.filesystem.state");

  /** The filesystem type */
  public static final AttributeKey<String> SYSTEM_FILESYSTEM_TYPE =
      stringKey("system.filesystem.type");

  /** */
  public static final AttributeKey<String> SYSTEM_NETWORK_DIRECTION =
      stringKey("system.network.direction");

  /** A stateless protocol MUST NOT set this attribute */
  public static final AttributeKey<String> SYSTEM_NETWORK_STATE = stringKey("system.network.state");

  /**
   * The process state, e.g., <a
   * href="https://man7.org/linux/man-pages/man1/ps.1.html#PROCESS_STATE_CODES">Linux Process State
   * Codes</a>
   */
  public static final AttributeKey<String> SYSTEM_PROCESSES_STATUS =
      stringKey("system.processes.status");

  /**
   * The column number in {@code code.filepath} best representing the operation. It SHOULD point
   * within the code unit named in {@code code.function}.
   */
  public static final AttributeKey<Long> CODE_COLUMN = longKey("code.column");

  /**
   * The source code file name that identifies the code unit as uniquely as possible (preferably an
   * absolute file path).
   */
  public static final AttributeKey<String> CODE_FILEPATH = stringKey("code.filepath");

  /**
   * The method or function name, or equivalent (usually rightmost part of the code unit's name).
   */
  public static final AttributeKey<String> CODE_FUNCTION = stringKey("code.function");

  /**
   * The line number in {@code code.filepath} best representing the operation. It SHOULD point
   * within the code unit named in {@code code.function}.
   */
  public static final AttributeKey<Long> CODE_LINENO = longKey("code.lineno");

  /**
   * The &quot;namespace&quot; within which {@code code.function} is defined. Usually the qualified
   * class or module name, such that {@code code.namespace} + some separator + {@code code.function}
   * form a unique identifier for the code unit.
   */
  public static final AttributeKey<String> CODE_NAMESPACE = stringKey("code.namespace");

  /**
   * The size of the request payload body in bytes. This is the number of bytes transferred
   * excluding headers and is often, but not always, present as the <a
   * href="https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length">Content-Length</a>
   * header. For requests using transport encoding, this should be the compressed size.
   */
  public static final AttributeKey<Long> HTTP_REQUEST_BODY_SIZE = longKey("http.request.body.size");

  /**
   * The size of the response payload body in bytes. This is the number of bytes transferred
   * excluding headers and is often, but not always, present as the <a
   * href="https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length">Content-Length</a>
   * header. For requests using transport encoding, this should be the compressed size.
   */
  public static final AttributeKey<Long> HTTP_RESPONSE_BODY_SIZE =
      longKey("http.response.body.size");

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

  /** A string identifying the messaging system. */
  public static final AttributeKey<String> MESSAGING_SYSTEM = stringKey("messaging.system");

  /** The ISO 3166-1 alpha-2 2-character country code associated with the mobile carrier network. */
  public static final AttributeKey<String> NETWORK_CARRIER_ICC = stringKey("network.carrier.icc");

  /** The mobile carrier country code. */
  public static final AttributeKey<String> NETWORK_CARRIER_MCC = stringKey("network.carrier.mcc");

  /** The mobile carrier network code. */
  public static final AttributeKey<String> NETWORK_CARRIER_MNC = stringKey("network.carrier.mnc");

  /** The name of the mobile carrier. */
  public static final AttributeKey<String> NETWORK_CARRIER_NAME = stringKey("network.carrier.name");

  /**
   * This describes more details regarding the connection.type. It may be the type of cell
   * technology connection, but it could be used for describing details about a wifi connection.
   */
  public static final AttributeKey<String> NETWORK_CONNECTION_SUBTYPE =
      stringKey("network.connection.subtype");

  /** The internet connection type. */
  public static final AttributeKey<String> NETWORK_CONNECTION_TYPE =
      stringKey("network.connection.type");

  /**
   * The <a href="https://connect.build/docs/protocol/#error-codes">error codes</a> of the Connect
   * request. Error codes are always string values.
   */
  public static final AttributeKey<String> RPC_CONNECT_RPC_ERROR_CODE =
      stringKey("rpc.connect_rpc.error_code");

  /**
   * The <a href="https://github.com/grpc/grpc/blob/v1.33.2/doc/statuscodes.md">numeric status
   * code</a> of the gRPC request.
   */
  public static final AttributeKey<Long> RPC_GRPC_STATUS_CODE = longKey("rpc.grpc.status_code");

  /** {@code error.code} property of response if it is an error response. */
  public static final AttributeKey<Long> RPC_JSONRPC_ERROR_CODE = longKey("rpc.jsonrpc.error_code");

  /** {@code error.message} property of response if it is an error response. */
  public static final AttributeKey<String> RPC_JSONRPC_ERROR_MESSAGE =
      stringKey("rpc.jsonrpc.error_message");

  /**
   * {@code id} property of request or response. Since protocol allows id to be int, string, {@code
   * null} or missing (for notifications), value is expected to be cast to string for simplicity.
   * Use empty string in case of {@code null} value. Omit entirely if this is a notification.
   */
  public static final AttributeKey<String> RPC_JSONRPC_REQUEST_ID =
      stringKey("rpc.jsonrpc.request_id");

  /**
   * Protocol version as in {@code jsonrpc} property of request/response. Since JSON-RPC 1.0 doesn't
   * specify this, the value can be omitted.
   */
  public static final AttributeKey<String> RPC_JSONRPC_VERSION = stringKey("rpc.jsonrpc.version");

  /**
   * The name of the (logical) method being called, must be equal to the $method part in the span
   * name.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This is the logical name of the method from the RPC interface perspective, which can be
   *       different from the name of any implementing method/function. The {@code code.function}
   *       attribute may be used to store the latter (e.g., method actually executing the call on
   *       the server side, RPC client stub method on the client side).
   * </ul>
   */
  public static final AttributeKey<String> RPC_METHOD = stringKey("rpc.method");

  /**
   * The full (logical) name of the service being called, including its package name, if applicable.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This is the logical name of the service from the RPC interface perspective, which can be
   *       different from the name of any implementing class. The {@code code.namespace} attribute
   *       may be used to store the latter (despite the attribute name, it may include a class name;
   *       e.g., class with method actually executing the call on the server side, RPC client stub
   *       class on the client side).
   * </ul>
   */
  public static final AttributeKey<String> RPC_SERVICE = stringKey("rpc.service");

  /** A string identifying the remoting system. See below for a list of well-known identifiers. */
  public static final AttributeKey<String> RPC_SYSTEM = stringKey("rpc.system");

  /** Current &quot;managed&quot; thread ID (as opposed to OS thread ID). */
  public static final AttributeKey<Long> THREAD_ID = longKey("thread.id");

  /** Current thread name. */
  public static final AttributeKey<String> THREAD_NAME = stringKey("thread.name");

  /** A unique id to identify a session. */
  public static final AttributeKey<String> SESSION_ID = stringKey("session.id");

  /** The previous {@code session.id} for this user, when known. */
  public static final AttributeKey<String> SESSION_PREVIOUS_ID = stringKey("session.previous_id");

  /**
   * Source address - domain name if available without reverse DNS lookup; otherwise, IP address or
   * Unix domain socket name.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>When observed from the destination side, and when communicating through an intermediary,
   *       {@code source.address} SHOULD represent the source address behind any intermediaries, for
   *       example proxies, if it's available.
   * </ul>
   */
  public static final AttributeKey<String> SOURCE_ADDRESS = stringKey("source.address");

  /** Source port number */
  public static final AttributeKey<Long> SOURCE_PORT = longKey("source.port");

  /**
   * The full invoked ARN as provided on the {@code Context} passed to the function ({@code
   * Lambda-Runtime-Invoked-Function-Arn} header on the {@code /runtime/invocation/next}
   * applicable).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This may be different from {@code cloud.resource_id} if an alias is involved.
   * </ul>
   */
  public static final AttributeKey<String> AWS_LAMBDA_INVOKED_ARN =
      stringKey("aws.lambda.invoked_arn");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#id">event_id</a>
   * uniquely identifies the event.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_ID = stringKey("cloudevents.event_id");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#source-1">source</a>
   * identifies the context in which an event happened.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_SOURCE =
      stringKey("cloudevents.event_source");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#specversion">version
   * of the CloudEvents specification</a> which the event uses.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_SPEC_VERSION =
      stringKey("cloudevents.event_spec_version");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#subject">subject</a>
   * of the event in the context of the event producer (identified by source).
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_SUBJECT =
      stringKey("cloudevents.event_subject");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#type">event_type</a>
   * contains a value describing the type of event related to the originating occurrence.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_TYPE =
      stringKey("cloudevents.event_type");

  /**
   * Parent-child Reference type
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The causal relationship between a child Span and a parent Span.
   * </ul>
   */
  public static final AttributeKey<String> OPENTRACING_REF_TYPE = stringKey("opentracing.ref_type");

  /**
   * The connection string used to connect to the database. It is recommended to remove embedded
   * credentials.
   */
  public static final AttributeKey<String> DB_CONNECTION_STRING = stringKey("db.connection_string");

  /**
   * The fully-qualified class name of the <a
   * href="https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/">Java Database Connectivity
   * (JDBC)</a> driver used to connect.
   */
  public static final AttributeKey<String> DB_JDBC_DRIVER_CLASSNAME =
      stringKey("db.jdbc.driver_classname");

  /**
   * This attribute is used to report the name of the database being accessed. For commands that
   * switch the database, this should be set to the target database (even if the command fails).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>In some SQL databases, the database name to be used is called &quot;schema name&quot;. In
   *       case there are multiple layers that could be considered for database name (e.g. Oracle
   *       instance name and schema name), the database name to be used is the more specific layer
   *       (e.g. Oracle schema name).
   * </ul>
   */
  public static final AttributeKey<String> DB_NAME = stringKey("db.name");

  /**
   * The name of the operation being executed, e.g. the <a
   * href="https://docs.mongodb.com/manual/reference/command/#database-operations">MongoDB command
   * name</a> such as {@code findAndModify}, or the SQL keyword.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>When setting this to an SQL keyword, it is not recommended to attempt any client-side
   *       parsing of {@code db.statement} just to get this property, but it should be set if the
   *       operation name is provided by the library being instrumented. If the SQL statement has an
   *       ambiguous operation, or performs more than one operation, this value may be omitted.
   * </ul>
   */
  public static final AttributeKey<String> DB_OPERATION = stringKey("db.operation");

  /** The database statement being executed. */
  public static final AttributeKey<String> DB_STATEMENT = stringKey("db.statement");

  /**
   * An identifier for the database management system (DBMS) product being used. See below for a
   * list of well-known identifiers.
   */
  public static final AttributeKey<String> DB_SYSTEM = stringKey("db.system");

  /** Username for accessing the database. */
  public static final AttributeKey<String> DB_USER = stringKey("db.user");

  /**
   * The Microsoft SQL Server <a
   * href="https://docs.microsoft.com/sql/connect/jdbc/building-the-connection-url?view=sql-server-ver15">instance
   * name</a> connecting to. This name is used to determine the port of a named instance.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>If setting a {@code db.mssql.instance_name}, {@code server.port} is no longer required
   *       (but still recommended if non-standard).
   * </ul>
   */
  public static final AttributeKey<String> DB_MSSQL_INSTANCE_NAME =
      stringKey("db.mssql.instance_name");

  /**
   * The consistency level of the query. Based on consistency values from <a
   * href="https://docs.datastax.com/en/cassandra-oss/3.0/cassandra/dml/dmlConfigConsistency.html">CQL</a>.
   */
  public static final AttributeKey<String> DB_CASSANDRA_CONSISTENCY_LEVEL =
      stringKey("db.cassandra.consistency_level");

  /** The data center of the coordinating node for a query. */
  public static final AttributeKey<String> DB_CASSANDRA_COORDINATOR_DC =
      stringKey("db.cassandra.coordinator.dc");

  /** The ID of the coordinating node for a query. */
  public static final AttributeKey<String> DB_CASSANDRA_COORDINATOR_ID =
      stringKey("db.cassandra.coordinator.id");

  /** Whether or not the query is idempotent. */
  public static final AttributeKey<Boolean> DB_CASSANDRA_IDEMPOTENCE =
      booleanKey("db.cassandra.idempotence");

  /** The fetch size used for paging, i.e. how many rows will be returned at once. */
  public static final AttributeKey<Long> DB_CASSANDRA_PAGE_SIZE = longKey("db.cassandra.page_size");

  /**
   * The number of times a query was speculatively executed. Not set or {@code 0} if the query was
   * not executed speculatively.
   */
  public static final AttributeKey<Long> DB_CASSANDRA_SPECULATIVE_EXECUTION_COUNT =
      longKey("db.cassandra.speculative_execution_count");

  /**
   * The name of the primary table that the operation is acting upon, including the keyspace name
   * (if applicable).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This mirrors the db.sql.table attribute but references cassandra rather than sql. It is
   *       not recommended to attempt any client-side parsing of {@code db.statement} just to get
   *       this property, but it should be set if it is provided by the library being instrumented.
   *       If the operation is acting upon an anonymous table, or more than one table, this value
   *       MUST NOT be set.
   * </ul>
   */
  public static final AttributeKey<String> DB_CASSANDRA_TABLE = stringKey("db.cassandra.table");

  /**
   * The index of the database being accessed as used in the <a
   * href="https://redis.io/commands/select">{@code SELECT} command</a>, provided as an integer. To
   * be used instead of the generic {@code db.name} attribute.
   */
  public static final AttributeKey<Long> DB_REDIS_DATABASE_INDEX =
      longKey("db.redis.database_index");

  /** The collection being accessed within the database stated in {@code db.name}. */
  public static final AttributeKey<String> DB_MONGODB_COLLECTION =
      stringKey("db.mongodb.collection");

  /** Represents the identifier of an Elasticsearch cluster. */
  public static final AttributeKey<String> DB_ELASTICSEARCH_CLUSTER_NAME =
      stringKey("db.elasticsearch.cluster.name");

  /**
   * Represents the human-readable identifier of the node/instance to which a request was routed.
   */
  public static final AttributeKey<String> DB_ELASTICSEARCH_NODE_NAME =
      stringKey("db.elasticsearch.node.name");

  /**
   * The name of the primary table that the operation is acting upon, including the database name
   * (if applicable).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>It is not recommended to attempt any client-side parsing of {@code db.statement} just to
   *       get this property, but it should be set if it is provided by the library being
   *       instrumented. If the operation is acting upon an anonymous table, or more than one table,
   *       this value MUST NOT be set.
   * </ul>
   */
  public static final AttributeKey<String> DB_SQL_TABLE = stringKey("db.sql.table");

  /** Unique Cosmos client instance id. */
  public static final AttributeKey<String> DB_COSMOSDB_CLIENT_ID =
      stringKey("db.cosmosdb.client_id");

  /** Cosmos client connection mode. */
  public static final AttributeKey<String> DB_COSMOSDB_CONNECTION_MODE =
      stringKey("db.cosmosdb.connection_mode");

  /** Cosmos DB container name. */
  public static final AttributeKey<String> DB_COSMOSDB_CONTAINER =
      stringKey("db.cosmosdb.container");

  /** CosmosDB Operation Type. */
  public static final AttributeKey<String> DB_COSMOSDB_OPERATION_TYPE =
      stringKey("db.cosmosdb.operation_type");

  /** RU consumed for that operation */
  public static final AttributeKey<Double> DB_COSMOSDB_REQUEST_CHARGE =
      doubleKey("db.cosmosdb.request_charge");

  /** Request payload size in bytes */
  public static final AttributeKey<Long> DB_COSMOSDB_REQUEST_CONTENT_LENGTH =
      longKey("db.cosmosdb.request_content_length");

  /** Cosmos DB status code. */
  public static final AttributeKey<Long> DB_COSMOSDB_STATUS_CODE =
      longKey("db.cosmosdb.status_code");

  /** Cosmos DB sub status code. */
  public static final AttributeKey<Long> DB_COSMOSDB_SUB_STATUS_CODE =
      longKey("db.cosmosdb.sub_status_code");

  /**
   * Name of the code, either &quot;OK&quot; or &quot;ERROR&quot;. MUST NOT be set if the status
   * code is UNSET.
   */
  public static final AttributeKey<String> OTEL_STATUS_CODE = stringKey("otel.status_code");

  /** Description of the Status if it has a value, otherwise not set. */
  public static final AttributeKey<String> OTEL_STATUS_DESCRIPTION =
      stringKey("otel.status_description");

  /** The invocation ID of the current function invocation. */
  public static final AttributeKey<String> FAAS_INVOCATION_ID = stringKey("faas.invocation_id");

  /**
   * The name of the source on which the triggering operation was performed. For example, in Cloud
   * Storage or S3 corresponds to the bucket name, and in Cosmos DB to the database name.
   */
  public static final AttributeKey<String> FAAS_DOCUMENT_COLLECTION =
      stringKey("faas.document.collection");

  /**
   * The document name/table subjected to the operation. For example, in Cloud Storage or S3 is the
   * name of the file, and in Cosmos DB the table name.
   */
  public static final AttributeKey<String> FAAS_DOCUMENT_NAME = stringKey("faas.document.name");

  /** Describes the type of the operation that was performed on the data. */
  public static final AttributeKey<String> FAAS_DOCUMENT_OPERATION =
      stringKey("faas.document.operation");

  /**
   * A string containing the time when the data was accessed in the <a
   * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format expressed in
   * <a href="https://www.w3.org/TR/NOTE-datetime">UTC</a>.
   */
  public static final AttributeKey<String> FAAS_DOCUMENT_TIME = stringKey("faas.document.time");

  /**
   * A string containing the schedule period as <a
   * href="https://docs.oracle.com/cd/E12058_01/doc/doc.1014/e12030/cron_expressions.htm">Cron
   * Expression</a>.
   */
  public static final AttributeKey<String> FAAS_CRON = stringKey("faas.cron");

  /**
   * A string containing the function invocation time in the <a
   * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format expressed in
   * <a href="https://www.w3.org/TR/NOTE-datetime">UTC</a>.
   */
  public static final AttributeKey<String> FAAS_TIME = stringKey("faas.time");

  /**
   * A boolean that is true if the serverless function is executed for the first time (aka
   * cold-start).
   */
  public static final AttributeKey<Boolean> FAAS_COLDSTART = booleanKey("faas.coldstart");

  /** The unique identifier of the feature flag. */
  public static final AttributeKey<String> FEATURE_FLAG_KEY = stringKey("feature_flag.key");

  /** The name of the service provider that performs the flag evaluation. */
  public static final AttributeKey<String> FEATURE_FLAG_PROVIDER_NAME =
      stringKey("feature_flag.provider_name");

  /**
   * SHOULD be a semantic identifier for a value. If one is unavailable, a stringified version of
   * the value can be used.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>A semantic identifier, commonly referred to as a variant, provides a means for referring
   *       to a value without including the value itself. This can provide additional context for
   *       understanding the meaning behind a value. For example, the variant {@code red} maybe be
   *       used for the value {@code #c05543}.
   *   <li>A stringified version of the value can be used in situations where a semantic identifier
   *       is unavailable. String representation of the value should be determined by the
   *       implementer.
   * </ul>
   */
  public static final AttributeKey<String> FEATURE_FLAG_VARIANT = stringKey("feature_flag.variant");

  /**
   * The AWS request ID as returned in the response headers {@code x-amz-request-id} or {@code
   * x-amz-requestid}.
   */
  public static final AttributeKey<String> AWS_REQUEST_ID = stringKey("aws.request_id");

  /** The value of the {@code AttributesToGet} request parameter. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_ATTRIBUTES_TO_GET =
      stringArrayKey("aws.dynamodb.attributes_to_get");

  /** The value of the {@code ConsistentRead} request parameter. */
  public static final AttributeKey<Boolean> AWS_DYNAMODB_CONSISTENT_READ =
      booleanKey("aws.dynamodb.consistent_read");

  /** The JSON-serialized value of each item in the {@code ConsumedCapacity} response field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_CONSUMED_CAPACITY =
      stringArrayKey("aws.dynamodb.consumed_capacity");

  /** The value of the {@code IndexName} request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_INDEX_NAME =
      stringKey("aws.dynamodb.index_name");

  /** The JSON-serialized value of the {@code ItemCollectionMetrics} response field. */
  public static final AttributeKey<String> AWS_DYNAMODB_ITEM_COLLECTION_METRICS =
      stringKey("aws.dynamodb.item_collection_metrics");

  /** The value of the {@code Limit} request parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_LIMIT = longKey("aws.dynamodb.limit");

  /** The value of the {@code ProjectionExpression} request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_PROJECTION =
      stringKey("aws.dynamodb.projection");

  /** The value of the {@code ProvisionedThroughput.ReadCapacityUnits} request parameter. */
  public static final AttributeKey<Double> AWS_DYNAMODB_PROVISIONED_READ_CAPACITY =
      doubleKey("aws.dynamodb.provisioned_read_capacity");

  /** The value of the {@code ProvisionedThroughput.WriteCapacityUnits} request parameter. */
  public static final AttributeKey<Double> AWS_DYNAMODB_PROVISIONED_WRITE_CAPACITY =
      doubleKey("aws.dynamodb.provisioned_write_capacity");

  /** The value of the {@code Select} request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_SELECT = stringKey("aws.dynamodb.select");

  /** The keys in the {@code RequestItems} object field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_TABLE_NAMES =
      stringArrayKey("aws.dynamodb.table_names");

  /** The JSON-serialized value of each item of the {@code GlobalSecondaryIndexes} request field */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_GLOBAL_SECONDARY_INDEXES =
      stringArrayKey("aws.dynamodb.global_secondary_indexes");

  /** The JSON-serialized value of each item of the {@code LocalSecondaryIndexes} request field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_LOCAL_SECONDARY_INDEXES =
      stringArrayKey("aws.dynamodb.local_secondary_indexes");

  /** The value of the {@code ExclusiveStartTableName} request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_EXCLUSIVE_START_TABLE =
      stringKey("aws.dynamodb.exclusive_start_table");

  /** The the number of items in the {@code TableNames} response parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_TABLE_COUNT =
      longKey("aws.dynamodb.table_count");

  /** The value of the {@code ScanIndexForward} request parameter. */
  public static final AttributeKey<Boolean> AWS_DYNAMODB_SCAN_FORWARD =
      booleanKey("aws.dynamodb.scan_forward");

  /** The value of the {@code Count} response parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_COUNT = longKey("aws.dynamodb.count");

  /** The value of the {@code ScannedCount} response parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_SCANNED_COUNT =
      longKey("aws.dynamodb.scanned_count");

  /** The value of the {@code Segment} request parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_SEGMENT = longKey("aws.dynamodb.segment");

  /** The value of the {@code TotalSegments} request parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_TOTAL_SEGMENTS =
      longKey("aws.dynamodb.total_segments");

  /** The JSON-serialized value of each item in the {@code AttributeDefinitions} request field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_ATTRIBUTE_DEFINITIONS =
      stringArrayKey("aws.dynamodb.attribute_definitions");

  /**
   * The JSON-serialized value of each item in the the {@code GlobalSecondaryIndexUpdates} request
   * field.
   */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_GLOBAL_SECONDARY_INDEX_UPDATES =
      stringArrayKey("aws.dynamodb.global_secondary_index_updates");

  /**
   * The S3 bucket name the request refers to. Corresponds to the {@code --bucket} parameter of the
   * <a href="https://docs.aws.amazon.com/cli/latest/reference/s3api/index.html">S3 API</a>
   * operations.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code bucket} attribute is applicable to all S3 operations that reference a bucket,
   *       i.e. that require the bucket name as a mandatory parameter. This applies to almost all S3
   *       operations except {@code list-buckets}.
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_BUCKET = stringKey("aws.s3.bucket");

  /**
   * The source object (in the form {@code bucket}/{@code key}) for the copy operation.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code copy_source} attribute applies to S3 copy operations and corresponds to the
   *       {@code --copy-source} parameter of the <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/copy-object.html">copy-object
   *       operation within the S3 API</a>. This applies in particular to the following operations:
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/copy-object.html">copy-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html">upload-part-copy</a>
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_COPY_SOURCE = stringKey("aws.s3.copy_source");

  /**
   * The delete request container that specifies the objects to be deleted.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code delete} attribute is only applicable to the <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/delete-object.html">delete-object</a>
   *       operation. The {@code delete} attribute corresponds to the {@code --delete} parameter of
   *       the <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/delete-objects.html">delete-objects
   *       operation within the S3 API</a>.
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_DELETE = stringKey("aws.s3.delete");

  /**
   * The S3 object key the request refers to. Corresponds to the {@code --key} parameter of the <a
   * href="https://docs.aws.amazon.com/cli/latest/reference/s3api/index.html">S3 API</a> operations.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code key} attribute is applicable to all object-related S3 operations, i.e. that
   *       require the object key as a mandatory parameter. This applies in particular to the
   *       following operations:
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/copy-object.html">copy-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/delete-object.html">delete-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/get-object.html">get-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/head-object.html">head-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/put-object.html">put-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/restore-object.html">restore-object</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/select-object-content.html">select-object-content</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/abort-multipart-upload.html">abort-multipart-upload</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/complete-multipart-upload.html">complete-multipart-upload</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/create-multipart-upload.html">create-multipart-upload</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/list-parts.html">list-parts</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html">upload-part</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html">upload-part-copy</a>
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_KEY = stringKey("aws.s3.key");

  /**
   * The part number of the part being uploaded in a multipart-upload operation. This is a positive
   * integer between 1 and 10,000.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code part_number} attribute is only applicable to the <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html">upload-part</a>
   *       and <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html">upload-part-copy</a>
   *       operations. The {@code part_number} attribute corresponds to the {@code --part-number}
   *       parameter of the <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html">upload-part
   *       operation within the S3 API</a>.
   * </ul>
   */
  public static final AttributeKey<Long> AWS_S3_PART_NUMBER = longKey("aws.s3.part_number");

  /**
   * Upload ID that identifies the multipart upload.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code upload_id} attribute applies to S3 multipart-upload operations and corresponds
   *       to the {@code --upload-id} parameter of the <a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/index.html">S3 API</a>
   *       multipart operations. This applies in particular to the following operations:
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/abort-multipart-upload.html">abort-multipart-upload</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/complete-multipart-upload.html">complete-multipart-upload</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/list-parts.html">list-parts</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html">upload-part</a>
   *   <li><a
   *       href="https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html">upload-part-copy</a>
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_UPLOAD_ID = stringKey("aws.s3.upload_id");

  /**
   * The GraphQL document being executed.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value may be sanitized to exclude sensitive information.
   * </ul>
   */
  public static final AttributeKey<String> GRAPHQL_DOCUMENT = stringKey("graphql.document");

  /** The name of the operation being executed. */
  public static final AttributeKey<String> GRAPHQL_OPERATION_NAME =
      stringKey("graphql.operation.name");

  /** The type of the operation being executed. */
  public static final AttributeKey<String> GRAPHQL_OPERATION_TYPE =
      stringKey("graphql.operation.type");

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

  /**
   * SHOULD be set to true if the exception event is recorded at a point where it is known that the
   * exception is escaping the scope of the span.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>An exception is considered to have escaped (or left) the scope of a span, if that span is
   *       ended while the exception is still logically &quot;in flight&quot;. This may be actually
   *       &quot;in flight&quot; in some languages (e.g. if the exception is passed to a Context
   *       manager's {@code __exit__} method in Python) but will usually be caught at the point of
   *       recording the exception in most languages.
   *   <li>It is usually not possible to determine at the point where an exception is thrown whether
   *       it will escape the scope of a span. However, it is trivial to know that an exception will
   *       escape, if one checks for an active exception just before ending the span, as done in the
   *       <a href="#recording-an-exception">example above</a>.
   *   <li>It follows that an exception may still escape the scope of the span even if the {@code
   *       exception.escaped} attribute was not set or set to false, since the event might have been
   *       recorded at a time where it was not clear whether the exception will escape.
   * </ul>
   */
  public static final AttributeKey<Boolean> EXCEPTION_ESCAPED = booleanKey("exception.escaped");

  /**
   * Connect request metadata, {@code <key>} being the normalized Connect Metadata key (lowercase),
   * the value being the metadata values.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Instrumentations SHOULD require an explicit configuration of which metadata values are to
   *       be captured. Including all request metadata values can be a security risk - explicit
   *       configuration helps avoid leaking sensitive information.
   * </ul>
   */
  public static final AttributeKeyTemplate<List<String>> RPC_CONNECT_RPC_REQUEST_METADATA =
      stringArrayKeyTemplate("rpc.connect_rpc.request.metadata");

  /**
   * Connect response metadata, {@code <key>} being the normalized Connect Metadata key (lowercase),
   * the value being the metadata values.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Instrumentations SHOULD require an explicit configuration of which metadata values are to
   *       be captured. Including all response metadata values can be a security risk - explicit
   *       configuration helps avoid leaking sensitive information.
   * </ul>
   */
  public static final AttributeKeyTemplate<List<String>> RPC_CONNECT_RPC_RESPONSE_METADATA =
      stringArrayKeyTemplate("rpc.connect_rpc.response.metadata");

  /**
   * gRPC request metadata, {@code <key>} being the normalized gRPC Metadata key (lowercase), the
   * value being the metadata values.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Instrumentations SHOULD require an explicit configuration of which metadata values are to
   *       be captured. Including all request metadata values can be a security risk - explicit
   *       configuration helps avoid leaking sensitive information.
   * </ul>
   */
  public static final AttributeKeyTemplate<List<String>> RPC_GRPC_REQUEST_METADATA =
      stringArrayKeyTemplate("rpc.grpc.request.metadata");

  /**
   * gRPC response metadata, {@code <key>} being the normalized gRPC Metadata key (lowercase), the
   * value being the metadata values.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Instrumentations SHOULD require an explicit configuration of which metadata values are to
   *       be captured. Including all response metadata values can be a security risk - explicit
   *       configuration helps avoid leaking sensitive information.
   * </ul>
   */
  public static final AttributeKeyTemplate<List<String>> RPC_GRPC_RESPONSE_METADATA =
      stringArrayKeyTemplate("rpc.grpc.response.metadata");

  /**
   * A dynamic value in the url path.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Many Elasticsearch url paths allow dynamic values. These SHOULD be recorded in span
   *       attributes in the format {@code db.elasticsearch.path_parts.<key>}, where {@code <key>}
   *       is the url path part name. The implementation SHOULD reference the <a
   *       href="https://raw.githubusercontent.com/elastic/elasticsearch-specification/main/output/schema/schema.json">elasticsearch
   *       schema</a> in order to map the path part values to their names.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> DB_ELASTICSEARCH_PATH_PARTS =
      stringKeyTemplate("db.elasticsearch.path_parts");

  // Enum definitions
  public static final class FaasInvokedProviderValues {
    /** Alibaba Cloud. */
    public static final String ALIBABA_CLOUD = "alibaba_cloud";

    /** Amazon Web Services. */
    public static final String AWS = "aws";

    /** Microsoft Azure. */
    public static final String AZURE = "azure";

    /** Google Cloud Platform. */
    public static final String GCP = "gcp";

    /** Tencent Cloud. */
    public static final String TENCENT_CLOUD = "tencent_cloud";

    private FaasInvokedProviderValues() {}
  }

  public static final class FaasTriggerValues {
    /** A response to some data source operation such as a database or filesystem read/write. */
    public static final String DATASOURCE = "datasource";

    /** To provide an answer to an inbound HTTP request. */
    public static final String HTTP = "http";

    /** A function is set to be executed when messages are sent to a messaging system. */
    public static final String PUBSUB = "pubsub";

    /** A function is scheduled to be executed regularly. */
    public static final String TIMER = "timer";

    /** If none of the others apply. */
    public static final String OTHER = "other";

    private FaasTriggerValues() {}
  }

  public static final class EventDomainValues {
    /** Events from browser apps. */
    public static final String BROWSER = "browser";

    /** Events from mobile apps. */
    public static final String DEVICE = "device";

    /** Events from Kubernetes. */
    public static final String K8S = "k8s";

    private EventDomainValues() {}
  }

  public static final class LogIostreamValues {
    /** Logs from stdout stream. */
    public static final String STDOUT = "stdout";

    /** Events from stderr stream. */
    public static final String STDERR = "stderr";

    private LogIostreamValues() {}
  }

  public static final class IosStateValues {
    /**
     * The app has become `active`. Associated with UIKit notification `applicationDidBecomeActive`.
     */
    public static final String ACTIVE = "active";

    /**
     * The app is now `inactive`. Associated with UIKit notification `applicationWillResignActive`.
     */
    public static final String INACTIVE = "inactive";

    /**
     * The app is now in the background. This value is associated with UIKit notification
     * `applicationDidEnterBackground`.
     */
    public static final String BACKGROUND = "background";

    /**
     * The app is now in the foreground. This value is associated with UIKit notification
     * `applicationWillEnterForeground`.
     */
    public static final String FOREGROUND = "foreground";

    /**
     * The app is about to terminate. Associated with UIKit notification `applicationWillTerminate`.
     */
    public static final String TERMINATE = "terminate";

    private IosStateValues() {}
  }

  public static final class AndroidStateValues {
    /**
     * Any time before Activity.onResume() or, if the app has no Activity, Context.startService()
     * has been called in the app for the first time.
     */
    public static final String CREATED = "created";

    /**
     * Any time after Activity.onPause() or, if the app has no Activity, Context.stopService() has
     * been called when the app was in the foreground state.
     */
    public static final String BACKGROUND = "background";

    /**
     * Any time after Activity.onResume() or, if the app has no Activity, Context.startService() has
     * been called when the app was in either the created or background states.
     */
    public static final String FOREGROUND = "foreground";

    private AndroidStateValues() {}
  }

  public static final class StateValues {
    /** idle. */
    public static final String IDLE = "idle";

    /** used. */
    public static final String USED = "used";

    private StateValues() {}
  }

  public static final class JvmMemoryTypeValues {
    /** Heap memory. */
    public static final String HEAP = "heap";

    /** Non-heap memory. */
    public static final String NON_HEAP = "non_heap";

    private JvmMemoryTypeValues() {}
  }

  public static final class JvmThreadStateValues {
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

    private JvmThreadStateValues() {}
  }

  public static final class SystemCpuStateValues {
    /** user. */
    public static final String USER = "user";

    /** system. */
    public static final String SYSTEM = "system";

    /** nice. */
    public static final String NICE = "nice";

    /** idle. */
    public static final String IDLE = "idle";

    /** iowait. */
    public static final String IOWAIT = "iowait";

    /** interrupt. */
    public static final String INTERRUPT = "interrupt";

    /** steal. */
    public static final String STEAL = "steal";

    private SystemCpuStateValues() {}
  }

  public static final class SystemMemoryStateValues {
    /** used. */
    public static final String USED = "used";

    /** free. */
    public static final String FREE = "free";

    /** shared. */
    public static final String SHARED = "shared";

    /** buffers. */
    public static final String BUFFERS = "buffers";

    /** cached. */
    public static final String CACHED = "cached";

    private SystemMemoryStateValues() {}
  }

  public static final class SystemPagingDirectionValues {
    /** in. */
    public static final String IN = "in";

    /** out. */
    public static final String OUT = "out";

    private SystemPagingDirectionValues() {}
  }

  public static final class SystemPagingStateValues {
    /** used. */
    public static final String USED = "used";

    /** free. */
    public static final String FREE = "free";

    private SystemPagingStateValues() {}
  }

  public static final class SystemPagingTypeValues {
    /** major. */
    public static final String MAJOR = "major";

    /** minor. */
    public static final String MINOR = "minor";

    private SystemPagingTypeValues() {}
  }

  public static final class SystemDiskDirectionValues {
    /** read. */
    public static final String READ = "read";

    /** write. */
    public static final String WRITE = "write";

    private SystemDiskDirectionValues() {}
  }

  public static final class SystemFilesystemStateValues {
    /** used. */
    public static final String USED = "used";

    /** free. */
    public static final String FREE = "free";

    /** reserved. */
    public static final String RESERVED = "reserved";

    private SystemFilesystemStateValues() {}
  }

  public static final class SystemFilesystemTypeValues {
    /** fat32. */
    public static final String FAT32 = "fat32";

    /** exfat. */
    public static final String EXFAT = "exfat";

    /** ntfs. */
    public static final String NTFS = "ntfs";

    /** refs. */
    public static final String REFS = "refs";

    /** hfsplus. */
    public static final String HFSPLUS = "hfsplus";

    /** ext4. */
    public static final String EXT4 = "ext4";

    private SystemFilesystemTypeValues() {}
  }

  public static final class SystemNetworkDirectionValues {
    /** transmit. */
    public static final String TRANSMIT = "transmit";

    /** receive. */
    public static final String RECEIVE = "receive";

    private SystemNetworkDirectionValues() {}
  }

  public static final class SystemNetworkStateValues {
    /** close. */
    public static final String CLOSE = "close";

    /** close_wait. */
    public static final String CLOSE_WAIT = "close_wait";

    /** closing. */
    public static final String CLOSING = "closing";

    /** delete. */
    public static final String DELETE = "delete";

    /** established. */
    public static final String ESTABLISHED = "established";

    /** fin_wait_1. */
    public static final String FIN_WAIT_1 = "fin_wait_1";

    /** fin_wait_2. */
    public static final String FIN_WAIT_2 = "fin_wait_2";

    /** last_ack. */
    public static final String LAST_ACK = "last_ack";

    /** listen. */
    public static final String LISTEN = "listen";

    /** syn_recv. */
    public static final String SYN_RECV = "syn_recv";

    /** syn_sent. */
    public static final String SYN_SENT = "syn_sent";

    /** time_wait. */
    public static final String TIME_WAIT = "time_wait";

    private SystemNetworkStateValues() {}
  }

  public static final class SystemProcessesStatusValues {
    /** running. */
    public static final String RUNNING = "running";

    /** sleeping. */
    public static final String SLEEPING = "sleeping";

    /** stopped. */
    public static final String STOPPED = "stopped";

    /** defunct. */
    public static final String DEFUNCT = "defunct";

    private SystemProcessesStatusValues() {}
  }

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

  public static final class MessagingRocketmqConsumptionModelValues {
    /** Clustering consumption model. */
    public static final String CLUSTERING = "clustering";

    /** Broadcasting consumption model. */
    public static final String BROADCASTING = "broadcasting";

    private MessagingRocketmqConsumptionModelValues() {}
  }

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

  public static final class NetworkConnectionSubtypeValues {
    /** GPRS. */
    public static final String GPRS = "gprs";

    /** EDGE. */
    public static final String EDGE = "edge";

    /** UMTS. */
    public static final String UMTS = "umts";

    /** CDMA. */
    public static final String CDMA = "cdma";

    /** EVDO Rel. 0. */
    public static final String EVDO_0 = "evdo_0";

    /** EVDO Rev. A. */
    public static final String EVDO_A = "evdo_a";

    /** CDMA2000 1XRTT. */
    public static final String CDMA2000_1XRTT = "cdma2000_1xrtt";

    /** HSDPA. */
    public static final String HSDPA = "hsdpa";

    /** HSUPA. */
    public static final String HSUPA = "hsupa";

    /** HSPA. */
    public static final String HSPA = "hspa";

    /** IDEN. */
    public static final String IDEN = "iden";

    /** EVDO Rev. B. */
    public static final String EVDO_B = "evdo_b";

    /** LTE. */
    public static final String LTE = "lte";

    /** EHRPD. */
    public static final String EHRPD = "ehrpd";

    /** HSPAP. */
    public static final String HSPAP = "hspap";

    /** GSM. */
    public static final String GSM = "gsm";

    /** TD-SCDMA. */
    public static final String TD_SCDMA = "td_scdma";

    /** IWLAN. */
    public static final String IWLAN = "iwlan";

    /** 5G NR (New Radio). */
    public static final String NR = "nr";

    /** 5G NRNSA (New Radio Non-Standalone). */
    public static final String NRNSA = "nrnsa";

    /** LTE CA. */
    public static final String LTE_CA = "lte_ca";

    private NetworkConnectionSubtypeValues() {}
  }

  public static final class NetworkConnectionTypeValues {
    /** wifi. */
    public static final String WIFI = "wifi";

    /** wired. */
    public static final String WIRED = "wired";

    /** cell. */
    public static final String CELL = "cell";

    /** unavailable. */
    public static final String UNAVAILABLE = "unavailable";

    /** unknown. */
    public static final String UNKNOWN = "unknown";

    private NetworkConnectionTypeValues() {}
  }

  public static final class RpcConnectRpcErrorCodeValues {
    /** cancelled. */
    public static final String CANCELLED = "cancelled";

    /** unknown. */
    public static final String UNKNOWN = "unknown";

    /** invalid_argument. */
    public static final String INVALID_ARGUMENT = "invalid_argument";

    /** deadline_exceeded. */
    public static final String DEADLINE_EXCEEDED = "deadline_exceeded";

    /** not_found. */
    public static final String NOT_FOUND = "not_found";

    /** already_exists. */
    public static final String ALREADY_EXISTS = "already_exists";

    /** permission_denied. */
    public static final String PERMISSION_DENIED = "permission_denied";

    /** resource_exhausted. */
    public static final String RESOURCE_EXHAUSTED = "resource_exhausted";

    /** failed_precondition. */
    public static final String FAILED_PRECONDITION = "failed_precondition";

    /** aborted. */
    public static final String ABORTED = "aborted";

    /** out_of_range. */
    public static final String OUT_OF_RANGE = "out_of_range";

    /** unimplemented. */
    public static final String UNIMPLEMENTED = "unimplemented";

    /** internal. */
    public static final String INTERNAL = "internal";

    /** unavailable. */
    public static final String UNAVAILABLE = "unavailable";

    /** data_loss. */
    public static final String DATA_LOSS = "data_loss";

    /** unauthenticated. */
    public static final String UNAUTHENTICATED = "unauthenticated";

    private RpcConnectRpcErrorCodeValues() {}
  }

  public static final class RpcGrpcStatusCodeValues {
    /** OK. */
    public static final long OK = 0;

    /** CANCELLED. */
    public static final long CANCELLED = 1;

    /** UNKNOWN. */
    public static final long UNKNOWN = 2;

    /** INVALID_ARGUMENT. */
    public static final long INVALID_ARGUMENT = 3;

    /** DEADLINE_EXCEEDED. */
    public static final long DEADLINE_EXCEEDED = 4;

    /** NOT_FOUND. */
    public static final long NOT_FOUND = 5;

    /** ALREADY_EXISTS. */
    public static final long ALREADY_EXISTS = 6;

    /** PERMISSION_DENIED. */
    public static final long PERMISSION_DENIED = 7;

    /** RESOURCE_EXHAUSTED. */
    public static final long RESOURCE_EXHAUSTED = 8;

    /** FAILED_PRECONDITION. */
    public static final long FAILED_PRECONDITION = 9;

    /** ABORTED. */
    public static final long ABORTED = 10;

    /** OUT_OF_RANGE. */
    public static final long OUT_OF_RANGE = 11;

    /** UNIMPLEMENTED. */
    public static final long UNIMPLEMENTED = 12;

    /** INTERNAL. */
    public static final long INTERNAL = 13;

    /** UNAVAILABLE. */
    public static final long UNAVAILABLE = 14;

    /** DATA_LOSS. */
    public static final long DATA_LOSS = 15;

    /** UNAUTHENTICATED. */
    public static final long UNAUTHENTICATED = 16;

    private RpcGrpcStatusCodeValues() {}
  }

  public static final class RpcSystemValues {
    /** gRPC. */
    public static final String GRPC = "grpc";

    /** Java RMI. */
    public static final String JAVA_RMI = "java_rmi";

    /** .NET WCF. */
    public static final String DOTNET_WCF = "dotnet_wcf";

    /** Apache Dubbo. */
    public static final String APACHE_DUBBO = "apache_dubbo";

    /** Connect RPC. */
    public static final String CONNECT_RPC = "connect_rpc";

    private RpcSystemValues() {}
  }

  public static final class OpentracingRefTypeValues {
    /** The parent Span depends on the child Span in some capacity. */
    public static final String CHILD_OF = "child_of";

    /** The parent Span doesn&#39;t depend in any way on the result of the child Span. */
    public static final String FOLLOWS_FROM = "follows_from";

    private OpentracingRefTypeValues() {}
  }

  public static final class DbSystemValues {
    /** Some other SQL database. Fallback only. See notes. */
    public static final String OTHER_SQL = "other_sql";

    /** Microsoft SQL Server. */
    public static final String MSSQL = "mssql";

    /** Microsoft SQL Server Compact. */
    public static final String MSSQLCOMPACT = "mssqlcompact";

    /** MySQL. */
    public static final String MYSQL = "mysql";

    /** Oracle Database. */
    public static final String ORACLE = "oracle";

    /** IBM Db2. */
    public static final String DB2 = "db2";

    /** PostgreSQL. */
    public static final String POSTGRESQL = "postgresql";

    /** Amazon Redshift. */
    public static final String REDSHIFT = "redshift";

    /** Apache Hive. */
    public static final String HIVE = "hive";

    /** Cloudscape. */
    public static final String CLOUDSCAPE = "cloudscape";

    /** HyperSQL DataBase. */
    public static final String HSQLDB = "hsqldb";

    /** Progress Database. */
    public static final String PROGRESS = "progress";

    /** SAP MaxDB. */
    public static final String MAXDB = "maxdb";

    /** SAP HANA. */
    public static final String HANADB = "hanadb";

    /** Ingres. */
    public static final String INGRES = "ingres";

    /** FirstSQL. */
    public static final String FIRSTSQL = "firstsql";

    /** EnterpriseDB. */
    public static final String EDB = "edb";

    /** InterSystems Caché. */
    public static final String CACHE = "cache";

    /** Adabas (Adaptable Database System). */
    public static final String ADABAS = "adabas";

    /** Firebird. */
    public static final String FIREBIRD = "firebird";

    /** Apache Derby. */
    public static final String DERBY = "derby";

    /** FileMaker. */
    public static final String FILEMAKER = "filemaker";

    /** Informix. */
    public static final String INFORMIX = "informix";

    /** InstantDB. */
    public static final String INSTANTDB = "instantdb";

    /** InterBase. */
    public static final String INTERBASE = "interbase";

    /** MariaDB. */
    public static final String MARIADB = "mariadb";

    /** Netezza. */
    public static final String NETEZZA = "netezza";

    /** Pervasive PSQL. */
    public static final String PERVASIVE = "pervasive";

    /** PointBase. */
    public static final String POINTBASE = "pointbase";

    /** SQLite. */
    public static final String SQLITE = "sqlite";

    /** Sybase. */
    public static final String SYBASE = "sybase";

    /** Teradata. */
    public static final String TERADATA = "teradata";

    /** Vertica. */
    public static final String VERTICA = "vertica";

    /** H2. */
    public static final String H2 = "h2";

    /** ColdFusion IMQ. */
    public static final String COLDFUSION = "coldfusion";

    /** Apache Cassandra. */
    public static final String CASSANDRA = "cassandra";

    /** Apache HBase. */
    public static final String HBASE = "hbase";

    /** MongoDB. */
    public static final String MONGODB = "mongodb";

    /** Redis. */
    public static final String REDIS = "redis";

    /** Couchbase. */
    public static final String COUCHBASE = "couchbase";

    /** CouchDB. */
    public static final String COUCHDB = "couchdb";

    /** Microsoft Azure Cosmos DB. */
    public static final String COSMOSDB = "cosmosdb";

    /** Amazon DynamoDB. */
    public static final String DYNAMODB = "dynamodb";

    /** Neo4j. */
    public static final String NEO4J = "neo4j";

    /** Apache Geode. */
    public static final String GEODE = "geode";

    /** Elasticsearch. */
    public static final String ELASTICSEARCH = "elasticsearch";

    /** Memcached. */
    public static final String MEMCACHED = "memcached";

    /** CockroachDB. */
    public static final String COCKROACHDB = "cockroachdb";

    /** OpenSearch. */
    public static final String OPENSEARCH = "opensearch";

    /** ClickHouse. */
    public static final String CLICKHOUSE = "clickhouse";

    /** Cloud Spanner. */
    public static final String SPANNER = "spanner";

    /** Trino. */
    public static final String TRINO = "trino";

    private DbSystemValues() {}
  }

  public static final class DbCassandraConsistencyLevelValues {
    /** all. */
    public static final String ALL = "all";

    /** each_quorum. */
    public static final String EACH_QUORUM = "each_quorum";

    /** quorum. */
    public static final String QUORUM = "quorum";

    /** local_quorum. */
    public static final String LOCAL_QUORUM = "local_quorum";

    /** one. */
    public static final String ONE = "one";

    /** two. */
    public static final String TWO = "two";

    /** three. */
    public static final String THREE = "three";

    /** local_one. */
    public static final String LOCAL_ONE = "local_one";

    /** any. */
    public static final String ANY = "any";

    /** serial. */
    public static final String SERIAL = "serial";

    /** local_serial. */
    public static final String LOCAL_SERIAL = "local_serial";

    private DbCassandraConsistencyLevelValues() {}
  }

  public static final class DbCosmosdbConnectionModeValues {
    /** Gateway (HTTP) connections mode. */
    public static final String GATEWAY = "gateway";

    /** Direct connection. */
    public static final String DIRECT = "direct";

    private DbCosmosdbConnectionModeValues() {}
  }

  public static final class DbCosmosdbOperationTypeValues {
    /** invalid. */
    public static final String INVALID = "Invalid";

    /** create. */
    public static final String CREATE = "Create";

    /** patch. */
    public static final String PATCH = "Patch";

    /** read. */
    public static final String READ = "Read";

    /** read_feed. */
    public static final String READ_FEED = "ReadFeed";

    /** delete. */
    public static final String DELETE = "Delete";

    /** replace. */
    public static final String REPLACE = "Replace";

    /** execute. */
    public static final String EXECUTE = "Execute";

    /** query. */
    public static final String QUERY = "Query";

    /** head. */
    public static final String HEAD = "Head";

    /** head_feed. */
    public static final String HEAD_FEED = "HeadFeed";

    /** upsert. */
    public static final String UPSERT = "Upsert";

    /** batch. */
    public static final String BATCH = "Batch";

    /** query_plan. */
    public static final String QUERY_PLAN = "QueryPlan";

    /** execute_javascript. */
    public static final String EXECUTE_JAVASCRIPT = "ExecuteJavaScript";

    private DbCosmosdbOperationTypeValues() {}
  }

  public static final class OtelStatusCodeValues {
    /**
     * The operation has been validated by an Application developer or Operator to have completed
     * successfully.
     */
    public static final String OK = "OK";

    /** The operation contains an error. */
    public static final String ERROR = "ERROR";

    private OtelStatusCodeValues() {}
  }

  public static final class FaasDocumentOperationValues {
    /** When a new object is created. */
    public static final String INSERT = "insert";

    /** When an object is modified. */
    public static final String EDIT = "edit";

    /** When an object is deleted. */
    public static final String DELETE = "delete";

    private FaasDocumentOperationValues() {}
  }

  public static final class GraphqlOperationTypeValues {
    /** GraphQL query. */
    public static final String QUERY = "query";

    /** GraphQL mutation. */
    public static final String MUTATION = "mutation";

    /** GraphQL subscription. */
    public static final String SUBSCRIPTION = "subscription";

    private GraphqlOperationTypeValues() {}
  }

  public static final class MessageTypeValues {
    /** sent. */
    public static final String SENT = "SENT";

    /** received. */
    public static final String RECEIVED = "RECEIVED";

    private MessageTypeValues() {}
  }

  private IncubatingSemanticAttributes() {}
}
