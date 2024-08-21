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
   * Name of the <a href="https://wikipedia.org/wiki/Deployment_environment">deployment
   * environment</a> (aka deployment tier).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li><code>deployment.environment.name</code> does not affect the uniqueness constraints
   *       defined through the <code>service.namespace</code>, <code>service.name</code> and <code>
   *       service.instance.id</code> resource attributes. This implies that resources carrying the
   *       following attribute combinations MUST be considered to be identifying the same service:
   *       <ul>
   *         <li><code>service.name=frontend</code>, <code>deployment.environment.name=production
   *             </code>
   *         <li><code>service.name=frontend</code>, <code>deployment.environment.name=staging
   *             </code>.
   *       </ul>
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
  public static final class DeploymentStatusValues {

    /** failed */
    public static final String FAILED = "failed";

    /** succeeded */
    public static final String SUCCEEDED = "succeeded";

    private DeploymentStatusValues() {}
  }

  private DeploymentIncubatingAttributes() {}
}
