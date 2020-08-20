package com.minds3i.myjobrefer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.minds3i.myjobrefer.models.request.MJRUserProfile;
import com.minds3i.myjobrefer.security.service.MJRUserProfileService;

@RestController
public class MJRUserProfileController {

	@Autowired
	private MJRUserProfileService mjrUserProfileService;
	
	@PostMapping("/userProfile")
	public ResponseEntity<?> userProfile(@RequestBody MJRUserProfile userData)
			throws Exception {
		return ResponseEntity.ok(mjrUserProfileService.userProfile(userData));
	}
}
