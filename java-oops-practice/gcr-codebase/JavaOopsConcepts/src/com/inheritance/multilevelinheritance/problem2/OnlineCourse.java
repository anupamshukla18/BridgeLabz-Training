package com.inheritance.multilevelinheritance.problem2;

public class OnlineCourse extends Course {
	// Additional Attributes
	protected String platform;
	protected boolean isRecorded;

	// Parameterized Constructor
	public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
		super(courseName, duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}

	// Method to display online course details
	void displayCourseDetails() {
		super.displayCourseDetails();
		System.out.println("Platform: " + platform);
		System.out.println("Recorded: " + isRecorded);
	}
}