package com.inheritance.hierarchicalinheritance.problem2;

public class Student extends Person {
	// Additional Attribute
	private String grade;

	public Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	void displayRole() {
		System.out.println("Role: Student");
		System.out.println("Name: " + name);
		System.out.println("Grade: " + grade);
	}
}