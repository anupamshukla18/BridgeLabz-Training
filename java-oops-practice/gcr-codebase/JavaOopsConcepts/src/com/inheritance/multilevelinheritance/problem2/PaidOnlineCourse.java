package com.inheritance.multilevelinheritance.problem2;

public class PaidOnlineCourse extends OnlineCourse {

	// Additional Attributes
	private double fee;
	private double discount;

	// Parameterized Constructor
	public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee,
			double discount) {
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}

	// Method to display paid course details
	void displayCourseDetails() {
		super.displayCourseDetails();
		System.out.println("Fee: " + fee);
		System.out.println("Discount: " + discount + "%");
		System.out.println("Final Price: " + (fee - (fee * discount / 100)));
	}
}