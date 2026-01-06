package com.personalizedlearningplatform;

public class Learner extends User implements ICertifiable {

	private double progress;

	public Learner(int userId, String name, String email, double progress) {
		super(userId, name, email);
		this.progress = progress;
	}

	public void viewProgress() {
		System.out.println("Progress : " + progress + "%");
	}

	// MUST exactly match interface method
	@Override
	public void generateCertificate() {
		if (progress >= 100) {
			System.out.println("Certificate Generated: Full-Time Course Completion Certificate");
		} else {
			System.out.println("Certificate Generated: Short Course Participation Certificate");
		}
	}
}
