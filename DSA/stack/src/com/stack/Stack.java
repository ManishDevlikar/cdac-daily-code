package com.stack;

public class Stack {
	
	int top;
	int max;
	int stack[];
	
	public void create(int size) {
		max=size;
		stack=new int[size];
		top=-1;
	}
	
	public boolean isFull() {
		return top==max-1?true:false;
	}
	
	public boolean isEmpty() {
		return top==-1?true:false;
	}
	
	public void push(int data) {
		stack[++top]=data;
	}
	
	public int pop() {
		int data = stack[top];
		--top;
		return data;
	}
	
	public int peek() {
		return stack[top];
	}
	
	public void print() {
		for(int i=top;i>-1;i--) {
			System.out.print(stack[i]+" ");
		}
	}
}
