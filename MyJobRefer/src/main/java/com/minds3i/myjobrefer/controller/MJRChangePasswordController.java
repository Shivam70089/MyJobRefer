package com.minds3i.myjobrefer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.minds3i.myjobrefer.models.request.MJRChangePassword;
import com.minds3i.myjobrefer.security.service.MJRChangePasswordService;

@RestController
public class MJRChangePasswordController {

	@Autowired
	private MJRChangePasswordService mjrChangePasswordService;
	
	@PatchMapping("/changePassword")
	public ResponseEntity<?> changePassword(@RequestBody MJRChangePassword credentials)
			throws Exception {
		return ResponseEntity.ok(mjrChangePasswordService.changePassword(credentials));
	}
}
