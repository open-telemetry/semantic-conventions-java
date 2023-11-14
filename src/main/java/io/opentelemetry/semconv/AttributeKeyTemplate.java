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

  private final String prefix;
  private final Function<String, AttributeKey<T>> keyBuilder;
  private final ConcurrentMap<String, AttributeKey<T>> keysCache = new ConcurrentHashMap<>(1);

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
    String key = prefix + "." + keyName.toLowerCase(Locale.ROOT);
    return keyBuilder.apply(key);
  }

  /**
   * Returns an {@link AttributeKey} object for the given attribute key whereby the key is the
   * variable part of the full attribute name in a template-typed attribute, for example
   * <b>http.request.header.&lt;key&gt;</b>.
   *
   * <p>{@link AttributeKey} objets are being created and cached on the first invocation of this
   * method for a certain key. Subsequent invocations of this method with the same key return the
   * cached object.
   *
   * @param key The variable part of the template-typed attribute name.
   * @return An {@link AttributeKey} object for the given key.
   */
  public AttributeKey<T> getAttributeKey(String key) {
    return keysCache.computeIfAbsent(key, this::createAttributeKey);
  }
}
