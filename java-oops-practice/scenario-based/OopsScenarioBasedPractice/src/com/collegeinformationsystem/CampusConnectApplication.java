package com.collegeinformationsystem;

import java.util.Scanner;

public class CampusConnectApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Faculty Details");

		System.out.print("ID: ");
		int fid = Integer.parseInt(sc.nextLine()); // FIX

		System.out.print("Name: ");
		String fname = sc.nextLine();

		System.out.print("Email: ");
		String femail = sc.nextLine();

		System.out.print("Department: ");
		String dept = sc.nextLine();

		Faculty faculty = new Faculty(fid, fname, femail, dept);

		System.out.print("\nEnter Course Name: ");
		String courseName = sc.nextLine();
		Course course = new Course(courseName, faculty);

		Student student = null;
		int choice;

		do {
			System.out.println("\n===== CampusConnect Menu =====");
			System.out.println("1. Add Student");
			System.out.println("2. Add Grade");
			System.out.println("3. Enroll Student");
			System.out.println("4. Show Student Details");
			System.out.println("5. Show Faculty Details");
			System.out.println("6. Show Course Details");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");

			choice = Integer.parseInt(sc.nextLine()); // FIX

			switch (choice) {

			case 1:
				System.out.print("Student ID: ");
				int sid = Integer.parseInt(sc.nextLine()); // FIX

				System.out.print("Name: ");
				String sname = sc.nextLine();

				System.out.print("Email: ");
				String semail = sc.nextLine();

				student = new Student(sid, sname, semail);
				System.out.println("Student added successfully!");
				break;

			case 2:
				if (student != null) {
					System.out.print("Enter Grade: ");
					int grade = Integer.parseInt(sc.nextLine()); // FIX
					student.addGrade(grade);
					System.out.println("Grade added!");
				} else {
					System.out.println("Create student first!");
				}
				break;

			case 3:
				if (student != null) {
					student.enrollCourse(course);
					System.out.println("Student enrolled!");
				} else {
					System.out.println("Create student first!");
				}
				break;

			case 4:
				if (student != null) {
					Person p = student; // Polymorphism
					p.printDetails();
				} else {
					System.out.println("No student found!");
				}
				break;

			case 5:
				Person p2 = faculty; // Polymorphism
				p2.printDetails();
				break;

			case 6:
				course.showCourseDetails();
				break;

			case 0:
				System.out.println("Exiting CampusConnect...");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 0);

		sc.close();
	}
}
