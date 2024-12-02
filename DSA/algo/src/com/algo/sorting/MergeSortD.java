package com.algo.sorting;

public class MergeSortD {
	public static void mergeSort(int[] arr, int start, int end) {
		int mid = start + end / 2;
		if (start < end) {
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int i = 0;
		int j = mid + 1;

		int[] temp = new int[arr.length];
		int ti = start;

	}

}
