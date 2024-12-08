package com.assignment;

import java.util.Stack;

public class InfixToPrefix {
	 static boolean isOperator(char c) {
	        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
	    }
	 
	 static int precedence(char c) {
	        switch (c) {
	            case '+':
	            case '-':
	                return 1;
	            case '*':
	            case '/':
	                return 2;
	            case '^':
	                return 3;
	            default:
	                return -1;
	        }
	    }
	 static String reverseAndSwapParentheses(String expr) {
	        StringBuilder reversed = new StringBuilder(expr.length());
	        for (int i = expr.length() - 1; i >= 0; i--) {
	            char c = expr.charAt(i);
	            if (c == '(') {
	                reversed.append(')');
	            } else if (c == ')') {
	                reversed.append('(');
	            } else {
	                reversed.append(c);
	            }
	        }
	        return reversed.toString();
	    }
	 
	 static String infixToPrefix(String infix) {
	        String reversedInfix = reverseAndSwapParentheses(infix);

	        Stack<Character> stack = new Stack<>();
	        StringBuilder postfix = new StringBuilder();

	        for (int i = 0; i < reversedInfix.length(); i++) {
	            char c = reversedInfix.charAt(i);

	            if (Character.isLetterOrDigit(c)) {
	                postfix.append(c);
	            }
	            else if (c == '(') {
	                stack.push(c);
	            }
	            else if (c == ')') {
	                while (!stack.isEmpty() && stack.peek() != '(') {
	                    postfix.append(stack.pop());
	                }
	                stack.pop(); 
	            }
	            else if (isOperator(c)) {
	                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
	                    postfix.append(stack.pop());
	                }
	                stack.push(c);
	            }
	        }

	        while (!stack.isEmpty()) {
	            postfix.append(stack.pop());
	        }

	        return postfix.reverse().toString();
	    }
	 
	 public static void main(String[] args) {
	        String infix = "(A-B/C)*(A/K-L)";
	        
	        System.out.println("rev: "+reverseAndSwapParentheses(infix));

	        String prefix = infixToPrefix(infix);

	        System.out.println("Infix Expression: " + infix);
	        System.out.println("Prefix Expression: " + prefix);
	    }
}
