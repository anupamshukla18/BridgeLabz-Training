package com.inheritance.hierarchicalinheritance.problem2;

public class Staff extends Person {

	// Additional Attribute
	private String department;

	public Staff(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}

	void displayRole() {
		System.out.println("Role: Staff");
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
	}
}