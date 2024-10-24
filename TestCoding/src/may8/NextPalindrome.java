package may8;

import java.util.Arrays;

public class NextPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ab";
		String s2 = "rachitbtea";
		int minLength = Integer.MAX_VALUE;
		int minStart = 0;

		int[] map = new int[26];
		Arrays.fill(map, 0);
		for (int i = 0; i < s1.length(); i++) {
			map[s1.charAt(i) - 'a']++;
		}

		int i = 0, j = 0, count = s1.length();
		while (j < s2.length()) {
			if (map[s2.charAt(j++) - 'a']-- > 0) {
				count--;
			}
			while (count == 0) {
				char ch = s2.charAt(i);
				if (minLength > j - i) {
					minLength = j - i;
					minStart = i;
				}
				if (map[ch - 'a']++ >= 0) {
					count++;
				}
				i++;
			}

		}
		System.out.println(" The req is :" + s2.substring(minStart, minStart + minLength));
	}

}
