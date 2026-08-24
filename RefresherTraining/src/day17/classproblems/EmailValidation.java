package day17.classproblems;

public class EmailValidation {
    public static void main(String[] args) {
        String email = "anupam@gmail.com";
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        System.out.println(email.matches(regex));
    }
}
