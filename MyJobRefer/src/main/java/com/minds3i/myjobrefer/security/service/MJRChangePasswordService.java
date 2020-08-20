package com.minds3i.myjobrefer.security.service;

import org.springframework.http.ResponseEntity;

import com.minds3i.myjobrefer.models.request.MJRChangePassword;

public interface MJRChangePasswordService {

	public ResponseEntity<?> changePassword(MJRChangePassword credentials);
}
