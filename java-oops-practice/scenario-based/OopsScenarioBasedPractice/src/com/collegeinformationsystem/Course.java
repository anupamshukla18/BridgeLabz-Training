package com.collegeinformationsystem;

import java.util.ArrayList;

class Course {
	private String courseName;
	private Faculty faculty;
	private ArrayList<Student> students = new ArrayList<>();

	// Constructor
	public Course(String courseName, Faculty faculty) {
		this.courseName = courseName;
		this.faculty = faculty;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void removeStudent(Student student) {
		students.remove(student);
	}

	public void showCourseDetails() {
		System.out.println("\nCourse: " + courseName);
		System.out.println("Faculty: " + faculty.name);
		System.out.println("Enrolled Students: " + students.size());
	}
}
