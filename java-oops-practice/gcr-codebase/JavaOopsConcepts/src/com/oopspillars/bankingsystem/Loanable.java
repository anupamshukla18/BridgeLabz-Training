package com.oopspillars.bankingsystem;

public interface Loanable {
	// Apply for loan
	void applyForLoan(double amount);

	// Check loan eligibility
	boolean calculateLoanEligibility();
}
