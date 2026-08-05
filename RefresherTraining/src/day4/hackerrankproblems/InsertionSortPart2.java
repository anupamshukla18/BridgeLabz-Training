package day4.hackerrankproblems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSortPart2 {

    public static void insertionSort2(int n, List<Integer> arr) {

        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }

            arr.set(j + 1, key);

            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        insertionSort2(n, list);

        sc.close();
    }
}