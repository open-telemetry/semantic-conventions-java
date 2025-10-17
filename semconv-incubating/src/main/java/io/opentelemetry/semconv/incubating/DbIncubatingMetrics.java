/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class DbIncubatingMetrics {

  /** Name of the {@code db.client.connection.count} metric. */
  public static final String DB_CLIENT_CONNECTION_COUNT_NAME = "db.client.connection.count";

  /** Unit of the {@code db.client.connection.count} metric. */
  public static final String DB_CLIENT_CONNECTION_COUNT_UNIT = "{connection}";

  /** Description of the {@code db.client.connection.count} metric. */
  public static final String DB_CLIENT_CONNECTION_COUNT_DESCRIPTION =
      "The number of connections that are currently in state described by the `state` attribute.";

  /** Name of the {@code db.client.connection.create_time} metric. */
  public static final String DB_CLIENT_CONNECTION_CREATE_TIME_NAME =
      "db.client.connection.create_time";

  /** Unit of the {@code db.client.connection.create_time} metric. */
  public static final String DB_CLIENT_CONNECTION_CREATE_TIME_UNIT = "s";

  /** Description of the {@code db.client.connection.create_time} metric. */
  public static final String DB_CLIENT_CONNECTION_CREATE_TIME_DESCRIPTION =
      "The time it took to create a new connection.";

  /** Name of the {@code db.client.connection.idle.max} metric. */
  public static final String DB_CLIENT_CONNECTION_IDLE_MAX_NAME = "db.client.connection.idle.max";

  /** Unit of the {@code db.client.connection.idle.max} metric. */
  public static final String DB_CLIENT_CONNECTION_IDLE_MAX_UNIT = "{connection}";

  /** Description of the {@code db.client.connection.idle.max} metric. */
  public static final String DB_CLIENT_CONNECTION_IDLE_MAX_DESCRIPTION =
      "The maximum number of idle open connections allowed.";

  /** Name of the {@code db.client.connection.idle.min} metric. */
  public static final String DB_CLIENT_CONNECTION_IDLE_MIN_NAME = "db.client.connection.idle.min";

  /** Unit of the {@code db.client.connection.idle.min} metric. */
  public static final String DB_CLIENT_CONNECTION_IDLE_MIN_UNIT = "{connection}";

  /** Description of the {@code db.client.connection.idle.min} metric. */
  public static final String DB_CLIENT_CONNECTION_IDLE_MIN_DESCRIPTION =
      "The minimum number of idle open connections allowed.";

  /** Name of the {@code db.client.connection.max} metric. */
  public static final String DB_CLIENT_CONNECTION_MAX_NAME = "db.client.connection.max";

  /** Unit of the {@code db.client.connection.max} metric. */
  public static final String DB_CLIENT_CONNECTION_MAX_UNIT = "{connection}";

  /** Description of the {@code db.client.connection.max} metric. */
  public static final String DB_CLIENT_CONNECTION_MAX_DESCRIPTION =
      "The maximum number of open connections allowed.";

  /** Name of the {@code db.client.connection.pending_requests} metric. */
  public static final String DB_CLIENT_CONNECTION_PENDING_REQUESTS_NAME =
      "db.client.connection.pending_requests";

  /** Unit of the {@code db.client.connection.pending_requests} metric. */
  public static final String DB_CLIENT_CONNECTION_PENDING_REQUESTS_UNIT = "{request}";

  /** Description of the {@code db.client.connection.pending_requests} metric. */
  public static final String DB_CLIENT_CONNECTION_PENDING_REQUESTS_DESCRIPTION =
      "The number of current pending requests for an open connection.";

  /** Name of the {@code db.client.connection.timeouts} metric. */
  public static final String DB_CLIENT_CONNECTION_TIMEOUTS_NAME = "db.client.connection.timeouts";

  /** Unit of the {@code db.client.connection.timeouts} metric. */
  public static final String DB_CLIENT_CONNECTION_TIMEOUTS_UNIT = "{timeout}";

  /** Description of the {@code db.client.connection.timeouts} metric. */
  public static final String DB_CLIENT_CONNECTION_TIMEOUTS_DESCRIPTION =
      "The number of connection timeouts that have occurred trying to obtain a connection from the pool.";

  /** Name of the {@code db.client.connection.use_time} metric. */
  public static final String DB_CLIENT_CONNECTION_USE_TIME_NAME = "db.client.connection.use_time";

  /** Unit of the {@code db.client.connection.use_time} metric. */
  public static final String DB_CLIENT_CONNECTION_USE_TIME_UNIT = "s";

  /** Description of the {@code db.client.connection.use_time} metric. */
  public static final String DB_CLIENT_CONNECTION_USE_TIME_DESCRIPTION =
      "The time between borrowing a connection and returning it to the pool.";

  /** Name of the {@code db.client.connection.wait_time} metric. */
  public static final String DB_CLIENT_CONNECTION_WAIT_TIME_NAME = "db.client.connection.wait_time";

  /** Unit of the {@code db.client.connection.wait_time} metric. */
  public static final String DB_CLIENT_CONNECTION_WAIT_TIME_UNIT = "s";

  /** Description of the {@code db.client.connection.wait_time} metric. */
  public static final String DB_CLIENT_CONNECTION_WAIT_TIME_DESCRIPTION =
      "The time it took to obtain an open connection from the pool.";

  /** Name of the {@code db.client.connections.create_time} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_CREATE_TIME_NAME =
      "db.client.connections.create_time";

  /** Unit of the {@code db.client.connections.create_time} metric. */
  @Deprecated public static final String DB_CLIENT_CONNECTIONS_CREATE_TIME_UNIT = "ms";

  /** Description of the {@code db.client.connections.create_time} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_CREATE_TIME_DESCRIPTION =
      "Deprecated, use `db.client.connection.create_time` instead. Note: the unit also changed from `ms` to `s`.";

  /** Name of the {@code db.client.connections.idle.max} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_IDLE_MAX_NAME = "db.client.connections.idle.max";

  /** Unit of the {@code db.client.connections.idle.max} metric. */
  @Deprecated public static final String DB_CLIENT_CONNECTIONS_IDLE_MAX_UNIT = "{connection}";

  /** Description of the {@code db.client.connections.idle.max} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_IDLE_MAX_DESCRIPTION =
      "Deprecated, use `db.client.connection.idle.max` instead.";

  /** Name of the {@code db.client.connections.idle.min} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_IDLE_MIN_NAME = "db.client.connections.idle.min";

  /** Unit of the {@code db.client.connections.idle.min} metric. */
  @Deprecated public static final String DB_CLIENT_CONNECTIONS_IDLE_MIN_UNIT = "{connection}";

  /** Description of the {@code db.client.connections.idle.min} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_IDLE_MIN_DESCRIPTION =
      "Deprecated, use `db.client.connection.idle.min` instead.";

  /** Name of the {@code db.client.connections.max} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_MAX_NAME = "db.client.connections.max";

  /** Unit of the {@code db.client.connections.max} metric. */
  @Deprecated public static final String DB_CLIENT_CONNECTIONS_MAX_UNIT = "{connection}";

  /** Description of the {@code db.client.connections.max} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_MAX_DESCRIPTION =
      "Deprecated, use `db.client.connection.max` instead.";

  /** Name of the {@code db.client.connections.pending_requests} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_PENDING_REQUESTS_NAME =
      "db.client.connections.pending_requests";

  /** Unit of the {@code db.client.connections.pending_requests} metric. */
  @Deprecated public static final String DB_CLIENT_CONNECTIONS_PENDING_REQUESTS_UNIT = "{request}";

  /** Description of the {@code db.client.connections.pending_requests} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_PENDING_REQUESTS_DESCRIPTION =
      "Deprecated, use `db.client.connection.pending_requests` instead.";

  /** Name of the {@code db.client.connections.timeouts} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_TIMEOUTS_NAME = "db.client.connections.timeouts";

  /** Unit of the {@code db.client.connections.timeouts} metric. */
  @Deprecated public static final String DB_CLIENT_CONNECTIONS_TIMEOUTS_UNIT = "{timeout}";

  /** Description of the {@code db.client.connections.timeouts} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_TIMEOUTS_DESCRIPTION =
      "Deprecated, use `db.client.connection.timeouts` instead.";

  /** Name of the {@code db.client.connections.usage} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_USAGE_NAME = "db.client.connections.usage";

  /** Unit of the {@code db.client.connections.usage} metric. */
  @Deprecated public static final String DB_CLIENT_CONNECTIONS_USAGE_UNIT = "{connection}";

  /** Description of the {@code db.client.connections.usage} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_USAGE_DESCRIPTION =
      "Deprecated, use `db.client.connection.count` instead.";

  /** Name of the {@code db.client.connections.use_time} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_USE_TIME_NAME = "db.client.connections.use_time";

  /** Unit of the {@code db.client.connections.use_time} metric. */
  @Deprecated public static final String DB_CLIENT_CONNECTIONS_USE_TIME_UNIT = "ms";

  /** Description of the {@code db.client.connections.use_time} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_USE_TIME_DESCRIPTION =
      "Deprecated, use `db.client.connection.use_time` instead. Note: the unit also changed from `ms` to `s`.";

  /** Name of the {@code db.client.connections.wait_time} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_WAIT_TIME_NAME =
      "db.client.connections.wait_time";

  /** Unit of the {@code db.client.connections.wait_time} metric. */
  @Deprecated public static final String DB_CLIENT_CONNECTIONS_WAIT_TIME_UNIT = "ms";

  /** Description of the {@code db.client.connections.wait_time} metric. */
  @Deprecated
  public static final String DB_CLIENT_CONNECTIONS_WAIT_TIME_DESCRIPTION =
      "Deprecated, use `db.client.connection.wait_time` instead. Note: the unit also changed from `ms` to `s`.";

  /** Name of the {@code db.client.cosmosdb.active_instance.count} metric. */
  @Deprecated
  public static final String DB_CLIENT_COSMOSDB_ACTIVE_INSTANCE_COUNT_NAME =
      "db.client.cosmosdb.active_instance.count";

  /** Unit of the {@code db.client.cosmosdb.active_instance.count} metric. */
  @Deprecated
  public static final String DB_CLIENT_COSMOSDB_ACTIVE_INSTANCE_COUNT_UNIT = "{instance}";

  /** Description of the {@code db.client.cosmosdb.active_instance.count} metric. */
  @Deprecated
  public static final String DB_CLIENT_COSMOSDB_ACTIVE_INSTANCE_COUNT_DESCRIPTION =
      "Deprecated, use `azure.cosmosdb.client.active_instance.count` instead.";

  /** Name of the {@code db.client.cosmosdb.operation.request_charge} metric. */
  @Deprecated
  public static final String DB_CLIENT_COSMOSDB_OPERATION_REQUEST_CHARGE_NAME =
      "db.client.cosmosdb.operation.request_charge";

  /** Unit of the {@code db.client.cosmosdb.operation.request_charge} metric. */
  @Deprecated
  public static final String DB_CLIENT_COSMOSDB_OPERATION_REQUEST_CHARGE_UNIT = "{request_unit}";

  /** Description of the {@code db.client.cosmosdb.operation.request_charge} metric. */
  @Deprecated
  public static final String DB_CLIENT_COSMOSDB_OPERATION_REQUEST_CHARGE_DESCRIPTION =
      "Deprecated, use `azure.cosmosdb.client.operation.request_charge` instead.";

  /** Name of the {@code db.client.operation.duration} metric. */
  public static final String DB_CLIENT_OPERATION_DURATION_NAME = "db.client.operation.duration";

  /** Unit of the {@code db.client.operation.duration} metric. */
  public static final String DB_CLIENT_OPERATION_DURATION_UNIT = "s";

  /** Description of the {@code db.client.operation.duration} metric. */
  public static final String DB_CLIENT_OPERATION_DURATION_DESCRIPTION =
      "Duration of database client operations.";

  /** Name of the {@code db.client.response.returned_rows} metric. */
  public static final String DB_CLIENT_RESPONSE_RETURNED_ROWS_NAME =
      "db.client.response.returned_rows";

  /** Unit of the {@code db.client.response.returned_rows} metric. */
  public static final String DB_CLIENT_RESPONSE_RETURNED_ROWS_UNIT = "{row}";

  /** Description of the {@code db.client.response.returned_rows} metric. */
  public static final String DB_CLIENT_RESPONSE_RETURNED_ROWS_DESCRIPTION =
      "The actual number of records returned by the database operation.";

  private DbIncubatingMetrics() {}
}
