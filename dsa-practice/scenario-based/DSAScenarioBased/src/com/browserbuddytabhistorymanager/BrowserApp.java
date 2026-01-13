package com.browserbuddytabhistorymanager;

import java.util.Scanner;

public class BrowserApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BrowserManager browser = new BrowserManager();

		while (true) {
			System.out.println("\n=== BrowserBuddy Menu ===");
			System.out.println("1. Visit Page");
			System.out.println("2. Back");
			System.out.println("3. Forward");
			System.out.println("4. Close Tab");
			System.out.println("5. Reopen Last Closed Tab");
			System.out.println("6. Exit");
			System.out.print("Choose: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter URL: ");
				String url = sc.nextLine();
				browser.openPage(url);
				break;

			case 2:
				browser.back();
				break;

			case 3:
				browser.forward();
				break;

			case 4:
				browser.closeTab();
				break;

			case 5:
				browser.reopenTab();
				break;

			case 6:
				System.out.println("Exiting BrowserBuddy...");
				return;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
