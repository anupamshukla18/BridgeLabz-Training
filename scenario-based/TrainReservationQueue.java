/*
12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/

import java.util.Scanner;

class TrainReservationQueue {
	public static void main(String[] args) {
		//Creating a scanner object
		Scanner input = new Scanner(System.in);
		
		//initializing a variable for counting and keeping the record of total seats
		int totalSeats = 5;
		int count = 0;
		
		//displaying the options for reservation System
		System.out.println("---Welcome to the Train Reservation---" +
							"\n 1-> Book ticket" +
							"\n 2-> Cancel Ticket" +
							"\n 3-> Show availability" +
						    "\n 4-> Exit");
		
		//displaying the menu for the reservation process using loop and switch statement
		while (true) {
			System.out.println("Enter your choice: ");
			int choice = input.nextInt();
			
			switch (choice) {
				case 1 -> {
					if (totalSeats != 0) {
						System.out.println("Your ticket has been booked sucessfully");
						totalSeats--;
					} else {
						System.out.println("Sorry, there are no seats available!!");
					}
				}
				case 2 -> {
					if (totalSeats != 0) {
						totalSeats++;
						System.out.println("Your ticket has been Cancelled!");
					}
				}
				case 3 -> {
					System.out.println("There are " + totalSeats + " seats available");
				}
				case 4 -> {
					System.out.println("Thank you for choosing us!!");
					return;
				}
			}
		}
	}
}