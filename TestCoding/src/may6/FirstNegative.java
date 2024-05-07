package may6;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegative {

	public static void getFirstNegative(int[] nums, int n, int k) {
		int[] arr = new int[n - k + 1];
		Queue<Integer> neg = new LinkedList<>();
		int right = 0, left = 0, index = 0;
		while (right < n - k + 1) {
			if (nums[right] < 0) {
				neg.add(nums[right]);
			}
			if (right - left + 1 < k) {
				right++;
			} else if (right - left + 1 == k) {
				if (neg.isEmpty()) {
					arr[index++] = 0;
				} else {
					arr[index++] = neg.peek();
					if (arr[left] == neg.peek()) {
						neg.remove();
					}
				}
				left++;
				right++;

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" : " + arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { -1, 2, 3, 4, 5, -5, 67, 54, -34, 6, 7 };
		int k = 3;

		getFirstNegative(nums, nums.length, k);
		// for (int i = 0; i < arr2.length; i++) {
		// System.out.println(" : " + arr2[i]);
		// }

	}

}
