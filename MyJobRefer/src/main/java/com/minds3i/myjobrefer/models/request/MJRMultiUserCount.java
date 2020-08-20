package com.minds3i.myjobrefer.models.request;

import java.io.Serializable;

public class MJRMultiUserCount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2741512405245452098L;

	private int mjrHrCount;

	private int mjrCandidateCount;

	private int mjrFreelancerCount;

	private int mjrAdminCount;

	public MJRMultiUserCount() {
		super();
	}

	public MJRMultiUserCount(int mjrHrCount, int mjrCandidateCount, int mjrFreelancerCount, int mjrAdminCount) {
		super();
		this.mjrHrCount = mjrHrCount;
		this.mjrCandidateCount = mjrCandidateCount;
		this.mjrFreelancerCount = mjrFreelancerCount;
		this.mjrAdminCount = mjrAdminCount;
	}

	public int getMjrHrCount() {
		return mjrHrCount;
	}

	public void setMjrHrCount(int mjrHrCount) {
		this.mjrHrCount = mjrHrCount;
	}

	public int getMjrCandidateCount() {
		return mjrCandidateCount;
	}

	public void setMjrCandidateCount(int mjrCandidateCount) {
		this.mjrCandidateCount = mjrCandidateCount;
	}

	public int getMjrFreelancerCount() {
		return mjrFreelancerCount;
	}

	public void setMjrFreelancerCount(int mjrFreelancerCount) {
		this.mjrFreelancerCount = mjrFreelancerCount;
	}

	public int getMjrAdminCount() {
		return mjrAdminCount;
	}

	public void setMjrAdminCount(int mjrAdminCount) {
		this.mjrAdminCount = mjrAdminCount;
	}

	@Override
	public String toString() {
		return "MJRMultiUserCount [mjrHrCount=" + mjrHrCount + ", mjrCandidateCount=" + mjrCandidateCount
				+ ", mjrFreelancerCount=" + mjrFreelancerCount + ", mjrCandidateCount=" + mjrCandidateCount +"]";
	}

}
