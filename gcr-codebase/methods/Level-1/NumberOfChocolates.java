import java.util.Scanner;
class NumberOfChocolates {
	public static int[] numberOfChocolatesPerChild(int numberOfChocolates, int numberOfchildren) {
		//Calclating the chocolates per child
		int chocolatesPerchild = numberOfChocolates /  numberOfchildren;
		int chocolatesLeft = numberOfChocolates % numberOfchildren;
		
		// returning the result
		return new int[]{chocolatesPerchild, chocolatesLeft};
	}
	
	public static void main(String[] args) {
		//Creating a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Taking the user input of number of chocolates and students
		System.out.println("Enter the number of chocolates: ");
		int numberOfChocolates = input.nextInt();
		System.out.println("Enter the number of Children: ");
		int numberOfchildren = input.nextInt();
		
		//Calling the method
		int[] result = numberOfChocolatesPerChild(numberOfChocolates, numberOfchildren);
		
		//Displaying the result 
		System.out.println("The number of chocolates each child gets is " + result[0] 
							+ "\nThe number of chocolates left is " + result[1]);
	}
}
		