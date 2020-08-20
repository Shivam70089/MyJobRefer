package com.minds3i.myjobrefer.models.request;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mjrUsers")
public class MJRLoginRequest {

	private String username;

	private String password;

	public MJRLoginRequest() {
		super();
	}

	public MJRLoginRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MJRLoginRequest [username=" + username + ", password=" + password + "]";
	}
	
}
