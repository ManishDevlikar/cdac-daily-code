package com.stack;

import java.util.Scanner;

public class StringRev {
	public static void main(String[] args) {
		String input;

		Scanner sc = new Scanner(System.in);
		input = sc.next();
		Stack_Class stack = new Stack_Class();
		stack.create_stack(input.length());
		String rev ="";
		
		for(int i=0; i<input.length();++i) {
			stack.push(input.charAt(i));
		}
		
		
		while(!stack.is_empty()) {
			rev += (char)stack.pop();
		}
		System.out.println(rev);
	}

}
