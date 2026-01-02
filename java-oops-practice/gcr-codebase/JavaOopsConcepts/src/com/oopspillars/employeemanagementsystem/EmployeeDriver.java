package com.oopspillars.employeemanagementsystem;

import java.util.*;
public class EmployeeDriver {
	public static void main(String[] args) {
		// Creating Full Time Employee
		FullTimeEmployee f1 = new FullTimeEmployee("E101", "Rahul Sharma", 30000, 10000);
		f1.assignDepartment("IT");

		// Creating Part Time Employee
		PartTimeEmployee p1 = new PartTimeEmployee("E102", "Anita Verma", 0, 40, 500);
		p1.assignDepartment("Support");

		// POLYMORPHISM
		// Storing different employee objects in Employee reference
		List<Employee> employees = new ArrayList<>();
		employees.add(f1);
		employees.add(p1);

		System.out.println("------ EMPLOYEE MANAGEMENT SYSTEM ------\n");

		// Processing employees polymorphically
		for (Employee emp : employees) {
			emp.displayDetails(); // calls parent method
			System.out.println("Calculated Salary: " + emp.calculateSalary());

			// Check instance to print department
			if (emp instanceof Department) {
				Department dept = (Department) emp;
				System.out.println("Department: " + dept.getDepartmentDetails());
			}

			System.out.println("-----------------------------------");
		}

		// Showing detailed output
		System.out.println("\n------ DETAILED EMPLOYEE DETAILS ------");
		f1.showFullDetails();
		p1.showFullDetails();
	}
}
