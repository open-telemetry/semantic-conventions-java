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
public final class FaasIncubatingAttributes {
  /**
   * A boolean that is true if the serverless function is executed for the first time (aka
   * cold-start).
   */
  public static final AttributeKey<Boolean> FAAS_COLDSTART = booleanKey("faas.coldstart");

  /**
   * A string containing the schedule period as <a
   * href="https://docs.oracle.com/cd/E12058_01/doc/doc.1014/e12030/cron_expressions.htm">Cron
   * Expression</a>.
   */
  public static final AttributeKey<String> FAAS_CRON = stringKey("faas.cron");

  /**
   * The name of the source on which the triggering operation was performed. For example, in Cloud
   * Storage or S3 corresponds to the bucket name, and in Cosmos DB to the database name.
   */
  public static final AttributeKey<String> FAAS_DOCUMENT_COLLECTION =
      stringKey("faas.document.collection");

  /**
   * The document name/table subjected to the operation. For example, in Cloud Storage or S3 is the
   * name of the file, and in Cosmos DB the table name.
   */
  public static final AttributeKey<String> FAAS_DOCUMENT_NAME = stringKey("faas.document.name");

  /** Describes the type of the operation that was performed on the data. */
  public static final AttributeKey<String> FAAS_DOCUMENT_OPERATION =
      stringKey("faas.document.operation");

  /**
   * A string containing the time when the data was accessed in the <a
   * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format expressed in
   * <a href="https://www.w3.org/TR/NOTE-datetime">UTC</a>.
   */
  public static final AttributeKey<String> FAAS_DOCUMENT_TIME = stringKey("faas.document.time");

  /**
   * The execution environment ID as a string, that will be potentially reused for other invocations
   * to the same function/function version.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li><strong>AWS Lambda:</strong> Use the (full) log stream name.
   * </ul>
   */
  public static final AttributeKey<String> FAAS_INSTANCE = stringKey("faas.instance");

  /** The invocation ID of the current function invocation. */
  public static final AttributeKey<String> FAAS_INVOCATION_ID = stringKey("faas.invocation_id");

  /**
   * The name of the invoked function.
   *
   * <p>Notes:
   *
   * <p>SHOULD be equal to the {@code faas.name} resource attribute of the invoked function.
   */
  public static final AttributeKey<String> FAAS_INVOKED_NAME = stringKey("faas.invoked_name");

  /**
   * The cloud provider of the invoked function.
   *
   * <p>Notes:
   *
   * <p>SHOULD be equal to the {@code cloud.provider} resource attribute of the invoked function.
   */
  public static final AttributeKey<String> FAAS_INVOKED_PROVIDER =
      stringKey("faas.invoked_provider");

  /**
   * The cloud region of the invoked function.
   *
   * <p>Notes:
   *
   * <p>SHOULD be equal to the {@code cloud.region} resource attribute of the invoked function.
   */
  public static final AttributeKey<String> FAAS_INVOKED_REGION = stringKey("faas.invoked_region");

  /**
   * The amount of memory available to the serverless function converted to Bytes.
   *
   * <p>Notes:
   *
   * <p>It's recommended to set this attribute since e.g. too little memory can easily stop a Java
   * AWS Lambda function from working correctly. On AWS Lambda, the environment variable {@code
   * AWS_LAMBDA_FUNCTION_MEMORY_SIZE} provides this information (which must be multiplied by
   * 1,048,576).
   */
  public static final AttributeKey<Long> FAAS_MAX_MEMORY = longKey("faas.max_memory");

  /**
   * The name of the single function that this runtime instance executes.
   *
   * <p>Notes:
   *
   * <p>This is the name of the function as configured/deployed on the FaaS platform and is usually
   * different from the name of the callback function (which may be stored in the <a
   * href="/docs/general/attributes.md#source-code-attributes">{@code code.namespace}/{@code
   * code.function.name}</a> span attributes).
   *
   * <p>For some cloud providers, the above definition is ambiguous. The following definition of
   * function name MUST be used for this attribute (and consequently the span name) for the listed
   * cloud providers/products:
   *
   * <ul>
   *   <li><strong>Azure:</strong> The full name {@code <FUNCAPP>/<FUNC>}, i.e., function app name
   *       followed by a forward slash followed by the function name (this form can also be seen in
   *       the resource JSON for the function). This means that a span attribute MUST be used, as an
   *       Azure function app can host multiple functions that would usually share a TracerProvider
   *       (see also the {@code cloud.resource_id} attribute).
   * </ul>
   */
  public static final AttributeKey<String> FAAS_NAME = stringKey("faas.name");

  /**
   * A string containing the function invocation time in the <a
   * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format expressed in
   * <a href="https://www.w3.org/TR/NOTE-datetime">UTC</a>.
   */
  public static final AttributeKey<String> FAAS_TIME = stringKey("faas.time");

  /** Type of the trigger which caused this function invocation. */
  public static final AttributeKey<String> FAAS_TRIGGER = stringKey("faas.trigger");

  /**
   * The immutable version of the function being executed.
   *
   * <p>Notes:
   *
   * <p>Depending on the cloud provider and platform, use:
   *
   * <ul>
   *   <li><strong>AWS Lambda:</strong> The <a
   *       href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-versions.html">function
   *       version</a> (an integer represented as a decimal string).
   *   <li><strong>Google Cloud Run (Services):</strong> The <a
   *       href="https://cloud.google.com/run/docs/managing/revisions">revision</a> (i.e., the
   *       function name plus the revision suffix).
   *   <li><strong>Google Cloud Functions:</strong> The value of the <a
   *       href="https://cloud.google.com/functions/docs/env-var#runtime_environment_variables_set_automatically">{@code
   *       K_REVISION} environment variable</a>.
   *   <li><strong>Azure Functions:</strong> Not applicable. Do not set this attribute.
   * </ul>
   */
  public static final AttributeKey<String> FAAS_VERSION = stringKey("faas.version");

  // Enum definitions

  /** Values for {@link #FAAS_DOCUMENT_OPERATION}. */
  public static final class FaasDocumentOperationIncubatingValues {
    /** When a new object is created. */
    public static final String INSERT = "insert";

    /** When an object is modified. */
    public static final String EDIT = "edit";

    /** When an object is deleted. */
    public static final String DELETE = "delete";

    private FaasDocumentOperationIncubatingValues() {}
  }

  /** Values for {@link #FAAS_INVOKED_PROVIDER}. */
  public static final class FaasInvokedProviderIncubatingValues {
    /** Alibaba Cloud */
    public static final String ALIBABA_CLOUD = "alibaba_cloud";

    /** Amazon Web Services */
    public static final String AWS = "aws";

    /** Microsoft Azure */
    public static final String AZURE = "azure";

    /** Google Cloud Platform */
    public static final String GCP = "gcp";

    /** Tencent Cloud */
    public static final String TENCENT_CLOUD = "tencent_cloud";

    private FaasInvokedProviderIncubatingValues() {}
  }

  /** Values for {@link #FAAS_TRIGGER}. */
  public static final class FaasTriggerIncubatingValues {
    /** A response to some data source operation such as a database or filesystem read/write */
    public static final String DATASOURCE = "datasource";

    /** To provide an answer to an inbound HTTP request */
    public static final String HTTP = "http";

    /** A function is set to be executed when messages are sent to a messaging system */
    public static final String PUBSUB = "pubsub";

    /** A function is scheduled to be executed regularly */
    public static final String TIMER = "timer";

    /** If none of the others apply */
    public static final String OTHER = "other";

    private FaasTriggerIncubatingValues() {}
  }

  private FaasIncubatingAttributes() {}
}
