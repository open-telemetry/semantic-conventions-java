/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

public final class AttributeKeyTemplate<T> {

  private final ConcurrentMap<String, AttributeKey<T>> keysCache = new ConcurrentHashMap<>();
  private final String prefix;
  private final Function<String, AttributeKey<T>> keyBuilder;

  AttributeKeyTemplate(String prefix, Function<String, AttributeKey<T>> keyBuilder) {
    this.prefix = prefix;
    this.keyBuilder = keyBuilder;
  }

  static AttributeKeyTemplate<String> stringKeyTemplate(String prefix) {
    return new AttributeKeyTemplate<String>(prefix, AttributeKey::stringKey);
  }

  static AttributeKeyTemplate<List<String>> stringArrayKeyTemplate(String prefix) {
    return new AttributeKeyTemplate<List<String>>(prefix, AttributeKey::stringArrayKey);
  }

  static AttributeKeyTemplate<Boolean> booleanKeyTemplate(String prefix) {
    return new AttributeKeyTemplate<Boolean>(prefix, AttributeKey::booleanKey);
  }

  static AttributeKeyTemplate<List<Boolean>> booleanArrayKeyTemplate(String prefix) {
    return new AttributeKeyTemplate<List<Boolean>>(prefix, AttributeKey::booleanArrayKey);
  }

  static AttributeKeyTemplate<Long> longKeyTemplate(String prefix) {
    return new AttributeKeyTemplate<Long>(prefix, AttributeKey::longKey);
  }

  static AttributeKeyTemplate<List<Long>> longArrayKeyTemplate(String prefix) {
    return new AttributeKeyTemplate<List<Long>>(prefix, AttributeKey::longArrayKey);
  }

  static AttributeKeyTemplate<Double> doubleKeyTemplate(String prefix) {
    return new AttributeKeyTemplate<Double>(prefix, AttributeKey::doubleKey);
  }

  static AttributeKeyTemplate<List<Double>> doubleArrayKeyTemplate(String prefix) {
    return new AttributeKeyTemplate<List<Double>>(prefix, AttributeKey::doubleArrayKey);
  }

  private AttributeKey<T> createAttributeKey(String keyName) {
    String key = prefix + "." + keyName.toLowerCase(Locale.ROOT).replace('-', '_');
    return keyBuilder.apply(key);
  }

  public AttributeKey<T> getAttributeKey(String key) {
    return keysCache.computeIfAbsent(key, this::createAttributeKey);
  }
}
