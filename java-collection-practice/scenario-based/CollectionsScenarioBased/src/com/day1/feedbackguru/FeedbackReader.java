package com.day1.feedbackguru;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FeedbackReader {

	public static List<String> readFeedbackFiles(String folderPath) {

		List<String> feedbackLines = new ArrayList<>();
		File folder = new File(folderPath);
		File[] files = folder.listFiles();

		if (files == null) {
			return feedbackLines;
		}

		for (File file : files) {

			if (!file.getName().endsWith(".txt")) {
				continue;
			}

			try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

				String line;
				while ((line = reader.readLine()) != null) {
					feedbackLines.add(line);
				}

			} catch (IOException e) {
				System.out.println("Skipped file: " + file.getName());
			}
		}
		return feedbackLines;
	}
}