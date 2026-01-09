package com.skillforageonlinelearningplatform;

import java.util.Scanner;

public class SkillForgeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Instructor input
		System.out.print("Enter Instructor Name: ");
		String instructorName = sc.nextLine();

		System.out.print("Enter Instructor Email: ");
		String instructorEmail = sc.nextLine();

		Instructor instructor = new Instructor(instructorName, instructorEmail);

		// Student input
		System.out.print("Enter Student Name: ");
		String studentName = sc.nextLine();

		System.out.print("Enter Student Email: ");
		String studentEmail = sc.nextLine();

		Student student = new Student(studentName, studentEmail);

		Course course = null;

		int choice;
		do {
			System.out.println("\n====== SKILLFORGE MENU ======");
			System.out.println("1. Create Beginner Course");
			System.out.println("2. Create Advanced Course");
			System.out.println("3. Update Student Progress");
			System.out.println("4. Generate Certificates");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter Course Title: ");
				String bTitle = sc.nextLine();

				course = new BeginnerCourse(bTitle, instructor);
				instructor.uploadCourse(bTitle);

				System.out.println("Beginner Course Created");
				break;

			case 2:
				System.out.print("Enter Course Title: ");
				String aTitle = sc.nextLine();

				System.out.print("Enter Number of Modules: ");
				int n = sc.nextInt();
				sc.nextLine();

				String[] modules = new String[n];
				for (int i = 0; i < n; i++) {
					System.out.print("Enter Module " + (i + 1) + ": ");
					modules[i] = sc.nextLine();
				}

				course = new AdvancedCourse(aTitle, instructor, modules);
				instructor.uploadCourse(aTitle);

				System.out.println("Advanced Course Created");
				break;

			case 3:
				if (course == null) {
					System.out.println("Create a course first!");
					break;
				}

				System.out.print("Enter Completed Modules: ");
				int completed = sc.nextInt();

				System.out.print("Enter Score: ");
				double score = sc.nextDouble();
				sc.nextLine();

				student.updateProgress(completed, course.getTotalModules());
				student.updateScore(score);

				System.out.println("Progress Updated");
				System.out.println("Current Progress: " + student.calculateProgress() + "%");
				break;

			case 4:
				System.out.println("Student Certificate:");
				student.generateCertificate();

				if (course instanceof ICertifiable) {
					System.out.println("Course Certificate:");
					((ICertifiable) course).generateCertificate();
				}
				break;

			case 5:
				System.out.println("Exiting SkillForge");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 5);

		sc.close();
	}
}
