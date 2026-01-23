package com.streams;

import java.io.*;

public class FileCopyBasic {

	public static void main(String[] args) {

		File source = new File("D:\\File Handling\\input.txt");
		File destination = new File("D:\\File Handling\\output.txt");

		// Check if source file exists
		if (!source.exists()) {
			System.out.println("Source file does not exist.");
			return;
		}

		try (FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(destination)) {

			int data;
			// Read byte-by-byte and write to destination
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

			System.out.println("File copied successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
