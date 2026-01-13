package com.budgetwise;

// Annual budget report
class AnnualBudget extends Budget {

	AnnualBudget(double income, String[] categories, double[] limits) {
		super(income, categories, limits);
	}

	public void generateReport() {
		System.out.println("\n--- ANNUAL REPORT ---");
		System.out.println("Yearly Income: " + income);
		System.out.println("Yearly Expenses: " + totalExpenses);
		System.out.println("Net Savings: " + calculateSavings());
	}
}
