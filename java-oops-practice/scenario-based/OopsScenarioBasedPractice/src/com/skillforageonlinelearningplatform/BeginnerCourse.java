package com.skillforageonlinelearningplatform;

class BeginnerCourse extends Course implements ICertifiable {
	public BeginnerCourse(String title, Instructor instructor) {
		super(title, instructor);
	}

	@Override
	public void generateCertificate() {
		System.out.println("Beginner Certificate Issued 🎓");
	}
}
