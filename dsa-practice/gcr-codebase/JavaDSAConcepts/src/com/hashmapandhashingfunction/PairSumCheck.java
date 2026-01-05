package com.hashmapandhashingfunction;

import java.util.HashSet;

public class PairSumCheck {
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.println("Pair Found: (" + num + ", " + complement + ")");
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 1, -3, 2};
        int target = 5;

        boolean result = hasPairWithSum(arr, target);

        if (!result) {
            System.out.println("No such pair exists");
        }
    }
}
