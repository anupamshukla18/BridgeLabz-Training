package day17.classproblems;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        String str = "8603582674";
        String regex = "^[6-9]\\d{9}$";

        System.out.println(str.matches(regex));
    }
}
