package may8;

/*
 * BST -> create
 * add an element and search an element
 * 
 * 
 * 
 * 
 */

public class TestNew1 {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

	public static void createTree(TreeNode root, int index, int[] arr) {
		if (root == null && index >= arr.length) {
			return;
		}
		if (arr[index] > root.val) {
			TreeNode left = new TreeNode(arr[index]);
			root.left = left;
			createTree(root.left, index + 1, arr);
		} else if (arr[index] > root.val) {
			TreeNode right = new TreeNode(arr[index]);
			root.right = right;
			createTree(root.right, index + 1, arr);
		}

	}

	public static int search(TreeNode root, int num) {
		if (root == null) {
			return -1;
		}
		if (root.val == num) {
			return 1;
		} else if (root.val < num) {
			search(root.left, num);
		} else {
			search(root.right, num);
		}
		return -1;
	}

	public static void addElement(TreeNode root, int num) {
		if (num > root.val) {
			if (root.right != null) {
				addElement(root.right, num);
			} else {
				addElement(root.left, num);
			}
		} else {
			if (root.left != null) {
				addElement(root.left, num);
			} else {
				addElement(root.right, num);
			}
		}
		if (root.val > num) {
			root.left = new TreeNode(num);
		} else {
			root.right = new TreeNode(num);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 13, 4, 5 };
		TreeNode root = new TreeNode(arr[0]);
		createTree(root, 1, arr);
		int num = 5;
		int isExists = search(root, num);
		System.out.println("The searched number exists: " + isExists);
		int addNumber = 12;
		if (root == null) {
			root = new TreeNode(addNumber);
		} else {
			addElement(root, addNumber);
		}

	}

}
