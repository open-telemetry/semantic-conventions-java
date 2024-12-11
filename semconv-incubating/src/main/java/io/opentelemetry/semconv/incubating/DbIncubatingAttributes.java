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
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
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
   * <p>
   *
   * @deprecated Replaced by {@code db.collection.name}.
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
   * <p>
   *
   * @deprecated Replaced by {@code db.client.connection.pool.name}.
   */
  @Deprecated
  public static final AttributeKey<String> DB_CLIENT_CONNECTIONS_POOL_NAME =
      stringKey("db.client.connections.pool.name");

  /**
   * Deprecated, use {@code db.client.connection.state} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code db.client.connection.state}.
   */
  @Deprecated
  public static final AttributeKey<String> DB_CLIENT_CONNECTIONS_STATE =
      stringKey("db.client.connections.state");

  /**
   * The name of a collection (table, container) within the database.
   *
   * <p>Notes:
   *
   * <p>It is RECOMMENDED to capture the value as provided by the application without attempting to
   * do any case normalization.
   *
   * <p>The collection name SHOULD NOT be extracted from {@code db.query.text}, unless the query
   * format is known to only ever have a single collection name present.
   *
   * <p>For batch operations, if the individual operations are known to have the same collection
   * name then that collection name SHOULD be used.
   *
   * <p>This attribute has stability level RELEASE CANDIDATE.
   */
  public static final AttributeKey<String> DB_COLLECTION_NAME = stringKey("db.collection.name");

  /**
   * Deprecated, use {@code server.address}, {@code server.port} attributes instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code server.address} and {@code server.port}.
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
   * Account or request <a
   * href="https://learn.microsoft.com/azure/cosmos-db/consistency-levels">consistency level</a>.
   */
  public static final AttributeKey<String> DB_COSMOSDB_CONSISTENCY_LEVEL =
      stringKey("db.cosmosdb.consistency_level");

  /**
   * Deprecated, use {@code db.collection.name} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code db.collection.name}.
   */
  @Deprecated
  public static final AttributeKey<String> DB_COSMOSDB_CONTAINER =
      stringKey("db.cosmosdb.container");

  /**
   * Deprecated, no replacement at this time.
   *
   * <p>
   *
   * @deprecated No replacement at this time.
   */
  @Deprecated
  public static final AttributeKey<String> DB_COSMOSDB_OPERATION_TYPE =
      stringKey("db.cosmosdb.operation_type");

  /**
   * List of regions contacted during operation in the order that they were contacted. If there is
   * more than one region listed, it indicates that the operation was performed on multiple regions
   * i.e. cross-regional call.
   *
   * <p>Notes:
   *
   * <p>Region name matches the format of {@code displayName} in <a
   * href="https://learn.microsoft.com/rest/api/subscription/subscriptions/list-locations?view=rest-subscription-2021-10-01&tabs=HTTP#location">Azure
   * Location API</a>
   */
  public static final AttributeKey<List<String>> DB_COSMOSDB_REGIONS_CONTACTED =
      stringArrayKey("db.cosmosdb.regions_contacted");

  /** Request units consumed for the operation. */
  public static final AttributeKey<Double> DB_COSMOSDB_REQUEST_CHARGE =
      doubleKey("db.cosmosdb.request_charge");

  /** Request payload size in bytes. */
  public static final AttributeKey<Long> DB_COSMOSDB_REQUEST_CONTENT_LENGTH =
      longKey("db.cosmosdb.request_content_length");

  /**
   * Deprecated, use {@code db.response.status_code} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code db.response.status_code}.
   */
  @Deprecated
  public static final AttributeKey<Long> DB_COSMOSDB_STATUS_CODE =
      longKey("db.cosmosdb.status_code");

  /** Cosmos DB sub status code. */
  public static final AttributeKey<Long> DB_COSMOSDB_SUB_STATUS_CODE =
      longKey("db.cosmosdb.sub_status_code");

  /**
   * Deprecated, use {@code db.namespace} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code db.namespace}.
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
   * <p>Many Elasticsearch url paths allow dynamic values. These SHOULD be recorded in span
   * attributes in the format {@code db.elasticsearch.path_parts.<key>}, where {@code <key>} is the
   * url path part name. The implementation SHOULD reference the <a
   * href="https://raw.githubusercontent.com/elastic/elasticsearch-specification/main/output/schema/schema.json">elasticsearch
   * schema</a> in order to map the path part values to their names.
   */
  public static final AttributeKeyTemplate<String> DB_ELASTICSEARCH_PATH_PARTS =
      stringKeyTemplate("db.elasticsearch.path_parts");

  /**
   * Deprecated, no general replacement at this time. For Elasticsearch, use {@code
   * db.elasticsearch.node.name} instead.
   *
   * <p>
   *
   * @deprecated Deprecated, no general replacement at this time. For Elasticsearch, use {@code
   *     db.elasticsearch.node.name} instead.
   */
  @Deprecated public static final AttributeKey<String> DB_INSTANCE_ID = stringKey("db.instance.id");

  /**
   * Removed, no replacement at this time.
   *
   * <p>
   *
   * @deprecated Removed as not used.
   */
  @Deprecated
  public static final AttributeKey<String> DB_JDBC_DRIVER_CLASSNAME =
      stringKey("db.jdbc.driver_classname");

  /**
   * Deprecated, use {@code db.collection.name} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code db.collection.name}.
   */
  @Deprecated
  public static final AttributeKey<String> DB_MONGODB_COLLECTION =
      stringKey("db.mongodb.collection");

  /**
   * Deprecated, SQL Server instance is now populated as a part of {@code db.namespace} attribute.
   *
   * <p>
   *
   * @deprecated Deprecated, no replacement at this time.
   */
  @Deprecated
  public static final AttributeKey<String> DB_MSSQL_INSTANCE_NAME =
      stringKey("db.mssql.instance_name");

  /**
   * Deprecated, use {@code db.namespace} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code db.namespace}.
   */
  @Deprecated public static final AttributeKey<String> DB_NAME = stringKey("db.name");

  /**
   * The name of the database, fully qualified within the server address and port.
   *
   * <p>Notes:
   *
   * <p>If a database system has multiple namespace components, they SHOULD be concatenated
   * (potentially using database system specific conventions) from most general to most specific
   * namespace component, and more specific namespaces SHOULD NOT be captured without the more
   * general namespaces, to ensure that "startswith" queries for the more general namespaces will be
   * valid. Semantic conventions for individual database systems SHOULD document what {@code
   * db.namespace} means in the context of that system. It is RECOMMENDED to capture the value as
   * provided by the application without attempting to do any case normalization. This attribute has
   * stability level RELEASE CANDIDATE.
   */
  public static final AttributeKey<String> DB_NAMESPACE = stringKey("db.namespace");

  /**
   * Deprecated, use {@code db.operation.name} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code db.operation.name}.
   */
  @Deprecated public static final AttributeKey<String> DB_OPERATION = stringKey("db.operation");

  /**
   * The number of queries included in a batch operation.
   *
   * <p>Notes:
   *
   * <p>Operations are only considered batches when they contain two or more operations, and so
   * {@code db.operation.batch.size} SHOULD never be {@code 1}. This attribute has stability level
   * RELEASE CANDIDATE.
   */
  public static final AttributeKey<Long> DB_OPERATION_BATCH_SIZE =
      longKey("db.operation.batch.size");

  /**
   * The name of the operation or command being executed.
   *
   * <p>Notes:
   *
   * <p>It is RECOMMENDED to capture the value as provided by the application without attempting to
   * do any case normalization.
   *
   * <p>The operation name SHOULD NOT be extracted from {@code db.query.text}, unless the query
   * format is known to only ever have a single operation name present.
   *
   * <p>For batch operations, if the individual operations are known to have the same operation name
   * then that operation name SHOULD be used prepended by {@code BATCH }, otherwise {@code
   * db.operation.name} SHOULD be {@code BATCH} or some other database system specific term if more
   * applicable.
   *
   * <p>This attribute has stability level RELEASE CANDIDATE.
   */
  public static final AttributeKey<String> DB_OPERATION_NAME = stringKey("db.operation.name");

  /**
   * A database operation parameter, with {@code <key>} being the parameter name, and the attribute
   * value being a string representation of the parameter value.
   *
   * <p>Notes:
   *
   * <p>If a parameter has no name and instead is referenced only by index, then {@code <key>}
   * SHOULD be the 0-based index. If {@code db.query.text} is also captured, then {@code
   * db.operation.parameter.<key>} SHOULD match up with the parameterized placeholders present in
   * {@code db.query.text}. This attribute has stability level RELEASE CANDIDATE.
   */
  public static final AttributeKeyTemplate<String> DB_OPERATION_PARAMETER =
      stringKeyTemplate("db.operation.parameter");

  /**
   * A query parameter used in {@code db.query.text}, with {@code <key>} being the parameter name,
   * and the attribute value being a string representation of the parameter value.
   *
   * <p>
   *
   * @deprecated Replaced by {@code db.operation.parameter}.
   */
  @Deprecated
  public static final AttributeKeyTemplate<String> DB_QUERY_PARAMETER =
      stringKeyTemplate("db.query.parameter");

  /**
   * Low cardinality representation of a database query text.
   *
   * <p>Notes:
   *
   * <p>{@code db.query.summary} provides static summary of the query text. It describes a class of
   * database queries and is useful as a grouping key, especially when analyzing telemetry for
   * database calls involving complex queries. Summary may be available to the instrumentation
   * through instrumentation hooks or other means. If it is not available, instrumentations that
   * support query parsing SHOULD generate a summary following <a
   * href="../../docs/database/database-spans.md#generating-a-summary-of-the-query-text">Generating
   * query summary</a> section. This attribute has stability level RELEASE CANDIDATE.
   */
  public static final AttributeKey<String> DB_QUERY_SUMMARY = stringKey("db.query.summary");

  /**
   * The database query being executed.
   *
   * <p>Notes:
   *
   * <p>For sanitization see <a
   * href="../../docs/database/database-spans.md#sanitization-of-dbquerytext">Sanitization of {@code
   * db.query.text}</a>. For batch operations, if the individual operations are known to have the
   * same query text then that query text SHOULD be used, otherwise all of the individual query
   * texts SHOULD be concatenated with separator {@code ; } or some other database system specific
   * separator if more applicable. Even though parameterized query text can potentially have
   * sensitive data, by using a parameterized query the user is giving a strong signal that any
   * sensitive data will be passed as parameter values, and the benefit to observability of
   * capturing the static part of the query text by default outweighs the risk. This attribute has
   * stability level RELEASE CANDIDATE.
   */
  public static final AttributeKey<String> DB_QUERY_TEXT = stringKey("db.query.text");

  /**
   * Deprecated, use {@code db.namespace} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code db.namespace}.
   */
  @Deprecated
  public static final AttributeKey<Long> DB_REDIS_DATABASE_INDEX =
      longKey("db.redis.database_index");

  /** Number of rows returned by the operation. */
  public static final AttributeKey<Long> DB_RESPONSE_RETURNED_ROWS =
      longKey("db.response.returned_rows");

  /**
   * Database response status code.
   *
   * <p>Notes:
   *
   * <p>The status code returned by the database. Usually it represents an error code, but may also
   * represent partial success, warning, or differentiate between various types of successful
   * outcomes. Semantic conventions for individual database systems SHOULD document what {@code
   * db.response.status_code} means in the context of that system. This attribute has stability
   * level RELEASE CANDIDATE.
   */
  public static final AttributeKey<String> DB_RESPONSE_STATUS_CODE =
      stringKey("db.response.status_code");

  /**
   * Deprecated, use {@code db.collection.name} instead.
   *
   * <p>
   *
   * @deprecated Replaced by {@code db.collection.name}.
   */
  @Deprecated public static final AttributeKey<String> DB_SQL_TABLE = stringKey("db.sql.table");

  /**
   * The database statement being executed.
   *
   * <p>
   *
   * @deprecated Replaced by {@code db.query.text}.
   */
  @Deprecated public static final AttributeKey<String> DB_STATEMENT = stringKey("db.statement");

  /**
   * The database management system (DBMS) product as identified by the client instrumentation.
   *
   * <p>Notes:
   *
   * <p>The actual DBMS may differ from the one identified by the client. For example, when using
   * PostgreSQL client libraries to connect to a CockroachDB, the {@code db.system} is set to {@code
   * postgresql} based on the instrumentation's best knowledge. This attribute has stability level
   * RELEASE CANDIDATE.
   */
  public static final AttributeKey<String> DB_SYSTEM = stringKey("db.system");

  /**
   * Deprecated, no replacement at this time.
   *
   * <p>
   *
   * @deprecated No replacement at this time.
   */
  @Deprecated public static final AttributeKey<String> DB_USER = stringKey("db.user");

  // Enum definitions
  /** Values for {@link #DB_CASSANDRA_CONSISTENCY_LEVEL}. */
  public static final class DbCassandraConsistencyLevelIncubatingValues {
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

    private DbCassandraConsistencyLevelIncubatingValues() {}
  }

  /** Values for {@link #DB_CLIENT_CONNECTION_STATE}. */
  public static final class DbClientConnectionStateIncubatingValues {
    /** idle. */
    public static final String IDLE = "idle";

    /** used. */
    public static final String USED = "used";

    private DbClientConnectionStateIncubatingValues() {}
  }

  /**
   * Values for {@link #DB_CLIENT_CONNECTIONS_STATE}
   *
   * @deprecated Replaced by {@code db.client.connection.state}.
   */
  @Deprecated
  public static final class DbClientConnectionsStateIncubatingValues {
    /** idle. */
    public static final String IDLE = "idle";

    /** used. */
    public static final String USED = "used";

    private DbClientConnectionsStateIncubatingValues() {}
  }

  /** Values for {@link #DB_COSMOSDB_CONNECTION_MODE}. */
  public static final class DbCosmosdbConnectionModeIncubatingValues {
    /** Gateway (HTTP) connection. */
    public static final String GATEWAY = "gateway";

    /** Direct connection. */
    public static final String DIRECT = "direct";

    private DbCosmosdbConnectionModeIncubatingValues() {}
  }

  /** Values for {@link #DB_COSMOSDB_CONSISTENCY_LEVEL}. */
  public static final class DbCosmosdbConsistencyLevelIncubatingValues {
    /** strong. */
    public static final String STRONG = "Strong";

    /** bounded_staleness. */
    public static final String BOUNDED_STALENESS = "BoundedStaleness";

    /** session. */
    public static final String SESSION = "Session";

    /** eventual. */
    public static final String EVENTUAL = "Eventual";

    /** consistent_prefix. */
    public static final String CONSISTENT_PREFIX = "ConsistentPrefix";

    private DbCosmosdbConsistencyLevelIncubatingValues() {}
  }

  /**
   * Values for {@link #DB_COSMOSDB_OPERATION_TYPE}
   *
   * @deprecated No replacement at this time.
   */
  @Deprecated
  public static final class DbCosmosdbOperationTypeIncubatingValues {
    /** batch. */
    public static final String BATCH = "batch";

    /** create. */
    public static final String CREATE = "create";

    /** delete. */
    public static final String DELETE = "delete";

    /** execute. */
    public static final String EXECUTE = "execute";

    /** execute_javascript. */
    public static final String EXECUTE_JAVASCRIPT = "execute_javascript";

    /** invalid. */
    public static final String INVALID = "invalid";

    /** head. */
    public static final String HEAD = "head";

    /** head_feed. */
    public static final String HEAD_FEED = "head_feed";

    /** patch. */
    public static final String PATCH = "patch";

    /** query. */
    public static final String QUERY = "query";

    /** query_plan. */
    public static final String QUERY_PLAN = "query_plan";

    /** read. */
    public static final String READ = "read";

    /** read_feed. */
    public static final String READ_FEED = "read_feed";

    /** replace. */
    public static final String REPLACE = "replace";

    /** upsert. */
    public static final String UPSERT = "upsert";

    private DbCosmosdbOperationTypeIncubatingValues() {}
  }

  /** Values for {@link #DB_SYSTEM}. */
  public static final class DbSystemIncubatingValues {
    /** Some other SQL database. Fallback only. See notes. */
    public static final String OTHER_SQL = "other_sql";

    /** Adabas (Adaptable Database System) */
    public static final String ADABAS = "adabas";

    /** Deprecated, use {@code intersystems_cache} instead. */
    public static final String CACHE = "cache";

    /** InterSystems Caché */
    public static final String INTERSYSTEMS_CACHE = "intersystems_cache";

    /** Apache Cassandra */
    public static final String CASSANDRA = "cassandra";

    /** ClickHouse */
    public static final String CLICKHOUSE = "clickhouse";

    /** Deprecated, use {@code other_sql} instead. */
    public static final String CLOUDSCAPE = "cloudscape";

    /** CockroachDB */
    public static final String COCKROACHDB = "cockroachdb";

    /** Deprecated, no replacement at this time. */
    public static final String COLDFUSION = "coldfusion";

    /** Microsoft Azure Cosmos DB */
    public static final String COSMOSDB = "cosmosdb";

    /** Couchbase */
    public static final String COUCHBASE = "couchbase";

    /** CouchDB */
    public static final String COUCHDB = "couchdb";

    /** IBM Db2 */
    public static final String DB2 = "db2";

    /** Apache Derby */
    public static final String DERBY = "derby";

    /** Amazon DynamoDB */
    public static final String DYNAMODB = "dynamodb";

    /** EnterpriseDB */
    public static final String EDB = "edb";

    /** Elasticsearch */
    public static final String ELASTICSEARCH = "elasticsearch";

    /** FileMaker */
    public static final String FILEMAKER = "filemaker";

    /** Firebird */
    public static final String FIREBIRD = "firebird";

    /** Deprecated, use {@code other_sql} instead. */
    public static final String FIRSTSQL = "firstsql";

    /** Apache Geode */
    public static final String GEODE = "geode";

    /** H2 */
    public static final String H2 = "h2";

    /** SAP HANA */
    public static final String HANADB = "hanadb";

    /** Apache HBase */
    public static final String HBASE = "hbase";

    /** Apache Hive */
    public static final String HIVE = "hive";

    /** HyperSQL DataBase */
    public static final String HSQLDB = "hsqldb";

    /** InfluxDB */
    public static final String INFLUXDB = "influxdb";

    /** Informix */
    public static final String INFORMIX = "informix";

    /** Ingres */
    public static final String INGRES = "ingres";

    /** InstantDB */
    public static final String INSTANTDB = "instantdb";

    /** InterBase */
    public static final String INTERBASE = "interbase";

    /** MariaDB (This value has stability level RELEASE CANDIDATE) */
    public static final String MARIADB = "mariadb";

    /** SAP MaxDB */
    public static final String MAXDB = "maxdb";

    /** Memcached */
    public static final String MEMCACHED = "memcached";

    /** MongoDB */
    public static final String MONGODB = "mongodb";

    /** Microsoft SQL Server (This value has stability level RELEASE CANDIDATE) */
    public static final String MSSQL = "mssql";

    /** Deprecated, Microsoft SQL Server Compact is discontinued. */
    public static final String MSSQLCOMPACT = "mssqlcompact";

    /** MySQL (This value has stability level RELEASE CANDIDATE) */
    public static final String MYSQL = "mysql";

    /** Neo4j */
    public static final String NEO4J = "neo4j";

    /** Netezza */
    public static final String NETEZZA = "netezza";

    /** OpenSearch */
    public static final String OPENSEARCH = "opensearch";

    /** Oracle Database */
    public static final String ORACLE = "oracle";

    /** Pervasive PSQL */
    public static final String PERVASIVE = "pervasive";

    /** PointBase */
    public static final String POINTBASE = "pointbase";

    /** PostgreSQL (This value has stability level RELEASE CANDIDATE) */
    public static final String POSTGRESQL = "postgresql";

    /** Progress Database */
    public static final String PROGRESS = "progress";

    /** Redis */
    public static final String REDIS = "redis";

    /** Amazon Redshift */
    public static final String REDSHIFT = "redshift";

    /** Cloud Spanner */
    public static final String SPANNER = "spanner";

    /** SQLite */
    public static final String SQLITE = "sqlite";

    /** Sybase */
    public static final String SYBASE = "sybase";

    /** Teradata */
    public static final String TERADATA = "teradata";

    /** Trino */
    public static final String TRINO = "trino";

    /** Vertica */
    public static final String VERTICA = "vertica";

    private DbSystemIncubatingValues() {}
  }

  private DbIncubatingAttributes() {}
}
