package com.practice;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = {2,1,4,3,7};
		System.out.println(Arrays.toString(arr));
		devide(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void conquer(int arr[],int start,int mid,int end) {
		int i=start;
		int j=mid+1;
		int k=start;
		int temp[]=new int[arr.length];
		
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
				temp[k++]=arr[i++];
			}else {
				temp[k++]=arr[j++];
			}
		}
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		while(j<=end) {
			temp[k++]=arr[j++];
		}
		
		for(int index=start;index<=end;index++) {
			arr[index]=temp[index];
		}
	}
	public static void devide(int arr[],int start,int end) {
		if(start<end) {
			
			int mid=(start+end)/2;
			devide(arr,start,mid);
			devide(arr,mid+1,end);
			conquer(arr, start, mid, end);
		}
	}
}
