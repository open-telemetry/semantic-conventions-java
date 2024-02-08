/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

/** A placeholder test which verifies that the generated classes compile and can load. */
public class AvailabilityTest {

  @Test
  void available() {
    classAvailable("io.opentelemetry.semconv.ResourceAttributes");
    classAvailable("io.opentelemetry.semconv.SemanticAttributes");
    classAvailable("io.opentelemetry.semconv.SchemaUrls");
  }

  private static void classAvailable(String fqcn) {
    assertThatCode(() -> Class.forName(fqcn)).doesNotThrowAnyException();
  }
}
