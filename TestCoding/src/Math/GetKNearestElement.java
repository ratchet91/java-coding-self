package Math;

import java.util.ArrayList;
import java.util.List;

public class GetKNearestElement {

	public static void getKNerestElement(int[] arr, int n, int k, int target) {
		int start = 0, end = n - 1;
		int temp = k;
		int mid = (start + end) / 2;
		List<Integer> ans = new ArrayList<>();
		if (k == 0) {
			System.out.println(" : ");
		}
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == target) {
				break;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		int i = mid - 1, j = mid + 1;
		while (k > 0) {
			if (i >= 0 && j < n) {
				if (Math.abs(arr[mid] - arr[i]) < Math.abs(arr[mid] - arr[j])) {
					ans.add(arr[i]);
					i--;
					k--;
				} else {
					ans.add(arr[j]);
					j++;
					k--;
				}
			} else if (i < 0) {
				ans.add(arr[j]);
				j++;
				k--;
			} else if (j == n) {
				ans.add(arr[i]);
				i--;
				k--;
			}

		}
		for (int f = 0; f < temp; f++) {
			System.out.println(" : " + ans.get(f));
		}
		// return ans;
	}

	public static void main(String args[]) {
		int[] arr = new int[] { 1, 12, 15, 17, 19, 24, 28 };
		int n = arr.length;
		int k = 2;
		int num = 19;

		getKNerestElement(arr, n, k, num);

	}
}