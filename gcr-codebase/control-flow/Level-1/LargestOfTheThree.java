import java.util.Scanner;
class LargestOfTheThree {
	public static void main(String[] args) {
		//Creating a Scanner object and taking user input 
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		//Checking if the first number is the largest or not and displaying the result
		if (number1 > number2 && number1 > number3) {
			System.out.println("Is the first number the largest? Yes" 
			+ "\nIs the second number the largest? No" 
			+ "\nIs the third number the largest? No");
		} else if (number2 > number1 && number2 > number3){
			System.out.println("Is the first number the largest? No" 
			+ "\nIs the second number the largest? Yes" 
			+ "\nIs the third number the largest? No");
		} else {
			System.out.println("Is the first number the largest? No" 
			+ "\nIs the second number the largest? No" 
			+ "\nIs the third number the largest? Yes");
		}
	}
}