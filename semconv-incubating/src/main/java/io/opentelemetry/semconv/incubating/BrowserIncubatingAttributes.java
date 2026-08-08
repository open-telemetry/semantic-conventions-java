/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.doubleKey;
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
   * navigator.userAgentData.brands}).
   */
  public static final AttributeKey<List<String>> BROWSER_BRANDS = stringArrayKey("browser.brands");

  /**
   * Absolute URL of the current browser document according to <a
   * href="https://www.rfc-editor.org/rfc/rfc3986">RFC3986</a>.
   */
  public static final AttributeKey<String> BROWSER_DOCUMENT_URL_FULL =
      stringKey("browser.document.url.full");

  /**
   * Preferred language of the user using the browser
   *
   * <p>Notes:
   *
   * <p>This value is intended to be taken from the Navigator API {@code navigator.language}.
   */
  public static final AttributeKey<String> BROWSER_LANGUAGE = stringKey("browser.language");

  /**
   * A boolean that is true if the browser is running on a mobile device
   *
   * <p>Notes:
   *
   * <p>This value is intended to be taken from the <a
   * href="https://wicg.github.io/ua-client-hints/#interface">UA client hints API</a> ({@code
   * navigator.userAgentData.mobile}). If unavailable, this attribute SHOULD be left unset.
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
   * user agent provides.
   */
  public static final AttributeKey<String> BROWSER_PLATFORM = stringKey("browser.platform");

  /**
   * The delta between the current value and the last-reported value. See <a
   * href="https://github.com/GoogleChrome/web-vitals?tab=readme-ov-file#report-only-the-delta-of-changes">delta</a>.
   */
  public static final AttributeKey<Double> BROWSER_WEB_VITAL_DELTA =
      doubleKey("browser.web_vital.delta");

  /** A unique ID representing this particular metric instance. */
  public static final AttributeKey<String> BROWSER_WEB_VITAL_ID = stringKey("browser.web_vital.id");

  /** Name of the web vital. */
  public static final AttributeKey<String> BROWSER_WEB_VITAL_NAME =
      stringKey("browser.web_vital.name");

  /**
   * The type of navigation, as reported by the <a
   * href="https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/type">Navigation
   * Timing API</a>, with additional values reported by the web-vitals library.
   */
  public static final AttributeKey<String> BROWSER_WEB_VITAL_NAVIGATION_TYPE =
      stringKey("browser.web_vital.navigation_type");

  /**
   * The rating of the web vital value against the "good", "needs improvement", and "poor"
   * thresholds defined for the metric.
   */
  public static final AttributeKey<String> BROWSER_WEB_VITAL_RATING =
      stringKey("browser.web_vital.rating");

  /** Value of the web vital. */
  public static final AttributeKey<Double> BROWSER_WEB_VITAL_VALUE =
      doubleKey("browser.web_vital.value");

  // Enum definitions

  /** Values for {@link #BROWSER_WEB_VITAL_NAME}. */
  public static final class BrowserWebVitalNameIncubatingValues {
    /** Cumulative Layout Shift. See <a href="https://web.dev/articles/cls">cls</a>. */
    public static final String CLS = "cls";

    /** Largest Contentful Paint. See <a href="https://web.dev/articles/lcp">lcp</a>. */
    public static final String LCP = "lcp";

    /** First Contentful Paint. See <a href="https://web.dev/articles/fcp">fcp</a>. */
    public static final String FCP = "fcp";

    /** Interaction to Next Paint. See <a href="https://web.dev/articles/inp">inp</a>. */
    public static final String INP = "inp";

    /** Time to First Byte. See <a href="https://web.dev/articles/ttfb">ttfb</a>. */
    public static final String TTFB = "ttfb";

    /**
     * First Input Delay. See <a href="https://web.dev/articles/fid">fid</a>.
     *
     * @deprecated Replaced by Interaction to Next Paint ({@code inp}), which became a Core Web
     *     Vital in March 2024. See <a href="https://web.dev/articles/inp">inp</a>.
     */
    @Deprecated public static final String FID = "fid";

    private BrowserWebVitalNameIncubatingValues() {}
  }

  /** Values for {@link #BROWSER_WEB_VITAL_NAVIGATION_TYPE}. */
  public static final class BrowserWebVitalNavigationTypeIncubatingValues {
    /**
     * Navigation started by clicking a link, entering a URL, form submission, or a script
     * operation.
     */
    public static final String NAVIGATE = "navigate";

    /** Navigation through a reload operation or a {@code Location.reload()} call. */
    public static final String RELOAD = "reload";

    /** Navigation through the browser's history traversal (e.g. back/forward buttons). */
    public static final String BACK_FORWARD = "back-forward";

    /** Navigation restoring a page from the back/forward cache (bfcache). */
    public static final String BACK_FORWARD_CACHE = "back-forward-cache";

    /** Navigation to a page that was prerendered. */
    public static final String PRERENDER = "prerender";

    /** Navigation restoring a page that was previously discarded by the browser. */
    public static final String RESTORE = "restore";

    private BrowserWebVitalNavigationTypeIncubatingValues() {}
  }

  /** Values for {@link #BROWSER_WEB_VITAL_RATING}. */
  public static final class BrowserWebVitalRatingIncubatingValues {
    /** The metric value is within the "good" threshold. */
    public static final String GOOD = "good";

    /** The metric value is within the "needs improvement" threshold. */
    public static final String NEEDS_IMPROVEMENT = "needs-improvement";

    /** The metric value is within the "poor" threshold. */
    public static final String POOR = "poor";

    private BrowserWebVitalRatingIncubatingValues() {}
  }

  private BrowserIncubatingAttributes() {}
}
