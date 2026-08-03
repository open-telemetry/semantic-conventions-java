/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.gradle

/** Shared version constants used across build scripts and convention plugins. */
object OtelVersions {
    /**
     * The minimum opentelemetry-api version the semconv modules are built against. It is the
     * compileOnly baseline pinned in :dependencyManagement and the lower bound of the OSGi
     * Import-Package range emitted for io.opentelemetry.api.* by otel.java-conventions. Keep it as
     * the single source of truth for both.
     */
    const val OTEL_API_BASELINE = "1.33.0"

    /**
     * OSGi version range for io.opentelemetry.api.* imports: the baseline up to (but excluding) the
     * next major, e.g. "[1.33,2)". bnd can't infer this itself because the pinned opentelemetry-api
     * baseline isn't a bnd bundle, so we set it explicitly.
     */
    val OTEL_API_OSGI_RANGE: String
        get() {
            val floor = OTEL_API_BASELINE.substringBeforeLast('.') // e.g. 1.33
            val nextMajor = OTEL_API_BASELINE.substringBefore('.').toInt() + 1 // e.g. 2
            return "[$floor,$nextMajor)"
        }
}
