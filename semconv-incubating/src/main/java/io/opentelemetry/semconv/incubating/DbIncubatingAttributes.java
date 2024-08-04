/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.doubleKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class DbIncubatingAttributes {

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
   * Deprecated, use {@code db.collection.name} instead.
   *
   * @deprecated Deprecated, use `db.collection.name` instead.
   */
  @Deprecated
  public static final AttributeKey<String> DB_CASSANDRA_TABLE = stringKey("db.cassandra.table");

  /**
   * The name of the connection pool; unique within the instrumented application. In case the
   * connection pool implementation doesn't provide a name, instrumentation SHOULD use a combination
   * of parameters that would make the name unique, for example, combining attributes {@code
   * server.address}, {@code server.port}, and {@code db.namespace}, formatted as {@code
   * server.address:server.port/db.namespace}. Instrumentations that generate connection pool name
   * following different patterns SHOULD document it.
   */
  public static final AttributeKey<String> DB_CLIENT_CONNECTION_POOL_NAME =
      stringKey("db.client.connection.pool.name");

  /** The state of a connection in the pool */
  public static final AttributeKey<String> DB_CLIENT_CONNECTION_STATE =
      stringKey("db.client.connection.state");

  /**
   * Deprecated, use {@code db.client.connection.pool.name} instead.
   *
   * @deprecated Deprecated, use `db.client.connection.pool.name` instead.
   */
  @Deprecated
  public static final AttributeKey<String> DB_CLIENT_CONNECTIONS_POOL_NAME =
      stringKey("db.client.connections.pool.name");

  /**
   * Deprecated, use {@code db.client.connection.state} instead.
   *
   * @deprecated Deprecated, use `db.client.connection.state` instead.
   */
  @Deprecated
  public static final AttributeKey<String> DB_CLIENT_CONNECTIONS_STATE =
      stringKey("db.client.connections.state");

  /**
   * The name of a collection (table, container) within the database.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>It is RECOMMENDED to capture the value as provided by the application without attempting
   *       to do any case normalization. If the collection name is parsed from the query text, it
   *       SHOULD be the first collection name found in the query and it SHOULD match the value
   *       provided in the query text including any schema and database name prefix. For batch
   *       operations, if the individual operations are known to have the same collection name then
   *       that collection name SHOULD be used, otherwise {@code db.collection.name} SHOULD NOT be
   *       captured.
   * </ul>
   */
  public static final AttributeKey<String> DB_COLLECTION_NAME = stringKey("db.collection.name");

  /**
   * Deprecated, use {@code server.address}, {@code server.port} attributes instead.
   *
   * @deprecated Deprecated, use `server.address`, `server.port` attributes instead.
   */
  @Deprecated
  public static final AttributeKey<String> DB_CONNECTION_STRING = stringKey("db.connection_string");

  /** Unique Cosmos client instance id. */
  public static final AttributeKey<String> DB_COSMOSDB_CLIENT_ID =
      stringKey("db.cosmosdb.client_id");

  /** Cosmos client connection mode. */
  public static final AttributeKey<String> DB_COSMOSDB_CONNECTION_MODE =
      stringKey("db.cosmosdb.connection_mode");

  /**
   * Deprecated, use {@code db.collection.name} instead.
   *
   * @deprecated Deprecated, use `db.collection.name` instead.
   */
  @Deprecated
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
   * Deprecated, use {@code db.namespace} instead.
   *
   * @deprecated Deprecated, use `db.namespace` instead.
   */
  @Deprecated
  public static final AttributeKey<String> DB_ELASTICSEARCH_CLUSTER_NAME =
      stringKey("db.elasticsearch.cluster.name");

  /**
   * Represents the human-readable identifier of the node/instance to which a request was routed.
   */
  public static final AttributeKey<String> DB_ELASTICSEARCH_NODE_NAME =
      stringKey("db.elasticsearch.node.name");

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

  /**
   * Deprecated, no general replacement at this time. For Elasticsearch, use {@code
   * db.elasticsearch.node.name} instead.
   *
   * @deprecated Deprecated, no general replacement at this time. For Elasticsearch, use
   *     `db.elasticsearch.node.name` instead.
   */
  @Deprecated public static final AttributeKey<String> DB_INSTANCE_ID = stringKey("db.instance.id");

  /**
   * Removed, no replacement at this time.
   *
   * @deprecated Removed, no replacement at this time.
   */
  @Deprecated
  public static final AttributeKey<String> DB_JDBC_DRIVER_CLASSNAME =
      stringKey("db.jdbc.driver_classname");

  /**
   * Deprecated, use {@code db.collection.name} instead.
   *
   * @deprecated Deprecated, use `db.collection.name` instead.
   */
  @Deprecated
  public static final AttributeKey<String> DB_MONGODB_COLLECTION =
      stringKey("db.mongodb.collection");

  /**
   * Deprecated, SQL Server instance is now populated as a part of {@code db.namespace} attribute.
   *
   * @deprecated Deprecated, SQL Server instance is now populated as a part of `db.namespace`
   *     attribute.
   */
  @Deprecated
  public static final AttributeKey<String> DB_MSSQL_INSTANCE_NAME =
      stringKey("db.mssql.instance_name");

  /**
   * Deprecated, use {@code db.namespace} instead.
   *
   * @deprecated Deprecated, use `db.namespace` instead.
   */
  @Deprecated public static final AttributeKey<String> DB_NAME = stringKey("db.name");

  /**
   * The name of the database, fully qualified within the server address and port.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>If a database system has multiple namespace components, they SHOULD be concatenated
   *       (potentially using database system specific conventions) from most general to most
   *       specific namespace component, and more specific namespaces SHOULD NOT be captured without
   *       the more general namespaces, to ensure that &quot;startswith&quot; queries for the more
   *       general namespaces will be valid. Semantic conventions for individual database systems
   *       SHOULD document what {@code db.namespace} means in the context of that system. It is
   *       RECOMMENDED to capture the value as provided by the application without attempting to do
   *       any case normalization.
   * </ul>
   */
  public static final AttributeKey<String> DB_NAMESPACE = stringKey("db.namespace");

  /**
   * Deprecated, use {@code db.operation.name} instead.
   *
   * @deprecated Deprecated, use `db.operation.name` instead.
   */
  @Deprecated public static final AttributeKey<String> DB_OPERATION = stringKey("db.operation");

  /**
   * The number of queries included in a <a
   * href="/docs/database/database-spans.md#batch-operations">batch operation</a>.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Operations are only considered batches when they contain two or more operations, and so
   *       {@code db.operation.batch.size} SHOULD never be {@code 1}.
   * </ul>
   */
  public static final AttributeKey<Long> DB_OPERATION_BATCH_SIZE =
      longKey("db.operation.batch.size");

  /**
   * The name of the operation or command being executed.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>It is RECOMMENDED to capture the value as provided by the application without attempting
   *       to do any case normalization. If the operation name is parsed from the query text, it
   *       SHOULD be the first operation name found in the query. For batch operations, if the
   *       individual operations are known to have the same operation name then that operation name
   *       SHOULD be used prepended by {@code BATCH}, otherwise {@code db.operation.name} SHOULD be
   *       {@code BATCH} or some other database system specific term if more applicable.
   * </ul>
   */
  public static final AttributeKey<String> DB_OPERATION_NAME = stringKey("db.operation.name");

  /**
   * A query parameter used in {@code db.query.text}, with {@code <key>} being the parameter name,
   * and the attribute value being a string representation of the parameter value.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Query parameters should only be captured when {@code db.query.text} is parameterized with
   *       placeholders. If a parameter has no name and instead is referenced only by index, then
   *       {@code <key>} SHOULD be the 0-based index.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> DB_QUERY_PARAMETER =
      stringKeyTemplate("db.query.parameter");

  /**
   * The database query being executed.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>For sanitization see <a
   *       href="../../docs/database/database-spans.md#sanitization-of-dbquerytext">Sanitization of
   *       {@code db.query.text}</a>. For batch operations, if the individual operations are known
   *       to have the same query text then that query text SHOULD be used, otherwise all of the
   *       individual query texts SHOULD be concatenated with separator {@code ;} or some other
   *       database system specific separator if more applicable. Even though parameterized query
   *       text can potentially have sensitive data, by using a parameterized query the user is
   *       giving a strong signal that any sensitive data will be passed as parameter values, and
   *       the benefit to observability of capturing the static part of the query text by default
   *       outweighs the risk.
   * </ul>
   */
  public static final AttributeKey<String> DB_QUERY_TEXT = stringKey("db.query.text");

  /**
   * Deprecated, use {@code db.namespace} instead.
   *
   * @deprecated Deprecated, use `db.namespace` instead.
   */
  @Deprecated
  public static final AttributeKey<Long> DB_REDIS_DATABASE_INDEX =
      longKey("db.redis.database_index");

  /**
   * Deprecated, use {@code db.collection.name} instead.
   *
   * @deprecated Deprecated, use `db.collection.name` instead.
   */
  @Deprecated public static final AttributeKey<String> DB_SQL_TABLE = stringKey("db.sql.table");

  /**
   * The database statement being executed.
   *
   * @deprecated The database statement being executed.
   */
  @Deprecated public static final AttributeKey<String> DB_STATEMENT = stringKey("db.statement");

  /**
   * The database management system (DBMS) product as identified by the client instrumentation.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The actual DBMS may differ from the one identified by the client. For example, when using
   *       PostgreSQL client libraries to connect to a CockroachDB, the {@code db.system} is set to
   *       {@code postgresql} based on the instrumentation's best knowledge.
   * </ul>
   */
  public static final AttributeKey<String> DB_SYSTEM = stringKey("db.system");

  /**
   * Deprecated, no replacement at this time.
   *
   * @deprecated Deprecated, no replacement at this time.
   */
  @Deprecated public static final AttributeKey<String> DB_USER = stringKey("db.user");

  // Enum definitions
  /** Values for {@link #DB_CASSANDRA_CONSISTENCY_LEVEL}. */
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

  /** Values for {@link #DB_CLIENT_CONNECTION_STATE}. */
  public static final class DbClientConnectionStateValues {
    /** idle. */
    public static final String IDLE = "idle";

    /** used. */
    public static final String USED = "used";

    private DbClientConnectionStateValues() {}
  }

  /**
   * Values for {@link #DB_CLIENT_CONNECTIONS_STATE}.
   *
   * @deprecated Deprecated, use `db.client.connection.state` instead.
   */
  @Deprecated
  public static final class DbClientConnectionsStateValues {
    /** idle. */
    public static final String IDLE = "idle";

    /** used. */
    public static final String USED = "used";

    private DbClientConnectionsStateValues() {}
  }

  /** Values for {@link #DB_COSMOSDB_CONNECTION_MODE}. */
  public static final class DbCosmosdbConnectionModeValues {
    /** Gateway (HTTP) connections mode. */
    public static final String GATEWAY = "gateway";

    /** Direct connection. */
    public static final String DIRECT = "direct";

    private DbCosmosdbConnectionModeValues() {}
  }

  /** Values for {@link #DB_COSMOSDB_OPERATION_TYPE}. */
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

  /** Values for {@link #DB_SYSTEM}. */
  public static final class DbSystemValues {
    /** Some other SQL database. Fallback only. See notes. */
    public static final String OTHER_SQL = "other_sql";

    /** Adabas (Adaptable Database System). */
    public static final String ADABAS = "adabas";

    /** Deprecated, use `intersystems_cache` instead. */
    public static final String CACHE = "cache";

    /** InterSystems Caché. */
    public static final String INTERSYSTEMS_CACHE = "intersystems_cache";

    /** Apache Cassandra. */
    public static final String CASSANDRA = "cassandra";

    /** ClickHouse. */
    public static final String CLICKHOUSE = "clickhouse";

    /** Deprecated, use `other_sql` instead. */
    public static final String CLOUDSCAPE = "cloudscape";

    /** CockroachDB. */
    public static final String COCKROACHDB = "cockroachdb";

    /** Deprecated, no replacement at this time. */
    public static final String COLDFUSION = "coldfusion";

    /** Microsoft Azure Cosmos DB. */
    public static final String COSMOSDB = "cosmosdb";

    /** Couchbase. */
    public static final String COUCHBASE = "couchbase";

    /** CouchDB. */
    public static final String COUCHDB = "couchdb";

    /** IBM Db2. */
    public static final String DB2 = "db2";

    /** Apache Derby. */
    public static final String DERBY = "derby";

    /** Amazon DynamoDB. */
    public static final String DYNAMODB = "dynamodb";

    /** EnterpriseDB. */
    public static final String EDB = "edb";

    /** Elasticsearch. */
    public static final String ELASTICSEARCH = "elasticsearch";

    /** FileMaker. */
    public static final String FILEMAKER = "filemaker";

    /** Firebird. */
    public static final String FIREBIRD = "firebird";

    /** Deprecated, use `other_sql` instead. */
    public static final String FIRSTSQL = "firstsql";

    /** Apache Geode. */
    public static final String GEODE = "geode";

    /** H2. */
    public static final String H2 = "h2";

    /** SAP HANA. */
    public static final String HANADB = "hanadb";

    /** Apache HBase. */
    public static final String HBASE = "hbase";

    /** Apache Hive. */
    public static final String HIVE = "hive";

    /** HyperSQL DataBase. */
    public static final String HSQLDB = "hsqldb";

    /** InfluxDB. */
    public static final String INFLUXDB = "influxdb";

    /** Informix. */
    public static final String INFORMIX = "informix";

    /** Ingres. */
    public static final String INGRES = "ingres";

    /** InstantDB. */
    public static final String INSTANTDB = "instantdb";

    /** InterBase. */
    public static final String INTERBASE = "interbase";

    /** MariaDB. */
    public static final String MARIADB = "mariadb";

    /** SAP MaxDB. */
    public static final String MAXDB = "maxdb";

    /** Memcached. */
    public static final String MEMCACHED = "memcached";

    /** MongoDB. */
    public static final String MONGODB = "mongodb";

    /** Microsoft SQL Server. */
    public static final String MSSQL = "mssql";

    /** Deprecated, Microsoft SQL Server Compact is discontinued. */
    public static final String MSSQLCOMPACT = "mssqlcompact";

    /** MySQL. */
    public static final String MYSQL = "mysql";

    /** Neo4j. */
    public static final String NEO4J = "neo4j";

    /** Netezza. */
    public static final String NETEZZA = "netezza";

    /** OpenSearch. */
    public static final String OPENSEARCH = "opensearch";

    /** Oracle Database. */
    public static final String ORACLE = "oracle";

    /** Pervasive PSQL. */
    public static final String PERVASIVE = "pervasive";

    /** PointBase. */
    public static final String POINTBASE = "pointbase";

    /** PostgreSQL. */
    public static final String POSTGRESQL = "postgresql";

    /** Progress Database. */
    public static final String PROGRESS = "progress";

    /** Redis. */
    public static final String REDIS = "redis";

    /** Amazon Redshift. */
    public static final String REDSHIFT = "redshift";

    /** Cloud Spanner. */
    public static final String SPANNER = "spanner";

    /** SQLite. */
    public static final String SQLITE = "sqlite";

    /** Sybase. */
    public static final String SYBASE = "sybase";

    /** Teradata. */
    public static final String TERADATA = "teradata";

    /** Trino. */
    public static final String TRINO = "trino";

    /** Vertica. */
    public static final String VERTICA = "vertica";

    private DbSystemValues() {}
  }

  private DbIncubatingAttributes() {}
}
