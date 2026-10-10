/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEntities.java.j2
@SuppressWarnings("unused")
public final class BrowserIncubatingEntities {
  /**
   * The web browser in which the application represented by the resource is running. The {@code
   * browser.*} attributes MUST be used only for resources that represent applications running in a
   * web browser (regardless of whether running on a mobile or desktop device).
   */
  public static final String BROWSER_TYPE = "browser";

  /** The web page document loaded in the browser. */
  public static final String BROWSER_DOCUMENT_TYPE = "browser.document";

  private BrowserIncubatingEntities() {}
}
