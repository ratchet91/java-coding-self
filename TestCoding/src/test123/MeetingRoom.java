package test123;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoom {

	public static int getNumberOfMeetings(int[][] meetings) {
		Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[1] - b[1];
			}
		});
		// int[] prev = meetings[0];
		pq.add(meetings[0]);
		int count = 1;
		for (int i = 1; i < meetings.length; i++) {
			int[] prev = pq.poll();
			int[] curr = meetings[i];
			if (curr[0] <= prev[1]) {
				pq.add(prev);
				pq.add(curr);

			} else {
				prev[1] = Math.max(curr[1], prev[1]);
				pq.add(prev);
			}
		}
		return pq.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] meetings = new int[][] { { 1, 2 }, { 4, 7 }, { 2, 6 } };
		int numberOfMeetings = getNumberOfMeetings(meetings);
		System.out.println("Can attend: " + numberOfMeetings);

	}

}
