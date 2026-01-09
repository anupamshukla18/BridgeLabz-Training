package com.skillforageonlinelearningplatform;

class Course {
	private String title;
	private Instructor instructor;
	private double rating; // encapsulated
	private String[] modules;
	private final String[] reviews; // read-only internal reviews

	// Default modules constructor
	public Course(String title, Instructor instructor) {
		this(title, instructor, new String[] { "Intro", "Basics", "Advanced" });
	}

	// Custom modules constructor
	public Course(String title, Instructor instructor, String[] modules) {
		this.title = title;
		this.instructor = instructor;
		this.modules = modules;
		this.reviews = new String[] { "Great content", "Well structured" };
	}

	// Protected rating logic
	protected void updateRating(double newRating) {
		rating = (rating + newRating) / 2; // operator usage
	}

	public double getRating() {
		return rating;
	}

	public String[] getReviews() {
		return reviews.clone(); // read-only exposure
	}

	public int getTotalModules() {
		return modules.length;
	}
}
