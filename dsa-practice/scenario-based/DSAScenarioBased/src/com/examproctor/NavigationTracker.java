package com.examproctor;

import java.util.Stack;

// This class tracks question navigation using Stack
public class NavigationTracker {

	private Stack<Integer> stack = new Stack<>();

	// Adds visited question to stack
	public void visitQuestion(int questionId) {
		stack.push(questionId);
	}

	// Shows navigation history
	public void showHistory() {
		System.out.println("Navigation History: " + stack);
	}
}
