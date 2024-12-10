package com.practice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {2,1,4,3,7,5};
		System.out.println(Arrays.toString(arr));
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubble(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
}
