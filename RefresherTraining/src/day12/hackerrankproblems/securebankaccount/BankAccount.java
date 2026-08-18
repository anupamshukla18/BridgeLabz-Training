package day12.hackerrankproblems.securebankaccount;

public class BankAccount {

	private double balance;
	protected String accountType;
	String branchCode;

	public BankAccount(double balance, String accountType, String branchCode) {
		this.balance = balance < 0 ? 0 : balance;
		this.accountType = accountType;
		this.branchCode = branchCode;
	}

	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Deposit cannot be negative.");
			return;
		}

		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount < 0 || amount > balance) {
			System.out.println("Withdrawal rejected.");
			return;
		}

		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}
}