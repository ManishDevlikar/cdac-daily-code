package com.linkedlist;

import java.util.Scanner;

public class LinkedListMain {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			Linear_Linked_List obj = new Linear_Linked_List();
			int choice;
			do {
				System.out.print("\nQueue Menu");
				System.out.print("\n-----------");
				System.out.print("\n1.addLeft");
				System.out.print("\n2.addRight");
				System.out.print("\n3.removeLeft");
				System.out.print("\n4.removeRight");
				System.out.print("\n5.printList");
				System.out.print("\n6.search");
				System.out.print("\n7.deleteAny");
				System.out.print("\n8.insertAfter");

				System.out.print("\n0.exit");
				choice = in.nextInt();
				switch (choice) {
				case 1:
					System.out.print("\nEnter element:");
					int left = in.nextInt();
					obj.insert_left(left);
					break;
				case 2:
					System.out.print("\nEnter element:");
					int right = in.nextInt();
					obj.insert_right(right);

					break;
				case 3:
					obj.delete_left();
					break;
				case 4:
					obj.delete_right();
					break;
				case 5:
					obj.print_list();
					break;
				case 6:
					System.out.println("enter data to search node");
					int data = in.nextInt();
					System.out.println(obj.search(data));
					break;
				case 7:
					System.out.println("Enter the element to delete");
					int delete = in.nextInt();
					obj.delete_element(delete);
					break;
				case 8:
					System.out.println("Enter Ref ");
					int ref = in.nextInt();
					System.out.println("Enter data");
					int afterData = in.nextInt();
					obj.insert_after(ref, afterData);
					break;
				case 0:
					System.out.println("berozgaaar");
					return;
				default:
					System.out.print("\nWrong option selected..");
					break;
				}
			} while (choice != 0);
		}
	}
}
