class SpringSeason {
	public static void main(String[] args) {
		//Taking month and from command line arguments 
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		
		//Variable to store whether it is spring season or not 
		boolean isSpring = false;
		
		//spring season ranges from March 20 to June 20
		if ((month == 3 && day >= 20 && day <= 31) ||   // March 20 — March 31
            (month == 4 && day >= 1 && day <= 30)  ||   // April full month
            (month == 5 && day >= 1 && day <= 31)  ||   // May full month
            (month == 6 && day >= 1 && day <= 20))		// June 1 - June 20
		{
			isSpring = true;
		}
		if (isSpring) {
			System.out.println("Its a Spring Season");
		} else {
			System.out.println("Not a Spring Season");
		}
	}
}