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

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/java/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class AwsIncubatingAttributes {

  /**
   * The JSON-serialized value of each item in the <code>AttributeDefinitions</code> request field.
   */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_ATTRIBUTE_DEFINITIONS =
      stringArrayKey("aws.dynamodb.attribute_definitions");

  /** The value of the <code>AttributesToGet</code> request parameter. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_ATTRIBUTES_TO_GET =
      stringArrayKey("aws.dynamodb.attributes_to_get");

  /** The value of the <code>ConsistentRead</code> request parameter. */
  public static final AttributeKey<Boolean> AWS_DYNAMODB_CONSISTENT_READ =
      booleanKey("aws.dynamodb.consistent_read");

  /** The JSON-serialized value of each item in the <code>ConsumedCapacity</code> response field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_CONSUMED_CAPACITY =
      stringArrayKey("aws.dynamodb.consumed_capacity");

  /** The value of the <code>Count</code> response parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_COUNT = longKey("aws.dynamodb.count");

  /** The value of the <code>ExclusiveStartTableName</code> request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_EXCLUSIVE_START_TABLE =
      stringKey("aws.dynamodb.exclusive_start_table");

  /**
   * The JSON-serialized value of each item in the <code>GlobalSecondaryIndexUpdates</code> request
   * field.
   */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_GLOBAL_SECONDARY_INDEX_UPDATES =
      stringArrayKey("aws.dynamodb.global_secondary_index_updates");

  /**
   * The JSON-serialized value of each item of the <code>GlobalSecondaryIndexes</code> request field
   */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_GLOBAL_SECONDARY_INDEXES =
      stringArrayKey("aws.dynamodb.global_secondary_indexes");

  /** The value of the <code>IndexName</code> request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_INDEX_NAME =
      stringKey("aws.dynamodb.index_name");

  /** The JSON-serialized value of the <code>ItemCollectionMetrics</code> response field. */
  public static final AttributeKey<String> AWS_DYNAMODB_ITEM_COLLECTION_METRICS =
      stringKey("aws.dynamodb.item_collection_metrics");

  /** The value of the <code>Limit</code> request parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_LIMIT = longKey("aws.dynamodb.limit");

  /**
   * The JSON-serialized value of each item of the <code>LocalSecondaryIndexes</code> request field.
   */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_LOCAL_SECONDARY_INDEXES =
      stringArrayKey("aws.dynamodb.local_secondary_indexes");

  /** The value of the <code>ProjectionExpression</code> request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_PROJECTION =
      stringKey("aws.dynamodb.projection");

  /** The value of the <code>ProvisionedThroughput.ReadCapacityUnits</code> request parameter. */
  public static final AttributeKey<Double> AWS_DYNAMODB_PROVISIONED_READ_CAPACITY =
      doubleKey("aws.dynamodb.provisioned_read_capacity");

  /** The value of the <code>ProvisionedThroughput.WriteCapacityUnits</code> request parameter. */
  public static final AttributeKey<Double> AWS_DYNAMODB_PROVISIONED_WRITE_CAPACITY =
      doubleKey("aws.dynamodb.provisioned_write_capacity");

  /** The value of the <code>ScanIndexForward</code> request parameter. */
  public static final AttributeKey<Boolean> AWS_DYNAMODB_SCAN_FORWARD =
      booleanKey("aws.dynamodb.scan_forward");

  /** The value of the <code>ScannedCount</code> response parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_SCANNED_COUNT =
      longKey("aws.dynamodb.scanned_count");

  /** The value of the <code>Segment</code> request parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_SEGMENT = longKey("aws.dynamodb.segment");

  /** The value of the <code>Select</code> request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_SELECT = stringKey("aws.dynamodb.select");

  /** The number of items in the <code>TableNames</code> response parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_TABLE_COUNT =
      longKey("aws.dynamodb.table_count");

  /** The keys in the <code>RequestItems</code> object field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_TABLE_NAMES =
      stringArrayKey("aws.dynamodb.table_names");

  /** The value of the <code>TotalSegments</code> request parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_TOTAL_SEGMENTS =
      longKey("aws.dynamodb.total_segments");

  private AwsIncubatingAttributes() {}
}
