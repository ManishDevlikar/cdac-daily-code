package com.algo.sorting;

import java.util.Scanner;

public class SelectionSort {
	static void Selection_Sort(int a[])

	{

		int i, j, min, pos;

		for (i = 0; i < a.length - 1; i++) // n=5 length=5 length-1--> 4 0,1,2,3 passes
		{
			min = a[i];
			pos = i;
			for (j = i + 1; j < a.length; j++)
			{
				if (a[j] < min)
				{
					min = a[j];
					pos = j;
				}
			} // min found
			a[pos] = a[i];
			a[i] = min;
		}
	}

	static void print_array(int a[]) {
		System.out.println("\nArray has");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ", ");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < size; ++i) {
			System.out.println("Enter the value of element");
			a[i] = sc.nextInt();
		}
		print_array(a);
		Selection_Sort(a);
		print_array(a);
	}
}
