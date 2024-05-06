package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class getAllSubstring {
	public static List<List<Integer>> getAllSubstring(int[] arr) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(arr);
		dfs(res, arr, new ArrayList<Integer>(), 0);
		return res;

	}

	public static void dfs(List<List<Integer>> res, int[] arr, List<Integer> temp, int start) {

		res.add(new ArrayList<Integer>(temp));
		for (int i = start; i < arr.length; i++) {
			temp.add(arr[i]);
			dfs(res, arr, temp, i + 1);
			temp.remove(temp.size() - 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 45, 3, 54 };
		List<List<Integer>> rest = getAllSubstring(arr);
		System.out.println("The list of substrings are : " + rest);
		int f = -1;
		for (List<Integer> i : rest) {
			System.out.println((f++) + "th elements : " + i);
		}

	}

}
