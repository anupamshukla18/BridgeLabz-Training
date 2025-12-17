import java.util.Scanner;

public class AdditionOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your First Number:");
		int num1 = sc.nextInt();
		System.out.print("Enter your Second Number:");
		int num2 = sc.nextInt();
		System.out.println("Addition: "+(num1 + num2));
	}
}