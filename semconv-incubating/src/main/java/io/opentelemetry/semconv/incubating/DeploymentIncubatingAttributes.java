/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/java/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class DeploymentIncubatingAttributes {

  /**
   * Name of the <a href="https://wikipedia.org/wiki/Deployment_environment">deployment
   * environment</a> (aka deployment tier).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>`deployment.environment` does not affect the uniqueness constraints defined through the
   *       `service.namespace`, `service.name` and `service.instance.id` resource attributes. This
   *       implies that resources carrying the following attribute combinations MUST be considered
   *       to be identifying the same service:
   *       <p>`service.name=frontend`, `deployment.environment=production` `service.name=frontend`,
   *       `deployment.environment=staging`.
   * </ul>
   */
  public static final AttributeKey<String> DEPLOYMENT_ENVIRONMENT =
      stringKey("deployment.environment");

  private DeploymentIncubatingAttributes() {}
}
