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
public final class CassandraIncubatingAttributes {
  /**
   * The consistency level of the query. Based on consistency values from <a
   * href="https://docs.datastax.com/en/cassandra-oss/3.0/cassandra/dml/dmlConfigConsistency.html">CQL</a>.
   */
  public static final AttributeKey<String> CASSANDRA_CONSISTENCY_LEVEL =
      stringKey("cassandra.consistency.level");

  /** The data center of the coordinating node for a query. */
  public static final AttributeKey<String> CASSANDRA_COORDINATOR_DC =
      stringKey("cassandra.coordinator.dc");

  /** The ID of the coordinating node for a query. */
  public static final AttributeKey<String> CASSANDRA_COORDINATOR_ID =
      stringKey("cassandra.coordinator.id");

  /** The fetch size used for paging, i.e. how many rows will be returned at once. */
  public static final AttributeKey<Long> CASSANDRA_PAGE_SIZE = longKey("cassandra.page.size");

  /** Whether or not the query is idempotent. */
  public static final AttributeKey<Boolean> CASSANDRA_QUERY_IDEMPOTENT =
      booleanKey("cassandra.query.idempotent");

  /**
   * The number of times a query was speculatively executed. Not set or {@code 0} if the query was
   * not executed speculatively.
   */
  public static final AttributeKey<Long> CASSANDRA_SPECULATIVE_EXECUTION_COUNT =
      longKey("cassandra.speculative_execution.count");

  // Enum definitions

  /** Values for {@link #CASSANDRA_CONSISTENCY_LEVEL}. */
  public static final class CassandraConsistencyLevelIncubatingValues {
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

    private CassandraConsistencyLevelIncubatingValues() {}
  }

  private CassandraIncubatingAttributes() {}
}
