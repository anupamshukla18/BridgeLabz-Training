package com.mybankapplication;

class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 4.0; // 4%

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }
}
