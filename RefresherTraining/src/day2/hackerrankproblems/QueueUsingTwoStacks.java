package day2.hackerrankproblems;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();

		// Stack for enqueue operations
		Stack<Integer> inputStack = new Stack<>();

		// Stack for dequeue/peek operations
		Stack<Integer> outputStack = new Stack<>();

		while (q-- > 0) {

			int type = sc.nextInt();

			if (type == 1) {

				// Enqueue element
				int value = sc.nextInt();
				inputStack.push(value);

			} else if (type == 2) {

				// Transferring the elements if output stack is empty
				if (outputStack.isEmpty()) {
					while (!inputStack.isEmpty()) {
						outputStack.push(inputStack.pop());
					}
				}

				// Dequeue front element
				outputStack.pop();

			} else if (type == 3) {

				// Transferring the elements if output stack is empty
				if (outputStack.isEmpty()) {
					while (!inputStack.isEmpty()) {
						outputStack.push(inputStack.pop());
					}
				}

				// Printing the front element
				System.out.println(outputStack.peek());
			}
		}

		sc.close();
	}
}