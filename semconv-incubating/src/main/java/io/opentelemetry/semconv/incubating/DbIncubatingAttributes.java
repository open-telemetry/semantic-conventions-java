
/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.doubleKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;

import static io.opentelemetry.semconv.AttributeKeyTemplate.stringArrayKeyTemplate;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class DbIncubatingAttributes {

  /**
  * The consistency level of the query. Based on consistency values from <a href="https://docs.datastax.com/en/cassandra-oss/3.0/cassandra/dml/dmlConfigConsistency.html">CQL</a>.
  *
  */
  public static final AttributeKey<String> DB_CASSANDRA_CONSISTENCYLEVEL = stringKey("db.cassandra.consistency_level");

  /**
  * The data center of the coordinating node for a query.
  *
  */
  public static final AttributeKey<String> DB_CASSANDRA_COORDINATOR_DC = stringKey("db.cassandra.coordinator.dc");

  /**
  * The ID of the coordinating node for a query.
  *
  */
  public static final AttributeKey<String> DB_CASSANDRA_COORDINATOR_ID = stringKey("db.cassandra.coordinator.id");

  /**
  * Whether or not the query is idempotent.
  *
  */
  public static final AttributeKey<Boolean> DB_CASSANDRA_IDEMPOTENCE = booleanKey("db.cassandra.idempotence");

  /**
  * The fetch size used for paging, i.e. how many rows will be returned at once.
  *
  */
  public static final AttributeKey<Long> DB_CASSANDRA_PAGESIZE = longKey("db.cassandra.page_size");

  /**
  * The number of times a query was speculatively executed. Not set or {@code 0} if the query was not executed speculatively.
  *
  */
  public static final AttributeKey<Long> DB_CASSANDRA_SPECULATIVEEXECUTIONCOUNT = longKey("db.cassandra.speculative_execution_count");

  /**
  * The name of the primary Cassandra table that the operation is acting upon, including the keyspace name (if applicable).
  *
  * <p>Notes:
        
        
        <ul> <li>This mirrors the db.sql.table attribute but references cassandra rather than sql. It is not recommended to attempt any client-side parsing of {@code db.statement} just to get this property, but it should be set if it is provided by the library being instrumented. If the operation is acting upon an anonymous table, or more than one table, this value MUST NOT be set.</li> </ul>
  *
  */
  public static final AttributeKey<String> DB_CASSANDRA_TABLE = stringKey("db.cassandra.table");

  /**
  * Deprecated, use {@code server.address}, {@code server.port} attributes instead.
  *
  * @deprecated Deprecated, use `server.address`, `server.port` attributes instead.
  */
  @Deprecated
  public static final AttributeKey<String> DB_CONNECTIONSTRING = stringKey("db.connection_string");

  /**
  * Unique Cosmos client instance id.
  *
  */
  public static final AttributeKey<String> DB_COSMOSDB_CLIENTID = stringKey("db.cosmosdb.client_id");

  /**
  * Cosmos client connection mode.
  *
  */
  public static final AttributeKey<String> DB_COSMOSDB_CONNECTIONMODE = stringKey("db.cosmosdb.connection_mode");

  /**
  * Cosmos DB container name.
  *
  */
  public static final AttributeKey<String> DB_COSMOSDB_CONTAINER = stringKey("db.cosmosdb.container");

  /**
  * CosmosDB Operation Type.
  *
  */
  public static final AttributeKey<String> DB_COSMOSDB_OPERATIONTYPE = stringKey("db.cosmosdb.operation_type");

  /**
  * RU consumed for that operation
  *
  */
  public static final AttributeKey<Double> DB_COSMOSDB_REQUESTCHARGE = doubleKey("db.cosmosdb.request_charge");

  /**
  * Request payload size in bytes
  *
  */
  public static final AttributeKey<Long> DB_COSMOSDB_REQUESTCONTENTLENGTH = longKey("db.cosmosdb.request_content_length");

  /**
  * Cosmos DB status code.
  *
  */
  public static final AttributeKey<Long> DB_COSMOSDB_STATUSCODE = longKey("db.cosmosdb.status_code");

  /**
  * Cosmos DB sub status code.
  *
  */
  public static final AttributeKey<Long> DB_COSMOSDB_SUBSTATUSCODE = longKey("db.cosmosdb.sub_status_code");

  /**
  * Represents the identifier of an Elasticsearch cluster.
  *
  */
  public static final AttributeKey<String> DB_ELASTICSEARCH_CLUSTER_NAME = stringKey("db.elasticsearch.cluster.name");

  /**
  * Deprecated, use {@code db.instance.id} instead.
  *
  * @deprecated Deprecated, use `db.instance.id` instead.
  */
  @Deprecated
  public static final AttributeKey<String> DB_ELASTICSEARCH_NODE_NAME = stringKey("db.elasticsearch.node.name");

  /**
  * A dynamic value in the url path.
  *
  * <p>Notes:
        
        
        <ul> <li>Many Elasticsearch url paths allow dynamic values. These SHOULD be recorded in span attributes in the format {@code db.elasticsearch.path_parts.<key>}, where {@code <key>} is the url path part name. The implementation SHOULD reference the <a href="https://raw.githubusercontent.com/elastic/elasticsearch-specification/main/output/schema/schema.json">elasticsearch schema</a> in order to map the path part values to their names.</li> </ul>
  *
  */
  public static final AttributeKeyTemplate<String> DB_ELASTICSEARCH_PATHPARTS = stringKeyTemplate("db.elasticsearch.path_parts");

  /**
  * An identifier (address, unique name, or any other identifier) of the database instance that is executing queries or mutations on the current connection. This is useful in cases where the database is running in a clustered environment and the instrumentation is able to record the node executing the query. The client may obtain this value in databases like MySQL using queries like {@code select @@hostname}.
  *
  */
  public static final AttributeKey<String> DB_INSTANCE_ID = stringKey("db.instance.id");

  /**
  * Removed, no replacement at this time.
  *
  * @deprecated Removed, no replacement at this time.
  */
  @Deprecated
  public static final AttributeKey<String> DB_JDBC_DRIVERCLASSNAME = stringKey("db.jdbc.driver_classname");

  /**
  * The MongoDB collection being accessed within the database stated in {@code db.name}.
  *
  */
  public static final AttributeKey<String> DB_MONGODB_COLLECTION = stringKey("db.mongodb.collection");

  /**
  * The Microsoft SQL Server <a href="https://docs.microsoft.com/sql/connect/jdbc/building-the-connection-url?view=sql-server-ver15">instance name</a> connecting to. This name is used to determine the port of a named instance.
  *
  * <p>Notes:
        
        
        <ul> <li>If setting a {@code db.mssql.instance_name}, {@code server.port} is no longer required (but still recommended if non-standard).</li> </ul>
  *
  */
  public static final AttributeKey<String> DB_MSSQL_INSTANCENAME = stringKey("db.mssql.instance_name");

  /**
  * This attribute is used to report the name of the database being accessed. For commands that switch the database, this should be set to the target database (even if the command fails).
  *
  * <p>Notes:
        
        
        <ul> <li>In some SQL databases, the database name to be used is called &quot;schema name&quot;. In case there are multiple layers that could be considered for database name (e.g. Oracle instance name and schema name), the database name to be used is the more specific layer (e.g. Oracle schema name).</li> </ul>
  *
  */
  public static final AttributeKey<String> DB_NAME = stringKey("db.name");

  /**
  * The name of the operation being executed, e.g. the <a href="https://docs.mongodb.com/manual/reference/command/#database-operations">MongoDB command name</a> such as {@code findAndModify}, or the SQL keyword.
  *
  * <p>Notes:
        
        
        <ul> <li>When setting this to an SQL keyword, it is not recommended to attempt any client-side parsing of {@code db.statement} just to get this property, but it should be set if the operation name is provided by the library being instrumented. If the SQL statement has an ambiguous operation, or performs more than one operation, this value may be omitted.</li> </ul>
  *
  */
  public static final AttributeKey<String> DB_OPERATION = stringKey("db.operation");

  /**
  * The index of the database being accessed as used in the <a href="https://redis.io/commands/select">{@code SELECT} command</a>, provided as an integer. To be used instead of the generic {@code db.name} attribute.
  *
  */
  public static final AttributeKey<Long> DB_REDIS_DATABASEINDEX = longKey("db.redis.database_index");

  /**
  * The name of the primary table that the operation is acting upon, including the database name (if applicable).
  *
  * <p>Notes:
        
        
        <ul> <li>It is not recommended to attempt any client-side parsing of {@code db.statement} just to get this property, but it should be set if it is provided by the library being instrumented. If the operation is acting upon an anonymous table, or more than one table, this value MUST NOT be set.</li> </ul>
  *
  */
  public static final AttributeKey<String> DB_SQL_TABLE = stringKey("db.sql.table");

  /**
  * The database statement being executed.
  *
  */
  public static final AttributeKey<String> DB_STATEMENT = stringKey("db.statement");

  /**
  * An identifier for the database management system (DBMS) product being used. See below for a list of well-known identifiers.
  *
  */
  public static final AttributeKey<String> DB_SYSTEM = stringKey("db.system");

  /**
  * Username for accessing the database.
  *
  */
  public static final AttributeKey<String> DB_USER = stringKey("db.user");
  // Enum definitions
  /**
  * Values for {@link #DB_CASSANDRA_CONSISTENCYLEVEL}.
  *
  */
  public static final class DbCassandraConsistencylevelValues {
      /** all. */
      public static final String ALL = "all";
      /** each_quorum. */
      public static final String EACHQUORUM = "each_quorum";
      /** quorum. */
      public static final String QUORUM = "quorum";
      /** local_quorum. */
      public static final String LOCALQUORUM = "local_quorum";
      /** one. */
      public static final String ONE = "one";
      /** two. */
      public static final String TWO = "two";
      /** three. */
      public static final String THREE = "three";
      /** local_one. */
      public static final String LOCALONE = "local_one";
      /** any. */
      public static final String ANY = "any";
      /** serial. */
      public static final String SERIAL = "serial";
      /** local_serial. */
      public static final String LOCALSERIAL = "local_serial";

      private DbCassandraConsistencylevelValues() {}
  }
  /**
  * Values for {@link #DB_COSMOSDB_CONNECTIONMODE}.
  *
  */
  public static final class DbCosmosdbConnectionmodeValues {
      /** Gateway (HTTP) connections mode. */
      public static final String GATEWAY = "gateway";
      /** Direct connection. */
      public static final String DIRECT = "direct";

      private DbCosmosdbConnectionmodeValues() {}
  }
  /**
  * Values for {@link #DB_COSMOSDB_OPERATIONTYPE}.
  *
  */
  public static final class DbCosmosdbOperationtypeValues {
      /** invalid. */
      public static final String INVALID = "Invalid";
      /** create. */
      public static final String CREATE = "Create";
      /** patch. */
      public static final String PATCH = "Patch";
      /** read. */
      public static final String READ = "Read";
      /** read_feed. */
      public static final String READFEED = "ReadFeed";
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
      public static final String HEADFEED = "HeadFeed";
      /** upsert. */
      public static final String UPSERT = "Upsert";
      /** batch. */
      public static final String BATCH = "Batch";
      /** query_plan. */
      public static final String QUERYPLAN = "QueryPlan";
      /** execute_javascript. */
      public static final String EXECUTEJAVASCRIPT = "ExecuteJavaScript";

      private DbCosmosdbOperationtypeValues() {}
  }
  /**
  * Values for {@link #DB_SYSTEM}.
  *
  */
  public static final class DbSystemValues {
      /** Some other SQL database. Fallback only. See notes. */
      public static final String OTHERSQL = "other_sql";
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

  private DbIncubatingAttributes() {}
}