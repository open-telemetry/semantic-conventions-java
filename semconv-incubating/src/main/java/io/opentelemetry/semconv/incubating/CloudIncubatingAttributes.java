/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class CloudIncubatingAttributes {
  /** The cloud account ID the resource is assigned to. */
  public static final AttributeKey<String> CLOUD_ACCOUNT_ID = stringKey("cloud.account.id");

  /**
   * Cloud regions often have multiple, isolated locations known as zones to increase availability.
   * Availability zone represents the zone where the resource is running.
   *
   * <p>Notes:
   *
   * <p>Availability zones are called "zones" on Alibaba Cloud and Google Cloud.
   */
  public static final AttributeKey<String> CLOUD_AVAILABILITY_ZONE =
      stringKey("cloud.availability_zone");

  /**
   * The cloud platform in use.
   *
   * <p>Notes:
   *
   * <p>The prefix of the service SHOULD match the one specified in {@code cloud.provider}.
   */
  public static final AttributeKey<String> CLOUD_PLATFORM = stringKey("cloud.platform");

  /** Name of the cloud provider. */
  public static final AttributeKey<String> CLOUD_PROVIDER = stringKey("cloud.provider");

  /**
   * The geographical region the resource is running.
   *
   * <p>Notes:
   *
   * <p>Refer to your provider's docs to see the available regions, for example <a
   * href="https://www.alibabacloud.com/help/doc-detail/40654.htm">Alibaba Cloud regions</a>, <a
   * href="https://aws.amazon.com/about-aws/global-infrastructure/regions_az/">AWS regions</a>, <a
   * href="https://azure.microsoft.com/global-infrastructure/geographies/">Azure regions</a>, <a
   * href="https://cloud.google.com/about/locations">Google Cloud regions</a>, or <a
   * href="https://www.tencentcloud.com/document/product/213/6091">Tencent Cloud regions</a>.
   */
  public static final AttributeKey<String> CLOUD_REGION = stringKey("cloud.region");

  /**
   * Cloud provider-specific native identifier of the monitored cloud resource (e.g. an <a
   * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> on
   * AWS, a <a href="https://learn.microsoft.com/rest/api/resources/resources/get-by-id">fully
   * qualified resource ID</a> on Azure, a <a
   * href="https://cloud.google.com/apis/design/resource_names#full_resource_name">full resource
   * name</a> on GCP)
   *
   * <p>Notes:
   *
   * <p>On some cloud providers, it may not be possible to determine the full ID at startup, so it
   * may be necessary to set {@code cloud.resource_id} as a span attribute instead.
   *
   * <p>The exact value to use for {@code cloud.resource_id} depends on the cloud provider. The
   * following well-known definitions MUST be used if you set this attribute and they apply:
   *
   * <p>
   *
   * <ul>
   *   <li><strong>AWS Lambda:</strong> The function <a
   *       href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a>.
   *       Take care not to use the "invoked ARN" directly but replace any <a
   *       href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-aliases.html">alias
   *       suffix</a> with the resolved function version, as the same runtime instance may be
   *       invocable with multiple different aliases.
   *   <li><strong>GCP:</strong> The <a
   *       href="https://cloud.google.com/iam/docs/full-resource-names">URI of the resource</a>
   *   <li><strong>Azure:</strong> The <a
   *       href="https://docs.microsoft.com/rest/api/resources/resources/get-by-id">Fully Qualified
   *       Resource ID</a> of the invoked function, <em>not</em> the function app, having the form
   *       {@code
   *       /subscriptions/<SUBSCRIPTION_GUID>/resourceGroups/<RG>/providers/Microsoft.Web/sites/<FUNCAPP>/functions/<FUNC>}.
   *       This means that a span attribute MUST be used, as an Azure function app can host multiple
   *       functions that would usually share a TracerProvider.
   * </ul>
   */
  public static final AttributeKey<String> CLOUD_RESOURCE_ID = stringKey("cloud.resource_id");

  // Enum definitions
  /** Values for {@link #CLOUD_PLATFORM}. */
  public static final class CloudPlatformIncubatingValues {
    /** Alibaba Cloud Elastic Compute Service */
    public static final String ALIBABA_CLOUD_ECS = "alibaba_cloud_ecs";

    /** Alibaba Cloud Function Compute */
    public static final String ALIBABA_CLOUD_FC = "alibaba_cloud_fc";

    /** Red Hat OpenShift on Alibaba Cloud */
    public static final String ALIBABA_CLOUD_OPENSHIFT = "alibaba_cloud_openshift";

    /** AWS Elastic Compute Cloud */
    public static final String AWS_EC2 = "aws_ec2";

    /** AWS Elastic Container Service */
    public static final String AWS_ECS = "aws_ecs";

    /** AWS Elastic Kubernetes Service */
    public static final String AWS_EKS = "aws_eks";

    /** AWS Lambda */
    public static final String AWS_LAMBDA = "aws_lambda";

    /** AWS Elastic Beanstalk */
    public static final String AWS_ELASTIC_BEANSTALK = "aws_elastic_beanstalk";

    /** AWS App Runner */
    public static final String AWS_APP_RUNNER = "aws_app_runner";

    /** Red Hat OpenShift on AWS (ROSA) */
    public static final String AWS_OPENSHIFT = "aws_openshift";

    /** Azure Virtual Machines */
    public static final String AZURE_VM = "azure_vm";

    /** Azure Container Apps */
    public static final String AZURE_CONTAINER_APPS = "azure_container_apps";

    /** Azure Container Instances */
    public static final String AZURE_CONTAINER_INSTANCES = "azure_container_instances";

    /** Azure Kubernetes Service */
    public static final String AZURE_AKS = "azure_aks";

    /** Azure Functions */
    public static final String AZURE_FUNCTIONS = "azure_functions";

    /** Azure App Service */
    public static final String AZURE_APP_SERVICE = "azure_app_service";

    /** Azure Red Hat OpenShift */
    public static final String AZURE_OPENSHIFT = "azure_openshift";

    /** Google Bare Metal Solution (BMS) */
    public static final String GCP_BARE_METAL_SOLUTION = "gcp_bare_metal_solution";

    /** Google Cloud Compute Engine (GCE) */
    public static final String GCP_COMPUTE_ENGINE = "gcp_compute_engine";

    /** Google Cloud Run */
    public static final String GCP_CLOUD_RUN = "gcp_cloud_run";

    /** Google Cloud Kubernetes Engine (GKE) */
    public static final String GCP_KUBERNETES_ENGINE = "gcp_kubernetes_engine";

    /** Google Cloud Functions (GCF) */
    public static final String GCP_CLOUD_FUNCTIONS = "gcp_cloud_functions";

    /** Google Cloud App Engine (GAE) */
    public static final String GCP_APP_ENGINE = "gcp_app_engine";

    /** Red Hat OpenShift on Google Cloud */
    public static final String GCP_OPENSHIFT = "gcp_openshift";

    /** Red Hat OpenShift on IBM Cloud */
    public static final String IBM_CLOUD_OPENSHIFT = "ibm_cloud_openshift";

    /** Tencent Cloud Cloud Virtual Machine (CVM) */
    public static final String TENCENT_CLOUD_CVM = "tencent_cloud_cvm";

    /** Tencent Cloud Elastic Kubernetes Service (EKS) */
    public static final String TENCENT_CLOUD_EKS = "tencent_cloud_eks";

    /** Tencent Cloud Serverless Cloud Function (SCF) */
    public static final String TENCENT_CLOUD_SCF = "tencent_cloud_scf";

    private CloudPlatformIncubatingValues() {}
  }

  /** Values for {@link #CLOUD_PROVIDER}. */
  public static final class CloudProviderIncubatingValues {
    /** Alibaba Cloud */
    public static final String ALIBABA_CLOUD = "alibaba_cloud";

    /** Amazon Web Services */
    public static final String AWS = "aws";

    /** Microsoft Azure */
    public static final String AZURE = "azure";

    /** Google Cloud Platform */
    public static final String GCP = "gcp";

    /** Heroku Platform as a Service */
    public static final String HEROKU = "heroku";

    /** IBM Cloud */
    public static final String IBM_CLOUD = "ibm_cloud";

    /** Tencent Cloud */
    public static final String TENCENT_CLOUD = "tencent_cloud";

    private CloudProviderIncubatingValues() {}
  }

  private CloudIncubatingAttributes() {}
}
