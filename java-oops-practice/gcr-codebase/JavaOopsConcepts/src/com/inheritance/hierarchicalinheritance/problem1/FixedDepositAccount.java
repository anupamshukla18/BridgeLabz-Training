package com.inheritance.hierarchicalinheritance.problem1;

public class FixedDepositAccount extends BankAccount {
	// Additional Attribute
	private int maturityPeriod;

	// Parameterized Constructor
	public FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
		super(accountNumber, balance);
		this.maturityPeriod = maturityPeriod;
	}

	// Method to display account type
	void displayAccountType() {
		System.out.println("Account Type: Fixed Deposit Account");
		System.out.println("Maturity Period: " + maturityPeriod + " years");
	}
}