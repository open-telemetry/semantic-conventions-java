/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEntities.java.j2
@SuppressWarnings("unused")
public final class ServiceIncubatingEntities {
  /**
   * A logical unit of an application or system that performs a specific function.
   *
   * <p>Notes:
   *
   * <p>A service is a logical component used in a system, product or application. Examples include
   * a microservice, a database, a Kubernetes deployment.
   */
  public static final String SERVICE_TYPE = "service";

  /**
   * A unique instance of a logical service.
   *
   * <p>Notes:
   *
   * <p>A {@code service.instance} uniquely identifies an instance of a logical service. For
   * example, a container that is part of a Kubernetes deployment that offers a service.
   */
  public static final String SERVICE_INSTANCE_TYPE = "service.instance";

  /**
   * Groups related services that compose a system or application under a common namespace.
   *
   * <p>Notes:
   *
   * <p>A {@code service.namespace} can be used to logically organize and group related services
   * under a common namespace.
   */
  public static final String SERVICE_NAMESPACE_TYPE = "service.namespace";

  private ServiceIncubatingEntities() {}
}
