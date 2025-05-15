/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.doubleKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/registry/incubating_java/IncubatingSemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class GeoIncubatingAttributes {
  /** Two-letter code representing continent’s name. */
  public static final AttributeKey<String> GEO_CONTINENT_CODE = stringKey("geo.continent.code");

  /**
   * Two-letter ISO Country Code (<a href="https://wikipedia.org/wiki/ISO_3166-1#Codes">ISO 3166-1
   * alpha2</a>).
   */
  public static final AttributeKey<String> GEO_COUNTRY_ISO_CODE = stringKey("geo.country.iso_code");

  /** Locality name. Represents the name of a city, town, village, or similar populated place. */
  public static final AttributeKey<String> GEO_LOCALITY_NAME = stringKey("geo.locality.name");

  /**
   * Latitude of the geo location in <a
   * href="https://wikipedia.org/wiki/World_Geodetic_System#WGS84">WGS84</a>.
   */
  public static final AttributeKey<Double> GEO_LOCATION_LAT = doubleKey("geo.location.lat");

  /**
   * Longitude of the geo location in <a
   * href="https://wikipedia.org/wiki/World_Geodetic_System#WGS84">WGS84</a>.
   */
  public static final AttributeKey<Double> GEO_LOCATION_LON = doubleKey("geo.location.lon");

  /**
   * Postal code associated with the location. Values appropriate for this field may also be known
   * as a postcode or ZIP code and will vary widely from country to country.
   */
  public static final AttributeKey<String> GEO_POSTAL_CODE = stringKey("geo.postal_code");

  /** Region ISO code (<a href="https://wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>). */
  public static final AttributeKey<String> GEO_REGION_ISO_CODE = stringKey("geo.region.iso_code");

  // Enum definitions

  /** Values for {@link #GEO_CONTINENT_CODE}. */
  public static final class GeoContinentCodeIncubatingValues {
    /** Africa */
    public static final String AF = "AF";

    /** Antarctica */
    public static final String AN = "AN";

    /** Asia */
    public static final String AS = "AS";

    /** Europe */
    public static final String EU = "EU";

    /** North America */
    public static final String NA = "NA";

    /** Oceania */
    public static final String OC = "OC";

    /** South America */
    public static final String SA = "SA";

    private GeoContinentCodeIncubatingValues() {}
  }

  private GeoIncubatingAttributes() {}
}
