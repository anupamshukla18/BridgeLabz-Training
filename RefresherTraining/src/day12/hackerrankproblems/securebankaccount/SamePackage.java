package day12.hackerrankproblems.securebankaccount;

public class SamePackage {

    public void showAccess(BankAccount account) {
        System.out.println("Account Type: " + account.accountType);
        System.out.println("Branch Code: " + account.branchCode);
        System.out.println("Balance: " + account.getBalance());
    }
}