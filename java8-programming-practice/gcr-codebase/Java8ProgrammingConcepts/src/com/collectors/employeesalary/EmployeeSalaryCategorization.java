package com.collectors.employeesalary;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryCategorization {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Amit", "IT", 75000),
                new Employee("Neha", "HR", 55000),
                new Employee("Ravi", "IT", 85000),
                new Employee("Priya", "Finance", 65000),
                new Employee("Karan", "HR", 60000),
                new Employee("Suman", "Finance", 70000)
        );

        // Average salary per department
        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        System.out.println(avgSalaryByDept);
    }
}
