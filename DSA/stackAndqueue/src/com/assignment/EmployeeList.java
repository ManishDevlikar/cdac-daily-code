package com.assignment;

public class EmployeeList {
	Employee root;

	void insert_left(Employee node) {
		if (root == null)
			root = node;
		else {
			if (!isPresent(node.employeeId)) {
				node.next = root;
				root = node;
				System.out.println(node.employeeId + " inserted");
			}
		}
	}

	void delete_left() {

		if (root == null)
			System.out.println("\nList Empty");
		else {
			Employee t = root;
			root = root.next;
			System.out.println(t.employeeId + " deleted");
		}

	}

	void insert_right(Employee node) {
		if (root == null)
			root = node;
		else {
			if (!isPresent(node.employeeId)) {

				Employee t = root;
				while (t.next != null)
					t = t.next;
				t.next = node;
				System.out.println(node.employeeId + " inserted");
			}
		}
	}

	void delete_right() {

		if (root == null)
			System.out.println("\nList Empty");
		else {
			Employee t = root;
			Employee t2 = root;
			while (t.next != null) {
				t2 = t;
				t = t.next;
			}
			if (root == t)
				root = null;
			else
				t2.next = null;
			System.out.println(t.employeeId + " deleted");
		}
	}

	void print_list() {
		if (root == null)
			System.out.println("\nList Empty");
		else {
			Employee t = root;// 1
			while (t != null)// 2
			{
				System.out.print("|" + t.employeeId + "|->");
				t = t.next;
			}
		}
	}

	void search(int node) {
		if (root == null)
			System.out.println("Id Not Fond");
		else {
			Employee temp = root;
			while (temp != null) {
				if (temp.employeeId == node) {
					System.out.println("Employee Id: " + temp.employeeId + " " + "Employee Name: " + temp.employeeName
							+ " " + "Employee Gender: " + temp.gender + " " + "Employee salary: " + temp.salary + " ");
					return;
				}
				temp = temp.next;
			}
			System.out.println("Id Not Found");
		}
	}

	boolean isPresent(int node) {
		if (root == null) {

			System.out.println("Id Not Fond");
			return false;
		} else {
			Employee temp = root;
			while (temp != null) {
				if (temp.employeeId == node) {
					System.out.println("id is present");
					return true;
				}
				temp = temp.next;
			}
			System.out.println("Id Not Found");
			return false;
		}
	}

	void delete_element(int key) {
		if (root == null)
			System.out.println("\nList Empty");
		else {
			Employee t = root;
			Employee t2 = root;
			while (t != null) {
				if (key == t.employeeId)
					break;
				t2 = t;
				t = t.next;
			}
			if (t != null) {
				if (t == root)
					root = root.next;
				else if (t.next == null)
					t2.next = null;
				else
					t2.next = t.next;
				System.out.println(t.employeeId + " deleted");
			} else
				System.out.println(key + " not found in list ");
		}
	}

}
