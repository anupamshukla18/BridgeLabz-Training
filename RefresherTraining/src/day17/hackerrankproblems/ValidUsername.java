package day17.hackerrankproblems;

import java.util.*;

public class ValidUsername {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfUsernames = sc.nextInt();

        String usernamePattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

        for (int i = 0; i < numberOfUsernames; i++) {

            String username = sc.next();

            if (username.matches(usernamePattern)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        sc.close();
    }
}