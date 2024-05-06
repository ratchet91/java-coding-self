package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MeetingRoom {
	public static void main(String[] args) {
		List<Interval> list1 = new ArrayList<>();
		list1.add(new Interval(0, 5));
		list1.add(new Interval(15, 20));
		list1.add(new Interval(5, 10));

		List<Interval> list2 = new ArrayList<>();
		list2.add(new Interval(0, 30));
		list2.add(new Interval(15, 20));
		list2.add(new Interval(5, 10));
		MeetingRoom m = new MeetingRoom();
		System.out.println(" List1 : " + m.canAttendMeetings(list1));
		System.out.println(" List2 : " + m.canAttendMeetings(list2));
	}

	public boolean canAttendMeetings(List<Interval> intervals) {

		Collections.sort(intervals, new Comparator<Interval>() {

			public int compare(Interval start1, Interval start2) {
				// compare two instance of `Score` and return `int` as result.
				return start1.getStart() - start2.getStart();
			}
		});
		for (int i = 0; i < intervals.size() - 1; i++) {
			if (intervals.get(i + 1).getStart() < intervals.get(i).getEnd()) {
				return false;
			}

		}
		// System.out.print(" Sorted List of Interval is : " + intervals);

		return true;
	}
}

class Sortbyname implements Comparator<Interval> {

	// Method
	// Sorting in ascending order of name
	public int compare(Interval a, Interval b) {

		return a.getStart() - b.getStart();
	}
}

class Interval {
	int start, end;

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}
