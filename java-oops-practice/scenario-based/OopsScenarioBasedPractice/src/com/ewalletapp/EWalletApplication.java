package com.ewalletapp;

public class EWalletApplication {
	public static void main(String[] args) {

		// Users with different wallet types
		User user1 = new User("Anuj", new PersonalWallet(100));
		User user2 = new User("Rahul", new BusinessWallet());

		// Load money
		user1.getWallet().loadMoney(3000);
		user2.getWallet().loadMoney(5000);

		//  same method, different logic
		user1.getWallet().transferTo(user2, 2000);
		user2.getWallet().transferTo(user1, 1000);

		// Display balances
		System.out.println("\nBalances:");
		System.out.println("Anupam Balance  : ₹" + user1.getWallet().getBalance());
		System.out.println("Anuj Balance : ₹" + user2.getWallet().getBalance());

		// Transaction history
		System.out.println("\nAnupam Transactions:");
		user1.getWallet().viewTransactions();

		System.out.println("\nAnuj Transactions:");
		user2.getWallet().viewTransactions();
	}
}
