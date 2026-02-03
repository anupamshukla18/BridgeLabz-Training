package com.streamapi.insuranceclaim;

public class InsuranceClaim {

	private int claimId;
	private String claimType;
	private double claimAmount;

	public InsuranceClaim(int claimId, String claimType, double claimAmount) {
		this.claimId = claimId;
		this.claimType = claimType;
		this.claimAmount = claimAmount;
	}

	public int getClaimId() {
		return claimId;
	}

	public String getClaimType() {
		return claimType;
	}

	public double getClaimAmount() {
		return claimAmount;
	}
}
