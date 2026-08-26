package day18.classproblems.customexception;

class CustomExceptionDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {
            account.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}