package main;

import java.util.Arrays;

public class LongestPalindromicSubs {

	public static int solve(int[][] dp, int start, int end, String inp) {
		if (start > end)
			return 0;
		if (start == end)
			return 1;
		if (dp[start][end] != -1) {
			return dp[start][end];
		}
		if (inp.charAt(end) == inp.charAt(start)) {
			return dp[start][end] = 2 + solve(dp, start + 1, end - 1, inp);
		} else {
			return dp[start][end] = Math.max(solve(dp, start + 1, end, inp), solve(dp, start, end - 1, inp));
		}
	}

	public static int getLongestPalindromeSubs(String inp) {
		int[][] dp = new int[inp.length()][inp.length()];
		for (int[] i : dp) {
			Arrays.fill(i, -1);
		}
		// Arrays.fill(dp, -1);
		return solve(dp, 0, inp.length() - 1, inp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "badsf";

		int ans = getLongestPalindromeSubs(inp);

		System.out.println("The longest Palindormic SUbseq is : " + ans);

	}

}
