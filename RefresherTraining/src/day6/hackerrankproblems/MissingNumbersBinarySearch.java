package day6.hackerrankproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MissingNumbersBinarySearch {
    // First occurrence of target
    public static int lowerBound(List<Integer> arr, int target) {
        int low = 0, high = arr.size() - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Last occurrence of target
    public static int upperBound(List<Integer> arr, int target) {
        int low = 0, high = arr.size() - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr.get(mid) == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Collections.sort(arr);
        Collections.sort(brr);

        List<Integer> result = new ArrayList<>();

        int i = 0;

        while (i < brr.size()) {

            int num = brr.get(i);

            int firstB = lowerBound(brr, num);
            int lastB = upperBound(brr, num);

            int freqB = lastB - firstB + 1;

            int firstA = lowerBound(arr, num);

            int freqA = 0;

            if (firstA != -1) {
                int lastA = upperBound(arr, num);
                freqA = lastA - firstA + 1;
            }

            if (freqA != freqB) {
                result.add(num);
            }

            i = lastB + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int m = sc.nextInt();

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            brr.add(sc.nextInt());
        }

        List<Integer> result = missingNumbers(arr, brr);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}