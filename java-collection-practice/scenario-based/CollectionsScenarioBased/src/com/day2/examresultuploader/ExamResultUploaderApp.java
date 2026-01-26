package com.day2.examresultuploader;

import java.util.List;
import java.util.Map;

public class ExamResultUploaderApp {

	public static void main(String[] args) {

		String csvFilePath = "D:\\File Handling\\CSV_Files\\results.csv";

		try {
			List<ExamRecord<ExamType>> records = ResultFileReader.readResults(csvFilePath, ExamType.FINAL);

			Map<String, List<Integer>> subjectMarks = ResultAnalyzer.groupMarksBySubject(records);

			Map<String, Integer> toppers = ResultAnalyzer.findTopperPerSubject(subjectMarks);

			System.out.println("Top Scorers:");
			toppers.forEach((subject, marks) -> System.out.println(subject + " -> " + marks));

		} catch (InvalidResultFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}