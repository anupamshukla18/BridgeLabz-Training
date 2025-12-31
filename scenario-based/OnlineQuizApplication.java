/*
17. Online Quiz Application 
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;

class OnlineQuizApplication {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Storing questions in the array;
		String[] questions = {"1. What is the size of int? \nA. 4 bytes \nB. 2 bytes \nC. 1 byte \nD. 3 bytes" ,
							"2. What is the size of float? \nA. 4 bytes \nB. 2 bytes \nC. 1 byte \nD. 8 bytes" ,
							"3. What is the size of double? \nA. 4 bytes \nB. 8 bytes \nC. 1 byte \nD. 2 bytes" ,
							"4. What is the size of long? \nA. 4 bytes \nB. 2 bytes \nC. 1 byte \nD. 8 bytes" ,
							"5. Which keyword is used in inheritance? \nA. implements \nB. ammends \nC. extends \nD. commits"};
		
		//initializing a char array for storing the answers
		char[] answers = {'A','A','B','D','C'};
		//initializing a variable for calculating the answers
		int score = 0;
		
		//Now printing the questions using for-loop
		for (int i = 0; i < questions.length; i++) {
			
			System.out.println(questions[i] + "\nEnter your answer(A/B/C/D):");
			char userAnswer = input.next().toUpperCase().charAt(0);
			
			switch (userAnswer) {

                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Wrong! Correct answer is: " + answers[i]);
                    }
                    break;

                default:
                    System.out.println("Invalid option! No marks awarded.");
            }
		}
		
		//Displaying the score
	    System.out.println("Your final score: " + score);
	}
}