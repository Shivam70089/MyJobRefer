package com.minds3i.myjobrefer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.minds3i.myjobrefer.models.request.MJRMultiUserCount;
import com.minds3i.myjobrefer.models.request.MJReferRegestrationRequest;
import com.minds3i.myjobrefer.service.impl.MJRUserDetailsServiceImpl;

@RestController
public class MyJobReferController {

	@Autowired
	private MJRUserDetailsServiceImpl mjrUserDetailsService;

	@GetMapping("/myJobRefer")
	public ResponseEntity<MJRMultiUserCount> getMyJobReferPage() {
		MJRMultiUserCount mjrMultiUserCount = mjrUserDetailsService.getMultiUserCount();
		return ResponseEntity.ok(mjrMultiUserCount);
	}

	@GetMapping("/myJobRefer/{mjrId}")
	public MJReferRegestrationRequest getUserDetailsByMjrId(@PathVariable("mjrId") String mjrId) {

		return mjrUserDetailsService.getUserDetailsByMjrId(mjrId);
	}

}
