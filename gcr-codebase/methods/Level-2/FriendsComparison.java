import java.util.Scanner;

public class FriendsComparison {
	// Method to find index of youngest friend
    public static int findYoungest(int[] ages) {
        int minIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to find index of tallest friend
    public static int findTallest(double[] heights) {
        int maxIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            heights[i] = input.nextDouble();
        }

        // Find youngest and tallest
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        // Display results
        System.out.println("\n--- Result ---");
        System.out.println("Youngest Friend: " + friends[youngestIndex] +
                           " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + friends[tallestIndex] +
                           " (Height: " + heights[tallestIndex] + " cm)");
    }
}
