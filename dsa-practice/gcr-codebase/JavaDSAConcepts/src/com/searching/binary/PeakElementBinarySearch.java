package com.searching.binary;
public class PeakElementBinarySearch {

    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            boolean leftSmaller = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightSmaller = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

            // Check if mid is a peak
            if (leftSmaller && rightSmaller) {
                return mid;
            }
            // If left neighbor is greater, move left
            else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // Else move right
            else {
                left = mid + 1;
            }
        }
        return -1; // should never reach here for valid input
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeakElement(arr);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }
}
