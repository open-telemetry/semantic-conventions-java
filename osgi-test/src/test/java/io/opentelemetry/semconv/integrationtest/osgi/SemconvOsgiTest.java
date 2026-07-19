/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.integrationtest.osgi;

import static org.assertj.core.api.Assertions.assertThat;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.SchemaUrls;
import io.opentelemetry.semconv.ServiceAttributes;
import io.opentelemetry.semconv.incubating.ServiceIncubatingAttributes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.junit5.context.BundleContextExtension;

/**
 * Boots the semconv and semconv-incubating bundles inside a real OSGi (Apache Felix) container and
 * exercises their exported packages. If either bundle's generated OSGi metadata is wrong (missing
 * exports, unsatisfiable imports), the bundle fails to resolve and these tests never run — which
 * the build treats as a failure.
 */
@ExtendWith(BundleContextExtension.class)
public class SemconvOsgiTest {

  @Test
  public void stableAttributesAreUsable() {
    AttributeKey<String> serviceName = ServiceAttributes.SERVICE_NAME;
    assertThat(serviceName.getKey()).isEqualTo("service.name");
    assertThat(SchemaUrls.V1_41_1).isEqualTo("https://opentelemetry.io/schemas/1.41.1");
  }

  @Test
  public void incubatingAttributesAreUsable() {
    AttributeKey<String> instanceId = ServiceIncubatingAttributes.SERVICE_INSTANCE_ID;
    assertThat(instanceId.getKey()).isEqualTo("service.instance.id");
  }
}
