package com.tree;

import java.util.Scanner;

public class Tree_Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int choice;
		Tree_Class obj = new Tree_Class();
		do {
			System.out.print("\nTree Menu");
			System.out.print("\n-----------");
			System.out.print("\n1.Insert");
			System.out.print("\n2.Inorder");
			System.out.print("\n3.Postorder");
			System.out.print("\n4.Preorder");
			System.out.print("\n5.Search");
			System.out.print("\n6.Count");
			System.out.println("n7.CountLeafNodes0");
			System.out.print("\n0.Exit");
			System.out.print("\nchoice:");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.print("\nEnter element:");
				int e = in.nextInt();
				Tnode n = new Tnode(e);
				obj.insert(obj.root, n);
				break;
			case 2:
				if (obj.root != null)// not empty
				{
					System.out.print("\nElements in tree:\n");
					obj.inorder(obj.root);
				} else {
					System.out.print("\nTree not created...");
				}
				break;
			case 3:
				if (obj.root != null)// not empty
				{
					System.out.print("\nElements in tree:\n");
					obj.postorder(obj.root);
				} else {
					System.out.print("\nTree not created...");
				}
				break;
			case 4:
				if (obj.root != null)// not empty
				{
					System.out.print("\nElements in tree:\n");
					obj.preorder(obj.root);
				} else {
					System.out.print("\nTree not created...");
				}
				break;
			case 5:
				if (obj.root != null) {
					System.out.println("Enter the key");
					int key = in.nextInt();
					System.out.println(obj.search(key, obj.root));
				}
				break;
			case 6:
				if (obj.root != null) {
					System.out.println(obj.count(obj.root, 0));
				}
				break;
			case 7:
				if (obj.root != null) {
					System.out.println(obj.countLeafNode(obj.root));
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