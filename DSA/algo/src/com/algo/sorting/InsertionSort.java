package com.algo.sorting;

import java.util.Scanner;

public class InsertionSort {
	static void Insertion_Sort(int a[])

	{

		int i, j, new_element;

		for (i = 0; i < a.length - 1; i++)

		{

			j = i + 1;

			new_element = a[j];

			while (j > 0 && a[j - 1] > new_element)

			{

				a[j] = a[j - 1];// come back

				j--;

			}

			a[j] = new_element;

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
		Insertion_Sort(a);
		print_array(a);
	}
}
