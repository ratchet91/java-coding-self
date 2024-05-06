package may6;

public class maxAverage {

	public static double getMaxAverage(int[] nums, int n, int k) {
		int res = 0;
		for (int i = 0; i < k; i++) {
			res += nums[i];
		}
		int max = res;
		for (int i = k; i < n; i++) {
			res -= nums[i - k];
			res += nums[i];
			max = Math.max(max, res);
		}
		return (double) max / k;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 5, 4, 8, 2, 1, 98 };
		int n = nums.length;
		int k = 3;

		double res = getMaxAverage(nums, n, k);
		System.out.println(" The req average is : " + res);

	}

}
