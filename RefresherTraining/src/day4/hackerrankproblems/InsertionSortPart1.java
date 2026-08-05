package day4.hackerrankproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSortPart1 {
	public static void insertionSort1(int n, List<Integer> arr) {
        int key = arr.get(n - 1);
        int j = n - 2;
        
        while (j >= 0 && arr.get(j) > key) {
            arr.set(j + 1, arr.get(j));
            
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            
            j--;
        }
        arr.set(j + 1, key);
        
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		insertionSort1(list.size(), list);
	}
}
