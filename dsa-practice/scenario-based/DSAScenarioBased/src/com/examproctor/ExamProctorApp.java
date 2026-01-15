package com.examproctor;

import java.util.Scanner;

// Main application class
public class ExamProctorApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		NavigationTracker tracker = new NavigationTracker();
		AnswerStore store = new AnswerStore();
		ScoreEvaluator evaluator = new ScoreEvaluator();

		while (true) {
			System.out.println("\n--- EXAM PROCTOR MENU ---");
			System.out.println("1. Visit Question");
			System.out.println("2. Answer Question");
			System.out.println("3. View Navigation History");
			System.out.println("4. Submit Exam");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Question ID: ");
				tracker.visitQuestion(sc.nextInt());
				break;

			case 2:
				System.out.print("Enter Question ID: ");
				int qId = sc.nextInt();
				System.out.print("Enter Answer: ");
				store.saveAnswer(qId, sc.next());
				break;

			case 3:
				tracker.showHistory();
				break;

			case 4:
				int score = evaluator.calculateScore(store.getAnswers());
				System.out.println("Exam Submitted");
				System.out.println("Final Score: " + score + "/5");
				sc.close();
				return;

			case 5:
				sc.close();
				return;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
