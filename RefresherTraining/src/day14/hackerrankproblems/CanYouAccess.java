package day14.hackerrankproblems;
import java.io.*;
import java.util.*;

public class CanYouAccess {

    static class Inner {

        private class Private {

            private void powerof2(int number) {

                if ((number & (number - 1)) == 0) {
                    System.out.println(number + " is power of 2");
                } else {
                    System.out.println(number + " is not a power of 2");
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        Inner inner = new Inner();
        Inner.Private privateObject = inner.new Private();

        privateObject.powerof2(number);

        System.out.println(
                "An instance of class: "
                + privateObject.getClass().getName()
                + " has been created"
        );

        scanner.close();
    }
}