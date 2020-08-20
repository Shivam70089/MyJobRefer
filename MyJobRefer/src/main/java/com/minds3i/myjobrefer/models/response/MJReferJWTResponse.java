package com.minds3i.myjobrefer.models.response;

import java.io.Serializable;

public class MJReferJWTResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8302262446472703641L;

	private final String authorisation;

	private String mjrId;

	private boolean isAuthenticated;

	public MJReferJWTResponse(String authorisation, String mjrId, boolean isAuthenticated) {
		super();
		this.authorisation = authorisation;
		this.mjrId = mjrId;
		this.isAuthenticated = isAuthenticated;
	}

	public String getMjrId() {
		return mjrId;
	}

	public void setMjrId(String mjrId) {
		this.mjrId = mjrId;
	}

	public boolean isAuthenticated() {
		return isAuthenticated;
	}

	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}

	public String getAuthorisation() {
		return authorisation;
	}

}
