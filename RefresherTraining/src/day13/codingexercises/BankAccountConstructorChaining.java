package day13.codingexercises;

class BankAccount {
	String accountHolder;
	double balance;

	BankAccount() {
		this("Unknown");
	}

	BankAccount(String accountHolder) {
		this(accountHolder, 0);
	}

	BankAccount(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	void display() {
		System.out.println("Holder: " + accountHolder);
		System.out.println("Balance: " + balance);
	}
}

class SavingsAccount extends BankAccount {
	double interestRate;

	SavingsAccount(String accountHolder, double balance, double interestRate) {
		super(accountHolder, balance);
		this.interestRate = interestRate;
	}

	void displaySavings() {
		display();
		System.out.println("Interest Rate: " + interestRate + "%");
	}
}

public class BankAccountConstructorChaining {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount("Anupam");
		BankAccount account3 = new BankAccount("Rahul", 5000);

		account1.display();
		System.out.println();

		account2.display();
		System.out.println();

		account3.display();
		System.out.println();

		SavingsAccount savingsAccount = new SavingsAccount("Priya", 10000, 7.5);

		savingsAccount.displaySavings();
	}
}