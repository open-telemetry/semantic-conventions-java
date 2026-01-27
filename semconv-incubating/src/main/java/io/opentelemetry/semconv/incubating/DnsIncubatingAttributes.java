/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class DnsIncubatingAttributes {
  /** The list of IPv4 or IPv6 addresses resolved during DNS lookup. */
  public static final AttributeKey<List<String>> DNS_ANSWERS = stringArrayKey("dns.answers");

  /**
   * The name being queried.
   *
   * <p>Notes:
   *
   * <p>The name represents the queried domain name as it appears in the DNS query without any
   * additional normalization.
   */
  public static final AttributeKey<String> DNS_QUESTION_NAME = stringKey("dns.question.name");

  // Enum definitions

  private DnsIncubatingAttributes() {}
}
