
/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.doubleKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;

import static io.opentelemetry.semconv.AttributeKeyTemplate.stringArrayKeyTemplate;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class DeploymentIncubatingAttributes {

  /**
  * Name of the <a href="https://wikipedia.org/wiki/Deployment_environment">deployment environment</a> (aka deployment tier).
  *
  * <p>Notes:
        
        
        <ul> <li>{@code deployment.environment} does not affect the uniqueness constraints defined through
the {@code service.namespace}, {@code service.name} and {@code service.instance.id} resource attributes.
This implies that resources carrying the following attribute combinations MUST be
considered to be identifying the same service:</li><li>{@code service.name=frontend}, {@code deployment.environment=production}</li>
<li>{@code service.name=frontend}, {@code deployment.environment=staging}.</li>
 </ul>
  *
  */
  public static final AttributeKey<String> DEPLOYMENT_ENVIRONMENT = stringKey("deployment.environment");

  private DeploymentIncubatingAttributes() {}
}