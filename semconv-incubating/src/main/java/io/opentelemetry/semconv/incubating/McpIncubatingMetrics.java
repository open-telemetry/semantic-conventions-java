/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class McpIncubatingMetrics {

  /** Name of the {@code mcp.client.operation.duration} metric. */
  public static final String MCP_CLIENT_OPERATION_DURATION_NAME = "mcp.client.operation.duration";

  /** Unit of the {@code mcp.client.operation.duration} metric. */
  public static final String MCP_CLIENT_OPERATION_DURATION_UNIT = "s";

  /** Description of the {@code mcp.client.operation.duration} metric. */
  public static final String MCP_CLIENT_OPERATION_DURATION_DESCRIPTION =
      "The duration of the MCP request or notification as observed on the sender from the time it was sent until the response or ack is received. ";

  /** Name of the {@code mcp.client.session.duration} metric. */
  public static final String MCP_CLIENT_SESSION_DURATION_NAME = "mcp.client.session.duration";

  /** Unit of the {@code mcp.client.session.duration} metric. */
  public static final String MCP_CLIENT_SESSION_DURATION_UNIT = "s";

  /** Description of the {@code mcp.client.session.duration} metric. */
  public static final String MCP_CLIENT_SESSION_DURATION_DESCRIPTION =
      "The duration of the MCP session as observed on the MCP client.";

  /** Name of the {@code mcp.server.operation.duration} metric. */
  public static final String MCP_SERVER_OPERATION_DURATION_NAME = "mcp.server.operation.duration";

  /** Unit of the {@code mcp.server.operation.duration} metric. */
  public static final String MCP_SERVER_OPERATION_DURATION_UNIT = "s";

  /** Description of the {@code mcp.server.operation.duration} metric. */
  public static final String MCP_SERVER_OPERATION_DURATION_DESCRIPTION =
      "MCP request or notification duration as observed on the receiver from the time it was received until the result or ack is sent. ";

  /** Name of the {@code mcp.server.session.duration} metric. */
  public static final String MCP_SERVER_SESSION_DURATION_NAME = "mcp.server.session.duration";

  /** Unit of the {@code mcp.server.session.duration} metric. */
  public static final String MCP_SERVER_SESSION_DURATION_UNIT = "s";

  /** Description of the {@code mcp.server.session.duration} metric. */
  public static final String MCP_SERVER_SESSION_DURATION_DESCRIPTION =
      "The duration of the MCP session as observed on the MCP server.";

  private McpIncubatingMetrics() {}
}
