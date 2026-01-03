package com.mybankapplication;

//Interface defining banking operations
interface ITransaction {
	// for depositing the money
	void deposit(double amount);

	// for withdrawing the money
	void withdraw(double amount);

	// for checking the balance
	double checkBalance();
}
