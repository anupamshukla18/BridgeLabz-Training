package com.inheritance.multilevelinheritance.problem2;

//Base Class
public class Course {

	// Attributes
	protected String courseName;
	protected int duration;

	// Parameterized Constructor
	public Course(String courseName, int duration) {
		this.courseName = courseName;
		this.duration = duration;
	}

	// Method to display course details
	void displayCourseDetails() {
		System.out.println("Course Name: " + courseName);
		System.out.println("Duration: " + duration + " months");
	}
}