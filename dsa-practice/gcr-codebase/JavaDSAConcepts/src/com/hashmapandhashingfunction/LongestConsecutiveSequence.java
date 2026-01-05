package com.hashmapandhashingfunction;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Step 1: Put all elements in map as unvisited
        for (int num : nums) {
            map.put(num, false);
        }

        int maxLength = 0;

        // Step 2: Traverse array
        for (int num : nums) {

            // If already visited, skip
            if (map.get(num)) {
                continue;
            }

            map.put(num, true);
            int currentLength = 1;

            // Step 3: Check left side
            int left = num - 1;
            while (map.containsKey(left) && !map.get(left)) {
                map.put(left, true);
                currentLength++;
                left--;
            }

            // Step 4: Check right side
            int right = num + 1;
            while (map.containsKey(right) && !map.get(right)) {
                map.put(right, true);
                currentLength++;
                right++;
            }

            // Step 5: Update maximum length
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr)); // Output: 4
    }
}
