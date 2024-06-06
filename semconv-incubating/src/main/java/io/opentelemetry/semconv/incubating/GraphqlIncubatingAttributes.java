
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
public final class GraphqlIncubatingAttributes {

  /**
  * The GraphQL document being executed.
  *
  * <p>Notes:
        
        
        <ul> <li>The value may be sanitized to exclude sensitive information.</li> </ul>
  *
  */
  public static final AttributeKey<String> GRAPHQL_DOCUMENT = stringKey("graphql.document");

  /**
  * The name of the operation being executed.
  *
  */
  public static final AttributeKey<String> GRAPHQL_OPERATION_NAME = stringKey("graphql.operation.name");

  /**
  * The type of the operation being executed.
  *
  */
  public static final AttributeKey<String> GRAPHQL_OPERATION_TYPE = stringKey("graphql.operation.type");
  // Enum definitions
  /**
  * Values for {@link #GRAPHQL_OPERATION_TYPE}.
  *
  */
  public static final class GraphqlOperationTypeValues {
      /** GraphQL query. */
      public static final String QUERY = "query";
      /** GraphQL mutation. */
      public static final String MUTATION = "mutation";
      /** GraphQL subscription. */
      public static final String SUBSCRIPTION = "subscription";

      private GraphqlOperationTypeValues() {}
  }

  private GraphqlIncubatingAttributes() {}
}