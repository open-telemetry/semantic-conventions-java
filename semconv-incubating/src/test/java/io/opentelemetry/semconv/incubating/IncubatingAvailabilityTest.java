/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

/** A placeholder test which verifies that the generated classes compile and can load. */
public class IncubatingAvailabilityTest {

  @Test
  void available() {
    classAvailable("io.opentelemetry.semconv.incubating.IncubatingResourceAttributes");
    classAvailable("io.opentelemetry.semconv.incubating.IncubatingSemanticAttributes");
  }

  private static void classAvailable(String fqcn) {
    assertThatCode(() -> Class.forName(fqcn)).doesNotThrowAnyException();
  }
}
