package com.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilterStudentCSV {

	public static void main(String[] args) {

		String filePath = "D:\\File Handling\\CSV_Files\\students.csv";

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

			String line;

			// Skip header
			reader.readLine();

			System.out.println("Students scoring more than 80 marks:");
			System.out.println("------------------------------------");

			while ((line = reader.readLine()) != null) {

				if (line.trim().isEmpty()) {
					continue;
				}

				String[] data = line.split(",");

				int marks = Integer.parseInt(data[3]);

				if (marks > 80) {
					System.out.println(
							"ID: " + data[0] + ", Name: " + data[1] + ", Age: " + data[2] + ", Marks: " + data[3]);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
