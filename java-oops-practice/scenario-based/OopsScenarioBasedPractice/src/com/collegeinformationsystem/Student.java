package com.collegeinformationsystem;

import java.util.ArrayList;

class Student extends Person implements ICourseActions {
	// Grades must be private (Encapsulation)
	private ArrayList<Integer> grades = new ArrayList<>();
	private ArrayList<Course> courses = new ArrayList<>();

	public Student(int id, String name, String email) {
		super(id, name, email);
	}

	// Add grade
	public void addGrade(int grade) {
		grades.add(grade);
	}

	// GPA Calculation using operators
	public double calculateGPA() {
		if (grades.isEmpty())
			return 0.0;

		int sum = 0;
		for (int g : grades) {
			sum += g;
		}
		return sum / (double) grades.size();
	}

	@Override
	public void enrollCourse(Course course) {
		courses.add(course);
		course.addStudent(this);
	}

	@Override
	public void dropCourse(Course course) {
		courses.remove(course);
		course.removeStudent(this);
	}

	// Polymorphic behavior
	@Override
	void printDetails() {
		System.out.println("Student ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("GPA: " + calculateGPA());
	}
}
