package com.stack;

import java.util.Scanner;

public class ValidParenthesis {
	
	public static boolean checkBalance(String word) {
		
		Stack_Class obj = new Stack_Class();
		obj.create_stack(word.length());
		for(int i=0; i<word.length(); ++i) {
			
			if('{'==word.charAt(i))
				obj.push(word.charAt(i));
			else if(!obj.is_empty() && '}'==word.charAt(i))
				obj.pop();
		}
		
		
		return obj.is_empty();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter word to reverse");
		String word = sc.nextLine();
		
		
		System.out.println("The entered string is: " + checkBalance(word));
	}
}
