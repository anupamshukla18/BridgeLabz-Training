package day2.classproblems.stackusingarray;

public class StackMain {
	public static void main(String[] args) throws StackException {
		CustomStack stack = new CustomStack(5);
		
		// Pushing the elements 
		stack.push(34);
		stack.push(45);
		stack.push(2);
		stack.push(9);
		stack.push(18);

		// Popping the elements out
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//      System.out.println(stack.pop());
		
		// Peek operation
		System.out.println(stack.peek());

	}
}