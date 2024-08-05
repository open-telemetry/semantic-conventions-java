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
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
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

  /**
   * The ARN of an <a
   * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/clusters.html">ECS
   * cluster</a>.
   */
  public static final AttributeKey<String> AWS_ECS_CLUSTER_ARN = stringKey("aws.ecs.cluster.arn");

  /**
   * The Amazon Resource Name (ARN) of an <a
   * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ECS_instances.html">ECS
   * container instance</a>.
   */
  public static final AttributeKey<String> AWS_ECS_CONTAINER_ARN =
      stringKey("aws.ecs.container.arn");

  /**
   * The <a
   * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">launch
   * type</a> for an ECS task.
   */
  public static final AttributeKey<String> AWS_ECS_LAUNCHTYPE = stringKey("aws.ecs.launchtype");

  /**
   * The ARN of a running <a
   * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-account-settings.html#ecs-resource-ids">ECS
   * task</a>.
   */
  public static final AttributeKey<String> AWS_ECS_TASK_ARN = stringKey("aws.ecs.task.arn");

  /**
   * The family name of the <a
   * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definitions.html">ECS
   * task definition</a> used to create the ECS task.
   */
  public static final AttributeKey<String> AWS_ECS_TASK_FAMILY = stringKey("aws.ecs.task.family");

  /** The ID of a running ECS task. The ID MUST be extracted from <code>task.arn</code>. */
  public static final AttributeKey<String> AWS_ECS_TASK_ID = stringKey("aws.ecs.task.id");

  /** The revision for the task definition used to create the ECS task. */
  public static final AttributeKey<String> AWS_ECS_TASK_REVISION =
      stringKey("aws.ecs.task.revision");

  /** The ARN of an EKS cluster. */
  public static final AttributeKey<String> AWS_EKS_CLUSTER_ARN = stringKey("aws.eks.cluster.arn");

  /**
   * The full invoked ARN as provided on the <code>Context</code> passed to the function (<code>
   * Lambda-Runtime-Invoked-Function-Arn</code> header on the <code>/runtime/invocation/next</code>
   * applicable).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This may be different from `cloud.resource_id` if an alias is involved.
   * </ul>
   */
  public static final AttributeKey<String> AWS_LAMBDA_INVOKED_ARN =
      stringKey("aws.lambda.invoked_arn");

  /**
   * The Amazon Resource Name(s) (ARN) of the AWS log group(s).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>See the [log group ARN format
   *       documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/iam-access-control-overview-cwl.html#CWL_ARN_Format).
   * </ul>
   */
  public static final AttributeKey<List<String>> AWS_LOG_GROUP_ARNS =
      stringArrayKey("aws.log.group.arns");

  /**
   * The name(s) of the AWS log group(s) an application is writing to.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Multiple log groups must be supported for cases like multi-container applications, where
   *       a single application has sidecar containers, and each write to their own log group.
   * </ul>
   */
  public static final AttributeKey<List<String>> AWS_LOG_GROUP_NAMES =
      stringArrayKey("aws.log.group.names");

  /**
   * The ARN(s) of the AWS log stream(s).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>See the [log stream ARN format
   *       documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/iam-access-control-overview-cwl.html#CWL_ARN_Format).
   *       One log group can contain several log streams, so these ARNs necessarily identify both a
   *       log group and a log stream.
   * </ul>
   */
  public static final AttributeKey<List<String>> AWS_LOG_STREAM_ARNS =
      stringArrayKey("aws.log.stream.arns");

  /** The name(s) of the AWS log stream(s) an application is writing to. */
  public static final AttributeKey<List<String>> AWS_LOG_STREAM_NAMES =
      stringArrayKey("aws.log.stream.names");

  /**
   * The AWS request ID as returned in the response headers <code>x-amz-request-id</code> or <code>
   * x-amz-requestid</code>.
   */
  public static final AttributeKey<String> AWS_REQUEST_ID = stringKey("aws.request_id");

  /**
   * The S3 bucket name the request refers to. Corresponds to the <code>--bucket</code> parameter of
   * the <a href="https://docs.aws.amazon.com/cli/latest/reference/s3api/index.html">S3 API</a>
   * operations.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The `bucket` attribute is applicable to all S3 operations that reference a bucket, i.e.
   *       that require the bucket name as a mandatory parameter. This applies to almost all S3
   *       operations except `list-buckets`.
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_BUCKET = stringKey("aws.s3.bucket");

  /**
   * The source object (in the form <code>bucket</code>/<code>key</code>) for the copy operation.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The `copy_source` attribute applies to S3 copy operations and corresponds to the
   *       `--copy-source` parameter of the [copy-object operation within the S3
   *       API](https://docs.aws.amazon.com/cli/latest/reference/s3api/copy-object.html). This
   *       applies in particular to the following operations:
   *       <p>-
   *       [copy-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/copy-object.html) -
   *       [upload-part-copy](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html)
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_COPY_SOURCE = stringKey("aws.s3.copy_source");

  /**
   * The delete request container that specifies the objects to be deleted.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The `delete` attribute is only applicable to the
   *       [delete-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/delete-object.html)
   *       operation. The `delete` attribute corresponds to the `--delete` parameter of the
   *       [delete-objects operation within the S3
   *       API](https://docs.aws.amazon.com/cli/latest/reference/s3api/delete-objects.html).
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_DELETE = stringKey("aws.s3.delete");

  /**
   * The S3 object key the request refers to. Corresponds to the <code>--key</code> parameter of the
   * <a href="https://docs.aws.amazon.com/cli/latest/reference/s3api/index.html">S3 API</a>
   * operations.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The `key` attribute is applicable to all object-related S3 operations, i.e. that require
   *       the object key as a mandatory parameter. This applies in particular to the following
   *       operations:
   *       <p>-
   *       [copy-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/copy-object.html) -
   *       [delete-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/delete-object.html)
   *       - [get-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/get-object.html) -
   *       [head-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/head-object.html) -
   *       [put-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/put-object.html) -
   *       [restore-object](https://docs.aws.amazon.com/cli/latest/reference/s3api/restore-object.html)
   *       -
   *       [select-object-content](https://docs.aws.amazon.com/cli/latest/reference/s3api/select-object-content.html)
   *       -
   *       [abort-multipart-upload](https://docs.aws.amazon.com/cli/latest/reference/s3api/abort-multipart-upload.html)
   *       -
   *       [complete-multipart-upload](https://docs.aws.amazon.com/cli/latest/reference/s3api/complete-multipart-upload.html)
   *       -
   *       [create-multipart-upload](https://docs.aws.amazon.com/cli/latest/reference/s3api/create-multipart-upload.html)
   *       - [list-parts](https://docs.aws.amazon.com/cli/latest/reference/s3api/list-parts.html) -
   *       [upload-part](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html) -
   *       [upload-part-copy](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html)
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
   *   <li>The `part_number` attribute is only applicable to the
   *       [upload-part](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html)
   *       and
   *       [upload-part-copy](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html)
   *       operations. The `part_number` attribute corresponds to the `--part-number` parameter of
   *       the [upload-part operation within the S3
   *       API](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html).
   * </ul>
   */
  public static final AttributeKey<Long> AWS_S3_PART_NUMBER = longKey("aws.s3.part_number");

  /**
   * Upload ID that identifies the multipart upload.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The `upload_id` attribute applies to S3 multipart-upload operations and corresponds to
   *       the `--upload-id` parameter of the [S3
   *       API](https://docs.aws.amazon.com/cli/latest/reference/s3api/index.html) multipart
   *       operations. This applies in particular to the following operations:
   *       <p>-
   *       [abort-multipart-upload](https://docs.aws.amazon.com/cli/latest/reference/s3api/abort-multipart-upload.html)
   *       -
   *       [complete-multipart-upload](https://docs.aws.amazon.com/cli/latest/reference/s3api/complete-multipart-upload.html)
   *       - [list-parts](https://docs.aws.amazon.com/cli/latest/reference/s3api/list-parts.html) -
   *       [upload-part](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part.html) -
   *       [upload-part-copy](https://docs.aws.amazon.com/cli/latest/reference/s3api/upload-part-copy.html)
   * </ul>
   */
  public static final AttributeKey<String> AWS_S3_UPLOAD_ID = stringKey("aws.s3.upload_id");

  // Enum definitions
  /** Values for {@link #AWS_ECS_LAUNCHTYPE}. */
  public static final class AwsEcsLaunchtypeValues {

    /** ec2 */
    public static final String EC2 = "ec2";

    /** fargate */
    public static final String FARGATE = "fargate";

    private AwsEcsLaunchtypeValues() {}
  }

  private AwsIncubatingAttributes() {}
}
