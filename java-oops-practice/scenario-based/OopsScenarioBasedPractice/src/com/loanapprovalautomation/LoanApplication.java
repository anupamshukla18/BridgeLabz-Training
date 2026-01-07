package com.loanapprovalautomation;

public abstract class LoanApplication implements IApprovable {
    protected Applicant applicant;
    protected int term;
    protected double interestRate;

    private boolean approved;

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
    }

    protected void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    // MUST be protected (NOT private)
    protected double emiFormula(double rateMultiplier) {

        double P = applicant.getLoanAmount();
        double R = (interestRate / 12 / 100) * rateMultiplier;
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
