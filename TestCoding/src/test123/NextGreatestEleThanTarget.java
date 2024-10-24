package test123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
	int val;
	Node left;
	Node right;

	Node(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class NextGreatestEleThanTarget {
	public static int getNextElemThanTarget(int[] arr, int target) {
		Arrays.sort(arr);
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return arr[start % arr.length];
	}

	public static List<Integer> avgList = new ArrayList<>();

	public static ArrayList<Integer> getLevelAvg(Node root) {
		Queue<Node> q = new LinkedList<>();
		if (root == null) {
			return new ArrayList<>();
		}
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			int sum = 0;
			for (int i = 0; i < size; i++) {
				Node curr = q.poll();
				sum += curr.val;
				if (curr.right != null) {
					q.add(curr.right);
				}
				if (curr.left != null) {
					q.add(curr.left);
				}
			}
			avgList.add(sum);

		}
		return new ArrayList<>(avgList);

	}

	public static int getMinmDepth(Node root) {
		int min = Integer.MAX_VALUE;
		if (root == null) {
			return 0;
		} else {
			int l = getMinmDepth(root.left);
			int r = getMinmDepth(root.right);
			min = l == 0 || r == 0 ? l + r + 1 : Math.min(l, r) + 1;

		}

		return min;

	}

	public static boolean getpathSum(Node root, int target) {
		if (root == null) {
			return false;
		}
		if (root.left == null && root.right == null && root.val == target) {
			return true;
		}
		return getpathSum(root.left, target - root.val) || getpathSum(root.right, target - root.val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		List<Integer> ans = getLevelAvg(root);
		for (int i : ans) {
			System.out.println(" : " + i);
		}
		int minD = getMinmDepth(root);

		System.out.println(" MinM depth is : " + minD);

		boolean pathS = getpathSum(root, 7);
		System.out.println(" The path sum is : " + pathS);

	}

}
