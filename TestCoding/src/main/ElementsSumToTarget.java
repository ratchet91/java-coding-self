package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementsSumToTarget {

	public static List<List<Integer>> ans;

	public static void helper(int[] arr, int k, List<Integer> temp, int start) {
		if (k < 0) {
			return;
		}
		if (k == 0) {
			ans.add(new ArrayList<>(temp));
			return;

		}
		for (int i = start; i < arr.length; i++) {

			temp.add(arr[i]);
			helper(arr, k - arr[i], temp, i + 1);
			temp.remove(temp.size() - 1);

		}

	}

	public static List<List<Integer>> getElementsSumToTarget(int[] arr, int k) {
		ans = new ArrayList<>();
		Arrays.sort(arr);
		helper(arr, k, new ArrayList<Integer>(), 0);

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 10;
		int[] arr = new int[] { 1, 1, 2, 3, 4, 5, 6 };
		List<List<Integer>> ans = getElementsSumToTarget(arr, k);
		System.out.println("HI!!!!");
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(" : " + ans.get(i));
		}

	}

}
