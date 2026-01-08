package com.searching.binary;
public class RotationPointBinarySearch {

    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If middle element is greater than rightmost,
            // rotation point lies in right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            // Else rotation point lies in left half (including mid)
            else {
                right = mid;
            }
        }

        // left == right -> index of smallest element
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};

        int rotationIndex = findRotationPoint(arr);

        System.out.println("Rotation point index: " + rotationIndex);
        System.out.println("Smallest element: " + arr[rotationIndex]);
    }
}
