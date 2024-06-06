
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
public final class RpcIncubatingAttributes {

  /**
  * The <a href="https://connect.build/docs/protocol/#error-codes">error codes</a> of the Connect request. Error codes are always string values.
  *
  */
  public static final AttributeKey<String> RPC_CONNECTRPC_ERRORCODE = stringKey("rpc.connect_rpc.error_code");

  /**
  * Connect request metadata, {@code <key>} being the normalized Connect Metadata key (lowercase), the value being the metadata values.
  *
  * <p>Notes:
        
        
        <ul> <li>Instrumentations SHOULD require an explicit configuration of which metadata values are to be captured. Including all request metadata values can be a security risk - explicit configuration helps avoid leaking sensitive information.</li> </ul>
  *
  */
  public static final AttributeKeyTemplate<List<String>> RPC_CONNECTRPC_REQUEST_METADATA = stringArrayKeyTemplate("rpc.connect_rpc.request.metadata");

  /**
  * Connect response metadata, {@code <key>} being the normalized Connect Metadata key (lowercase), the value being the metadata values.
  *
  * <p>Notes:
        
        
        <ul> <li>Instrumentations SHOULD require an explicit configuration of which metadata values are to be captured. Including all response metadata values can be a security risk - explicit configuration helps avoid leaking sensitive information.</li> </ul>
  *
  */
  public static final AttributeKeyTemplate<List<String>> RPC_CONNECTRPC_RESPONSE_METADATA = stringArrayKeyTemplate("rpc.connect_rpc.response.metadata");

  /**
  * gRPC request metadata, {@code <key>} being the normalized gRPC Metadata key (lowercase), the value being the metadata values.
  *
  * <p>Notes:
        
        
        <ul> <li>Instrumentations SHOULD require an explicit configuration of which metadata values are to be captured. Including all request metadata values can be a security risk - explicit configuration helps avoid leaking sensitive information.</li> </ul>
  *
  */
  public static final AttributeKeyTemplate<List<String>> RPC_GRPC_REQUEST_METADATA = stringArrayKeyTemplate("rpc.grpc.request.metadata");

  /**
  * gRPC response metadata, {@code <key>} being the normalized gRPC Metadata key (lowercase), the value being the metadata values.
  *
  * <p>Notes:
        
        
        <ul> <li>Instrumentations SHOULD require an explicit configuration of which metadata values are to be captured. Including all response metadata values can be a security risk - explicit configuration helps avoid leaking sensitive information.</li> </ul>
  *
  */
  public static final AttributeKeyTemplate<List<String>> RPC_GRPC_RESPONSE_METADATA = stringArrayKeyTemplate("rpc.grpc.response.metadata");

  /**
  * The <a href="https://github.com/grpc/grpc/blob/v1.33.2/doc/statuscodes.md">numeric status code</a> of the gRPC request.
  *
  */
  public static final AttributeKey<Long> RPC_GRPC_STATUSCODE = longKey("rpc.grpc.status_code");

  /**
  * {@code error.code} property of response if it is an error response.
  *
  */
  public static final AttributeKey<Long> RPC_JSONRPC_ERRORCODE = longKey("rpc.jsonrpc.error_code");

  /**
  * {@code error.message} property of response if it is an error response.
  *
  */
  public static final AttributeKey<String> RPC_JSONRPC_ERRORMESSAGE = stringKey("rpc.jsonrpc.error_message");

  /**
  * {@code id} property of request or response. Since protocol allows id to be int, string, {@code null} or missing (for notifications), value is expected to be cast to string for simplicity. Use empty string in case of {@code null} value. Omit entirely if this is a notification.
  *
  */
  public static final AttributeKey<String> RPC_JSONRPC_REQUESTID = stringKey("rpc.jsonrpc.request_id");

  /**
  * Protocol version as in {@code jsonrpc} property of request/response. Since JSON-RPC 1.0 doesn't specify this, the value can be omitted.
  *
  */
  public static final AttributeKey<String> RPC_JSONRPC_VERSION = stringKey("rpc.jsonrpc.version");

  /**
  * The name of the (logical) method being called, must be equal to the $method part in the span name.
  *
  * <p>Notes:
        
        
        <ul> <li>This is the logical name of the method from the RPC interface perspective, which can be different from the name of any implementing method/function. The {@code code.function} attribute may be used to store the latter (e.g., method actually executing the call on the server side, RPC client stub method on the client side).</li> </ul>
  *
  */
  public static final AttributeKey<String> RPC_METHOD = stringKey("rpc.method");

