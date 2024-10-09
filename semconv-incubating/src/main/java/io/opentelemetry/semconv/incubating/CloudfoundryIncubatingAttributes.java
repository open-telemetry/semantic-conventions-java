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
public final class CloudfoundryIncubatingAttributes {
  /**
   * The guid of the application.
   *
   * <p>Notes:
   *
   * <p>Application instrumentation should use the value from environment variable {@code
   * VCAP_APPLICATION.application_id}. This is the same value as reported by {@code cf app
   * <app-name> --guid}.
   */
  public static final AttributeKey<String> CLOUDFOUNDRY_APP_ID = stringKey("cloudfoundry.app.id");

  /**
   * The index of the application instance. 0 when just one instance is active.
   *
   * <p>Notes:
   *
   * <p>CloudFoundry defines the {@code instance_id} in the <a
   * href="https://github.com/cloudfoundry/loggregator-api#v2-envelope">Loggegator v2 envelope</a>.
   * It is used for logs and metrics emitted by CloudFoundry. It is supposed to contain the
   * application instance index for applications deployed on the runtime.
   *
   * <p>Application instrumentation should use the value from environment variable {@code
   * CF_INSTANCE_INDEX}.
   */
  public static final AttributeKey<String> CLOUDFOUNDRY_APP_INSTANCE_ID =
      stringKey("cloudfoundry.app.instance.id");

  /**
   * The name of the application.
   *
   * <p>Notes:
   *
   * <p>Application instrumentation should use the value from environment variable {@code
   * VCAP_APPLICATION.application_name}. This is the same value as reported by {@code cf apps}.
   */
  public static final AttributeKey<String> CLOUDFOUNDRY_APP_NAME =
      stringKey("cloudfoundry.app.name");

  /**
   * The guid of the CloudFoundry org the application is running in.
   *
   * <p>Notes:
   *
   * <p>Application instrumentation should use the value from environment variable {@code
   * VCAP_APPLICATION.org_id}. This is the same value as reported by {@code cf org <org-name>
   * --guid}.
   */
  public static final AttributeKey<String> CLOUDFOUNDRY_ORG_ID = stringKey("cloudfoundry.org.id");

  /**
   * The name of the CloudFoundry organization the app is running in.
   *
   * <p>Notes:
   *
   * <p>Application instrumentation should use the value from environment variable {@code
   * VCAP_APPLICATION.org_name}. This is the same value as reported by {@code cf orgs}.
   */
  public static final AttributeKey<String> CLOUDFOUNDRY_ORG_NAME =
      stringKey("cloudfoundry.org.name");

  /**
   * The UID identifying the process.
   *
   * <p>Notes:
   *
   * <p>Application instrumentation should use the value from environment variable {@code
   * VCAP_APPLICATION.process_id}. It is supposed to be equal to {@code VCAP_APPLICATION.app_id} for
   * applications deployed to the runtime. For system components, this could be the actual PID.
   */
  public static final AttributeKey<String> CLOUDFOUNDRY_PROCESS_ID =
      stringKey("cloudfoundry.process.id");

  /**
   * The type of process.
   *
   * <p>Notes:
   *
   * <p>CloudFoundry applications can consist of multiple jobs. Usually the main process will be of
   * type {@code web}. There can be additional background tasks or side-cars with different process
   * types.
   */
  public static final AttributeKey<String> CLOUDFOUNDRY_PROCESS_TYPE =
      stringKey("cloudfoundry.process.type");

  /**
   * The guid of the CloudFoundry space the application is running in.
   *
   * <p>Notes:
   *
   * <p>Application instrumentation should use the value from environment variable {@code
   * VCAP_APPLICATION.space_id}. This is the same value as reported by {@code cf space <space-name>
   * --guid}.
   */
  public static final AttributeKey<String> CLOUDFOUNDRY_SPACE_ID =
      stringKey("cloudfoundry.space.id");

  /**
   * The name of the CloudFoundry space the application is running in.
   *
   * <p>Notes:
   *
   * <p>Application instrumentation should use the value from environment variable {@code
   * VCAP_APPLICATION.space_name}. This is the same value as reported by {@code cf spaces}.
   */
  public static final AttributeKey<String> CLOUDFOUNDRY_SPACE_NAME =
      stringKey("cloudfoundry.space.name");

  /**
   * A guid or another name describing the event source.
   *
   * <p>Notes:
   *
   * <p>CloudFoundry defines the {@code source_id} in the <a
   * href="https://github.com/cloudfoundry/loggregator-api#v2-envelope">Loggregator v2 envelope</a>.
   * It is used for logs and metrics emitted by CloudFoundry. It is supposed to contain the
   * component name, e.g. "gorouter", for CloudFoundry components.
   *
   * <p>When system components are instrumented, values from the <a
   * href="https://bosh.io/docs/jobs/#properties-spec">Bosh spec</a> should be used. The {@code
   * system.id} should be set to {@code spec.deployment/spec.name}.
   */
  public static final AttributeKey<String> CLOUDFOUNDRY_SYSTEM_ID =
      stringKey("cloudfoundry.system.id");

  /**
   * A guid describing the concrete instance of the event source.
   *
   * <p>Notes:
   *
   * <p>CloudFoundry defines the {@code instance_id} in the <a
   * href="https://github.com/cloudfoundry/loggregator-api#v2-envelope">Loggregator v2 envelope</a>.
   * It is used for logs and metrics emitted by CloudFoundry. It is supposed to contain the vm id
   * for CloudFoundry components.
   *
   * <p>When system components are instrumented, values from the <a
   * href="https://bosh.io/docs/jobs/#properties-spec">Bosh spec</a> should be used. The {@code
   * system.instance.id} should be set to {@code spec.id}.
   */
  public static final AttributeKey<String> CLOUDFOUNDRY_SYSTEM_INSTANCE_ID =
      stringKey("cloudfoundry.system.instance.id");

  // Enum definitions

  private CloudfoundryIncubatingAttributes() {}
}
