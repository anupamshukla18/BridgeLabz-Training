import java.util.Scanner;
class CentimetersIntoFeetInches{
	public static void main(String[] args){
		//Declaring and initializing height
		Scanner input = new Scanner(System.in);
		double height = input.nextInt();
		
		double feet = height * 12;
		double inch = (height * 2.54);
		
		//Displaying the result
		System.out.println("Your height in cm is " + height + " while in feet is " + feet + " and inches is " + inch );
	}
}