package com.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Employee class (Model)
class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	int id;
	String name;
	String department;
	double salary;

	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + department + " " + salary;
	}
}

// Main class
public class EmployeeSerializationDemo {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Vikash", "IT", 50000));
		employees.add(new Employee(2, "Aman", "HR", 45000));

		// 🔹 Serialization
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("D:\\File Handling\\employees.ser"))) {

			oos.writeObject(employees);
			System.out.println("Employees serialized successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}

		// 🔹 Deserialization
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\File Handling\\employees.ser"))) {

			List<Employee> empList = (List<Employee>) ois.readObject();
			empList.forEach(System.out::println);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
