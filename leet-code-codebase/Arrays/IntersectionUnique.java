import java.util.*;

public class IntersectionUnique {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int n : nums1) set1.add(n);

        for (int n : nums2)
            if (set1.contains(n))
                result.add(n);

        int[] ans = new int[result.size()];
        int i = 0;
        for (int n : result)
            ans[i++] = n;

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] res = intersection(nums1, nums2);

        System.out.println(Arrays.toString(res));
    }
}