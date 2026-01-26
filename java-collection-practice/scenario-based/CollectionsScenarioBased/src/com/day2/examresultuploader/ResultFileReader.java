package com.day2.examresultuploader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ResultFileReader {

	// RollNo,Name,Subject,Marks
	private static final Pattern CSV_PATTERN = Pattern.compile("\\d+,[A-Za-z ]+,[A-Za-z ]+,\\d+");

	public static <T> List<ExamRecord<T>> readResults(String filePath, T examType) throws InvalidResultFormatException {

		List<ExamRecord<T>> records = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

			String line = reader.readLine(); // skip header

			while ((line = reader.readLine()) != null) {

				if (!CSV_PATTERN.matcher(line).matches()) {
					throw new InvalidResultFormatException("Invalid CSV format: " + line);
				}

				String[] data = line.split(",");

				int rollNo = Integer.parseInt(data[0]);
				String name = data[1];
				String subject = data[2];
				int marks = Integer.parseInt(data[3]);

				if (marks < 0 || marks > 100) {
					throw new InvalidResultFormatException("Invalid marks: " + marks);
				}

				records.add(new ExamRecord<>(rollNo, name, subject, marks, examType));
			}

		} catch (InvalidResultFormatException e) {
			throw e;
		} catch (Exception e) {
			throw new InvalidResultFormatException("File reading error");
		}

		return records;
	}
}