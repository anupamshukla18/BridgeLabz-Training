package com.markmate;

public class MarkMateApp {

	public static void main(String[] args) {

		String csvFile = "student_marks.csv";
		String jsonFile = "report_card.json";

		StudentReport report = MarksheetProcessor.processCSV(csvFile);
		MarksheetProcessor.exportToJson(report, jsonFile);

		System.out.println("Marksheet generated successfully ");
	}
}

