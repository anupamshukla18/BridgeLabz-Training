package com.inheritance.hierarchicalinheritance.problem2;

public class Teacher extends Person {
	// Additional Attribute
	private String subject;

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	void displayRole() {
		System.out.println("Role: Teacher");
		System.out.println("Name: " + name);
		System.out.println("Subject: " + subject);
	}
}