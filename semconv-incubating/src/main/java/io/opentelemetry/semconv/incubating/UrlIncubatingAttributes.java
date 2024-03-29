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
public final class UrlIncubatingAttributes {

  /**
   * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.5">URI fragment</a> component
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.UrlAttributes#URL_FRAGMENT} attribute.
   */
  @Deprecated public static final AttributeKey<String> URL_FRAGMENT = stringKey("url.fragment");

  /**
   * Absolute URL describing a network resource according to <a
   * href="https://www.rfc-editor.org/rfc/rfc3986">RFC3986</a>
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>For network calls, URL usually has {@code scheme://host[:port][path][?query][#fragment]}
   *       format, where the fragment is not transmitted over HTTP, but if it is known, it SHOULD be
   *       included nevertheless. {@code url.full} MUST NOT contain credentials passed via URL in
   *       form of {@code https://username:password@www.example.com/}. In such case username and
   *       password SHOULD be redacted and attribute's value SHOULD be {@code
   *       https://REDACTED:REDACTED@www.example.com/}. {@code url.full} SHOULD capture the absolute
   *       URL when it is available (or can be reconstructed) and SHOULD NOT be validated or
   *       modified except for sanitizing purposes.
   * </ul>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.UrlAttributes#URL_FULL} attribute.
   */
  @Deprecated public static final AttributeKey<String> URL_FULL = stringKey("url.full");

  /**
   * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.3">URI path</a> component
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.UrlAttributes#URL_PATH} attribute.
   */
  @Deprecated public static final AttributeKey<String> URL_PATH = stringKey("url.path");

  /**
   * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.4">URI query</a> component
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Sensitive content provided in query string SHOULD be scrubbed when instrumentations can
   *       identify it.
   * </ul>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.UrlAttributes#URL_QUERY} attribute.
   */
  @Deprecated public static final AttributeKey<String> URL_QUERY = stringKey("url.query");

  /**
   * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.1">URI scheme</a> component
   * identifying the used protocol.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.UrlAttributes#URL_SCHEME} attribute.
   */
  @Deprecated public static final AttributeKey<String> URL_SCHEME = stringKey("url.scheme");

  private UrlIncubatingAttributes() {}
}
