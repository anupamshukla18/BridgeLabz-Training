package com.oopspillars.employeemanagementsystem;

class PartTimeEmployee extends Employee implements Department {
	private int hoursWorked;
	private double hourlyRate;
	private String departmentName;

	public PartTimeEmployee(String employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
		super(employeeId, name, baseSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	// Implement abstract method
	@Override
	public double calculateSalary() {
		return hoursWorked * hourlyRate;
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
		System.out.println("Employee Type: Part Time");
		System.out.println("Hours Worked : " + hoursWorked);
		System.out.println("Hourly Rate  : " + hourlyRate);
		System.out.println("Total Salary : " + calculateSalary());
		System.out.println("Department   : " + getDepartmentDetails());
		System.out.println("-----------------------------------");
	}
}
