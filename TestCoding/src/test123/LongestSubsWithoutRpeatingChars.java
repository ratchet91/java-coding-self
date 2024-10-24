package test123;

import java.util.HashSet;
import java.util.Set;

public class LongestSubsWithoutRpeatingChars {
	public static int getLongestSubString(String str, int n) {
		Set<Character> set = new HashSet<>();
		int max = 0;
		int i = 0, j = 0;
		while (i < n && j < n) {
			if (!set.contains(str.charAt(j))) {
				set.add(str.charAt(j++));
				max = Math.max(max, j - i);
			} else {
				set.remove(str.charAt(i));
				i++;

			}
		}
		return max;

	}

	public static void main(String[] args) {
		String str = "rarchcahrrita";
		int ans = getLongestSubString(str, str.length());
		System.out.println(" The length is : " + ans);

	}

}
