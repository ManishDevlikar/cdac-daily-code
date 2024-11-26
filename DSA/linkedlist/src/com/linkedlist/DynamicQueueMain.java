package com.linkedlist;

import java.util.Scanner;

public class DynamicQueueMain {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		DynamicQueue obj = new DynamicQueue();
		System.out.println("Enter size of stack:");
		int choice;
		do {
			System.out.print("\nStack Menu");
			System.out.print("\n-----------");
			System.out.print("\n1.Enqueue");
			System.out.print("\n2.Dequeue");
			System.out.print("\n3.Print Queue");
			System.out.print("\n0.Exit");
			System.out.print("\nchoice:");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.print("\nEnter element:");
				int e = in.nextInt();
				obj.enqueue(e);
				break;
			case 2:

				obj.dequeue();

				break;
			case 3:
				obj.printQueue();
				break;
			case 0:
				System.out.print("\nExiting code...bye");
				break;
			default:
				System.out.print("\nWrong option selected..");
				break;
			}
		} while (choice != 0);
	}
}
