package day1.classproblems;

import java.util.Arrays;

public class ArrayInsertion {
	public static void main(String[] args) {

		int[] arr = {10, 20, 30, 40, 50};
		int size = 5;

		int position = 2;
		int value = 25;

		for (int i = size; i > position; i--) {
			arr[i] = arr[i - 1];
		}

		arr[position] = value;
		size++;

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}