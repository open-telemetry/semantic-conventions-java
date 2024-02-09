/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import java.lang.reflect.Field;
import org.junit.jupiter.api.Test;

/** A placeholder test which verifies that the generated classes compile and can load. */
public class AvailabilityTest {

  @Test
  void available() {
    isValidClass("io.opentelemetry.semconv.ClientAttributes");
    isValidClass("io.opentelemetry.semconv.ErrorAttributes");
    isValidClass("io.opentelemetry.semconv.HttpAttributes");
    isValidClass("io.opentelemetry.semconv.NetworkAttributes");
    isValidClass("io.opentelemetry.semconv.ServerAttributes");
    isValidClass("io.opentelemetry.semconv.UrlAttributes");
    isValidClass("io.opentelemetry.semconv.UserAgentAttributes");
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
