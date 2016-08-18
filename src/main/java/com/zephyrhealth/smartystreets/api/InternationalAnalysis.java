/**
 *
 */
package com.zephyrhealth.smartystreets.api;

import com.google.api.client.util.Key;

/**
 * @author pmalla
 *
 */
public class InternationalAnalysis {

	@Key("verification_status")
	private String verificationStatus;

	@Key("address_precision")
	private String addressPrecision;

	@Key("max_address_precision")
	private String maxAddressPrecision;

	/**
	 * @return the verificationStatus
	 */
	public String getVerificationStatus() {
		return verificationStatus;
	}

	/**
	 * @param verificationStatus
	 *            the verificationStatus to set
	 */
	public void setVerificationStatus(String verificationStatus) {
		this.verificationStatus = verificationStatus;
	}

	/**
	 * @return the addressPrecision
	 */
	public String getAddressPrecision() {
		return addressPrecision;
	}

	/**
	 * @param addressPrecision
	 *            the addressPrecision to set
	 */
	public void setAddressPrecision(String addressPrecision) {
		this.addressPrecision = addressPrecision;
	}

	/**
	 * @return the maxAddressPrecision
	 */
	public String getMaxAddressPrecision() {
		return maxAddressPrecision;
	}

	/**
	 * @param maxAddressPrecision
	 *            the maxAddressPrecision to set
	 */
	public void setMaxAddressPrecision(String maxAddressPrecision) {
		this.maxAddressPrecision = maxAddressPrecision;
	}
}
