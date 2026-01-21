package com.sortingalgorithmsscneariobasedproblems.medwarehouse;

public class MedWarehouseSorter {

	public void divide(Medicine[] arr, int si, int ei) {

		if (si >= ei) {
			return;
		}

		int mid = si + (ei - si) / 2;

		divide(arr, si, mid);
		divide(arr, mid + 1, ei);
		conquer(arr, si, mid, ei);
	}

	public void conquer(Medicine[] arr, int si, int mid, int ei) {

		Medicine[] merged = new Medicine[ei - si + 1];

		int i = si;
		int j = mid + 1;
		int x = 0;

		while (i <= mid && j <= ei) {
			if (arr[i].getExpiryDays() <= arr[j].getExpiryDays()) {
				merged[x++] = arr[i++];
			} else {
				merged[x++] = arr[j++];
			}
		}

		while (i <= mid) {
			merged[x++] = arr[i++];
		}

		while (j <= ei) {
			merged[x++] = arr[j++];
		}

		for (int k = 0; k < merged.length; k++) {
			arr[si + k] = merged[k];
		}
	}

	public void display(Medicine[] medicines) {
		for (Medicine m : medicines) {
			System.out.println(m);
		}
	}
}
