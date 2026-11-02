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
public final class RabbitmqIncubatingAttributes {
  /** RabbitMQ message routing key. */
  public static final AttributeKey<String> RABBITMQ_DESTINATION_ROUTING_KEY =
      stringKey("rabbitmq.destination.routing_key");

  /** RabbitMQ message delivery tag */
  public static final AttributeKey<Long> RABBITMQ_MESSAGE_DELIVERY_TAG =
      longKey("rabbitmq.message.delivery_tag");

  // Enum definitions

  private RabbitmqIncubatingAttributes() {}
}
