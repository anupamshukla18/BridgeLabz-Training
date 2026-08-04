package day2.classproblems;

import java.util.Stack;

public class BalancedParenthesis {

	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();

		// Processing the result
		for (char ch : str.toCharArray()) {
			
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			
			else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String str = "{[()]}";

		// Checking whether the expression is balanced or not
		if (isBalanced(str)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}
}