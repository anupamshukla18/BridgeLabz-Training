package com.filehandling.inputstreamreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CosnoleToFile {
	public static void main(String[] args) {

		// defining the path of file which i want to read
		String filePath = "D://Java is powerful.txt";

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

			System.out.println("Enter text (type 'exit' to quit):");
			String input;

			while (true) {
				input = reader.readLine();

				if (input == null || input.equalsIgnoreCase("exit")) {
					break;
				}

				writer.write(input);
				writer.newLine();
			}
			
			System.out.println("Data successfully saved to " + filePath);
			
		} catch (IOException e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
	}
}
