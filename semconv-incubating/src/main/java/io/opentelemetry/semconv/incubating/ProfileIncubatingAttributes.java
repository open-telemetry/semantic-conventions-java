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
public final class ProfileIncubatingAttributes {
  /** Describes the interpreter or compiler of a single frame. */
  public static final AttributeKey<String> PROFILE_FRAME_TYPE = stringKey("profile.frame.type");

  // Enum definitions

  /** Values for {@link #PROFILE_FRAME_TYPE}. */
  public static final class ProfileFrameTypeIncubatingValues {
    /** <a href="https://wikipedia.org/wiki/.NET">.NET</a> */
    public static final String DOTNET = "dotnet";

    /** <a href="https://wikipedia.org/wiki/Java_virtual_machine">JVM</a> */
    public static final String JVM = "jvm";

    /** <a href="https://wikipedia.org/wiki/Kernel_(operating_system)">Kernel</a> */
    public static final String KERNEL = "kernel";

    /**
     * Can be one of but not limited to <a
     * href="https://wikipedia.org/wiki/C_(programming_language)">C</a>, <a
     * href="https://wikipedia.org/wiki/C%2B%2B">C++</a>, <a
     * href="https://wikipedia.org/wiki/Go_(programming_language)">Go</a> or <a
     * href="https://wikipedia.org/wiki/Rust_(programming_language)">Rust</a>. If possible, a more
     * precise value MUST be used.
     */
    public static final String NATIVE = "native";

    /** <a href="https://wikipedia.org/wiki/Perl">Perl</a> */
    public static final String PERL = "perl";

    /** <a href="https://wikipedia.org/wiki/PHP">PHP</a> */
    public static final String PHP = "php";

    /** <a href="https://wikipedia.org/wiki/Python_(programming_language)">Python</a> */
    public static final String CPYTHON = "cpython";

    /** <a href="https://wikipedia.org/wiki/Ruby_(programming_language)">Ruby</a> */
    public static final String RUBY = "ruby";

    /** <a href="https://wikipedia.org/wiki/V8_(JavaScript_engine)">V8JS</a> */
    public static final String V8JS = "v8js";

    /** <a href="https://en.wikipedia.org/wiki/BEAM_(Erlang_virtual_machine)">Erlang</a> */
    public static final String BEAM = "beam";

    /** <a href="https://wikipedia.org/wiki/Go_(programming_language)">Go</a>, */
    public static final String GO = "go";

    /** <a href="https://wikipedia.org/wiki/Rust_(programming_language)">Rust</a> */
    public static final String RUST = "rust";

    private ProfileFrameTypeIncubatingValues() {}
  }

  private ProfileIncubatingAttributes() {}
}
