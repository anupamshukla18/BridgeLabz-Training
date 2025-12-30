package com.objectmodeling;

import java.util.*;

//Course Class
class Course {
	private String courseName;
	private List<Student> enrolledStudents;

	public Course(String courseName) {
		this.courseName = courseName;
		enrolledStudents = new ArrayList<>();
	}

	// add student into course
	public void enrollStudent(Student student) {
		enrolledStudents.add(student);
	}

	// display enrolled students
	public void showEnrolledStudents() {
		System.out.println("Students enrolled in " + courseName + ":");
		for (Student s : enrolledStudents) {
			System.out.println("- " + s.getStudentName());
		}
	}

	public String getCourseName() {
		return courseName;
	}
}

//Student Class
class Student {
	private String studentName;
	private List<Course> enrolledCourses;

	public Student(String studentName) {
		this.studentName = studentName;
		enrolledCourses = new ArrayList<>();
	}

	// enroll student into a course
	public void enrollInCourse(Course course) {
		enrolledCourses.add(course);
		course.enrollStudent(this); // maintain association both ways
	}

	// show student's courses
	public void showMyCourses() {
		System.out.println(studentName + " is enrolled in:");
		for (Course c : enrolledCourses) {
			System.out.println("- " + c.getCourseName());
		}
	}

	public String getStudentName() {
		return studentName;
	}
}

//School Class (Aggregation)
class School {
	private String schoolName;
	private List<Student> students;

	public School(String schoolName) {
		this.schoolName = schoolName;
		students = new ArrayList<>();
	}

	// add student into school
	public void addStudent(Student student) {
		students.add(student);
	}

	// display all students of school
	public void showSchoolStudents() {
		System.out.println("Students of " + schoolName + ":");
		for (Student s : students) {
			System.out.println("- " + s.getStudentName());
		}
	}
}

//Main Class
public class SchoolRelationshipTest {
	public static void main(String[] args) {

		// create school
		School school = new School("Green Valley School");

		// create students
		Student s1 = new Student("Anuj");
		Student s2 = new Student("Anupam");

		// add students to school (Aggregation)
		school.addStudent(s1);
		school.addStudent(s2);

		// create courses
		Course c1 = new Course("Mathematics");
		Course c2 = new Course("Science");

		// enroll students in courses (Many-to-Many Association)
		s1.enrollInCourse(c1);
		s1.enrollInCourse(c2);

		s2.enrollInCourse(c1);

		// Display outputs
		school.showSchoolStudents();
		System.out.println();

		s1.showMyCourses();
		System.out.println();

		s2.showMyCourses();
		System.out.println();

		c1.showEnrolledStudents();
		System.out.println();

		c2.showEnrolledStudents();
	}
}
