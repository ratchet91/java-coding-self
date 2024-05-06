package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
	public static List<List<Integer>> res;

	public static void subset(int[] ar) {
		res = new ArrayList<>();
		if (ar.length == 0) {
			return;
		}
		Arrays.sort(ar);
		helper(ar, 0, new ArrayList<Integer>());

		for (int i = 0; i < res.size(); i++) {
			System.out.print(" -> " + res.get(i));
		}
	}

	public static void helper(int[] ar, int start, List<Integer> temp) {
		res.add(new ArrayList<Integer>(temp));
		for (int i = start; i < ar.length; i++) {
			temp.add(ar[i]);
			helper(ar, i + 1, temp);
			temp.remove(temp.size() - 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[] { 1, 3 };
		List<List<Integer>> res = new ArrayList<>();
		subset(ar);

	}

}
