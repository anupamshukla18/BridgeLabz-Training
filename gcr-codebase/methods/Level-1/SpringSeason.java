public class SpringSeason {
    static boolean isSpring(int month, int day) {
		// Checking if it is a srpring season
        if ((month == 3 && day >= 20 && day <= 31) ||   // March 20 to March 31
			(month == 4 && day >= 1 && day <= 30) ||    // April 1 to April 30
			(month == 5 && day >= 1 && day <= 31) ||    // May 1 to May 31
			(month == 6 && day >= 1 && day <= 20)) {    // June 1 to June 20
            return true;
        }

        // Otherwise not spring season
        return false;
    }

    public static void main(String[] args) {
		// Take month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check and print result
        if (isSpring(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}