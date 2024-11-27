package com.tree;

public class Tree_Class {
	Tnode root;

	void insert(Tnode r, Tnode n)// r:root ref n:new node
	{
		if (root == null)
			root = n;
		else {
			if (n.data < r.data) {
				if (r.left == null)
					r.left = n;
				else
					insert(r.left, n);
			} else {
				if (r.right == null)
					r.right = n;
				else
					insert(r.right, n);
			}
		}
		System.out.println(n.data + " inserted in tree");
	}

	void inorder(Tnode r) {
		if (r != null)// LPR
		{
			inorder(r.left);// L
			System.out.print(r.data + ",");// P
			inorder(r.right);// R
		}
	}

	void postorder(Tnode r) {
		if (r != null) {
			postorder(r.left);
			postorder(r.right);
			System.out.print(r.data + ",");
		}
	}

	void preorder(Tnode r) {
		if (r != null) {
			System.out.print(r.data + ",");
			preorder(r.left);
			preorder(r.right);
		}
	}

	boolean search(int key, Tnode r) {

		if (r == null) {
			return false;
		}

		if (r.data == key)
			return true;

		if (r.data > key) {
			return search(key, r.left);
		} else {
			return search(key, r.right);
		}
	}

	int count(Tnode r, int count) {
		if (r == null) {
			return 0;
		} else {
			return count(r.left, 1) + count(r.right, 1) + 1;
		}
	}

	int count_leaf_node(Tnode r) {
		if (r == null)
			return 0;
		else {
			int count = 0;
			if (r.left == null && r.right == null)
				count++;
			return count + count_leaf_node(r.left) + count_leaf_node(r.right);
		}

	}
}
