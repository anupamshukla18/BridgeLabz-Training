package com.day1.resumeanalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ResumeReader {

	public static String readResume(File file) throws IOException {
		StringBuilder content = new StringBuilder();

		try (BufferedReader bufferReader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = bufferReader.readLine()) != null) {
				content.append(line).append(" ");
			}
		}
		return content.toString();
	}
}