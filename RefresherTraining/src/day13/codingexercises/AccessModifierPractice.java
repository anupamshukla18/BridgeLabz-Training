package day13.codingexercises;

class Account {
	private double balance;

	Account(double balance) {
		this.balance = balance;
	}

	protected double getBalance() {
		return balance;
	}
}

class CurrentAccount extends Account {
	CurrentAccount(double balance) {
		super(balance);
	}

	void displayBalance() {

		// System.out.println(balance); // Error: balance has private access

		System.out.println("Balance: " + getBalance());
	}
}

public class AccessModifierPractice {
	public static void main(String[] args) {
		CurrentAccount account = new CurrentAccount(50000);

		account.displayBalance();
	}
}