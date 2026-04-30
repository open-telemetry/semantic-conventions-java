/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/java/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class DeploymentAttributes {
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
   * <ul>
   *   <li>{@code service.name=frontend}, {@code deployment.environment.name=production}
   *   <li>{@code service.name=frontend}, {@code deployment.environment.name=staging}.
   * </ul>
   */
  public static final AttributeKey<String> DEPLOYMENT_ENVIRONMENT_NAME =
      stringKey("deployment.environment.name");

  // Enum definition
  /** Values for {@link #DEPLOYMENT_ENVIRONMENT_NAME}. */
  public static final class DeploymentEnvironmentNameValues {
    /** Production environment */
    public static final String PRODUCTION = "production";

    /** Staging environment */
    public static final String STAGING = "staging";

    /** Testing environment */
    public static final String TEST = "test";

    /** Development environment */
    public static final String DEVELOPMENT = "development";

    private DeploymentEnvironmentNameValues() {}
  }

  private DeploymentAttributes() {}
}
