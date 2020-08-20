package com.minds3i.myjobrefer.models.request;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailsImpl implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 739365849652359830L;

	private String username;

	private String email;

	@JsonIgnore
	private String password;

//	private Collection<? extends GrantedAuthority> authorities;

	private String customerType;

	private String mjrId;

	public UserDetailsImpl() {
		super();
	}

	public UserDetailsImpl(String username, String email, String password, String customerType, String mjrId) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.customerType = customerType;
		this.mjrId = mjrId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getMjrId() {
		return mjrId;
	}

	public void setMjrId(String mjrId) {
		this.mjrId = mjrId;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public static UserDetailsImpl build(MJReferRegestrationRequest mjrRegisterReq) {

		return new UserDetailsImpl(mjrRegisterReq.getUsername(), mjrRegisterReq.getEmail(),
				mjrRegisterReq.getPassword(), mjrRegisterReq.getCustomerType(), mjrRegisterReq.getMjrId());
	}

}
