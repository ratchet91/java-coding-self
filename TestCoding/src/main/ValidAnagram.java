package main;

import java.util.Arrays;

public class ValidAnagram {

	public static boolean isValidAnagram(String a, String b) {
		int[] freq = new int[26];
		if (a.length() != b.length()) {
			return false;
		}
		Arrays.fill(freq, 0);
		for (int i = 0; i < a.length(); i++) {
			freq[a.charAt(i) - 'a']++;
			freq[b.charAt(i) - 'a']--;
		}
		for (int i = 0; i < 26; i++) {
			if (freq[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "eat";
		String b = "aee";

		boolean ans = isValidAnagram(a, b);

		System.out.println(a + " & " + b + " are valid anagram : " + ans);

	}

}
