package com.budgetwise;

import java.util.Scanner;

public class BudgetWiseApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Budget budget;

		System.out.println("1. Monthly Budget");
		System.out.println("2. Annual Budget");
		System.out.print("Choose budget type: ");
		int type = sc.nextInt();

		System.out.print("Enter income: ");
		double income = sc.nextDouble();

		System.out.print("Enter number of categories: ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] categories = new String[n];
		double[] limits = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Category name: ");
			categories[i] = sc.nextLine();
			System.out.print("Limit: ");
			limits[i] = sc.nextDouble();
			sc.nextLine();
		}

		if (type == 1)
			budget = new MonthlyBudget(income, categories, limits);
		else
			budget = new AnnualBudget(income, categories, limits);

		int choice;
		do {
			System.out.println("\n--- BUDGETWISE MENU ---");
			System.out.println("1. Add Expense");
			System.out.println("2. Generate Report");
			System.out.println("3. Check Overspend");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Amount: ");
				double amt = sc.nextDouble();
				sc.nextLine();

				System.out.print("Category: ");
				String cat = sc.nextLine();

				System.out.print("Date: ");
				String date = sc.nextLine();

				Transaction t = new Transaction(amt, "expense", date, cat);
				budget.addExpense(t);
				break;

			case 2:
				budget.generateReport(); // Polymorphism
				break;

			case 3:
				budget.detectOverspend();
				break;

			case 4:
				System.out.println("Exiting BudgetWise");
				break;

			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 4);

		sc.close();
	}
}
