/**
 *
 */
package com.zephyrhealth.smartystreets.api;

import com.google.api.client.util.Key;

/**
 * @author pmalla
 *
 */
public class InternationalComponent {
	@Key("country_iso_3")
	private String countryIso3;

	@Key("super_administrative_area")
	private String superAdministrativeArea;

	@Key("administrative_area")
	private String administrativeArea;

	@Key("sub_administrative_area")
	private String subAdministrativeArea;

	@Key("dependent_locality")
	private String dependentLocality;

	@Key("dependent_locality_name")
	private String dependentLocalityName;

	@Key("double_dependent_locality")
	private String doubleDependentLocality;

	@Key("locality")
	private String locality;

	@Key("postal_code")
	private String postalCode;

	@Key("postal_code_short")
	private String postalCodeShort;

	@Key("postal_code_extra")
	private String postalCodeExtra;

	@Key("premise")
	private String premise;

	@Key("premise_extra")
	private String premiseExtra;

	@Key("premise_number")
	private String premiseNumber;

	@Key("premise_type")
	private String premiseType;

	@Key("thoroughfare")
	private String thoroughfare;

	@Key("thoroughfare_predirection")
	private String thoroughfarePredirection;

	@Key("thoroughfare_postdirection")
	private String thoroughfarePostdirection;

	@Key("thoroughfare_name")
	private String thoroughfareName;

	@Key("thoroughfare_trailing_type")
	private String thoroughfareTrailingType;

	@Key("thoroughfare_type")
	private String thoroughfareType;

	@Key("dependent_thoroughfare")
	private String dependentThoroughfare;

	@Key("dependent_thoroughfare_predirection")
	private String dependentThoroughfarePredirection;

	@Key("dependent_thoroughfare_postdirection")
	private String dependentThoroughfarePostdirection;

	@Key("dependent_thoroughfare_name")
	private String dependentThoroughfareName;

	@Key("dependent_thoroughfare_trailing_type")
	private String dependentThoroughfareTrailing_type;

	@Key("dependent_thoroughfare_type")
	private String dependentThoroughfareType;

	@Key("building")
	private String building;

	@Key("building_leading_type")
	private String buildingLeadingType;

	@Key("building_name")
	private String buildingName;

	@Key("building_trailing_type")
	private String buildingTrailingType;

	@Key("sub_building_type")
	private String subBuildingType;

	@Key("sub_building_number")
	private String subBuildingNumber;

	@Key("sub_building_name")
	private String subBuildingName;

	@Key("sub_building")
	private String subBuilding;

	@Key("post_box")
	private String postBox;

	@Key("post_box_type")
	private String postBoxType;

	@Key("post_box_number")
	private String postBoxNumber;

	/**
	 * @return the countryIso3
	 */
	public String getCountryIso3() {
		return countryIso3;
	}

	/**
	 * @param countryIso3
	 *            the countryIso3 to set
	 */
	public void setCountryIso3(String countryIso3) {
		this.countryIso3 = countryIso3;
	}

	/**
	 * @return the superAdministrativeArea
	 */
	public String getSuperAdministrativeArea() {
		return superAdministrativeArea;
	}

