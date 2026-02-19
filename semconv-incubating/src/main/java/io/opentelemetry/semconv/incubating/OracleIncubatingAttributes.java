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
public final class OracleIncubatingAttributes {
  /**
   * The database domain associated with the connection.
   *
   * <p>Notes:
   *
   * <p>This attribute SHOULD be set to the value of the {@code DB_DOMAIN} initialization parameter,
   * as exposed in {@code v$parameter}. {@code DB_DOMAIN} defines the domain portion of the global
   * database name and SHOULD be configured when a database is, or may become, part of a distributed
   * environment. Its value consists of one or more valid identifiers (alphanumeric ASCII
   * characters) separated by periods.
   */
  public static final AttributeKey<String> ORACLE_DB_DOMAIN = stringKey("oracle.db.domain");

  /**
   * The instance name associated with the connection in an Oracle Real Application Clusters
   * environment.
   *
   * <p>Notes:
   *
   * <p>There can be multiple instances associated with a single database service. It indicates the
   * unique instance name to which the connection is currently bound. For non-RAC databases, this
   * value defaults to the {@code oracle.db.name}.
   */
  public static final AttributeKey<String> ORACLE_DB_INSTANCE_NAME =
      stringKey("oracle.db.instance.name");

  /**
   * The database name associated with the connection.
   *
   * <p>Notes:
   *
   * <p>This attribute SHOULD be set to the value of the parameter {@code DB_NAME} exposed in {@code
   * v$parameter}.
   */
  public static final AttributeKey<String> ORACLE_DB_NAME = stringKey("oracle.db.name");

  /**
   * The pluggable database (PDB) name associated with the connection.
   *
   * <p>Notes:
   *
   * <p>This attribute SHOULD reflect the PDB that the session is currently connected to. If
   * instrumentation cannot reliably obtain the active PDB name for each operation without issuing
   * an additional query (such as {@code SELECT SYS_CONTEXT}), it is RECOMMENDED to fall back to the
   * PDB name specified at connection establishment.
   */
  public static final AttributeKey<String> ORACLE_DB_PDB = stringKey("oracle.db.pdb");

  /**
   * The service name currently associated with the database connection.
   *
   * <p>Notes:
   *
   * <p>The effective service name for a connection can change during its lifetime, for example
   * after executing sql, {@code ALTER SESSION}. If an instrumentation cannot reliably obtain the
   * current service name for each operation without issuing an additional query (such as {@code
   * SELECT SYS_CONTEXT}), it is RECOMMENDED to fall back to the service name originally provided at
   * connection establishment.
   */
  public static final AttributeKey<String> ORACLE_DB_SERVICE = stringKey("oracle.db.service");

  // Enum definitions

  private OracleIncubatingAttributes() {}
}
