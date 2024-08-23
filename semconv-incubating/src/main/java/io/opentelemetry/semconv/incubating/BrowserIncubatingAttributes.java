/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class BrowserIncubatingAttributes {
  /**
   * Array of brand name and version separated by a space
   *
   * <p>Notes:
   *
   * <p>This value is intended to be taken from the <a
   * href="https://wicg.github.io/ua-client-hints/#interface">UA client hints API</a> ({@code
   * navigator.userAgentData.brands})
   */
  public static final AttributeKey<List<String>> BROWSER_BRANDS = stringArrayKey("browser.brands");

  /**
   * Preferred language of the user using the browser
   *
   * <p>Notes:
   *
   * <p>This value is intended to be taken from the Navigator API {@code navigator.language}
   */
  public static final AttributeKey<String> BROWSER_LANGUAGE = stringKey("browser.language");

  /**
   * A boolean that is true if the browser is running on a mobile device
   *
   * <p>Notes:
   *
   * <p>This value is intended to be taken from the <a
   * href="https://wicg.github.io/ua-client-hints/#interface">UA client hints API</a> ({@code
   * navigator.userAgentData.mobile}). If unavailable, this attribute SHOULD be left unset
   */
  public static final AttributeKey<Boolean> BROWSER_MOBILE = booleanKey("browser.mobile");

  /**
   * The platform on which the browser is running
   *
   * <p>Notes:
   *
   * <p>This value is intended to be taken from the <a
   * href="https://wicg.github.io/ua-client-hints/#interface">UA client hints API</a> ({@code
   * navigator.userAgentData.platform}). If unavailable, the legacy {@code navigator.platform} API
   * SHOULD NOT be used instead and this attribute SHOULD be left unset in order for the values to
   * be consistent. The list of possible values is defined in the <a
   * href="https://wicg.github.io/ua-client-hints/#sec-ch-ua-platform">W3C User-Agent Client Hints
   * specification</a>. Note that some (but not all) of these values can overlap with values in the
   * <a href="./os.md">{@code os.type} and {@code os.name} attributes</a>. However, for consistency,
   * the values in the {@code browser.platform} attribute should capture the exact value that the
   * user agent provides
   */
  public static final AttributeKey<String> BROWSER_PLATFORM = stringKey("browser.platform");

  private BrowserIncubatingAttributes() {}
}
