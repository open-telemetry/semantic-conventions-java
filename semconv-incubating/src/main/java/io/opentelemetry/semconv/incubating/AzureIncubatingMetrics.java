/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class AzureIncubatingMetrics {

  /** Name of the {@code azure.cosmosdb.client.active_instance.count} metric. */
  public static final String AZURE_COSMOSDB_CLIENT_ACTIVE_INSTANCE_COUNT_NAME =
      "azure.cosmosdb.client.active_instance.count";

  /** Unit of the {@code azure.cosmosdb.client.active_instance.count} metric. */
  public static final String AZURE_COSMOSDB_CLIENT_ACTIVE_INSTANCE_COUNT_UNIT = "{instance}";

  /** Description of the {@code azure.cosmosdb.client.active_instance.count} metric. */
  public static final String AZURE_COSMOSDB_CLIENT_ACTIVE_INSTANCE_COUNT_DESCRIPTION =
      "Number of active client instances.";

  /** Name of the {@code azure.cosmosdb.client.operation.request_charge} metric. */
  public static final String AZURE_COSMOSDB_CLIENT_OPERATION_REQUEST_CHARGE_NAME =
      "azure.cosmosdb.client.operation.request_charge";

  /** Unit of the {@code azure.cosmosdb.client.operation.request_charge} metric. */
  public static final String AZURE_COSMOSDB_CLIENT_OPERATION_REQUEST_CHARGE_UNIT = "{request_unit}";

  /** Description of the {@code azure.cosmosdb.client.operation.request_charge} metric. */
  public static final String AZURE_COSMOSDB_CLIENT_OPERATION_REQUEST_CHARGE_DESCRIPTION =
      "[Request units](https://learn.microsoft.com/azure/cosmos-db/request-units) consumed by the operation.";

  private AzureIncubatingMetrics() {}
}
