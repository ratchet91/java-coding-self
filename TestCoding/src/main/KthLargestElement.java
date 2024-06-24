package main;

import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 3, 8, 34, 22, 65 };
		int k = 2;

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < k; i++) {
			pq.offer(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {
			if (pq.peek() < arr[i]) {
				pq.poll();
				pq.offer(arr[i]);
			}
		}
		System.out.println(" The req elem is : " + pq.peek());

	}

}
