import java.util.Scanner;
class DivisibilityCheck {
	public static void main(String[] args) {
		//Created a scanner Object and taking the user input
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number % 5 == 0) {
			System.out.println("Is the number " + number + " divisible by 5? Yes");
		} else {
			System.out.println("Is the number " + number + " divisible by 5? No");
		}
	}
}