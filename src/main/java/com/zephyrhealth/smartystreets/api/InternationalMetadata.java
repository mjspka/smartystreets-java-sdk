/**
 *
 */
package com.zephyrhealth.smartystreets.api;

import com.google.api.client.util.Key;

/**
 * @author pmalla
 *
 */
public class InternationalMetadata {
	@Key("latitude")
	private double latitude;

	@Key("longitude")
	private double longitude;

	@Key("geocode_precision")
	private String geocodePrecision;

	@Key("maxGeocodePrecision")
	private String max_geocode_precision;

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the geocodePrecision
	 */
	public String getGeocodePrecision() {
		return geocodePrecision;
	}

	/**
	 * @param geocodePrecision
	 *            the geocodePrecision to set
	 */
	public void setGeocodePrecision(String geocodePrecision) {
		this.geocodePrecision = geocodePrecision;
	}

	/**
	 * @return the max_geocode_precision
	 */
	public String getMax_geocode_precision() {
		return max_geocode_precision;
	}

	/**
	 * @param max_geocode_precision
	 *            the max_geocode_precision to set
	 */
	public void setMax_geocode_precision(String max_geocode_precision) {
		this.max_geocode_precision = max_geocode_precision;
	}

}
