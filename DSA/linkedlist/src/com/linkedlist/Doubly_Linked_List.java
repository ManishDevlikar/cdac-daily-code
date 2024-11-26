package com.linkedlist;

public class Doubly_Linked_List {

	Dnode root;

	void create_List() {
		root = null;

	}

	void insert_left(int data) {
		Dnode n = new Dnode(data);
		if (root == null)
			root = n;// first
		else {
			n.right = root;// 1
			root.left = n;
			root = n; // 2
		}
		System.out.println(data + " inserted");
	}

	void delete_left() {

		if (root == null)
			System.out.println("\nList Empty");
		else {
			Dnode t = root;// 1
			root = root.right;// 2
			root.left = null;
			System.out.println(t.data + " deleted");// 3
		}

	}

	void insert_right(int data) {
		Dnode n = new Dnode(data);
		if (root == null)
			root = n;// first
		else {
			Dnode t = root;// 1
			while (t.right != null)// 2
				t = t.right;
			t.right = n;// 3
			n.left = t;
		}
		System.out.println(data + " inserted");
	}

	void delete_right() {

		if (root == null)
			System.out.println("\nList Empty");
		else {
			Dnode t = root;// 1
//			Dnode t2 = root;// 1
			while (t.right != null)// 2
			{
//				t2 = t;
				t = t.right;
			}
			if (root == t)
				root = null;// 3 single node
			else {

				Dnode t2 = t.left;
//				t2.right = null;// 3
				t2.right = null;
			}
			System.out.println(t.data + " deleted");// 3
		}
	}

	void print_list() {
		if (root == null)
			System.out.println("\nList Empty");
		else {
			Dnode t = root;// 1
			while (t != null)// 2
			{
				System.out.print("|" + t.data + "|->");
				t = t.right;
			}
		}
	}

	void printReverse() {
		if (root == null)
			System.out.println("Empty");
		else {
			Dnode temp = root;
			while (temp.right != null) {
				temp = temp.right;
			}
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.left;
			}

		}
	}
//
//	boolean search(int node) {
//		if (root == null)
//			return false;
//		else {
//			Node temp = root;
//			while (temp != null) {
//				if (temp.data == node)
//					return true;
//				temp = temp.next;
//			}
//			return false;
//		}
//	}
//
//	void delete_element(int key) {
//		if (root == null)
//			System.out.println("\nList Empty");
//		else {
//			Node t = root;// 1
//			Node t2 = root;// 1
//			while (t != null)// 2
//			{
//				if (key == t.data)
//					break;
//				t2 = t;
//				t = t.next;
//			}
//			if (t != null)// found
//			{
//				if (t == root)// case 1
//					root = root.next;
//				else if (t.next == null)// case 2
//					t2.next = null;
//				else
//					t2.next = t.next;// case 3
//				System.out.println(t.data + " deleted");
//			} else// not found
//				System.out.println(key + " not found in list ");
//		}
//	}
//
//	void insert_after(int ref, int data)
//
//	{
//		if (root == null)
//			System.out.println("\nList Empty");
//		else {
//			Node t = root;// ref
//			while (t != null)// 2
//			{
//				if (ref == t.data)
//					break;
//				t = t.next;
//			}
//			if (t != null)// found
//			{
//				Node n = new Node(data);// new node created
//
//				n.next = t.next;// 1
//
//				t.next = n;// 2
//
//				System.out.println(data + " inserted in list");
//			} else// not found
//				System.out.println(ref + " not found in list ");
//		}
//	}
}
