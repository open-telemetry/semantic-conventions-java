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
public final class UrlAttributes {

  /** The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.5">URI fragment</a> component */
  public static final AttributeKey<String> URL_FRAGMENT = stringKey("url.fragment");

  /**
   * Absolute URL describing a network resource according to <a
   * href="https://www.rfc-editor.org/rfc/rfc3986">RFC3986</a>
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>
   *       <p>For network calls, URL usually has <code>scheme://host[:port][path][?query][#fragment]
   *       </code> format, where the fragment is not transmitted over HTTP, but if it is known, it
   *       SHOULD be included nevertheless. <code>url.full</code> MUST NOT contain credentials
   *       passed via URL in form of <code>https://username:password@www.example.com/</code>. In
   *       such case username and password SHOULD be redacted and attribute's value SHOULD be <code>
   *       https://REDACTED:REDACTED@www.example.com/</code>. <code>url.full</code> SHOULD capture
   *       the absolute URL when it is available (or can be reconstructed). Sensitive content
   *       provided in <code>url.full</code> SHOULD be scrubbed when instrumentations can identify
   *       it.
   * </ul>
   */
  public static final AttributeKey<String> URL_FULL = stringKey("url.full");

  /**
   * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.3">URI path</a> component
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>
   *       <p>Sensitive content provided in <code>url.path</code> SHOULD be scrubbed when
   *       instrumentations can identify it.
   * </ul>
   */
  public static final AttributeKey<String> URL_PATH = stringKey("url.path");

  /**
   * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.4">URI query</a> component
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>
   *       <p>Sensitive content provided in <code>url.query</code> SHOULD be scrubbed when
   *       instrumentations can identify it.
   * </ul>
   */
  public static final AttributeKey<String> URL_QUERY = stringKey("url.query");

  /**
   * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.1">URI scheme</a> component
   * identifying the used protocol.
   */
  public static final AttributeKey<String> URL_SCHEME = stringKey("url.scheme");

  private UrlAttributes() {}
}
