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
   *   <li><code>deployment.environment</code> does not affect the uniqueness constraints defined
   *       through the <code>service.namespace</code>, <code>service.name</code> and <code>
   *       service.instance.id</code> resource attributes. This implies that resources carrying the
   *       following attribute combinations MUST be considered to be identifying the same service:
   *       <ul>
   *         <li><code>service.name=frontend</code>, <code>deployment.environment=production</code>
   *         <li><code>service.name=frontend</code>, <code>deployment.environment=staging</code>.
   *       </ul>
   * </ul>
   */
  public static final AttributeKey<String> DEPLOYMENT_ENVIRONMENT =
      stringKey("deployment.environment");

  private DeploymentIncubatingAttributes() {}
}
