package com.oopspillars.employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department {
	private double bonus;
	private String departmentName;

	public FullTimeEmployee(String employeeId, String name, double baseSalary, double bonus) {
		super(employeeId, name, baseSalary);
		this.bonus = bonus;
	}

	// Implement abstract method
	@Override
	public double calculateSalary() {
		return getBaseSalary() + bonus;
	}

	// Implement interface methods
	@Override
	public void assignDepartment(String deptName) {
		this.departmentName = deptName;
	}

	@Override
	public String getDepartmentDetails() {
		return departmentName;
	}

	// Display details including salary + department
	public void showFullDetails() {
		displayDetails();
		System.out.println("Employee Type: Full Time");
		System.out.println("Bonus        : " + bonus);
		System.out.println("Total Salary : " + calculateSalary());
		System.out.println("Department   : " + getDepartmentDetails());
		System.out.println("-----------------------------------");
	}
}
