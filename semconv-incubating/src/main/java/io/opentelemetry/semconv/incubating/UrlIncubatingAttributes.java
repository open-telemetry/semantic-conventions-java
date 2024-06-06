
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
public final class UrlIncubatingAttributes {

  /**
  * Domain extracted from the {@code url.full}, such as &quot;opentelemetry.io&quot;.
  *
  * <p>Notes:
        
        
        <ul> <li>In some cases a URL may refer to an IP and/or port directly, without a domain name. In this case, the IP address would go to the domain field. If the URL contains a <a href="https://www.rfc-editor.org/rfc/rfc2732#section-2">literal IPv6 address</a> enclosed by {@code [} and {@code ]}, the {@code [} and {@code ]} characters should also be captured in the domain field.</li> </ul>
  *
  */
  public static final AttributeKey<String> URL_DOMAIN = stringKey("url.domain");

  /**
  * The file extension extracted from the {@code url.full}, excluding the leading dot.
  *
  * <p>Notes:
        
        
        <ul> <li>The file extension is only set if it exists, as not every url has a file extension. When the file name has multiple extensions {@code example.tar.gz}, only the last one should be captured {@code gz}, not {@code tar.gz}.</li> </ul>
  *
  */
  public static final AttributeKey<String> URL_EXTENSION = stringKey("url.extension");

  /**
  * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.5">URI fragment</a> component
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.UrlAttributes#URL_FRAGMENT} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> URL_FRAGMENT = stringKey("url.fragment");

  /**
  * Absolute URL describing a network resource according to <a href="https://www.rfc-editor.org/rfc/rfc3986">RFC3986</a>
  *
  * <p>Notes:
        
        
        <ul> <li>For network calls, URL usually has {@code scheme://host[:port][path][?query][#fragment]} format, where the fragment is not transmitted over HTTP, but if it is known, it SHOULD be included nevertheless.
{@code url.full} MUST NOT contain credentials passed via URL in form of {@code https://username:password@www.example.com/}. In such case username and password SHOULD be redacted and attribute's value SHOULD be {@code https://REDACTED:REDACTED@www.example.com/}.
{@code url.full} SHOULD capture the absolute URL when it is available (or can be reconstructed). Sensitive content provided in {@code url.full} SHOULD be scrubbed when instrumentations can identify it.</li> </ul>
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.UrlAttributes#URL_FULL} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> URL_FULL = stringKey("url.full");

  /**
  * Unmodified original URL as seen in the event source.
  *
  * <p>Notes:
        
        
        <ul> <li>In network monitoring, the observed URL may be a full URL, whereas in access logs, the URL is often just represented as a path. This field is meant to represent the URL as it was observed, complete or not.
{@code url.original} might contain credentials passed via URL in form of {@code https://username:password@www.example.com/}. In such case password and username SHOULD NOT be redacted and attribute's value SHOULD remain the same.</li> </ul>
  *
  */
  public static final AttributeKey<String> URL_ORIGINAL = stringKey("url.original");

  /**
  * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.3">URI path</a> component
  *
  * <p>Notes:
        
        
        <ul> <li>Sensitive content provided in {@code url.path} SHOULD be scrubbed when instrumentations can identify it.</li> </ul>
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.UrlAttributes#URL_PATH} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> URL_PATH = stringKey("url.path");

  /**
  * Port extracted from the {@code url.full}
  *
  */
  public static final AttributeKey<Long> URL_PORT = longKey("url.port");

  /**
  * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.4">URI query</a> component
  *
  * <p>Notes:
        
        
        <ul> <li>Sensitive content provided in {@code url.query} SHOULD be scrubbed when instrumentations can identify it.</li> </ul>
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.UrlAttributes#URL_QUERY} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> URL_QUERY = stringKey("url.query");

  /**
  * The highest registered url domain, stripped of the subdomain.
  *
  * <p>Notes:
        
        
        <ul> <li>This value can be determined precisely with the <a href="http://publicsuffix.org">public suffix list</a>. For example, the registered domain for {@code foo.example.com} is {@code example.com}. Trying to approximate this by simply taking the last two labels will not work well for TLDs such as {@code co.uk}.</li> </ul>
  *
  */
  public static final AttributeKey<String> URL_REGISTEREDDOMAIN = stringKey("url.registered_domain");

  /**
  * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.1">URI scheme</a> component identifying the used protocol.
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.UrlAttributes#URL_SCHEME} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> URL_SCHEME = stringKey("url.scheme");

  /**
  * The subdomain portion of a fully qualified domain name includes all of the names except the host name under the registered_domain. In a partially qualified domain, or if the qualification level of the full name cannot be determined, subdomain contains all of the names below the registered domain.
  *
  * <p>Notes:
        
        
        <ul> <li>The subdomain portion of {@code www.east.mydomain.co.uk} is {@code east}. If the domain has multiple levels of subdomain, such as {@code sub2.sub1.example.com}, the subdomain field should contain {@code sub2.sub1}, with no trailing period.</li> </ul>
  *
  */
  public static final AttributeKey<String> URL_SUBDOMAIN = stringKey("url.subdomain");

  /**
  * The effective top level domain (eTLD), also known as the domain suffix, is the last part of the domain name. For example, the top level domain for example.com is {@code com}.
  *
  * <p>Notes:
        
        
        <ul> <li>This value can be determined precisely with the <a href="http://publicsuffix.org">public suffix list</a>.</li> </ul>
  *
  */
  public static final AttributeKey<String> URL_TOPLEVELDOMAIN = stringKey("url.top_level_domain");

  private UrlIncubatingAttributes() {}
}