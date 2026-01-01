package com.inheritance.hierarchicalinheritance.problem1;

public class BankAccountDriver {
	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount(101, 50000, 4.5);
		System.out.println("Savings Account Details:");
		savings.displayAccountDetails();
		savings.displayAccountType();

		System.out.println();

		CheckingAccount checking = new CheckingAccount(202, 30000, 20000);
		System.out.println("Checking Account Details:");
		checking.displayAccountDetails();
		checking.displayAccountType();

		System.out.println();

		FixedDepositAccount fd = new FixedDepositAccount(303, 100000, 5);
		System.out.println("Fixed Deposit Account Details:");
		fd.displayAccountDetails();
		fd.displayAccountType();
	}
}