package main;

import java.util.Arrays;

public class StringPermutation {

	public static boolean checkForStringPerm(String s1, String s2) {
		int[] map = new int[26];
		Arrays.fill(map, 0);
		for (int i = 0; i < s2.length(); i++) {
			map[s2.charAt(i) - 'a']++;
		}
		int j = 0, i = 0;
		int count = s2.length();
		while (j < s1.length()) {
			if (map[s1.charAt(j) - 'a'] > 0) {
				count--;

				// j++;
			}
			map[s1.charAt(j++) - 'a']--;
			if (count == 0) {
				return true;
			}
			if (j - i == s2.length() && map[s1.charAt(i++) - 'a']++ >= 0) {
				count++;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "rachit";
		String s2 = "hc";

		boolean ans = checkForStringPerm(s1, s2);
		System.out.println(" The perm exists: " + ans);

	}

}
