package com.universitysystem;

class Student {
	protected int studentId;
	protected String name;

	// GPA is sensitive
	private double gpa;

	// Constructor without elective
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	// Constructor with elective preference
	public Student(int studentId, String name, String elective) {
		this(studentId, name);
		System.out.println("Elective chosen: " + elective);
	}

	// GPA calculation using operators
	protected void calculateGPA(double totalPoints, int subjects) {
		this.gpa = totalPoints / subjects; // +, / operators
	}

	// Public access to transcript
	public void viewTranscript() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Name       : " + name);
		System.out.println("GPA        : " + gpa);
	}
}
