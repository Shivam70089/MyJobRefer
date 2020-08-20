package com.minds3i.myjobrefer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.minds3i.myjobrefer.exception.PasswordNotFoundException;
import com.minds3i.myjobrefer.models.request.MJRChangePassword;
import com.minds3i.myjobrefer.models.request.MJReferRegestrationRequest;
import com.minds3i.myjobrefer.security.service.MJRChangePasswordService;

@Service
public class MJRChangePasswordServiceImpl implements MJRChangePasswordService {

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	MongoOperations mongoOperations;

	@Override
	public ResponseEntity<?> changePassword(MJRChangePassword credentials) {
		Query mongoQuery = new Query();
		Update fieldUpdate = new Update();
		MJReferRegestrationRequest mjrRegisterReq = retrieveUserOnValidation(credentials);
		if (mjrRegisterReq == null) {
			throw new UsernameNotFoundException("User Not Found with : " + credentials.getUsername());
		}

		if (encoder.matches(credentials.getPassword(), mjrRegisterReq.getPassword())) {
			Criteria emailOrUsername = new Criteria().orOperator(Criteria.where("mjrId").is(credentials.getUsername()),
					Criteria.where("email").is(credentials.getUsername()),
					Criteria.where("username").is(credentials.getUsername()));
			mongoQuery.addCriteria(emailOrUsername);
			fieldUpdate.set("password", encoder.encode(credentials.getNewPassword()));
			mongoOperations.updateFirst(mongoQuery, fieldUpdate, mjrRegisterReq.getClass());
		} else {
			throw new PasswordNotFoundException("Please enter correct old password.");
		}

		return ResponseEntity.ok("Password Changed successfully");
	}

	private MJReferRegestrationRequest retrieveUserOnValidation(MJRChangePassword credentials) {
		MJReferRegestrationRequest mjrRegisterReq = null;
		Query usernameQuery = Query.query(Criteria.where("username").is(credentials.getUsername()));
		Query emailQuery = Query.query(Criteria.where("email").is(credentials.getUsername()));
		if (mongoOperations.exists(usernameQuery, MJReferRegestrationRequest.class)) {
			return mongoOperations.findOne(usernameQuery, MJReferRegestrationRequest.class);
		} else if (mongoOperations.exists(emailQuery, MJReferRegestrationRequest.class)) {
			return mongoOperations.findOne(emailQuery, MJReferRegestrationRequest.class);
		}
		return mjrRegisterReq;
	}
}
