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

  /** The [URI fragment](https://www.rfc-editor.org/rfc/rfc3986#section-3.5) component */
  public static final AttributeKey<String> URL_FRAGMENT = stringKey("url.fragment");

  /**
   * Absolute URL describing a network resource according to
   * [RFC3986](https://www.rfc-editor.org/rfc/rfc3986)
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>For network calls, URL usually has `scheme://host[:port][path][?query][#fragment]`
   *       format, where the fragment is not transmitted over HTTP, but if it is known, it SHOULD be
   *       included nevertheless. `url.full` MUST NOT contain credentials passed via URL in form of
   *       `https://username:password@www.example.com/`. In such case username and password SHOULD
   *       be redacted and attribute's value SHOULD be `https://REDACTED:REDACTED@www.example.com/`.
   *       `url.full` SHOULD capture the absolute URL when it is available (or can be
   *       reconstructed). Sensitive content provided in `url.full` SHOULD be scrubbed when
   *       instrumentations can identify it.
   * </ul>
   */
  public static final AttributeKey<String> URL_FULL = stringKey("url.full");

  /**
   * The [URI path](https://www.rfc-editor.org/rfc/rfc3986#section-3.3) component
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Sensitive content provided in `url.path` SHOULD be scrubbed when instrumentations can
   *       identify it.
   * </ul>
   */
  public static final AttributeKey<String> URL_PATH = stringKey("url.path");

  /**
   * The [URI query](https://www.rfc-editor.org/rfc/rfc3986#section-3.4) component
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Sensitive content provided in `url.query` SHOULD be scrubbed when instrumentations can
   *       identify it.
   * </ul>
   */
  public static final AttributeKey<String> URL_QUERY = stringKey("url.query");

  /**
   * The [URI scheme](https://www.rfc-editor.org/rfc/rfc3986#section-3.1) component identifying the
   * used protocol.
   */
  public static final AttributeKey<String> URL_SCHEME = stringKey("url.scheme");

  private UrlAttributes() {}
}
