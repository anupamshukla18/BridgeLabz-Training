package com.skillforageonlinelearningplatform;

class Student extends User implements ICertifiable {
	private int completedModules;
	private int totalModules;
	private double score;

	public Student(String name, String email) {
		super(name, email);
	}

	public void updateProgress(int completed, int total) {
		this.completedModules = completed;
		this.totalModules = total;
	}

	public void updateScore(double score) {
		this.score = score;
	}

	// Operator usage
	public double calculateProgress() {
		return (completedModules * 100.0) / totalModules;
	}

	@Override
	public void generateCertificate() {
		if (calculateProgress() == 100 && score >= 60) {
			System.out.println("Certificate Generated for Student: " + name);
		} else {
			System.out.println("Course not completed yet.");
		}
	}
}
