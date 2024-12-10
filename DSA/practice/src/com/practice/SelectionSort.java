package com.practice;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {2,1,4,3,7};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int min = i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
}
