import java.util.Scanner;
class MultiplicationTable {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking user input of the number whose table is to be printed
		System.out.print("Enter the number whose table is to be printed: ");
		int number = input.nextInt();
		
		//This variable will be helping in modifying the value of the table
		int multiplier = 1;
		
		//Declaring the array and intializing it as well
		int[] multiplicationTable = new int[10];
		
		//filling the values and displaying the result as well
		for (int i = 0; i < multiplicationTable.length; i++) {
			multiplicationTable[i] = number * multiplier;
			System.out.println(number + " * " + multiplier + " = " + multiplicationTable[i]);
			multiplier++;
		}
	}
}