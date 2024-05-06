package main;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubstring {
	public static int solution(String s) {
		int n = s.length();
		if (n == 0) {
			return 0;
		}
		Set<Character> st = new HashSet<>();
		int ans = Integer.MIN_VALUE;
		int i = 0, j = 0;
		char[] ch = s.toCharArray();
		while (i < n && j < n) {
			if (!st.contains(ch[j])) {
				st.add(ch[j++]);
				ans = Math.max(ans, j - i);

			} else {
				st.remove(ch[i++]);
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "rachitzra";
		int res = solution(str);
		System.out.println(" the result is : " + res);

	}

}
