package day17.classproblems;

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        String pass = "Hello@123";
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

        System.out.println(pass.matches(regex));
    }
}
