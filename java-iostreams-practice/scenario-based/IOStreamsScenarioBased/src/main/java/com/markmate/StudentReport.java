package com.markmate;

import java.util.Map;

public class StudentReport {

	String studentName;
	Map<String, Integer> subjectMarks;
	int total;
	double average;
	String grade;

	public StudentReport(String studentName, Map<String, Integer> subjectMarks, int total, double average,
			String grade) {
		this.studentName = studentName;
		this.subjectMarks = subjectMarks;
		this.total = total;
		this.average = average;
		this.grade = grade;
	}
}
