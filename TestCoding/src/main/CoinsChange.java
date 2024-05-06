
package main;

import java.util.Arrays;

public class CoinsChange {

	public static int getChange(int[] change, int amt) {
		int[] dp = new int[amt + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		int ans = minChange(amt, dp, change);
		System.out.println("ans is : " + ans);
		return ans;
	}

	public static int minChange(int amt, int[] dp, int[] change) {
		if (amt == 0) {
			return 0;
		}
		// System.out.println("ans is : ");
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < change.length; i++) {
			if (amt - change[i] >= 0) {
				int subAns = 0;
				if (dp[amt - change[i]] != -1) {
					subAns = dp[amt - change[i]];
				} else {
					subAns = minChange(amt - change[i], dp, change);
				}
				if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
					ans = subAns + 1;
				}
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] change = new int[] { 1, 3, 5 };
		int total = 5;

		int num = getChange(change, total);

		System.out.println(" total coins needed are: " + num);
	}

}
