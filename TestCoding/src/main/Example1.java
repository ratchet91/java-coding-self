package main;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[] { 1, 2, 3, 7, 2, 1, 4, 3 };
		List<Integer> ans = new ArrayList<>();
		// List<Integer> pair = new ArrayList<>();
		for (int i = 0; i < ar.length - 1; i += 2) {
			List<Integer> pair = new ArrayList<>();
			boolean f = false;
			pair.add(ar[i]);
			pair.add(ar[i + 1]);
			for (int j = 0; j < ar.length - 1; j += 2) {
				List<Integer> revPair = new ArrayList<>();
				revPair.add(ar[j]);
				revPair.add(ar[j + 1]);
				if ((revPair.get(1) == pair.get(0)) && (revPair.get(0) == pair.get(1))) {
					f = true;
					break;
				}
			}
			if (!f) {
				ans.add(pair.get(0));
				ans.add(pair.get(1));
			}

		}
		// List<Integer> revpair = new ArrayList<>();
		System.out.println(ans);
	}

}
