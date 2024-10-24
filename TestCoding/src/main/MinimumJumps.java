package main;

import java.util.Arrays;

public class MinimumJumps {
	public static int helper(int[] arr, int[] dp, int index) {
		if (index == 0) {
			return 0;
		}
		if (dp[index] != -1) {
			return dp[index];
		}
		int right = Integer.MAX_VALUE;
		int left = helper(arr, dp, index - 1) + Math.abs(arr[index] - arr[index - 1]);
		if (index > 1) {
			right = helper(arr, dp, index - 2) + Math.abs(arr[index] - arr[index - 2]);
		}
		return dp[index] = Math.min(right, left);

	}

	public static int getMinimumJumps(int[] arr) {
		int n = arr.length;
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		int ans = helper(arr, dp, 1);

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 4, 3, 1, 0, 0, 2, 6 };
		int ans = getMinimumJumps(arr);
		System.out.println("The req minimum jumps are : " + ans);

	}

}
