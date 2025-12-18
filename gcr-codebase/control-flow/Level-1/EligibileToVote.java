import java.util.Scanner;
class EligibileToVote {
	public static void main(String[] args) {
		//Creating a scanner object and taking user input
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		
		//Checking if the person is eligible to vote or not and displaying it too
		if (age >= 18) {
			System.out.println("The person's age is " + age + " and can vote.");
		}
		else {
			System.out.println("The person's age is " + age + " and cannot vote.");
		}
	}
}