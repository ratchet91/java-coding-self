package main;

public class BestDayToBuySellStock1 {

	public static int getMaxProfit(int[] arr, int n) {
		int maxP = 0;
		int min = Integer.MAX_VALUE;
		int prev = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > prev) {
				maxP = maxP + (arr[i] - prev);
				prev = arr[i];
			}

		}
		return maxP;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 2, 4, 6, 2, 11 };

		int maxP = getMaxProfit(arr, arr.length);

		System.out.println("Max profit is : " + maxP);
	}

}
