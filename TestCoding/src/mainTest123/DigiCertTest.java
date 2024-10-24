package mainTest123;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * You are given an integer array nums and a positive integer k.
Return the number of subarrays where the maximum element of nums appears at least k times in that subarray.
A subarray is a contiguous sequence of elements within an array.

Example 1:

Input: nums = [1,3,2,3,3], k = 2
Output: 6
Explanation: The subarrays that contain the element 3 at least 2 times are: [1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].
Example 2:

Input: nums = [1,4,2,1], k = 3
Output: 0
Explanation: No subarray contains the element 4 at least 3 times.
 * 
 * 
 * 
 */

public class DigiCertTest {
	public static List<List<Integer>> ans = new ArrayList<>();

	public static int getCountSubArrayWithKElement(int[] arr, int k) {
		int max = Integer.MIN_VALUE;
		int count = 1;
		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
				count = 1;
			} else if (max == arr[i]) {
				count++;

			}

		}
		if (count < k) {
			return 0;
		}

		List<Integer> temp = new ArrayList<>();

		helper(arr, k, 0, temp, 0, max);
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(": " + ans.get(i));
		}
		return ans.size();

	}

	public static void helper(int[] arr, int k, int start, List<Integer> temp, int count, int ele) {
		if (count >= k) {
			ans.add(new ArrayList<>(temp));
			count = 0;
		}
		if (temp.size() >= arr.length) {
			return;
		}
		for (int i = start; i < arr.length; i++) {
			temp.add(arr[i]);
			if (arr[i] == ele) {
				count++;
			}
			helper(arr, k, i + 1, temp, count, ele);
			if (temp.get(temp.size() - 1) == ele) {
				count--;
			}
			temp.remove(temp.size() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 3, 2, 3, 3 };
		int k = 2;

		System.out.println(getCountSubArrayWithKElement(arr, k));

	}

}
