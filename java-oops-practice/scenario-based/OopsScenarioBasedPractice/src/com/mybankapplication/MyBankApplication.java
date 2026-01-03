package com.mybankapplication;

public class MyBankApplication {
	public static void main(String[] args) {
		// Polymorphism using Account reference
		Account savings = new SavingsAccount("SB1001", 10000);
		Account current = new CurrentAccount("CA2001", 20000);

		savings.deposit(2000);
		savings.withdraw(1500);

		current.deposit(5000);
		current.withdraw(3000);

		System.out.println("\nSavings Account Balance: ₹" + savings.checkBalance());
		System.out.println("Savings Account Interest: ₹" + savings.calculateInterest());

		System.out.println("\nCurrent Account Balance: ₹" + current.checkBalance());
		System.out.println("Current Account Interest: ₹" + current.calculateInterest());
	}
}
