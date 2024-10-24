package main;

import java.util.Arrays;

public class MinimumWindowSubstring {
	public static String getMinmWindow(String s1, String s2) {
		int[] map = new int[128];
		Arrays.fill(map, 0);
		for (char ch : s2.toCharArray()) {
			map[ch]++;
		}
		int i = 0, j = 0, l = Integer.MAX_VALUE;

		int count = s2.length();
		int minStart = 0;
		while (j < s1.length()) {
			char ch = s1.charAt(j);
			if (map[ch] > 0) {

				count--;

			}
			map[ch]--;
			j++;
			while (count == 0) {
				char c = s1.charAt(i);
				if (j - i < l) {
					l = j - i;
					minStart = i;
				}
				map[c]++;
				if (map[c] > 0) {
					count++;
				}
				i++;

			}

		}
		return l == Integer.MAX_VALUE ? "" : s1.substring(minStart, minStart + l);
	}

	public static void main(String[] args) {
		String s1 = "Rasdfergcfdahit";
		String s2 = "ac";
		String len = getMinmWindow(s1, s2);
		System.out.println("Minimum Window is : " + len);

	}

}
