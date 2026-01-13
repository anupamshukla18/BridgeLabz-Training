import java.util.Scanner;

class ParkingLotGameSystem{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Initializing the maxCapacity and parkingCount
	    int maxCapacity = 5;
		int parkingCount = 0;
		
		//Iterating the loop till user quits
		while (true) {
			System.out.println("\nEnter your choice: " +
								"\n1-> Park" +
								"\n2-> Exit" +
								"\n3-> Show Occupancy" + 
								"\n4-> Quit");
			int choice = input.nextInt();
			
			//Switch for the user menu 
			switch(choice) {
				case 1:
					if (parkingCount != maxCapacity) {
						System.out.println("Ok, parking your vehicle");
						parkingCount++;
					} else {
						System.out.println("Sorry, the parking is full!!");
						break;
					}
					break;
				case 2:
					System.out.println("Thank you for choosing us");
					parkingCount--;
					break;
				case 3:
					System.out.println("There are " + parkingCount + " vehicles already parked and the maximum capacity of parking is " + maxCapacity );
					break;
				case 4: 
					System.out.println("Thank you for choosing us!!");
					return;
				default: 
					System.out.println("You've choosen an invalid option!!!");
					continue; //Skipping the iteration
			}	
		}
	}
}
		
	