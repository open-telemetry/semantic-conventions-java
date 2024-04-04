/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import java.lang.reflect.Field;
import org.junit.jupiter.api.Test;

/** A placeholder test which verifies that the generated classes compile and can load. */
public class IncubatingAvailabilityTest {

  @Test
  void available() {
    isValidClass("io.opentelemetry.semconv.incubating.AndroidIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.AwsIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.BrowserIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.CloudIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.CodeIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.ContainerIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.DbIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.DeploymentIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.DestinationIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.DeviceIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.DiskIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.DnsIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.EnduserIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.EventIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.ExceptionIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.FileIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.FaasIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.FeatureFlagIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.GcpIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.GraphqlIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.HerokuIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.HostIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.HttpIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.JvmIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.K8sIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.LogIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.MessageIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.NetIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.MessagingIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.NetworkIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.OciIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.OpentracingIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.OsIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.OtelIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.OtherIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.PeerIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.PoolIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.ProcessIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.RpcIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.ServiceIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.SessionIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.SourceIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.SystemIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.TelemetryIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.ThreadIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.TlsIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.incubating.WebengineIncubatingAttributes");
    isValidClass("io.opentelemetry.semconv.SchemaUrls");
  }

  private static void isValidClass(String fqcn) {
    Class<?> clazz = null;
    try {
      clazz = Class.forName(fqcn);
    } catch (ClassNotFoundException e) {
      fail(e.getMessage());
    }
    Field[] declaredFields = clazz.getDeclaredFields();
    Class<?>[] declaredClasses = clazz.getDeclaredClasses();
    boolean hasFieldsOrInnerClasses =
        (declaredFields != null && declaredFields.length > 0)
            || (declaredClasses != null && declaredClasses.length > 0);
    assertThat(hasFieldsOrInnerClasses).withFailMessage(() -> fqcn + " is empty").isTrue();
  }
}
