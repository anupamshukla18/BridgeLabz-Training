package com.personalizedlearningplatform;

import java.util.Arrays;

import java.util.*;

public class EduMentorApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		Learner learner = null;
		Instructor instructor = null;
		Quiz quiz = null;

		do {
			System.out.println("\n===== EduMentor Menu =====");
			System.out.println("1. Create Learner");
			System.out.println("2. Create Instructor");
			System.out.println("3. Create Quiz");
			System.out.println("4. Attempt Quiz");
			System.out.println("5. Generate Learner Certificate");
			System.out.println("6. Generate Instructor Certificate");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();
			sc.nextLine(); // buffer clear

			switch (choice) {

			case 1:
				System.out.print("Enter Learner ID: ");
				int lId = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Name: ");
				String lName = sc.nextLine();

				System.out.print("Enter Email: ");
				String lEmail = sc.nextLine();

				System.out.print("Enter Progress (%): ");
				double progress = sc.nextDouble();

				learner = new Learner(lId, lName, lEmail, progress);
				System.out.println("Learner created successfully!");
				break;

			case 2:
				System.out.print("Enter Instructor ID: ");
				int iId = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Name: ");
				String iName = sc.nextLine();

				System.out.print("Enter Email: ");
				String iEmail = sc.nextLine();

				System.out.print("Enter Expertise: ");
				String expertise = sc.nextLine();

				instructor = new Instructor(iId, iName, iEmail, expertise);
				System.out.println("Instructor created successfully!");
				break;

			case 3:
				System.out.print("Enter Quiz Difficulty (Easy/Medium/Hard): ");
				String difficulty = sc.nextLine();

				System.out.print("Enter number of questions: ");
				int n = sc.nextInt();
				sc.nextLine();

				List<String> questions = new ArrayList<>();
				List<String> answers = new ArrayList<>();

				for (int i = 0; i < n; i++) {
					System.out.print("Enter Question " + (i + 1) + ": ");
					questions.add(sc.nextLine());

					System.out.print("Enter Answer " + (i + 1) + ": ");
					answers.add(sc.nextLine());
				}

				quiz = new Quiz(questions, answers, difficulty);
				System.out.println("Quiz created successfully!");
				break;

			case 4:
				if (quiz == null) {
					System.out.println("Please create a quiz first!");
					break;
				}
				quiz.attemptQuiz();
				quiz.showResult();
				break;

			case 5:
				if (learner == null) {
					System.out.println("No learner found!");
					break;
				}
				learner.generateCertificate();
				break;

			case 6:
				if (instructor == null) {
					System.out.println("No instructor found!");
					break;
				}
				instructor.generateCertificate();
				break;

			case 0:
				System.out.println("Exiting EduMentor... Thank you!");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 0);

		sc.close();
	}
}
