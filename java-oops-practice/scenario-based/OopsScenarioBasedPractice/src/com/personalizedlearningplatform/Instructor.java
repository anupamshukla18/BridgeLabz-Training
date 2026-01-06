package com.personalizedlearningplatform;

public class Instructor extends User implements ICertifiable {
	private String expertise; // encapsulated

	// constructor
	public Instructor(int userId, String name, String email, String expertise) {
		super(userId, name, email);
		this.expertise = expertise;
	}

	// createQuiz method
	public void createQuiz() {
		System.out.println("Instructor created a quiz in " + expertise);
	}
	
	// Certificate for Instructor 
	@Override 
	public void generateCertificate() {
		System.out.println("Instructor Authorization Certificate Generated");
	}
}
