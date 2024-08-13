package mainTest123;

import java.util.Arrays;

public class Test_123 {

	public static boolean testForAnagram(String testWord, String finalWord) {
		if (testWord.length() != finalWord.length()) {
			return false;
		}
		int size = testWord.length();
		int[] freq = new int[26];

		Arrays.fill(freq, 0);
		for (int i = 0; i < size; i++) {
			freq[testWord.charAt(i) - 'a']++;
			freq[finalWord.charAt(i) - 'a']--;
		}
		for (int i = 0; i < 26; i++) {
			if (freq[i] != 0) {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {

	}
}