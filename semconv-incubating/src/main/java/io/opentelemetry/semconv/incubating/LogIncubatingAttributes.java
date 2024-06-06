
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
public final class LogIncubatingAttributes {

  /**
  * The basename of the file.
  *
  */
  public static final AttributeKey<String> LOG_FILE_NAME = stringKey("log.file.name");

  /**
  * The basename of the file, with symlinks resolved.
  *
  */
  public static final AttributeKey<String> LOG_FILE_NAMERESOLVED = stringKey("log.file.name_resolved");

  /**
  * The full path to the file.
  *
  */
  public static final AttributeKey<String> LOG_FILE_PATH = stringKey("log.file.path");

  /**
  * The full path to the file, with symlinks resolved.
  *
  */
  public static final AttributeKey<String> LOG_FILE_PATHRESOLVED = stringKey("log.file.path_resolved");

  /**
  * The stream associated with the log. See below for a list of well-known values.
  *
  */
  public static final AttributeKey<String> LOG_IOSTREAM = stringKey("log.iostream");

  /**
  * A unique identifier for the Log Record.
  *
  * <p>Notes:
        
        
        <ul> <li>If an id is provided, other log records with the same id will be considered duplicates and can be removed safely. This means, that two distinguishable log records MUST have different values.
The id MAY be an <a href="https://github.com/ulid/spec">Universally Unique Lexicographically Sortable Identifier (ULID)</a>, but other identifiers (e.g. UUID) may be used as needed.</li> </ul>
  *
  */
  public static final AttributeKey<String> LOG_RECORD_UID = stringKey("log.record.uid");
  // Enum definitions
  /**
  * Values for {@link #LOG_IOSTREAM}.
  *
  */
  public static final class LogIostreamValues {
      /** Logs from stdout stream. */
      public static final String STDOUT = "stdout";
      /** Events from stderr stream. */
      public static final String STDERR = "stderr";

      private LogIostreamValues() {}
  }

  private LogIncubatingAttributes() {}
}