package main;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Node {
	int a;
	String name;

	Node(int a, String name) {
		this.a = a;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, name);
	}
}

public class FinallyTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Node> ans = new HashSet<>();
		ans.add(new Node(10, "Boy"));
		ans.add(new Node(10, "Boy"));
		ans.add(new Node(10, "Boy"));
		ans.add(new Node(10, "Boy"));

		System.out.print(ans.size());
	}

}
