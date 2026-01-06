package com.personalizedlearningplatform;

import java.util.List;
import java.util.Scanner;

public class Quiz {
	// Internal question bank (must remain private)
	private List<String> questions;

	// Correct answers (cannot be modified once set)
	private final List<String> correctAnswers;

	private String difficulty;
	private int score;

	// Constructor with variable difficulty
	public Quiz(List<String> questions, List<String> correctAnswers, String difficulty) {
		this.questions = questions;
		this.correctAnswers = correctAnswers;
		this.difficulty = difficulty;
		this.score = 0;
	}

	// Allow user to attempt the quiz
	public void attemptQuiz() {
		Scanner sc = new Scanner(System.in);
		score = 0;

		System.out.println("\n--- Quiz Started (" + difficulty + ") ---");

		for (int i = 0; i < questions.size(); i++) {
			System.out.println("Q" + (i + 1) + ": " + questions.get(i));
			System.out.print("Your Answer: ");
			String userAnswer = sc.nextLine();

			// Operator-based score calculation
			if (userAnswer.equalsIgnoreCase(correctAnswers.get(i))) {
				score += 10;
			}
		}

		System.out.println("--- Quiz Completed ---");
	}

	// Percentage calculation using operators
	public double calculatePercentage() {
		return (score / (double) (questions.size() * 10)) * 100;
	}

	// Display final result
	public void showResult() {
		System.out.println("Difficulty : " + difficulty);
		System.out.println("Score      : " + score);
		System.out.println("Percentage : " + calculatePercentage() + "%");
	}
}
