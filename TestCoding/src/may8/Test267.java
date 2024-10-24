package may8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * length of longest substring with distinct chracters
 String s1=abcd
 * 
 * 
 * 
 * 
 * disticn sorted elelemnts check if exist a pair that a[j] - a[i]=k and k>0
  -3,0,1,3,6,8,10,14,18,25 K=5
  
  start = 0
  end = 9
 */

public class Test267 {

	public static int getLongestSub(String str, int l) {
		if (l <= 1) {
			return l;
		}
		Set<Character> set = new HashSet<>();
		int i = 0, j = 0;
		int max = 0;

		while (j < l) {
			if (!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				max = Math.max(max, j - i + 1);
				j++;
			} else {
				set.remove(str.charAt(i));
				i++;
			}
		}
		return max;

	}

	// public static int[] res = new int[2];

	public static void getPairs(int[] arr, int len, int k) {
		int[] res = new int[2];
		Arrays.fill(res, -1);
		int i = 0, j = 1;
		while (i < j && j < len) {
			int actual = arr[j] - arr[i];
			if (actual == k) {
				res[0] = arr[i];
				res[1] = arr[j];
			}
			if (actual > k) {
				i++;
			} else {
				j++;
			}
		}
		for (int x = 0; x < 2; x++) {
			System.out.println(" : " + res[x]);
		}

	}

	public static void main(String[] args) {
		String str = "";
		int longestSubs = getLongestSub(str, str.length());
		// System.out.println("The length of longest subs with distinct char : " +
		// longestSubs);

		int[] arr = new int[] { -3, 0, 1, 2, 6, 8, 10, 14, 18, 25 };
		int k = 5;
		int len = arr.length;
		getPairs(arr, len, k);

	}

}
