
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
public final class ServiceIncubatingAttributes {

  /**
  * The string ID of the service instance.
  *
  * <p>Notes:
        
        
        <ul> <li>MUST be unique for each instance of the same {@code service.namespace,service.name} pair (in other words
{@code service.namespace,service.name,service.instance.id} triplet MUST be globally unique). The ID helps to
distinguish instances of the same service that exist at the same time (e.g. instances of a horizontally scaled
service).</li><li>Implementations, such as SDKs, are recommended to generate a random Version 1 or Version 4 <a href="https://www.ietf.org/rfc/rfc4122.txt">RFC
4122</a> UUID, but are free to use an inherent unique ID as the source of
this value if stability is desirable. In that case, the ID SHOULD be used as source of a UUID Version 5 and
SHOULD use the following UUID as the namespace: {@code 4d63009a-8d0f-11ee-aad7-4c796ed8e320}.</li><li>UUIDs are typically recommended, as only an opaque value for the purposes of identifying a service instance is
needed. Similar to what can be seen in the man page for the
<a href="https://www.freedesktop.org/software/systemd/man/machine-id.html">{@code /etc/machine-id}</a> file, the underlying
data, such as pod name and namespace should be treated as confidential, being the user's choice to expose it
or not via another resource attribute.</li><li>For applications running behind an application server (like unicorn), we do not recommend using one identifier
for all processes participating in the application. Instead, it's recommended each division (e.g. a worker
thread in unicorn) to have its own instance.id.</li><li>It's not recommended for a Collector to set {@code service.instance.id} if it can't unambiguously determine the
service instance that is generating that telemetry. For instance, creating an UUID based on {@code pod.name} will
likely be wrong, as the Collector might not know from which container within that pod the telemetry originated.
However, Collectors can set the {@code service.instance.id} if they can unambiguously determine the service instance
for that telemetry. This is typically the case for scraping receivers, as they know the target address and
port.</li> </ul>
  *
  */
  public static final AttributeKey<String> SERVICE_INSTANCE_ID = stringKey("service.instance.id");

  /**
  * Logical name of the service.
  *
  * <p>Notes:
        
        
        <ul> <li>MUST be the same for all instances of horizontally scaled services. If the value was not specified, SDKs MUST fallback to {@code unknown_service:} concatenated with <a href="process.md#process">{@code process.executable.name}</a>, e.g. {@code unknown_service:bash}. If {@code process.executable.name} is not available, the value MUST be set to {@code unknown_service}.</li> </ul>
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.ServiceAttributes#SERVICE_NAME} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> SERVICE_NAME = stringKey("service.name");

  /**
  * A namespace for {@code service.name}.
  *
  * <p>Notes:
        
        
        <ul> <li>A string value having a meaning that helps to distinguish a group of services, for example the team name that owns a group of services. {@code service.name} is expected to be unique within the same namespace. If {@code service.namespace} is not specified in the Resource then {@code service.name} is expected to be unique for all services that have no explicit namespace defined (so the empty/unspecified namespace is simply one more valid namespace). Zero-length namespace string is assumed equal to unspecified namespace.</li> </ul>
  *
  */
  public static final AttributeKey<String> SERVICE_NAMESPACE = stringKey("service.namespace");

  /**
  * The version string of the service API or implementation. The format is not defined by these conventions.
  *
  * @deprecated deprecated in favor of stable {@link io.opentelemetry.semconv.ServiceAttributes#SERVICE_VERSION} attribute.
  */
  @Deprecated
  public static final AttributeKey<String> SERVICE_VERSION = stringKey("service.version");

  private ServiceIncubatingAttributes() {}
}