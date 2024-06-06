/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class FileIncubatingAttributes {

  /** Directory where the file is located. It should include the drive letter, when appropriate. */
  public static final AttributeKey<String> FILE_DIRECTORY = stringKey("file.directory");

  /**
   * File extension, excluding the leading dot.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>When the file name has multiple extensions (example.tar.gz), only the last one should be
   *       captured (&quot;gz&quot;, not &quot;tar.gz&quot;).
   * </ul>
   */
  public static final AttributeKey<String> FILE_EXTENSION = stringKey("file.extension");

  /** Name of the file including the extension, without the directory. */
  public static final AttributeKey<String> FILE_NAME = stringKey("file.name");

  /**
   * Full path to the file, including the file name. It should include the drive letter, when
   * appropriate.
   */
  public static final AttributeKey<String> FILE_PATH = stringKey("file.path");

  /** File size in bytes. */
  public static final AttributeKey<Long> FILE_SIZE = longKey("file.size");

  private FileIncubatingAttributes() {}
}
