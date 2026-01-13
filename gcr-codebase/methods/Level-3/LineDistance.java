import java.util.Scanner;
public class LineDistance {
	// Method to find Euclidean Distance
    public static double findDistance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(
                Math.pow((x2 - x1), 2) +
                Math.pow((y2 - y1), 2)
        );
        return distance;
    }

    // Method to find slope and y-intercept
    // returns array {m, b}
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {

        double m = (double)(y2 - y1) / (x2 - x1);  // slope
        double b = y1 - (m * x1);                 // y-intercept

        return new double[]{m, b};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 and y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter x2 and y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean Distance = " + distance);

        double[] result = findLineEquation(x1, y1, x2, y2);

        System.out.println("Slope (m) = " + result[0]);
        System.out.println("Y-Intercept (b) = " + result[1]);

        System.out.println("\nEquation of Line:  y = " + result[0] + "x + " + result[1]);
    }
}
