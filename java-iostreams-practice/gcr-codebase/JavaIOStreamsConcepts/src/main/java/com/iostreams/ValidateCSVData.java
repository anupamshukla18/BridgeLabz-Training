package com.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {

	// Email regex pattern
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-z0-9]+\\.[a-zA-Z]{2,}";

	// Phone regex (exactly 10 digits)
	private static final String PHONE_REGEX = "^[0-9]{10}$";

	public static void main(String[] args) {

		String filePath = "D:\\File Handling\\CSV_Files\\users.csv";

		Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
		Pattern phonePattern = Pattern.compile(PHONE_REGEX);

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

				String id = data[0];
				String name = data[1];
				String email = data[2];
				String phone = data[3];

				boolean isValid = true;

				// Email validation
				if (!emailPattern.matcher(email).matches()) {
					System.out.println("Invalid Email in row: " + line);
					isValid = false;
				}

				// Phone validation
				if (!phonePattern.matcher(phone).matches()) {
					System.out.println("Invalid Phone Number in row: " + line);
					isValid = false;
				}

				if (!isValid) {
					System.out.println("❌ Validation failed for ID: " + id);
					System.out.println("------------------------------------");
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
