package com.iostreams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCSVSingleFile {

    // Inner Employee class (same file)
    static class Employee {
        int id;
        String name;
        String department;
        int salary;

        Employee(int id, String name, String department, int salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

        String filePath = "D:\\File Handling\\CSV_Files\\employee.csv";
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                // Works for comma or tab separated files
                String[] data = line.split("[,\t]");

                Employee emp = new Employee(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        Integer.parseInt(data[3])
                );

                employees.add(emp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort by salary in descending order
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e2.salary, e1.salary);
            }
        });

        System.out.println("Top 5 Highest-Paid Employees:");
        System.out.println("--------------------------------");

        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            Employee e = employees.get(i);
            System.out.println(
                    e.id + ", " +
                    e.name + ", " +
                    e.department + ", " +
                    e.salary
            );
        }
    }
}
