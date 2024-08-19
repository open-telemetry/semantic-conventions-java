/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class TlsIncubatingAttributes {

  /**
   * String indicating the <a
   * href="https://datatracker.ietf.org/doc/html/rfc5246#appendix-A.5">cipher</a> used during the
   * current connection.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The values allowed for {@code tls.cipher} MUST be one of the {@code Descriptions} of the
   *       <a
   *       href="https://www.iana.org/assignments/tls-parameters/tls-parameters.xhtml#table-tls-parameters-4">registered
   *       TLS Cipher Suits</a>.
   * </ul>
   */
  public static final AttributeKey<String> TLS_CIPHER = stringKey("tls.cipher");

  /**
   * PEM-encoded stand-alone certificate offered by the client. This is usually mutually-exclusive
   * of {@code client.certificate_chain} since this value also exists in that list.
   */
  public static final AttributeKey<String> TLS_CLIENT_CERTIFICATE =
      stringKey("tls.client.certificate");

  /**
   * Array of PEM-encoded certificates that make up the certificate chain offered by the client.
   * This is usually mutually-exclusive of {@code client.certificate} since that value should be the
   * first certificate in the chain.
   */
  public static final AttributeKey<List<String>> TLS_CLIENT_CERTIFICATE_CHAIN =
      stringArrayKey("tls.client.certificate_chain");

  /**
   * Certificate fingerprint using the MD5 digest of DER-encoded version of certificate offered by
   * the client. For consistency with other hash values, this value should be formatted as an
   * uppercase hash.
   */
  public static final AttributeKey<String> TLS_CLIENT_HASH_MD5 = stringKey("tls.client.hash.md5");

  /**
   * Certificate fingerprint using the SHA1 digest of DER-encoded version of certificate offered by
   * the client. For consistency with other hash values, this value should be formatted as an
   * uppercase hash.
   */
  public static final AttributeKey<String> TLS_CLIENT_HASH_SHA1 = stringKey("tls.client.hash.sha1");

  /**
   * Certificate fingerprint using the SHA256 digest of DER-encoded version of certificate offered
   * by the client. For consistency with other hash values, this value should be formatted as an
   * uppercase hash.
   */
  public static final AttributeKey<String> TLS_CLIENT_HASH_SHA256 =
      stringKey("tls.client.hash.sha256");

  /**
   * Distinguished name of <a
   * href="https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6">subject</a> of the issuer
   * of the x.509 certificate presented by the client.
   */
  public static final AttributeKey<String> TLS_CLIENT_ISSUER = stringKey("tls.client.issuer");

  /** A hash that identifies clients based on how they perform an SSL/TLS handshake. */
  public static final AttributeKey<String> TLS_CLIENT_JA3 = stringKey("tls.client.ja3");

  /** Date/Time indicating when client certificate is no longer considered valid. */
  public static final AttributeKey<String> TLS_CLIENT_NOT_AFTER = stringKey("tls.client.not_after");

  /** Date/Time indicating when client certificate is first considered valid. */
  public static final AttributeKey<String> TLS_CLIENT_NOT_BEFORE =
      stringKey("tls.client.not_before");

  /**
   * Deprecated, use {@code server.address} instead.
   *
   * @deprecated Deprecated, use `server.address` instead.
   */
  @Deprecated
  public static final AttributeKey<String> TLS_CLIENT_SERVER_NAME =
      stringKey("tls.client.server_name");

  /** Distinguished name of subject of the x.509 certificate presented by the client. */
  public static final AttributeKey<String> TLS_CLIENT_SUBJECT = stringKey("tls.client.subject");

  /** Array of ciphers offered by the client during the client hello. */
  public static final AttributeKey<List<String>> TLS_CLIENT_SUPPORTED_CIPHERS =
      stringArrayKey("tls.client.supported_ciphers");

  /** String indicating the curve used for the given cipher, when applicable */
  public static final AttributeKey<String> TLS_CURVE = stringKey("tls.curve");

  /**
   * Boolean flag indicating if the TLS negotiation was successful and transitioned to an encrypted
   * tunnel.
   */
  public static final AttributeKey<Boolean> TLS_ESTABLISHED = booleanKey("tls.established");

  /**
   * String indicating the protocol being tunneled. Per the values in the <a
   * href="https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids">IANA
   * registry</a>, this string should be lower case.
   */
  public static final AttributeKey<String> TLS_NEXT_PROTOCOL = stringKey("tls.next_protocol");

  /**
   * Normalized lowercase protocol name parsed from original string of the negotiated <a
   * href="https://www.openssl.org/docs/man1.1.1/man3/SSL_get_version.html#RETURN-VALUES">SSL/TLS
   * protocol version</a>
   */
  public static final AttributeKey<String> TLS_PROTOCOL_NAME = stringKey("tls.protocol.name");

  /**
   * Numeric part of the version parsed from the original string of the negotiated <a
   * href="https://www.openssl.org/docs/man1.1.1/man3/SSL_get_version.html#RETURN-VALUES">SSL/TLS
   * protocol version</a>
   */
  public static final AttributeKey<String> TLS_PROTOCOL_VERSION = stringKey("tls.protocol.version");

  /**
   * Boolean flag indicating if this TLS connection was resumed from an existing TLS negotiation.
   */
  public static final AttributeKey<Boolean> TLS_RESUMED = booleanKey("tls.resumed");

  /**
   * PEM-encoded stand-alone certificate offered by the server. This is usually mutually-exclusive
   * of {@code server.certificate_chain} since this value also exists in that list.
   */
  public static final AttributeKey<String> TLS_SERVER_CERTIFICATE =
      stringKey("tls.server.certificate");

  /**
   * Array of PEM-encoded certificates that make up the certificate chain offered by the server.
   * This is usually mutually-exclusive of {@code server.certificate} since that value should be the
   * first certificate in the chain.
   */
  public static final AttributeKey<List<String>> TLS_SERVER_CERTIFICATE_CHAIN =
      stringArrayKey("tls.server.certificate_chain");

  /**
   * Certificate fingerprint using the MD5 digest of DER-encoded version of certificate offered by
   * the server. For consistency with other hash values, this value should be formatted as an
   * uppercase hash.
   */
  public static final AttributeKey<String> TLS_SERVER_HASH_MD5 = stringKey("tls.server.hash.md5");

  /**
   * Certificate fingerprint using the SHA1 digest of DER-encoded version of certificate offered by
   * the server. For consistency with other hash values, this value should be formatted as an
   * uppercase hash.
   */
  public static final AttributeKey<String> TLS_SERVER_HASH_SHA1 = stringKey("tls.server.hash.sha1");

  /**
   * Certificate fingerprint using the SHA256 digest of DER-encoded version of certificate offered
   * by the server. For consistency with other hash values, this value should be formatted as an
   * uppercase hash.
   */
  public static final AttributeKey<String> TLS_SERVER_HASH_SHA256 =
      stringKey("tls.server.hash.sha256");

  /**
   * Distinguished name of <a
   * href="https://datatracker.ietf.org/doc/html/rfc5280#section-4.1.2.6">subject</a> of the issuer
   * of the x.509 certificate presented by the client.
   */
  public static final AttributeKey<String> TLS_SERVER_ISSUER = stringKey("tls.server.issuer");

  /** A hash that identifies servers based on how they perform an SSL/TLS handshake. */
  public static final AttributeKey<String> TLS_SERVER_JA3S = stringKey("tls.server.ja3s");

  /** Date/Time indicating when server certificate is no longer considered valid. */
  public static final AttributeKey<String> TLS_SERVER_NOT_AFTER = stringKey("tls.server.not_after");

  /** Date/Time indicating when server certificate is first considered valid. */
  public static final AttributeKey<String> TLS_SERVER_NOT_BEFORE =
      stringKey("tls.server.not_before");

  /** Distinguished name of subject of the x.509 certificate presented by the server. */
  public static final AttributeKey<String> TLS_SERVER_SUBJECT = stringKey("tls.server.subject");

  // Enum definitions
  /** Values for {@link #TLS_PROTOCOL_NAME}. */
  public static final class TlsProtocolNameIncubatingValues {
    /** ssl. */
    public static final String SSL = "ssl";

    /** tls. */
    public static final String TLS = "tls";

    private TlsProtocolNameIncubatingValues() {}
  }

  private TlsIncubatingAttributes() {}
}
