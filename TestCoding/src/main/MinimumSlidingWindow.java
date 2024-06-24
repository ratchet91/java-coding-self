package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinimumSlidingWindow {

	public static int[] getMinimumSlidingWindow(int[] arr, int k) {
		int n = arr.length;
		int[] res = new int[arr.length - k + 1];
		int ri = 0;
		Deque<Integer> dq = new ArrayDeque<>();
		for (int i = 0; i < arr.length; i++) {
			if (!dq.isEmpty() && dq.peek() == i - k) {
				dq.poll();
			}
			while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
				dq.pollLast();
			}
			dq.offer(i);
			if (i >= k - 1) {
				res[ri++] = arr[dq.peek()];
			}
		}
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int[] ans = getMinimumSlidingWindow(arr, k);
		for (int a : ans) {
			System.out.print(" : " + a);
		}
	}

}
