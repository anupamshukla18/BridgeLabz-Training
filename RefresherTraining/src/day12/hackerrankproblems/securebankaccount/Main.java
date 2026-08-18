package day12.hackerrankproblems.securebankaccount;

import day12.hackerrankproblems.DifferentPackage;

public class Main {
	public static void main(String[] args) {

		BankAccount account = new BankAccount(1000, "Savings", "BPL101");

		System.out.println(account.getBalance());

		account.deposit(500);
		account.withdraw(300);
		account.withdraw(2000);

		SamePackage samePackage = new SamePackage();
		samePackage.showAccess(account);

		DifferentPackage differentPackage = new DifferentPackage();
		differentPackage.showAccess(account);

		// account.balance = -500;
	}
}