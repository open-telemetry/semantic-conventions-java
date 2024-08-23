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
public final class DnsIncubatingAttributes {
  /**
   * The name being queried.
   *
   * <p>Notes:
   *
   * <p>If the name field contains non-printable characters (below 32 or above 126), those
   * characters should be represented as escaped base 10 integers (\DDD). Back slashes and quotes
   * should be escaped. Tabs, carriage returns, and line feeds should be converted to \t, \r, and \n
   * respectively
   */
  public static final AttributeKey<String> DNS_QUESTION_NAME = stringKey("dns.question.name");

  private DnsIncubatingAttributes() {}
}
