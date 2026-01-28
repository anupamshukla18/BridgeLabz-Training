package com.markmate;

import java.io.*;
import java.util.*;

import com.google.gson.Gson;

public class MarksheetProcessor {

	public static StudentReport processCSV(String fileName) {

		Map<String, Integer> marks = new LinkedHashMap<>();
		String studentName = null;

		InputStream inputStream = MarksheetProcessor.class.getClassLoader().getResourceAsStream(fileName);

		if (inputStream == null) {
			throw new RuntimeException("CSV file not found in src/main/resources");
		}

		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {

			String line;

			// ✅ FIND FIRST NON-EMPTY LINE (STUDENT NAME)
			while ((line = br.readLine()) != null) {

				line = removeBOM(line).trim();

				if (!line.isEmpty()) {
					studentName = line;
					break;
				}
			}

			if (studentName == null) {
				throw new IllegalArgumentException("Student name is missing");
			}

			// ✅ READ SUBJECT MARKS
			while ((line = br.readLine()) != null) {

				line = line.trim();
				if (line.isEmpty())
					continue;

				String[] data = line.split(",");

				if (data.length != 2) {
					throw new IllegalArgumentException("Invalid CSV row: " + line);
				}

				marks.put(data[0].trim(), Integer.parseInt(data[1].trim()));
			}

		} catch (IOException | NumberFormatException e) {
			throw new RuntimeException("Error reading CSV file", e);
		}

		if (marks.isEmpty()) {
			throw new IllegalArgumentException("No subject marks found in CSV file");
		}

		int total = marks.values().stream().mapToInt(Integer::intValue).sum();

		double average = total / (double) marks.size();
		String grade = calculateGrade(average);

		return new StudentReport(studentName, marks, total, average, grade);
	}

	// ✅ REMOVES UTF-8 BOM IF PRESENT
	private static String removeBOM(String s) {
		if (s != null && s.startsWith("\uFEFF")) {
			return s.substring(1);
		}
		return s;
	}

	private static String calculateGrade(double avg) {
		if (avg >= 90)
			return "A";
		if (avg >= 75)
			return "B";
		if (avg >= 60)
			return "C";
		return "D";
	}

	public static void exportToJson(StudentReport report, String outputPath) {
		try (Writer writer = new FileWriter(outputPath)) {
			new Gson().toJson(report, writer);
		} catch (IOException e) {
			throw new RuntimeException("JSON export failed", e);
		}
	}
}
