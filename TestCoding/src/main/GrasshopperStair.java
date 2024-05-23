package main;

public class GrasshopperStair {

	public static int getMinmStairs(int[] arr, int n) {
		int prev = arr[0];
		int curr = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 1; i < n; i++) {
			curr = arr[i];
			int diff = (curr + prev);
			prev = diff;
			min = Math.min(min, diff);
		}
		return Math.abs(min) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, -4, -2, 3 };

		int ans = getMinmStairs(arr, arr.length);
		System.out.println(" The required minm stair is : " + ans);

	}

}
