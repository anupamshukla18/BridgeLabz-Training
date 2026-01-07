package com.loanapprovalautomation;

public class HomeLoan extends LoanApplication {
	public HomeLoan(Applicant applicant, int period) {
		super(applicant, period, 8.5); // pass period to parent
	}

	@Override
	public boolean approveLoan() {
		boolean eligible = applicant.getCreditScore() >= 700 && applicant.getIncome() >= 40000;

		setApproved(eligible);
		return eligible;
	}

	@Override
	public double calculateEMI() {
		return emiFormula(1.0);
	}
}
