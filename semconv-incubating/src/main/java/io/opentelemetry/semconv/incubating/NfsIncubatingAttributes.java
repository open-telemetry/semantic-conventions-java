/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class NfsIncubatingAttributes {
  /** NFSv4+ operation name. */
  public static final AttributeKey<String> NFS_OPERATION_NAME = stringKey("nfs.operation.name");

  /**
   * Linux: one of "hit" (NFSD_STATS_RC_HITS), "miss" (NFSD_STATS_RC_MISSES), or "nocache"
   * (NFSD_STATS_RC_NOCACHE -- uncacheable)
   */
  public static final AttributeKey<String> NFS_SERVER_REPCACHE_STATUS =
      stringKey("nfs.server.repcache.status");

  // Enum definitions

  private NfsIncubatingAttributes() {}
}
