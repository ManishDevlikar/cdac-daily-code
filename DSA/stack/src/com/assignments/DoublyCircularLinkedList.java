package com.assignments;

public class DoublyCircularLinkedList {
	Node root;
	
	 void insert_left(int data) {
	        Node n = new Node(data);
	        if (root == null) {
	            root = n;
	            n.left = n;
	            n.right = n;
	        } else {
	            Node last = root.left; 
	            n.right = root;
	            n.left = last;
	            last.right = n;
	            root.left = n;
	            root = n; 
	        }
	        System.out.println(data + " inserted");
	    }
	 
	 void delete_left() {
	        if (root == null) {
	            System.out.println("Empty");
	        } else if (root.right == root) { 
	            System.out.println(root.data + " deleted");
	            root = null;
	        } else {
	            Node last = root.left; 
	            Node temp = root;
	            root = root.right; 
	            root.left = last;
	            last.right = root;
	            System.out.println(temp.data + " deleted");
	        }
	    }
	 
	 void insert_right(int data) {
	        Node n = new Node(data);
	        if (root == null) {
	            root = n;
	            n.left = n;
	            n.right = n; 
	        } else {
	            Node last = root.left; 
	            last.right = n;
	            n.left = last;
	            n.right = root;
	            root.left = n;
	        }
	        System.out.println(data + " inserted");
	    }

	    void delete_right() {
	        if (root == null) {
	            System.out.println("Empty ");
	        } else if (root.right == root) { 
	            System.out.println(root.data + " deleted");
	            root = null;
	        } else {
	            Node last = root.left; 
	            Node prevLast = last.left; 
	            prevLast.right = root;
	            root.left = prevLast;
	            System.out.println(last.data + " deleted");
	        }
	    }

	    void print_list() {
	        if (root == null) {
	            System.out.println("Empty list");
	        } else {
	            Node t = root;
	            do {
	                System.out.print("|" + t.data + "|<->");
	                t = t.right;
	            } while (t != root);
	            System.out.println();
	        }
	    }

}
