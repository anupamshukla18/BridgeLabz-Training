package day2.hackerrankproblems;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();

		StringBuilder text = new StringBuilder();
		Stack<String> history = new Stack<>();

		while (q-- > 0) {

			int type = sc.nextInt();

			switch (type) {

			case 1:
				// Saving the current state and appending the text
				history.push(text.toString());
				String str = sc.next();
				text.append(str);
				break;

			case 2:
				// Saving the current state and deleting the last k characters
				history.push(text.toString());
				int k = sc.nextInt();
				text.delete(text.length() - k, text.length());
				break;

			case 3:
				// Printing the kth character (1-based index)
				int index = sc.nextInt();
				System.out.println(text.charAt(index - 1));
				break;

			case 4:
				// Restoring the previous state
				text = new StringBuilder(history.pop());
				break;
			}
		}

		sc.close();
	}
}