package com.minds3i.myjobrefer.models.request;


import java.util.Date;
import java.util.Optional;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mjrUserProfile")
public class MJRUserProfile {

	private String username;
	private String customerType;	
	private String emailId;	
	private String expertiesDomain;
	private String languagePreference;	
	private String locale;	
	private String dateOfBirth;	
	private String firstName;	
	private Optional<String> middleName;
	private Optional<String> lastName;	
	private Optional<String> profilePhoto;	
	private String contactNumber;	
	private int totalExperience;	
	private int relevantExperience;	
	private String currentRole;	
	private String currentCompany;	
	private String currentCompanySince;	
	private String graduationUniversity;	
	private String graduationCollege;	
	private int graduationYearFrom;	
	private int graduationYearTo;	
	private String graduationMajor;	
	private String graduationState;	
	private Optional<String> postGraduationUniversity;	
	private Optional<String> postGraduationCollege;	
	private Optional<String> postGraduationYearFrom;	
	private Optional<String> postGraduationYearTo;	
	private Optional<String> postGraduationMajor;	
	private Optional<String> postGraduationState;	
	private String address;	
	private Optional<String> resume;	
	private String preferenceJobLocation;	
	private Optional<String> preferenceJobCompanies;	
	private Optional<String> skypeId;	
	private String currentProjectDetails;	
	private String currentRoleInProject;	
	private String primarySkill;	
	private Optional<String> secondarySkill;	
	private String languageKnown1;	
	private Optional<String> languageKnown2;	
	private Optional<String> languageKnown3;	
	private String currentSalary;	
	private String gender;
	
	public MJRUserProfile() {
		super();
	}

