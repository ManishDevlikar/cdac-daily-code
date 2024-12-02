package com.algo.sorting;

public class MergeSort {
	static void Merger(int a[], int start, int mid, int end) {
		int i, j, ti;
		int t_a[] = new int[a.length];
		i = start;
		j = mid + 1;
		ti = start;
		while (i <= mid && j <= end) {
			if (a[i] < a[j])
				t_a[ti++] = a[i++];
			else
				t_a[ti++] = a[j++];
		}
		while (i <= mid)// left from i
			t_a[ti++] = a[i++];
		while (j <= end)// left from j
			t_a[ti++] = a[j++];

//swap back to a
		for (i = start; i <= end; i++)
			a[i] = t_a[i];
	}

	static void Merge_Sort(int a[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			Merge_Sort(a, start, mid);
			Merge_Sort(a, mid + 1, end);
			Merger(a, start, mid, end);// conquer
		}
	}

	static void print_array(int a[]) {
		System.out.println("\nArray has");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ", ");
	}

	public static void main(String args[]) {
		int a[] = { 88, 11, 33, 22, 66, 111, 55, 77, 44, 99 };
		print_array(a);
		Merge_Sort(a, 0, a.length - 1);
		print_array(a);

	}

}
