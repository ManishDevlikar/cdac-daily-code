package com.linkedlist;

public class DynamicStack {
	Node tos;

	void create_List() {
		tos = null;
	}

	void push(int data) {
		Node n = new Node(data);
		if (tos == null)
			tos = n;// first
		else {
			n.next = tos;// 1
			tos = n; // 2
		}
		System.out.println(data + " inserted");
	}

	void pop() {

		if (tos == null)
			System.out.println("\nList Empty");
		else {
			Node t = tos;// 1
			tos = tos.next;// 2
			System.out.println(t.data + " deleted");// 3
		}

	}

	void printStack() {
		if (tos == null)
			System.out.println("\nList Empty");
		else {
			Node t = tos;// 1
			while (t != null)// 2
			{
				System.out.print("|" + t.data + "|->");
				t = t.next;
			}
		}
	}

	int peek() {
		return tos == null ? 0 : tos.data;
	}

}
