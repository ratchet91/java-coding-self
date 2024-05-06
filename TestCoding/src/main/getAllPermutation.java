package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class getAllPermutation {
	public static List<List<Integer>> getAllPermutations(int[] arr) {
		List<List<Integer>> r = new ArrayList<>();
		Arrays.sort(arr);
		DFS(r, new ArrayList<Integer>(), arr);
		return r;
	}

	public static void DFS(List<List<Integer>> r, List<Integer> temp, int[] arr) {
		if (temp.size() == arr.length) {
			r.add(new ArrayList<Integer>(temp));
		}
		for (int i = 0; i < arr.length; i++) {
			if (temp.contains(arr[i])) {
				continue;
			}
			temp.add(arr[i]);
			DFS(r, temp, arr);
			temp.remove(temp.size() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4 };
		List<List<Integer>> res = new ArrayList<>();

		res = getAllPermutations(arr);
		System.out.println(res);

	}

}
