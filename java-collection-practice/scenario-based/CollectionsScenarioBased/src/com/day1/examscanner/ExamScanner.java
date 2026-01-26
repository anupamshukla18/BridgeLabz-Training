package com.day1.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner {

	private static final String ANSWER_KEY = "A,B,C,D,A,B,C";

	public static PriorityQueue<StudentResult> scanExam(String filePath) {

		Map<String, Integer> resultMap = new HashMap<>();
		PriorityQueue<StudentResult> ranking = new PriorityQueue<>((a, b) -> b.getScore() - a.getScore());

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			String line;
			while ((line = br.readLine()) != null) {

				if (!isValidFormat(line)) {
					System.out.println("Invalid format skipped: " + line);
					continue;
				}

				String[] data = line.split(",");
				String name = data[0];

				List<String> studentAnswers = Arrays.asList(data).subList(1, data.length);
				List<String> correctAnswers = Arrays.asList(ANSWER_KEY.split(","));

				int score = calculateScore(studentAnswers, correctAnswers);

				resultMap.put(name, score);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
			ranking.add(new StudentResult(entry.getKey(), entry.getValue()));
		}

		return ranking;
	}

	// ---------------- HELPER METHODS ----------------

	private static boolean isValidFormat(String line) {
		String regex = "^[A-Za-z ]+(,[ABCD])+$";
		return Pattern.matches(regex, line);
	}

	private static int calculateScore(List<String> student, List<String> key) {

		int score = 0;
		int len = Math.min(student.size(), key.size());

		for (int i = 0; i < len; i++) {
			if (student.get(i).equalsIgnoreCase(key.get(i))) {
				score++;
			}
		}
		return score;
	}
}