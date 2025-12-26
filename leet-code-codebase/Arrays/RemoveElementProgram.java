import java.util.*;

public class RemoveElementProgram {

    // Method to remove the given value from array
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];  // replace with last element
                n--;                    // shrink array size
            } else {
                i++;                    // move to next
            }
        }
        return n; // number of elements not equal to val
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        int k = removeElement(nums, val);

        System.out.println("\nNumber of elements not equal to " + val + ": " + k);

        System.out.print("Array after removal: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
