package com.minds3i.myjobrefer.models.request;

import java.util.Optional;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mjrRegistration")
public class MJReferRegestrationRequest extends MJRUserBasicInfo {

	private String username;
	private String firstName;
	private Optional<String> lastName;
	private Optional<String> secondName;
	private String email;
	private String password;
	private String customerType;
	private Optional<String> locale;
	private Optional<String> laguagePreference;
	private String mjrId;

	public MJReferRegestrationRequest() {
		super();
	}

	public MJReferRegestrationRequest(String username, String firstName, Optional<String> lastName,
			Optional<String> secondName, String email, String password, String customerType, Optional<String> locale,
			Optional<String> laguagePreference, String mjrId) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.secondName = secondName;
		this.email = email;
		this.password = password;
		this.customerType = customerType;
		this.locale = locale;
		this.laguagePreference = laguagePreference;
		this.mjrId = mjrId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Optional<String> getLastName() {
		return lastName;
	}

	public void setLastName(Optional<String> lastName) {
		this.lastName = lastName;
	}

	public Optional<String> getSecondName() {
		return secondName;
	}

	public void setSecondName(Optional<String> secondName) {
		this.secondName = secondName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Optional<String> getLocale() {
		return locale;
	}

	public void setLocale(Optional<String> locale) {
		this.locale = locale;
	}

	public Optional<String> getLaguagePreference() {
		return laguagePreference;
	}

	public void setLaguagePreference(Optional<String> laguagePreference) {
		this.laguagePreference = laguagePreference;
	}

	/**
	 * @return the mjrId
	 */
	public String getMjrId() {
		return mjrId;
	}

	/**
	 * @param mjrId the mjrId to set
	 */
	public void setMjrId(String mjrId) {
		this.mjrId = mjrId;
	}

	@Override
	public String toString() {
		return "MJReferRegestrationRequest [username=" + username + ", firstName=" + firstName + ", lastName="
				+ lastName + ", secondName=" + secondName + ", email=" + email + ", password=" + password
				+ ", customerType=" + customerType + ", locale=" + locale + ", laguagePreference=" + laguagePreference
				+ ", mjrId=" + mjrId + "]";
	}
	

}
