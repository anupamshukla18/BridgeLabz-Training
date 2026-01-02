package com.universitysystem;

class Undergraduate extends Student {

	public Undergraduate(int id, String name) {
		super(id, name);
	}

	// GPA calculation specific to UG
	public void generateGPA(double marks1, double marks2, double marks3) {
		double total = marks1 + marks2 + marks3;
		calculateGPA(total, 3);
	}
}
