package day8.classproblems;

import java.util.Scanner;

public class MutualRecursion {
	public static boolean isEven(int n) {
		if (n == 0)
			return true;

		return isOdd(n - 1);
	}

	public static boolean isOdd(int n) {
		if (n == 0)
			return false;

		return isEven(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		if (isEven(n))
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		sc.close();
	}
}