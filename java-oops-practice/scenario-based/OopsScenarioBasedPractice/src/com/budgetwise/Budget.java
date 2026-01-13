package com.budgetwise;

// Base budget class
abstract class Budget implements IAnalyzable {
	protected double income;
	protected double totalExpenses;
	protected String[] categories;
	protected double[] categoryLimits;
	protected double[] categorySpent;

	// Constructor for custom categories
	Budget(double income, String[] categories, double[] limits) {
		this.income = income;
		this.categories = categories;
		this.categoryLimits = limits;
		this.categorySpent = new double[categories.length];
		this.totalExpenses = 0;
	}

	// Add expense (Encapsulation: no direct editing)
	void addExpense(Transaction t) {
		if (!t.getType().equalsIgnoreCase("expense"))
			return;

		totalExpenses += t.getAmount();

		for (int i = 0; i < categories.length; i++) {
			if (categories[i].equalsIgnoreCase(t.getCategory())) {
				categorySpent[i] += t.getAmount();
			}
		}
	}

	// Operator usage
	double calculateSavings() {
		return income - totalExpenses;
	}

	// Detect overspending
	public void detectOverspend() {
		for (int i = 0; i < categories.length; i++) {
			if (categorySpent[i] > categoryLimits[i]) {
				System.out.println("Overspent in " + categories[i]);
			}
		}
	}

	// Polymorphic method
	public abstract void generateReport();
}
