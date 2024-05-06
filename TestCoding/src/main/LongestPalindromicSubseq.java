package main;

import java.util.Arrays;

public class LongestPalindromicSubseq {

	public static int checkLengthPalindrome(String s) {
		int n = s.length();

		int[][] dp = new int[n][n];
		for (int[] i : dp) {
			Arrays.fill(i, 0);
		}
		return solve(s, 0, n - 1, dp);
	}

	public static int solve(String s, int i, int j, int[][] dp) {
		if (i > j)
			return 0;
		if (i == j)
			return 1;
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		if (s.charAt(i) == s.charAt(j)) {
			return dp[i][j] = 2 + solve(s, i + 1, j - 1, dp);
		} else {
			return dp[i][j] = Math.max(solve(s, i + 1, j, dp), solve(s, i, j - 1, dp));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bbbabb";
		int n = checkLengthPalindrome("bbbabb");
		System.out.print("The result is : " + n);

	}

}
