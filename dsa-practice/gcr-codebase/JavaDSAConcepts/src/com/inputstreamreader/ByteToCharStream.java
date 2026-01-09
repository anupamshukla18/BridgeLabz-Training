package com.filehandling.inputstreamreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ByteToCharStream {
	public static void main(String[] args) {

		String filePath = "D:/javaquestionset2.txt";

		// Using "Try-with-Resources" to automatically close streams
		try (FileInputStream fis = new FileInputStream(filePath);
				InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
				BufferedReader bufferedReader = new BufferedReader(isr)) {

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			// Never leave a catch block empty!
			System.err.println("Could not read the file: " + e.getMessage());
			e.printStackTrace();
		}
	}
}