package com.geoLocation.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Merchant {

	private String countryIsoCode;
	private String countryName;
	private String subDivisionName;
	private String pinCode;
	private String subDivisionIsoCode;
	private String cityName;
	private Double latitude;
	private Double longitude;
	/**
	 * @return the countryIsoCode
	 */
	public String getCountryIsoCode() {
		return countryIsoCode;
	}
	/**
	 * @param countryIsoCode the countryIsoCode to set
	 */
	public void setCountryIsoCode(String countryIsoCode) {
		this.countryIsoCode = countryIsoCode;
	}
	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	/**
	 * @return the subDivisionName
	 */
	public String getSubDivisionName() {
		return subDivisionName;
	}
	/**
	 * @param subDivisionName the subDivisionName to set
	 */
	public void setSubDivisionName(String subDivisionName) {
		this.subDivisionName = subDivisionName;
	}
	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	/**
	 * @return the subDivisionIsoCode
	 */
	public String getSubDivisionIsoCode() {
		return subDivisionIsoCode;
	}
	/**
	 * @param subDivisionIsoCode the subDivisionIsoCode to set
	 */
	public void setSubDivisionIsoCode(String subDivisionIsoCode) {
		this.subDivisionIsoCode = subDivisionIsoCode;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	
}
