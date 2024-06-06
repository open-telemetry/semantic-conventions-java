
/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.doubleKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;

import static io.opentelemetry.semconv.AttributeKeyTemplate.stringArrayKeyTemplate;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class FileIncubatingAttributes {

  /**
  * Directory where the file is located. It should include the drive letter, when appropriate.
  *
  */
  public static final AttributeKey<String> FILE_DIRECTORY = stringKey("file.directory");

  /**
  * File extension, excluding the leading dot.
  *
  * <p>Notes:
        
        
        <ul> <li>When the file name has multiple extensions (example.tar.gz), only the last one should be captured (&quot;gz&quot;, not &quot;tar.gz&quot;).</li> </ul>
  *
  */
  public static final AttributeKey<String> FILE_EXTENSION = stringKey("file.extension");

  /**
  * Name of the file including the extension, without the directory.
  *
  */
  public static final AttributeKey<String> FILE_NAME = stringKey("file.name");

  /**
  * Full path to the file, including the file name. It should include the drive letter, when appropriate.
  *
  */
  public static final AttributeKey<String> FILE_PATH = stringKey("file.path");

  /**
  * File size in bytes.
  *
  */
  public static final AttributeKey<Long> FILE_SIZE = longKey("file.size");

  private FileIncubatingAttributes() {}
}