package com.objectmodeling;

import java.util.*;

//Faculty Class (Aggregation)
class Faculty {
	private String facultyName;

	public Faculty(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getFacultyName() {
		return facultyName;
	}

	// show faculty info
	public void showFacultyDetails() {
		System.out.println("Faculty: " + facultyName);
	}
}

//University Class
class University {

	private String universityName;

	// Composition -> Departments belong to University only
	private List<Department> departments;

	// Aggregation -> Faculty can exist independently
	private List<Faculty> facultyMembers;

	public University(String universityName) {
		this.universityName = universityName;
		departments = new ArrayList<>();
		facultyMembers = new ArrayList<>();
	}

	// Inner Class = Strong Ownership (Composition)
	class Department {
		private String departmentName;

		Department(String departmentName) {
			this.departmentName = departmentName;
		}

		public void showDepartment() {
			System.out.println("Department: " + departmentName);
		}
	}

	// add department (Composition)
	public void addDepartment(String departmentName) {
		Department dept = new Department(departmentName);
		departments.add(dept);
	}

	// add faculty (Aggregation)
	public void addFaculty(Faculty faculty) {
		facultyMembers.add(faculty);
	}

	// show all departments
	public void showDepartments() {
		System.out.println("\nDepartments in " + universityName + ":");
		for (Department d : departments) {
			d.showDepartment();
		}
	}

	// show all faculty
	public void showFacultyMembers() {
		System.out.println("\nFaculty Members in " + universityName + ":");
		for (Faculty f : facultyMembers) {
			System.out.println("- " + f.getFacultyName());
		}
	}

	// delete university (simulate composition destruction)
	public void deleteUniversity() {
		System.out.println("\nDeleting University: " + universityName);
		System.out.println("All departments will also be deleted (Composition)");

		departments.clear(); // departments destroyed
		universityName = null;
	}
}

//Main Class
public class UniversityRelationshipTest {
	public static void main(String[] args) {

		// create independent faculty (they can exist without university)
		Faculty f1 = new Faculty("Dr. Mehta");
		Faculty f2 = new Faculty("Prof. Sharma");

		// create university
		University uni = new University("Oxford University");

		// add departments (Composition)
		uni.addDepartment("Computer Science");
		uni.addDepartment("Mechanical Engineering");
		uni.addDepartment("Electrical Engineering");

		// add faculty (Aggregation)
		uni.addFaculty(f1);
		uni.addFaculty(f2);

		uni.showDepartments();
		uni.showFacultyMembers();

		// simulate university deletion
		uni.deleteUniversity();

		System.out.println("\nChecking faculty existence after University deletion:");
		f1.showFacultyDetails();
		f2.showFacultyDetails();

		System.out.println("\nFaculty still exists → Aggregation proved");
		System.out.println("Departments deleted with University → Composition proved");
	}
}
