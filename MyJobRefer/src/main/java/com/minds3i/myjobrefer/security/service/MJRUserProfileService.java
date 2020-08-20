package com.minds3i.myjobrefer.security.service;

import org.springframework.http.ResponseEntity;

import com.minds3i.myjobrefer.models.request.MJRUserProfile;

public interface MJRUserProfileService {

	public ResponseEntity<?> userProfile(MJRUserProfile userData);
}
