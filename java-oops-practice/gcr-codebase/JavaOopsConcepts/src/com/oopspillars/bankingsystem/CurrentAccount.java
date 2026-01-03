package com.oopspillars.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {
	private static final double INTEREST_RATE = 0.02; // 2%

	public CurrentAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	// Interest calculation for current account
	@Override
	public double calculateInterest() {
		return balance * INTEREST_RATE;
	}

	@Override
	public void applyForLoan(double amount) {
		System.out.println("Current Account Business Loan Applied: ₹" + amount);
	}

	@Override
	public boolean calculateLoanEligibility() {
		return balance >= 100000;
	}
}
