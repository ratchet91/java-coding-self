package main;

import java.util.Stack;

public class MinStack {

	static Stack<Integer> st = new Stack<>();
	static int min = Integer.MAX_VALUE;

	public static void push(int val) {
		if (min > val) {
			st.push(val);
			min = val;
		}
		st.push(val);
	}

	public static void pop() {
		int peek = st.pop();
		if (peek == min) {
			st.pop();
		}
	}

	public static int top() {
		if (!st.isEmpty()) {
			return st.pop();
		}
		return -1;
	}

	public static int getMin() {
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(12);
		push(1);
		push(234567);
		int minRes = getMin();
		int topAns = top();

		System.out.println(" min: " + minRes + " top : " + topAns);

	}

}
