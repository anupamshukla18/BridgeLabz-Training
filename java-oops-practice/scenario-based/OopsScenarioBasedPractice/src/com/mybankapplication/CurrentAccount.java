package com.mybankapplication;

class CurrentAccount extends Account {
    private static final double INTEREST_RATE = 1.5; // 1.5%

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    public CurrentAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }
}
