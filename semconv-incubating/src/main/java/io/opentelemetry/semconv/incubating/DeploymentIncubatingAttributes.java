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
public final class DeploymentIncubatingAttributes {
  /**
   * 'Deprecated, use {@code deployment.environment.name} instead.'
   *
   * <p>
   *
   * @deprecated Deprecated, use {@code deployment.environment.name} instead.
   */
  @Deprecated
  public static final AttributeKey<String> DEPLOYMENT_ENVIRONMENT =
      stringKey("deployment.environment");

  /**
   * Name of the <a href="https://wikipedia.org/wiki/Deployment_environment">deployment
   * environment</a> (aka deployment tier).
   *
   * <p>Notes:
   *
   * <p>{@code deployment.environment.name} does not affect the uniqueness constraints defined
   * through the {@code service.namespace}, {@code service.name} and {@code service.instance.id}
   * resource attributes. This implies that resources carrying the following attribute combinations
   * MUST be considered to be identifying the same service:
   *
   * <p>
   *
   * <ul>
   *   <li>{@code service.name=frontend}, {@code deployment.environment.name=production}
   *   <li>{@code service.name=frontend}, {@code deployment.environment.name=staging}.
   * </ul>
   */
  public static final AttributeKey<String> DEPLOYMENT_ENVIRONMENT_NAME =
      stringKey("deployment.environment.name");

  /** The id of the deployment. */
  public static final AttributeKey<String> DEPLOYMENT_ID = stringKey("deployment.id");

  /** The name of the deployment. */
  public static final AttributeKey<String> DEPLOYMENT_NAME = stringKey("deployment.name");

  /** The status of the deployment. */
  public static final AttributeKey<String> DEPLOYMENT_STATUS = stringKey("deployment.status");

  // Enum definitions
  /** Values for {@link #DEPLOYMENT_STATUS}. */
  public static final class DeploymentStatusIncubatingValues {
    /** failed */
    public static final String FAILED = "failed";

    /** succeeded */
    public static final String SUCCEEDED = "succeeded";

    private DeploymentStatusIncubatingValues() {}
  }

  private DeploymentIncubatingAttributes() {}
}
