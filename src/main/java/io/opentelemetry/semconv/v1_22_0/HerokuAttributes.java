/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.v1_22_0;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.experimental.java.j2
@SuppressWarnings("unused")
public final class HerokuAttributes {

  /** Unique identifier for the application */
  public static final AttributeKey<String> HEROKU_APP_ID = stringKey("heroku.app.id");

  /** Commit hash for the current release */
  public static final AttributeKey<String> HEROKU_RELEASE_COMMIT =
      stringKey("heroku.release.commit");

  /** Time and date the release was created */
  public static final AttributeKey<String> HEROKU_RELEASE_CREATION_TIMESTAMP =
      stringKey("heroku.release.creation_timestamp");

  // Enum definitions

  private HerokuAttributes() {}
}