	/**
	 * @param superAdministrativeArea
	 *            the superAdministrativeArea to set
	 */
	public void setSuperAdministrativeArea(String superAdministrativeArea) {
		this.superAdministrativeArea = superAdministrativeArea;
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
	 * @return the subAdministrativeArea
	 */
	public String getSubAdministrativeArea() {
		return subAdministrativeArea;
	}

	/**
	 * @param subAdministrativeArea
	 *            the subAdministrativeArea to set
	 */
	public void setSubAdministrativeArea(String subAdministrativeArea) {
		this.subAdministrativeArea = subAdministrativeArea;
	}

	/**
	 * @return the dependentLocality
	 */
	public String getDependentLocality() {
		return dependentLocality;
	}

	/**
	 * @param dependentLocality
	 *            the dependentLocality to set
	 */
	public void setDependentLocality(String dependentLocality) {
		this.dependentLocality = dependentLocality;
	}

	/**
	 * @return the dependentLocalityName
	 */
	public String getDependentLocalityName() {
		return dependentLocalityName;
	}

	/**
	 * @param dependentLocalityName
	 *            the dependentLocalityName to set
	 */
	public void setDependentLocalityName(String dependentLocalityName) {
		this.dependentLocalityName = dependentLocalityName;
	}

	/**
	 * @return the doubleDependentLocality
	 */
	public String getDoubleDependentLocality() {
		return doubleDependentLocality;
	}

	/**
	 * @param doubleDependentLocality
	 *            the doubleDependentLocality to set
	 */
	public void setDoubleDependentLocality(String doubleDependentLocality) {
		this.doubleDependentLocality = doubleDependentLocality;
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

	/**
	 * @return the postalCodeShort
	 */
	public String getPostalCodeShort() {
		return postalCodeShort;
	}

	/**
	 * @param postalCodeShort
	 *            the postalCodeShort to set
	 */
	public void setPostalCodeShort(String postalCodeShort) {
		this.postalCodeShort = postalCodeShort;
	}

	/**
	 * @return the postalCodeExtra
	 */
	public String getPostalCodeExtra() {
		return postalCodeExtra;
	}

	/**
	 * @param postalCodeExtra
	 *            the postalCodeExtra to set
	 */
	public void setPostalCodeExtra(String postalCodeExtra) {
		this.postalCodeExtra = postalCodeExtra;
	}

	/**
	 * @return the premise
	 */
	public String getPremise() {
		return premise;
	}

	/**
	 * @param premise
	 *            the premise to set
	 */
	public void setPremise(String premise) {
		this.premise = premise;
	}

	/**
	 * @return the premiseExtra
	 */
	public String getPremiseExtra() {
		return premiseExtra;
	}

	/**
	 * @param premiseExtra
	 *            the premiseExtra to set
	 */
	public void setPremiseExtra(String premiseExtra) {
		this.premiseExtra = premiseExtra;
	}

	/**
	 * @return the premiseNumber
	 */
	public String getPremiseNumber() {
		return premiseNumber;
	}

	/**
	 * @param premiseNumber
	 *            the premiseNumber to set
	 */
	public void setPremiseNumber(String premiseNumber) {
		this.premiseNumber = premiseNumber;
	}

	/**
	 * @return the premiseType
	 */
	public String getPremiseType() {
		return premiseType;
	}

	/**
	 * @param premiseType
	 *            the premiseType to set
	 */
	public void setPremiseType(String premiseType) {
		this.premiseType = premiseType;
	}

	/**
	 * @return the thoroughfare
	 */
	public String getThoroughfare() {
		return thoroughfare;
	}

	/**
	 * @param thoroughfare
	 *            the thoroughfare to set
	 */
	public void setThoroughfare(String thoroughfare) {
		this.thoroughfare = thoroughfare;
	}

	/**
	 * @return the thoroughfarePredirection
	 */
	public String getThoroughfarePredirection() {
		return thoroughfarePredirection;
	}

	/**
	 * @param thoroughfarePredirection
	 *            the thoroughfarePredirection to set
	 */
	public void setThoroughfarePredirection(String thoroughfarePredirection) {
		this.thoroughfarePredirection = thoroughfarePredirection;
	}

	/**
	 * @return the thoroughfarePostdirection
	 */
	public String getThoroughfarePostdirection() {
		return thoroughfarePostdirection;
	}

	/**
	 * @param thoroughfarePostdirection
	 *            the thoroughfarePostdirection to set
	 */
	public void setThoroughfarePostdirection(String thoroughfarePostdirection) {
		this.thoroughfarePostdirection = thoroughfarePostdirection;
	}

	/**
	 * @return the thoroughfareName
	 */
	public String getThoroughfareName() {
		return thoroughfareName;
	}

	/**
	 * @param thoroughfareName
	 *            the thoroughfareName to set
	 */
	public void setThoroughfareName(String thoroughfareName) {
		this.thoroughfareName = thoroughfareName;
	}

	/**
	 * @return the thoroughfareTrailingType
	 */
	public String getThoroughfareTrailingType() {
		return thoroughfareTrailingType;
	}

	/**
	 * @param thoroughfareTrailingType
	 *            the thoroughfareTrailingType to set
	 */
	public void setThoroughfareTrailingType(String thoroughfareTrailingType) {
		this.thoroughfareTrailingType = thoroughfareTrailingType;
	}

	/**
	 * @return the thoroughfareType
	 */
	public String getThoroughfareType() {
		return thoroughfareType;
	}

	/**
	 * @param thoroughfareType
	 *            the thoroughfareType to set
	 */
	public void setThoroughfareType(String thoroughfareType) {
		this.thoroughfareType = thoroughfareType;
	}

	/**
	 * @return the dependentThoroughfare
	 */
	public String getDependentThoroughfare() {
		return dependentThoroughfare;
	}

	/**
	 * @param dependentThoroughfare
	 *            the dependentThoroughfare to set
	 */
	public void setDependentThoroughfare(String dependentThoroughfare) {
		this.dependentThoroughfare = dependentThoroughfare;
	}

	/**
	 * @return the dependentThoroughfarePredirection
	 */
	public String getDependentThoroughfarePredirection() {
		return dependentThoroughfarePredirection;
	}

	/**
	 * @param dependentThoroughfarePredirection
	 *            the dependentThoroughfarePredirection to set
	 */
	public void setDependentThoroughfarePredirection(String dependentThoroughfarePredirection) {
		this.dependentThoroughfarePredirection = dependentThoroughfarePredirection;
	}

	/**
	 * @return the dependentThoroughfarePostdirection
	 */
	public String getDependentThoroughfarePostdirection() {
		return dependentThoroughfarePostdirection;
	}

	/**
	 * @param dependentThoroughfarePostdirection
	 *            the dependentThoroughfarePostdirection to set
	 */
	public void setDependentThoroughfarePostdirection(String dependentThoroughfarePostdirection) {
		this.dependentThoroughfarePostdirection = dependentThoroughfarePostdirection;
	}

	/**
	 * @return the dependentThoroughfareName
	 */
	public String getDependentThoroughfareName() {
		return dependentThoroughfareName;
	}

	/**
	 * @param dependentThoroughfareName
	 *            the dependentThoroughfareName to set
	 */
	public void setDependentThoroughfareName(String dependentThoroughfareName) {
		this.dependentThoroughfareName = dependentThoroughfareName;
	}

	/**
	 * @return the dependentThoroughfareTrailing_type
	 */
	public String getDependentThoroughfareTrailing_type() {
		return dependentThoroughfareTrailing_type;
	}

	/**
	 * @param dependentThoroughfareTrailing_type
	 *            the dependentThoroughfareTrailing_type to set
	 */
	public void setDependentThoroughfareTrailing_type(String dependentThoroughfareTrailing_type) {
		this.dependentThoroughfareTrailing_type = dependentThoroughfareTrailing_type;
	}

	/**
	 * @return the dependentThoroughfareType
	 */
	public String getDependentThoroughfareType() {
		return dependentThoroughfareType;
	}

	/**
	 * @param dependentThoroughfareType
	 *            the dependentThoroughfareType to set
	 */
	public void setDependentThoroughfareType(String dependentThoroughfareType) {
		this.dependentThoroughfareType = dependentThoroughfareType;
	}

	/**
	 * @return the building
	 */
	public String getBuilding() {
		return building;
	}

	/**
	 * @param building
	 *            the building to set
	 */
	public void setBuilding(String building) {
		this.building = building;
	}

	/**
	 * @return the buildingLeadingType
	 */
	public String getBuildingLeadingType() {
		return buildingLeadingType;
	}

	/**
	 * @param buildingLeadingType
	 *            the buildingLeadingType to set
	 */
	public void setBuildingLeadingType(String buildingLeadingType) {
		this.buildingLeadingType = buildingLeadingType;
	}

	/**
	 * @return the buildingName
	 */
	public String getBuildingName() {
		return buildingName;
	}

	/**
	 * @param buildingName
	 *            the buildingName to set
	 */
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	/**
	 * @return the buildingTrailingType
	 */
	public String getBuildingTrailingType() {
		return buildingTrailingType;
	}

	/**
	 * @param buildingTrailingType
	 *            the buildingTrailingType to set
	 */
	public void setBuildingTrailingType(String buildingTrailingType) {
		this.buildingTrailingType = buildingTrailingType;
	}

	/**
	 * @return the subBuildingType
	 */
	public String getSubBuildingType() {
		return subBuildingType;
	}

	/**
	 * @param subBuildingType
	 *            the subBuildingType to set
	 */
	public void setSubBuildingType(String subBuildingType) {
		this.subBuildingType = subBuildingType;
	}

	/**
	 * @return the subBuildingNumber
	 */
	public String getSubBuildingNumber() {
		return subBuildingNumber;
	}

	/**
	 * @param subBuildingNumber
	 *            the subBuildingNumber to set
	 */
	public void setSubBuildingNumber(String subBuildingNumber) {
		this.subBuildingNumber = subBuildingNumber;
	}

	/**
	 * @return the subBuildingName
	 */
	public String getSubBuildingName() {
		return subBuildingName;
	}

	/**
	 * @param subBuildingName
	 *            the subBuildingName to set
	 */
	public void setSubBuildingName(String subBuildingName) {
		this.subBuildingName = subBuildingName;
	}

	/**
	 * @return the subBuilding
	 */
	public String getSubBuilding() {
		return subBuilding;
	}

	/**
	 * @param subBuilding
	 *            the subBuilding to set
	 */
	public void setSubBuilding(String subBuilding) {
		this.subBuilding = subBuilding;
	}

	/**
	 * @return the postBox
	 */
	public String getPostBox() {
		return postBox;
	}

	/**
	 * @param postBox
	 *            the postBox to set
	 */
	public void setPostBox(String postBox) {
		this.postBox = postBox;
	}

	/**
	 * @return the postBoxType
	 */
	public String getPostBoxType() {
		return postBoxType;
	}

	/**
	 * @param postBoxType
	 *            the postBoxType to set
	 */
	public void setPostBoxType(String postBoxType) {
		this.postBoxType = postBoxType;
	}

	/**
	 * @return the postBoxNumber
	 */
	public String getPostBoxNumber() {
		return postBoxNumber;
	}

	/**
	 * @param postBoxNumber
	 *            the postBoxNumber to set
	 */
	public void setPostBoxNumber(String postBoxNumber) {
		this.postBoxNumber = postBoxNumber;
	}

}
