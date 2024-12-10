package com.practice;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = {2,1,4,3,7};
		System.out.println(Arrays.toString(arr));
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int arr[],int low, int high) {
		int left =low;
		int right=high;
		int pivote=high;
		
		if(left>right) {
			return;
		}
		
		while(left<right) {
			while(left<right && arr[left]<=arr[pivote]) {
				left++;
			}
			while(left<right && arr[right]>=arr[pivote]) {
				right--;
			}
			swap(arr,left,right);
		}
		swap(arr,left,pivote);
		sort(arr,low,left-1);
		sort(arr,left+1,high);
	}
	
	public static void swap(int arr[],int f,int s) {
		int temp=arr[f];
		arr[f]=arr[s];
		arr[s]=temp;
	}
}
