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
public final class SecurityRuleIncubatingAttributes {
  /**
   * A categorization value keyword used by the entity using the rule for detection of this event
   */
  public static final AttributeKey<String> SECURITY_RULE_CATEGORY =
      stringKey("security_rule.category");

  /** The description of the rule generating the event. */
  public static final AttributeKey<String> SECURITY_RULE_DESCRIPTION =
      stringKey("security_rule.description");

  /** Name of the license under which the rule used to generate this event is made available. */
  public static final AttributeKey<String> SECURITY_RULE_LICENSE =
      stringKey("security_rule.license");

  /** The name of the rule or signature generating the event. */
  public static final AttributeKey<String> SECURITY_RULE_NAME = stringKey("security_rule.name");

  /**
   * Reference URL to additional information about the rule used to generate this event.
   *
   * <p>Notes:
   *
   * <p>The URL can point to the vendor’s documentation about the rule. If that’s not available, it
   * can also be a link to a more general page describing this type of alert.
   */
  public static final AttributeKey<String> SECURITY_RULE_REFERENCE =
      stringKey("security_rule.reference");

  /**
   * Name of the ruleset, policy, group, or parent category in which the rule used to generate this
   * event is a member.
   */
  public static final AttributeKey<String> SECURITY_RULE_RULESET_NAME =
      stringKey("security_rule.ruleset.name");

  /**
   * A rule ID that is unique within the scope of a set or group of agents, observers, or other
   * entities using the rule for detection of this event.
   */
  public static final AttributeKey<String> SECURITY_RULE_UUID = stringKey("security_rule.uuid");

  /** The version / revision of the rule being used for analysis. */
  public static final AttributeKey<String> SECURITY_RULE_VERSION =
      stringKey("security_rule.version");

  // Enum definitions

  private SecurityRuleIncubatingAttributes() {}
}
