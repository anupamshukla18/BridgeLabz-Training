package day18.classproblems.customexception;

class BankAccount {

    private double balance = 5000;

    void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                "Insufficient balance"
            );
        }

        balance -= amount;

        System.out.println("Withdrawal successful");
    }
}