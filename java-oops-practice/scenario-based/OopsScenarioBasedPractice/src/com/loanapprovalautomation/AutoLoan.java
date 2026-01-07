package com.loanapprovalautomation;

public class AutoLoan extends LoanApplication {
	public AutoLoan(Applicant applicant, int period) {
		super(applicant, period, 10.5);
	}

	@Override
	public boolean approveLoan() {
		boolean eligible = applicant.getCreditScore() >= 650 && applicant.getIncome() >= 25000;

		setApproved(eligible);
		return eligible;
	}

	@Override
	public double calculateEMI() {
		return emiFormula(1.1);
	}
}
