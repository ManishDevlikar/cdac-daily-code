package com.stack;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		
		int decimal, binary;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		decimal = sc.nextInt();
		Stack_Class stack = new Stack_Class();
		
		stack.create_stack(64);
		
		while(decimal != 0) {
			stack.push(decimal%2);
			decimal /= 2;
		}
		stack.print_stack();
	}
}
