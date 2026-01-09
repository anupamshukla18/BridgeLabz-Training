package com.algorithmruntimeanalysis;

import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadingPerformanceComparison {

	// ---------------- FileReader Method ----------------
	// Character stream (slower for large files)
	public static void readUsingFileReader(String filePath) throws IOException {

		FileReader fileReader = new FileReader(filePath);
		int character;

		while ((character = fileReader.read()) != -1) {
			// reading character by character
		}

		fileReader.close();
	}

	// InputStreamReader Method Byte stream converted to character stream (more
	// efficient)
	public static void readUsingInputStreamReader(String filePath) throws IOException {

		InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));

		int character;

		while ((character = inputStreamReader.read()) != -1) {
			// reading byte by byte and converting to character
		}

		inputStreamReader.close();
	}

	// ---------------- Main Method ----------------
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String filePath = "D://Java is powerful.txt";

		try {
			// FileReader Timing
			long fileReaderStartTime = System.nanoTime();
			readUsingFileReader(filePath);
			long fileReaderEndTime = System.nanoTime();

			// InputStreamReader Timing
			long inputStreamReaderStartTime = System.nanoTime();
			readUsingInputStreamReader(filePath);
			long inputStreamReaderEndTime = System.nanoTime();

			// Output
			System.out.println("\n--- File Reading Performance ---");
			System.out.println("FileReader Time        : " + (fileReaderEndTime - fileReaderStartTime) + " ns");
			System.out.println(
					"InputStreamReader Time : " + (inputStreamReaderEndTime - inputStreamReaderStartTime) + " ns");

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		input.close(); // closing input stream
	}
}
