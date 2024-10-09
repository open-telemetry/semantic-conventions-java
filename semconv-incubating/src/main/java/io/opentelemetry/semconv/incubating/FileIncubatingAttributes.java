/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class FileIncubatingAttributes {
  /**
   * Time when the file was last accessed, in ISO 8601 format.
   *
   * <p>Notes:
   *
   * <p>This attribute might not be supported by some file systems — NFS, FAT32, in embedded OS,
   * etc.
   */
  public static final AttributeKey<String> FILE_ACCESSED = stringKey("file.accessed");

  /**
   * Array of file attributes.
   *
   * <p>Notes:
   *
   * <p>Attributes names depend on the OS or file system. Here’s a non-exhaustive list of values
   * expected for this attribute: {@code archive}, {@code compressed}, {@code directory}, {@code
   * encrypted}, {@code execute}, {@code hidden}, {@code immutable}, {@code journaled}, {@code
   * read}, {@code readonly}, {@code symbolic link}, {@code system}, {@code temporary}, {@code
   * write}.
   */
  public static final AttributeKey<List<String>> FILE_ATTRIBUTES =
      stringArrayKey("file.attributes");

  /**
   * Time when the file attributes or metadata was last changed, in ISO 8601 format.
   *
   * <p>Notes:
   *
   * <p>{@code file.changed} captures the time when any of the file's properties or attributes
   * (including the content) are changed, while {@code file.modified} captures the timestamp when
   * the file content is modified.
   */
  public static final AttributeKey<String> FILE_CHANGED = stringKey("file.changed");

  /**
   * Time when the file was created, in ISO 8601 format.
   *
   * <p>Notes:
   *
   * <p>This attribute might not be supported by some file systems — NFS, FAT32, in embedded OS,
   * etc.
   */
  public static final AttributeKey<String> FILE_CREATED = stringKey("file.created");

  /** Directory where the file is located. It should include the drive letter, when appropriate. */
  public static final AttributeKey<String> FILE_DIRECTORY = stringKey("file.directory");

  /**
   * File extension, excluding the leading dot.
   *
   * <p>Notes:
   *
   * <p>When the file name has multiple extensions (example.tar.gz), only the last one should be
   * captured ("gz", not "tar.gz").
   */
  public static final AttributeKey<String> FILE_EXTENSION = stringKey("file.extension");

  /**
   * Name of the fork. A fork is additional data associated with a filesystem object.
   *
   * <p>Notes:
   *
   * <p>On Linux, a resource fork is used to store additional data with a filesystem object. A file
   * always has at least one fork for the data portion, and additional forks may exist. On NTFS,
   * this is analogous to an Alternate Data Stream (ADS), and the default data stream for a file is
   * just called $DATA. Zone.Identifier is commonly used by Windows to track contents downloaded
   * from the Internet. An ADS is typically of the form:
   * C:\path\to\filename.extension:some_fork_name, and some_fork_name is the value that should
   * populate {@code fork_name}. {@code filename.extension} should populate {@code file.name}, and
   * {@code extension} should populate {@code file.extension}. The full path, {@code file.path},
   * will include the fork name.
   */
  public static final AttributeKey<String> FILE_FORK_NAME = stringKey("file.fork_name");

  /** Primary Group ID (GID) of the file. */
  public static final AttributeKey<String> FILE_GROUP_ID = stringKey("file.group.id");

  /** Primary group name of the file. */
  public static final AttributeKey<String> FILE_GROUP_NAME = stringKey("file.group.name");

  /** Inode representing the file in the filesystem. */
  public static final AttributeKey<String> FILE_INODE = stringKey("file.inode");

  /** Mode of the file in octal representation. */
  public static final AttributeKey<String> FILE_MODE = stringKey("file.mode");

  /** Time when the file content was last modified, in ISO 8601 format. */
  public static final AttributeKey<String> FILE_MODIFIED = stringKey("file.modified");

  /** Name of the file including the extension, without the directory. */
  public static final AttributeKey<String> FILE_NAME = stringKey("file.name");

  /** The user ID (UID) or security identifier (SID) of the file owner. */
  public static final AttributeKey<String> FILE_OWNER_ID = stringKey("file.owner.id");

  /** Username of the file owner. */
  public static final AttributeKey<String> FILE_OWNER_NAME = stringKey("file.owner.name");

  /**
   * Full path to the file, including the file name. It should include the drive letter, when
   * appropriate.
   */
  public static final AttributeKey<String> FILE_PATH = stringKey("file.path");

  /** File size in bytes. */
  public static final AttributeKey<Long> FILE_SIZE = longKey("file.size");

  /**
   * Path to the target of a symbolic link.
   *
   * <p>Notes:
   *
   * <p>This attribute is only applicable to symbolic links.
   */
  public static final AttributeKey<String> FILE_SYMBOLIC_LINK_TARGET_PATH =
      stringKey("file.symbolic_link.target_path");

  // Enum definitions

  private FileIncubatingAttributes() {}
}