	public MJRUserProfile(String username, String customerType, String emailId, String expertiesDomain,
			String languagePreference, String locale, String dateOfBirth, String firstName, Optional<String> middleName,
			Optional<String> lastName, Optional<String> profilePhoto, String contactNumber, int totalExperience,
			int relevantExperience, String currentRole, String currentCompany, String currentCompanySince,
			String graduationUniversity, String graduationCollege, int graduationYearFrom, int graduationYearTo,
			String graduationMajor, String graduationState, Optional<String> postGraduationUniversity,
			Optional<String> postGraduationCollege, Optional<String> postGraduationYearFrom,
			Optional<String> postGraduationYearTo, Optional<String> postGraduationMajor,
			Optional<String> postGraduationState, String address, Optional<String> resume, String preferenceJobLocation,
			Optional<String> preferenceJobCompanies, Optional<String> skypeId, String currentProjectDetails,
			String currentRoleInProject, String primarySkill, Optional<String> secondarySkill, String languageKnown1,
			Optional<String> languageKnown2, Optional<String> languageKnown3, String currentSalary, String gender) {
		super();
		this.username = username;
		this.customerType = customerType;
		this.emailId = emailId;
		this.expertiesDomain = expertiesDomain;
		this.languagePreference = languagePreference;
		this.locale = locale;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.profilePhoto = profilePhoto;
		this.contactNumber = contactNumber;
		this.totalExperience = totalExperience;
		this.relevantExperience = relevantExperience;
		this.currentRole = currentRole;
		this.currentCompany = currentCompany;
		this.currentCompanySince = currentCompanySince;
		this.graduationUniversity = graduationUniversity;
		this.graduationCollege = graduationCollege;
		this.graduationYearFrom = graduationYearFrom;
		this.graduationYearTo = graduationYearTo;
		this.graduationMajor = graduationMajor;
		this.graduationState = graduationState;
		this.postGraduationUniversity = postGraduationUniversity;
		this.postGraduationCollege = postGraduationCollege;
		this.postGraduationYearFrom = postGraduationYearFrom;
		this.postGraduationYearTo = postGraduationYearTo;
		this.postGraduationMajor = postGraduationMajor;
		this.postGraduationState = postGraduationState;
		this.address = address;
		this.resume = resume;
		this.preferenceJobLocation = preferenceJobLocation;
		this.preferenceJobCompanies = preferenceJobCompanies;
		this.skypeId = skypeId;
		this.currentProjectDetails = currentProjectDetails;
		this.currentRoleInProject = currentRoleInProject;
		this.primarySkill = primarySkill;
		this.secondarySkill = secondarySkill;
		this.languageKnown1 = languageKnown1;
		this.languageKnown2 = languageKnown2;
		this.languageKnown3 = languageKnown3;
		this.currentSalary = currentSalary;
		this.gender = gender;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the customerType
	 */
	public String getCustomerType() {
		return customerType;
	}

	/**
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the expertiesDomain
	 */
	public String getExpertiesDomain() {
		return expertiesDomain;
	}

	/**
	 * @param expertiesDomain the expertiesDomain to set
	 */
	public void setExpertiesDomain(String expertiesDomain) {
		this.expertiesDomain = expertiesDomain;
	}

	/**
	 * @return the languagePreference
	 */
	public String getLanguagePreference() {
		return languagePreference;
	}

	/**
	 * @param languagePreference the languagePreference to set
	 */
	public void setLanguagePreference(String languagePreference) {
		this.languagePreference = languagePreference;
	}

	/**
	 * @return the locale
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * @param locale the locale to set
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public Optional<String> getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(Optional<String> middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public Optional<String> getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(Optional<String> lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the profilePhoto
	 */
	public Optional<String> getProfilePhoto() {
		return profilePhoto;
	}

	/**
	 * @param profilePhoto the profilePhoto to set
	 */
	public void setProfilePhoto(Optional<String> profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the totalExperience
	 */
	public int getTotalExperience() {
		return totalExperience;
	}

	/**
	 * @param totalExperience the totalExperience to set
	 */
	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}

	/**
	 * @return the relevantExperience
	 */
	public int getRelevantExperience() {
		return relevantExperience;
	}

	/**
	 * @param relevantExperience the relevantExperience to set
	 */
	public void setRelevantExperience(int relevantExperience) {
		this.relevantExperience = relevantExperience;
	}

	/**
	 * @return the currentRole
	 */
	public String getCurrentRole() {
		return currentRole;
	}

	/**
	 * @param currentRole the currentRole to set
	 */
	public void setCurrentRole(String currentRole) {
		this.currentRole = currentRole;
	}

	/**
	 * @return the currentCompany
	 */
	public String getCurrentCompany() {
		return currentCompany;
	}

	/**
	 * @param currentCompany the currentCompany to set
	 */
	public void setCurrentCompany(String currentCompany) {
		this.currentCompany = currentCompany;
	}

	/**
	 * @return the currentCompanySince
	 */
	public String getCurrentCompanySince() {
		return currentCompanySince;
	}

	/**
	 * @param currentCompanySince the currentCompanySince to set
	 */
	public void setCurrentCompanySince(String currentCompanySince) {
		this.currentCompanySince = currentCompanySince;
	}

	/**
	 * @return the graduationUniversity
	 */
	public String getGraduationUniversity() {
		return graduationUniversity;
	}

	/**
	 * @param graduationUniversity the graduationUniversity to set
	 */
	public void setGraduationUniversity(String graduationUniversity) {
		this.graduationUniversity = graduationUniversity;
	}

	/**
	 * @return the graduationCollege
	 */
	public String getGraduationCollege() {
		return graduationCollege;
	}

	/**
	 * @param graduationCollege the graduationCollege to set
	 */
	public void setGraduationCollege(String graduationCollege) {
		this.graduationCollege = graduationCollege;
	}

	/**
	 * @return the graduationYearFrom
	 */
	public int getGraduationYearFrom() {
		return graduationYearFrom;
	}

	/**
	 * @param graduationYearFrom the graduationYearFrom to set
	 */
	public void setGraduationYearFrom(int graduationYearFrom) {
		this.graduationYearFrom = graduationYearFrom;
	}

	/**
	 * @return the graduationYearTo
	 */
	public int getGraduationYearTo() {
		return graduationYearTo;
	}

	/**
	 * @param graduationYearTo the graduationYearTo to set
	 */
	public void setGraduationYearTo(int graduationYearTo) {
		this.graduationYearTo = graduationYearTo;
	}

	/**
	 * @return the graduationMajor
	 */
	public String getGraduationMajor() {
		return graduationMajor;
	}

	/**
	 * @param graduationMajor the graduationMajor to set
	 */
	public void setGraduationMajor(String graduationMajor) {
		this.graduationMajor = graduationMajor;
	}

	/**
	 * @return the graduationState
	 */
	public String getGraduationState() {
		return graduationState;
	}

	/**
	 * @param graduationState the graduationState to set
	 */
	public void setGraduationState(String graduationState) {
		this.graduationState = graduationState;
	}

	/**
	 * @return the postGraduationUniversity
	 */
	public Optional<String> getPostGraduationUniversity() {
		return postGraduationUniversity;
	}

	/**
	 * @param postGraduationUniversity the postGraduationUniversity to set
	 */
	public void setPostGraduationUniversity(Optional<String> postGraduationUniversity) {
		this.postGraduationUniversity = postGraduationUniversity;
	}

	/**
	 * @return the postGraduationCollege
	 */
	public Optional<String> getPostGraduationCollege() {
		return postGraduationCollege;
	}

	/**
	 * @param postGraduationCollege the postGraduationCollege to set
	 */
	public void setPostGraduationCollege(Optional<String> postGraduationCollege) {
		this.postGraduationCollege = postGraduationCollege;
	}

	/**
	 * @return the postGraduationYearFrom
	 */
	public Optional<String> getPostGraduationYearFrom() {
		return postGraduationYearFrom;
	}

	/**
	 * @param postGraduationYearFrom the postGraduationYearFrom to set
	 */
	public void setPostGraduationYearFrom(Optional<String> postGraduationYearFrom) {
		this.postGraduationYearFrom = postGraduationYearFrom;
	}

	/**
	 * @return the postGraduationYearTo
	 */
	public Optional<String> getPostGraduationYearTo() {
		return postGraduationYearTo;
	}

	/**
	 * @param postGraduationYearTo the postGraduationYearTo to set
	 */
	public void setPostGraduationYearTo(Optional<String> postGraduationYearTo) {
		this.postGraduationYearTo = postGraduationYearTo;
	}

	/**
	 * @return the postGraduationMajor
	 */
	public Optional<String> getPostGraduationMajor() {
		return postGraduationMajor;
	}

	/**
	 * @param postGraduationMajor the postGraduationMajor to set
	 */
	public void setPostGraduationMajor(Optional<String> postGraduationMajor) {
		this.postGraduationMajor = postGraduationMajor;
	}

	/**
	 * @return the postGraduationState
	 */
	public Optional<String> getPostGraduationState() {
		return postGraduationState;
	}

	/**
	 * @param postGraduationState the postGraduationState to set
	 */
	public void setPostGraduationState(Optional<String> postGraduationState) {
		this.postGraduationState = postGraduationState;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the resume
	 */
	public Optional<String> getResume() {
		return resume;
	}

	/**
	 * @param resume the resume to set
	 */
	public void setResume(Optional<String> resume) {
		this.resume = resume;
	}

	/**
	 * @return the preferenceJobLocation
	 */
	public String getPreferenceJobLocation() {
		return preferenceJobLocation;
	}

	/**
	 * @param preferenceJobLocation the preferenceJobLocation to set
	 */
	public void setPreferenceJobLocation(String preferenceJobLocation) {
		this.preferenceJobLocation = preferenceJobLocation;
	}

	/**
	 * @return the preferenceJobCompanies
	 */
	public Optional<String> getPreferenceJobCompanies() {
		return preferenceJobCompanies;
	}

	/**
	 * @param preferenceJobCompanies the preferenceJobCompanies to set
	 */
	public void setPreferenceJobCompanies(Optional<String> preferenceJobCompanies) {
		this.preferenceJobCompanies = preferenceJobCompanies;
	}

	/**
	 * @return the skypeId
	 */
	public Optional<String> getSkypeId() {
		return skypeId;
	}

	/**
	 * @param skypeId the skypeId to set
	 */
	public void setSkypeId(Optional<String> skypeId) {
		this.skypeId = skypeId;
	}

	/**
	 * @return the currentProjectDetails
	 */
	public String getCurrentProjectDetails() {
		return currentProjectDetails;
	}

	/**
	 * @param currentProjectDetails the currentProjectDetails to set
	 */
	public void setCurrentProjectDetails(String currentProjectDetails) {
		this.currentProjectDetails = currentProjectDetails;
	}

	/**
	 * @return the currentRoleInProject
	 */
	public String getCurrentRoleInProject() {
		return currentRoleInProject;
	}

	/**
	 * @param currentRoleInProject the currentRoleInProject to set
	 */
	public void setCurrentRoleInProject(String currentRoleInProject) {
		this.currentRoleInProject = currentRoleInProject;
	}

	/**
	 * @return the primarySkill
	 */
	public String getPrimarySkill() {
		return primarySkill;
	}

	/**
	 * @param primarySkill the primarySkill to set
	 */
	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	/**
	 * @return the secondarySkill
	 */
	public Optional<String> getSecondarySkill() {
		return secondarySkill;
	}

	/**
	 * @param secondarySkill the secondarySkill to set
	 */
	public void setSecondarySkill(Optional<String> secondarySkill) {
		this.secondarySkill = secondarySkill;
	}

	/**
	 * @return the languageKnown1
	 */
	public String getLanguageKnown1() {
		return languageKnown1;
	}

	/**
	 * @param languageKnown1 the languageKnown1 to set
	 */
	public void setLanguageKnown1(String languageKnown1) {
		this.languageKnown1 = languageKnown1;
	}

	/**
	 * @return the languageKnown2
	 */
	public Optional<String> getLanguageKnown2() {
		return languageKnown2;
	}

	/**
	 * @param languageKnown2 the languageKnown2 to set
	 */
	public void setLanguageKnown2(Optional<String> languageKnown2) {
		this.languageKnown2 = languageKnown2;
	}

	/**
	 * @return the languageKnown3
	 */
	public Optional<String> getLanguageKnown3() {
		return languageKnown3;
	}

	/**
	 * @param languageKnown3 the languageKnown3 to set
	 */
	public void setLanguageKnown3(Optional<String> languageKnown3) {
		this.languageKnown3 = languageKnown3;
	}

	/**
	 * @return the currentSalary
	 */
	public String getCurrentSalary() {
		return currentSalary;
	}

	/**
	 * @param currentSalary the currentSalary to set
	 */
	public void setCurrentSalary(String currentSalary) {
		this.currentSalary = currentSalary;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "MJRUserProfie [username=" + username + ", customerType=" + customerType + ", emailId=" + emailId
				+ ", expertiesDomain=" + expertiesDomain + ", languagePreference=" + languagePreference + ", locale="
				+ locale + ", dateOfBirth=" + dateOfBirth + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", profilePhoto=" + profilePhoto + ", contactNumber=" + contactNumber
				+ ", totalExperience=" + totalExperience + ", relevantExperience=" + relevantExperience
				+ ", currentRole=" + currentRole + ", currentCompany=" + currentCompany + ", currentCompanySince="
				+ currentCompanySince + ", graduationUniversity=" + graduationUniversity + ", graduationCollege="
				+ graduationCollege + ", graduationYearFrom=" + graduationYearFrom + ", graduationYearTo="
				+ graduationYearTo + ", graduationMajor=" + graduationMajor + ", graduationState=" + graduationState
				+ ", postGraduationUniversity=" + postGraduationUniversity + ", postGraduationCollege="
				+ postGraduationCollege + ", postGraduationYearFrom=" + postGraduationYearFrom
				+ ", postGraduationYearTo=" + postGraduationYearTo + ", postGraduationMajor=" + postGraduationMajor
				+ ", postGraduationState=" + postGraduationState + ", address=" + address + ", resume=" + resume
				+ ", preferenceJobLocation=" + preferenceJobLocation + ", preferenceJobCompanies="
				+ preferenceJobCompanies + ", skypeId=" + skypeId + ", currentProjectDetails=" + currentProjectDetails
				+ ", currentRoleInProject=" + currentRoleInProject + ", primarySkill=" + primarySkill
				+ ", secondarySkill=" + secondarySkill + ", languageKnown1=" + languageKnown1 + ", languageKnown2="
				+ languageKnown2 + ", languageKnown3=" + languageKnown3 + ", currentSalary=" + currentSalary
				+ ", gender=" + gender + "]";
	}
}
