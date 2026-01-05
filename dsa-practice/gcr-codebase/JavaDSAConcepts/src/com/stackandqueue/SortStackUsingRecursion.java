package com.stackandqueue;

import java.util.Stack;

public class SortStackUsingRecursion {
    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        // Base case: if stack is empty
        if (stack.isEmpty()) {
            return;
        }

        // Step 1: Pop the top element
        int top = stack.pop();

        // Step 2: Sort remaining stack
        sortStack(stack);

        // Step 3: Insert popped element at correct position
        insertSorted(stack, top);
    }

    // Function to insert element in sorted order
    private static void insertSorted(Stack<Integer> stack, int element) {
        // Base case: stack empty or element greater than top
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Pop top and recurse
        int top = stack.pop();
        insertSorted(stack, element);

        // Push back the popped element
        stack.push(top);
    }

    // Driver code
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
