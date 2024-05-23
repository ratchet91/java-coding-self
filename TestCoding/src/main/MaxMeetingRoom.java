package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxMeetingRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] meeting = new int[][] { { 2, 3 }, { 3, 5 }, { 2, 6 }, { 1, 15 } };

		Arrays.sort(meeting, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});

		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[1] - b[1];
			}
		});

		pq.add(meeting[0]);

		for (int i = 1; i < meeting.length; i++) {
			int[] curr = meeting[i];
			int[] prev = pq.poll();

			if (curr[0] < prev[1]) {
				pq.add(prev);
				pq.add(curr);
			} else {
				prev[1] = curr[1];
				pq.add(prev);
			}
		}

		System.out.println(" total req meeting room is : " + pq.size());

	}

}
