/*
14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.Scanner;

class MovieTicketBooking {
	public static void main(String[] args) {
		//Creating a scanner object 
		Scanner input = new Scanner(System.in);
		boolean moreCustomers = true;
		
		//loop for multiple customers
		while(moreCustomers) {
			System.out.println("Welcome to Movie Ticket Booking");
			System.out.println("Enter your movie type : ");
			System.out.println("1-> Horror");
			System.out.println("2-> Romance");
			System.out.println("3-> Comedy");
			System.out.print("Enter your choice: ");
			int movieChoice = input.nextInt();
			
			String movieType = "";
			int ticketPrice = 0;
			switch(movieChoice) {
				case 1 :
					movieType = "Horror";
					ticketPrice += 190;
					break;
				case 2 :
					movieType = "Romance";
					ticketPrice += 200;
					break;
				case 3 :
					movieType = "Comedy";
					ticketPrice += 210;
					break;
				default :
					System.out.println("Invalid Input!!");
					continue;
			}
			 
			//For choosing seat type
			System.out.println("Choose seat Type (Gold/Silver)?");
			String seatType = input.next().toLowerCase();
			
			if (seatType.equals("gold")) {
				ticketPrice += 100;
			} else if (seatType.equals("silver")) {
				ticketPrice += 50;
			} else {
				System.out.println("Invalid input!!! defaulting it to silver");
				ticketPrice += 50;
			}
			
			//For giving snack choices
			System.out.println("Do you want snacks(yes/no)?");
			String snackChoice = input.next().toLowerCase();

            if (snackChoice.equals("yes")) {
                ticketPrice += 120;
            }

            System.out.println("\n----- Booking Summary -----");
            System.out.println("Movie Type: " + movieType);
            System.out.println("Seat Type: " + seatType);
            System.out.println("Snacks Added: " + snackChoice);
            System.out.println("Total Ticket Price: " + ticketPrice);
            System.out.println("---------------------------\n");

            System.out.println("Next Customer? (yes/no): ");
            String next = input.next().toLowerCase();

            if (!next.equals("yes")) {
                moreCustomers = false;
                System.out.println("Booking Closed. Thank You!");
            }
        }

        input.close();
    }
}

	