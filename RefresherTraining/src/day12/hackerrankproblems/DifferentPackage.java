package day12.hackerrankproblems;

import day12.hackerrankproblems.securebankaccount.BankAccount;

public class DifferentPackage {

    public void showAccess(BankAccount account) {
        System.out.println("Balance: " + account.getBalance());
    }
}