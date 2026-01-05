package com.linkedlist.singly.studentrecordmanagement;

import java.util.*;

public class StudentRecordManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentLinkedList list = new StudentLinkedList();
		int choice;

		do {
			System.out.println("\n==== Student Record Management ====");
			System.out.println("1. Add Student at Beginning");
			System.out.println("2. Add Student at End");
			System.out.println("3. Add Student at Specific Position");
			System.out.println("4. Delete Student by Roll Number");
			System.out.println("5. Search Student by Roll Number");
			System.out.println("6. Update Student Grade");
			System.out.println("7. Display All Students");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			int roll, age, position;
			char grade;
			String name;

			switch (choice) {
			case 1:
				System.out.print("Roll Number: ");
				roll = sc.nextInt();
				sc.nextLine();
				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.print("Age: ");
				age = sc.nextInt();
				System.out.print("Grade: ");
				grade = sc.next().charAt(0);
				list.addAtBeginning(roll, name, age, grade);
				break;

			case 2:
				System.out.print("Roll Number: ");
				roll = sc.nextInt();
				sc.nextLine();
				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.print("Age: ");
				age = sc.nextInt();
				System.out.print("Grade: ");
				grade = sc.next().charAt(0);
				list.addAtEnd(roll, name, age, grade);
				break;

			case 3:
				System.out.print("Position: ");
				position = sc.nextInt();
				System.out.print("Roll Number: ");
				roll = sc.nextInt();
				sc.nextLine();
				System.out.print("Name: ");
				name = sc.nextLine();
				System.out.print("Age: ");
				age = sc.nextInt();
				System.out.print("Grade: ");
				grade = sc.next().charAt(0);
				list.addAtPosition(position, roll, name, age, grade);
				break;

			case 4:
				System.out.print("Enter Roll Number to delete: ");
				roll = sc.nextInt();
				list.deleteByRoll(roll);
				break;

			case 5:
				System.out.print("Enter Roll Number to search: ");
				roll = sc.nextInt();
				list.searchByRoll(roll);
				break;

			case 6:
				System.out.print("Enter Roll Number: ");
				roll = sc.nextInt();
				System.out.print("Enter New Grade: ");
				grade = sc.next().charAt(0);
				list.updateGrade(roll, grade);
				break;

			case 7:
				list.displayAll();
				break;

			case 8:
				System.out.println("Exiting program...");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 8);

		sc.close();
	}
}
