package com.iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateEmployeeSalaryCSV {

	public static void main(String[] args) {

		String inputFile = "D:\\File Handling\\CSV_Files\\employee.csv";
		String outputFile = "D:\\File Handling\\CSV_Files\\employees_updated.csv";

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

			String line;

			//  Read and write header
			line = reader.readLine();
			writer.write(line);
			writer.newLine();

			// Process remaining records
			while ((line = reader.readLine()) != null) {

				if (line.trim().isEmpty()) {
					continue;
				}

				// Handle comma or tab separated files
				String[] data = line.split("[,\t]");

				String department = data[2];
				double salary = Double.parseDouble(data[3]);

				// 3️⃣ Increase salary by 10% for IT department
				if (department.equalsIgnoreCase("IT")) {
					salary = salary + (salary * 0.10);
				}

				// Write updated record
				writer.write(data[0] + "," + data[1] + "," + data[2] + "," + (int) salary);
				writer.newLine();
			}

			System.out.println("Salary updated successfully. New file created: employees_updated.csv");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
