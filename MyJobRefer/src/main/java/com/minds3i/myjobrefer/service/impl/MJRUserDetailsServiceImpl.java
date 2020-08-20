package com.minds3i.myjobrefer.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.minds3i.myjobrefer.exception.UserNotFoundException;
import com.minds3i.myjobrefer.models.request.MJRMultiUserCount;
import com.minds3i.myjobrefer.models.request.MJReferRegestrationRequest;
import com.minds3i.myjobrefer.models.request.UserDetailsImpl;

@Service
public class MJRUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	MongoOperations mongoOperations;

	@Override
	public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {

		MJReferRegestrationRequest mjrRegisterReq;
		Query usernameQuery = Query.query(Criteria.where("username").is(username));
		Query emailQuery = Query.query(Criteria.where("email").is(username));
		if (mongoOperations.exists(usernameQuery, MJReferRegestrationRequest.class)) {
			mjrRegisterReq = mongoOperations.findOne(usernameQuery, MJReferRegestrationRequest.class);
		} else if (mongoOperations.exists(emailQuery, MJReferRegestrationRequest.class)) {
			mjrRegisterReq = mongoOperations.findOne(emailQuery, MJReferRegestrationRequest.class);
		} else {
			throw new UsernameNotFoundException("User Not Found with username: " + username);
		}

		return UserDetailsImpl.build(mjrRegisterReq);
	}

	public ResponseEntity<String> save(MJReferRegestrationRequest mjrRegisterReq) {
		Random randTimeMills = new Random(System.currentTimeMillis());
		ResponseEntity<String> regisError = validateUserRegistration(mjrRegisterReq);
		if (regisError != null) {
			return regisError;
		}
		mjrRegisterReq.setPassword(encoder.encode(mjrRegisterReq.getPassword()));
		String mjrId = getRandomRolebasedCustId(randTimeMills, mjrRegisterReq.getCustomerType());
		mjrRegisterReq.setMjrId(mjrId);
		mongoOperations.save(mjrRegisterReq, "mjrRegistration");
		return ResponseEntity.ok("User Registered successfully : " + mjrId);
	}

	private ResponseEntity<String> validateUserRegistration(MJReferRegestrationRequest mjrRegisterReq) {
		if (mongoOperations.exists(Query.query(Criteria.where("username").is(mjrRegisterReq.getUsername())),
				mjrRegisterReq.getClass())) {
			return ResponseEntity.badRequest().body("Error: Username is already taken!");
		}
		if (mongoOperations.exists(Query.query(Criteria.where("email").is(mjrRegisterReq.getEmail())),
				mjrRegisterReq.getClass())) {
			return ResponseEntity.badRequest().body("Error: Email is already in use!");
		}
		return null;
	}

	private String getRandomRolebasedCustId(Random randTimeMills, String mjrUserRole) {
		int randnumber = ((1 + randTimeMills.nextInt(2)) * 10000 + randTimeMills.nextInt(100000));
		String mjrId = "MJR" + mjrUserRole.toUpperCase().charAt(0) + randnumber;
		return mjrId;
	}

	public MJReferRegestrationRequest getUserDetailsByMjrId(String mjrId) {

		MJReferRegestrationRequest userDetails = null;
		userDetails = mongoOperations.findOne(Query.query(Criteria.where("mjrId").is(mjrId)),
				MJReferRegestrationRequest.class);
		if (userDetails == null) {
			throw new UserNotFoundException("MJRId:" + mjrId + "is not available");
		}
		return userDetails;
	}

	public MJRMultiUserCount getMultiUserCount() {
		MJRMultiUserCount mjrMultiUserCount = new MJRMultiUserCount();
		List<MJReferRegestrationRequest> mjrUserList = mongoOperations.findAll(MJReferRegestrationRequest.class);
		int mjrCandidateCount = (int) mjrUserList.stream()
				.filter(mjrUL -> mjrUL.getMjrId() != null && mjrUL.getMjrId().contains("MJRC")).count();
		int mjrHrCount = (int) mjrUserList.stream()
				.filter(mjrUL -> mjrUL.getMjrId() != null && mjrUL.getMjrId().contains("MJRH")).count();
		int mjrFreelancerCount = (int) mjrUserList.stream()
				.filter(mjrUL -> mjrUL.getMjrId() != null && mjrUL.getMjrId().contains("MJRF")).count();
		int mjrAdminCount = (int) mjrUserList.stream()
				.filter(mjrUL -> mjrUL.getMjrId() != null && mjrUL.getMjrId().contains("MJRA")).count();

		mjrMultiUserCount.setMjrCandidateCount(mjrCandidateCount);
		mjrMultiUserCount.setMjrFreelancerCount(mjrFreelancerCount);
		mjrMultiUserCount.setMjrHrCount(mjrHrCount);
		mjrMultiUserCount.setMjrAdminCount(mjrAdminCount);

		return mjrMultiUserCount;

	}

}
