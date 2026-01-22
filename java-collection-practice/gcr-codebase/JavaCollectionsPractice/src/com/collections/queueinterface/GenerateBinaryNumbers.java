package com.collections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
	public static void main(String[] args) {
		int n = 5;

		Queue<String> queue = new LinkedList<>();

		// Step 1: Start with "1"
		queue.add("1");

		// Step 2: Generate binary numbers
		for (int i = 0; i < n; i++) {

			String current = queue.remove();
			System.out.print(current + " ");

			queue.add(current + "0");
			queue.add(current + "1");
		}
	}
}
