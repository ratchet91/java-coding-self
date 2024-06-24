package main;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 3, 8, 34, 22, 65 };
		int k = 2;

		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return b - a;
			}
		});

		for (int i = 0; i < k; i++) {
			pq.offer(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {
			if (pq.peek() > arr[i]) {
				pq.poll();
				pq.offer(arr[i]);
			}
		}
		System.out.println(" The req elem is : " + pq.peek());

	}

}
