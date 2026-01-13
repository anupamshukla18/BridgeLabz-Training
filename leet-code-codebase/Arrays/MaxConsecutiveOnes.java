public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, current = 0;

        for (int n : nums) {
            if (n == 1) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}