package com.linkedlist.circular.taskscheduler;

import java.util.Scanner;

public class TaskScheduler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TaskCircularList scheduler = new TaskCircularList();
		int choice;

		do {
			System.out.println("\n=== Task Scheduler ===");
			System.out.println("1. Add Task at Beginning");
			System.out.println("2. Add Task at End");
			System.out.println("3. Add Task at Position");
			System.out.println("4. Remove Task by ID");
			System.out.println("5. View Current & Next Task");
			System.out.println("6. Display All Tasks");
			System.out.println("7. Search Task by Priority");
			System.out.println("8. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();
			sc.nextLine();

			int id, priority, pos;
			String name, date;

			switch (choice) {
			case 1:
			case 2:
			case 3:
				if (choice == 3) {
					System.out.print("Position: ");
					pos = sc.nextInt();
					sc.nextLine();
				} else
					pos = 0;

				System.out.print("Task ID: ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.print("Task Name: ");
				name = sc.nextLine();
				System.out.print("Priority: ");
				priority = sc.nextInt();
				sc.nextLine();
				System.out.print("Due Date: ");
				date = sc.nextLine();

				if (choice == 1)
					scheduler.addAtBeginning(id, name, priority, date);
				else if (choice == 2)
					scheduler.addAtEnd(id, name, priority, date);
				else
					scheduler.addAtPosition(pos, id, name, priority, date);
				break;

			case 4:
				System.out.print("Task ID: ");
				scheduler.removeById(sc.nextInt());
				break;

			case 5:
				scheduler.viewNextTask();
				break;

			case 6:
				scheduler.displayAll();
				break;

			case 7:
				System.out.print("Priority: ");
				scheduler.searchByPriority(sc.nextInt());
				break;

			case 8:
				System.out.println("Exiting scheduler...");
				break;

			default:
				System.out.println("Invalid choice.");
			}

		} while (choice != 8);

		sc.close();
	}
}
