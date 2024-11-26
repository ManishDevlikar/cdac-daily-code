package com.stack;

import java.util.Scanner;

public class StackStringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack_Class obj = new Stack_Class();
		System.out.println("Enter word to reverse");
		String word = sc.nextLine();
		
		obj.create_stack(word.length());
		
		for(int i=0;i<word.length();++i) {
			obj.push(word.charAt(i));
		}
		
		String rs="";
		
		while(!obj.is_empty()) {
			rs+=(char) obj.pop();
		}
		
		System.out.println("Reversed String is : "+rs);
	}
}
