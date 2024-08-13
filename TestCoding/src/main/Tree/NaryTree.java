package main.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode {
	String val;
	List<TreeNode> nodes;

	TreeNode(String val) {
		this.val = val;
		this.nodes = new ArrayList<>();
	}
}

public class NaryTree {
	TreeNode root;

	NaryTree(String rootName) {
		this.root = new TreeNode(rootName);
	}

	public static void addChild(String parent, String child, Map<String, TreeNode> nodes) {
		TreeNode parentNode = nodes.get(parent);
		if (parentNode != null) {
			TreeNode childNode = new TreeNode(child);
			parentNode.nodes.add(childNode);
			nodes.put(child, childNode);
		}

	}

	public static NaryTree buildTree(String[][] relationships) {
		if (relationships.length == 0) {
			return null;
		}

		Map<String, TreeNode> nodes = new HashMap<>();

		NaryTree tree = new NaryTree(relationships[0][0]);
		nodes.put(relationships[0][0], tree.root);

		for (String[] relation : relationships) {
			String parent = relation[0];
			String child = relation[1];
			tree.addChild(parent, child, nodes);

		}

		return tree;

	}

	public static void printTree(TreeNode node, String indent) {
		if (node == null) {
			return;
		} else {
			System.out.println(indent + node.val);
			for (TreeNode child : node.nodes) {
				printTree(child, indent + "  ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] relationships = { { "CEO", "CTO" }, { "CEO", "CFO" }, { "CEO", "COO" }, { "CTO", "DevManager" },
				{ "CTO", "QA Manager" }, { "CFO", "FinanceManager" }, { "COO", "OperationsManager" } };
		NaryTree root = NaryTree.buildTree(relationships);
		root.printTree(root.root, "");

	}

}
