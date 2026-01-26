package com.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

	public static void main(String[] args) {

		String filePath =  "D:\\File Handling\\CSV_Files\\employee.csv";
		int recordCount = 0;

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

			String line;

			// Step 1: Skip header row
			reader.readLine();

			// Step 2: Read remaining lines
			while ((line = reader.readLine()) != null) {

				// Skip empty lines (safety check)
				if (line.trim().isEmpty()) {
					continue;
				}

				recordCount++;
			}

			System.out.println("Total Records = " + recordCount);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
