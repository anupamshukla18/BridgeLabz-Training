package com.budgetwise;

// Monthly budget report
class MonthlyBudget extends Budget {

	MonthlyBudget(double income, String[] categories, double[] limits) {
		super(income, categories, limits);
	}

	public void generateReport() {
		System.out.println("\n--- MONTHLY REPORT ---");
		System.out.println("Income: " + income);
		System.out.println("Expenses: " + totalExpenses);
		System.out.println("Savings: " + calculateSavings());
	}
}
