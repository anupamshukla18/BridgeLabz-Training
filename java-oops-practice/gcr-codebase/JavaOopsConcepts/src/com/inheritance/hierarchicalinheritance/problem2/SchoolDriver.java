package com.inheritance.hierarchicalinheritance.problem2;

public class SchoolDriver {
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Rahul", 35, "Mathematics");
		Student student = new Student("Amit", 16, "10th");
		Staff staff = new Staff("Suresh", 40, "Administration");

		teacher.displayRole();
		System.out.println();

		student.displayRole();
		System.out.println();

		staff.displayRole();
	}
}