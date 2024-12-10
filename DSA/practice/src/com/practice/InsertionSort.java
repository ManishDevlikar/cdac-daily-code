package com.practice;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = {2,1,4,3,7};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int min =arr[i];
			int j=i;
			
			while(j>0&&arr[j-1]>min) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=min;
		}
	}
}
