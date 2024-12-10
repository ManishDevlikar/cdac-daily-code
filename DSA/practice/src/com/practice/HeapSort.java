package com.practice;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		int arr[] = {22,13,17,11,10,14,12};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void sort(int [] arr) {
		int length=arr.length;
		
		for(int i=length/2-1;i>=0;i--) {
			heapify(arr,length,i);
		}
		// swap the element and heapify
		for(int i =length-1;i>=0;i--) {
			int temp = arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr, i, 0);
		}
	}
	static void heapify(int arr[],int n,int i) {
		int parentNode=i;  //index
		int leftChild = 2*i+1; //index
		int rightChild = 2*i+2; //index
		if(leftChild<n && arr[leftChild]>arr[parentNode]) {
			parentNode=leftChild;
		}
		if(rightChild<n && arr[rightChild]>arr[parentNode]) {
			parentNode=rightChild;
		}
		if(parentNode!=i) {
			int temp=arr[i];
			arr[i]=arr[parentNode];
			arr[parentNode]=temp;
			heapify(arr, n, parentNode);
		}
	}
}
// 2*i+1 -> left child
// 2*i+2 -> right child
// i-1/2 -> parent node