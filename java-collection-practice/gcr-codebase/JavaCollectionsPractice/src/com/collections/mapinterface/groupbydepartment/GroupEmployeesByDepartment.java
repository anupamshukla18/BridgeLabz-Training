package com.collections.mapinterface.groupbydepartment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupEmployeesByDepartment {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alice", Department.HR));
		employees.add(new Employee("Bob", Department.IT));
		employees.add(new Employee("Carol", Department.HR));

		Map<Department, List<Employee>> groupedMap = new HashMap<>();

		// Grouping logic (no streams)
		for (Employee emp : employees) {

			Department dept = emp.getDepartment();

			if (groupedMap.containsKey(dept)) {
				groupedMap.get(dept).add(emp);
			} else {
				List<Employee> list = new ArrayList<>();
				list.add(emp);
				groupedMap.put(dept, list);
			}
		}

		// Output
		for (Map.Entry<Department, List<Employee>> entry : groupedMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
