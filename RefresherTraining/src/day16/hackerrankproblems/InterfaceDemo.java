package day16.hackerrankproblems;

import java.util.Scanner;

interface AdvancedArithmetic {
    public int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        AdvancedArithmetic a = new MyCalculator();
        int result = a.divisor_sum(num);
        System.out.println("I implemented: AdvancedArithmetic" + "\n" + result);
    }
}