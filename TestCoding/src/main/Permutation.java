package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
	public static List<List<Integer>> res;

	public static void subset(int[] ar) {
		res = new ArrayList<>();
		if (ar.length == 0) {
			return;
		}
		Arrays.sort(ar);
		helper(ar, new ArrayList<Integer>());

		for (int i = 0; i < res.size(); i++) {
			System.out.print(" -> " + res.get(i));
		}
	}

	public static void helper(int[] ar, List<Integer> temp) {
		if (temp.size() == ar.length) {
			res.add(new ArrayList<Integer>(temp));
		}

		for (int i = 0; i < ar.length; i++) {
			if (temp.contains(ar[i])) {
				continue;
			}
			temp.add(ar[i]);
			helper(ar, temp);
			temp.remove(temp.size() - 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[] { 1, 3 };
		subset(ar);

	}

}
