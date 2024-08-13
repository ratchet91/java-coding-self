package main.Tree;

public class BinaryTree {

	public class TreeNode {
		TreeNode right;
		TreeNode left;
		int val;

		TreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

	public static int index = -1;

	public TreeNode buildTree(int[] arr) {
		index++;
		if (arr[index] == -1) {
			return null;
		}

		TreeNode newNode = new TreeNode(arr[index]);
		newNode.left = buildTree(arr);
		newNode.right = buildTree(arr);

		return newNode;
	}

	public static void printTree(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.println("node : " + root.val);
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();
		TreeNode root = tree.buildTree(arr);

		printTree(root);

	}

}
