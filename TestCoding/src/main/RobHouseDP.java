package main;

import java.util.Arrays;

public class RobHouseDP {

	public static int helper(int[] arr, int[] dp, int start, int n) {
		if (start == n - 1) {
			return dp[start] = arr[n - 1];
		}
		if (start >= n) {
			return 0;
		}
		if (dp[start] != -1) {
			return dp[start];
		}
		int take = arr[start] + helper(arr, dp, start + 2, n);
		int notTake = helper(arr, dp, start + 1, n);
		return dp[start] = Math.max(take, notTake);
	}

	public static int getExactlyTwice(int[] arr) {
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		int ans = helper(arr, dp, 0, arr.length);
		return ans;

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
		int ans = getExactlyTwice(arr);
		System.out.println("Answer is : " + ans);

	}

}
