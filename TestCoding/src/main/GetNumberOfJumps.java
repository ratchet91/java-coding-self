package main;

public class GetNumberOfJumps {

	public static int getTotalJumps(int[] arr, int n) {
		int farthest = 0;
		int jumps = 0;
		int current = 0;
		for (int i = 0; i < n; i++) {
			farthest = Math.max(current + arr[i], farthest);
			if (i == current) {
				current = farthest;
				jumps++;

				if (current >= n - 1) {
					return jumps;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 3, 6, 7, 3, 2 };
		int jumps = getTotalJumps(arr, arr.length);
		System.out.println("JUMPS: " + jumps);

	}

}
