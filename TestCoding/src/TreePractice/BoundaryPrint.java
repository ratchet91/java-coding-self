package TreePractice;

import java.util.ArrayList;
import java.util.List;

public class BoundaryPrint {

	// leftBoundary Iteration
	// rightBoundary Iteration
	// leaves Iteration

	// { Driver Code Starts
	public void addLeftBoundary(Node node, ArrayList<Integer> ans) {
		Node curr = node.left;
		while (curr != null) {
			if (curr.left != null || curr.right != null)
				ans.add(curr.data);
			if (curr.left != null) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
	}

	public void addRightBoundary(Node node, ArrayList<Integer> ans) {
		List<Integer> temp = new ArrayList<>();
		Node curr = node.right;
		while (curr != null) {
			if (curr.right != null || curr.left != null)
				temp.add(curr.data);
			if (curr.right != null) {
				curr = curr.right;
			} else {
				curr = curr.left;
			}
		}
		for (int i = temp.size() - 1; i >= 0; i--) {
			ans.add(temp.get(i));
		}
	}

	public void addLeaf(Node node, ArrayList<Integer> ans) {
		if (node.left == null && node.right == null) {
			ans.add(node.data);
			return;
		}
		if (node.left != null)
			addLeaf(node.left, ans);
		if (node.right != null)
			addLeaf(node.right, ans);

	}

	ArrayList<Integer> boundary(Node node) {
		ArrayList<Integer> ans = new ArrayList<>();
		if (node.left != null || node.right != null) {
			ans.add(node.data);
		}
		addLeftBoundary(node, ans);
		addLeaf(node, ans);
		addRightBoundary(node, ans);
		return ans;
	}
}
