/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_23_1;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class ServiceAttributes {

  /**
   * The string ID of the service instance.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>MUST be unique for each instance of the same {@code service.namespace,service.name} pair
   *       (in other words {@code service.namespace,service.name,service.instance.id} triplet MUST
   *       be globally unique). The ID helps to distinguish instances of the same service that exist
   *       at the same time (e.g. instances of a horizontally scaled service). It is preferable for
   *       the ID to be persistent and stay the same for the lifetime of the service instance,
   *       however it is acceptable that the ID is ephemeral and changes during important lifetime
   *       events for the service (e.g. service restarts). If the service has no inherent unique ID
   *       that can be used as the value of this attribute it is recommended to generate a random
   *       Version 1 or Version 4 RFC 4122 UUID (services aiming for reproducible UUIDs may also use
   *       Version 5, see RFC 4122 for more recommendations).
   * </ul>
   */
  public static final AttributeKey<String> SERVICE_INSTANCE_ID = stringKey("service.instance.id");

  /**
   * Logical name of the service.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>MUST be the same for all instances of horizontally scaled services. If the value was not
   *       specified, SDKs MUST fallback to {@code unknown_service:} concatenated with <a
   *       href="process.md#process">{@code process.executable.name}</a>, e.g. {@code
   *       unknown_service:bash}. If {@code process.executable.name} is not available, the value
   *       MUST be set to {@code unknown_service}.
   * </ul>
   */
  public static final AttributeKey<String> SERVICE_NAME = stringKey("service.name");

  /**
   * A namespace for {@code service.name}.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>A string value having a meaning that helps to distinguish a group of services, for
   *       example the team name that owns a group of services. {@code service.name} is expected to
   *       be unique within the same namespace. If {@code service.namespace} is not specified in the
   *       Resource then {@code service.name} is expected to be unique for all services that have no
   *       explicit namespace defined (so the empty/unspecified namespace is simply one more valid
   *       namespace). Zero-length namespace string is assumed equal to unspecified namespace.
   * </ul>
   */
  public static final AttributeKey<String> SERVICE_NAMESPACE = stringKey("service.namespace");

  /**
   * The version string of the service API or implementation. The format is not defined by these
   * conventions.
   */
  public static final AttributeKey<String> SERVICE_VERSION = stringKey("service.version");

  // Enum definitions
  private ServiceAttributes() {}
}
