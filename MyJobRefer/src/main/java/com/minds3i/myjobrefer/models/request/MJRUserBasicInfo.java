package com.minds3i.myjobrefer.models.request;

import java.util.Date;
import java.util.Optional;

public class MJRUserBasicInfo {

	private Optional<String> userLoginType;
	private Optional<String> geoCordination;
	private Optional<String> deviceUsedToLogin;
	private Optional<String> macAddress;
	private Optional<String> browserUsed;
	private Optional<String> osVersion;
	private Date lastSignInTimestamp;
	private Date lastTimePasswordChanged;

	public MJRUserBasicInfo() {
		super();
	}

	public MJRUserBasicInfo(Optional<String> userLoginType, Optional<String> geoCordination, Optional<String> deviceUsedToLogin,
			Optional<String> macAddress, Optional<String> browserUsed, Optional<String> osVersion, 
			Date lastSignInTimestamp, Date lastTimePasswordChanged) {
		super();
		this.userLoginType = userLoginType;
		this.geoCordination = geoCordination;
		this.deviceUsedToLogin = deviceUsedToLogin;
		this.macAddress = macAddress;
		this.browserUsed = browserUsed;
		this.osVersion = osVersion;
		this.lastSignInTimestamp = lastSignInTimestamp;
		this.lastTimePasswordChanged = lastTimePasswordChanged;
	}

	public Optional<String> getUserLoginType() {
		return userLoginType;
	}

	public void setUserLoginType(Optional<String> userLoginType) {
		this.userLoginType = userLoginType;
	}

	public Optional<String> getGeoCordination() {
		return geoCordination;
	}

	public void setGeoCordination(Optional<String> geoCordination) {
		this.geoCordination = geoCordination;
	}

	public Optional<String> getDeviceUsedToLogin() {
		return deviceUsedToLogin;
	}

	public void setDeviceUsedToLogin(Optional<String> deviceUsedToLogin) {
		this.deviceUsedToLogin = deviceUsedToLogin;
	}

	public Optional<String> getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(Optional<String> macAddress) {
		this.macAddress = macAddress;
	}

	public Optional<String> getBrowserUsed() {
		return browserUsed;
	}

	public void setBrowserUsed(Optional<String> browserUsed) {
		this.browserUsed = browserUsed;
	}

	public Optional<String> getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(Optional<String> osVersion) {
		this.osVersion = osVersion;
	}

	public Date getLastSignInTimestamp() {
		return lastSignInTimestamp;
	}

	public void setLastSignInTimestamp(Date lastSignInTimestamp) {
		this.lastSignInTimestamp = lastSignInTimestamp;
	}

	public Date getLastTimePasswordChanged() {
		return lastTimePasswordChanged;
	}

	public void setLastTimePasswordChanged(Date lastTimePasswordChanged) {
		this.lastTimePasswordChanged = lastTimePasswordChanged;
	}

}
