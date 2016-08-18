/**
 *
 */
package com.zephyrhealth.smartystreets;

import java.util.ArrayList;

import com.google.api.client.util.Key;
import com.zephyrhealth.smartystreets.api.InternationalCandidate;

/**
 * @author pmalla
 *
 */
public class InternationalLookup {

	private ArrayList<InternationalCandidate> result;

	private String inputId;

	@Key("country")
	private String country;

	@Key("geocode")
	private String geocode;

	@Key("language")
	private String language;

	@Key("freeform")
	private String freeform;

	@Key("address1")
	private String address1;

	@Key("address2")
	private String address2;

	@Key("address3")
	private String address3;

	@Key("address4")
	private String address4;

	@Key("organization")
	private String organization;

	@Key("locality")
	private String locality;

	@Key("administrative_area")
	private String administrativeArea;

	@Key("postal_code")
	private String postalCode;

	/**
	 * @return the inputId
	 */
	public String getInputId() {
		return inputId;
	}

	/**
	 * @param inputId
	 *            the inputId to set
	 */
	public void setInputId(String inputId) {
		this.inputId = inputId;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the geocode
	 */
	public String getGeocode() {
		return geocode;
	}

	/**
	 * @param geocode
	 *            the geocode to set
	 */
	public void setGeocode(String geocode) {
		this.geocode = geocode;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the freeform
	 */
	public String getFreeform() {
		return freeform;
	}

	/**
	 * @param freeform
	 *            the freeform to set
	 */
	public void setFreeform(String freeform) {
		this.freeform = freeform;
	}

	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1
	 *            the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2
	 *            the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * @return the address3
	 */
	public String getAddress3() {
		return address3;
	}

	/**
	 * @param address3
	 *            the address3 to set
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	/**
	 * @return the address4
	 */
	public String getAddress4() {
		return address4;
	}

	/**
	 * @param address4
	 *            the address4 to set
	 */
	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	/**
	 * @return the organization
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * @param organization
	 *            the organization to set
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	}

	/**
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * @param locality
	 *            the locality to set
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}

	/**
	 * @return the result
	 */
	public ArrayList<InternationalCandidate> getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(ArrayList<InternationalCandidate> result) {
		this.result = result;
	}

	public void addToResult(InternationalCandidate newCandidate) {
		this.result.add(newCandidate);
	}

	/**
	 * @return the administrativeArea
	 */
	public String getAdministrativeArea() {
		return administrativeArea;
	}

	/**
	 * @param administrativeArea
	 *            the administrativeArea to set
	 */
	public void setAdministrativeArea(String administrativeArea) {
		this.administrativeArea = administrativeArea;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode
	 *            the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
