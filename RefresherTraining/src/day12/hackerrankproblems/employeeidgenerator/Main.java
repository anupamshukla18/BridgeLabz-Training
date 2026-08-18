package day12.hackerrankproblems.employeeidgenerator;

public class Main {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Rahul");
		Employee employee2 = new Employee("Ankit");

		Employee employee3 = new Employee("Priya");
		Employee employee4 = new Employee("Neha");

		System.out.println(employee1.getName() + " - " + employee1.getEmployeeId());
		System.out.println(employee2.getName() + " - " + employee2.getEmployeeId());
		System.out.println(employee3.getName() + " - " + employee3.getEmployeeId());
		System.out.println(employee4.getName() + " - " + employee4.getEmployeeId());
	}
}