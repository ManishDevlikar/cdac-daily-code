package com.stack;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in);){
			Stack stack = new Stack();
			System.out.println("Enter String");
			String string = scanner.nextLine();
			stack.create(string.length());
			for(char c:string.toCharArray()) {
				stack.push((int)c);
			}
			
			String result="";
			while(!stack.isEmpty()) {
				result+=(char)stack.pop();
			}
			System.out.println(result);
		}
	}
}
