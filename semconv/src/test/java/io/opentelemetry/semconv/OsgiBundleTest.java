/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.apache.felix.framework.Felix;
import org.junit.jupiter.api.Test;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;
import org.osgi.framework.launch.Framework;

class OsgiBundleTest {
  @Test
  void bundleIsActive() throws BundleException {
    Map<String, String> params = new HashMap<String, String>();
    params.put(Constants.FRAMEWORK_STORAGE, System.getProperty("felix.cache.dir"));

    Framework framework = new Felix(params);
    framework.init();
    framework.start();

    BundleContext context = framework.getBundleContext();
    File bundleFile = new File(System.getProperty("felix.bundle.path"));

    Bundle bundle = context.installBundle(bundleFile.toURI().toString());
    bundle.start();

    assertEquals(Bundle.ACTIVE, bundle.getState());
  }
}
