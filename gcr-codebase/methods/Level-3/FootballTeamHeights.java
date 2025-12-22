import java.util.Arrays;

public class FootballTeamHeights {
	// Method to find sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int h : heights) {
            if (h < shortest) {
                shortest = h;
            }
        }
        return shortest;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int h : heights) {
            if (h > tallest) {
                tallest = h;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];

        // Generate random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; 
            // Math.random()*101 -> 0 to 100
            // +150 -> 150 to 250
        }

        System.out.println("Players' Heights (cm): " + Arrays.toString(heights));

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\n------- Result -------");
        System.out.println("Total Sum of Heights = " + sum + " cm");
        System.out.println("Mean Height = " + mean + " cm");
        System.out.println("Shortest Player Height = " + shortest + " cm");
        System.out.println("Tallest Player Height = " + tallest + " cm");
    }
}
