package com.universitysystem;

public class UniversityApplication {
	public static void main(String[] args) {
		// Students
		Student ug = new Undergraduate(101, "Anupam");
		Student pg = new Postgraduate(201, "Anuj", "AI");

		// Courses
		Course java = new Course("CS101", "Java Programming");
		Course ml = new Course("CS501", "Machine Learning");

		// Enrollment
		Enrollment e1 = new Enrollment(ug, java);
		Enrollment e2 = new Enrollment(pg, ml);

		// Faculty
		Faculty faculty = new Faculty("Dr. Sharma");

		// Assign grades (Polymorphism)
		faculty.gradeStudent(e1, "A"); // Letter grading
		faculty.gradeStudent(e2, "PASS"); // Pass/Fail grading

		System.out.println();

		// GPA calculation
		((Undergraduate) ug).generateGPA(8.0, 7.5, 9.0);
		((Postgraduate) pg).generateGPA(8.5, 9.0);

		// Display transcripts
		ug.viewTranscript();
		e1.showEnrollmentDetails();

		System.out.println();

		pg.viewTranscript();
		e2.showEnrollmentDetails();
	}
}
