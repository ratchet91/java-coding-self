package main;

import java.util.Arrays;

public class NextGreatestElementThanTarget {

	public static int getNextGreaterEle(int[] arr, int n, int target) {
		int s = 0, l = n - 1, ans = -1;
		Arrays.sort(arr);
		while (s < l) {
			int mid = (s + l) / 2;
			if (target < arr[mid]) {
				l = mid - 1;
			} else {
				s = mid + 1;
			}

		}
		return arr[s % n] == target ? -1 : arr[s % n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 3, 567, 4546, 2, 456, 24 };
		int n = arr.length;

		int target = 4546;
		int ans = getNextGreaterEle(arr, n, target);

		System.out.println(" the required num is : " + ans);

	}

}
