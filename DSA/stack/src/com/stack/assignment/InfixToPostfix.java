package com.stack.assignment;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter infix string");
		String infix = sc.nextLine();
		System.out.println(convertToPostfix(infix));
		
	}
	public static String convertToPostfix(String infix) {
		Stack<Character> stack = new Stack<>();
		String result="";
		for(char c : infix.toCharArray()) {
			if(c=='^' || c=='*' || c=='/' || c=='+' || c=='-') {
				while(!stack.isEmpty() && getPrecedance(stack.peek())>=getPrecedance(c) && stack.peek()!='(') {					
					result+=stack.pop();
				}
				stack.push(c);
			}
			else if(c=='(') {
				stack.push(c);
			}
			else if(c==')') {
				while(!stack.isEmpty()&& stack.peek()!='(') {
						result+=stack.pop();
				}
				stack.pop();
			}else {
				result+=c;
			}
		}
		while(!stack.isEmpty()) {
			result+=stack.pop();
		}
		return result;
	}
	
	public static int getPrecedance(char operator) {
		if(operator=='^') {
			return 3;
		}else if(operator=='*' || operator=='/' || operator=='%') {
			return 2;
		}else if(operator=='+' || operator=='-') {
			return 1;
		}else {
			return 0;
		}
	}
}
