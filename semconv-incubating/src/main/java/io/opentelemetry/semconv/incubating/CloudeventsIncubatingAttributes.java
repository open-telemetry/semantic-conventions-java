/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/java/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class CloudeventsIncubatingAttributes {

  /**
   * The [event_id](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#id) uniquely
   * identifies the event.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_ID = stringKey("cloudevents.event_id");

  /**
   * The [source](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#source-1)
   * identifies the context in which an event happened.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_SOURCE =
      stringKey("cloudevents.event_source");

  /**
   * The [version of the CloudEvents
   * specification](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#specversion)
   * which the event uses.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_SPEC_VERSION =
      stringKey("cloudevents.event_spec_version");

  /**
   * The [subject](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#subject) of
   * the event in the context of the event producer (identified by source).
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_SUBJECT =
      stringKey("cloudevents.event_subject");

  /**
   * The [event_type](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md#type)
   * contains a value describing the type of event related to the originating occurrence.
   */
  public static final AttributeKey<String> CLOUDEVENTS_EVENT_TYPE =
      stringKey("cloudevents.event_type");

  private IncubatingCloudeventsIncubatingAttributes() {}
}
