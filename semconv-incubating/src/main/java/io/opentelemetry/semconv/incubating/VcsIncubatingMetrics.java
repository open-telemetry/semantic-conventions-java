/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticMetrics.java.j2
@SuppressWarnings("unused")
public final class VcsIncubatingMetrics {

  /** Name of the {@code vcs.change.count} metric. */
  public static final String VCS_CHANGE_COUNT_NAME = "vcs.change.count";

  /** Unit of the {@code vcs.change.count} metric. */
  public static final String VCS_CHANGE_COUNT_UNIT = "{change}";

  /** Description of the {@code vcs.change.count} metric. */
  public static final String VCS_CHANGE_COUNT_DESCRIPTION =
      "The number of changes (pull requests/merge requests/changelists) in a repository, categorized by their state (e.g. open or merged).";

  /** Name of the {@code vcs.change.duration} metric. */
  public static final String VCS_CHANGE_DURATION_NAME = "vcs.change.duration";

  /** Unit of the {@code vcs.change.duration} metric. */
  public static final String VCS_CHANGE_DURATION_UNIT = "s";

  /** Description of the {@code vcs.change.duration} metric. */
  public static final String VCS_CHANGE_DURATION_DESCRIPTION =
      "The time duration a change (pull request/merge request/changelist) has been in a given state.";

  /** Name of the {@code vcs.change.time_to_approval} metric. */
  public static final String VCS_CHANGE_TIME_TO_APPROVAL_NAME = "vcs.change.time_to_approval";

  /** Unit of the {@code vcs.change.time_to_approval} metric. */
  public static final String VCS_CHANGE_TIME_TO_APPROVAL_UNIT = "s";

  /** Description of the {@code vcs.change.time_to_approval} metric. */
  public static final String VCS_CHANGE_TIME_TO_APPROVAL_DESCRIPTION =
      "The amount of time since its creation it took a change (pull request/merge request/changelist) to get the first approval.";

  /** Name of the {@code vcs.change.time_to_merge} metric. */
  public static final String VCS_CHANGE_TIME_TO_MERGE_NAME = "vcs.change.time_to_merge";

  /** Unit of the {@code vcs.change.time_to_merge} metric. */
  public static final String VCS_CHANGE_TIME_TO_MERGE_UNIT = "s";

  /** Description of the {@code vcs.change.time_to_merge} metric. */
  public static final String VCS_CHANGE_TIME_TO_MERGE_DESCRIPTION =
      "The amount of time since its creation it took a change (pull request/merge request/changelist) to get merged into the target(base) ref.";

  /** Name of the {@code vcs.contributor.count} metric. */
  public static final String VCS_CONTRIBUTOR_COUNT_NAME = "vcs.contributor.count";

  /** Unit of the {@code vcs.contributor.count} metric. */
  public static final String VCS_CONTRIBUTOR_COUNT_UNIT = "{contributor}";

  /** Description of the {@code vcs.contributor.count} metric. */
  public static final String VCS_CONTRIBUTOR_COUNT_DESCRIPTION =
      "The number of unique contributors to a repository.";

  /** Name of the {@code vcs.ref.count} metric. */
  public static final String VCS_REF_COUNT_NAME = "vcs.ref.count";

  /** Unit of the {@code vcs.ref.count} metric. */
  public static final String VCS_REF_COUNT_UNIT = "{ref}";

  /** Description of the {@code vcs.ref.count} metric. */
  public static final String VCS_REF_COUNT_DESCRIPTION =
      "The number of refs of type branch or tag in a repository.";

  /** Name of the {@code vcs.ref.lines_delta} metric. */
  public static final String VCS_REF_LINES_DELTA_NAME = "vcs.ref.lines_delta";

  /** Unit of the {@code vcs.ref.lines_delta} metric. */
  public static final String VCS_REF_LINES_DELTA_UNIT = "{line}";

  /** Description of the {@code vcs.ref.lines_delta} metric. */
  public static final String VCS_REF_LINES_DELTA_DESCRIPTION =
      "The number of lines added/removed in a ref (branch) relative to the ref from the `vcs.ref.base.name` attribute.";

  /** Name of the {@code vcs.ref.revisions_delta} metric. */
  public static final String VCS_REF_REVISIONS_DELTA_NAME = "vcs.ref.revisions_delta";

  /** Unit of the {@code vcs.ref.revisions_delta} metric. */
  public static final String VCS_REF_REVISIONS_DELTA_UNIT = "{revision}";

  /** Description of the {@code vcs.ref.revisions_delta} metric. */
  public static final String VCS_REF_REVISIONS_DELTA_DESCRIPTION =
      "The number of revisions (commits) a ref (branch) is ahead/behind the branch from the `vcs.ref.base.name` attribute.";

  /** Name of the {@code vcs.ref.time} metric. */
  public static final String VCS_REF_TIME_NAME = "vcs.ref.time";

  /** Unit of the {@code vcs.ref.time} metric. */
  public static final String VCS_REF_TIME_UNIT = "s";

  /** Description of the {@code vcs.ref.time} metric. */
  public static final String VCS_REF_TIME_DESCRIPTION =
      "Time a ref (branch) created from the default branch (trunk) has existed. The `ref.type` attribute will always be `branch`.";

  /** Name of the {@code vcs.repository.count} metric. */
  public static final String VCS_REPOSITORY_COUNT_NAME = "vcs.repository.count";

  /** Unit of the {@code vcs.repository.count} metric. */
  public static final String VCS_REPOSITORY_COUNT_UNIT = "{repository}";

  /** Description of the {@code vcs.repository.count} metric. */
  public static final String VCS_REPOSITORY_COUNT_DESCRIPTION =
      "The number of repositories in an organization.";

  private VcsIncubatingMetrics() {}
}
