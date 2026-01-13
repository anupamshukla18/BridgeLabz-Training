import java.util.Random;
import java.util.Scanner;
public class MatrixAdvanced {
	// Create Random Matrix
    public static double[][] createMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);   // values 0 - 9

        return matrix;
    }

    // Transpose Matrix
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] trans = new double[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = matrix[i][j];

        return trans;
    }

    // Determinant of 2x2
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Determinant of 3x3
    public static double determinant3x3(double[][] m) {
        return  m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
              - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
              + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse of 2x2
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);

        if (det == 0) {
            System.out.println("Inverse not possible. Determinant = 0");
            return null;
        }

        double[][] inv = new double[2][2];

        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }

    // Inverse of 3x3
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);

        if (det == 0) {
            System.out.println("Inverse not possible. Determinant = 0");
            return null;
        }

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    // Print Matrix
    public static void printMatrix(double[][] m) {
        for (double[] row : m) {
            for (double v : row)
                System.out.print(v + "\t");
            System.out.println();
        }
        System.out.println();
    }

    // MAIN
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter cols: ");
        int c = sc.nextInt();

        double[][] matrix = createMatrix(r, c);

        System.out.println("\nMatrix:");
        printMatrix(matrix);

        System.out.println("Transpose:");
        double[][] trans = transpose(matrix);
        printMatrix(trans);

        if (r == 2 && c == 2) {
            System.out.println("Determinant (2x2): " + determinant2x2(matrix));
            System.out.println("Inverse (2x2):");
            double[][] inv = inverse2x2(matrix);
            if (inv != null) printMatrix(inv);
        }

        else if (r == 3 && c == 3) {
            System.out.println("Determinant (3x3): " + determinant3x3(matrix));
            System.out.println("Inverse (3x3):");
            double[][] inv = inverse3x3(matrix);
            if (inv != null) printMatrix(inv);
        }

        else {
            System.out.println("Determinant & Inverse only for 2x2 and 3x3 matrices.");
        }
    }
}
