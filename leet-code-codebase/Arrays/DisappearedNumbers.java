import java.util.*;

public class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] = -nums[index];
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 0)
                res.add(i + 1);

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums));
    }
}
