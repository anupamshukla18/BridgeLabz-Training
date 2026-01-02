package com.universitysystem;

class Postgraduate extends Student {
	public Postgraduate(int id, String name, String elective) {
		super(id, name, elective);
	}

	// GPA calculation specific to PG
	public void generateGPA(double marks1, double marks2) {
		double total = marks1 + marks2;
		calculateGPA(total, 2);
	}
}
