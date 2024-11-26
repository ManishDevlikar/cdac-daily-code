package com.linkedlist;

import java.util.Scanner;

public class LinkedListMain {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in);){
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
		            System.out.print("\n6.exit");
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
		                case 6:
		                	break;
		                default:
		                    System.out.print("\nWrong option selected..");
		                    break;
		            }
		        } while (choice != 0);
		}
	}
}
