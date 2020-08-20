package com.minds3i.myjobrefer.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.minds3i.myjobrefer.models.request.MJRLoginRequest;
import com.minds3i.myjobrefer.models.request.MJReferRegestrationRequest;
import com.minds3i.myjobrefer.models.request.UserDetailsImpl;
import com.minds3i.myjobrefer.models.response.MJReferJWTResponse;
import com.minds3i.myjobrefer.security.jwt.MJR_JWTokenService;
import com.minds3i.myjobrefer.service.impl.MJRUserDetailsServiceImpl;

@RestController
public class MJR_RegistrationLoginController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private MJRUserDetailsServiceImpl mjrUserDetailsService;

	@Autowired
	private MJR_JWTokenService mjrJWTokenUtil;
	
	@PostMapping("/mjrUserRegister")
	public ResponseEntity<?> saveUser(@RequestBody MJReferRegestrationRequest mjrUserRegister) throws Exception {
		return ResponseEntity.ok(mjrUserDetailsService.save(mjrUserRegister));
	}

	@PostMapping("/mjrUserLogin")
	public ResponseEntity<MJReferJWTResponse> createJsonWebAuthToken(@RequestBody MJRLoginRequest loginCredentials)
			throws Exception {
		Authentication authentication;
		try {
			authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					loginCredentials.getUsername(), loginCredentials.getPassword(), new ArrayList<>()));
		} catch (BadCredentialsException e) {
			throw new Exception("Please provide valid username and password", e);
		}
		final UserDetailsImpl userDetails = mjrUserDetailsService.loadUserByUsername(authentication.getName());
		final String jwt = mjrJWTokenUtil.generateToken(userDetails);
		return ResponseEntity.ok(new MJReferJWTResponse(jwt, userDetails.getMjrId(), authentication.isAuthenticated()));
	}

}
