/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Field;
import org.junit.jupiter.api.Test;

class IncubatingEntitiesTest {

  @Test
  void stableEntityTypes() {
    assertThat(ServiceIncubatingEntities.SERVICE_TYPE).isEqualTo("service");
    assertThat(ServiceIncubatingEntities.SERVICE_INSTANCE_TYPE).isEqualTo("service.instance");
    assertThat(ServiceIncubatingEntities.SERVICE_NAMESPACE_TYPE).isEqualTo("service.namespace");
  }

  @Test
  void experimentalEntityTypes() {
    assertThat(K8sIncubatingEntities.K8S_POD_TYPE).isEqualTo("k8s.pod");
    assertThat(K8sIncubatingEntities.K8S_NODE_SYSTEM_CONTAINER_TYPE)
        .isEqualTo("k8s.node.system_container");
  }

  @Test
  void deprecatedEntityTypes() throws ReflectiveOperationException {
    Field field = OtelIncubatingEntities.class.getField("OTEL_SCOPE_TYPE");
    assertThat(field.get(null)).isEqualTo("otel.scope");
    assertThat(field.isAnnotationPresent(Deprecated.class)).isTrue();
  }
}
