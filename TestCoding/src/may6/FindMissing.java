package may6;

import java.util.ArrayList;
import java.util.List;

public class FindMissing {

	public static List<Integer> findMissing(int[] nums) {
		int n = nums.length;
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int current = nums[i] - 1;

			if (nums[i] != nums[current]) {
				int temp = nums[i];
				nums[i] = nums[current];
				nums[current] = temp;
				i--;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(" : " + nums[i]);

		}
		for (int i = 0; i < n; i++) {
			if (nums[i] != i + 1) {
				ans.add(i + 1);
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] nums = new int[] { 1, 3, 1, 2, 2 };
		List<Integer> res = findMissing(nums);
		System.out.println("the missing one is : " + res);

	}

}
