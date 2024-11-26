package com.linkedlist;

import java.util.Scanner;

public class DynamicStackMain {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		DynamicStack obj = new DynamicStack();
		System.out.println("Enter size of stack:");
		int choice;
		do {
			System.out.print("\nStack Menu");
			System.out.print("\n-----------");
			System.out.print("\n1.Push");
			System.out.print("\n2.Pop");
			System.out.print("\n3.Peek");
			System.out.print("\n4.Print Stack");
			System.out.print("\n0.Exit");
			System.out.print("\nchoice:");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.print("\nEnter element:");
				int e = in.nextInt();
				obj.push(e);
				break;
			case 2:

				obj.pop();

				break;
			case 3:
				System.out.println(obj.peek());
				break;
			case 4:

				obj.printStack();

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
