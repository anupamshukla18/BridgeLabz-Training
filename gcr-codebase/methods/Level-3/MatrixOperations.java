import java.util.Random;
import java.util.Scanner;
public class MatrixOperations {
	// Method to create random matrix
    public static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
		
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);   // 0-9 random values

        return matrix;
    }

    // Method to add matrices
    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];

        return result;
    }

    // Method to subtract matrices
    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];

        return result;
    }

    // Method to multiply matrices
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += A[i][k] * B[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    // Method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns for Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and columns for Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] A = createMatrix(r1, c1);
        int[][] B = createMatrix(r2, c2);

        System.out.println("\nMatrix A:");
        printMatrix(A);

        System.out.println("Matrix B:");
        printMatrix(B);

        // Addition & Subtraction allowed only if dimensions match
        if (r1 == r2 && c1 == c2) {
            System.out.println("Addition Result:");
            printMatrix(addMatrix(A, B));

            System.out.println("Subtraction Result (A - B):");
            printMatrix(subtractMatrix(A, B));
        } else {
            System.out.println("Addition & Subtraction NOT possible (Matrix size mismatch)");
        }

        // Multiplication allowed only if A columns = B rows
        if (c1 == r2) {
            System.out.println("Multiplication Result (A x B):");
            printMatrix(multiplyMatrix(A, B));
        } else {
            System.out.println("Multiplication NOT possible (A columns != B rows)");
        }

        sc.close();
    }
}
