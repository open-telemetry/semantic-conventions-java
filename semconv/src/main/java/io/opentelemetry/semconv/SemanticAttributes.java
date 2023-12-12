/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringArrayKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class SemanticAttributes {

  /**
   * Client address - domain name if available without reverse DNS lookup; otherwise, IP address or
   * Unix domain socket name.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>When observed from the server side, and when communicating through an intermediary,
   *       {@code client.address} SHOULD represent the client address behind any intermediaries, for
   *       example proxies, if it's available.
   * </ul>
   */
  public static final AttributeKey<String> CLIENT_ADDRESS = stringKey("client.address");

  /**
   * Client port number.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>When observed from the server side, and when communicating through an intermediary,
   *       {@code client.port} SHOULD represent the client port behind any intermediaries, for
   *       example proxies, if it's available.
   * </ul>
   */
  public static final AttributeKey<Long> CLIENT_PORT = longKey("client.port");

  /**
   * Describes a class of error the operation ended with.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The {@code error.type} SHOULD be predictable and SHOULD have low cardinality.
   *       Instrumentations SHOULD document the list of errors they report.
   *   <li>The cardinality of {@code error.type} within one instrumentation library SHOULD be low.
   *       Telemetry consumers that aggregate data from multiple instrumentation libraries and
   *       applications should be prepared for {@code error.type} to have high cardinality at query
   *       time when no additional filters are applied.
   *   <li>If the operation has completed successfully, instrumentations SHOULD NOT set {@code
   *       error.type}.
   *   <li>If a specific domain defines its own set of error identifiers (such as HTTP or gRPC
   *       status codes), it's RECOMMENDED to:
   *   <li>Use a domain-specific attribute
   *   <li>Set {@code error.type} to capture all errors, regardless of whether they are defined
   *       within the domain-specific set or not.
   * </ul>
   */
  public static final AttributeKey<String> ERROR_TYPE = stringKey("error.type");

  /**
   * HTTP request method.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>HTTP request method value SHOULD be &quot;known&quot; to the instrumentation. By default,
   *       this convention defines &quot;known&quot; methods as the ones listed in <a
   *       href="https://www.rfc-editor.org/rfc/rfc9110.html#name-methods">RFC9110</a> and the PATCH
   *       method defined in <a href="https://www.rfc-editor.org/rfc/rfc5789.html">RFC5789</a>.
   *   <li>If the HTTP request method is not known to instrumentation, it MUST set the {@code
   *       http.request.method} attribute to {@code _OTHER}.
   *   <li>If the HTTP instrumentation could end up converting valid HTTP request methods to {@code
   *       _OTHER}, then it MUST provide a way to override the list of known HTTP methods. If this
   *       override is done via environment variable, then the environment variable MUST be named
   *       OTEL_INSTRUMENTATION_HTTP_KNOWN_METHODS and support a comma-separated list of
   *       case-sensitive known HTTP methods (this list MUST be a full override of the default known
   *       method, it is not a list of known methods in addition to the defaults).
   *   <li>HTTP method names are case-sensitive and {@code http.request.method} attribute value MUST
   *       match a known HTTP method name exactly. Instrumentations for specific web frameworks that
   *       consider HTTP methods to be case insensitive, SHOULD populate a canonical equivalent.
   *       Tracing instrumentations that do so, MUST also set {@code http.request.method_original}
   *       to the original value.
   * </ul>
   */
  public static final AttributeKey<String> HTTP_REQUEST_METHOD = stringKey("http.request.method");

  /** Original HTTP method sent by the client in the request line. */
  public static final AttributeKey<String> HTTP_REQUEST_METHOD_ORIGINAL =
      stringKey("http.request.method_original");

  /**
   * The ordinal number of request resending attempt (for any reason, including redirects).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The resend count SHOULD be updated each time an HTTP request gets resent by the client,
   *       regardless of what was the cause of the resending (e.g. redirection, authorization
   *       failure, 503 Server Unavailable, network issues, or any other).
   * </ul>
   */
  public static final AttributeKey<Long> HTTP_REQUEST_RESEND_COUNT =
      longKey("http.request.resend_count");

  /** <a href="https://tools.ietf.org/html/rfc7231#section-6">HTTP response status code</a>. */
  public static final AttributeKey<Long> HTTP_RESPONSE_STATUS_CODE =
      longKey("http.response.status_code");

  /**
   * The matched route, that is, the path template in the format used by the respective server
   * framework.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>MUST NOT be populated when this is not supported by the HTTP server framework as the
   *       route attribute should have low-cardinality and the URI path can NOT substitute it.
   *       SHOULD include the <a href="/docs/http/http-spans.md#http-server-definitions">application
   *       root</a> if there is one.
   * </ul>
   */
  public static final AttributeKey<String> HTTP_ROUTE = stringKey("http.route");

  /** Local address of the network connection - IP address or Unix domain socket name. */
  public static final AttributeKey<String> NETWORK_LOCAL_ADDRESS =
      stringKey("network.local.address");

  /** Local port number of the network connection. */
  public static final AttributeKey<Long> NETWORK_LOCAL_PORT = longKey("network.local.port");

  /** Peer address of the network connection - IP address or Unix domain socket name. */
  public static final AttributeKey<String> NETWORK_PEER_ADDRESS = stringKey("network.peer.address");

  /** Peer port number of the network connection. */
  public static final AttributeKey<Long> NETWORK_PEER_PORT = longKey("network.peer.port");

  /**
   * <a href="https://osi-model.com/application-layer/">OSI application layer</a> or non-OSI
   * equivalent.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value SHOULD be normalized to lowercase.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_PROTOCOL_NAME =
      stringKey("network.protocol.name");

  /**
   * Version of the protocol specified in {@code network.protocol.name}.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>{@code network.protocol.version} refers to the version of the protocol used and might be
   *       different from the protocol client's version. If the HTTP client has a version of {@code
   *       0.27.2}, but sends HTTP version {@code 1.1}, this attribute should be set to {@code 1.1}.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_PROTOCOL_VERSION =
      stringKey("network.protocol.version");

  /**
   * <a href="https://osi-model.com/transport-layer/">OSI transport layer</a> or <a
   * href="https://wikipedia.org/wiki/Inter-process_communication">inter-process communication
   * method</a>.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value SHOULD be normalized to lowercase.
   *   <li>Consider always setting the transport when setting a port number, since a port number is
   *       ambiguous without knowing the transport. For example different processes could be
   *       listening on TCP port 12345 and UDP port 12345.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_TRANSPORT = stringKey("network.transport");

  /**
   * <a href="https://osi-model.com/network-layer/">OSI network layer</a> or non-OSI equivalent.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The value SHOULD be normalized to lowercase.
   * </ul>
   */
  public static final AttributeKey<String> NETWORK_TYPE = stringKey("network.type");

  /** The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.5">URI fragment</a> component */
  public static final AttributeKey<String> URL_FRAGMENT = stringKey("url.fragment");

  /**
   * Absolute URL describing a network resource according to <a
   * href="https://www.rfc-editor.org/rfc/rfc3986">RFC3986</a>
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>For network calls, URL usually has {@code scheme://host[:port][path][?query][#fragment]}
   *       format, where the fragment is not transmitted over HTTP, but if it is known, it SHOULD be
   *       included nevertheless. {@code url.full} MUST NOT contain credentials passed via URL in
   *       form of {@code https://username:password@www.example.com/}. In such case username and
   *       password SHOULD be redacted and attribute's value SHOULD be {@code
   *       https://REDACTED:REDACTED@www.example.com/}. {@code url.full} SHOULD capture the absolute
   *       URL when it is available (or can be reconstructed) and SHOULD NOT be validated or
   *       modified except for sanitizing purposes.
   * </ul>
   */
  public static final AttributeKey<String> URL_FULL = stringKey("url.full");

  /** The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.3">URI path</a> component */
  public static final AttributeKey<String> URL_PATH = stringKey("url.path");

  /**
   * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.4">URI query</a> component
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Sensitive content provided in query string SHOULD be scrubbed when instrumentations can
   *       identify it.
   * </ul>
   */
  public static final AttributeKey<String> URL_QUERY = stringKey("url.query");

  /**
   * The <a href="https://www.rfc-editor.org/rfc/rfc3986#section-3.1">URI scheme</a> component
   * identifying the used protocol.
   */
  public static final AttributeKey<String> URL_SCHEME = stringKey("url.scheme");

  /**
   * Value of the <a href="https://www.rfc-editor.org/rfc/rfc9110.html#field.user-agent">HTTP
   * User-Agent</a> header sent by the client.
   */
  public static final AttributeKey<String> USER_AGENT_ORIGINAL = stringKey("user_agent.original");

  /**
   * Server domain name if available without reverse DNS lookup; otherwise, IP address or Unix
   * domain socket name.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>When observed from the client side, and when communicating through an intermediary,
   *       {@code server.address} SHOULD represent the server address behind any intermediaries, for
   *       example proxies, if it's available.
   * </ul>
   */
  public static final AttributeKey<String> SERVER_ADDRESS = stringKey("server.address");

  /**
   * Server port number.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>When observed from the client side, and when communicating through an intermediary,
   *       {@code server.port} SHOULD represent the server port behind any intermediaries, for
   *       example proxies, if it's available.
   * </ul>
   */
  public static final AttributeKey<Long> SERVER_PORT = longKey("server.port");

  /**
   * HTTP request headers, {@code <key>} being the normalized HTTP Header name (lowercase), the
   * value being the header values.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Instrumentations SHOULD require an explicit configuration of which headers are to be
   *       captured. Including all request headers can be a security risk - explicit configuration
   *       helps avoid leaking sensitive information. The {@code User-Agent} header is already
   *       captured in the {@code user_agent.original} attribute. Users MAY explicitly configure
   *       instrumentations to capture them even though it is not recommended. The attribute value
   *       MUST consist of either multiple header values as an array of strings or a single-item
   *       array containing a possibly comma-concatenated string, depending on the way the HTTP
   *       library provides access to headers.
   * </ul>
   */
  public static final AttributeKeyTemplate<List<String>> HTTP_REQUEST_HEADER =
      stringArrayKeyTemplate("http.request.header");

  /**
   * HTTP response headers, {@code <key>} being the normalized HTTP Header name (lowercase), the
   * value being the header values.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Instrumentations SHOULD require an explicit configuration of which headers are to be
   *       captured. Including all response headers can be a security risk - explicit configuration
   *       helps avoid leaking sensitive information. Users MAY explicitly configure
   *       instrumentations to capture them even though it is not recommended. The attribute value
   *       MUST consist of either multiple header values as an array of strings or a single-item
   *       array containing a possibly comma-concatenated string, depending on the way the HTTP
   *       library provides access to headers.
   * </ul>
   */
  public static final AttributeKeyTemplate<List<String>> HTTP_RESPONSE_HEADER =
      stringArrayKeyTemplate("http.response.header");

  // Enum definitions
  public static final class ErrorTypeValues {
    /**
     * A fallback error value to be used when the instrumentation doesn&#39;t define a custom value.
     */
    public static final String OTHER = "_OTHER";

    private ErrorTypeValues() {}
  }

  public static final class HttpRequestMethodValues {
    /** CONNECT method. */
    public static final String CONNECT = "CONNECT";

    /** DELETE method. */
    public static final String DELETE = "DELETE";

    /** GET method. */
    public static final String GET = "GET";

    /** HEAD method. */
    public static final String HEAD = "HEAD";

    /** OPTIONS method. */
    public static final String OPTIONS = "OPTIONS";

    /** PATCH method. */
    public static final String PATCH = "PATCH";

    /** POST method. */
    public static final String POST = "POST";

    /** PUT method. */
    public static final String PUT = "PUT";

    /** TRACE method. */
    public static final String TRACE = "TRACE";

    /** Any HTTP method that the instrumentation has no prior knowledge of. */
    public static final String OTHER = "_OTHER";

    private HttpRequestMethodValues() {}
  }

  public static final class NetworkTransportValues {
    /** TCP. */
    public static final String TCP = "tcp";

    /** UDP. */
    public static final String UDP = "udp";

    /** Named or anonymous pipe. */
    public static final String PIPE = "pipe";

    /** Unix domain socket. */
    public static final String UNIX = "unix";

    private NetworkTransportValues() {}
  }

  public static final class NetworkTypeValues {
    /** IPv4. */
    public static final String IPV4 = "ipv4";

    /** IPv6. */
    public static final String IPV6 = "ipv6";

    private NetworkTypeValues() {}
  }

  private SemanticAttributes() {}
}
