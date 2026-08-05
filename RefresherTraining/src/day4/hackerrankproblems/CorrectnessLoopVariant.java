package day4.hackerrankproblems;
import java.util.Scanner;

public class CorrectnessLoopVariant {
    // Insertion Sort
    static void insertionSort(int[] ar) {

        for (int i = 1; i < ar.length; i++) {
            int value = ar[i];
            int j = i - 1;

            // Shift larger elements
            while (j >= 0 && ar[j] > value) {
                ar[j + 1] = ar[j];
                j--;
            }

            // Insert element
            ar[j + 1] = value;
        }

        // Print sorted array
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read input
        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        insertionSort(ar);

        sc.close();
    }
}