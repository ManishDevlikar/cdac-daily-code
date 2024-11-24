package com.stack;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in);){
			System.out.println("Enter number");
			int number = scanner.nextInt();
			Stack stack = new Stack();
			stack.create(64);
			while(number!=0) {
				stack.push(number%2);
				number/=2;
			}
			
			stack.print();
		}
	}
}
