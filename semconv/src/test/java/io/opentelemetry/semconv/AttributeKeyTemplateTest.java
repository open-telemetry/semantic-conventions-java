/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

import static org.assertj.core.api.Assertions.assertThat;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.AttributeType;
import java.util.function.Function;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AttributeKeyTemplateTest {

  @ParameterizedTest
  @MethodSource("getAttributeKeyArgs")
  void getAttributeKey(
      Function<String, AttributeKeyTemplate<?>> createTemplate,
      AttributeType expectedAttributeType) {
    String prefix = "my.prefix";
    AttributeKeyTemplate<?> template = createTemplate.apply(prefix);

    AttributeKey<?> attributeKey1 = template.getAttributeKey("key1");
    AttributeKey<?> attributeKey2 = template.getAttributeKey("key2");

    assertThat(attributeKey1.getType()).isEqualTo(expectedAttributeType);
    assertThat(attributeKey1.getKey()).isEqualTo("my.prefix.key1");
    assertThat(attributeKey1).isSameAs(template.getAttributeKey("key1"));

    assertThat(attributeKey2.getType()).isEqualTo(expectedAttributeType);
    assertThat(attributeKey2.getKey()).isEqualTo("my.prefix.key2");
  }

  private static Stream<Arguments> getAttributeKeyArgs() {
    return Stream.of(
        Arguments.of(asFunction(AttributeKeyTemplate::stringKeyTemplate), AttributeType.STRING),
        Arguments.of(
            asFunction(AttributeKeyTemplate::stringArrayKeyTemplate), AttributeType.STRING_ARRAY),
        Arguments.of(asFunction(AttributeKeyTemplate::booleanKeyTemplate), AttributeType.BOOLEAN),
        Arguments.of(
            asFunction(AttributeKeyTemplate::booleanArrayKeyTemplate), AttributeType.BOOLEAN_ARRAY),
        Arguments.of(asFunction(AttributeKeyTemplate::longKeyTemplate), AttributeType.LONG),
        Arguments.of(
            asFunction(AttributeKeyTemplate::longArrayKeyTemplate), AttributeType.LONG_ARRAY),
        Arguments.of(asFunction(AttributeKeyTemplate::doubleKeyTemplate), AttributeType.DOUBLE),
        Arguments.of(
            asFunction(AttributeKeyTemplate::doubleArrayKeyTemplate), AttributeType.DOUBLE_ARRAY));
  }

  private static Function<String, AttributeKeyTemplate<?>> asFunction(
      Function<String, AttributeKeyTemplate<?>> function) {
    return function;
  }
}
