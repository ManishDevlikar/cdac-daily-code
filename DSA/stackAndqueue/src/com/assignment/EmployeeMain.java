package com.assignment;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			EmployeeList obj = new EmployeeList();
			int choice;
			do {
				System.out.print("\nQueue Menu");
				System.out.print("\n-----------");
				System.out.print("\n1.addLeft");
				System.out.print("\n2.addRight");
				System.out.print("\n3.removeLeft");
				System.out.print("\n4.removeRight");
				System.out.print("\n5.printList");
				System.out.print("\n6.search");
				System.out.print("\n7.deleteAny");
				System.out.print("\n0.exit");
				choice = in.nextInt();
				switch (choice) {
				case 1:
					System.out.print("\nEnter employee ID:");
					int id = in.nextInt();
					System.out.print("\nEnter employee Name:");
					String name = in.next();
					System.out.print("\nEnter employee Gender:");
					char gender = in.next().charAt(0);
					System.out.print("\nEnter employee salary:");
					int salary = in.nextInt();
					Employee emp = new Employee(id, name, gender, salary);
					obj.insert_left(emp);
					break;
				case 2:
					System.out.print("\nEnter employee ID:");
					int id2 = in.nextInt();
					System.out.print("\nEnter employee Name:");
					String name2 = in.next();
					System.out.print("\nEnter employee Gender:");
					char gender2 = in.next().charAt(0);
					System.out.print("\nEnter employee salary:");
					int salary2 = in.nextInt();
					Employee emp2 = new Employee(id2, name2, gender2, salary2);
					obj.insert_right(emp2);

					break;
				case 3:
					obj.delete_left();
					break;
				case 4:
					obj.delete_right();
					break;
				case 5:
					obj.print_list();
					break;
				case 6:
					System.out.println("enter data to search node");
					int data = in.nextInt();
					obj.search(data);
					break;
				case 7:
					System.out.println("Enter the element to delete");
					int delete = in.nextInt();
					obj.delete_element(delete);
					break;
				case 0:
					System.out.println("berozgaaar");
					return;
				default:
					System.out.print("\nWrong option selected..");
					break;
				}
			} while (choice != 0);
		}
	}
}