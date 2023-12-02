/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_23_1;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.experimental.java.j2
@SuppressWarnings("unused")
public final class CloudeventsAttributes {

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#id">event_id</a>
   * uniquely identifies the event.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_ID = stringKey("cloudevents.event_id");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#source-1">source</a>
   * identifies the context in which an event happened.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_SOURCE =
      stringKey("cloudevents.event_source");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#specversion">version
   * of the CloudEvents specification</a> which the event uses.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_SPEC_VERSION =
      stringKey("cloudevents.event_spec_version");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#subject">subject</a>
   * of the event in the context of the event producer (identified by source).
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_SUBJECT =
      stringKey("cloudevents.event_subject");

  /**
   * The <a
   * href="https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#type">event_type</a>
   * contains a value describing the type of event related to the originating occurrence.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_TYPE =
      stringKey("cloudevents.event_type");

  // Enum definitions

  private CloudeventsAttributes() {}
}
