/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.gradle

import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property

abstract class OtelJavaExtension {
    abstract val moduleName: Property<String>

    /** Whether to generate OSGi bundle metadata. Enabled by default. */
    abstract val osgiEnabled: Property<Boolean>

    /** Extra packages imported as optional (resolution:=optional), e.g. compileOnly deps. */
    abstract val osgiOptionalPackages: ListProperty<String>
}
