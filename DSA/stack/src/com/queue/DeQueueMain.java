package com.queue;

import java.util.Scanner;

public class DeQueueMain {
	 public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        DeQueue obj = new DeQueue();
	        System.out.println("Enter size of queue:");
	        int choice;
	        int size = in.nextInt();
	        obj.create_queue(size);
	        do {
	            System.out.print("\nQueue Menu");
	            System.out.print("\n-----------");
	            System.out.print("\n1.Enqueue1");
	            System.out.print("\n2.Dequeue1");
	            System.out.print("\n3.Print1");
	            System.out.print("\n4.Enqueue2");
	            System.out.print("\n5.Dequeue2");
	            System.out.print("\n6.Print2");
	            System.out.print("\n0.Exit");
	            System.out.print("\nchoice:");
	            choice = in.nextInt();
	            switch (choice) {
	                case 1:
	                    if (!obj.is_full())//if not full
	                    {
	                        System.out.print("\nEnter element:");
	                        int e = in.nextInt();
	                        obj.enqueue1(e);
	                    } else {
	                        System.out.print("\nQueue Full:");
	                    }
	                    break;
	                case 2:
	                    if (!obj.is_empty1())//if not empty
	                    {
	                        System.out.print("\nElement poped:" + obj.dequeue1());
	                    } else {
	                        System.out.print("\nQueue Empty:");
	                    }
	                    break;
	                case 3:
	                    if (!obj.is_empty1())//if not empty
	                    {
	                        System.out.println("\nElements on queue");
	                        obj.print_queue1();
	                    } else {
	                        System.out.print("\nQueue Empty:");
	                    }
	                    break;
	                case 4:
	                    if (!obj.is_full())//if not full
	                    {
	                        System.out.print("\nEnter element:");
	                        int e = in.nextInt();
	                        obj.enqueue2(e);
	                    } else {
	                        System.out.print("\nQueue Full:");
	                    }
	                    break;
	                case 5:
	                    if (!obj.is_empty2())//if not empty
	                    {
	                        System.out.print("\nElement poped:" + obj.dequeue2());
	                    } else {
	                        System.out.print("\nQueue Empty:");
	                    }
	                    break;
	                case 6:
	                    if (!obj.is_empty2())//if not empty
	                    {
	                        System.out.println("\nElements on queue");
	                        obj.print_queue2();
	                    } else {
	                        System.out.print("\nQueue Empty:");
	                    }
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
