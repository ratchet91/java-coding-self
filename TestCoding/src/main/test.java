package main;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ques = new ArrayList<>();
		ques.add("add");
		ques.add("beeebo");
		ques.add("boookaa");
		ques.add("break");
		// [1,1,2,0]

		List<Integer> al = new ArrayList<>();
		for (String x : ques) {
			int count = 0;
			for (int i = 1; i < x.length(); i++) {
				if (x.charAt(i) == x.charAt(i - 1)) {
					count++;
					i++;
				}
			}
			al.add(count);
		}
		System.out.println(al);
	}

}
