package day2.classproblems;

import java.util.Stack;

public class InfixToPostfix {

	// Method to return the precedence of operators
	static int precedence(char ch) {
		if (ch == '+' || ch == '-') {
			return 1;
		} else if (ch == '*' || ch == '/') {
			return 2;
		} else if (ch == '^') {
			return 3;
		}
		return -1;
	}

	// Method to convert infix to postfix
	static String infixToPostfix(String infix) {

		Stack<Character> stack = new Stack<>();
		StringBuilder postfix = new StringBuilder();

		for (int i = 0; i < infix.length(); i++) {

			char ch = infix.charAt(i);

			// Operand
			if (Character.isLetterOrDigit(ch)) {
				postfix.append(ch);
			}

			// Opening the parenthesis
			else if (ch == '(') {
				stack.push(ch);
			}

			// Closing the parenthesis
			else if (ch == ')') {

				while (!stack.isEmpty() && stack.peek() != '(') {
					postfix.append(stack.pop());
				}

				// Removing '('
				if (!stack.isEmpty()) {
					stack.pop();
				}
			}

			// Operators
			else {

				while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
					postfix.append(stack.pop());
				}

				stack.push(ch);
			}
		}

		// Popping the remaining operators
		while (!stack.isEmpty()) {
			postfix.append(stack.pop());
		}

		return postfix.toString();
	}

	public static void main(String[] args) {

		String infix = "A+B*(C-D)/E";

		// Printing the result
		System.out.println("Infix   : " + infix);
		System.out.println("Postfix : " + infixToPostfix(infix));
	}
}