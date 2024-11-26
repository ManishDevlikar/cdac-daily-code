package com.linkedlist;

public class DynamicQueue {
	Node front;
	Node rear;

	void create_List() {
		front = null;
	}

	void enqueue(int data) {
		Node n = new Node(data);
		if (rear == null) {
			front = n;// first
			rear = n;
		} else {

			rear.next = n;
			rear = n;
		}
		System.out.println(data + " inserted");
	}

	void dequeue() {

		if (front == null)
			System.out.println("\nList Empty");
		else {
			Node t = front;// 1
			front = front.next;// 2
			System.out.println(t.data + " deleted");// 3
		}

	}

	void printQueue() {
		if (front == null)
			System.out.println("\nList Empty");
		else {
			Node t = front;// 1
			while (t != null)// 2
			{
				System.out.print("|" + t.data + "|->");
				t = t.next;
			}
		}
	}

}
