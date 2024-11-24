package com.stack;

public class StackDriver {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.create(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("top :"+stack.peek());
		System.out.println("pop :"+stack.pop());
		stack.print();
	}
}
