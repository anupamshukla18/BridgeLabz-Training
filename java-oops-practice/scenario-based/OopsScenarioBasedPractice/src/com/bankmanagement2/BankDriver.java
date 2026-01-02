package com.bankmanagement2;

public class BankDriver {
	public static void main(String[] args) {
		// Savings Account customer
		SavingsAccount savingsAccount = new SavingsAccount(5000, 5);
		Customer customer1 = new Customer("Rohan", savingsAccount);
		customer1.depositMoney(2000);
		customer1.withdrawMoney(1000);
		savingsAccount.calculateInterest();
		customer1.showBalance();

		System.out.println();

		// Current Account customer
		CurrentAccount currentAccount = new CurrentAccount(3000);
		Customer customer2 = new Customer("Amit", currentAccount);
		customer2.depositMoney(1000);
		customer2.withdrawMoney(500);
		customer2.showBalance();
	}
}