  /**
  * The full (logical) name of the service being called, including its package name, if applicable.
  *
  * <p>Notes:
        
        
        <ul> <li>This is the logical name of the service from the RPC interface perspective, which can be different from the name of any implementing class. The {@code code.namespace} attribute may be used to store the latter (despite the attribute name, it may include a class name; e.g., class with method actually executing the call on the server side, RPC client stub class on the client side).</li> </ul>
  *
  */
  public static final AttributeKey<String> RPC_SERVICE = stringKey("rpc.service");

  /**
  * A string identifying the remoting system. See below for a list of well-known identifiers.
  *
  */
  public static final AttributeKey<String> RPC_SYSTEM = stringKey("rpc.system");
  // Enum definitions
  /**
  * Values for {@link #RPC_CONNECTRPC_ERRORCODE}.
  *
  */
  public static final class RpcConnectrpcErrorcodeValues {
      /** cancelled. */
      public static final String CANCELLED = "cancelled";
      /** unknown. */
      public static final String UNKNOWN = "unknown";
      /** invalid_argument. */
      public static final String INVALIDARGUMENT = "invalid_argument";
      /** deadline_exceeded. */
      public static final String DEADLINEEXCEEDED = "deadline_exceeded";
      /** not_found. */
      public static final String NOTFOUND = "not_found";
      /** already_exists. */
      public static final String ALREADYEXISTS = "already_exists";
      /** permission_denied. */
      public static final String PERMISSIONDENIED = "permission_denied";
      /** resource_exhausted. */
      public static final String RESOURCEEXHAUSTED = "resource_exhausted";
      /** failed_precondition. */
      public static final String FAILEDPRECONDITION = "failed_precondition";
      /** aborted. */
      public static final String ABORTED = "aborted";
      /** out_of_range. */
      public static final String OUTOFRANGE = "out_of_range";
      /** unimplemented. */
      public static final String UNIMPLEMENTED = "unimplemented";
      /** internal. */
      public static final String INTERNAL = "internal";
      /** unavailable. */
      public static final String UNAVAILABLE = "unavailable";
      /** data_loss. */
      public static final String DATALOSS = "data_loss";
      /** unauthenticated. */
      public static final String UNAUTHENTICATED = "unauthenticated";

      private RpcConnectrpcErrorcodeValues() {}
  }
  /**
  * Values for {@link #RPC_GRPC_STATUSCODE}.
  *
  */
  public static final class RpcGrpcStatuscodeValues {
      /** OK. */
      public static final long OK = 0;
      /** CANCELLED. */
      public static final long CANCELLED = 1;
      /** UNKNOWN. */
      public static final long UNKNOWN = 2;
      /** INVALID_ARGUMENT. */
      public static final long INVALIDARGUMENT = 3;
      /** DEADLINE_EXCEEDED. */
      public static final long DEADLINEEXCEEDED = 4;
      /** NOT_FOUND. */
      public static final long NOTFOUND = 5;
      /** ALREADY_EXISTS. */
      public static final long ALREADYEXISTS = 6;
      /** PERMISSION_DENIED. */
      public static final long PERMISSIONDENIED = 7;
      /** RESOURCE_EXHAUSTED. */
      public static final long RESOURCEEXHAUSTED = 8;
      /** FAILED_PRECONDITION. */
      public static final long FAILEDPRECONDITION = 9;
      /** ABORTED. */
      public static final long ABORTED = 10;
      /** OUT_OF_RANGE. */
      public static final long OUTOFRANGE = 11;
      /** UNIMPLEMENTED. */
      public static final long UNIMPLEMENTED = 12;
      /** INTERNAL. */
      public static final long INTERNAL = 13;
      /** UNAVAILABLE. */
      public static final long UNAVAILABLE = 14;
      /** DATA_LOSS. */
      public static final long DATALOSS = 15;
      /** UNAUTHENTICATED. */
      public static final long UNAUTHENTICATED = 16;

      private RpcGrpcStatuscodeValues() {}
  }
  /**
  * Values for {@link #RPC_SYSTEM}.
  *
  */
  public static final class RpcSystemValues {
      /** gRPC. */
      public static final String GRPC = "grpc";
      /** Java RMI. */
      public static final String JAVARMI = "java_rmi";
      /** .NET WCF. */
      public static final String DOTNETWCF = "dotnet_wcf";
      /** Apache Dubbo. */
      public static final String APACHEDUBBO = "apache_dubbo";
      /** Connect RPC. */
      public static final String CONNECTRPC = "connect_rpc";

      private RpcSystemValues() {}
  }

  private RpcIncubatingAttributes() {}
}