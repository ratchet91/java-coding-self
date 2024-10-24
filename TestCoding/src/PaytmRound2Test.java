/*
 * 
1122444424
112224
114

st1 => stoting the elements -> 1,1,3,2,2,2
st2 => storing freq -> 2,1,3,



 * 
 * 
 * 
 */

import java.util.Stack;

public class PaytmRound2Test {

	public static String getFinalAnswer(String str) {
		Stack<Character> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();

		StringBuilder sb = new StringBuilder();
		st1.add(str.charAt(0));
		st2.add(1);

		for (int j = 1; j < str.length(); j++) {
			System.out.println(" st1:" + st1.peek());

			char ch = str.charAt(j);// 1
			if (st1.isEmpty() || st1.peek() != ch) {
				if (!st2.isEmpty() && st2.peek() >= 3) {
					for (int i = 0; i < st2.peek(); i++) {
						System.out.println(" st1 pop:" + st1.peek());
						st1.pop();
					}
					st2.pop();
					j--;
				} else {
					System.out.println(" st1 add:" + ch);
					st1.add(ch);
					st2.add(1);
				}

			} else if (st1.peek() == ch) {
				System.out.println(" the elem st1: " + ch);
				st1.add(ch);
				st2.add(st2.pop() + 1);
			}
		}

		System.out.println(st1.toString());
		while (!st1.isEmpty()) {
			sb.append(st1.pop());
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "44444444";

		String res = getFinalAnswer(str);
		System.out.println("The res is :" + res);

	}

}
