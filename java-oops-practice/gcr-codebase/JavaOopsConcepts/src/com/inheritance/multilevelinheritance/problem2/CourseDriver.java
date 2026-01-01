package com.inheritance.multilevelinheritance.problem2;

public class CourseDriver {
	public static void main(String[] args) {

		PaidOnlineCourse course = new PaidOnlineCourse("Java Full Stack", 6, "Zoom", true, 50000, 10);
		System.out.println("Educational Course Details:");
		course.displayCourseDetails();
	}
}