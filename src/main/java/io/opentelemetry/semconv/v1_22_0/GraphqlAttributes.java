/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_22_0;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.experimental.java.j2
@SuppressWarnings("unused")
public final class GraphqlAttributes {

  /**
   * The GraphQL document being executed.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value may be sanitized to exclude sensitive information.
   * </ul>
   */
  public static final AttributeKey<String> GRAPHQL_DOCUMENT = stringKey("graphql.document");

  /** The name of the operation being executed. */
  public static final AttributeKey<String> GRAPHQL_OPERATION_NAME =
      stringKey("graphql.operation.name");

  /** The type of the operation being executed. */
  public static final AttributeKey<String> GRAPHQL_OPERATION_TYPE =
      stringKey("graphql.operation.type");

  // Enum definitions
  public static final class GraphqlOperationTypeValues {
    /** GraphQL query. */
    public static final String QUERY = "query";

    /** GraphQL mutation. */
    public static final String MUTATION = "mutation";

    /** GraphQL subscription. */
    public static final String SUBSCRIPTION = "subscription";

    private GraphqlOperationTypeValues() {}
  }

  private GraphqlAttributes() {}
}
