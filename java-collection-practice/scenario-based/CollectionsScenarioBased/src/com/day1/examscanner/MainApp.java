package com.day1.examscanner;

import java.util.PriorityQueue;

public class MainApp {
	public static void main(String[] args) {

		String filePath = "D:\\Desktop\\FileHandling\\ClassFile.csv";

		PriorityQueue<StudentResult> results = ExamScanner.scanExam(filePath);

		System.out.println("---- Student Rankings ----");

		while (!results.isEmpty()) {
			System.out.println(results.poll());
		}
	}
}