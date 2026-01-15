package com.sortingalgorithmsscneariobasedproblems.zipzipmart;

import java.util.Scanner;

//Driver class 
public class ZipZipMartReport {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of transactions: ");
		int n = sc.nextInt();
		sc.nextLine(); // consume leftover newline

		Transaction[] transactions = new Transaction[n];

		// Taking user input for transactions
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details for Transaction " + (i + 1));

			System.out.print("Enter Date (YYYY-MM-DD): ");
			String date = sc.nextLine();

			System.out.print("Enter Amount: ");
			double amount = sc.nextDouble();
			sc.nextLine(); // consume newline

			System.out.print("Enter Branch Name: ");
			String branch = sc.nextLine();

			transactions[i] = new Transaction(date, amount, branch);
		}

		int choice;

		do {
			System.out.println("\n====== ZipZipMart Daily Sales Menu ======");
			System.out.println("1. Display All Transactions");
			System.out.println("2. Sort Transactions (Merge Sort)");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("\n--- Transactions List ---");
				for (Transaction t : transactions) {
					t.display();
				}
				break;

			case 2:
				MergeSortUtil.mergeSort(transactions, 0, transactions.length - 1);
				System.out.println("\nTransactions sorted by Date and Amount successfully!!");
				break;

			case 3:
				System.out.println("Exiting ZipZipMart Report System, Thank you!!");
				break;

			default:
				System.out.println("Invalid choice! Please try again");
			}

		} while (choice != 3);

		sc.close();
	}
}

