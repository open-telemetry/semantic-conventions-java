/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticEvents.java.j2
@SuppressWarnings("unused")
public final class AppIncubatingEvents {
  /**
   * This event indicates that the application has detected substandard UI rendering performance.
   *
   * <p>Notes:
   *
   * <p>Jank happens when the UI is rendered slowly enough for the user to experience some
   * disruption or sluggishness.
   */
  public static final String APP_JANK = "app.jank";

  /**
   * This event represents an instantaneous click on the screen of an application.
   *
   * <p>Notes:
   *
   * <p>The {@code app.screen.click} event can be used to indicate that a user has clicked or tapped
   * on the screen portion of an application. Clicks outside of an application's active area SHOULD
   * NOT generate this event. This event does not differentiate between touch/mouse down and
   * touch/mouse up. Implementations SHOULD give preference to generating this event at the time the
   * click is complete, typically on touch release or mouse up. The location of the click event MUST
   * be provided in absolute screen pixels.
   */
  public static final String APP_SCREEN_CLICK = "app.screen.click";

  /**
   * This event indicates that an application widget has been clicked.
   *
   * <p>Notes:
   *
   * <p>Use this event to indicate that visual application component has been clicked, typically
   * through a user's manual interaction.
   */
  public static final String APP_WIDGET_CLICK = "app.widget.click";

  private AppIncubatingEvents() {}
}
