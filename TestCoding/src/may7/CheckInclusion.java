package may7;

import java.util.Arrays;

public class CheckInclusion {

	public static boolean checkinclusionOfString(String s1, String s2) {
		int k = 0, j = 0, count = s1.length();
		int[] freq = new int[26];
		Arrays.fill(freq, 0);
		for (int i = 0; i < s1.length(); i++) {
			freq[s1.charAt(i) - 'a']++;
		}
		boolean res = false;
		while (j < s2.length()) {
			if (freq[s2.charAt(j++) - 'a']-- > 0) {
				count--;
			}
			if (count == 0) {
				res = true;
				break;
			}
			if (j - k == s1.length() && freq[s2.charAt(k++) - 'a']++ >= 0) {
				count++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ab";
		String s2 = "ebcgdhakd";

		boolean res = checkinclusionOfString(s1, s2);
		System.out.println(" The result is : " + res);

	}

}
