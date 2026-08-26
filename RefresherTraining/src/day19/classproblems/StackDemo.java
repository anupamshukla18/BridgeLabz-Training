package day19.classproblems;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(78);
        stack.push(90);
        stack.push(100);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
