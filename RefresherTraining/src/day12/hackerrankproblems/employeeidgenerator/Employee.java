package day12.hackerrankproblems.employeeidgenerator;

public class Employee {

	private static int nextId = 1001;
	private final int employeeId;
	private String name;

	public Employee(String name) {
		this.name = name;
		this.employeeId = nextId++;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}
}