/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.booleanKey;
import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringArrayKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class ProcessIncubatingAttributes {
  /**
   * Length of the process.command_args array
   *
   * <p>Notes:
   *
   * <p>This field can be useful for querying or performing bucket analysis on how many arguments
   * were provided to start a process. More arguments may be an indication of suspicious activity.
   */
  public static final AttributeKey<Long> PROCESS_ARGS_COUNT = longKey("process.args_count");

  /**
   * The command used to launch the process (i.e. the command name). On Linux based systems, can be
   * set to the zeroth string in {@code proc/[pid]/cmdline}. On Windows, can be set to the first
   * parameter extracted from {@code GetCommandLineW}.
   */
  public static final AttributeKey<String> PROCESS_COMMAND = stringKey("process.command");

  /**
   * All the command arguments (including the command/executable itself) as received by the process.
   * On Linux-based systems (and some other Unixoid systems supporting procfs), can be set according
   * to the list of null-delimited strings extracted from {@code proc/[pid]/cmdline}. For libc-based
   * executables, this would be the full argv vector passed to {@code main}. SHOULD NOT be collected
   * by default unless there is sanitization that excludes sensitive data.
   */
  public static final AttributeKey<List<String>> PROCESS_COMMAND_ARGS =
      stringArrayKey("process.command_args");

  /**
   * The full command used to launch the process as a single string representing the full command.
   * On Windows, can be set to the result of {@code GetCommandLineW}. Do not set this if you have to
   * assemble it just for monitoring; use {@code process.command_args} instead. SHOULD NOT be
   * collected by default unless there is sanitization that excludes sensitive data.
   */
  public static final AttributeKey<String> PROCESS_COMMAND_LINE = stringKey("process.command_line");

  /** Specifies whether the context switches for this data point were voluntary or involuntary. */
  public static final AttributeKey<String> PROCESS_CONTEXT_SWITCH_TYPE =
      stringKey("process.context_switch_type");

  /**
   * Deprecated, use {@code cpu.mode} instead.
   *
   * @deprecated Replaced by {@code cpu.mode}.
   */
  @Deprecated
  public static final AttributeKey<String> PROCESS_CPU_STATE = stringKey("process.cpu.state");

  /** The date and time the process was created, in ISO 8601 format. */
  public static final AttributeKey<String> PROCESS_CREATION_TIME =
      stringKey("process.creation.time");

  /**
   * Process environment variables, <key> being the environment variable name, the value being the
   * environment variable value.
   *
   * <p>Notes:
   *
   * <p>Examples:
   *
   * <ul>
   *   <li>an environment variable {@code USER} with value {@code "ubuntu"} SHOULD be recorded as
   *       the {@code process.environment_variable.USER} attribute with value {@code "ubuntu"}.
   *   <li>an environment variable {@code PATH} with value {@code "/usr/local/bin:/usr/bin"} SHOULD
   *       be recorded as the {@code process.environment_variable.PATH} attribute with value {@code
   *       "/usr/local/bin:/usr/bin"}.
   * </ul>
   */
  public static final AttributeKeyTemplate<String> PROCESS_ENVIRONMENT_VARIABLE =
      stringKeyTemplate("process.environment_variable");

  /** The GNU build ID as found in the {@code .note.gnu.build-id} ELF section (hex string). */
  public static final AttributeKey<String> PROCESS_EXECUTABLE_BUILD_ID_GNU =
      stringKey("process.executable.build_id.gnu");

  /** The Go build ID as retrieved by {@code go tool buildid <go executable>}. */
  public static final AttributeKey<String> PROCESS_EXECUTABLE_BUILD_ID_GO =
      stringKey("process.executable.build_id.go");

  /**
   * Profiling specific build ID for executables. See the OTel specification for Profiles for more
   * information.
   */
  public static final AttributeKey<String> PROCESS_EXECUTABLE_BUILD_ID_HTLHASH =
      stringKey("process.executable.build_id.htlhash");

  /**
   * "Deprecated, use {@code process.executable.build_id.htlhash} instead."
   *
   * @deprecated Replaced by {@code process.executable.build_id.htlhash}.
   */
  @Deprecated
  public static final AttributeKey<String> PROCESS_EXECUTABLE_BUILD_ID_PROFILING =
      stringKey("process.executable.build_id.profiling");

  /**
   * The name of the process executable. On Linux based systems, this SHOULD be set to the base name
   * of the target of {@code /proc/[pid]/exe}. On Windows, this SHOULD be set to the base name of
   * {@code GetProcessImageFileNameW}.
   */
  public static final AttributeKey<String> PROCESS_EXECUTABLE_NAME =
      stringKey("process.executable.name");

  /**
   * The full path to the process executable. On Linux based systems, can be set to the target of
   * {@code proc/[pid]/exe}. On Windows, can be set to the result of {@code
   * GetProcessImageFileNameW}.
   */
  public static final AttributeKey<String> PROCESS_EXECUTABLE_PATH =
      stringKey("process.executable.path");

  /** The exit code of the process. */
  public static final AttributeKey<Long> PROCESS_EXIT_CODE = longKey("process.exit.code");

  /** The date and time the process exited, in ISO 8601 format. */
  public static final AttributeKey<String> PROCESS_EXIT_TIME = stringKey("process.exit.time");

  /**
   * The PID of the process's group leader. This is also the process group ID (PGID) of the process.
   */
  public static final AttributeKey<Long> PROCESS_GROUP_LEADER_PID =
      longKey("process.group_leader.pid");

  /** Whether the process is connected to an interactive shell. */
  public static final AttributeKey<Boolean> PROCESS_INTERACTIVE = booleanKey("process.interactive");

  /**
   * The control group associated with the process.
   *
   * <p>Notes:
   *
   * <p>Control groups (cgroups) are a kernel feature used to organize and manage process resources.
   * This attribute provides the path(s) to the cgroup(s) associated with the process, which should
   * match the contents of the <a
   * href="https://man7.org/linux/man-pages/man7/cgroups.7.html">/proc/[PID]/cgroup</a> file.
   */
  public static final AttributeKey<String> PROCESS_LINUX_CGROUP = stringKey("process.linux.cgroup");

  /** The username of the user that owns the process. */
  public static final AttributeKey<String> PROCESS_OWNER = stringKey("process.owner");

  /**
   * The type of page fault for this data point. Type {@code major} is for major/hard page faults,
   * and {@code minor} is for minor/soft page faults.
   */
  public static final AttributeKey<String> PROCESS_PAGING_FAULT_TYPE =
      stringKey("process.paging.fault_type");

  /** Parent Process identifier (PPID). */
  public static final AttributeKey<Long> PROCESS_PARENT_PID = longKey("process.parent_pid");

  /** Process identifier (PID). */
  public static final AttributeKey<Long> PROCESS_PID = longKey("process.pid");

  /** The real user ID (RUID) of the process. */
  public static final AttributeKey<Long> PROCESS_REAL_USER_ID = longKey("process.real_user.id");

  /** The username of the real user of the process. */
  public static final AttributeKey<String> PROCESS_REAL_USER_NAME =
      stringKey("process.real_user.name");

  /**
   * An additional description about the runtime of the process, for example a specific vendor
   * customization of the runtime environment.
   */
  public static final AttributeKey<String> PROCESS_RUNTIME_DESCRIPTION =
      stringKey("process.runtime.description");

  /** The name of the runtime of this process. */
  public static final AttributeKey<String> PROCESS_RUNTIME_NAME = stringKey("process.runtime.name");

  /**
   * The version of the runtime of this process, as returned by the runtime without modification.
   */
  public static final AttributeKey<String> PROCESS_RUNTIME_VERSION =
      stringKey("process.runtime.version");

  /** The saved user ID (SUID) of the process. */
  public static final AttributeKey<Long> PROCESS_SAVED_USER_ID = longKey("process.saved_user.id");

  /** The username of the saved user. */
  public static final AttributeKey<String> PROCESS_SAVED_USER_NAME =
      stringKey("process.saved_user.name");

  /** The PID of the process's session leader. This is also the session ID (SID) of the process. */
  public static final AttributeKey<Long> PROCESS_SESSION_LEADER_PID =
      longKey("process.session_leader.pid");

  /**
   * Process title (proctitle)
   *
   * <p>Notes:
   *
   * <p>In many Unix-like systems, process title (proctitle), is the string that represents the name
   * or command line of a running process, displayed by system monitoring tools like ps, top, and
   * htop.
   */
  public static final AttributeKey<String> PROCESS_TITLE = stringKey("process.title");

  /** The effective user ID (EUID) of the process. */
  public static final AttributeKey<Long> PROCESS_USER_ID = longKey("process.user.id");

  /** The username of the effective user of the process. */
  public static final AttributeKey<String> PROCESS_USER_NAME = stringKey("process.user.name");

  /**
   * Virtual process identifier.
   *
   * <p>Notes:
   *
   * <p>The process ID within a PID namespace. This is not necessarily unique across all processes
   * on the host but it is unique within the process namespace that the process exists within.
   */
  public static final AttributeKey<Long> PROCESS_VPID = longKey("process.vpid");

  /** The working directory of the process. */
  public static final AttributeKey<String> PROCESS_WORKING_DIRECTORY =
      stringKey("process.working_directory");

  // Enum definitions

  /** Values for {@link #PROCESS_CONTEXT_SWITCH_TYPE}. */
  public static final class ProcessContextSwitchTypeIncubatingValues {
    /** voluntary. */
    public static final String VOLUNTARY = "voluntary";

    /** involuntary. */
    public static final String INVOLUNTARY = "involuntary";

    private ProcessContextSwitchTypeIncubatingValues() {}
  }

  /**
   * Values for {@link #PROCESS_CPU_STATE}
   *
   * @deprecated Replaced by {@code cpu.mode}.
   */
  @Deprecated
  public static final class ProcessCpuStateIncubatingValues {
    /** system. */
    public static final String SYSTEM = "system";

    /** user. */
    public static final String USER = "user";

    /** wait. */
    public static final String WAIT = "wait";

    private ProcessCpuStateIncubatingValues() {}
  }

  /** Values for {@link #PROCESS_PAGING_FAULT_TYPE}. */
  public static final class ProcessPagingFaultTypeIncubatingValues {
    /** major. */
    public static final String MAJOR = "major";

    /** minor. */
    public static final String MINOR = "minor";

    private ProcessPagingFaultTypeIncubatingValues() {}
  }

  private ProcessIncubatingAttributes() {}
}
