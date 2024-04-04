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
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class AwsIncubatingAttributes {

  /** The JSON-serialized value of each item in the {@code AttributeDefinitions} request field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_ATTRIBUTE_DEFINITIONS =
      stringArrayKey("aws.dynamodb.attribute_definitions");

  /** The value of the {@code AttributesToGet} request parameter. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_ATTRIBUTES_TO_GET =
      stringArrayKey("aws.dynamodb.attributes_to_get");

  /** The value of the {@code ConsistentRead} request parameter. */
  public static final AttributeKey<Boolean> AWS_DYNAMODB_CONSISTENT_READ =
      booleanKey("aws.dynamodb.consistent_read");

  /** The JSON-serialized value of each item in the {@code ConsumedCapacity} response field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_CONSUMED_CAPACITY =
      stringArrayKey("aws.dynamodb.consumed_capacity");

  /** The value of the {@code Count} response parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_COUNT = longKey("aws.dynamodb.count");

  /** The value of the {@code ExclusiveStartTableName} request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_EXCLUSIVE_START_TABLE =
      stringKey("aws.dynamodb.exclusive_start_table");

  /**
   * The JSON-serialized value of each item in the {@code GlobalSecondaryIndexUpdates} request
   * field.
   */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_GLOBAL_SECONDARY_INDEX_UPDATES =
      stringArrayKey("aws.dynamodb.global_secondary_index_updates");

  /** The JSON-serialized value of each item of the {@code GlobalSecondaryIndexes} request field */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_GLOBAL_SECONDARY_INDEXES =
      stringArrayKey("aws.dynamodb.global_secondary_indexes");

  /** The value of the {@code IndexName} request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_INDEX_NAME =
      stringKey("aws.dynamodb.index_name");

  /** The JSON-serialized value of the {@code ItemCollectionMetrics} response field. */
  public static final AttributeKey<String> AWS_DYNAMODB_ITEM_COLLECTION_METRICS =
      stringKey("aws.dynamodb.item_collection_metrics");

  /** The value of the {@code Limit} request parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_LIMIT = longKey("aws.dynamodb.limit");

  /** The JSON-serialized value of each item of the {@code LocalSecondaryIndexes} request field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_LOCAL_SECONDARY_INDEXES =
      stringArrayKey("aws.dynamodb.local_secondary_indexes");

  /** The value of the {@code ProjectionExpression} request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_PROJECTION =
      stringKey("aws.dynamodb.projection");

  /** The value of the {@code ProvisionedThroughput.ReadCapacityUnits} request parameter. */
  public static final AttributeKey<Double> AWS_DYNAMODB_PROVISIONED_READ_CAPACITY =
      doubleKey("aws.dynamodb.provisioned_read_capacity");

  /** The value of the {@code ProvisionedThroughput.WriteCapacityUnits} request parameter. */
  public static final AttributeKey<Double> AWS_DYNAMODB_PROVISIONED_WRITE_CAPACITY =
      doubleKey("aws.dynamodb.provisioned_write_capacity");

  /** The value of the {@code ScanIndexForward} request parameter. */
  public static final AttributeKey<Boolean> AWS_DYNAMODB_SCAN_FORWARD =
      booleanKey("aws.dynamodb.scan_forward");

  /** The value of the {@code ScannedCount} response parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_SCANNED_COUNT =
      longKey("aws.dynamodb.scanned_count");

  /** The value of the {@code Segment} request parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_SEGMENT = longKey("aws.dynamodb.segment");

  /** The value of the {@code Select} request parameter. */
  public static final AttributeKey<String> AWS_DYNAMODB_SELECT = stringKey("aws.dynamodb.select");

  /** The number of items in the {@code TableNames} response parameter. */
  public static final AttributeKey<Long> AWS_DYNAMODB_TABLE_COUNT =
      longKey("aws.dynamodb.table_count");

  /** The keys in the {@code RequestItems} object field. */
  public static final AttributeKey<List<String>> AWS_DYNAMODB_TABLE_NAMES =
      stringArrayKey("aws.dynamodb.table_names");

  /** The value of the {@code TotalSegments} request parameter. */
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

  /** The ID of a running ECS task. The ID MUST be extracted from {@code task.arn}. */
  public static final AttributeKey<String> AWS_ECS_TASK_ID = stringKey("aws.ecs.task.id");

  /** The revision for the task definition used to create the ECS task. */
  public static final AttributeKey<String> AWS_ECS_TASK_REVISION =
      stringKey("aws.ecs.task.revision");

  /** The ARN of an EKS cluster. */
  public static final AttributeKey<String> AWS_EKS_CLUSTER_ARN = stringKey("aws.eks.cluster.arn");

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
   * The Amazon Resource Name(s) (ARN) of the AWS log group(s).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>See the <a
   *       href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/iam-access-control-overview-cwl.html#CWL_ARN_Format">log
   *       group ARN format documentation</a>.
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
   *   <li>See the <a
   *       href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/iam-access-control-overview-cwl.html#CWL_ARN_Format">log
   *       stream ARN format documentation</a>. One log group can contain several log streams, so
   *       these ARNs necessarily identify both a log group and a log stream.
   * </ul>
   */
  public static final AttributeKey<List<String>> AWS_LOG_STREAM_ARNS =
      stringArrayKey("aws.log.stream.arns");

  /** The name(s) of the AWS log stream(s) an application is writing to. */
  public static final AttributeKey<List<String>> AWS_LOG_STREAM_NAMES =
      stringArrayKey("aws.log.stream.names");

  /**
   * The AWS request ID as returned in the response headers {@code x-amz-request-id} or {@code
   * x-amz-requestid}.
   */
  public static final AttributeKey<String> AWS_REQUEST_ID = stringKey("aws.request_id");

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

  // Enum definitions
  /** Values for {@link #AWS_ECS_LAUNCHTYPE}. */
  public static final class AwsEcsLaunchtypeValues {
    /** ec2. */
    public static final String EC2 = "ec2";

    /** fargate. */
    public static final String FARGATE = "fargate";

    private AwsEcsLaunchtypeValues() {}
  }

  private AwsIncubatingAttributes() {}
}
