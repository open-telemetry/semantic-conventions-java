/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class UrlIncubatingAttributes {

  /**
   * Domain extracted from the <code>url.full</code>, such as &quot;opentelemetry.io&quot;.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>In some cases a URL may refer to an IP and/or port directly, without a domain name. In
   *       this case, the IP address would go to the domain field. If the URL contains a <a
   *       href="https://www.rfc-editor.org/rfc/rfc2732#section-2">literal IPv6 address</a> enclosed
   *       by <code>[</code> and <code>]</code>, the <code>[</code> and <code>]</code> characters
   *       should also be captured in the domain field.
   * </ul>
   */
  public static final AttributeKey<String> URL_DOMAIN = stringKey("url.domain");

  /**
   * The file extension extracted from the <code>url.full</code>, excluding the leading dot.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The file extension is only set if it exists, as not every url has a file extension. When
   *       the file name has multiple extensions <code>example.tar.gz</code>, only the last one
   *       should be captured <code>gz</code>, not <code>tar.gz</code>.
   * </ul>
   */
  public static final AttributeKey<String> URL_EXTENSION = stringKey("url.extension");

  /**
   * Unmodified original URL as seen in the event source.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>In network monitoring, the observed URL may be a full URL, whereas in access logs, the
   *       URL is often just represented as a path. This field is meant to represent the URL as it
   *       was observed, complete or not. <code>url.original</code> might contain credentials passed
   *       via URL in form of <code>https://username:password@www.example.com/</code>. In such case
   *       password and username SHOULD NOT be redacted and attribute's value SHOULD remain the
   *       same.
   * </ul>
   */
  public static final AttributeKey<String> URL_ORIGINAL = stringKey("url.original");

  /** Port extracted from the <code>url.full</code> */
  public static final AttributeKey<Long> URL_PORT = longKey("url.port");

  /**
   * The highest registered url domain, stripped of the subdomain.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This value can be determined precisely with the <a href="http://publicsuffix.org">public
   *       suffix list</a>. For example, the registered domain for <code>foo.example.com</code> is
   *       <code>example.com</code>. Trying to approximate this by simply taking the last two labels
   *       will not work well for TLDs such as <code>co.uk</code>.
   * </ul>
   */
  public static final AttributeKey<String> URL_REGISTERED_DOMAIN =
      stringKey("url.registered_domain");

  /**
   * The subdomain portion of a fully qualified domain name includes all of the names except the
   * host name under the registered_domain. In a partially qualified domain, or if the qualification
   * level of the full name cannot be determined, subdomain contains all of the names below the
   * registered domain.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The subdomain portion of <code>www.east.mydomain.co.uk</code> is <code>east</code>. If
   *       the domain has multiple levels of subdomain, such as <code>sub2.sub1.example.com</code>,
   *       the subdomain field should contain <code>sub2.sub1</code>, with no trailing period.
   * </ul>
   */
  public static final AttributeKey<String> URL_SUBDOMAIN = stringKey("url.subdomain");

  /**
   * The low-cardinality template of an <a
   * href="https://www.rfc-editor.org/rfc/rfc3986#section-4.2">absolute path reference</a>.
   */
  public static final AttributeKey<String> URL_TEMPLATE = stringKey("url.template");

  /**
   * The effective top level domain (eTLD), also known as the domain suffix, is the last part of the
   * domain name. For example, the top level domain for example.com is <code>com</code>.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>This value can be determined precisely with the <a href="http://publicsuffix.org">public
   *       suffix list</a>.
   * </ul>
   */
  public static final AttributeKey<String> URL_TOP_LEVEL_DOMAIN = stringKey("url.top_level_domain");

  private UrlIncubatingAttributes() {}
}
