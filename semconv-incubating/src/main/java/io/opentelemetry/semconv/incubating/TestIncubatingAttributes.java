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
public final class TestIncubatingAttributes {
  /**
   * The fully qualified human readable name of the <a
   * href="https://en.wikipedia.org/wiki/Test_case">test case</a>.
   */
  public static final AttributeKey<String> TEST_CASE_NAME = stringKey("test.case.name");

  /** The status of the actual test case result from test execution. */
  public static final AttributeKey<String> TEST_CASE_RESULT_STATUS =
      stringKey("test.case.result.status");

  /**
   * The human readable name of a <a href="https://en.wikipedia.org/wiki/Test_suite">test suite</a>.
   */
  public static final AttributeKey<String> TEST_SUITE_NAME = stringKey("test.suite.name");

  /** The status of the test suite run. */
  public static final AttributeKey<String> TEST_SUITE_RUN_STATUS =
      stringKey("test.suite.run.status");

  // Enum definitions
  /** Values for {@link #TEST_CASE_RESULT_STATUS}. */
  public static final class TestCaseResultStatusValues {
    /** pass */
    public static final String PASS = "pass";

    /** fail */
    public static final String FAIL = "fail";

    private TestCaseResultStatusValues() {}
  }

  // Enum definitions
  /** Values for {@link #TEST_SUITE_RUN_STATUS}. */
  public static final class TestSuiteRunStatusValues {
    /** success */
    public static final String SUCCESS = "success";

    /** failure */
    public static final String FAILURE = "failure";

    /** skipped */
    public static final String SKIPPED = "skipped";

    /** aborted */
    public static final String ABORTED = "aborted";

    /** timed_out */
    public static final String TIMED_OUT = "timed_out";

    /** in_progress */
    public static final String IN_PROGRESS = "in_progress";

    private TestSuiteRunStatusValues() {}
  }

  private TestIncubatingAttributes() {}
}
