package main;

import java.util.Stack;

public class ValidParanthesis {
	public final static String open = "({[";
	public final static String close = ")}]";

	public static boolean isOpenBracket(char curr) {
		return open.indexOf(curr) != -1;
	}

	public static boolean isSame(char prev, char curr) {
		return close.indexOf(curr) == open.indexOf(prev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in = "{{}{}{}[][]}({)";
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < in.length(); i++) {
			if (isOpenBracket(in.charAt(i))) {
				st.push(in.charAt(i));
			} else if (!st.isEmpty() && !isSame(st.pop(), in.charAt(i))) {
				System.out.println(" false ");
			}
		}

		System.out.println(" Answer : " + st.isEmpty());
	}

}
