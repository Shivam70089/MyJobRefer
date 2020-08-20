package com.minds3i.myjobrefer.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.minds3i.myjobrefer.exception.UserDetailsNotFoundException;
import com.minds3i.myjobrefer.models.request.MJRUserProfile;
import com.minds3i.myjobrefer.security.service.MJRUserProfileService;

@Service
public class MJRUserProfileServiceImpl implements MJRUserProfileService {
	
	@Autowired
	MongoOperations mongoOperations;

	@Override
	public ResponseEntity<?> userProfile(MJRUserProfile userData) {

		Query mongoQuery = new Query();
		Update fieldUpdate = new Update();
		Query emailQuery = Query.query(Criteria.where("emailId").is(userData.getEmailId()));
		
		try {
			if (mongoOperations.exists(emailQuery, MJRUserProfile.class)) {
				mongoQuery.addCriteria(Criteria.where("emailId").is(userData.getEmailId()));
				fieldUpdate.set("username", userData.getUsername());
				fieldUpdate.set("expertiesDomain", userData.getExpertiesDomain());
				fieldUpdate.set("languagePreference", userData.getLanguagePreference());
				fieldUpdate.set("locale", userData.getLocale());
				fieldUpdate.set("contactNumber", userData.getContactNumber());
				fieldUpdate.set("totalExperience", userData.getTotalExperience());
				fieldUpdate.set("relevantExperience", userData.getRelevantExperience());
				fieldUpdate.set("currentRole", userData.getCurrentRole());
				fieldUpdate.set("currentCompany", userData.getCurrentCompany());
				fieldUpdate.set("currentCompanySince", userData.getCurrentCompanySince());
				fieldUpdate.set("address", userData.getAddress());
				fieldUpdate.set("preferenceJobLocation", userData.getPreferenceJobLocation());
				fieldUpdate.set("preferenceJobCompanies", userData.getPreferenceJobCompanies());
				fieldUpdate.set("skypeId", userData.getSkypeId());
				fieldUpdate.set("currentProjectDetails", userData.getCurrentProjectDetails());
				fieldUpdate.set("currentRoleInProject", userData.getCurrentRoleInProject());
				fieldUpdate.set("primarySkill", userData.getPrimarySkill());
				fieldUpdate.set("secondarySkill", userData.getSecondarySkill());
				fieldUpdate.set("languageKnown1", userData.getLanguageKnown1());
				fieldUpdate.set("languageKnown2", userData.getLanguageKnown2());
				fieldUpdate.set("languageKnown3", userData.getLanguageKnown3());
				fieldUpdate.set("currentSalary", userData.getCurrentSalary());
				mongoOperations.updateMulti(mongoQuery, fieldUpdate, userData.getClass());
			} else {
				mongoOperations.save(userData, "mjrUserProfile");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserDetailsNotFoundException("Please enter all details required.");
		}

		return ResponseEntity.ok("User Profile Updated");
	}
}
