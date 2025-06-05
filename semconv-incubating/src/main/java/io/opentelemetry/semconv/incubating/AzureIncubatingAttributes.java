/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.doubleKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class AzureIncubatingAttributes {
  /** The unique identifier of the client instance. */
  public static final AttributeKey<String> AZURE_CLIENT_ID = stringKey("azure.client.id");

  /** Cosmos client connection mode. */
  public static final AttributeKey<String> AZURE_COSMOSDB_CONNECTION_MODE =
      stringKey("azure.cosmosdb.connection.mode");

  /**
   * Account or request <a
   * href="https://learn.microsoft.com/azure/cosmos-db/consistency-levels">consistency level</a>.
   */
  public static final AttributeKey<String> AZURE_COSMOSDB_CONSISTENCY_LEVEL =
      stringKey("azure.cosmosdb.consistency.level");

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
  public static final AttributeKey<List<String>> AZURE_COSMOSDB_OPERATION_CONTACTED_REGIONS =
      stringArrayKey("azure.cosmosdb.operation.contacted_regions");

  /** The number of request units consumed by the operation. */
  public static final AttributeKey<Double> AZURE_COSMOSDB_OPERATION_REQUEST_CHARGE =
      doubleKey("azure.cosmosdb.operation.request_charge");

  /** Request payload size in bytes. */
  public static final AttributeKey<Long> AZURE_COSMOSDB_REQUEST_BODY_SIZE =
      longKey("azure.cosmosdb.request.body.size");

  /** Cosmos DB sub status code. */
  public static final AttributeKey<Long> AZURE_COSMOSDB_RESPONSE_SUB_STATUS_CODE =
      longKey("azure.cosmosdb.response.sub_status_code");

  // Enum definitions

  /** Values for {@link #AZURE_COSMOSDB_CONNECTION_MODE}. */
  public static final class AzureCosmosdbConnectionModeIncubatingValues {
    /** Gateway (HTTP) connection. */
    public static final String GATEWAY = "gateway";

    /** Direct connection. */
    public static final String DIRECT = "direct";

    private AzureCosmosdbConnectionModeIncubatingValues() {}
  }

  /** Values for {@link #AZURE_COSMOSDB_CONSISTENCY_LEVEL}. */
  public static final class AzureCosmosdbConsistencyLevelIncubatingValues {
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

    private AzureCosmosdbConsistencyLevelIncubatingValues() {}
  }

  private AzureIncubatingAttributes() {}
}
