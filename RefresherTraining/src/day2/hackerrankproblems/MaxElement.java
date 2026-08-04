package day2.hackerrankproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MaxElement {
	public static List<Integer> getMax(List<String> operations) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        
        List<Integer> ans = new ArrayList<>();
        
        for (String operation : operations) {
            String[] parts = operation.split(" ");
            int type = Integer.parseInt(parts[0]);
            
            if (type == 1) {
                int value = Integer.parseInt(parts[1]); 
                stack.push(value);
                if(maxStack.isEmpty()) {
                    maxStack.push(value);
                } else {
                    maxStack.push(Math.max(value, maxStack.peek()));
                }
            } else if (type == 2){
                stack.pop();
                maxStack.pop();
            } else {
                ans.add(maxStack.peek());
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		// Scanner input
        Scanner sc = new Scanner(System.in);

        // Number of operations
        int n = sc.nextInt();

        List<String> operations = new ArrayList<>();

        // Reading all operations
        for (int i = 0; i < n; i++) {
            operations.add(sc.nextLine());
        }

        List<Integer> result = getMax(operations);

        // Printing the results
        for (int value : result) {
            System.out.println(value);
        }

        sc.close();
    }
}
