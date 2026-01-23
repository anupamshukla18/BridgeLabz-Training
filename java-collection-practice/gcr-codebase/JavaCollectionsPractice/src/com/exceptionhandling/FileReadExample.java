package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) {

		// try-with-resources to auto-close file
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("info.txt"))) {

			// read first line
			String firstLine = bufferedReader.readLine();
			System.out.println(firstLine);

		} catch (IOException exception) {
			// handle file read error
			System.out.println("Error reading file");
		}
	}
}
