import java.util.Scanner;
class FirstSmallestNumber {
	public static void main(String[] args) {
		//Creating a Scanner object and taking user input 
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		//Checking if the first number is the smallest or not and displaying the result
		if (number1 < number2 && number1 < number3) {
			System.out.println("Is the first number the smallest? " + "Yes");
		} else {
			System.out.println("Is the first number the smallest? " + "No");
		}
	}
}