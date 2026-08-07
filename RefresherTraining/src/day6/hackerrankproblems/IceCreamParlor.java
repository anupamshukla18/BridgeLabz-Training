package day6.hackerrankproblems;

import java.util.*;

import java.util.*;

public class IceCreamParlor {
    public static List<Integer> icecreamParlor(int m, List<Integer> cost) {
        int n = cost.size();

        // Store cost and original index
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = cost.get(i);
            arr[i][1] = i + 1;
        }

        // Sort according to cost
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // Binary Search
        for (int i = 0; i < n - 1; i++) {

            int target = m - arr[i][0];

            int low = i + 1;
            int high = n - 1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (arr[mid][0] == target) {

                    int idx1 = arr[i][1];
                    int idx2 = arr[mid][1];

                    if (idx1 < idx2)
                        return Arrays.asList(idx1, idx2);
                    else
                        return Arrays.asList(idx2, idx1);

                } else if (arr[mid][0] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int m = sc.nextInt();
            int n = sc.nextInt();

            List<Integer> cost = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                cost.add(sc.nextInt());
            }

            List<Integer> result = icecreamParlor(m, cost);

            for (int x : result) {
                System.out.print(x + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}