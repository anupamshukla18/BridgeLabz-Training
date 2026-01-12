package com.texteditor;

import java.util.Scanner;

public class TextEditorApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TextEditor editor = new TextEditor();

		while (true) {

			System.out.println("\n===== Text Editor Menu =====");
			System.out.println("1. Insert Text");
			System.out.println("2. Delete Characters");
			System.out.println("3. Undo");
			System.out.println("4. Redo");
			System.out.println("5. Display Text");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");

			String input = sc.nextLine();
			int choice;

			try {
				choice = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Enter a valid number.");
				continue;
			}

			switch (choice) {

			case 1:
				System.out.print("Enter text to insert: ");
				editor.insert(sc.nextLine());
				break;

			case 2:
				System.out.print("Enter number of characters to delete: ");
				int n = Integer.parseInt(sc.nextLine());
				editor.delete(n);
				break;

			case 3:
				editor.undo();
				break;

			case 4:
				editor.redo();
				break;

			case 5:
				editor.display();
				break;

			case 0:
				System.out.println("Exiting Text Editor...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
