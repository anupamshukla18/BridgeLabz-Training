package com.exceptionhandling.banktransactionsystem;

public class BankAccountExample {

	private double balance = 5000.0;

	// withdraw amount
	public void withdraw(double amount) throws InsufficientBalanceException {

		if (amount < 0) {
			throw new IllegalArgumentException("Invalid amount!");
		}

		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance!");
		}

		balance -= amount;
		System.out.println("Withdrawal successful, new balance: " + balance);
	}

	public static void main(String[] args) {

		BankAccountExample account = new BankAccountExample();

		try {
			account.withdraw(6000);

		} catch (InsufficientBalanceException exception) {
			// handle insufficient balance
			System.out.println(exception.getMessage());

		} catch (IllegalArgumentException exception) {
			// handle invalid amount
			System.out.println(exception.getMessage());
		}
	}
}
