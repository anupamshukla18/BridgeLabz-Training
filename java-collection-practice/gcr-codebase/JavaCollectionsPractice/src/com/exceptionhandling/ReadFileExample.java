package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
	
public class ReadFileExample {

	public static void main(String[] args) {

		// try-with-resources to auto-close file
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("example.txt"))) {

			// read file line by line
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException exception) {
			// handle missing file or read error
			System.out.println("File not found");
		}
	}
}
