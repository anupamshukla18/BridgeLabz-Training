package com.iostreams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DatabaseToCSVReport {

	// Database credentials
	private static final String DB_URL = "jdbc:mysql://localhost:3306/employee_db";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "savi2026";

	public static void main(String[] args) {

		String outputFile = "D:\\File Handling\\CSV_Files\\employee_reports.csv";

		String query = "SELECT id, name, department, salary FROM employees";

		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(query);
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

			// 1️⃣ Write CSV header
			writer.write("Employee ID,Name,Department,Salary");
			writer.newLine();

			// 2️⃣ Write records
			while (resultSet.next()) {

				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String department = resultSet.getString("department");
				int salary = resultSet.getInt("salary");

				writer.write(id + "," + name + "," + department + "," + salary);
				writer.newLine();
			}

			System.out.println("CSV Report generated successfully: employee_report.csv");

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
