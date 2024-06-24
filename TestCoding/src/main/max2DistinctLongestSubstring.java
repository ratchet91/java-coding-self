package main;

import java.util.HashMap;
import java.util.Map;

public class max2DistinctLongestSubstring {

	public static int getMaxLength(String s) {
		int i = 0, j = 0, ans = 0, max = 0, dist = 0;
		Map<Character, Integer> map = new HashMap<>();

		while (j < s.length()) {
			int freq = map.getOrDefault(s.charAt(j), 0);
			if (freq == 0)
				dist++;
			map.put(s.charAt(j), freq + 1);

			while (dist > 2) {
				freq = map.get(s.charAt(i));
				map.put(s.charAt(i), freq - 1);
				if (map.get(s.charAt(i)) == 0) {
					dist--;
				}
				i++;

			}
			max = Math.max(max, j - i + 1);
			j++;
		}
		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "raaaarrrhr";
		int x = getMaxLength(str);
		System.out.println("the result is : " + x);

	}

}
