/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class EnduserIncubatingAttributes {
  /**
   * Username or client_id extracted from the access token or <a
   * href="https://tools.ietf.org/html/rfc7235#section-4.2">Authorization</a> header in the inbound
   * request from outside the system.
   */
  public static final AttributeKey<String> ENDUSER_ID = stringKey("enduser.id");

  /**
   * Actual/assumed role the client is making the request under extracted from token or application
   * security context.
   */
  public static final AttributeKey<String> ENDUSER_ROLE = stringKey("enduser.role");

  /**
   * Scopes or granted authorities the client currently possesses extracted from token or
   * application security context. The value would come from the scope associated with an <a
   * href="https://tools.ietf.org/html/rfc6749#section-3.3">OAuth 2.0 Access Token</a> or an
   * attribute value in a <a
   * href="http://docs.oasis-open.org/security/saml/Post2.0/sstc-saml-tech-overview-2.0.html">SAML
   * 2.0 Assertion</a>.
   */
  public static final AttributeKey<String> ENDUSER_SCOPE = stringKey("enduser.scope");

  // Enum definitions

  private EnduserIncubatingAttributes() {}
}
