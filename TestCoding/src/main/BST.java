package main;

import java.util.ArrayList;
import java.util.List;

public class BST {

	static int c = 0;
	public static List<List<Integer>> res = new ArrayList<>();

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static Node insertBST(Node root, int val) {
		if (root == null) {
			root = new Node(val);
			return root;
		}
		if (root.data > val) {
			root.left = insertBST(root.left, val);
		} else {
			root.right = insertBST(root.right, val);
		}
		return root;
	}

	public static boolean search(Node root, int val) {
		if (root == null) {
			return false;
		} else if (root.data == val) {
			return true;
		} else if (root.data > val) {
			return search(root.left, val);
		} else if (root.data < val) {
			return search(root.right, val);
		} else {
			return search(root.right, val);
		}

	}

	public static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(" -> : " + root.data);
		inOrder(root.right);
	}

	public static int countNodes(Node root) {
		if (root == null) {
			return c;
		}
		countNodes(root.left);
		c++;
		countNodes(root.right);
		return c;

	}

	public static int sumNodes(Node root, int sum) {
		if (root == null) {
			return 0;
		}
		sumNodes(root.left, sum);
		sum = sum + root.data;
		sumNodes(root.right, sum);
		return sum;

	}

	public static void printInRange(Node root, int X, int Y) {
		if (root == null) {
			return;
		}
		if (X <= root.data && root.data <= Y) {
			printInRange(root.left, X, Y);
			System.out.print(" -> " + root.data);
			printInRange(root.right, X, Y);
		} else if (root.data < X) {
			printInRange(root.right, X, Y);

		} else {
			printInRange(root.left, X, Y);
		}
	}

	public static void printPath2Leaf(Node root, ArrayList<Integer> path) {
		if (root == null) {
			return;
		}
		path.add(root.data);
		if (root.left == null && root.right == null) {
			res.add(new ArrayList<>(path));
		} else {
			printPath2Leaf(root.left, path);
			printPath2Leaf(root.right, path);
		}
		path.remove(path.size() - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 10, 12, 3, 11, 22, 56, 78, 12, 111, 231, 100 };
		Node root = null;
		for (int i = 0; i < arr.length; i++) {
			root = insertBST(root, arr[i]);
		}

		inOrder(root);
		if (search(root, 4)) {
			System.out.println(" Value 4 found ");
		} else {
			System.out.println(" Not 4 Found ");
		}

		if (search(root, 411)) {
			System.out.println(" Value 411 found ");
		} else {
			System.out.println(" Not 411 Found ");
		}

		int count = countNodes(root);
		System.out.println(" count is : " + count);

		int sum = sumNodes(root, 0);
		System.out.println(" count is : " + count);

		printInRange(root, 3, 100);

		printPath2Leaf(root, new ArrayList<>());

		for (List<Integer> r : res) {
			for (int i = 0; i < r.size(); i++) {
				System.out.print(" : " + r.get(i));
			}
			System.out.println(" ");
		}

	}

}
