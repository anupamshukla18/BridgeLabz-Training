package com.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployeeCSV {

	public static void main(String[] args) {

		String filePath =  "D:\\File Handling\\CSV_Files\\employee.csv";
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter employee name to search: ");
		String searchName = scanner.nextLine();

		boolean found = false;

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

			String line;

			// Skip header row
			reader.readLine();

			while ((line = reader.readLine()) != null) {

				if (line.trim().isEmpty()) {
					continue;
				}

				String[] data = line.split("[,\\t]");

				String name = data[1];

				if (name.equalsIgnoreCase(searchName)) {

					System.out.println("Employee Found!");
					System.out.println("Department: " + data[2]);
					System.out.println("Salary: " + data[3]);

					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("Employee not found.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		scanner.close();
	}
}
