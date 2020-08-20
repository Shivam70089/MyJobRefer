package com.minds3i.myjobrefer.models.request;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mjrPassword")
public class MJRChangePassword {

	private String username;

	private String password;

	private String newPassword;

	public MJRChangePassword() {
		super();
	}

	public MJRChangePassword(String username, String password, String newPassword) {
		super();
		this.username = username;
		this.password = password;
		this.newPassword = newPassword;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	@Override
	public String toString() {
		return "MJRChangePassword [username=" + username + ", password=" + password + ", newPassword=" + newPassword + "]";
	}

}
