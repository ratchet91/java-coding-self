package may8;

import java.util.Arrays;

public class Stock1 {

	public static int getMaxProfit(int[] arr) {
		int maxP = Integer.MIN_VALUE;
		int minPrice = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length - 5; i++) {
			if (arr[i] < minPrice) {
				minPrice = arr[i];
			}
			maxP = Math.max(maxP, arr[i + 5] - minPrice);
		}
		return maxP;
	}

	public static int getMaxProfit2(int[] arr) {
		int[][] dp = new int[arr.length][2];
		for (int[] i : dp) {
			Arrays.fill(i, 0);
		}
		int maxP = helper(dp, arr, 0, 0);
	}

	public int helper(int[][] dp, int[] arr, int start, int buy) {
		if (start >= arr.length) {
			return 0;
		}
		if (dp[start][buy] != -1) {
			return dp[start][buy];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 2, 3, 7, 2, 4, 12, 4 };
		int profit = getMaxProfit(arr);
		System.out.println("Maximum profit is problem 1:" + profit);

		int profit2 = getMaxProfit2(arr);

	}

}
