/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class NfsIncubatingMetrics {
  /** Name of the {@code nfs.client.net.count} metric. */
  public static final String NFS_CLIENT_NET_COUNT_NAME = "nfs.client.net.count";

  /** Unit of the {@code nfs.client.net.count} metric. */
  public static final String NFS_CLIENT_NET_COUNT_UNIT = "{record}";

  /** Description of the {@code nfs.client.net.count} metric. */
  public static final String NFS_CLIENT_NET_COUNT_DESCRIPTION =
      "Reports the count of kernel NFS client TCP segments and UDP datagrams handled.";

  /** Name of the {@code nfs.client.net.tcp.connection.accepted} metric. */
  public static final String NFS_CLIENT_NET_TCP_CONNECTION_ACCEPTED_NAME =
      "nfs.client.net.tcp.connection.accepted";

  /** Unit of the {@code nfs.client.net.tcp.connection.accepted} metric. */
  public static final String NFS_CLIENT_NET_TCP_CONNECTION_ACCEPTED_UNIT = "{connection}";

  /** Description of the {@code nfs.client.net.tcp.connection.accepted} metric. */
  public static final String NFS_CLIENT_NET_TCP_CONNECTION_ACCEPTED_DESCRIPTION =
      "Reports the count of kernel NFS client TCP connections accepted.";

  /** Name of the {@code nfs.client.operation.count} metric. */
  public static final String NFS_CLIENT_OPERATION_COUNT_NAME = "nfs.client.operation.count";

  /** Unit of the {@code nfs.client.operation.count} metric. */
  public static final String NFS_CLIENT_OPERATION_COUNT_UNIT = "{operation}";

  /** Description of the {@code nfs.client.operation.count} metric. */
  public static final String NFS_CLIENT_OPERATION_COUNT_DESCRIPTION =
      "Reports the count of kernel NFSv4+ client operations.";

  /** Name of the {@code nfs.client.procedure.count} metric. */
  public static final String NFS_CLIENT_PROCEDURE_COUNT_NAME = "nfs.client.procedure.count";

  /** Unit of the {@code nfs.client.procedure.count} metric. */
  public static final String NFS_CLIENT_PROCEDURE_COUNT_UNIT = "{procedure}";

  /** Description of the {@code nfs.client.procedure.count} metric. */
  public static final String NFS_CLIENT_PROCEDURE_COUNT_DESCRIPTION =
      "Reports the count of kernel NFS client procedures.";

  /** Name of the {@code nfs.client.rpc.authrefresh.count} metric. */
  public static final String NFS_CLIENT_RPC_AUTHREFRESH_COUNT_NAME =
      "nfs.client.rpc.authrefresh.count";

  /** Unit of the {@code nfs.client.rpc.authrefresh.count} metric. */
  public static final String NFS_CLIENT_RPC_AUTHREFRESH_COUNT_UNIT = "{authrefresh}";

  /** Description of the {@code nfs.client.rpc.authrefresh.count} metric. */
  public static final String NFS_CLIENT_RPC_AUTHREFRESH_COUNT_DESCRIPTION =
      "Reports the count of kernel NFS client RPC authentication refreshes.";

  /** Name of the {@code nfs.client.rpc.count} metric. */
  public static final String NFS_CLIENT_RPC_COUNT_NAME = "nfs.client.rpc.count";

  /** Unit of the {@code nfs.client.rpc.count} metric. */
  public static final String NFS_CLIENT_RPC_COUNT_UNIT = "{request}";

  /** Description of the {@code nfs.client.rpc.count} metric. */
  public static final String NFS_CLIENT_RPC_COUNT_DESCRIPTION =
      "Reports the count of kernel NFS client RPCs sent, regardless of whether they're accepted/rejected by the server.";

  /** Name of the {@code nfs.client.rpc.retransmit.count} metric. */
  public static final String NFS_CLIENT_RPC_RETRANSMIT_COUNT_NAME =
      "nfs.client.rpc.retransmit.count";

  /** Unit of the {@code nfs.client.rpc.retransmit.count} metric. */
  public static final String NFS_CLIENT_RPC_RETRANSMIT_COUNT_UNIT = "{retransmit}";

  /** Description of the {@code nfs.client.rpc.retransmit.count} metric. */
  public static final String NFS_CLIENT_RPC_RETRANSMIT_COUNT_DESCRIPTION =
      "Reports the count of kernel NFS client RPC retransmits.";

  /** Name of the {@code nfs.server.fh.stale.count} metric. */
  public static final String NFS_SERVER_FH_STALE_COUNT_NAME = "nfs.server.fh.stale.count";

  /** Unit of the {@code nfs.server.fh.stale.count} metric. */
  public static final String NFS_SERVER_FH_STALE_COUNT_UNIT = "{fh}";

  /** Description of the {@code nfs.server.fh.stale.count} metric. */
  public static final String NFS_SERVER_FH_STALE_COUNT_DESCRIPTION =
      "Reports the count of kernel NFS server stale file handles.";

  /** Name of the {@code nfs.server.io} metric. */
  public static final String NFS_SERVER_IO_NAME = "nfs.server.io";

  /** Unit of the {@code nfs.server.io} metric. */
  public static final String NFS_SERVER_IO_UNIT = "By";

  /** Description of the {@code nfs.server.io} metric. */
  public static final String NFS_SERVER_IO_DESCRIPTION =
      "Reports the count of kernel NFS server bytes returned to receive and transmit (read and write) requests.";

  /** Name of the {@code nfs.server.net.count} metric. */
  public static final String NFS_SERVER_NET_COUNT_NAME = "nfs.server.net.count";

  /** Unit of the {@code nfs.server.net.count} metric. */
  public static final String NFS_SERVER_NET_COUNT_UNIT = "{record}";

  /** Description of the {@code nfs.server.net.count} metric. */
  public static final String NFS_SERVER_NET_COUNT_DESCRIPTION =
      "Reports the count of kernel NFS server TCP segments and UDP datagrams handled.";

  /** Name of the {@code nfs.server.net.tcp.connection.accepted} metric. */
  public static final String NFS_SERVER_NET_TCP_CONNECTION_ACCEPTED_NAME =
      "nfs.server.net.tcp.connection.accepted";

  /** Unit of the {@code nfs.server.net.tcp.connection.accepted} metric. */
  public static final String NFS_SERVER_NET_TCP_CONNECTION_ACCEPTED_UNIT = "{connection}";

  /** Description of the {@code nfs.server.net.tcp.connection.accepted} metric. */
  public static final String NFS_SERVER_NET_TCP_CONNECTION_ACCEPTED_DESCRIPTION =
      "Reports the count of kernel NFS server TCP connections accepted.";

  /** Name of the {@code nfs.server.operation.count} metric. */
  public static final String NFS_SERVER_OPERATION_COUNT_NAME = "nfs.server.operation.count";

  /** Unit of the {@code nfs.server.operation.count} metric. */
  public static final String NFS_SERVER_OPERATION_COUNT_UNIT = "{operation}";

  /** Description of the {@code nfs.server.operation.count} metric. */
  public static final String NFS_SERVER_OPERATION_COUNT_DESCRIPTION =
      "Reports the count of kernel NFSv4+ server operations.";

  /** Name of the {@code nfs.server.procedure.count} metric. */
  public static final String NFS_SERVER_PROCEDURE_COUNT_NAME = "nfs.server.procedure.count";

  /** Unit of the {@code nfs.server.procedure.count} metric. */
  public static final String NFS_SERVER_PROCEDURE_COUNT_UNIT = "{procedure}";

  /** Description of the {@code nfs.server.procedure.count} metric. */
  public static final String NFS_SERVER_PROCEDURE_COUNT_DESCRIPTION =
      "Reports the count of kernel NFS server procedures.";

  /** Name of the {@code nfs.server.repcache.requests} metric. */
  public static final String NFS_SERVER_REPCACHE_REQUESTS_NAME = "nfs.server.repcache.requests";

  /** Unit of the {@code nfs.server.repcache.requests} metric. */
  public static final String NFS_SERVER_REPCACHE_REQUESTS_UNIT = "{request}";

  /** Description of the {@code nfs.server.repcache.requests} metric. */
  public static final String NFS_SERVER_REPCACHE_REQUESTS_DESCRIPTION =
      "Reports the kernel NFS server reply cache request count by cache hit status.";

  /** Name of the {@code nfs.server.rpc.count} metric. */
  public static final String NFS_SERVER_RPC_COUNT_NAME = "nfs.server.rpc.count";

  /** Unit of the {@code nfs.server.rpc.count} metric. */
  public static final String NFS_SERVER_RPC_COUNT_UNIT = "{request}";

  /** Description of the {@code nfs.server.rpc.count} metric. */
  public static final String NFS_SERVER_RPC_COUNT_DESCRIPTION =
      "Reports the count of kernel NFS server RPCs handled.";

  /** Name of the {@code nfs.server.thread.count} metric. */
  public static final String NFS_SERVER_THREAD_COUNT_NAME = "nfs.server.thread.count";

  /** Unit of the {@code nfs.server.thread.count} metric. */
  public static final String NFS_SERVER_THREAD_COUNT_UNIT = "{thread}";

  /** Description of the {@code nfs.server.thread.count} metric. */
  public static final String NFS_SERVER_THREAD_COUNT_DESCRIPTION =
      "Reports the count of kernel NFS server available threads.";

  private NfsIncubatingMetrics() {}
}
