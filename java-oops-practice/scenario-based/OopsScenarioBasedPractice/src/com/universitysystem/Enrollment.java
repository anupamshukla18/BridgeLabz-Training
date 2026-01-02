package com.universitysystem;

class Enrollment implements Graded {
	private Student student;
	private Course course;
	private String grade; // secured grade data

	public Enrollment(Student student, Course course) {
		this.student = student;
		this.course = course;
	}
 
	@Override
	public void assignGrade(String grade) {
		this.grade = grade;
		System.out.println("Grade " + grade + " assigned for " + course.getCourseName());
	}

	public void showEnrollmentDetails() {
		System.out.println("Course : " + course.getCourseName());
		System.out.println("Grade  : " + grade);
	}
}
